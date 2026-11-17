package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class jrbgnlbqoe implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final fg.iobyxmoadg f57219iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final kv f57220zoijcleaow;

    public jrbgnlbqoe(jpowsppfya jpowsppfyaVar, fg.iobyxmoadg iobyxmoadgVar, kv kvVar) {
        this.f57219iobyxmoadg = iobyxmoadgVar;
        this.f57220zoijcleaow = kvVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        gg secureSharedPreferences = (gg) this.f57219iobyxmoadg.get();
        bt metricFacade = (bt) this.f57220zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(secureSharedPreferences, "secureSharedPreferences");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        return (u80) ag.dxjokdxxww.eablkybsjg(new u80(secureSharedPreferences, metricFacade));
    }
}
