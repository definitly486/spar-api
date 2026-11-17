package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ha0 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final fg.iobyxmoadg f56884eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final fg.iobyxmoadg f56885gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ef0 f56886iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final fg.iobyxmoadg f56887ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final fg.iobyxmoadg f56888wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final bi f56889zoijcleaow;

    public ha0(pr prVar, ef0 ef0Var, bi biVar, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4) {
        this.f56886iobyxmoadg = ef0Var;
        this.f56889zoijcleaow = biVar;
        this.f56887ppxfxbqfkf = iobyxmoadgVar;
        this.f56888wkgbmnqykc = iobyxmoadgVar2;
        this.f56884eablkybsjg = iobyxmoadgVar3;
        this.f56885gxszxtbevo = iobyxmoadgVar4;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        ll sPayRepository = (ll) this.f56886iobyxmoadg.get();
        sk commonRepository = (sk) this.f56889zoijcleaow.get();
        pc sPaySdkReducer = (pc) this.f56887ppxfxbqfkf.get();
        jlmebxxoox sPayDataContract = (jlmebxxoox) this.f56888wkgbmnqykc.get();
        wc0 featuresHandler = (wc0) this.f56884eablkybsjg.get();
        m60 sPaySdkConfigRepository = (m60) this.f56885gxszxtbevo.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(commonRepository, "commonRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        return (g10) ag.dxjokdxxww.eablkybsjg(new g10(sPayRepository, commonRepository, sPaySdkReducer, sPayDataContract, featuresHandler, sPaySdkConfigRepository));
    }
}
