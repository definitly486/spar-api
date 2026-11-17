package ij;

import java.util.Collection;
import java.util.LinkedHashSet;
import jj.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static final Collection iobyxmoadg(Collection collection, Collection collection2) {
        zdlpuopuiu.btonecajqb(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final gtknphoqwx zoijcleaow(Iterable scopes) {
        zdlpuopuiu.btonecajqb(scopes, "scopes");
        gtknphoqwx gtknphoqwxVar = new gtknphoqwx();
        for (Object obj : scopes) {
            si.gtknphoqwx gtknphoqwxVar2 = (si.gtknphoqwx) obj;
            if (gtknphoqwxVar2 != null && gtknphoqwxVar2 != si.gtknphoqwx.zoijcleaow.f106714zoijcleaow) {
                gtknphoqwxVar.add(obj);
            }
        }
        return gtknphoqwxVar;
    }
}
