package sh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc extends zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(cdpycssgdh javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    private final List zynmafqrjb(ni.lqeggnwhkg lqeggnwhkgVar) {
        if (!(lqeggnwhkgVar instanceof ni.zoijcleaow)) {
            return lqeggnwhkgVar instanceof ni.gtknphoqwx ? hg.jyumaefscl.eablkybsjg(((ni.gtknphoqwx) lqeggnwhkgVar).ppxfxbqfkf().wkgbmnqykc()) : hg.jyumaefscl.wflxmlrfwp();
        }
        Iterable iterable = (Iterable) ((ni.zoijcleaow) lqeggnwhkgVar).zoijcleaow();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            hg.jyumaefscl.istkbnxepw(arrayList, zynmafqrjb((ni.lqeggnwhkg) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sh.zoijcleaow
    /* JADX INFO: renamed from: cqumvgiudr, reason: merged with bridge method [inline-methods] */
    public Iterable ppxfxbqfkf(kh.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        Map mapZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapZoijcleaow.entrySet()) {
            hg.jyumaefscl.istkbnxepw(arrayList, (!z13 || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg((ii.gxszxtbevo) entry.getKey(), ylkuphrtab.f106660ppxfxbqfkf)) ? zynmafqrjb((ni.lqeggnwhkg) entry.getValue()) : hg.jyumaefscl.wflxmlrfwp());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sh.zoijcleaow
    /* JADX INFO: renamed from: esjtqupxsv, reason: merged with bridge method [inline-methods] */
    public ii.ppxfxbqfkf gtknphoqwx(kh.ppxfxbqfkf ppxfxbqfkfVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        return ppxfxbqfkfVar.gxszxtbevo();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sh.zoijcleaow
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public Object draadjrbmk(kh.ppxfxbqfkf ppxfxbqfkfVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        jh.eablkybsjg eablkybsjgVarDraadjrbmk = pi.eablkybsjg.draadjrbmk(ppxfxbqfkfVar);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(eablkybsjgVarDraadjrbmk);
        return eablkybsjgVarDraadjrbmk;
    }

    @Override // sh.zoijcleaow
    public boolean ojitshcjhn() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sh.zoijcleaow
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public Iterable wflxmlrfwp(kh.ppxfxbqfkf ppxfxbqfkfVar) {
        kh.nufgyqmvbu annotations;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        jh.eablkybsjg eablkybsjgVarDraadjrbmk = pi.eablkybsjg.draadjrbmk(ppxfxbqfkfVar);
        return (eablkybsjgVarDraadjrbmk == null || (annotations = eablkybsjgVarDraadjrbmk.getAnnotations()) == null) ? hg.jyumaefscl.wflxmlrfwp() : annotations;
    }
}
