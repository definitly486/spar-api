package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iwizpuwonk {
    static Object[] btonecajqb(Iterable iterable) {
        return zoijcleaow(iterable).toArray();
    }

    private static void dxjokdxxww(List list, xa.wflxmlrfwp wflxmlrfwpVar, int i13, int i14) {
        for (int size = list.size() - 1; size > i14; size--) {
            if (wflxmlrfwpVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i15 = i14 - 1; i15 >= i13; i15--) {
            list.remove(i15);
        }
    }

    private static Object eablkybsjg(List list) {
        return list.get(list.size() - 1);
    }

    public static Object gxszxtbevo(Iterable iterable) {
        return cqumvgiudr.gtknphoqwx(iterable.iterator());
    }

    public static boolean iobyxmoadg(Iterable iterable, xa.wflxmlrfwp wflxmlrfwpVar) {
        return cqumvgiudr.zoijcleaow(iterable.iterator(), wflxmlrfwpVar);
    }

    public static boolean lqeggnwhkg(Iterable iterable, xa.wflxmlrfwp wflxmlrfwpVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? nufgyqmvbu((List) iterable, (xa.wflxmlrfwp) xa.draadjrbmk.btonecajqb(wflxmlrfwpVar)) : cqumvgiudr.ojitshcjhn(iterable.iterator(), wflxmlrfwpVar);
    }

    private static boolean nufgyqmvbu(List list, xa.wflxmlrfwp wflxmlrfwpVar) {
        int i13 = 0;
        int i14 = 0;
        while (i13 < list.size()) {
            Object obj = list.get(i13);
            if (!wflxmlrfwpVar.apply(obj)) {
                if (i13 > i14) {
                    try {
                        list.set(i14, obj);
                    } catch (IllegalArgumentException unused) {
                        dxjokdxxww(list, wflxmlrfwpVar, i14, i13);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        dxjokdxxww(list, wflxmlrfwpVar, i14, i13);
                        return true;
                    }
                }
                i14++;
            }
            i13++;
        }
        list.subList(i14, list.size()).clear();
        return i13 != i14;
    }

    public static Object ppxfxbqfkf(Iterable iterable, Object obj) {
        return cqumvgiudr.btonecajqb(iterable.iterator(), obj);
    }

    public static Object wkgbmnqykc(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return cqumvgiudr.dxjokdxxww(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return eablkybsjg(list);
    }

    private static Collection zoijcleaow(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : lereixgezr.lqeggnwhkg(iterable.iterator());
    }
}
