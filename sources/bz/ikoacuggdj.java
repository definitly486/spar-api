package bz;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
class ikoacuggdj extends metgxyhuhe {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f17460dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17461eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private FingerprintManager f17462gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private BiometricManager f17463lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private KeyguardManager f17464nufgyqmvbu;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    static final String f17457btonecajqb = t6.iwizpuwonk.iobyxmoadg(new byte[]{109, -24, 64, 123, 117, -39, 62, -107, 91, -79, 72, -42, 72, 120, 9, 33, 24, 43, 42, 44, -93, 80, -128, -108, 90, -58, -97, -27, -77, 88, -41, -55});

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    static final String f17459gtknphoqwx = t6.iwizpuwonk.iobyxmoadg(new byte[]{-73, -64, -79, 26, -119, -122, 111, 123, 39, -100, 3, 25, -60, -90, 84, -5, 57, 82, -77, -5, 93, -86, -41, -52, -99, 71, -10, 102, -85, -99, -86, 100});

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    static final String f17458draadjrbmk = t6.iwizpuwonk.iobyxmoadg(new byte[]{-127, 114, -91, 0, -80, -68, -9, 50, -102, -50, -73, 32, -36, -116, -79, 13});

    ikoacuggdj(Context context) {
        super(kc2.lqeggnwhkg.AuthenticationInfo);
        this.f17461eablkybsjg = context;
        int i13 = Build.VERSION.SDK_INT;
        this.f17464nufgyqmvbu = (KeyguardManager) context.getSystemService("keyguard");
        this.f17462gxszxtbevo = (FingerprintManager) context.getSystemService("fingerprint");
        if (i13 >= 29) {
            this.f17463lqeggnwhkg = t6.zynmafqrjb.iobyxmoadg(context.getSystemService("biometric"));
        }
    }

    static boolean iozdgvuglv() {
        try {
            KeyStore keyStore = KeyStore.getInstance(t6.iwizpuwonk.iobyxmoadg(new byte[]{45, 39, 123, -1, -78, 28, 117, 36, -95, 126, 124, -90, -111, -112, 22, 91}));
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", t6.iwizpuwonk.iobyxmoadg(new byte[]{45, 39, 123, -1, -78, 28, 117, 36, -95, 126, 124, -90, -111, -112, 22, 91}));
            if (keyGenerator != null && keyStore != null) {
                keyStore.load(null);
                keyGenerator.init(new KeyGenParameterSpec.Builder(t6.iwizpuwonk.iobyxmoadg(new byte[]{-40, -10, -60, 77, -89, -81, 108, 96, 52, 69, -4, -110, -79, 34, 32, -50}), 3).setBlockModes("CBC").setUserAuthenticationRequired(true).setEncryptionPaddings("PKCS7Padding").build());
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private boolean yadqdtsiqt() {
        int i13;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 > 28) {
            return (i14 < 29 || this.f17463lqeggnwhkg == null || !t6.skhdrjzrfn.iobyxmoadg(this.f17461eablkybsjg, "android.permission.USE_BIOMETRIC") || (i13 = this.f17460dxjokdxxww) == 12 || i13 == 1) ? false : true;
        }
        if (this.f17462gxszxtbevo == null || !t6.skhdrjzrfn.iobyxmoadg(this.f17461eablkybsjg, "android.permission.USE_FINGERPRINT")) {
            return false;
        }
        return this.f17462gxszxtbevo.isHardwareDetected();
    }

    private boolean ylkuphrtab() {
        KeyguardManager keyguardManager = this.f17464nufgyqmvbu;
        if (keyguardManager != null) {
            return !keyguardManager.isDeviceLocked();
        }
        return false;
    }

    boolean cdpycssgdh() {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 <= 28) {
            return iozdgvuglv();
        }
        return i13 >= 29 && t6.skhdrjzrfn.iobyxmoadg(this.f17461eablkybsjg, "android.permission.USE_BIOMETRIC") && this.f17460dxjokdxxww == 0;
    }

    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: lmojexxdyd, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg zynmafqrjb() {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29 && this.f17463lqeggnwhkg != null && t6.skhdrjzrfn.iobyxmoadg(this.f17461eablkybsjg, "android.permission.USE_BIOMETRIC")) {
            if (i13 >= 30) {
                this.f17460dxjokdxxww = this.f17463lqeggnwhkg.canAuthenticate(KotlinVersion.MAX_COMPONENT_VALUE);
            } else {
                this.f17460dxjokdxxww = this.f17463lqeggnwhkg.canAuthenticate();
            }
        }
        oc2.iobyxmoadg iobyxmoadgVar = (oc2.iobyxmoadg) super.zynmafqrjb();
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.put(f17457btonecajqb, Boolean.valueOf(ylkuphrtab()));
            iobyxmoadgVar.put(f17459gtknphoqwx, Boolean.valueOf(yadqdtsiqt()));
            iobyxmoadgVar.put(f17458draadjrbmk, Boolean.valueOf(cdpycssgdh()));
        }
        return iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: wwaezpbzkn, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg lereixgezr() {
        return new oc2.iobyxmoadg();
    }
}
