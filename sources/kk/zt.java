package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class zt extends grlcpdaxtj {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ln f59628gxszxtbevo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer, xf spayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spayStorage, "spayStorage");
        this.f59628gxszxtbevo = ((ij) spayStorage).iobyxmoadg();
    }

    @Override // kk.grlcpdaxtj
    public final gg.wwaezpbzkn draadjrbmk(lqeggnwhkg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (!(event instanceof jg0)) {
            return super.draadjrbmk(event);
        }
        hl hlVar = this.f59628gxszxtbevo.f57485iobyxmoadg;
        pv pvVar = hlVar instanceof pv ? (pv) hlVar : null;
        String str = pvVar != null ? pvVar.f58119iobyxmoadg : null;
        hi action = hi.LC_STATUS_ERROR_VIEW_APPEARED;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        ow event2 = new ow(action, we0.STATUS_VIEW, mp.LC, str != null ? hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Error", str)) : null, null, null, null, 112);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event2, "event");
        this.f56062iobyxmoadg.iobyxmoadg(event2);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
