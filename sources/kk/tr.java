package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class tr extends ui {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ll f58715iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final c80 f58716ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final wc0 f58717wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final pc f58718zoijcleaow;

    public tr(ll sPayRepository, pc sPaySdkReducer, c80 fraudMonResultHandler, wc0 featuresHandler) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonResultHandler, "fraudMonResultHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        this.f58715iobyxmoadg = sPayRepository;
        this.f58718zoijcleaow = sPaySdkReducer;
        this.f58716ppxfxbqfkf = fraudMonResultHandler;
        this.f58717wkgbmnqykc = featuresHandler;
    }

    @Override // kk.ui
    public final Object iobyxmoadg(Object obj, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(pkzmftpjixVar.plus(pj.krqnebusok.zoijcleaow(null, 1, null)), new pq(this, (xs) obj, pkzmftpjixVar, null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
