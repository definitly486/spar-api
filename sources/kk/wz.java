package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class wz implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final fg.iobyxmoadg f59219eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ef0 f59220iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final fg.iobyxmoadg f59221ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final fg.iobyxmoadg f59222wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final bi f59223zoijcleaow;

    public wz(pr prVar, ef0 ef0Var, bi biVar, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3) {
        this.f59220iobyxmoadg = ef0Var;
        this.f59223zoijcleaow = biVar;
        this.f59221ppxfxbqfkf = iobyxmoadgVar;
        this.f59222wkgbmnqykc = iobyxmoadgVar2;
        this.f59219eablkybsjg = iobyxmoadgVar3;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        ll sPayRepository = (ll) this.f59220iobyxmoadg.get();
        sk commonRepository = (sk) this.f59223zoijcleaow.get();
        pc sPaySdkReducer = (pc) this.f59221ppxfxbqfkf.get();
        wc0 featuresHandler = (wc0) this.f59222wkgbmnqykc.get();
        m60 sPaySdkConfigRepository = (m60) this.f59219eablkybsjg.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(commonRepository, "commonRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        return (x50) ag.dxjokdxxww.eablkybsjg(new x50(sPayRepository, commonRepository, sPaySdkReducer, featuresHandler, sPaySdkConfigRepository));
    }
}
