package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ga extends grlcpdaxtj {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final sj.wypolnanlu f56681gxszxtbevo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer, m60 sPaySdkConfigRepository) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f56681gxszxtbevo = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(sj.dxjokdxxww.zoijcleaow(this.f56732wkgbmnqykc), new a9(sPaySdkConfigRepository, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(sj.jpowsppfya.f106926iobyxmoadg, 0L, 0L, 3, null), null);
    }

    @Override // kk.grlcpdaxtj
    public final gg.wwaezpbzkn draadjrbmk(lqeggnwhkg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (!(event instanceof jg0)) {
            return super.draadjrbmk(event);
        }
        grlcpdaxtj.agtfadlqog(this, hi.LC_STATUS_IN_PROGRESS_VIEW_APPEARED);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
