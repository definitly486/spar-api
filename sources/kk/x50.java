package kk;

import spay.sdk.domain.model.request.BindingSessionIdRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class x50 extends ui {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final m60 f59253eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ll f59254iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final pc f59255ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final wc0 f59256wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final sk f59257zoijcleaow;

    public x50(ll sPayRepository, sk commonRepository, pc sPaySdkReducer, wc0 featuresHandler, m60 sPaySdkConfigRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(commonRepository, "commonRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f59254iobyxmoadg = sPayRepository;
        this.f59257zoijcleaow = commonRepository;
        this.f59255ppxfxbqfkf = sPaySdkReducer;
        this.f59256wkgbmnqykc = featuresHandler;
        this.f59253eablkybsjg = sPaySdkConfigRepository;
    }

    @Override // kk.ui
    public final Object iobyxmoadg(Object obj, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(pkzmftpjixVar.plus(pj.krqnebusok.zoijcleaow(null, 1, null)), new u40(this, (BindingSessionIdRequestBody) obj, pkzmftpjixVar, null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
