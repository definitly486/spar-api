package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class o30 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ef0 f57885iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f57886zoijcleaow;

    public o30(pr prVar, ef0 ef0Var, fg.iobyxmoadg iobyxmoadgVar) {
        this.f57885iobyxmoadg = ef0Var;
        this.f57886zoijcleaow = iobyxmoadgVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        ll sPayRepository = (ll) this.f57885iobyxmoadg.get();
        jlmebxxoox sPayDataContract = (jlmebxxoox) this.f57886zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        return (u) ag.dxjokdxxww.eablkybsjg(new u(sPayRepository, sPayDataContract));
    }
}
