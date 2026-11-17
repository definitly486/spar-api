package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class o8 extends ui {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final wc0 f57905eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final c80 f57906gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ll f57907iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public int f57908lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final xf f57909ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final pc f57910wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final jlmebxxoox f57911zoijcleaow;

    public o8(ll sPayRepository, jlmebxxoox sPayDataContract, xf sPayStorage, pc sPaySdkReducer, wc0 featuresHandler, c80 fraudMonResultHandler) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonResultHandler, "fraudMonResultHandler");
        this.f57907iobyxmoadg = sPayRepository;
        this.f57911zoijcleaow = sPayDataContract;
        this.f57909ppxfxbqfkf = sPayStorage;
        this.f57910wkgbmnqykc = sPaySdkReducer;
        this.f57905eablkybsjg = featuresHandler;
        this.f57906gxszxtbevo = fraudMonResultHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8)) {
            return false;
        }
        o8 o8Var = (o8) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57907iobyxmoadg, o8Var.f57907iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57911zoijcleaow, o8Var.f57911zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57909ppxfxbqfkf, o8Var.f57909ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57910wkgbmnqykc, o8Var.f57910wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57905eablkybsjg, o8Var.f57905eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57906gxszxtbevo, o8Var.f57906gxszxtbevo);
    }

    public final int hashCode() {
        return this.f57906gxszxtbevo.hashCode() + ((this.f57905eablkybsjg.hashCode() + ((this.f57910wkgbmnqykc.hashCode() + ((this.f57909ppxfxbqfkf.hashCode() + ((this.f57911zoijcleaow.hashCode() + (this.f57907iobyxmoadg.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // kk.ui
    public final Object iobyxmoadg(Object obj, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(pkzmftpjixVar.plus(pj.krqnebusok.zoijcleaow(null, 1, null)), new z2(this, (r9) obj, pkzmftpjixVar, null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final String toString() {
        return "GetPayOnlineUseCase(sPayRepository=" + this.f57907iobyxmoadg + ", sPayDataContract=" + this.f57911zoijcleaow + ", sPayStorage=" + this.f57909ppxfxbqfkf + ", sPaySdkReducer=" + this.f57910wkgbmnqykc + ", featuresHandler=" + this.f57905eablkybsjg + ", fraudMonResultHandler=" + this.f57906gxszxtbevo + ")";
    }
}
