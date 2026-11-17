package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class v50 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final fg.iobyxmoadg f58953eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final nx f58954gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ef0 f58955iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final fg.iobyxmoadg f58956ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final fg.iobyxmoadg f58957wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f58958zoijcleaow;

    public v50(pr prVar, ef0 ef0Var, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4, nx nxVar) {
        this.f58955iobyxmoadg = ef0Var;
        this.f58958zoijcleaow = iobyxmoadgVar;
        this.f58956ppxfxbqfkf = iobyxmoadgVar2;
        this.f58957wkgbmnqykc = iobyxmoadgVar3;
        this.f58953eablkybsjg = iobyxmoadgVar4;
        this.f58954gxszxtbevo = nxVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        ll sPayRepository = (ll) this.f58955iobyxmoadg.get();
        pc sPaySdkReducer = (pc) this.f58958zoijcleaow.get();
        jlmebxxoox sPayDataContract = (jlmebxxoox) this.f58956ppxfxbqfkf.get();
        xf sPayStorage = (xf) this.f58957wkgbmnqykc.get();
        wc0 featuresHandler = (wc0) this.f58953eablkybsjg.get();
        c80 fraudMonResultHandler = (c80) this.f58954gxszxtbevo.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonResultHandler, "fraudMonResultHandler");
        return (o8) ag.dxjokdxxww.eablkybsjg(new o8(sPayRepository, sPayDataContract, sPayStorage, sPaySdkReducer, featuresHandler, fraudMonResultHandler));
    }
}
