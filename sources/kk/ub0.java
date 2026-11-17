package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ub0 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final fg.iobyxmoadg f58811iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final fg.iobyxmoadg f58812ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f58813zoijcleaow;

    public ub0(w30 w30Var, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3) {
        this.f58811iobyxmoadg = iobyxmoadgVar;
        this.f58813zoijcleaow = iobyxmoadgVar2;
        this.f58812ppxfxbqfkf = iobyxmoadgVar3;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        nl sslInteractor = (nl) this.f58811iobyxmoadg.get();
        lk.lereixgezr.iobyxmoadg okHttpBuilder = (lk.lereixgezr.iobyxmoadg) this.f58813zoijcleaow.get();
        wc0 featuresHandler = (wc0) this.f58812ppxfxbqfkf.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sslInteractor, "sslInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(okHttpBuilder, "okHttpBuilder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        return (g80) ag.dxjokdxxww.eablkybsjg(new g80(sslInteractor, okHttpBuilder, featuresHandler));
    }
}
