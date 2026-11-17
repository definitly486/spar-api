package hg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wwaezpbzkn extends yadqdtsiqt {

    public static final class iobyxmoadg implements lj.btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Iterable f40281iobyxmoadg;

        public iobyxmoadg(Iterable iterable) {
            this.f40281iobyxmoadg = iterable;
        }

        @Override // lj.btonecajqb
        public Iterator iterator() {
            return this.f40281iobyxmoadg.iterator();
        }
    }

    public static List a(List list, zg.btonecajqb indices) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(indices, "indices");
        return indices.isEmpty() ? jyumaefscl.wflxmlrfwp() : jyumaefscl.m(list.subList(indices.wflxmlrfwp().intValue(), indices.draadjrbmk().intValue() + 1));
    }

    public static Comparable ageimvtcrz(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final String auzgnhcxok(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        return ((StringBuilder) roivzttewh(iterable, new StringBuilder(), separator, prefix, postfix, i13, truncated, draadjrbmkVar)).toString();
    }

    public static List b(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listO = o(iterable);
            jyumaefscl.pmvmpeiblj(listO);
            return listO;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return jyumaefscl.m(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        vdvldrhtss.dsvhmnatus((Comparable[]) array);
        return agtfadlqog.gxszxtbevo(array);
    }

    public static Object bfopjjpdmp(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (iterable instanceof List) {
            return jyumaefscl.opjhrmiecq((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static List c(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        return jyumaefscl.d(iterable, kg.iobyxmoadg.nufgyqmvbu());
    }

    public static List czzsidtyhn(List list, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (i13 >= 0) {
            return jyumaefscl.f(list, zg.gtknphoqwx.gxszxtbevo(list.size() - i13, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i13 + " is less than zero.").toString());
    }

    public static List d(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listO = o(iterable);
            jyumaefscl.zynmafqrjb(listO, comparator);
            return listO;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return jyumaefscl.m(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        agtfadlqog.wypolnanlu(array, comparator);
        return agtfadlqog.gxszxtbevo(array);
    }

    public static Object dvvnrvtcbc(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (iterable instanceof List) {
            return jyumaefscl.skhdrjzrfn((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Set e(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        Set setQ = jyumaefscl.q(iterable);
        istkbnxepw.ylkuphrtab(setQ, other);
        return setQ;
    }

    public static Object eslsurpljm(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static List ezmngbhpjk(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return jyumaefscl.m(iterable);
        }
        List listO = o(iterable);
        jyumaefscl.jlmebxxoox(listO);
        return listO;
    }

    public static List f(Iterable iterable, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i13 + " is less than zero.").toString());
        }
        if (i13 == 0) {
            return jyumaefscl.wflxmlrfwp();
        }
        if (iterable instanceof Collection) {
            if (i13 >= ((Collection) iterable).size()) {
                return jyumaefscl.m(iterable);
            }
            if (i13 == 1) {
                return jyumaefscl.eablkybsjg(jyumaefscl.bfopjjpdmp(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i13);
        Iterator it = iterable.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i14++;
            if (i14 == i13) {
                break;
            }
        }
        return cqumvgiudr.zdlpuopuiu(arrayList);
    }

    public static Float fiwbwshyhd(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Object fmlbqenlif(Collection collection, xg.ppxfxbqfkf random) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return uwvvkdfqfp(collection, random.lqeggnwhkg(collection.size()));
    }

    public static Float fyldjkxazc(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static List g(List list, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i13 + " is less than zero.").toString());
        }
        if (i13 == 0) {
            return jyumaefscl.wflxmlrfwp();
        }
        int size = list.size();
        if (i13 >= size) {
            return jyumaefscl.m(list);
        }
        if (i13 == 1) {
            return jyumaefscl.eablkybsjg(jyumaefscl.skhdrjzrfn(list));
        }
        ArrayList arrayList = new ArrayList(i13);
        if (list instanceof RandomAccess) {
            for (int i14 = size - i13; i14 < size; i14++) {
                arrayList.add(list.get(i14));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i13);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List grlcpdaxtj(Iterable iterable, Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        if (iterable instanceof Collection) {
            return jyumaefscl.ixidwrxhsl((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        jyumaefscl.istkbnxepw(arrayList, iterable);
        jyumaefscl.istkbnxepw(arrayList, elements);
        return arrayList;
    }

    public static boolean[] h(Collection collection) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            zArr[i13] = ((Boolean) it.next()).booleanValue();
            i13++;
        }
        return zArr;
    }

    public static Comparable hszhottldk(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final Collection i(Iterable iterable, Collection destination) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static Object igdgnonuha(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static lj.btonecajqb ikoacuggdj(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        return new iobyxmoadg(iterable);
    }

    public static List ipoelvxyzq(Iterable iterable, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(iterable, 10));
        boolean z13 = false;
        for (Object obj2 : iterable) {
            boolean z14 = true;
            if (!z13 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj2, obj)) {
                z13 = true;
                z14 = false;
            }
            if (z14) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String iwxlajgraz(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, tg.draadjrbmk draadjrbmkVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i14 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i14 & 4) == 0 ? charSequence3 : "";
        if ((i14 & 8) != 0) {
            i13 = -1;
        }
        int i15 = i13;
        if ((i14 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i14 & 32) != 0) {
            draadjrbmkVar = null;
        }
        return auzgnhcxok(iterable, charSequence, charSequence5, charSequence6, i15, charSequence7, draadjrbmkVar);
    }

    public static List ixidwrxhsl(Collection collection, Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            jyumaefscl.istkbnxepw(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static Object iyctptxqzt(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static float[] j(Collection collection) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            fArr[i13] = ((Number) it.next()).floatValue();
            i13++;
        }
        return fArr;
    }

    public static boolean jhduphickx(Iterable iterable, tg.draadjrbmk predicate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static List jrbgnlbqoe(Collection collection, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List jztzpxfvev(Iterable iterable, int i13, tg.draadjrbmk transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        return t(iterable, i13, i13, true, transform);
    }

    public static HashSet k(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        return (HashSet) i(iterable, new HashSet(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(iterable, 12))));
    }

    public static Object krqnebusok(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static int[] l(Collection collection) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            iArr[i13] = ((Number) it.next()).intValue();
            i13++;
        }
        return iArr;
    }

    public static Object lrnfpwlwnk(List list, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (i13 < 0 || i13 >= list.size()) {
            return null;
        }
        return list.get(i13);
    }

    public static Object lxfrhoxuzk(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List m(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return cqumvgiudr.zdlpuopuiu(o(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return jyumaefscl.wflxmlrfwp();
        }
        if (size != 1) {
            return jyumaefscl.p(collection);
        }
        return jyumaefscl.eablkybsjg(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List metgxyhuhe(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        return jyumaefscl.m(jyumaefscl.q(iterable));
    }

    public static List mhtqkkgtqm(Iterable iterable, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (iterable instanceof Collection) {
            return jyumaefscl.jrbgnlbqoe((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        jyumaefscl.istkbnxepw(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static long[] n(Collection collection) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            jArr[i13] = ((Number) it.next()).longValue();
            i13++;
        }
        return jArr;
    }

    public static int nuxfzjnpeb(List list, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        return list.indexOf(obj);
    }

    public static final List o(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        return iterable instanceof Collection ? jyumaefscl.p((Collection) iterable) : (List) i(iterable, new ArrayList());
    }

    public static final Collection oipsdeybqn(Iterable iterable, Collection destination) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static double okpsazkaxt(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        Iterator it = iterable.iterator();
        double dLongValue = 0.0d;
        int i13 = 0;
        while (it.hasNext()) {
            dLongValue += ((Number) it.next()).longValue();
            i13++;
            if (i13 < 0) {
                jyumaefscl.jyumaefscl();
            }
        }
        if (i13 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i13);
    }

    public static Object opjhrmiecq(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static List p(Collection collection) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set q(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) i(iterable, new LinkedHashSet());
    }

    public static Set r(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return jztzpxfvev.nufgyqmvbu((Set) i(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ikoacuggdj.eablkybsjg();
        }
        if (size != 1) {
            return (Set) i(iterable, new LinkedHashSet(tzroggbefp.eablkybsjg(collection.size())));
        }
        return ikoacuggdj.wkgbmnqykc(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static Object rhgxfdycjh(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (iterable instanceof List) {
            return jyumaefscl.yzdjzghtvl((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static List rlfsiqarku(Iterable iterable, int i13) {
        ArrayList arrayList;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i13 + " is less than zero.").toString());
        }
        if (i13 == 0) {
            return jyumaefscl.m(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i13;
            if (size <= 0) {
                return jyumaefscl.wflxmlrfwp();
            }
            if (size == 1) {
                return jyumaefscl.eablkybsjg(jyumaefscl.dvvnrvtcbc(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i13 < size2) {
                        arrayList.add(list.get(i13));
                        i13++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i13);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i14 = 0;
        for (Object obj : iterable) {
            if (i14 >= i13) {
                arrayList.add(obj);
            } else {
                i14++;
            }
        }
        return cqumvgiudr.zdlpuopuiu(arrayList);
    }

    public static final Appendable roivzttewh(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated, tg.draadjrbmk draadjrbmkVar) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(buffer, "buffer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        buffer.append(prefix);
        int i14 = 0;
        for (Object obj : iterable) {
            i14++;
            if (i14 > 1) {
                buffer.append(separator);
            }
            if (i13 >= 0 && i14 > i13) {
                break;
            }
            mj.kcexrzcfyt.iobyxmoadg(buffer, obj, draadjrbmkVar);
        }
        if (i13 >= 0 && i14 > i13) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static Set s(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        Set setQ = jyumaefscl.q(iterable);
        jyumaefscl.istkbnxepw(setQ, other);
        return setQ;
    }

    public static List sflfametgt(Iterable iterable, tg.draadjrbmk predicate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object skhdrjzrfn(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(jyumaefscl.ojitshcjhn(list));
    }

    public static final List t(Iterable iterable, int i13, int i14, boolean z13, tg.draadjrbmk transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        metgxyhuhe.iobyxmoadg(i13, i14);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itZoijcleaow = metgxyhuhe.zoijcleaow(iterable.iterator(), i13, i14, z13, true);
            while (itZoijcleaow.hasNext()) {
                arrayList.add(transform.invoke((List) itZoijcleaow.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i15 = 0;
        ArrayList arrayList2 = new ArrayList((size / i14) + (size % i14 == 0 ? 0 : 1));
        jlmebxxoox jlmebxxooxVar = new jlmebxxoox(list);
        while (i15 >= 0 && i15 < size) {
            int iBtonecajqb = zg.gtknphoqwx.btonecajqb(i13, size - i15);
            if (!z13 && iBtonecajqb < i13) {
                break;
            }
            jlmebxxooxVar.btonecajqb(i15, iBtonecajqb + i15);
            arrayList2.add(transform.invoke(jlmebxxooxVar));
            i15 += i14;
        }
        return arrayList2;
    }

    public static Set tbqsvytpvh(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        Set setQ = jyumaefscl.q(iterable);
        istkbnxepw.wypolnanlu(setQ, other);
        return setQ;
    }

    public static Iterable u(final Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        return new dsvhmnatus(new tg.iobyxmoadg() { // from class: hg.iozdgvuglv
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wwaezpbzkn.v(iterable);
            }
        });
    }

    public static final Object uwvvkdfqfp(Iterable iterable, final int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        return iterable instanceof List ? ((List) iterable).get(i13) : ydmasvzmpa(iterable, i13, new tg.draadjrbmk() { // from class: hg.lmojexxdyd
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wwaezpbzkn.yfnezrywwk(i13, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator v(Iterable iterable) {
        return iterable.iterator();
    }

    public static List w(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(jyumaefscl.cqumvgiudr(iterable, 10), jyumaefscl.cqumvgiudr(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(gg.cqumvgiudr.iobyxmoadg(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Object weqkydbzbr(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static List wizcaqwiak(Iterable iterable, tg.draadjrbmk transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static boolean xrmfcynszj(Iterable iterable, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return zeieaojujs(iterable, obj) >= 0;
    }

    public static final Object ydmasvzmpa(Iterable iterable, int i13, tg.draadjrbmk defaultValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i13 < 0 || i13 >= list.size()) ? defaultValue.invoke(Integer.valueOf(i13)) : list.get(i13);
        }
        if (i13 < 0) {
            return defaultValue.invoke(Integer.valueOf(i13));
        }
        int i14 = 0;
        for (Object obj : iterable) {
            int i15 = i14 + 1;
            if (i13 == i14) {
                return obj;
            }
            i14 = i15;
        }
        return defaultValue.invoke(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object yfnezrywwk(int i13, int i14) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i13 + '.');
    }

    public static Object yzdjzghtvl(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final int zeieaojujs(Iterable iterable, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i13 = 0;
        for (Object obj2 : iterable) {
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, obj2)) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public static List zfvoamnweg(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        return (List) oipsdeybqn(iterable, new ArrayList());
    }
}
