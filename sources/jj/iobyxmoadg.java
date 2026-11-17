package jj;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static final HashMap eablkybsjg(int i13) {
        return new HashMap(zoijcleaow(i13));
    }

    public static final HashSet gxszxtbevo(int i13) {
        return new HashSet(zoijcleaow(i13));
    }

    public static final void iobyxmoadg(Collection collection, Object obj) {
        zdlpuopuiu.btonecajqb(collection, "<this>");
        if (obj != null) {
            collection.add(obj);
        }
    }

    public static final LinkedHashSet lqeggnwhkg(int i13) {
        return new LinkedHashSet(zoijcleaow(i13));
    }

    public static final List ppxfxbqfkf(ArrayList arrayList) {
        zdlpuopuiu.btonecajqb(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return jyumaefscl.wflxmlrfwp();
        }
        if (size == 1) {
            return jyumaefscl.eablkybsjg(jyumaefscl.opjhrmiecq(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final Map wkgbmnqykc(Iterable iterable) {
        zdlpuopuiu.btonecajqb(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = iterable.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i13));
            i13++;
        }
        return linkedHashMap;
    }

    private static final int zoijcleaow(int i13) {
        if (i13 < 3) {
            return 3;
        }
        return i13 + (i13 / 3) + 1;
    }
}
