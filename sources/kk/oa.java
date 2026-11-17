package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class oa implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final fg.iobyxmoadg f57915iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f57916zoijcleaow;

    public oa(i9 i9Var, fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        this.f57915iobyxmoadg = iobyxmoadgVar;
        this.f57916zoijcleaow = iobyxmoadgVar2;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        f80 appTokenStoreSP = (f80) this.f57915iobyxmoadg.get();
        c70 appTokenRepository = (c70) this.f57916zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appTokenStoreSP, "appTokenStoreSP");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appTokenRepository, "appTokenRepository");
        return (zz) ag.dxjokdxxww.eablkybsjg(new zz(appTokenStoreSP, appTokenRepository));
    }
}
