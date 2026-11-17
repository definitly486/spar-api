package ib;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import bb.oxmwwwfdhm;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
import ob.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements oxmwwwfdhm {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Object f42316ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f42317wkgbmnqykc = "ppxfxbqfkf";

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f42318iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private KeyStore f42319zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        String f42320iobyxmoadg = null;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        KeyStore f42321zoijcleaow;

        public iobyxmoadg() {
            this.f42321zoijcleaow = null;
            if (!ppxfxbqfkf.lqeggnwhkg()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f42321zoijcleaow = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e13) {
                throw new IllegalStateException(e13);
            }
        }
    }

    public ppxfxbqfkf() {
        this(new iobyxmoadg());
    }

    private static bb.iobyxmoadg dxjokdxxww(bb.iobyxmoadg iobyxmoadgVar) throws KeyStoreException {
        byte[] bArrPpxfxbqfkf = rgvfuqvkyq.ppxfxbqfkf(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrPpxfxbqfkf, iobyxmoadgVar.zoijcleaow(iobyxmoadgVar.iobyxmoadg(bArrPpxfxbqfkf, bArr), bArr))) {
            return iobyxmoadgVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    static void eablkybsjg(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strZoijcleaow = ob.oxmwwwfdhm.zoijcleaow("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strZoijcleaow, 3).setKeySize(UserVerificationMethods.USER_VERIFY_HANDPRINT).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lqeggnwhkg() {
        return true;
    }

    private static void nufgyqmvbu() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    static boolean wkgbmnqykc(String str) {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        synchronized (f42316ppxfxbqfkf) {
            try {
                if (ppxfxbqfkfVar.gxszxtbevo(str)) {
                    return false;
                }
                eablkybsjg(str);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    synchronized boolean gxszxtbevo(String str) {
        String strZoijcleaow;
        strZoijcleaow = ob.oxmwwwfdhm.zoijcleaow("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(f42317wkgbmnqykc, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                nufgyqmvbu();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f42319zoijcleaow = keyStore;
                keyStore.load(null);
                return this.f42319zoijcleaow.containsAlias(strZoijcleaow);
            } catch (IOException e13) {
                throw new GeneralSecurityException(e13);
            }
        }
        return this.f42319zoijcleaow.containsAlias(strZoijcleaow);
    }

    @Override // bb.oxmwwwfdhm
    public synchronized boolean iobyxmoadg(String str) {
        String str2 = this.f42318iobyxmoadg;
        if (str2 == null || !str2.equals(str)) {
            return this.f42318iobyxmoadg == null && str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return true;
    }

    @Override // bb.oxmwwwfdhm
    public synchronized bb.iobyxmoadg zoijcleaow(String str) {
        try {
            String str2 = this.f42318iobyxmoadg;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f42318iobyxmoadg, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return dxjokdxxww(new zoijcleaow(ob.oxmwwwfdhm.zoijcleaow("android-keystore://", str), this.f42319zoijcleaow));
    }

    private ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        this.f42318iobyxmoadg = iobyxmoadgVar.f42320iobyxmoadg;
        this.f42319zoijcleaow = iobyxmoadgVar.f42321zoijcleaow;
    }
}
