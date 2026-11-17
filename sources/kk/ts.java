package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ts implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final m40 f58719iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final fg.iobyxmoadg f58720ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final kv f58721wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f58722zoijcleaow;

    public ts(pr prVar, m40 m40Var, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, kv kvVar) {
        this.f58719iobyxmoadg = m40Var;
        this.f58722zoijcleaow = iobyxmoadgVar;
        this.f58720ppxfxbqfkf = iobyxmoadgVar2;
        this.f58721wkgbmnqykc = kvVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        gr fingerprintInteractor = (gr) this.f58719iobyxmoadg.get();
        xf sPayStorage = (xf) this.f58722zoijcleaow.get();
        pc reducer = (pc) this.f58720ppxfxbqfkf.get();
        bt metricFacade = (bt) this.f58721wkgbmnqykc.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fingerprintInteractor, "fingerprintInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reducer, "reducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        return (u2) ag.dxjokdxxww.eablkybsjg(new u2(fingerprintInteractor, sPayStorage, reducer, metricFacade));
    }
}
