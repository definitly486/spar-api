package hg;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class istkbnxepw extends zynmafqrjb {
    public static boolean cdpycssgdh(Collection collection, Object[] elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return collection.addAll(agtfadlqog.gxszxtbevo(elements));
    }

    public static Object cllcsxoeiz(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(jyumaefscl.ojitshcjhn(list));
    }

    public static boolean dsvhmnatus(Iterable iterable, tg.draadjrbmk predicate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(predicate, "predicate");
        return iozdgvuglv(iterable, predicate, false);
    }

    public static Object hcddaimhww(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object hkdspvbjdz(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(jyumaefscl.ojitshcjhn(list));
    }

    private static final boolean iozdgvuglv(Iterable iterable, tg.draadjrbmk draadjrbmkVar, boolean z13) {
        Iterator it = iterable.iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            if (((Boolean) draadjrbmkVar.invoke(it.next())).booleanValue() == z13) {
                it.remove();
                z14 = true;
            }
        }
        return z14;
    }

    public static boolean istkbnxepw(Collection collection, Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z13 = true;
            }
        }
        return z13;
    }

    public static Object jpowsppfya(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    private static final boolean lmojexxdyd(List list, tg.draadjrbmk draadjrbmkVar, boolean z13) {
        int i13;
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return iozdgvuglv(kotlin.jvm.internal.mbcevpiqjq.zoijcleaow(list), draadjrbmkVar, z13);
        }
        int iOjitshcjhn = jyumaefscl.ojitshcjhn(list);
        if (iOjitshcjhn >= 0) {
            int i14 = 0;
            i13 = 0;
            while (true) {
                Object obj = list.get(i14);
                if (((Boolean) draadjrbmkVar.invoke(obj)).booleanValue() != z13) {
                    if (i13 != i14) {
                        list.set(i13, obj);
                    }
                    i13++;
                }
                if (i14 == iOjitshcjhn) {
                    break;
                }
                i14++;
            }
        } else {
            i13 = 0;
        }
        if (i13 >= list.size()) {
            return false;
        }
        int iOjitshcjhn2 = jyumaefscl.ojitshcjhn(list);
        if (i13 > iOjitshcjhn2) {
            return true;
        }
        while (true) {
            list.remove(iOjitshcjhn2);
            if (iOjitshcjhn2 == i13) {
                return true;
            }
            iOjitshcjhn2--;
        }
    }

    public static boolean pkzmftpjix(List list, tg.draadjrbmk predicate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(predicate, "predicate");
        return lmojexxdyd(list, predicate, true);
    }

    public static boolean wwaezpbzkn(Iterable iterable, tg.draadjrbmk predicate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(predicate, "predicate");
        return iozdgvuglv(iterable, predicate, true);
    }

    public static final boolean wypolnanlu(Collection collection, Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return collection.retainAll(yadqdtsiqt(elements));
    }

    public static final Collection yadqdtsiqt(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : jyumaefscl.m(iterable);
    }

    public static final boolean ylkuphrtab(Collection collection, Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return collection.removeAll(yadqdtsiqt(elements));
    }
}
