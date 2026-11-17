package ib;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements bb.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String f42324zoijcleaow = "zoijcleaow";

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SecretKey f42325iobyxmoadg;

    zoijcleaow(String str, KeyStore keyStore) throws InvalidKeyException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f42325iobyxmoadg = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
    }

    private static void eablkybsjg() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    private byte[] ppxfxbqfkf(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f42325iobyxmoadg, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    private byte[] wkgbmnqykc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f42325iobyxmoadg);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    @Override // bb.iobyxmoadg
    public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2) {
        try {
            return wkgbmnqykc(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e13) {
            Log.w(f42324zoijcleaow, "encountered a potentially transient KeyStore error, will wait and retry", e13);
            eablkybsjg();
            return wkgbmnqykc(bArr, bArr2);
        }
    }

    @Override // bb.iobyxmoadg
    public byte[] zoijcleaow(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        try {
            return ppxfxbqfkf(bArr, bArr2);
        } catch (ProviderException e13) {
            e = e13;
            Log.w(f42324zoijcleaow, "encountered a potentially transient KeyStore error, will wait and retry", e);
            eablkybsjg();
            return ppxfxbqfkf(bArr, bArr2);
        } catch (AEADBadTagException e14) {
            throw e14;
        } catch (GeneralSecurityException e15) {
            e = e15;
            Log.w(f42324zoijcleaow, "encountered a potentially transient KeyStore error, will wait and retry", e);
            eablkybsjg();
            return ppxfxbqfkf(bArr, bArr2);
        }
    }
}
