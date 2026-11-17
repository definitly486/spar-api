package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class bi implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final kv f56011eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final pa0 f56012iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final pi f56013ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final fg.iobyxmoadg f56014wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final uk f56015zoijcleaow;

    public bi(uf ufVar, pa0 pa0Var, uk ukVar, pi piVar, fg.iobyxmoadg iobyxmoadgVar, kv kvVar) {
        this.f56012iobyxmoadg = pa0Var;
        this.f56015zoijcleaow = ukVar;
        this.f56013ppxfxbqfkf = piVar;
        this.f56014wkgbmnqykc = iobyxmoadgVar;
        this.f56011eablkybsjg = kvVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        k0 sdkFlowSPayApi = (k0) this.f56012iobyxmoadg.get();
        zc networkErrorHandler = (zc) this.f56015zoijcleaow.get();
        zc apiResponseErrorHandler = (zc) this.f56013ppxfxbqfkf.get();
        jlmebxxoox sPayDataContract = (jlmebxxoox) this.f56014wkgbmnqykc.get();
        vx networkErrorHandlerImpl = new vx();
        lw apiResponseErrorHandlerImpl = new lw();
        bt metricFacade = (bt) this.f56011eablkybsjg.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sdkFlowSPayApi, "sdkFlowSPayApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkErrorHandler, "networkErrorHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiResponseErrorHandler, "apiResponseErrorHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkErrorHandlerImpl, "networkErrorHandlerImpl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiResponseErrorHandlerImpl, "apiResponseErrorHandlerImpl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        return (sk) ag.dxjokdxxww.eablkybsjg(new bo(sdkFlowSPayApi, networkErrorHandler, metricFacade, apiResponseErrorHandler, sPayDataContract, networkErrorHandlerImpl, apiResponseErrorHandlerImpl));
    }
}
