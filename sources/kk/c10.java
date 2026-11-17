package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class c10 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final m40 f56077iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final fg.iobyxmoadg f56078zoijcleaow;

    public c10(pr prVar, m40 m40Var, fg.iobyxmoadg iobyxmoadgVar) {
        this.f56077iobyxmoadg = m40Var;
        this.f56078zoijcleaow = iobyxmoadgVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        gr fingerprintInteractor = (gr) this.f56077iobyxmoadg.get();
        jlmebxxoox sPayDataContract = (jlmebxxoox) this.f56078zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fingerprintInteractor, "fingerprintInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        return (d80) ag.dxjokdxxww.eablkybsjg(new d80(fingerprintInteractor, sPayDataContract));
    }
}
