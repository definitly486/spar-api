package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class nh0 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final fg.iobyxmoadg f57827iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final kv f57828ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f57829zoijcleaow;

    public nh0(pr prVar, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, kv kvVar) {
        this.f57827iobyxmoadg = iobyxmoadgVar;
        this.f57829zoijcleaow = iobyxmoadgVar2;
        this.f57828ppxfxbqfkf = kvVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        xf sPayStorage = (xf) this.f57827iobyxmoadg.get();
        jlmebxxoox sPayDataContract = (jlmebxxoox) this.f57829zoijcleaow.get();
        bt metricFacade = (bt) this.f57828ppxfxbqfkf.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        return (pc) ag.dxjokdxxww.eablkybsjg(new ve(sPayStorage, sPayDataContract, metricFacade));
    }
}
