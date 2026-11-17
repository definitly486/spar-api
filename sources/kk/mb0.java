package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class mb0 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final fg.iobyxmoadg f57622iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final fg.iobyxmoadg f57623ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final fg.iobyxmoadg f57624wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f57625zoijcleaow;

    public mb0(pr prVar, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3, fg.iobyxmoadg iobyxmoadgVar4) {
        this.f57622iobyxmoadg = iobyxmoadgVar;
        this.f57625zoijcleaow = iobyxmoadgVar2;
        this.f57623ppxfxbqfkf = iobyxmoadgVar3;
        this.f57624wkgbmnqykc = iobyxmoadgVar4;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        wc0 featuresHandler = (wc0) this.f57622iobyxmoadg.get();
        jlmebxxoox sPayDataContract = (jlmebxxoox) this.f57625zoijcleaow.get();
        xf sPayStorage = (xf) this.f57623ppxfxbqfkf.get();
        ka sPaySdkMerchantOptionsRepository = (ka) this.f57624wkgbmnqykc.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        return (za) ag.dxjokdxxww.eablkybsjg(new za(featuresHandler, sPayDataContract, sPayStorage, sPaySdkMerchantOptionsRepository));
    }
}
