package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class fi extends grlcpdaxtj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
    }

    @Override // kk.grlcpdaxtj
    public final gg.wwaezpbzkn draadjrbmk(lqeggnwhkg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (!(event instanceof jg0)) {
            return super.draadjrbmk(event);
        }
        grlcpdaxtj.agtfadlqog(this, hi.LC_STATUS_ERROR_VIEW_APPEARED);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
