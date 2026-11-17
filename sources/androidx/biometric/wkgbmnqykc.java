package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final InterfaceC0072wkgbmnqykc f3613iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final l1.iobyxmoadg f3614ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final BiometricManager f3615zoijcleaow;

    private static class iobyxmoadg {
        static int iobyxmoadg(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static Method ppxfxbqfkf() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }

        static BiometricManager zoijcleaow(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }
    }

    private static class ppxfxbqfkf implements InterfaceC0072wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f3616iobyxmoadg;

        ppxfxbqfkf(Context context) {
            this.f3616iobyxmoadg = context.getApplicationContext();
        }

        @Override // androidx.biometric.wkgbmnqykc.InterfaceC0072wkgbmnqykc
        public BiometricManager eablkybsjg() {
            return iobyxmoadg.zoijcleaow(this.f3616iobyxmoadg);
        }

        @Override // androidx.biometric.wkgbmnqykc.InterfaceC0072wkgbmnqykc
        public boolean gxszxtbevo() {
            return draadjrbmk.iobyxmoadg(this.f3616iobyxmoadg);
        }

        @Override // androidx.biometric.wkgbmnqykc.InterfaceC0072wkgbmnqykc
        public boolean iobyxmoadg() {
            return gtknphoqwx.iobyxmoadg(this.f3616iobyxmoadg) != null;
        }

        @Override // androidx.biometric.wkgbmnqykc.InterfaceC0072wkgbmnqykc
        public boolean ppxfxbqfkf() {
            return dxjokdxxww.iobyxmoadg(this.f3616iobyxmoadg, Build.MODEL);
        }

        @Override // androidx.biometric.wkgbmnqykc.InterfaceC0072wkgbmnqykc
        public l1.iobyxmoadg wkgbmnqykc() {
            return l1.iobyxmoadg.ppxfxbqfkf(this.f3616iobyxmoadg);
        }

        @Override // androidx.biometric.wkgbmnqykc.InterfaceC0072wkgbmnqykc
        public boolean zoijcleaow() {
            return gtknphoqwx.zoijcleaow(this.f3616iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    interface InterfaceC0072wkgbmnqykc {
        BiometricManager eablkybsjg();

        boolean gxszxtbevo();

        boolean iobyxmoadg();

        boolean ppxfxbqfkf();

        l1.iobyxmoadg wkgbmnqykc();

        boolean zoijcleaow();
    }

    private static class zoijcleaow {
        static int iobyxmoadg(BiometricManager biometricManager, int i13) {
            return biometricManager.canAuthenticate(i13);
        }
    }

    wkgbmnqykc(InterfaceC0072wkgbmnqykc interfaceC0072wkgbmnqykc) {
        this.f3613iobyxmoadg = interfaceC0072wkgbmnqykc;
        int i13 = Build.VERSION.SDK_INT;
        this.f3615zoijcleaow = i13 >= 29 ? interfaceC0072wkgbmnqykc.eablkybsjg() : null;
        this.f3614ppxfxbqfkf = i13 <= 29 ? interfaceC0072wkgbmnqykc.wkgbmnqykc() : null;
    }

    private int eablkybsjg() {
        BiometricPrompt.CryptoObject cryptoObjectWkgbmnqykc;
        Method methodPpxfxbqfkf = iobyxmoadg.ppxfxbqfkf();
        if (methodPpxfxbqfkf != null && (cryptoObjectWkgbmnqykc = nufgyqmvbu.wkgbmnqykc(nufgyqmvbu.iobyxmoadg())) != null) {
            try {
                Object objInvoke = methodPpxfxbqfkf.invoke(this.f3615zoijcleaow, cryptoObjectWkgbmnqykc);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException e13) {
                e = e13;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (IllegalArgumentException e14) {
                e = e14;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (InvocationTargetException e15) {
                e = e15;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int iGxszxtbevo = gxszxtbevo();
        return (this.f3613iobyxmoadg.ppxfxbqfkf() || iGxszxtbevo != 0) ? iGxszxtbevo : wkgbmnqykc();
    }

    private int gxszxtbevo() {
        BiometricManager biometricManager = this.f3615zoijcleaow;
        if (biometricManager != null) {
            return iobyxmoadg.iobyxmoadg(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public static wkgbmnqykc lqeggnwhkg(Context context) {
        return new wkgbmnqykc(new ppxfxbqfkf(context));
    }

    private int ppxfxbqfkf() {
        l1.iobyxmoadg iobyxmoadgVar = this.f3614ppxfxbqfkf;
        if (iobyxmoadgVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (iobyxmoadgVar.gxszxtbevo()) {
            return !this.f3614ppxfxbqfkf.eablkybsjg() ? 11 : 0;
        }
        return 12;
    }

    private int wkgbmnqykc() {
        if (this.f3613iobyxmoadg.zoijcleaow()) {
            return ppxfxbqfkf() == 0 ? 0 : -1;
        }
        return ppxfxbqfkf();
    }

    private int zoijcleaow(int i13) {
        if (!androidx.biometric.zoijcleaow.eablkybsjg(i13)) {
            return -2;
        }
        if (i13 == 0 || !this.f3613iobyxmoadg.iobyxmoadg()) {
            return 12;
        }
        if (androidx.biometric.zoijcleaow.ppxfxbqfkf(i13)) {
            return this.f3613iobyxmoadg.zoijcleaow() ? 0 : 11;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 == 29) {
            return androidx.biometric.zoijcleaow.gxszxtbevo(i13) ? gxszxtbevo() : eablkybsjg();
        }
        if (i14 != 28) {
            return ppxfxbqfkf();
        }
        if (this.f3613iobyxmoadg.gxszxtbevo()) {
            return wkgbmnqykc();
        }
        return 12;
    }

    public int iobyxmoadg(int i13) {
        if (Build.VERSION.SDK_INT < 30) {
            return zoijcleaow(i13);
        }
        BiometricManager biometricManager = this.f3615zoijcleaow;
        if (biometricManager != null) {
            return zoijcleaow.iobyxmoadg(biometricManager, i13);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
