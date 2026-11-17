package kk;

import npi.spay.Mn;

/* JADX INFO: loaded from: classes3.dex */
public final class pu extends u0 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ho f58117eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final pc f58118wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer, xf sPayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        this.f58118wkgbmnqykc = sPaySdkReducer;
        ij ijVar = (ij) sPayStorage;
        if (!(ijVar.iobyxmoadg().f57485iobyxmoadg instanceof kcexrzcfyt)) {
            throw new Mn(ijVar.iobyxmoadg().toString());
        }
        hl hlVar = ijVar.iobyxmoadg().f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.PaymentTokenResult");
        wp wpVar = ((kcexrzcfyt) hlVar).f57290iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wpVar, "null cannot be cast to non-null type spay.sdk.domain.PaymentTokenStatus.ErrorWithBnplEnabled");
        this.f58117eablkybsjg = ((nn) wpVar).f57835zoijcleaow;
    }
}
