package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class n70 extends ui {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ll f57742iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final pc f57743zoijcleaow;

    public n70(ll sPayRepository, xf sPayStorage, pc sPaySdkReducer, jlmebxxoox sPayDataContract) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        this.f57742iobyxmoadg = sPayRepository;
        this.f57743zoijcleaow = sPaySdkReducer;
    }

    @Override // kk.ui
    public final Object iobyxmoadg(Object obj, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(pkzmftpjixVar.plus(pj.krqnebusok.zoijcleaow(null, 1, null)), new k60(this, (q80) obj, pkzmftpjixVar, null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
