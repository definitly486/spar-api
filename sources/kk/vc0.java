package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class vc0 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ef0 f58987iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f58988zoijcleaow;

    public vc0(pr prVar, ef0 ef0Var, fg.iobyxmoadg iobyxmoadgVar) {
        this.f58987iobyxmoadg = ef0Var;
        this.f58988zoijcleaow = iobyxmoadgVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        ll sPayRepository = (ll) this.f58987iobyxmoadg.get();
        pc sPaySdkReducer = (pc) this.f58988zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        return (c) ag.dxjokdxxww.eablkybsjg(new c(sPayRepository, sPaySdkReducer));
    }
}
