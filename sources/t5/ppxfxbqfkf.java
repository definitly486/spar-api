package t5;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f109730iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final KeyGenParameterSpec f109731zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f109732eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        boolean f109733gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final String f109734iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        final Context f109735lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        zoijcleaow f109736ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        boolean f109737wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        KeyGenParameterSpec f109738zoijcleaow;

        /* JADX INFO: renamed from: t5.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static class C2695iobyxmoadg {

            /* JADX INFO: renamed from: t5.ppxfxbqfkf$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static class C2696iobyxmoadg {
                static void iobyxmoadg(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* JADX INFO: renamed from: t5.ppxfxbqfkf$iobyxmoadg$iobyxmoadg$zoijcleaow */
            static class zoijcleaow {
                static void iobyxmoadg(KeyGenParameterSpec.Builder builder, int i13, int i14) {
                    builder.setUserAuthenticationParameters(i13, i14);
                }
            }

            static ppxfxbqfkf iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
                zoijcleaow zoijcleaowVar = iobyxmoadgVar.f109736ppxfxbqfkf;
                if (zoijcleaowVar == null && iobyxmoadgVar.f109738zoijcleaow == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (zoijcleaowVar == zoijcleaow.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(iobyxmoadgVar.f109734iobyxmoadg, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(UserVerificationMethods.USER_VERIFY_HANDPRINT);
                    if (iobyxmoadgVar.f109737wkgbmnqykc) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            zoijcleaow.iobyxmoadg(keySize, iobyxmoadgVar.f109732eablkybsjg, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(iobyxmoadgVar.f109732eablkybsjg);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && iobyxmoadgVar.f109733gxszxtbevo && iobyxmoadgVar.f109735lqeggnwhkg.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C2696iobyxmoadg.iobyxmoadg(keySize);
                    }
                    iobyxmoadgVar.f109738zoijcleaow = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = iobyxmoadgVar.f109738zoijcleaow;
                if (keyGenParameterSpec != null) {
                    return new ppxfxbqfkf(eablkybsjg.ppxfxbqfkf(keyGenParameterSpec), iobyxmoadgVar.f109738zoijcleaow);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            static String zoijcleaow(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public iobyxmoadg(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public ppxfxbqfkf iobyxmoadg() {
            return C2695iobyxmoadg.iobyxmoadg(this);
        }

        public iobyxmoadg ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar.ordinal() == 0) {
                if (this.f109738zoijcleaow != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.f109736ppxfxbqfkf = zoijcleaowVar;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: " + zoijcleaowVar);
        }

        public iobyxmoadg zoijcleaow(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f109736ppxfxbqfkf != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (this.f109734iobyxmoadg.equals(C2695iobyxmoadg.zoijcleaow(keyGenParameterSpec))) {
                this.f109738zoijcleaow = keyGenParameterSpec;
                return this;
            }
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.f109734iobyxmoadg + " vs " + C2695iobyxmoadg.zoijcleaow(keyGenParameterSpec));
        }

        public iobyxmoadg(Context context, String str) {
            this.f109735lqeggnwhkg = context.getApplicationContext();
            this.f109734iobyxmoadg = str;
        }
    }

    public enum zoijcleaow {
        AES256_GCM
    }

    ppxfxbqfkf(String str, Object obj) {
        this.f109730iobyxmoadg = str;
        this.f109731zoijcleaow = (KeyGenParameterSpec) obj;
    }

    String iobyxmoadg() {
        return this.f109730iobyxmoadg;
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f109730iobyxmoadg + ", isKeyStoreBacked=" + zoijcleaow() + "}";
    }

    public boolean zoijcleaow() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f109730iobyxmoadg);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }
}
