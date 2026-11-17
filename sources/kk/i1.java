package kk;

import spay.sdk.domain.model.PayStrategy;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends u0 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final sj.zynmafqrjb f56977eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final PayStrategy f56978gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final pc f56979wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        this.f56979wkgbmnqykc = sPaySdkReducer;
        this.f56977eablkybsjg = sj.kegysxyocb.iobyxmoadg(Boolean.TRUE);
        this.f56978gxszxtbevo = (PayStrategy) ((auzgnhcxok) sPayDataContract).f55853iozdgvuglv.getValue();
    }
}
