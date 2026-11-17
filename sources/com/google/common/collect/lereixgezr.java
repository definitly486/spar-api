package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lereixgezr {

    private static class iobyxmoadg extends AbstractList implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final xa.eablkybsjg f23677yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final List f23678zdlpuopuiu;

        /* JADX INFO: renamed from: com.google.common.collect.lereixgezr$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C0405iobyxmoadg extends ntlheqmsrt {
            C0405iobyxmoadg(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.mbcevpiqjq
            Object iobyxmoadg(Object obj) {
                return iobyxmoadg.this.f23677yggfygwlhe.apply(obj);
            }
        }

        iobyxmoadg(List list, xa.eablkybsjg eablkybsjgVar) {
            this.f23678zdlpuopuiu = (List) xa.draadjrbmk.btonecajqb(list);
            this.f23677yggfygwlhe = (xa.eablkybsjg) xa.draadjrbmk.btonecajqb(eablkybsjgVar);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i13) {
            return this.f23677yggfygwlhe.apply(this.f23678zdlpuopuiu.get(i13));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f23678zdlpuopuiu.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i13) {
            return new C0405iobyxmoadg(this.f23678zdlpuopuiu.listIterator(i13));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i13) {
            return this.f23677yggfygwlhe.apply(this.f23678zdlpuopuiu.remove(i13));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i13, int i14) {
            this.f23678zdlpuopuiu.subList(i13, i14).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f23678zdlpuopuiu.size();
        }
    }

    private static class zoijcleaow extends AbstractSequentialList implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final xa.eablkybsjg f23680yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final List f23681zdlpuopuiu;

        class iobyxmoadg extends ntlheqmsrt {
            iobyxmoadg(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.mbcevpiqjq
            Object iobyxmoadg(Object obj) {
                return zoijcleaow.this.f23680yggfygwlhe.apply(obj);
            }
        }

        zoijcleaow(List list, xa.eablkybsjg eablkybsjgVar) {
            this.f23681zdlpuopuiu = (List) xa.draadjrbmk.btonecajqb(list);
            this.f23680yggfygwlhe = (xa.eablkybsjg) xa.draadjrbmk.btonecajqb(eablkybsjgVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f23681zdlpuopuiu.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i13) {
            return new iobyxmoadg(this.f23681zdlpuopuiu.listIterator(i13));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i13, int i14) {
            this.f23681zdlpuopuiu.subList(i13, i14).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f23681zdlpuopuiu.size();
        }
    }

    private static int eablkybsjg(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList gxszxtbevo() {
        return new ArrayList();
    }

    static boolean iobyxmoadg(List list, Object obj) {
        if (obj == xa.draadjrbmk.btonecajqb(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return cqumvgiudr.eablkybsjg(list.iterator(), list2.iterator());
        }
        for (int i13 = 0; i13 < size; i13++) {
            if (!xa.dxjokdxxww.iobyxmoadg(list.get(i13), list2.get(i13))) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList lqeggnwhkg(Iterator it) {
        ArrayList arrayListGxszxtbevo = gxszxtbevo();
        cqumvgiudr.iobyxmoadg(arrayListGxszxtbevo, it);
        return arrayListGxszxtbevo;
    }

    public static List nufgyqmvbu(List list, xa.eablkybsjg eablkybsjgVar) {
        return list instanceof RandomAccess ? new iobyxmoadg(list, eablkybsjgVar) : new zoijcleaow(list, eablkybsjgVar);
    }

    private static int ppxfxbqfkf(List list, Object obj) {
        int size = list.size();
        int i13 = 0;
        if (obj == null) {
            while (i13 < size) {
                if (list.get(i13) == null) {
                    return i13;
                }
                i13++;
            }
            return -1;
        }
        while (i13 < size) {
            if (obj.equals(list.get(i13))) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    static int wkgbmnqykc(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return eablkybsjg(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (xa.dxjokdxxww.iobyxmoadg(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    static int zoijcleaow(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return ppxfxbqfkf(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (xa.dxjokdxxww.iobyxmoadg(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }
}
