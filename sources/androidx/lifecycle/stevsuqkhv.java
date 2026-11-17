package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class stevsuqkhv extends crxdokpmqz.eablkybsjg implements crxdokpmqz.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private gtknphoqwx f9550eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private q5.gxszxtbevo f9551gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final crxdokpmqz.ppxfxbqfkf f9552ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Bundle f9553wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Application f9554zoijcleaow;

    public stevsuqkhv(Application application, q5.dxjokdxxww owner, Bundle bundle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(owner, "owner");
        this.f9551gxszxtbevo = owner.getSavedStateRegistry();
        this.f9550eablkybsjg = owner.getLifecycle();
        this.f9553wkgbmnqykc = bundle;
        this.f9554zoijcleaow = application;
        this.f9552ppxfxbqfkf = application != null ? crxdokpmqz.iobyxmoadg.f9447gxszxtbevo.iobyxmoadg(application) : new crxdokpmqz.iobyxmoadg();
    }

    @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
    public ntlheqmsrt create(ah.wkgbmnqykc modelClass, t2.iobyxmoadg extras) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
        return create(sg.iobyxmoadg.zoijcleaow(modelClass), extras);
    }

    @Override // androidx.lifecycle.crxdokpmqz.eablkybsjg
    public void iobyxmoadg(ntlheqmsrt viewModel) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewModel, "viewModel");
        if (this.f9550eablkybsjg != null) {
            q5.gxszxtbevo gxszxtbevoVar = this.f9551gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(gxszxtbevoVar);
            gtknphoqwx gtknphoqwxVar = this.f9550eablkybsjg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(gtknphoqwxVar);
            btonecajqb.iobyxmoadg(viewModel, gxszxtbevoVar, gtknphoqwxVar);
        }
    }

    public final ntlheqmsrt zoijcleaow(String key, Class modelClass) {
        ntlheqmsrt ntlheqmsrtVarWkgbmnqykc;
        Application application;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        gtknphoqwx gtknphoqwxVar = this.f9550eablkybsjg;
        if (gtknphoqwxVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = zoijcleaow.class.isAssignableFrom(modelClass);
        Constructor constructorPpxfxbqfkf = (!zIsAssignableFrom || this.f9554zoijcleaow == null) ? kegysxyocb.ppxfxbqfkf(modelClass, kegysxyocb.f9505zoijcleaow) : kegysxyocb.ppxfxbqfkf(modelClass, kegysxyocb.f9504iobyxmoadg);
        if (constructorPpxfxbqfkf == null) {
            return this.f9554zoijcleaow != null ? this.f9552ppxfxbqfkf.create(modelClass) : crxdokpmqz.wkgbmnqykc.f9455zoijcleaow.iobyxmoadg().create(modelClass);
        }
        q5.gxszxtbevo gxszxtbevoVar = this.f9551gxszxtbevo;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(gxszxtbevoVar);
        jpowsppfya jpowsppfyaVarZoijcleaow = btonecajqb.zoijcleaow(gxszxtbevoVar, gtknphoqwxVar, key, this.f9553wkgbmnqykc);
        if (!zIsAssignableFrom || (application = this.f9554zoijcleaow) == null) {
            ntlheqmsrtVarWkgbmnqykc = kegysxyocb.wkgbmnqykc(modelClass, constructorPpxfxbqfkf, jpowsppfyaVarZoijcleaow.wkgbmnqykc());
        } else {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(application);
            ntlheqmsrtVarWkgbmnqykc = kegysxyocb.wkgbmnqykc(modelClass, constructorPpxfxbqfkf, application, jpowsppfyaVarZoijcleaow.wkgbmnqykc());
        }
        ntlheqmsrtVarWkgbmnqykc.addCloseable("androidx.lifecycle.savedstate.vm.tag", jpowsppfyaVarZoijcleaow);
        return ntlheqmsrtVarWkgbmnqykc;
    }

    @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
    public ntlheqmsrt create(Class modelClass, t2.iobyxmoadg extras) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
        String str = (String) extras.iobyxmoadg(crxdokpmqz.f9444ppxfxbqfkf);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.iobyxmoadg(hkdspvbjdz.f9476iobyxmoadg) == null || extras.iobyxmoadg(hkdspvbjdz.f9478zoijcleaow) == null) {
            if (this.f9550eablkybsjg != null) {
                return zoijcleaow(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.iobyxmoadg(crxdokpmqz.iobyxmoadg.f9449nufgyqmvbu);
        boolean zIsAssignableFrom = zoijcleaow.class.isAssignableFrom(modelClass);
        Constructor constructorPpxfxbqfkf = (!zIsAssignableFrom || application == null) ? kegysxyocb.ppxfxbqfkf(modelClass, kegysxyocb.f9505zoijcleaow) : kegysxyocb.ppxfxbqfkf(modelClass, kegysxyocb.f9504iobyxmoadg);
        if (constructorPpxfxbqfkf == null) {
            return this.f9552ppxfxbqfkf.create(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? kegysxyocb.wkgbmnqykc(modelClass, constructorPpxfxbqfkf, hkdspvbjdz.zoijcleaow(extras)) : kegysxyocb.wkgbmnqykc(modelClass, constructorPpxfxbqfkf, application, hkdspvbjdz.zoijcleaow(extras));
    }

    @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
    public ntlheqmsrt create(Class modelClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return zoijcleaow(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
