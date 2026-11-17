package li;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jh.cdpycssgdh;
import jh.hkdspvbjdz;
import jh.uwvvkdfqfp;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f62600iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: li.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1271iobyxmoadg implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(pi.eablkybsjg.ojitshcjhn((jh.eablkybsjg) obj).zoijcleaow(), pi.eablkybsjg.ojitshcjhn((jh.eablkybsjg) obj2).zoijcleaow());
        }
    }

    private iobyxmoadg() {
    }

    private static final void zoijcleaow(jh.eablkybsjg eablkybsjgVar, LinkedHashSet linkedHashSet, si.gtknphoqwx gtknphoqwxVar, boolean z13) {
        for (jh.wflxmlrfwp wflxmlrfwpVar : si.agtfadlqog.iobyxmoadg.iobyxmoadg(gtknphoqwxVar, si.wkgbmnqykc.f106759zdlpuopuiu, null, 2, null)) {
            if (wflxmlrfwpVar instanceof jh.eablkybsjg) {
                jh.eablkybsjg eablkybsjgVarZdlpuopuiu = (jh.eablkybsjg) wflxmlrfwpVar;
                if (eablkybsjgVarZdlpuopuiu.czzsidtyhn()) {
                    ii.gxszxtbevo name = eablkybsjgVarZdlpuopuiu.getName();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                    jh.nufgyqmvbu nufgyqmvbuVarEablkybsjg = gtknphoqwxVar.eablkybsjg(name, rh.wkgbmnqykc.WHEN_GET_ALL_DESCRIPTORS);
                    eablkybsjgVarZdlpuopuiu = nufgyqmvbuVarEablkybsjg instanceof jh.eablkybsjg ? (jh.eablkybsjg) nufgyqmvbuVarEablkybsjg : nufgyqmvbuVarEablkybsjg instanceof uwvvkdfqfp ? ((uwvvkdfqfp) nufgyqmvbuVarEablkybsjg).zdlpuopuiu() : null;
                }
                if (eablkybsjgVarZdlpuopuiu != null) {
                    if (dxjokdxxww.lereixgezr(eablkybsjgVarZdlpuopuiu, eablkybsjgVar)) {
                        linkedHashSet.add(eablkybsjgVarZdlpuopuiu);
                    }
                    if (z13) {
                        si.gtknphoqwx gtknphoqwxVarKegysxyocb = eablkybsjgVarZdlpuopuiu.kegysxyocb();
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarKegysxyocb, "getUnsubstitutedInnerClassesScope(...)");
                        zoijcleaow(eablkybsjgVar, linkedHashSet, gtknphoqwxVarKegysxyocb, z13);
                    }
                }
            }
        }
    }

    public Collection iobyxmoadg(jh.eablkybsjg sealedClass, boolean z13) {
        Object next;
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sealedClass, "sealedClass");
        if (sealedClass.vdvldrhtss() != cdpycssgdh.SEALED) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z13) {
            Iterator it = pi.eablkybsjg.yggfygwlhe(sealedClass).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((jh.wflxmlrfwp) next) instanceof hkdspvbjdz));
            wflxmlrfwpVarZoijcleaow = (jh.wflxmlrfwp) next;
        } else {
            wflxmlrfwpVarZoijcleaow = sealedClass.zoijcleaow();
        }
        if (wflxmlrfwpVarZoijcleaow instanceof hkdspvbjdz) {
            zoijcleaow(sealedClass, linkedHashSet, ((hkdspvbjdz) wflxmlrfwpVarZoijcleaow).agtfadlqog(), z13);
        }
        si.gtknphoqwx gtknphoqwxVarKegysxyocb = sealedClass.kegysxyocb();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarKegysxyocb, "getUnsubstitutedInnerClassesScope(...)");
        zoijcleaow(sealedClass, linkedHashSet, gtknphoqwxVarKegysxyocb, true);
        return hg.jyumaefscl.d(linkedHashSet, new C1271iobyxmoadg());
    }
}
