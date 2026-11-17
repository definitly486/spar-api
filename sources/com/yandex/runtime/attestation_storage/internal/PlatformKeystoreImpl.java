package com.yandex.runtime.attestation_storage.internal;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.yandex.runtime.Runtime;
import com.yandex.runtime.attestation.EcPublicKey;
import com.yandex.runtime.logging.Logger;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import ua.ppxfxbqfkf;
import ua.wkgbmnqykc;
import ua.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
public class PlatformKeystoreImpl implements PlatformKeystore {
    private static final int CERTIFICATE_VALID_YEARS = 10;
    private String alias;
    private KeyStore keyStore;
    private KeyStore.PrivateKeyEntry privateKeyEntry;

    private PlatformKeystoreImpl(String str) throws IOException, CertificateException {
        this.alias = str;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.keyStore = keyStore;
            try {
                keyStore.load(null);
                if (hasEntry()) {
                    tryLoadEntry();
                }
            } catch (NoSuchAlgorithmException e13) {
                throw new IllegalStateException("Can't check the integrity of keystore: " + e13.getMessage());
            }
        } catch (KeyStoreException e14) {
            throw new IllegalStateException("No Android Key Store in the system: " + e14.getMessage());
        }
    }

    public static boolean attestationAvailable() {
        Provider provider = Security.getProvider("AndroidKeyStore");
        if (provider == null || provider.getService("KeyPairGenerator", "EC") == null || provider.getService("KeyFactory", "EC") == null || Security.getProviders("Signature.NONEwithECDSA").length == 0) {
            return false;
        }
        try {
            CertificateFactory.getInstance("X.509");
            return Security.getProviders("MessageDigest.SHA-256").length != 0;
        } catch (CertificateException unused) {
            return false;
        }
    }

    public static void cleanupUnusedKeys(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            try {
                keyStore.load(null);
                try {
                    for (String str2 : Collections.list(keyStore.aliases())) {
                        if (str2.startsWith(getKeyAliasBase())) {
                            if (str != null) {
                                if (str2.equals(getKeyAliasBase() + str)) {
                                }
                            }
                            keyStore.deleteEntry(str2);
                        }
                    }
                } catch (KeyStoreException e13) {
                    Logger.error("Could not delete entry: " + e13.getMessage());
                }
            } catch (IOException e14) {
                Logger.error("Could not load keystore for key cleanup. I/O error: " + e14.getMessage());
            } catch (NoSuchAlgorithmException e15) {
                Logger.error("Could not load keystore for key cleanup. No such algorithm for checking keystore integrity: " + e15.getMessage());
            } catch (CertificateException e16) {
                Logger.error("Could not load keystore for key cleanup. Could not load certificate: " + e16.getMessage());
            }
        } catch (KeyStoreException e17) {
            Logger.error("Could not get keystore implementation for key cleanup: " + e17.getMessage());
        }
    }

    public static PlatformKeystore createKeystore(String str) {
        try {
            return new PlatformKeystoreImpl(getKeyAliasBase() + str);
        } catch (IOException | CertificateException unused) {
            return null;
        }
    }

    private String createNonce(byte[] bArr) {
        try {
            byte[] certificateChain = getCertificateChain();
            if (certificateChain == null) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(certificateChain);
            return Base64.encodeToString(messageDigest.digest(), 10);
        } catch (NoSuchAlgorithmException e13) {
            throw new IllegalStateException("No SHA-256 algorithm in the environment: " + e13.getMessage());
        }
    }

    private byte[] getCertificateChain() {
        if (this.privateKeyEntry == null) {
            throw new IllegalStateException("Key entry is null. Generate key first.");
        }
        try {
            try {
                return CertificateFactory.getInstance("X.509").generateCertPath(Arrays.asList(this.privateKeyEntry.getCertificateChain())).getEncoded();
            } catch (CertificateEncodingException | CertificateException unused) {
                return null;
            }
        } catch (CertificateException e13) {
            throw new IllegalStateException("X.509 is unsupported in the system: " + e13.getMessage());
        }
    }

    private static native String getKeyAliasBase();

    private boolean hasEntry() {
        try {
            return this.keyStore.containsAlias(this.alias);
        } catch (KeyStoreException e13) {
            throw new IllegalStateException("Keystore is not initialized: " + e13.getMessage());
        }
    }

    private void tryLoadEntry() {
        try {
            KeyStore.Entry entry = this.keyStore.getEntry(this.alias, null);
            if (entry == null) {
                return;
            }
            if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                throw new IllegalStateException("Key entry is not an instance of a KeyStore.PrivateKeyEntry");
            }
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
            this.privateKeyEntry = privateKeyEntry;
            if (privateKeyEntry.getPrivateKey().getAlgorithm() != "EC") {
                removeKey();
            }
        } catch (KeyStoreException e13) {
            throw new IllegalStateException("Keystore has not been loaded: " + e13.getMessage());
        } catch (NoSuchAlgorithmException e14) {
            throw new IllegalStateException("No such algorithm in the environment: " + e14.getMessage());
        } catch (UnrecoverableEntryException e15) {
            throw new IllegalStateException("Entry is protected: " + e15.getMessage());
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public byte[] ecSign(byte[] bArr) {
        if (this.privateKeyEntry == null) {
            throw new IllegalStateException("Key entry is null. Generate key first.");
        }
        try {
            Signature signature = Signature.getInstance("NONEwithECDSA");
            try {
                signature.initSign(this.privateKeyEntry.getPrivateKey());
                try {
                    signature.update(bArr);
                    return signature.sign();
                } catch (SignatureException e13) {
                    throw new IllegalStateException("Could not sign provided data: " + e13.getMessage());
                }
            } catch (InvalidKeyException e14) {
                throw new IllegalStateException("Key provided for signing is invalid: " + e14.getMessage());
            }
        } catch (NoSuchAlgorithmException e15) {
            throw new IllegalStateException("No NONEwithECDSA support: " + e15.getMessage());
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public void generateKey(byte[] bArr) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            try {
                Calendar calendar = Calendar.getInstance();
                Date time = calendar.getTime();
                calendar.add(1, 10);
                keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(this.alias, 4).setDigests("NONE").setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setAttestationChallenge(bArr).setKeySize(UserVerificationMethods.USER_VERIFY_HANDPRINT).setCertificateNotBefore(time).setCertificateNotAfter(calendar.getTime()).build());
                keyPairGenerator.generateKeyPair();
                tryLoadEntry();
            } catch (InvalidAlgorithmParameterException e13) {
                throw new IllegalStateException("Arguments for initialization of EC algorithm are invalid: " + e13.getMessage());
            }
        } catch (NoSuchAlgorithmException e14) {
            throw new IllegalStateException("EC algorithm is unsupported in AndroidKeyStore: " + e14.getMessage());
        } catch (NoSuchProviderException e15) {
            throw new IllegalStateException("No Android Key Store in the system: " + e15.getMessage());
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public byte[] getAppAttestKeyAssertion() {
        throw new UnsupportedOperationException("No AppAttest for Android");
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public String getAppAttestKeyId() {
        throw new UnsupportedOperationException("No AppAttest for Android");
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public String getApplicationId() {
        throw new UnsupportedOperationException("Should not be used for Android");
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public EcPublicKey getEcPublicKey() {
        try {
            ECPoint w13 = ((ECPublicKeySpec) KeyFactory.getInstance("EC").getKeySpec(this.privateKeyEntry.getCertificate().getPublicKey(), ECPublicKeySpec.class)).getW();
            return new EcPublicKey(w13.getAffineX().toByteArray(), w13.getAffineY().toByteArray());
        } catch (NoSuchAlgorithmException e13) {
            throw new IllegalStateException("EC algorithm is unsupported in AndroidKeyStore: " + e13.getMessage());
        } catch (InvalidKeySpecException e14) {
            throw new IllegalStateException("Invalid KeySpec or key could not be processed: " + e14.getMessage());
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public byte[] getKeystoreProof() {
        return getCertificateChain();
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public boolean hasKey() {
        return this.privateKeyEntry != null;
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public void removeKey() {
        this.privateKeyEntry = null;
        if (hasEntry()) {
            try {
                this.keyStore.deleteEntry(this.alias);
            } catch (KeyStoreException e13) {
                throw new IllegalStateException("Keystore is not initialized: " + e13.getMessage());
            }
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public void requestAttestKey(byte[] bArr, long j13, final AttestationListener attestationListener) {
        String strCreateNonce = createNonce(bArr);
        if (strCreateNonce == null) {
            attestationListener.onAttestationFailed("Could not create nonce");
        }
        Task taskIobyxmoadg = zoijcleaow.iobyxmoadg(Runtime.getApplicationContext()).iobyxmoadg(ppxfxbqfkf.iobyxmoadg().ppxfxbqfkf(strCreateNonce).zoijcleaow(j13).iobyxmoadg());
        taskIobyxmoadg.addOnSuccessListener(new OnSuccessListener<wkgbmnqykc>(this) { // from class: com.yandex.runtime.attestation_storage.internal.PlatformKeystoreImpl.1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(wkgbmnqykc wkgbmnqykcVar) {
                attestationListener.onAttestationReceived(wkgbmnqykcVar.iobyxmoadg().getBytes());
            }
        });
        taskIobyxmoadg.addOnFailureListener(new OnFailureListener(this) { // from class: com.yandex.runtime.attestation_storage.internal.PlatformKeystoreImpl.2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                attestationListener.onAttestationFailed(exc.getMessage());
            }
        });
    }
}
