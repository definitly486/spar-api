package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg extends crxdokpmqz.eablkybsjg implements crxdokpmqz.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private gtknphoqwx f9479ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Bundle f9480wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private q5.gxszxtbevo f9481zoijcleaow;

    public iobyxmoadg(q5.dxjokdxxww owner, Bundle bundle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(owner, "owner");
        this.f9481zoijcleaow = owner.getSavedStateRegistry();
        this.f9479ppxfxbqfkf = owner.getLifecycle();
        this.f9480wkgbmnqykc = bundle;
    }

    private final ntlheqmsrt zoijcleaow(String str, Class cls) {
        q5.gxszxtbevo gxszxtbevoVar = this.f9481zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(gxszxtbevoVar);
        gtknphoqwx gtknphoqwxVar = this.f9479ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(gtknphoqwxVar);
        jpowsppfya jpowsppfyaVarZoijcleaow = btonecajqb.zoijcleaow(gxszxtbevoVar, gtknphoqwxVar, str, this.f9480wkgbmnqykc);
        ntlheqmsrt ntlheqmsrtVarPpxfxbqfkf = ppxfxbqfkf(str, cls, jpowsppfyaVarZoijcleaow.wkgbmnqykc());
        ntlheqmsrtVarPpxfxbqfkf.addCloseable("androidx.lifecycle.savedstate.vm.tag", jpowsppfyaVarZoijcleaow);
        return ntlheqmsrtVarPpxfxbqfkf;
    }

    @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
    public ntlheqmsrt create(Class modelClass, t2.iobyxmoadg extras) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
        String str = (String) extras.iobyxmoadg(crxdokpmqz.wkgbmnqykc.f9454wkgbmnqykc);
        if (str != null) {
            return this.f9481zoijcleaow != null ? zoijcleaow(str, modelClass) : ppxfxbqfkf(str, modelClass, hkdspvbjdz.zoijcleaow(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.crxdokpmqz.eablkybsjg
    public void iobyxmoadg(ntlheqmsrt viewModel) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewModel, "viewModel");
        q5.gxszxtbevo gxszxtbevoVar = this.f9481zoijcleaow;
        if (gxszxtbevoVar != null) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(gxszxtbevoVar);
            gtknphoqwx gtknphoqwxVar = this.f9479ppxfxbqfkf;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(gtknphoqwxVar);
            btonecajqb.iobyxmoadg(viewModel, gxszxtbevoVar, gtknphoqwxVar);
        }
    }

    protected abstract ntlheqmsrt ppxfxbqfkf(String str, Class cls, pkzmftpjix pkzmftpjixVar);

    @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
    public ntlheqmsrt create(Class modelClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.f9479ppxfxbqfkf != null) {
                return zoijcleaow(canonicalName, modelClass);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
