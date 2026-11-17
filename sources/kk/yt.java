package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class yt implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ef0 f59480iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f59481zoijcleaow;

    public yt(pr prVar, ef0 ef0Var, fg.iobyxmoadg iobyxmoadgVar) {
        this.f59480iobyxmoadg = ef0Var;
        this.f59481zoijcleaow = iobyxmoadgVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        ll sPayRepository = (ll) this.f59480iobyxmoadg.get();
        pc sPaySdkReducer = (pc) this.f59481zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        return (q40) ag.dxjokdxxww.eablkybsjg(new q40(sPayRepository, sPaySdkReducer));
    }
}
