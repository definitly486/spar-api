package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private BiometricPrompt$AuthenticationCallback f3602iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final wkgbmnqykc f3603ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private l1.iobyxmoadg.ppxfxbqfkf f3604zoijcleaow;

    /* JADX INFO: renamed from: androidx.biometric.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0070iobyxmoadg extends l1.iobyxmoadg.ppxfxbqfkf {
        C0070iobyxmoadg() {
        }

        @Override // l1.iobyxmoadg.ppxfxbqfkf
        public void iobyxmoadg(int i13, CharSequence charSequence) {
            iobyxmoadg.this.f3603ppxfxbqfkf.iobyxmoadg(i13, charSequence);
        }

        @Override // l1.iobyxmoadg.ppxfxbqfkf
        public void ppxfxbqfkf(int i13, CharSequence charSequence) {
            iobyxmoadg.this.f3603ppxfxbqfkf.ppxfxbqfkf(charSequence);
        }

        @Override // l1.iobyxmoadg.ppxfxbqfkf
        public void wkgbmnqykc(l1.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar) {
            iobyxmoadg.this.f3603ppxfxbqfkf.wkgbmnqykc(new eablkybsjg.zoijcleaow(wkgbmnqykcVar != null ? nufgyqmvbu.ppxfxbqfkf(wkgbmnqykcVar.iobyxmoadg()) : null, 2));
        }

        @Override // l1.iobyxmoadg.ppxfxbqfkf
        public void zoijcleaow() {
            iobyxmoadg.this.f3603ppxfxbqfkf.zoijcleaow();
        }
    }

    private static class ppxfxbqfkf {
        static int iobyxmoadg(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    static class wkgbmnqykc {
        wkgbmnqykc() {
        }

        abstract void iobyxmoadg(int i13, CharSequence charSequence);

        abstract void ppxfxbqfkf(CharSequence charSequence);

        abstract void wkgbmnqykc(eablkybsjg.zoijcleaow zoijcleaowVar);

        abstract void zoijcleaow();
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: androidx.biometric.iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
        class C0071iobyxmoadg extends BiometricPrompt$AuthenticationCallback {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f3606iobyxmoadg;

            C0071iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
                this.f3606iobyxmoadg = wkgbmnqykcVar;
            }

            public void onAuthenticationError(int i13, CharSequence charSequence) {
                this.f3606iobyxmoadg.iobyxmoadg(i13, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f3606iobyxmoadg.zoijcleaow();
            }

            public void onAuthenticationHelp(int i13, CharSequence charSequence) {
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = authenticationResult != null ? nufgyqmvbu.zoijcleaow(authenticationResult.getCryptoObject()) : null;
                int i13 = Build.VERSION.SDK_INT;
                int iIobyxmoadg = -1;
                if (i13 >= 30) {
                    if (authenticationResult != null) {
                        iIobyxmoadg = ppxfxbqfkf.iobyxmoadg(authenticationResult);
                    }
                } else if (i13 != 29) {
                    iIobyxmoadg = 2;
                }
                this.f3606iobyxmoadg.wkgbmnqykc(new eablkybsjg.zoijcleaow(ppxfxbqfkfVarZoijcleaow, iIobyxmoadg));
            }
        }

        static BiometricPrompt$AuthenticationCallback iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
            return new C0071iobyxmoadg(wkgbmnqykcVar);
        }
    }

    iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
        this.f3603ppxfxbqfkf = wkgbmnqykcVar;
    }

    BiometricPrompt$AuthenticationCallback iobyxmoadg() {
        if (this.f3602iobyxmoadg == null) {
            this.f3602iobyxmoadg = zoijcleaow.iobyxmoadg(this.f3603ppxfxbqfkf);
        }
        return this.f3602iobyxmoadg;
    }

    l1.iobyxmoadg.ppxfxbqfkf zoijcleaow() {
        if (this.f3604zoijcleaow == null) {
            this.f3604zoijcleaow = new C0070iobyxmoadg();
        }
        return this.f3604zoijcleaow;
    }
}
