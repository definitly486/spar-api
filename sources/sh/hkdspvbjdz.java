package sh;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hkdspvbjdz implements hcddaimhww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yi.gxszxtbevo f106537ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yi.nufgyqmvbu f106538wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f106539zoijcleaow;

    public hkdspvbjdz(Map states) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(states, "states");
        this.f106539zoijcleaow = states;
        yi.gxszxtbevo gxszxtbevoVar = new yi.gxszxtbevo("Java nullability annotation states");
        this.f106537ppxfxbqfkf = gxszxtbevoVar;
        yi.nufgyqmvbu nufgyqmvbuVarEablkybsjg = gxszxtbevoVar.eablkybsjg(new jpowsppfya(this));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(nufgyqmvbuVarEablkybsjg, "createMemoizedFunctionWithNullableValues(...)");
        this.f106538wkgbmnqykc = nufgyqmvbuVarEablkybsjg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ppxfxbqfkf(hkdspvbjdz hkdspvbjdzVar, ii.ppxfxbqfkf ppxfxbqfkfVar) {
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ppxfxbqfkfVar);
        return ii.eablkybsjg.iobyxmoadg(ppxfxbqfkfVar, hkdspvbjdzVar.f106539zoijcleaow);
    }

    @Override // sh.hcddaimhww
    public Object iobyxmoadg(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        return this.f106538wkgbmnqykc.invoke(fqName);
    }
}
