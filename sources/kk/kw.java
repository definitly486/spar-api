package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class kw extends ui {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ll f57357iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final de0 f57358ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final u80 f57359wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final pc f57360zoijcleaow;

    public kw(ll sPayRepository, pc sPaySdkReducer, de0 authHandler, u80 setCookieHandler) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authHandler, "authHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setCookieHandler, "setCookieHandler");
        this.f57357iobyxmoadg = sPayRepository;
        this.f57360zoijcleaow = sPaySdkReducer;
        this.f57358ppxfxbqfkf = authHandler;
        this.f57359wkgbmnqykc = setCookieHandler;
    }

    @Override // kk.ui
    public final Object iobyxmoadg(Object obj, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        ((ve) this.f57360zoijcleaow).zoijcleaow(new hj(new rh()));
        Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(pkzmftpjixVar, new gv(this, (rx) obj, pkzmftpjixVar, null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
