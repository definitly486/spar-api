package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class x60 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ef0 f59262iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f59263zoijcleaow;

    public x60(pr prVar, ef0 ef0Var, fg.iobyxmoadg iobyxmoadgVar) {
        this.f59262iobyxmoadg = ef0Var;
        this.f59263zoijcleaow = iobyxmoadgVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        ll sPayRepository = (ll) this.f59262iobyxmoadg.get();
        jlmebxxoox sPayDataContract = (jlmebxxoox) this.f59263zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        return (cd) ag.dxjokdxxww.eablkybsjg(new cd(sPayRepository, sPayDataContract));
    }
}
