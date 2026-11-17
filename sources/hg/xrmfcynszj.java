package hg;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class xrmfcynszj extends jztzpxfvev {
    public static Set btonecajqb(Set set, Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(set, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Collection<?> collectionYadqdtsiqt = istkbnxepw.yadqdtsiqt(elements);
        if (collectionYadqdtsiqt.isEmpty()) {
            return jyumaefscl.r(set);
        }
        if (!(collectionYadqdtsiqt instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionYadqdtsiqt);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionYadqdtsiqt).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set draadjrbmk(Set set, Iterable elements) {
        int size;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(set, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Integer numEsjtqupxsv = esjtqupxsv.esjtqupxsv(elements);
        if (numEsjtqupxsv != null) {
            size = set.size() + numEsjtqupxsv.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(tzroggbefp.eablkybsjg(size));
        linkedHashSet.addAll(set);
        jyumaefscl.istkbnxepw(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static Set gtknphoqwx(Set set, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(tzroggbefp.eablkybsjg(set.size()));
        boolean z13 = false;
        for (Object obj2 : set) {
            boolean z14 = true;
            if (!z13 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj2, obj)) {
                z13 = true;
                z14 = false;
            }
            if (z14) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set wflxmlrfwp(Set set, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(tzroggbefp.eablkybsjg(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
