package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class c60 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final fg.iobyxmoadg f56107iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f56108zoijcleaow;

    public c60(r20 r20Var, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        this.f56107iobyxmoadg = iobyxmoadgVar;
        this.f56108zoijcleaow = iobyxmoadgVar2;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        nw loggingContract = (nw) this.f56107iobyxmoadg.get();
        ka sPaySdkMerchantOptionsRepository = (ka) this.f56108zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loggingContract, "loggingContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        return (zk.iobyxmoadg) ag.dxjokdxxww.eablkybsjg(new zk.iobyxmoadg(new be(loggingContract, sPaySdkMerchantOptionsRepository)).eablkybsjg(zk.iobyxmoadg.EnumC3324iobyxmoadg.BODY));
    }
}
