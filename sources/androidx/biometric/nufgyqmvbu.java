package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
abstract class nufgyqmvbu {

    private static class iobyxmoadg {
        static void eablkybsjg(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }

        static KeyGenParameterSpec iobyxmoadg(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        static void ppxfxbqfkf(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        static void wkgbmnqykc(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        static KeyGenParameterSpec.Builder zoijcleaow(String str, int i13) {
            return new KeyGenParameterSpec.Builder(str, i13);
        }
    }

    private static class ppxfxbqfkf {
        static BiometricPrompt.CryptoObject iobyxmoadg(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        static IdentityCredential zoijcleaow(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    private static class zoijcleaow {
        static Mac eablkybsjg(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        static Signature gxszxtbevo(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }

        static BiometricPrompt.CryptoObject iobyxmoadg(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        static BiometricPrompt.CryptoObject ppxfxbqfkf(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        static Cipher wkgbmnqykc(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        static BiometricPrompt.CryptoObject zoijcleaow(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
    }

    static l1.iobyxmoadg.eablkybsjg eablkybsjg(eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar) {
        if (ppxfxbqfkfVar == null) {
            return null;
        }
        Cipher cipherIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
        if (cipherIobyxmoadg != null) {
            return new l1.iobyxmoadg.eablkybsjg(cipherIobyxmoadg);
        }
        Signature signatureWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
        if (signatureWkgbmnqykc != null) {
            return new l1.iobyxmoadg.eablkybsjg(signatureWkgbmnqykc);
        }
        Mac macPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        if (macPpxfxbqfkf != null) {
            return new l1.iobyxmoadg.eablkybsjg(macPpxfxbqfkf);
        }
        if (Build.VERSION.SDK_INT >= 30 && ppxfxbqfkfVar.zoijcleaow() != null) {
            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
        }
        return null;
    }

    static eablkybsjg.ppxfxbqfkf iobyxmoadg() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderZoijcleaow = iobyxmoadg.zoijcleaow("androidxBiometric", 3);
            iobyxmoadg.wkgbmnqykc(builderZoijcleaow);
            iobyxmoadg.eablkybsjg(builderZoijcleaow);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            iobyxmoadg.ppxfxbqfkf(keyGenerator, iobyxmoadg.iobyxmoadg(builderZoijcleaow));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new eablkybsjg.ppxfxbqfkf(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e13) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e13);
            return null;
        }
    }

    static eablkybsjg.ppxfxbqfkf ppxfxbqfkf(l1.iobyxmoadg.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar == null) {
            return null;
        }
        Cipher cipherIobyxmoadg = eablkybsjgVar.iobyxmoadg();
        if (cipherIobyxmoadg != null) {
            return new eablkybsjg.ppxfxbqfkf(cipherIobyxmoadg);
        }
        Signature signaturePpxfxbqfkf = eablkybsjgVar.ppxfxbqfkf();
        if (signaturePpxfxbqfkf != null) {
            return new eablkybsjg.ppxfxbqfkf(signaturePpxfxbqfkf);
        }
        Mac macZoijcleaow = eablkybsjgVar.zoijcleaow();
        if (macZoijcleaow != null) {
            return new eablkybsjg.ppxfxbqfkf(macZoijcleaow);
        }
        return null;
    }

    static BiometricPrompt.CryptoObject wkgbmnqykc(eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar) {
        IdentityCredential identityCredentialZoijcleaow;
        if (ppxfxbqfkfVar == null) {
            return null;
        }
        Cipher cipherIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
        if (cipherIobyxmoadg != null) {
            return zoijcleaow.zoijcleaow(cipherIobyxmoadg);
        }
        Signature signatureWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
        if (signatureWkgbmnqykc != null) {
            return zoijcleaow.iobyxmoadg(signatureWkgbmnqykc);
        }
        Mac macPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        if (macPpxfxbqfkf != null) {
            return zoijcleaow.ppxfxbqfkf(macPpxfxbqfkf);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredentialZoijcleaow = ppxfxbqfkfVar.zoijcleaow()) == null) {
            return null;
        }
        return ppxfxbqfkf.iobyxmoadg(identityCredentialZoijcleaow);
    }

    static eablkybsjg.ppxfxbqfkf zoijcleaow(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential identityCredentialZoijcleaow;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipherWkgbmnqykc = zoijcleaow.wkgbmnqykc(cryptoObject);
        if (cipherWkgbmnqykc != null) {
            return new eablkybsjg.ppxfxbqfkf(cipherWkgbmnqykc);
        }
        Signature signatureGxszxtbevo = zoijcleaow.gxszxtbevo(cryptoObject);
        if (signatureGxszxtbevo != null) {
            return new eablkybsjg.ppxfxbqfkf(signatureGxszxtbevo);
        }
        Mac macEablkybsjg = zoijcleaow.eablkybsjg(cryptoObject);
        if (macEablkybsjg != null) {
            return new eablkybsjg.ppxfxbqfkf(macEablkybsjg);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredentialZoijcleaow = ppxfxbqfkf.zoijcleaow(cryptoObject)) == null) {
            return null;
        }
        return new eablkybsjg.ppxfxbqfkf(identityCredentialZoijcleaow);
    }
}
