package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.zynmafqrjb;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class BiometricFragment extends Fragment {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    androidx.biometric.gxszxtbevo f3520yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    Handler f3521zdlpuopuiu = new Handler(Looper.getMainLooper());

    private static class agtfadlqog {
        static void iobyxmoadg(BiometricPrompt.Builder builder, boolean z13) {
            builder.setConfirmationRequired(z13);
        }

        static void zoijcleaow(BiometricPrompt.Builder builder, boolean z13) {
            builder.setDeviceCredentialAllowed(z13);
        }
    }

    class btonecajqb implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ CharSequence f3523yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f3524zdlpuopuiu;

        btonecajqb(int i13, CharSequence charSequence) {
            this.f3524zdlpuopuiu = i13;
            this.f3523yggfygwlhe = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.ribwqtqdhb(this.f3524zdlpuopuiu, this.f3523yggfygwlhe);
        }
    }

    private static class draadjrbmk {
        static Intent iobyxmoadg(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    class dxjokdxxww implements Runnable {
        dxjokdxxww() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f3520yggfygwlhe.sflfametgt(false);
        }
    }

    class eablkybsjg implements zynmafqrjb {
        eablkybsjg() {
        }

        @Override // androidx.lifecycle.zynmafqrjb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(CharSequence charSequence) {
            if (charSequence != null) {
                BiometricFragment.this.ulzqkzuiru(charSequence);
                BiometricFragment.this.f3520yggfygwlhe.vipkmwdibw(null);
            }
        }
    }

    class gtknphoqwx implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.biometric.eablkybsjg.zoijcleaow f3528zdlpuopuiu;

        gtknphoqwx(androidx.biometric.eablkybsjg.zoijcleaow zoijcleaowVar) {
            this.f3528zdlpuopuiu = zoijcleaowVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f3520yggfygwlhe.yggfygwlhe().ppxfxbqfkf(this.f3528zdlpuopuiu);
        }
    }

    class gxszxtbevo implements zynmafqrjb {
        gxszxtbevo() {
        }

        @Override // androidx.lifecycle.zynmafqrjb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(Boolean bool) {
            if (bool.booleanValue()) {
                BiometricFragment.this.ntlheqmsrt();
                BiometricFragment.this.f3520yggfygwlhe.jhduphickx(false);
            }
        }
    }

    class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ CharSequence f3531yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f3532zdlpuopuiu;

        iobyxmoadg(int i13, CharSequence charSequence) {
            this.f3532zdlpuopuiu = i13;
            this.f3531yggfygwlhe = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f3520yggfygwlhe.yggfygwlhe().iobyxmoadg(this.f3532zdlpuopuiu, this.f3531yggfygwlhe);
        }
    }

    private static class kcexrzcfyt implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final WeakReference f3533zdlpuopuiu;

        kcexrzcfyt(androidx.biometric.gxszxtbevo gxszxtbevoVar) {
            this.f3533zdlpuopuiu = new WeakReference(gxszxtbevoVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3533zdlpuopuiu.get() != null) {
                ((androidx.biometric.gxszxtbevo) this.f3533zdlpuopuiu.get()).opjhrmiecq(false);
            }
        }
    }

    class lqeggnwhkg implements zynmafqrjb {
        lqeggnwhkg() {
        }

        @Override // androidx.lifecycle.zynmafqrjb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(Boolean bool) {
            if (bool.booleanValue()) {
                if (BiometricFragment.this.wypolnanlu()) {
                    BiometricFragment.this.jlmebxxoox();
                } else {
                    BiometricFragment.this.crxdokpmqz();
                }
                BiometricFragment.this.f3520yggfygwlhe.iyctptxqzt(false);
            }
        }
    }

    class nufgyqmvbu implements zynmafqrjb {
        nufgyqmvbu() {
        }

        @Override // androidx.lifecycle.zynmafqrjb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(Boolean bool) {
            if (bool.booleanValue()) {
                BiometricFragment.this.lmojexxdyd(1);
                BiometricFragment.this.dismiss();
                BiometricFragment.this.f3520yggfygwlhe.ydmasvzmpa(false);
            }
        }
    }

    private static class ojitshcjhn {
        static void iobyxmoadg(BiometricPrompt.Builder builder, int i13) {
            builder.setAllowedAuthenticators(i13);
        }
    }

    private static class oxmwwwfdhm implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final WeakReference f3536zdlpuopuiu;

        oxmwwwfdhm(androidx.biometric.gxszxtbevo gxszxtbevoVar) {
            this.f3536zdlpuopuiu = new WeakReference(gxszxtbevoVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3536zdlpuopuiu.get() != null) {
                ((androidx.biometric.gxszxtbevo) this.f3536zdlpuopuiu.get()).yfnezrywwk(false);
            }
        }
    }

    class ppxfxbqfkf implements zynmafqrjb {
        ppxfxbqfkf() {
        }

        @Override // androidx.lifecycle.zynmafqrjb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(androidx.biometric.eablkybsjg.zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar != null) {
                BiometricFragment.this.sopmlzcsov(zoijcleaowVar);
                BiometricFragment.this.f3520yggfygwlhe.okpsazkaxt(null);
            }
        }
    }

    private static class rgvfuqvkyq implements Executor {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Handler f3538zdlpuopuiu = new Handler(Looper.getMainLooper());

        rgvfuqvkyq() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f3538zdlpuopuiu.post(runnable);
        }
    }

    private static class vdvldrhtss implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final WeakReference f3539zdlpuopuiu;

        vdvldrhtss(BiometricFragment biometricFragment) {
            this.f3539zdlpuopuiu = new WeakReference(biometricFragment);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3539zdlpuopuiu.get() != null) {
                ((BiometricFragment) this.f3539zdlpuopuiu.get()).rlfsiqarku();
            }
        }
    }

    private static class wflxmlrfwp {
        static void eablkybsjg(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void gxszxtbevo(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static void iobyxmoadg(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static void lqeggnwhkg(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void nufgyqmvbu(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }

        static BiometricPrompt ppxfxbqfkf(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        static BiometricPrompt.Builder wkgbmnqykc(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        static void zoijcleaow(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }
    }

    class wkgbmnqykc implements zynmafqrjb {
        wkgbmnqykc() {
        }

        @Override // androidx.lifecycle.zynmafqrjb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(androidx.biometric.ppxfxbqfkf ppxfxbqfkfVar) {
            if (ppxfxbqfkfVar != null) {
                BiometricFragment.this.mbcevpiqjq(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.ppxfxbqfkf());
                BiometricFragment.this.f3520yggfygwlhe.vipkmwdibw(null);
            }
        }
    }

    class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f3520yggfygwlhe.yggfygwlhe().zoijcleaow();
        }
    }

    private boolean cllcsxoeiz() {
        androidx.fragment.app.oxmwwwfdhm activity = getActivity();
        return (activity == null || this.f3520yggfygwlhe.iwizpuwonk() == null || !androidx.biometric.dxjokdxxww.lqeggnwhkg(activity, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    private boolean dsvhmnatus() {
        return Build.VERSION.SDK_INT == 28 && !androidx.biometric.draadjrbmk.iobyxmoadg(getContext());
    }

    private int hcddaimhww() {
        Context context = getContext();
        return (context == null || !androidx.biometric.dxjokdxxww.gxszxtbevo(context, Build.MODEL)) ? 2000 : 0;
    }

    private boolean hkdspvbjdz() {
        androidx.fragment.app.oxmwwwfdhm activity = getActivity();
        return activity != null && activity.isChangingConfigurations();
    }

    private void ikoacuggdj(androidx.biometric.eablkybsjg.zoijcleaow zoijcleaowVar) {
        okpsazkaxt(zoijcleaowVar);
        dismiss();
    }

    private void jhduphickx() {
        if (this.f3520yggfygwlhe.stevsuqkhv()) {
            this.f3520yggfygwlhe.jyumaefscl().execute(new zoijcleaow());
        } else {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    private void jpowsppfya(int i13) {
        if (i13 == -1) {
            ikoacuggdj(new androidx.biometric.eablkybsjg.zoijcleaow(null, 1));
        } else {
            ribwqtqdhb(10, getString(rgvfuqvkyq.gxszxtbevo.generic_error_user_canceled));
        }
    }

    private void jztzpxfvev() {
        BiometricPrompt.Builder builderWkgbmnqykc = wflxmlrfwp.wkgbmnqykc(requireContext().getApplicationContext());
        CharSequence charSequenceCllcsxoeiz = this.f3520yggfygwlhe.cllcsxoeiz();
        CharSequence charSequenceJpowsppfya = this.f3520yggfygwlhe.jpowsppfya();
        CharSequence charSequenceCqumvgiudr = this.f3520yggfygwlhe.cqumvgiudr();
        if (charSequenceCllcsxoeiz != null) {
            wflxmlrfwp.nufgyqmvbu(builderWkgbmnqykc, charSequenceCllcsxoeiz);
        }
        if (charSequenceJpowsppfya != null) {
            wflxmlrfwp.lqeggnwhkg(builderWkgbmnqykc, charSequenceJpowsppfya);
        }
        if (charSequenceCqumvgiudr != null) {
            wflxmlrfwp.eablkybsjg(builderWkgbmnqykc, charSequenceCqumvgiudr);
        }
        CharSequence charSequencePkzmftpjix = this.f3520yggfygwlhe.pkzmftpjix();
        if (!TextUtils.isEmpty(charSequencePkzmftpjix)) {
            wflxmlrfwp.gxszxtbevo(builderWkgbmnqykc, charSequencePkzmftpjix, this.f3520yggfygwlhe.jyumaefscl(), this.f3520yggfygwlhe.cdpycssgdh());
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            agtfadlqog.iobyxmoadg(builderWkgbmnqykc, this.f3520yggfygwlhe.kegysxyocb());
        }
        int iGtknphoqwx = this.f3520yggfygwlhe.gtknphoqwx();
        if (i13 >= 30) {
            ojitshcjhn.iobyxmoadg(builderWkgbmnqykc, iGtknphoqwx);
        } else if (i13 >= 29) {
            agtfadlqog.zoijcleaow(builderWkgbmnqykc, androidx.biometric.zoijcleaow.ppxfxbqfkf(iGtknphoqwx));
        }
        yadqdtsiqt(wflxmlrfwp.ppxfxbqfkf(builderWkgbmnqykc), getContext());
    }

    private void kegysxyocb() {
        androidx.fragment.app.oxmwwwfdhm activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerIobyxmoadg = androidx.biometric.gtknphoqwx.iobyxmoadg(activity);
        if (keyguardManagerIobyxmoadg == null) {
            ribwqtqdhb(12, getString(rgvfuqvkyq.gxszxtbevo.generic_error_no_keyguard));
            return;
        }
        CharSequence charSequenceCllcsxoeiz = this.f3520yggfygwlhe.cllcsxoeiz();
        CharSequence charSequenceJpowsppfya = this.f3520yggfygwlhe.jpowsppfya();
        CharSequence charSequenceCqumvgiudr = this.f3520yggfygwlhe.cqumvgiudr();
        if (charSequenceJpowsppfya == null) {
            charSequenceJpowsppfya = charSequenceCqumvgiudr;
        }
        Intent intentIobyxmoadg = draadjrbmk.iobyxmoadg(keyguardManagerIobyxmoadg, charSequenceCllcsxoeiz, charSequenceJpowsppfya);
        if (intentIobyxmoadg == null) {
            ribwqtqdhb(14, getString(rgvfuqvkyq.gxszxtbevo.generic_error_no_device_credential));
            return;
        }
        this.f3520yggfygwlhe.czzsidtyhn(true);
        if (stevsuqkhv()) {
            pkzmftpjix();
        }
        intentIobyxmoadg.setFlags(134742016);
        startActivityForResult(intentIobyxmoadg, 1);
    }

    private void metgxyhuhe(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(rgvfuqvkyq.gxszxtbevo.default_error_msg);
        }
        this.f3520yggfygwlhe.bfopjjpdmp(2);
        this.f3520yggfygwlhe.zfvoamnweg(charSequence);
    }

    private void okpsazkaxt(androidx.biometric.eablkybsjg.zoijcleaow zoijcleaowVar) {
        if (!this.f3520yggfygwlhe.stevsuqkhv()) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.f3520yggfygwlhe.jztzpxfvev(false);
            this.f3520yggfygwlhe.jyumaefscl().execute(new gtknphoqwx(zoijcleaowVar));
        }
    }

    private void pkzmftpjix() {
        this.f3520yggfygwlhe.zeieaojujs(false);
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) parentFragmentManager.oipsdeybqn("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.isAdded()) {
                    fingerprintDialogFragment.dismissAllowingStateLoss();
                } else {
                    parentFragmentManager.kcexrzcfyt().rgvfuqvkyq(fingerprintDialogFragment).btonecajqb();
                }
            }
        }
    }

    private boolean stevsuqkhv() {
        return Build.VERSION.SDK_INT < 28 || cllcsxoeiz() || dsvhmnatus();
    }

    static BiometricFragment tzroggbefp() {
        return new BiometricFragment();
    }

    private void vipkmwdibw(int i13, CharSequence charSequence) {
        if (this.f3520yggfygwlhe.mbcevpiqjq()) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!this.f3520yggfygwlhe.stevsuqkhv()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.f3520yggfygwlhe.jztzpxfvev(false);
            this.f3520yggfygwlhe.jyumaefscl().execute(new iobyxmoadg(i13, charSequence));
        }
    }

    private static int wwaezpbzkn(l1.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.gxszxtbevo()) {
            return !iobyxmoadgVar.eablkybsjg() ? 11 : 0;
        }
        return 12;
    }

    private void xrmfcynszj() {
        Context applicationContext = requireContext().getApplicationContext();
        l1.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = l1.iobyxmoadg.ppxfxbqfkf(applicationContext);
        int iWwaezpbzkn = wwaezpbzkn(iobyxmoadgVarPpxfxbqfkf);
        if (iWwaezpbzkn != 0) {
            ribwqtqdhb(iWwaezpbzkn, androidx.biometric.btonecajqb.iobyxmoadg(applicationContext, iWwaezpbzkn));
            return;
        }
        if (isAdded()) {
            this.f3520yggfygwlhe.sflfametgt(true);
            if (!androidx.biometric.dxjokdxxww.gxszxtbevo(applicationContext, Build.MODEL)) {
                this.f3521zdlpuopuiu.postDelayed(new dxjokdxxww(), 500L);
                FingerprintDialogFragment.ylkuphrtab().show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f3520yggfygwlhe.xrmfcynszj(0);
            iozdgvuglv(iobyxmoadgVarPpxfxbqfkf, applicationContext);
        }
    }

    private void ylkuphrtab() {
        if (getActivity() == null) {
            return;
        }
        androidx.biometric.gxszxtbevo gxszxtbevoVar = (androidx.biometric.gxszxtbevo) new crxdokpmqz(getActivity()).zoijcleaow(androidx.biometric.gxszxtbevo.class);
        this.f3520yggfygwlhe = gxszxtbevoVar;
        gxszxtbevoVar.vdvldrhtss().dxjokdxxww(this, new ppxfxbqfkf());
        this.f3520yggfygwlhe.agtfadlqog().dxjokdxxww(this, new wkgbmnqykc());
        this.f3520yggfygwlhe.ojitshcjhn().dxjokdxxww(this, new eablkybsjg());
        this.f3520yggfygwlhe.wypolnanlu().dxjokdxxww(this, new gxszxtbevo());
        this.f3520yggfygwlhe.jlmebxxoox().dxjokdxxww(this, new lqeggnwhkg());
        this.f3520yggfygwlhe.ulzqkzuiru().dxjokdxxww(this, new nufgyqmvbu());
    }

    void cdpycssgdh(androidx.biometric.eablkybsjg.wkgbmnqykc wkgbmnqykcVar, androidx.biometric.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar) {
        androidx.fragment.app.oxmwwwfdhm activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        this.f3520yggfygwlhe.lrnfpwlwnk(wkgbmnqykcVar);
        int iZoijcleaow = androidx.biometric.zoijcleaow.zoijcleaow(wkgbmnqykcVar, ppxfxbqfkfVar);
        if (Build.VERSION.SDK_INT < 30 && iZoijcleaow == 15 && ppxfxbqfkfVar == null) {
            this.f3520yggfygwlhe.uwvvkdfqfp(androidx.biometric.nufgyqmvbu.iobyxmoadg());
        } else {
            this.f3520yggfygwlhe.uwvvkdfqfp(ppxfxbqfkfVar);
        }
        if (wypolnanlu()) {
            this.f3520yggfygwlhe.weqkydbzbr(getString(rgvfuqvkyq.gxszxtbevo.confirm_device_credential_password));
        } else {
            this.f3520yggfygwlhe.weqkydbzbr(null);
        }
        if (wypolnanlu() && androidx.biometric.wkgbmnqykc.lqeggnwhkg(activity).iobyxmoadg(KotlinVersion.MAX_COMPONENT_VALUE) != 0) {
            this.f3520yggfygwlhe.jztzpxfvev(true);
            kegysxyocb();
        } else if (this.f3520yggfygwlhe.ntlheqmsrt()) {
            this.f3521zdlpuopuiu.postDelayed(new vdvldrhtss(this), 600L);
        } else {
            rlfsiqarku();
        }
    }

    void crxdokpmqz() {
        CharSequence charSequencePkzmftpjix = this.f3520yggfygwlhe.pkzmftpjix();
        if (charSequencePkzmftpjix == null) {
            charSequencePkzmftpjix = getString(rgvfuqvkyq.gxszxtbevo.default_error_msg);
        }
        ribwqtqdhb(13, charSequencePkzmftpjix);
        lmojexxdyd(2);
    }

    void dismiss() {
        this.f3520yggfygwlhe.zeieaojujs(false);
        pkzmftpjix();
        if (!this.f3520yggfygwlhe.mbcevpiqjq() && isAdded()) {
            getParentFragmentManager().kcexrzcfyt().rgvfuqvkyq(this).btonecajqb();
        }
        Context context = getContext();
        if (context == null || !androidx.biometric.dxjokdxxww.eablkybsjg(context, Build.MODEL)) {
            return;
        }
        this.f3520yggfygwlhe.yfnezrywwk(true);
        this.f3521zdlpuopuiu.postDelayed(new oxmwwwfdhm(this.f3520yggfygwlhe), 600L);
    }

    void iozdgvuglv(l1.iobyxmoadg iobyxmoadgVar, Context context) {
        try {
            iobyxmoadgVar.zoijcleaow(androidx.biometric.nufgyqmvbu.eablkybsjg(this.f3520yggfygwlhe.iwizpuwonk()), 0, this.f3520yggfygwlhe.zdlpuopuiu().ppxfxbqfkf(), this.f3520yggfygwlhe.draadjrbmk().zoijcleaow(), null);
        } catch (NullPointerException e13) {
            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e13);
            ribwqtqdhb(1, androidx.biometric.btonecajqb.iobyxmoadg(context, 1));
        }
    }

    void jlmebxxoox() {
        kegysxyocb();
    }

    void lmojexxdyd(int i13) {
        if (i13 == 3 || !this.f3520yggfygwlhe.crxdokpmqz()) {
            if (stevsuqkhv()) {
                this.f3520yggfygwlhe.xrmfcynszj(i13);
                if (i13 == 1) {
                    vipkmwdibw(10, androidx.biometric.btonecajqb.iobyxmoadg(getContext(), 10));
                }
            }
            this.f3520yggfygwlhe.zdlpuopuiu().iobyxmoadg();
        }
    }

    void mbcevpiqjq(int i13, CharSequence charSequence) {
        if (!androidx.biometric.btonecajqb.zoijcleaow(i13)) {
            i13 = 8;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && androidx.biometric.btonecajqb.ppxfxbqfkf(i13) && context != null && androidx.biometric.gtknphoqwx.zoijcleaow(context) && androidx.biometric.zoijcleaow.ppxfxbqfkf(this.f3520yggfygwlhe.gtknphoqwx())) {
            kegysxyocb();
            return;
        }
        if (!stevsuqkhv()) {
            if (charSequence == null) {
                charSequence = getString(rgvfuqvkyq.gxszxtbevo.default_error_msg) + " " + i13;
            }
            ribwqtqdhb(i13, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = androidx.biometric.btonecajqb.iobyxmoadg(getContext(), i13);
        }
        if (i13 == 5) {
            int iOxmwwwfdhm = this.f3520yggfygwlhe.oxmwwwfdhm();
            if (iOxmwwwfdhm == 0 || iOxmwwwfdhm == 3) {
                vipkmwdibw(i13, charSequence);
            }
            dismiss();
            return;
        }
        if (this.f3520yggfygwlhe.sopmlzcsov()) {
            ribwqtqdhb(i13, charSequence);
        } else {
            metgxyhuhe(charSequence);
            this.f3521zdlpuopuiu.postDelayed(new btonecajqb(i13, charSequence), hcddaimhww());
        }
        this.f3520yggfygwlhe.sflfametgt(true);
    }

    void ntlheqmsrt() {
        if (stevsuqkhv()) {
            metgxyhuhe(getString(rgvfuqvkyq.gxszxtbevo.fingerprint_not_recognized));
        }
        jhduphickx();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        if (i13 == 1) {
            this.f3520yggfygwlhe.czzsidtyhn(false);
            jpowsppfya(i14);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ylkuphrtab();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && androidx.biometric.zoijcleaow.ppxfxbqfkf(this.f3520yggfygwlhe.gtknphoqwx())) {
            this.f3520yggfygwlhe.opjhrmiecq(true);
            this.f3521zdlpuopuiu.postDelayed(new kcexrzcfyt(this.f3520yggfygwlhe), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.f3520yggfygwlhe.mbcevpiqjq() || hkdspvbjdz()) {
            return;
        }
        lmojexxdyd(0);
    }

    void ribwqtqdhb(int i13, CharSequence charSequence) {
        vipkmwdibw(i13, charSequence);
        dismiss();
    }

    void rlfsiqarku() {
        if (this.f3520yggfygwlhe.ribwqtqdhb()) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.f3520yggfygwlhe.zeieaojujs(true);
        this.f3520yggfygwlhe.jztzpxfvev(true);
        if (stevsuqkhv()) {
            xrmfcynszj();
        } else {
            jztzpxfvev();
        }
    }

    void sopmlzcsov(androidx.biometric.eablkybsjg.zoijcleaow zoijcleaowVar) {
        ikoacuggdj(zoijcleaowVar);
    }

    void ulzqkzuiru(CharSequence charSequence) {
        if (stevsuqkhv()) {
            metgxyhuhe(charSequence);
        }
    }

    boolean wypolnanlu() {
        return Build.VERSION.SDK_INT <= 28 && androidx.biometric.zoijcleaow.ppxfxbqfkf(this.f3520yggfygwlhe.gtknphoqwx());
    }

    void yadqdtsiqt(BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject cryptoObjectWkgbmnqykc = androidx.biometric.nufgyqmvbu.wkgbmnqykc(this.f3520yggfygwlhe.iwizpuwonk());
        CancellationSignal cancellationSignalZoijcleaow = this.f3520yggfygwlhe.zdlpuopuiu().zoijcleaow();
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq();
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallbackIobyxmoadg = this.f3520yggfygwlhe.draadjrbmk().iobyxmoadg();
        try {
            if (cryptoObjectWkgbmnqykc == null) {
                wflxmlrfwp.zoijcleaow(biometricPrompt, cancellationSignalZoijcleaow, rgvfuqvkyqVar, biometricPrompt$AuthenticationCallbackIobyxmoadg);
            } else {
                wflxmlrfwp.iobyxmoadg(biometricPrompt, cryptoObjectWkgbmnqykc, cancellationSignalZoijcleaow, rgvfuqvkyqVar, biometricPrompt$AuthenticationCallbackIobyxmoadg);
            }
        } catch (NullPointerException e13) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e13);
            ribwqtqdhb(1, context != null ? context.getString(rgvfuqvkyq.gxszxtbevo.default_error_msg) : "");
        }
    }
}
