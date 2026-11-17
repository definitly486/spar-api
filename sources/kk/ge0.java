package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ge0 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final fg.iobyxmoadg f56698iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final wl f56699zoijcleaow;

    public ge0(k10 k10Var, fg.iobyxmoadg iobyxmoadgVar, wl wlVar) {
        this.f56698iobyxmoadg = iobyxmoadgVar;
        this.f56699zoijcleaow = wlVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        rg0 okHttpConnector = (rg0) this.f56698iobyxmoadg.get();
        xy headersHandler = (xy) this.f56699zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(okHttpConnector, "okHttpConnector");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(headersHandler, "headersHandler");
        return (qj) ag.dxjokdxxww.eablkybsjg(new qj(okHttpConnector, headersHandler));
    }
}
