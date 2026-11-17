package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class a80 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ef0 f55788iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final fg.iobyxmoadg f55789ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f55790zoijcleaow;

    public a80(pr prVar, ef0 ef0Var, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        this.f55788iobyxmoadg = ef0Var;
        this.f55790zoijcleaow = iobyxmoadgVar;
        this.f55789ppxfxbqfkf = iobyxmoadgVar2;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        ll sPayRepository = (ll) this.f55788iobyxmoadg.get();
        pc sPaySdkReducer = (pc) this.f55790zoijcleaow.get();
        wc0 featuresHandler = (wc0) this.f55789ppxfxbqfkf.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        return (oh) ag.dxjokdxxww.eablkybsjg(new oh(sPayRepository, sPaySdkReducer, featuresHandler));
    }
}
