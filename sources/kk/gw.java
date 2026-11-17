package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class gw implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final fg.iobyxmoadg f56783iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final fg.iobyxmoadg f56784ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final fg.iobyxmoadg f56785wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f56786zoijcleaow;

    public gw(pr prVar, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4) {
        this.f56783iobyxmoadg = iobyxmoadgVar;
        this.f56786zoijcleaow = iobyxmoadgVar2;
        this.f56784ppxfxbqfkf = iobyxmoadgVar3;
        this.f56785wkgbmnqykc = iobyxmoadgVar4;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        wc0 featuresHandler = (wc0) this.f56783iobyxmoadg.get();
        jlmebxxoox sPayDataContract = (jlmebxxoox) this.f56786zoijcleaow.get();
        xf sPayStorage = (xf) this.f56784ppxfxbqfkf.get();
        ka sPaySdkMerchantOptionsRepository = (ka) this.f56785wkgbmnqykc.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        return (s20) ag.dxjokdxxww.eablkybsjg(new s20(featuresHandler, sPayDataContract, sPayStorage, sPaySdkMerchantOptionsRepository));
    }
}
