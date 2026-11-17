package sh;

import java.util.Iterator;
import jh.nuxfzjnpeb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ntlheqmsrt {
    public static final kh.ppxfxbqfkf iobyxmoadg(vh.gtknphoqwx c13, zh.istkbnxepw wildcardType) {
        Object next;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wildcardType, "wildcardType");
        if (wildcardType.cqumvgiudr() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator it = new vh.lqeggnwhkg(c13, wildcardType, false, 4, null).iterator();
        while (it.hasNext()) {
            next = it.next();
            kh.ppxfxbqfkf ppxfxbqfkfVar = (kh.ppxfxbqfkf) next;
            for (ii.ppxfxbqfkf ppxfxbqfkfVar2 : zynmafqrjb.gxszxtbevo()) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar.gxszxtbevo(), ppxfxbqfkfVar2)) {
                    return (kh.ppxfxbqfkf) next;
                }
            }
        }
        next = null;
        return (kh.ppxfxbqfkf) next;
    }

    public static final boolean ppxfxbqfkf(cdpycssgdh javaTypeEnhancementState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.ppxfxbqfkf().invoke(zynmafqrjb.eablkybsjg()) == dsvhmnatus.STRICT;
    }

    public static final jh.yggfygwlhe wkgbmnqykc(nuxfzjnpeb nuxfzjnpebVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nuxfzjnpebVar, "<this>");
        jh.yggfygwlhe yggfygwlheVarLqeggnwhkg = esjtqupxsv.lqeggnwhkg(nuxfzjnpebVar);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(yggfygwlheVarLqeggnwhkg, "toDescriptorVisibility(...)");
        return yggfygwlheVarLqeggnwhkg;
    }

    public static final boolean zoijcleaow(jh.zoijcleaow memberDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof jh.lereixgezr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(memberDescriptor.pmvmpeiblj(uh.eablkybsjg.f113560vipkmwdibw), Boolean.TRUE);
    }
}
