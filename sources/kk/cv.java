package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class cv implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ef0 f56192iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f56193zoijcleaow;

    public cv(pr prVar, ef0 ef0Var, fg.iobyxmoadg iobyxmoadgVar) {
        this.f56192iobyxmoadg = ef0Var;
        this.f56193zoijcleaow = iobyxmoadgVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        ll sPayRepository = (ll) this.f56192iobyxmoadg.get();
        pc sPaySdkReducer = (pc) this.f56193zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        return (a4) ag.dxjokdxxww.eablkybsjg(new a4(sPayRepository, sPaySdkReducer));
    }
}
