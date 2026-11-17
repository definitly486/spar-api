package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ry implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ef0 f58482iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final fg.iobyxmoadg f58483ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final fg.iobyxmoadg f58484wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f58485zoijcleaow;

    public ry(pr prVar, ef0 ef0Var, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3) {
        this.f58482iobyxmoadg = ef0Var;
        this.f58485zoijcleaow = iobyxmoadgVar;
        this.f58483ppxfxbqfkf = iobyxmoadgVar2;
        this.f58484wkgbmnqykc = iobyxmoadgVar3;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        ll sPayRepository = (ll) this.f58482iobyxmoadg.get();
        pc sPaySdkReducer = (pc) this.f58485zoijcleaow.get();
        de0 authHandler = (de0) this.f58483ppxfxbqfkf.get();
        u80 setCookieHandler = (u80) this.f58484wkgbmnqykc.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authHandler, "authHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setCookieHandler, "setCookieHandler");
        return (kw) ag.dxjokdxxww.eablkybsjg(new kw(sPayRepository, sPaySdkReducer, authHandler, setCookieHandler));
    }
}
