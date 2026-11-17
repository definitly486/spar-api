package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ydmasvzmpa implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final u70 f59428eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final hk f59429iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final fg.iobyxmoadg f59430ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final fg.iobyxmoadg f59431wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f59432zoijcleaow;

    public ydmasvzmpa(jpowsppfya jpowsppfyaVar, hk hkVar, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, u70 u70Var) {
        this.f59429iobyxmoadg = hkVar;
        this.f59432zoijcleaow = iobyxmoadgVar;
        this.f59430ppxfxbqfkf = iobyxmoadgVar2;
        this.f59431wkgbmnqykc = iobyxmoadgVar3;
        this.f59428eablkybsjg = u70Var;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        fj resourceManager = (fj) this.f59429iobyxmoadg.get();
        u80 setCookieHandler = (u80) this.f59432zoijcleaow.get();
        jlmebxxoox sPayDataContract = (jlmebxxoox) this.f59430ppxfxbqfkf.get();
        li0 xPodStickyHandler = (li0) this.f59431wkgbmnqykc.get();
        tc userIdManager = (tc) this.f59428eablkybsjg.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourceManager, "resourceManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setCookieHandler, "setCookieHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(xPodStickyHandler, "xPodStickyHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userIdManager, "userIdManager");
        return (xy) ag.dxjokdxxww.eablkybsjg(new c00(resourceManager, setCookieHandler, sPayDataContract, xPodStickyHandler, userIdManager));
    }
}
