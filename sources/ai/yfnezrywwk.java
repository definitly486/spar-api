package ai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import zi.hszhottldk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yfnezrywwk {
    private static final Object eablkybsjg(Set set, Object obj, Object obj2, Object obj3, boolean z13) {
        Set setR;
        Object obj4;
        if (!z13) {
            if (obj3 != null && (setR = hg.jyumaefscl.r(hg.ikoacuggdj.wflxmlrfwp(set, obj3))) != null) {
                set = setR;
            }
            return hg.jyumaefscl.eslsurpljm(set);
        }
        if (set.contains(obj)) {
            obj4 = obj;
        } else {
            obj4 = set.contains(obj2) ? obj2 : null;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj4, obj) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj3, obj2)) {
            return null;
        }
        return obj3 == null ? obj4 : obj3;
    }

    public static final nufgyqmvbu iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, Collection superQualifiers, boolean z13, boolean z14, boolean z15) {
        gtknphoqwx gtknphoqwxVarWkgbmnqykc;
        boolean z16;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(superQualifiers, "superQualifiers");
        Collection collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gtknphoqwx gtknphoqwxVarZoijcleaow = zoijcleaow((nufgyqmvbu) it.next());
            if (gtknphoqwxVarZoijcleaow != null) {
                arrayList.add(gtknphoqwxVarZoijcleaow);
            }
        }
        gtknphoqwx gtknphoqwxVarWkgbmnqykc2 = wkgbmnqykc(hg.jyumaefscl.r(arrayList), zoijcleaow(nufgyqmvbuVar), z13);
        if (gtknphoqwxVarWkgbmnqykc2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                gtknphoqwx gtknphoqwxVarGxszxtbevo = ((nufgyqmvbu) it2.next()).gxszxtbevo();
                if (gtknphoqwxVarGxszxtbevo != null) {
                    arrayList2.add(gtknphoqwxVarGxszxtbevo);
                }
            }
            gtknphoqwxVarWkgbmnqykc = wkgbmnqykc(hg.jyumaefscl.r(arrayList2), nufgyqmvbuVar.gxszxtbevo(), z13);
        } else {
            gtknphoqwxVarWkgbmnqykc = gtknphoqwxVarWkgbmnqykc2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = collection.iterator();
        while (it3.hasNext()) {
            dxjokdxxww dxjokdxxwwVarEablkybsjg = ((nufgyqmvbu) it3.next()).eablkybsjg();
            if (dxjokdxxwwVarEablkybsjg != null) {
                arrayList3.add(dxjokdxxwwVarEablkybsjg);
            }
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) eablkybsjg(hg.jyumaefscl.r(arrayList3), dxjokdxxww.MUTABLE, dxjokdxxww.READ_ONLY, nufgyqmvbuVar.eablkybsjg(), z13);
        gtknphoqwx gtknphoqwxVar = null;
        if (gtknphoqwxVarWkgbmnqykc != null && !z15 && (!z14 || gtknphoqwxVarWkgbmnqykc != gtknphoqwx.NULLABLE)) {
            gtknphoqwxVar = gtknphoqwxVarWkgbmnqykc;
        }
        boolean z17 = false;
        if (gtknphoqwxVar != gtknphoqwx.NOT_NULL) {
            z16 = false;
        } else {
            if (!nufgyqmvbuVar.wkgbmnqykc()) {
                if (!collection.isEmpty()) {
                    Iterator it4 = collection.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((nufgyqmvbu) it4.next()).wkgbmnqykc()) {
                            }
                        }
                    }
                }
                z16 = false;
            }
            z16 = true;
        }
        if (gtknphoqwxVar != null && gtknphoqwxVarWkgbmnqykc2 != gtknphoqwxVarWkgbmnqykc) {
            z17 = true;
        }
        return new nufgyqmvbu(gtknphoqwxVar, dxjokdxxwwVar, z16, z17);
    }

    public static final boolean ppxfxbqfkf(hszhottldk hszhottldkVar, dj.dxjokdxxww type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hszhottldkVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        ii.ppxfxbqfkf ENHANCED_NULLABILITY_ANNOTATION = sh.ylkuphrtab.f106654jyumaefscl;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return hszhottldkVar.roivzttewh(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    private static final gtknphoqwx wkgbmnqykc(Set set, gtknphoqwx gtknphoqwxVar, boolean z13) {
        gtknphoqwx gtknphoqwxVar2 = gtknphoqwx.FORCE_FLEXIBILITY;
        return gtknphoqwxVar == gtknphoqwxVar2 ? gtknphoqwxVar2 : (gtknphoqwx) eablkybsjg(set, gtknphoqwx.NOT_NULL, gtknphoqwx.NULLABLE, gtknphoqwxVar, z13);
    }

    private static final gtknphoqwx zoijcleaow(nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar.lqeggnwhkg()) {
            return null;
        }
        return nufgyqmvbuVar.gxszxtbevo();
    }
}
