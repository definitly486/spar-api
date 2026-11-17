package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
class wypolnanlu implements androidx.lifecycle.dxjokdxxww, q5.dxjokdxxww, ribwqtqdhb {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private androidx.lifecycle.kcexrzcfyt f9408cqumvgiudr = null;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private q5.nufgyqmvbu f9409esjtqupxsv = null;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private crxdokpmqz.ppxfxbqfkf f9410iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Runnable f9411jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jlmebxxoox f9412yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Fragment f9413zdlpuopuiu;

    wypolnanlu(Fragment fragment, jlmebxxoox jlmebxxooxVar, Runnable runnable) {
        this.f9413zdlpuopuiu = fragment;
        this.f9412yggfygwlhe = jlmebxxooxVar;
        this.f9411jyumaefscl = runnable;
    }

    void eablkybsjg(Bundle bundle) {
        this.f9409esjtqupxsv.eablkybsjg(bundle);
    }

    @Override // androidx.lifecycle.dxjokdxxww
    public t2.iobyxmoadg getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f9413zdlpuopuiu.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        t2.wkgbmnqykc wkgbmnqykcVar = new t2.wkgbmnqykc();
        if (application != null) {
            wkgbmnqykcVar.ppxfxbqfkf(crxdokpmqz.iobyxmoadg.f9449nufgyqmvbu, application);
        }
        wkgbmnqykcVar.ppxfxbqfkf(androidx.lifecycle.hkdspvbjdz.f9476iobyxmoadg, this.f9413zdlpuopuiu);
        wkgbmnqykcVar.ppxfxbqfkf(androidx.lifecycle.hkdspvbjdz.f9478zoijcleaow, this);
        if (this.f9413zdlpuopuiu.getArguments() != null) {
            wkgbmnqykcVar.ppxfxbqfkf(androidx.lifecycle.hkdspvbjdz.f9477ppxfxbqfkf, this.f9413zdlpuopuiu.getArguments());
        }
        return wkgbmnqykcVar;
    }

    @Override // androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        Application application;
        crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory = this.f9413zdlpuopuiu.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f9413zdlpuopuiu.mDefaultFactory)) {
            this.f9410iwizpuwonk = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f9410iwizpuwonk == null) {
            Context applicationContext = this.f9413zdlpuopuiu.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.f9413zdlpuopuiu;
            this.f9410iwizpuwonk = new androidx.lifecycle.stevsuqkhv(application, fragment, fragment.getArguments());
        }
        return this.f9410iwizpuwonk;
    }

    @Override // androidx.lifecycle.vdvldrhtss
    public androidx.lifecycle.gtknphoqwx getLifecycle() {
        zoijcleaow();
        return this.f9408cqumvgiudr;
    }

    @Override // q5.dxjokdxxww
    public q5.gxszxtbevo getSavedStateRegistry() {
        zoijcleaow();
        return this.f9409esjtqupxsv.zoijcleaow();
    }

    @Override // androidx.lifecycle.ribwqtqdhb
    public jlmebxxoox getViewModelStore() {
        zoijcleaow();
        return this.f9412yggfygwlhe;
    }

    void gxszxtbevo(androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar) {
        this.f9408cqumvgiudr.agtfadlqog(zoijcleaowVar);
    }

    void iobyxmoadg(androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
        this.f9408cqumvgiudr.dxjokdxxww(iobyxmoadgVar);
    }

    boolean ppxfxbqfkf() {
        return this.f9408cqumvgiudr != null;
    }

    void wkgbmnqykc(Bundle bundle) {
        this.f9409esjtqupxsv.wkgbmnqykc(bundle);
    }

    void zoijcleaow() {
        if (this.f9408cqumvgiudr == null) {
            this.f9408cqumvgiudr = new androidx.lifecycle.kcexrzcfyt(this);
            q5.nufgyqmvbu nufgyqmvbuVarIobyxmoadg = q5.nufgyqmvbu.iobyxmoadg(this);
            this.f9409esjtqupxsv = nufgyqmvbuVarIobyxmoadg;
            nufgyqmvbuVarIobyxmoadg.ppxfxbqfkf();
            this.f9411jyumaefscl.run();
        }
    }
}
