package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class bv implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final r60 f56060iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final bi f56061zoijcleaow;

    public bv(xt xtVar, r60 r60Var, bi biVar) {
        this.f56060iobyxmoadg = r60Var;
        this.f56061zoijcleaow = biVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        fj resourceManager = (fj) this.f56060iobyxmoadg.get();
        sk commonRepository = (sk) this.f56061zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourceManager, "resourceManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(commonRepository, "commonRepository");
        return (qy) ag.dxjokdxxww.eablkybsjg(new b10(resourceManager, commonRepository));
    }
}
