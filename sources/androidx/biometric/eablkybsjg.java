package androidx.biometric;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.lifecycle.crxdokpmqz;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private FragmentManager f3553iobyxmoadg;

    public static abstract class iobyxmoadg {
        public void iobyxmoadg(int i13, CharSequence charSequence) {
        }

        public void ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
        }

        public void zoijcleaow() {
        }
    }

    public static class wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f3558eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f3559gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f3560iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final int f3561lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final CharSequence f3562ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final CharSequence f3563wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final CharSequence f3564zoijcleaow;

        public static class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private CharSequence f3567iobyxmoadg = null;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private CharSequence f3571zoijcleaow = null;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private CharSequence f3569ppxfxbqfkf = null;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private CharSequence f3570wkgbmnqykc = null;

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private boolean f3565eablkybsjg = true;

            /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
            private boolean f3566gxszxtbevo = false;

            /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
            private int f3568lqeggnwhkg = 0;

            public iobyxmoadg eablkybsjg(CharSequence charSequence) {
                this.f3567iobyxmoadg = charSequence;
                return this;
            }

            public wkgbmnqykc iobyxmoadg() {
                if (TextUtils.isEmpty(this.f3567iobyxmoadg)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!androidx.biometric.zoijcleaow.eablkybsjg(this.f3568lqeggnwhkg)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + androidx.biometric.zoijcleaow.iobyxmoadg(this.f3568lqeggnwhkg));
                }
                int i13 = this.f3568lqeggnwhkg;
                boolean zPpxfxbqfkf = i13 != 0 ? androidx.biometric.zoijcleaow.ppxfxbqfkf(i13) : this.f3566gxszxtbevo;
                if (TextUtils.isEmpty(this.f3570wkgbmnqykc) && !zPpxfxbqfkf) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.f3570wkgbmnqykc) || !zPpxfxbqfkf) {
                    return new wkgbmnqykc(this.f3567iobyxmoadg, this.f3571zoijcleaow, this.f3569ppxfxbqfkf, this.f3570wkgbmnqykc, this.f3565eablkybsjg, this.f3566gxszxtbevo, this.f3568lqeggnwhkg);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }

            public iobyxmoadg ppxfxbqfkf(CharSequence charSequence) {
                this.f3570wkgbmnqykc = charSequence;
                return this;
            }

            public iobyxmoadg wkgbmnqykc(CharSequence charSequence) {
                this.f3571zoijcleaow = charSequence;
                return this;
            }

            public iobyxmoadg zoijcleaow(int i13) {
                this.f3568lqeggnwhkg = i13;
                return this;
            }
        }

        wkgbmnqykc(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z13, boolean z14, int i13) {
            this.f3560iobyxmoadg = charSequence;
            this.f3564zoijcleaow = charSequence2;
            this.f3562ppxfxbqfkf = charSequence3;
            this.f3563wkgbmnqykc = charSequence4;
            this.f3558eablkybsjg = z13;
            this.f3559gxszxtbevo = z14;
            this.f3561lqeggnwhkg = i13;
        }

        public CharSequence eablkybsjg() {
            return this.f3560iobyxmoadg;
        }

        public boolean gxszxtbevo() {
            return this.f3558eablkybsjg;
        }

        public int iobyxmoadg() {
            return this.f3561lqeggnwhkg;
        }

        public boolean lqeggnwhkg() {
            return this.f3559gxszxtbevo;
        }

        public CharSequence ppxfxbqfkf() {
            CharSequence charSequence = this.f3563wkgbmnqykc;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence wkgbmnqykc() {
            return this.f3564zoijcleaow;
        }

        public CharSequence zoijcleaow() {
            return this.f3562ppxfxbqfkf;
        }
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ppxfxbqfkf f3572iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f3573zoijcleaow;

        zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
            this.f3572iobyxmoadg = ppxfxbqfkfVar;
            this.f3573zoijcleaow = i13;
        }

        public int iobyxmoadg() {
            return this.f3573zoijcleaow;
        }

        public ppxfxbqfkf zoijcleaow() {
            return this.f3572iobyxmoadg;
        }
    }

    public eablkybsjg(oxmwwwfdhm oxmwwwfdhmVar, Executor executor, iobyxmoadg iobyxmoadgVar) {
        if (oxmwwwfdhmVar == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (iobyxmoadgVar == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        gxszxtbevo(oxmwwwfdhmVar.getSupportFragmentManager(), eablkybsjg(oxmwwwfdhmVar), executor, iobyxmoadgVar);
    }

    private static gxszxtbevo eablkybsjg(oxmwwwfdhm oxmwwwfdhmVar) {
        if (oxmwwwfdhmVar != null) {
            return (gxszxtbevo) new crxdokpmqz(oxmwwwfdhmVar).zoijcleaow(gxszxtbevo.class);
        }
        return null;
    }

    private void gxszxtbevo(FragmentManager fragmentManager, gxszxtbevo gxszxtbevoVar, Executor executor, iobyxmoadg iobyxmoadgVar) {
        this.f3553iobyxmoadg = fragmentManager;
        if (gxszxtbevoVar != null) {
            if (executor != null) {
                gxszxtbevoVar.rlfsiqarku(executor);
            }
            gxszxtbevoVar.metgxyhuhe(iobyxmoadgVar);
        }
    }

    private static BiometricFragment ppxfxbqfkf(FragmentManager fragmentManager) {
        return (BiometricFragment) fragmentManager.oipsdeybqn("androidx.biometric.BiometricFragment");
    }

    private static BiometricFragment wkgbmnqykc(FragmentManager fragmentManager) {
        BiometricFragment biometricFragmentPpxfxbqfkf = ppxfxbqfkf(fragmentManager);
        if (biometricFragmentPpxfxbqfkf != null) {
            return biometricFragmentPpxfxbqfkf;
        }
        BiometricFragment biometricFragmentTzroggbefp = BiometricFragment.tzroggbefp();
        fragmentManager.kcexrzcfyt().eablkybsjg(biometricFragmentTzroggbefp, "androidx.biometric.BiometricFragment").btonecajqb();
        fragmentManager.yfnezrywwk();
        return biometricFragmentTzroggbefp;
    }

    private void zoijcleaow(wkgbmnqykc wkgbmnqykcVar, ppxfxbqfkf ppxfxbqfkfVar) {
        FragmentManager fragmentManager = this.f3553iobyxmoadg;
        if (fragmentManager == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (fragmentManager.d()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            wkgbmnqykc(this.f3553iobyxmoadg).cdpycssgdh(wkgbmnqykcVar, ppxfxbqfkfVar);
        }
    }

    public void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        zoijcleaow(wkgbmnqykcVar, null);
    }

    public static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Signature f3554iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Mac f3555ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final IdentityCredential f3556wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Cipher f3557zoijcleaow;

        public ppxfxbqfkf(Signature signature) {
            this.f3554iobyxmoadg = signature;
            this.f3557zoijcleaow = null;
            this.f3555ppxfxbqfkf = null;
            this.f3556wkgbmnqykc = null;
        }

        public Cipher iobyxmoadg() {
            return this.f3557zoijcleaow;
        }

        public Mac ppxfxbqfkf() {
            return this.f3555ppxfxbqfkf;
        }

        public Signature wkgbmnqykc() {
            return this.f3554iobyxmoadg;
        }

        public IdentityCredential zoijcleaow() {
            return this.f3556wkgbmnqykc;
        }

        public ppxfxbqfkf(Cipher cipher) {
            this.f3554iobyxmoadg = null;
            this.f3557zoijcleaow = cipher;
            this.f3555ppxfxbqfkf = null;
            this.f3556wkgbmnqykc = null;
        }

        public ppxfxbqfkf(Mac mac) {
            this.f3554iobyxmoadg = null;
            this.f3557zoijcleaow = null;
            this.f3555ppxfxbqfkf = mac;
            this.f3556wkgbmnqykc = null;
        }

        public ppxfxbqfkf(IdentityCredential identityCredential) {
            this.f3554iobyxmoadg = null;
            this.f3557zoijcleaow = null;
            this.f3555ppxfxbqfkf = null;
            this.f3556wkgbmnqykc = identityCredential;
        }
    }
}
