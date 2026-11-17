package hg;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp extends nufgyqmvbu {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f40271jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object[] f40272yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f40273zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f40270iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final Object[] f40269cqumvgiudr = new Object[0];

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public wflxmlrfwp(int i13) {
        Object[] objArr;
        if (i13 == 0) {
            objArr = f40269cqumvgiudr;
        } else {
            if (i13 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i13);
            }
            objArr = new Object[i13];
        }
        this.f40272yggfygwlhe = objArr;
    }

    private final void agtfadlqog(int i13) {
        if (i13 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f40272yggfygwlhe;
        if (i13 <= objArr.length) {
            return;
        }
        if (objArr == f40269cqumvgiudr) {
            this.f40272yggfygwlhe = new Object[zg.gtknphoqwx.gxszxtbevo(i13, 10)];
        } else {
            btonecajqb(wkgbmnqykc.f40274zdlpuopuiu.eablkybsjg(objArr.length, i13));
        }
    }

    private final void btonecajqb(int i13) {
        Object[] objArr = new Object[i13];
        Object[] objArr2 = this.f40272yggfygwlhe;
        agtfadlqog.agtfadlqog(objArr2, objArr, 0, this.f40273zdlpuopuiu, objArr2.length);
        Object[] objArr3 = this.f40272yggfygwlhe;
        int length = objArr3.length;
        int i14 = this.f40273zdlpuopuiu;
        agtfadlqog.agtfadlqog(objArr3, objArr, length - i14, 0, i14);
        this.f40273zdlpuopuiu = 0;
        this.f40272yggfygwlhe = objArr;
    }

    private final void cqumvgiudr() {
        ((AbstractList) this).modCount++;
    }

    private final int draadjrbmk(int i13) {
        return i13 == 0 ? agtfadlqog.opjhrmiecq(this.f40272yggfygwlhe) : i13 - 1;
    }

    private final void dxjokdxxww(int i13, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f40272yggfygwlhe.length;
        while (i13 < length && it.hasNext()) {
            this.f40272yggfygwlhe[i13] = it.next();
            i13++;
        }
        int i14 = this.f40273zdlpuopuiu;
        for (int i15 = 0; i15 < i14 && it.hasNext(); i15++) {
            this.f40272yggfygwlhe[i15] = it.next();
        }
        this.f40271jyumaefscl = size() + collection.size();
    }

    private final void istkbnxepw(int i13, int i14) {
        int iJyumaefscl = jyumaefscl(this.f40273zdlpuopuiu + i14);
        int iJyumaefscl2 = jyumaefscl(this.f40273zdlpuopuiu + i13);
        int size = size();
        while (true) {
            size -= i14;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f40272yggfygwlhe;
            i14 = Math.min(size, Math.min(objArr.length - iJyumaefscl, objArr.length - iJyumaefscl2));
            Object[] objArr2 = this.f40272yggfygwlhe;
            int i15 = iJyumaefscl + i14;
            agtfadlqog.agtfadlqog(objArr2, objArr2, iJyumaefscl2, iJyumaefscl, i15);
            iJyumaefscl = jyumaefscl(i15);
            iJyumaefscl2 = jyumaefscl(iJyumaefscl2 + i14);
        }
    }

    private final int jyumaefscl(int i13) {
        Object[] objArr = this.f40272yggfygwlhe;
        return i13 >= objArr.length ? i13 - objArr.length : i13;
    }

    private final int kcexrzcfyt(int i13) {
        return i13 < 0 ? i13 + this.f40272yggfygwlhe.length : i13;
    }

    private final int rgvfuqvkyq(int i13) {
        if (i13 == agtfadlqog.opjhrmiecq(this.f40272yggfygwlhe)) {
            return 0;
        }
        return i13 + 1;
    }

    private final void zdlpuopuiu(int i13, int i14) {
        if (i13 < i14) {
            agtfadlqog.lereixgezr(this.f40272yggfygwlhe, null, i13, i14);
            return;
        }
        Object[] objArr = this.f40272yggfygwlhe;
        agtfadlqog.lereixgezr(objArr, null, i13, objArr.length);
        agtfadlqog.lereixgezr(this.f40272yggfygwlhe, null, 0, i14);
    }

    private final void zynmafqrjb(int i13, int i14) {
        int iJyumaefscl = jyumaefscl(this.f40273zdlpuopuiu + (i13 - 1));
        int iJyumaefscl2 = jyumaefscl(this.f40273zdlpuopuiu + (i14 - 1));
        while (i13 > 0) {
            int i15 = iJyumaefscl + 1;
            int iMin = Math.min(i13, Math.min(i15, iJyumaefscl2 + 1));
            Object[] objArr = this.f40272yggfygwlhe;
            int i16 = iJyumaefscl2 - iMin;
            int i17 = iJyumaefscl - iMin;
            agtfadlqog.agtfadlqog(objArr, objArr, i16 + 1, i17 + 1, i15);
            iJyumaefscl = kcexrzcfyt(i17);
            iJyumaefscl2 = kcexrzcfyt(i16);
            i13 -= iMin;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        cqumvgiudr();
        agtfadlqog(size() + elements.size());
        dxjokdxxww(jyumaefscl(this.f40273zdlpuopuiu + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        cqumvgiudr();
        agtfadlqog(size() + 1);
        int iDraadjrbmk = draadjrbmk(this.f40273zdlpuopuiu);
        this.f40273zdlpuopuiu = iDraadjrbmk;
        this.f40272yggfygwlhe[iDraadjrbmk] = obj;
        this.f40271jyumaefscl = size() + 1;
    }

    public final void addLast(Object obj) {
        cqumvgiudr();
        agtfadlqog(size() + 1);
        this.f40272yggfygwlhe[jyumaefscl(this.f40273zdlpuopuiu + size())] = obj;
        this.f40271jyumaefscl = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            cqumvgiudr();
            zdlpuopuiu(this.f40273zdlpuopuiu, jyumaefscl(this.f40273zdlpuopuiu + size()));
        }
        this.f40273zdlpuopuiu = 0;
        this.f40271jyumaefscl = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f40272yggfygwlhe[this.f40273zdlpuopuiu];
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i13) {
        wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, size());
        return this.f40272yggfygwlhe[jyumaefscl(this.f40273zdlpuopuiu + i13)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i13;
        int iJyumaefscl = jyumaefscl(this.f40273zdlpuopuiu + size());
        int length = this.f40273zdlpuopuiu;
        if (length < iJyumaefscl) {
            while (length < iJyumaefscl) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this.f40272yggfygwlhe[length])) {
                    i13 = this.f40273zdlpuopuiu;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iJyumaefscl) {
            return -1;
        }
        int length2 = this.f40272yggfygwlhe.length;
        while (length < length2) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this.f40272yggfygwlhe[length])) {
                i13 = this.f40273zdlpuopuiu;
            } else {
                length++;
            }
        }
        for (int i14 = 0; i14 < iJyumaefscl; i14++) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this.f40272yggfygwlhe[i14])) {
                length = i14 + this.f40272yggfygwlhe.length;
                i13 = this.f40273zdlpuopuiu;
            }
        }
        return -1;
        return length - i13;
    }

    @Override // hg.nufgyqmvbu
    public int iobyxmoadg() {
        return this.f40271jyumaefscl;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f40272yggfygwlhe[jyumaefscl(this.f40273zdlpuopuiu + jyumaefscl.ojitshcjhn(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iOpjhrmiecq;
        int i13;
        int iJyumaefscl = jyumaefscl(this.f40273zdlpuopuiu + size());
        int i14 = this.f40273zdlpuopuiu;
        if (i14 < iJyumaefscl) {
            iOpjhrmiecq = iJyumaefscl - 1;
            if (i14 <= iOpjhrmiecq) {
                while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this.f40272yggfygwlhe[iOpjhrmiecq])) {
                    if (iOpjhrmiecq != i14) {
                        iOpjhrmiecq--;
                    }
                }
                i13 = this.f40273zdlpuopuiu;
                return iOpjhrmiecq - i13;
            }
            return -1;
        }
        if (i14 > iJyumaefscl) {
            for (int i15 = iJyumaefscl - 1; -1 < i15; i15--) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this.f40272yggfygwlhe[i15])) {
                    iOpjhrmiecq = i15 + this.f40272yggfygwlhe.length;
                    i13 = this.f40273zdlpuopuiu;
                    return iOpjhrmiecq - i13;
                }
            }
            iOpjhrmiecq = agtfadlqog.opjhrmiecq(this.f40272yggfygwlhe);
            int i16 = this.f40273zdlpuopuiu;
            if (i16 <= iOpjhrmiecq) {
                while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this.f40272yggfygwlhe[iOpjhrmiecq])) {
                    if (iOpjhrmiecq != i16) {
                        iOpjhrmiecq--;
                    }
                }
                i13 = this.f40273zdlpuopuiu;
                return iOpjhrmiecq - i13;
            }
        }
        return -1;
    }

    public final Object lereixgezr() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object ojitshcjhn() {
        if (isEmpty()) {
            return null;
        }
        return this.f40272yggfygwlhe[this.f40273zdlpuopuiu];
    }

    public final Object pmvmpeiblj() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int iJyumaefscl;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        boolean z13 = false;
        z13 = false;
        z13 = false;
        if (!isEmpty() && this.f40272yggfygwlhe.length != 0) {
            int iJyumaefscl2 = jyumaefscl(this.f40273zdlpuopuiu + size());
            int i13 = this.f40273zdlpuopuiu;
            if (i13 < iJyumaefscl2) {
                iJyumaefscl = i13;
                while (i13 < iJyumaefscl2) {
                    Object obj = this.f40272yggfygwlhe[i13];
                    if (elements.contains(obj)) {
                        z13 = true;
                    } else {
                        this.f40272yggfygwlhe[iJyumaefscl] = obj;
                        iJyumaefscl++;
                    }
                    i13++;
                }
                agtfadlqog.lereixgezr(this.f40272yggfygwlhe, null, iJyumaefscl, iJyumaefscl2);
            } else {
                int length = this.f40272yggfygwlhe.length;
                boolean z14 = false;
                int i14 = i13;
                while (i13 < length) {
                    Object[] objArr = this.f40272yggfygwlhe;
                    Object obj2 = objArr[i13];
                    objArr[i13] = null;
                    if (elements.contains(obj2)) {
                        z14 = true;
                    } else {
                        this.f40272yggfygwlhe[i14] = obj2;
                        i14++;
                    }
                    i13++;
                }
                iJyumaefscl = jyumaefscl(i14);
                for (int i15 = 0; i15 < iJyumaefscl2; i15++) {
                    Object[] objArr2 = this.f40272yggfygwlhe;
                    Object obj3 = objArr2[i15];
                    objArr2[i15] = null;
                    if (elements.contains(obj3)) {
                        z14 = true;
                    } else {
                        this.f40272yggfygwlhe[iJyumaefscl] = obj3;
                        iJyumaefscl = rgvfuqvkyq(iJyumaefscl);
                    }
                }
                z13 = z14;
            }
            if (z13) {
                cqumvgiudr();
                this.f40271jyumaefscl = kcexrzcfyt(iJyumaefscl - this.f40273zdlpuopuiu);
            }
        }
        return z13;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        cqumvgiudr();
        Object[] objArr = this.f40272yggfygwlhe;
        int i13 = this.f40273zdlpuopuiu;
        Object obj = objArr[i13];
        objArr[i13] = null;
        this.f40273zdlpuopuiu = rgvfuqvkyq(i13);
        this.f40271jyumaefscl = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        cqumvgiudr();
        int iJyumaefscl = jyumaefscl(this.f40273zdlpuopuiu + jyumaefscl.ojitshcjhn(this));
        Object[] objArr = this.f40272yggfygwlhe;
        Object obj = objArr[iJyumaefscl];
        objArr[iJyumaefscl] = null;
        this.f40271jyumaefscl = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i13, int i14) {
        wkgbmnqykc.f40274zdlpuopuiu.wkgbmnqykc(i13, i14, size());
        int i15 = i14 - i13;
        if (i15 == 0) {
            return;
        }
        if (i15 == size()) {
            clear();
            return;
        }
        if (i15 == 1) {
            remove(i13);
            return;
        }
        cqumvgiudr();
        if (i13 < size() - i14) {
            zynmafqrjb(i13, i14);
            int iJyumaefscl = jyumaefscl(this.f40273zdlpuopuiu + i15);
            zdlpuopuiu(this.f40273zdlpuopuiu, iJyumaefscl);
            this.f40273zdlpuopuiu = iJyumaefscl;
        } else {
            istkbnxepw(i13, i14);
            int iJyumaefscl2 = jyumaefscl(this.f40273zdlpuopuiu + size());
            zdlpuopuiu(kcexrzcfyt(iJyumaefscl2 - i15), iJyumaefscl2);
        }
        this.f40271jyumaefscl = size() - i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iJyumaefscl;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        boolean z13 = false;
        z13 = false;
        z13 = false;
        if (!isEmpty() && this.f40272yggfygwlhe.length != 0) {
            int iJyumaefscl2 = jyumaefscl(this.f40273zdlpuopuiu + size());
            int i13 = this.f40273zdlpuopuiu;
            if (i13 < iJyumaefscl2) {
                iJyumaefscl = i13;
                while (i13 < iJyumaefscl2) {
                    Object obj = this.f40272yggfygwlhe[i13];
                    if (elements.contains(obj)) {
                        this.f40272yggfygwlhe[iJyumaefscl] = obj;
                        iJyumaefscl++;
                    } else {
                        z13 = true;
                    }
                    i13++;
                }
                agtfadlqog.lereixgezr(this.f40272yggfygwlhe, null, iJyumaefscl, iJyumaefscl2);
            } else {
                int length = this.f40272yggfygwlhe.length;
                boolean z14 = false;
                int i14 = i13;
                while (i13 < length) {
                    Object[] objArr = this.f40272yggfygwlhe;
                    Object obj2 = objArr[i13];
                    objArr[i13] = null;
                    if (elements.contains(obj2)) {
                        this.f40272yggfygwlhe[i14] = obj2;
                        i14++;
                    } else {
                        z14 = true;
                    }
                    i13++;
                }
                iJyumaefscl = jyumaefscl(i14);
                for (int i15 = 0; i15 < iJyumaefscl2; i15++) {
                    Object[] objArr2 = this.f40272yggfygwlhe;
                    Object obj3 = objArr2[i15];
                    objArr2[i15] = null;
                    if (elements.contains(obj3)) {
                        this.f40272yggfygwlhe[iJyumaefscl] = obj3;
                        iJyumaefscl = rgvfuqvkyq(iJyumaefscl);
                    } else {
                        z14 = true;
                    }
                }
                z13 = z14;
            }
            if (z13) {
                cqumvgiudr();
                this.f40271jyumaefscl = kcexrzcfyt(iJyumaefscl - this.f40273zdlpuopuiu);
            }
        }
        return z13;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i13, Object obj) {
        wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, size());
        int iJyumaefscl = jyumaefscl(this.f40273zdlpuopuiu + i13);
        Object[] objArr = this.f40272yggfygwlhe;
        Object obj2 = objArr[iJyumaefscl];
        objArr[iJyumaefscl] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        if (array.length < size()) {
            array = ojitshcjhn.iobyxmoadg(array, size());
        }
        int iJyumaefscl = jyumaefscl(this.f40273zdlpuopuiu + size());
        int i13 = this.f40273zdlpuopuiu;
        if (i13 < iJyumaefscl) {
            agtfadlqog.kcexrzcfyt(this.f40272yggfygwlhe, array, 0, i13, iJyumaefscl, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f40272yggfygwlhe;
            agtfadlqog.agtfadlqog(objArr, array, 0, this.f40273zdlpuopuiu, objArr.length);
            Object[] objArr2 = this.f40272yggfygwlhe;
            agtfadlqog.agtfadlqog(objArr2, array, objArr2.length - this.f40273zdlpuopuiu, 0, iJyumaefscl);
        }
        return jyumaefscl.gxszxtbevo(size(), array);
    }

    public final Object vdvldrhtss() {
        if (isEmpty()) {
            return null;
        }
        return this.f40272yggfygwlhe[jyumaefscl(this.f40273zdlpuopuiu + jyumaefscl.ojitshcjhn(this))];
    }

    @Override // hg.nufgyqmvbu
    public Object wkgbmnqykc(int i13) {
        wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, size());
        if (i13 == jyumaefscl.ojitshcjhn(this)) {
            return removeLast();
        }
        if (i13 == 0) {
            return removeFirst();
        }
        cqumvgiudr();
        int iJyumaefscl = jyumaefscl(this.f40273zdlpuopuiu + i13);
        Object obj = this.f40272yggfygwlhe[iJyumaefscl];
        if (i13 < (size() >> 1)) {
            int i14 = this.f40273zdlpuopuiu;
            if (iJyumaefscl >= i14) {
                Object[] objArr = this.f40272yggfygwlhe;
                agtfadlqog.agtfadlqog(objArr, objArr, i14 + 1, i14, iJyumaefscl);
            } else {
                Object[] objArr2 = this.f40272yggfygwlhe;
                agtfadlqog.agtfadlqog(objArr2, objArr2, 1, 0, iJyumaefscl);
                Object[] objArr3 = this.f40272yggfygwlhe;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i15 = this.f40273zdlpuopuiu;
                agtfadlqog.agtfadlqog(objArr3, objArr3, i15 + 1, i15, objArr3.length - 1);
            }
            Object[] objArr4 = this.f40272yggfygwlhe;
            int i16 = this.f40273zdlpuopuiu;
            objArr4[i16] = null;
            this.f40273zdlpuopuiu = rgvfuqvkyq(i16);
        } else {
            int iJyumaefscl2 = jyumaefscl(this.f40273zdlpuopuiu + jyumaefscl.ojitshcjhn(this));
            if (iJyumaefscl <= iJyumaefscl2) {
                Object[] objArr5 = this.f40272yggfygwlhe;
                agtfadlqog.agtfadlqog(objArr5, objArr5, iJyumaefscl, iJyumaefscl + 1, iJyumaefscl2 + 1);
            } else {
                Object[] objArr6 = this.f40272yggfygwlhe;
                agtfadlqog.agtfadlqog(objArr6, objArr6, iJyumaefscl, iJyumaefscl + 1, objArr6.length);
                Object[] objArr7 = this.f40272yggfygwlhe;
                objArr7[objArr7.length - 1] = objArr7[0];
                agtfadlqog.agtfadlqog(objArr7, objArr7, 0, 1, iJyumaefscl2 + 1);
            }
            this.f40272yggfygwlhe[iJyumaefscl2] = null;
        }
        this.f40271jyumaefscl = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i13, Object obj) {
        wkgbmnqykc.f40274zdlpuopuiu.ppxfxbqfkf(i13, size());
        if (i13 == size()) {
            addLast(obj);
            return;
        }
        if (i13 == 0) {
            addFirst(obj);
            return;
        }
        cqumvgiudr();
        agtfadlqog(size() + 1);
        int iJyumaefscl = jyumaefscl(this.f40273zdlpuopuiu + i13);
        if (i13 < ((size() + 1) >> 1)) {
            int iDraadjrbmk = draadjrbmk(iJyumaefscl);
            int iDraadjrbmk2 = draadjrbmk(this.f40273zdlpuopuiu);
            int i14 = this.f40273zdlpuopuiu;
            if (iDraadjrbmk >= i14) {
                Object[] objArr = this.f40272yggfygwlhe;
                objArr[iDraadjrbmk2] = objArr[i14];
                agtfadlqog.agtfadlqog(objArr, objArr, i14, i14 + 1, iDraadjrbmk + 1);
            } else {
                Object[] objArr2 = this.f40272yggfygwlhe;
                agtfadlqog.agtfadlqog(objArr2, objArr2, i14 - 1, i14, objArr2.length);
                Object[] objArr3 = this.f40272yggfygwlhe;
                objArr3[objArr3.length - 1] = objArr3[0];
                agtfadlqog.agtfadlqog(objArr3, objArr3, 0, 1, iDraadjrbmk + 1);
            }
            this.f40272yggfygwlhe[iDraadjrbmk] = obj;
            this.f40273zdlpuopuiu = iDraadjrbmk2;
        } else {
            int iJyumaefscl2 = jyumaefscl(this.f40273zdlpuopuiu + size());
            if (iJyumaefscl < iJyumaefscl2) {
                Object[] objArr4 = this.f40272yggfygwlhe;
                agtfadlqog.agtfadlqog(objArr4, objArr4, iJyumaefscl + 1, iJyumaefscl, iJyumaefscl2);
            } else {
                Object[] objArr5 = this.f40272yggfygwlhe;
                agtfadlqog.agtfadlqog(objArr5, objArr5, 1, 0, iJyumaefscl2);
                Object[] objArr6 = this.f40272yggfygwlhe;
                objArr6[0] = objArr6[objArr6.length - 1];
                agtfadlqog.agtfadlqog(objArr6, objArr6, iJyumaefscl + 1, iJyumaefscl, objArr6.length - 1);
            }
            this.f40272yggfygwlhe[iJyumaefscl] = obj;
        }
        this.f40271jyumaefscl = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i13, Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        wkgbmnqykc.f40274zdlpuopuiu.ppxfxbqfkf(i13, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i13 == size()) {
            return addAll(elements);
        }
        cqumvgiudr();
        agtfadlqog(size() + elements.size());
        int iJyumaefscl = jyumaefscl(this.f40273zdlpuopuiu + size());
        int iJyumaefscl2 = jyumaefscl(this.f40273zdlpuopuiu + i13);
        int size = elements.size();
        if (i13 < ((size() + 1) >> 1)) {
            int i14 = this.f40273zdlpuopuiu;
            int length = i14 - size;
            if (iJyumaefscl2 < i14) {
                Object[] objArr = this.f40272yggfygwlhe;
                agtfadlqog.agtfadlqog(objArr, objArr, length, i14, objArr.length);
                if (size >= iJyumaefscl2) {
                    Object[] objArr2 = this.f40272yggfygwlhe;
                    agtfadlqog.agtfadlqog(objArr2, objArr2, objArr2.length - size, 0, iJyumaefscl2);
                } else {
                    Object[] objArr3 = this.f40272yggfygwlhe;
                    agtfadlqog.agtfadlqog(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f40272yggfygwlhe;
                    agtfadlqog.agtfadlqog(objArr4, objArr4, 0, size, iJyumaefscl2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f40272yggfygwlhe;
                agtfadlqog.agtfadlqog(objArr5, objArr5, length, i14, iJyumaefscl2);
            } else {
                Object[] objArr6 = this.f40272yggfygwlhe;
                length += objArr6.length;
                int i15 = iJyumaefscl2 - i14;
                int length2 = objArr6.length - length;
                if (length2 >= i15) {
                    agtfadlqog.agtfadlqog(objArr6, objArr6, length, i14, iJyumaefscl2);
                } else {
                    agtfadlqog.agtfadlqog(objArr6, objArr6, length, i14, i14 + length2);
                    Object[] objArr7 = this.f40272yggfygwlhe;
                    agtfadlqog.agtfadlqog(objArr7, objArr7, 0, this.f40273zdlpuopuiu + length2, iJyumaefscl2);
                }
            }
            this.f40273zdlpuopuiu = length;
            dxjokdxxww(kcexrzcfyt(iJyumaefscl2 - size), elements);
        } else {
            int i16 = iJyumaefscl2 + size;
            if (iJyumaefscl2 < iJyumaefscl) {
                int i17 = size + iJyumaefscl;
                Object[] objArr8 = this.f40272yggfygwlhe;
                if (i17 <= objArr8.length) {
                    agtfadlqog.agtfadlqog(objArr8, objArr8, i16, iJyumaefscl2, iJyumaefscl);
                } else if (i16 >= objArr8.length) {
                    agtfadlqog.agtfadlqog(objArr8, objArr8, i16 - objArr8.length, iJyumaefscl2, iJyumaefscl);
                } else {
                    int length3 = iJyumaefscl - (i17 - objArr8.length);
                    agtfadlqog.agtfadlqog(objArr8, objArr8, 0, length3, iJyumaefscl);
                    Object[] objArr9 = this.f40272yggfygwlhe;
                    agtfadlqog.agtfadlqog(objArr9, objArr9, i16, iJyumaefscl2, length3);
                }
            } else {
                Object[] objArr10 = this.f40272yggfygwlhe;
                agtfadlqog.agtfadlqog(objArr10, objArr10, size, 0, iJyumaefscl);
                Object[] objArr11 = this.f40272yggfygwlhe;
                if (i16 >= objArr11.length) {
                    agtfadlqog.agtfadlqog(objArr11, objArr11, i16 - objArr11.length, iJyumaefscl2, objArr11.length);
                } else {
                    agtfadlqog.agtfadlqog(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f40272yggfygwlhe;
                    agtfadlqog.agtfadlqog(objArr12, objArr12, i16, iJyumaefscl2, objArr12.length - size);
                }
            }
            dxjokdxxww(iJyumaefscl2, elements);
        }
        return true;
    }

    public wflxmlrfwp() {
        this.f40272yggfygwlhe = f40269cqumvgiudr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
