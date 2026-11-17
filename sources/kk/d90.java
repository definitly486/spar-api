package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class d90 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ef0 f56241iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final nx f56242ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final fg.iobyxmoadg f56243wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f56244zoijcleaow;

    public d90(pr prVar, ef0 ef0Var, fg.iobyxmoadg iobyxmoadgVar, nx nxVar, fg.iobyxmoadg iobyxmoadgVar2) {
        this.f56241iobyxmoadg = ef0Var;
        this.f56244zoijcleaow = iobyxmoadgVar;
        this.f56242ppxfxbqfkf = nxVar;
        this.f56243wkgbmnqykc = iobyxmoadgVar2;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        ll sPayRepository = (ll) this.f56241iobyxmoadg.get();
        pc sPaySdkReducer = (pc) this.f56244zoijcleaow.get();
        c80 fraudMonResultHandler = (c80) this.f56242ppxfxbqfkf.get();
        wc0 featuresHandler = (wc0) this.f56243wkgbmnqykc.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonResultHandler, "fraudMonResultHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        return (tr) ag.dxjokdxxww.eablkybsjg(new tr(sPayRepository, sPaySdkReducer, fraudMonResultHandler, featuresHandler));
    }
}
