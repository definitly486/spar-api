package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class dd implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final fg.iobyxmoadg f56258iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f56259zoijcleaow;

    public dd(ac acVar, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        this.f56258iobyxmoadg = iobyxmoadgVar;
        this.f56259zoijcleaow = iobyxmoadgVar2;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        xf sPayStorage = (xf) this.f56258iobyxmoadg.get();
        wc0 featuresHandler = (wc0) this.f56259zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        return (bx) ag.dxjokdxxww.eablkybsjg(new bx(sPayStorage, featuresHandler));
    }
}
