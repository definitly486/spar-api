package kk;

import npi.spay.Bn;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class j4 extends u0 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final sj.wypolnanlu f57137eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final sj.wypolnanlu f57138wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer, m60 sPaySdkConfigRepository) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f57138wkgbmnqykc = sj.dxjokdxxww.zoijcleaow(sj.kegysxyocb.iobyxmoadg(new hg(Boolean.FALSE)));
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(null);
        this.f57137eablkybsjg = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
        SPaySdkConfig sPaySdkConfig = ((s80) sPaySdkConfigRepository).f58531ppxfxbqfkf;
        if (sPaySdkConfig == null) {
            throw Bn.f70538zdlpuopuiu;
        }
        zynmafqrjbVarIobyxmoadg.iobyxmoadg(sPaySdkConfig.getLocalization().getPayError());
    }
}
