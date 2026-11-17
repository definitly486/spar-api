package vh;

import hg.jyumaefscl;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg implements kh.nufgyqmvbu {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final yi.nufgyqmvbu f116756iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f116757jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zh.wkgbmnqykc f116758yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final gtknphoqwx f116759zdlpuopuiu;

    public lqeggnwhkg(gtknphoqwx c13, zh.wkgbmnqykc annotationOwner, boolean z13) {
        zdlpuopuiu.btonecajqb(c13, "c");
        zdlpuopuiu.btonecajqb(annotationOwner, "annotationOwner");
        this.f116759zdlpuopuiu = c13;
        this.f116758yggfygwlhe = annotationOwner;
        this.f116757jyumaefscl = z13;
        this.f116756iwizpuwonk = c13.iobyxmoadg().yggfygwlhe().eablkybsjg(new gxszxtbevo(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kh.ppxfxbqfkf zoijcleaow(lqeggnwhkg lqeggnwhkgVar, zh.iobyxmoadg annotation) {
        zdlpuopuiu.btonecajqb(annotation, "annotation");
        return th.wkgbmnqykc.f110516iobyxmoadg.eablkybsjg(annotation, lqeggnwhkgVar.f116759zdlpuopuiu, lqeggnwhkgVar.f116757jyumaefscl);
    }

    @Override // kh.nufgyqmvbu
    public boolean isEmpty() {
        return this.f116758yggfygwlhe.getAnnotations().isEmpty() && !this.f116758yggfygwlhe.cdpycssgdh();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return lj.wflxmlrfwp.yadqdtsiqt(lj.wflxmlrfwp.tzroggbefp(lj.wflxmlrfwp.dsvhmnatus(jyumaefscl.ikoacuggdj(this.f116758yggfygwlhe.getAnnotations()), this.f116756iwizpuwonk), th.wkgbmnqykc.f110516iobyxmoadg.iobyxmoadg(gh.ojitshcjhn.iobyxmoadg.f37288esjtqupxsv, this.f116758yggfygwlhe, this.f116759zdlpuopuiu))).iterator();
    }

    @Override // kh.nufgyqmvbu
    public kh.ppxfxbqfkf lqeggnwhkg(ii.ppxfxbqfkf fqName) {
        kh.ppxfxbqfkf ppxfxbqfkfVar;
        zdlpuopuiu.btonecajqb(fqName, "fqName");
        zh.iobyxmoadg iobyxmoadgVarLqeggnwhkg = this.f116758yggfygwlhe.lqeggnwhkg(fqName);
        return (iobyxmoadgVarLqeggnwhkg == null || (ppxfxbqfkfVar = (kh.ppxfxbqfkf) this.f116756iwizpuwonk.invoke(iobyxmoadgVarLqeggnwhkg)) == null) ? th.wkgbmnqykc.f110516iobyxmoadg.iobyxmoadg(fqName, this.f116758yggfygwlhe, this.f116759zdlpuopuiu) : ppxfxbqfkfVar;
    }

    @Override // kh.nufgyqmvbu
    public boolean wizcaqwiak(ii.ppxfxbqfkf ppxfxbqfkfVar) {
        return kh.nufgyqmvbu.zoijcleaow.zoijcleaow(this, ppxfxbqfkfVar);
    }

    public /* synthetic */ lqeggnwhkg(gtknphoqwx gtknphoqwxVar, zh.wkgbmnqykc wkgbmnqykcVar, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this(gtknphoqwxVar, wkgbmnqykcVar, (i13 & 4) != 0 ? false : z13);
    }
}
