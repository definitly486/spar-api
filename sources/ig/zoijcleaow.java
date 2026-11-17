package ig;

import hg.agtfadlqog;
import hg.jyumaefscl;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends hg.nufgyqmvbu implements List, RandomAccess, Serializable, ug.wkgbmnqykc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final zoijcleaow f42519cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final C1004zoijcleaow f42520iwizpuwonk = new C1004zoijcleaow(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f42521jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f42522yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Object[] f42523zdlpuopuiu;

    public static final class iobyxmoadg extends hg.nufgyqmvbu implements List, RandomAccess, Serializable, ug.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final zoijcleaow f42524cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final iobyxmoadg f42525iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f42526jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f42527yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private Object[] f42528zdlpuopuiu;

        /* JADX INFO: renamed from: ig.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static final class C1003iobyxmoadg implements ListIterator, ug.iobyxmoadg {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            private int f42529iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            private int f42530jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private int f42531yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private final iobyxmoadg f42532zdlpuopuiu;

            public C1003iobyxmoadg(iobyxmoadg list, int i13) {
                zdlpuopuiu.btonecajqb(list, "list");
                this.f42532zdlpuopuiu = list;
                this.f42531yggfygwlhe = i13;
                this.f42530jyumaefscl = -1;
                this.f42529iwizpuwonk = ((AbstractList) list).modCount;
            }

            private final void iobyxmoadg() {
                if (((AbstractList) this.f42532zdlpuopuiu.f42524cqumvgiudr).modCount != this.f42529iwizpuwonk) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                iobyxmoadg();
                iobyxmoadg iobyxmoadgVar = this.f42532zdlpuopuiu;
                int i13 = this.f42531yggfygwlhe;
                this.f42531yggfygwlhe = i13 + 1;
                iobyxmoadgVar.add(i13, obj);
                this.f42530jyumaefscl = -1;
                this.f42529iwizpuwonk = ((AbstractList) this.f42532zdlpuopuiu).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f42531yggfygwlhe < this.f42532zdlpuopuiu.f42526jyumaefscl;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f42531yggfygwlhe > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                iobyxmoadg();
                if (this.f42531yggfygwlhe >= this.f42532zdlpuopuiu.f42526jyumaefscl) {
                    throw new NoSuchElementException();
                }
                int i13 = this.f42531yggfygwlhe;
                this.f42531yggfygwlhe = i13 + 1;
                this.f42530jyumaefscl = i13;
                return this.f42532zdlpuopuiu.f42528zdlpuopuiu[this.f42532zdlpuopuiu.f42527yggfygwlhe + this.f42530jyumaefscl];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f42531yggfygwlhe;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                iobyxmoadg();
                int i13 = this.f42531yggfygwlhe;
                if (i13 <= 0) {
                    throw new NoSuchElementException();
                }
                int i14 = i13 - 1;
                this.f42531yggfygwlhe = i14;
                this.f42530jyumaefscl = i14;
                return this.f42532zdlpuopuiu.f42528zdlpuopuiu[this.f42532zdlpuopuiu.f42527yggfygwlhe + this.f42530jyumaefscl];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f42531yggfygwlhe - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                iobyxmoadg();
                int i13 = this.f42530jyumaefscl;
                if (i13 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f42532zdlpuopuiu.remove(i13);
                this.f42531yggfygwlhe = this.f42530jyumaefscl;
                this.f42530jyumaefscl = -1;
                this.f42529iwizpuwonk = ((AbstractList) this.f42532zdlpuopuiu).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                iobyxmoadg();
                int i13 = this.f42530jyumaefscl;
                if (i13 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f42532zdlpuopuiu.set(i13, obj);
            }
        }

        public iobyxmoadg(Object[] backing, int i13, int i14, iobyxmoadg iobyxmoadgVar, zoijcleaow root) {
            zdlpuopuiu.btonecajqb(backing, "backing");
            zdlpuopuiu.btonecajqb(root, "root");
            this.f42528zdlpuopuiu = backing;
            this.f42527yggfygwlhe = i13;
            this.f42526jyumaefscl = i14;
            this.f42525iwizpuwonk = iobyxmoadgVar;
            this.f42524cqumvgiudr = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final boolean cqumvgiudr() {
            return this.f42524cqumvgiudr.f42521jyumaefscl;
        }

        private final int istkbnxepw(int i13, int i14, Collection collection, boolean z13) {
            iobyxmoadg iobyxmoadgVar = this.f42525iwizpuwonk;
            int iIstkbnxepw = iobyxmoadgVar != null ? iobyxmoadgVar.istkbnxepw(i13, i14, collection, z13) : this.f42524cqumvgiudr.jpowsppfya(i13, i14, collection, z13);
            if (iIstkbnxepw > 0) {
                lereixgezr();
            }
            this.f42526jyumaefscl -= iIstkbnxepw;
            return iIstkbnxepw;
        }

        private final boolean jyumaefscl(List list) {
            return ig.ppxfxbqfkf.nufgyqmvbu(this.f42528zdlpuopuiu, this.f42527yggfygwlhe, this.f42526jyumaefscl, list);
        }

        private final void kcexrzcfyt() {
            if (((AbstractList) this.f42524cqumvgiudr).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void lereixgezr() {
            ((AbstractList) this).modCount++;
        }

        private final Object pmvmpeiblj(int i13) {
            lereixgezr();
            iobyxmoadg iobyxmoadgVar = this.f42525iwizpuwonk;
            Object objPmvmpeiblj = iobyxmoadgVar != null ? iobyxmoadgVar.pmvmpeiblj(i13) : this.f42524cqumvgiudr.ylkuphrtab(i13);
            this.f42526jyumaefscl--;
            return objPmvmpeiblj;
        }

        private final void rgvfuqvkyq(int i13, Collection collection, int i14) {
            lereixgezr();
            iobyxmoadg iobyxmoadgVar = this.f42525iwizpuwonk;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.rgvfuqvkyq(i13, collection, i14);
            } else {
                this.f42524cqumvgiudr.jyumaefscl(i13, collection, i14);
            }
            this.f42528zdlpuopuiu = this.f42524cqumvgiudr.f42523zdlpuopuiu;
            this.f42526jyumaefscl += i14;
        }

        private final void vdvldrhtss(int i13, Object obj) {
            lereixgezr();
            iobyxmoadg iobyxmoadgVar = this.f42525iwizpuwonk;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.vdvldrhtss(i13, obj);
            } else {
                this.f42524cqumvgiudr.cqumvgiudr(i13, obj);
            }
            this.f42528zdlpuopuiu = this.f42524cqumvgiudr.f42523zdlpuopuiu;
            this.f42526jyumaefscl++;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (cqumvgiudr()) {
                return new nufgyqmvbu(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        private final void zdlpuopuiu() {
            if (cqumvgiudr()) {
                throw new UnsupportedOperationException();
            }
        }

        private final void zynmafqrjb(int i13, int i14) {
            if (i14 > 0) {
                lereixgezr();
            }
            iobyxmoadg iobyxmoadgVar = this.f42525iwizpuwonk;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.zynmafqrjb(i13, i14);
            } else {
                this.f42524cqumvgiudr.hcddaimhww(i13, i14);
            }
            this.f42526jyumaefscl -= i14;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            zdlpuopuiu();
            kcexrzcfyt();
            vdvldrhtss(this.f42527yggfygwlhe + this.f42526jyumaefscl, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            zdlpuopuiu.btonecajqb(elements, "elements");
            zdlpuopuiu();
            kcexrzcfyt();
            int size = elements.size();
            rgvfuqvkyq(this.f42527yggfygwlhe + this.f42526jyumaefscl, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            zdlpuopuiu();
            kcexrzcfyt();
            zynmafqrjb(this.f42527yggfygwlhe, this.f42526jyumaefscl);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            kcexrzcfyt();
            return obj == this || ((obj instanceof List) && jyumaefscl((List) obj));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i13) {
            kcexrzcfyt();
            hg.wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, this.f42526jyumaefscl);
            return this.f42528zdlpuopuiu[this.f42527yggfygwlhe + i13];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            kcexrzcfyt();
            return ig.ppxfxbqfkf.dxjokdxxww(this.f42528zdlpuopuiu, this.f42527yggfygwlhe, this.f42526jyumaefscl);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            kcexrzcfyt();
            for (int i13 = 0; i13 < this.f42526jyumaefscl; i13++) {
                if (zdlpuopuiu.eablkybsjg(this.f42528zdlpuopuiu[this.f42527yggfygwlhe + i13], obj)) {
                    return i13;
                }
            }
            return -1;
        }

        @Override // hg.nufgyqmvbu
        public int iobyxmoadg() {
            kcexrzcfyt();
            return this.f42526jyumaefscl;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            kcexrzcfyt();
            return this.f42526jyumaefscl == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            kcexrzcfyt();
            for (int i13 = this.f42526jyumaefscl - 1; i13 >= 0; i13--) {
                if (zdlpuopuiu.eablkybsjg(this.f42528zdlpuopuiu[this.f42527yggfygwlhe + i13], obj)) {
                    return i13;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            zdlpuopuiu();
            kcexrzcfyt();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            zdlpuopuiu.btonecajqb(elements, "elements");
            zdlpuopuiu();
            kcexrzcfyt();
            return istkbnxepw(this.f42527yggfygwlhe, this.f42526jyumaefscl, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            zdlpuopuiu.btonecajqb(elements, "elements");
            zdlpuopuiu();
            kcexrzcfyt();
            return istkbnxepw(this.f42527yggfygwlhe, this.f42526jyumaefscl, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i13, Object obj) {
            zdlpuopuiu();
            kcexrzcfyt();
            hg.wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, this.f42526jyumaefscl);
            Object[] objArr = this.f42528zdlpuopuiu;
            int i14 = this.f42527yggfygwlhe;
            Object obj2 = objArr[i14 + i13];
            objArr[i14 + i13] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i13, int i14) {
            hg.wkgbmnqykc.f40274zdlpuopuiu.wkgbmnqykc(i13, i14, this.f42526jyumaefscl);
            return new iobyxmoadg(this.f42528zdlpuopuiu, this.f42527yggfygwlhe + i13, i14 - i13, this, this.f42524cqumvgiudr);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            zdlpuopuiu.btonecajqb(array, "array");
            kcexrzcfyt();
            int length = array.length;
            int i13 = this.f42526jyumaefscl;
            if (length >= i13) {
                Object[] objArr = this.f42528zdlpuopuiu;
                int i14 = this.f42527yggfygwlhe;
                agtfadlqog.agtfadlqog(objArr, array, 0, i14, i13 + i14);
                return jyumaefscl.gxszxtbevo(this.f42526jyumaefscl, array);
            }
            Object[] objArr2 = this.f42528zdlpuopuiu;
            int i15 = this.f42527yggfygwlhe;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i15, i13 + i15, array.getClass());
            zdlpuopuiu.dxjokdxxww(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            kcexrzcfyt();
            return ig.ppxfxbqfkf.btonecajqb(this.f42528zdlpuopuiu, this.f42527yggfygwlhe, this.f42526jyumaefscl, this);
        }

        @Override // hg.nufgyqmvbu
        public Object wkgbmnqykc(int i13) {
            zdlpuopuiu();
            kcexrzcfyt();
            hg.wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, this.f42526jyumaefscl);
            return pmvmpeiblj(this.f42527yggfygwlhe + i13);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i13) {
            kcexrzcfyt();
            hg.wkgbmnqykc.f40274zdlpuopuiu.ppxfxbqfkf(i13, this.f42526jyumaefscl);
            return new C1003iobyxmoadg(this, i13);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i13, Object obj) {
            zdlpuopuiu();
            kcexrzcfyt();
            hg.wkgbmnqykc.f40274zdlpuopuiu.ppxfxbqfkf(i13, this.f42526jyumaefscl);
            vdvldrhtss(this.f42527yggfygwlhe + i13, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i13, Collection elements) {
            zdlpuopuiu.btonecajqb(elements, "elements");
            zdlpuopuiu();
            kcexrzcfyt();
            hg.wkgbmnqykc.f40274zdlpuopuiu.ppxfxbqfkf(i13, this.f42526jyumaefscl);
            int size = elements.size();
            rgvfuqvkyq(this.f42527yggfygwlhe + i13, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            kcexrzcfyt();
            Object[] objArr = this.f42528zdlpuopuiu;
            int i13 = this.f42527yggfygwlhe;
            return agtfadlqog.yggfygwlhe(objArr, i13, this.f42526jyumaefscl + i13);
        }
    }

    private static final class ppxfxbqfkf implements ListIterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f42533iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f42534jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f42535yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final zoijcleaow f42536zdlpuopuiu;

        public ppxfxbqfkf(zoijcleaow list, int i13) {
            zdlpuopuiu.btonecajqb(list, "list");
            this.f42536zdlpuopuiu = list;
            this.f42535yggfygwlhe = i13;
            this.f42534jyumaefscl = -1;
            this.f42533iwizpuwonk = ((AbstractList) list).modCount;
        }

        private final void iobyxmoadg() {
            if (((AbstractList) this.f42536zdlpuopuiu).modCount != this.f42533iwizpuwonk) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            iobyxmoadg();
            zoijcleaow zoijcleaowVar = this.f42536zdlpuopuiu;
            int i13 = this.f42535yggfygwlhe;
            this.f42535yggfygwlhe = i13 + 1;
            zoijcleaowVar.add(i13, obj);
            this.f42534jyumaefscl = -1;
            this.f42533iwizpuwonk = ((AbstractList) this.f42536zdlpuopuiu).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f42535yggfygwlhe < this.f42536zdlpuopuiu.f42522yggfygwlhe;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f42535yggfygwlhe > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            iobyxmoadg();
            if (this.f42535yggfygwlhe >= this.f42536zdlpuopuiu.f42522yggfygwlhe) {
                throw new NoSuchElementException();
            }
            int i13 = this.f42535yggfygwlhe;
            this.f42535yggfygwlhe = i13 + 1;
            this.f42534jyumaefscl = i13;
            return this.f42536zdlpuopuiu.f42523zdlpuopuiu[this.f42534jyumaefscl];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f42535yggfygwlhe;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            iobyxmoadg();
            int i13 = this.f42535yggfygwlhe;
            if (i13 <= 0) {
                throw new NoSuchElementException();
            }
            int i14 = i13 - 1;
            this.f42535yggfygwlhe = i14;
            this.f42534jyumaefscl = i14;
            return this.f42536zdlpuopuiu.f42523zdlpuopuiu[this.f42534jyumaefscl];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f42535yggfygwlhe - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            iobyxmoadg();
            int i13 = this.f42534jyumaefscl;
            if (i13 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f42536zdlpuopuiu.remove(i13);
            this.f42535yggfygwlhe = this.f42534jyumaefscl;
            this.f42534jyumaefscl = -1;
            this.f42533iwizpuwonk = ((AbstractList) this.f42536zdlpuopuiu).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            iobyxmoadg();
            int i13 = this.f42534jyumaefscl;
            if (i13 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f42536zdlpuopuiu.set(i13, obj);
        }
    }

    /* JADX INFO: renamed from: ig.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private static final class C1004zoijcleaow {
        public /* synthetic */ C1004zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1004zoijcleaow() {
        }
    }

    static {
        zoijcleaow zoijcleaowVar = new zoijcleaow(0);
        zoijcleaowVar.f42521jyumaefscl = true;
        f42519cqumvgiudr = zoijcleaowVar;
    }

    public zoijcleaow(int i13) {
        this.f42523zdlpuopuiu = ig.ppxfxbqfkf.wkgbmnqykc(i13);
    }

    private final void cdpycssgdh(int i13) {
        istkbnxepw(this.f42522yggfygwlhe + i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cqumvgiudr(int i13, Object obj) {
        wwaezpbzkn();
        lmojexxdyd(i13, 1);
        this.f42523zdlpuopuiu[i13] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hcddaimhww(int i13, int i14) {
        if (i14 > 0) {
            wwaezpbzkn();
        }
        Object[] objArr = this.f42523zdlpuopuiu;
        agtfadlqog.agtfadlqog(objArr, objArr, i13, i13 + i14, this.f42522yggfygwlhe);
        Object[] objArr2 = this.f42523zdlpuopuiu;
        int i15 = this.f42522yggfygwlhe;
        ig.ppxfxbqfkf.lqeggnwhkg(objArr2, i15 - i14, i15);
        this.f42522yggfygwlhe -= i14;
    }

    private final void istkbnxepw(int i13) {
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f42523zdlpuopuiu;
        if (i13 > objArr.length) {
            this.f42523zdlpuopuiu = ig.ppxfxbqfkf.eablkybsjg(this.f42523zdlpuopuiu, hg.wkgbmnqykc.f40274zdlpuopuiu.eablkybsjg(objArr.length, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int jpowsppfya(int i13, int i14, Collection collection, boolean z13) {
        int i15 = 0;
        int i16 = 0;
        while (i15 < i14) {
            int i17 = i13 + i15;
            if (collection.contains(this.f42523zdlpuopuiu[i17]) == z13) {
                Object[] objArr = this.f42523zdlpuopuiu;
                i15++;
                objArr[i16 + i13] = objArr[i17];
                i16++;
            } else {
                i15++;
            }
        }
        int i18 = i14 - i16;
        Object[] objArr2 = this.f42523zdlpuopuiu;
        agtfadlqog.agtfadlqog(objArr2, objArr2, i13 + i16, i14 + i13, this.f42522yggfygwlhe);
        Object[] objArr3 = this.f42523zdlpuopuiu;
        int i19 = this.f42522yggfygwlhe;
        ig.ppxfxbqfkf.lqeggnwhkg(objArr3, i19 - i18, i19);
        if (i18 > 0) {
            wwaezpbzkn();
        }
        this.f42522yggfygwlhe -= i18;
        return i18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jyumaefscl(int i13, Collection collection, int i14) {
        wwaezpbzkn();
        lmojexxdyd(i13, i14);
        Iterator it = collection.iterator();
        for (int i15 = 0; i15 < i14; i15++) {
            this.f42523zdlpuopuiu[i13 + i15] = it.next();
        }
    }

    private final void lmojexxdyd(int i13, int i14) {
        cdpycssgdh(i14);
        Object[] objArr = this.f42523zdlpuopuiu;
        agtfadlqog.agtfadlqog(objArr, objArr, i13 + i14, i13, this.f42522yggfygwlhe);
        this.f42522yggfygwlhe += i14;
    }

    private final void pmvmpeiblj() {
        if (this.f42521jyumaefscl) {
            throw new UnsupportedOperationException();
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f42521jyumaefscl) {
            return new nufgyqmvbu(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    private final void wwaezpbzkn() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ylkuphrtab(int i13) {
        wwaezpbzkn();
        Object[] objArr = this.f42523zdlpuopuiu;
        Object obj = objArr[i13];
        agtfadlqog.agtfadlqog(objArr, objArr, i13, i13 + 1, this.f42522yggfygwlhe);
        ig.ppxfxbqfkf.gxszxtbevo(this.f42523zdlpuopuiu, this.f42522yggfygwlhe - 1);
        this.f42522yggfygwlhe--;
        return obj;
    }

    private final boolean zynmafqrjb(List list) {
        return ig.ppxfxbqfkf.nufgyqmvbu(this.f42523zdlpuopuiu, 0, this.f42522yggfygwlhe, list);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        pmvmpeiblj();
        cqumvgiudr(this.f42522yggfygwlhe, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        pmvmpeiblj();
        int size = elements.size();
        jyumaefscl(this.f42522yggfygwlhe, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        pmvmpeiblj();
        hcddaimhww(0, this.f42522yggfygwlhe);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && zynmafqrjb((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i13) {
        hg.wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, this.f42522yggfygwlhe);
        return this.f42523zdlpuopuiu[i13];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return ig.ppxfxbqfkf.dxjokdxxww(this.f42523zdlpuopuiu, 0, this.f42522yggfygwlhe);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i13 = 0; i13 < this.f42522yggfygwlhe; i13++) {
            if (zdlpuopuiu.eablkybsjg(this.f42523zdlpuopuiu[i13], obj)) {
                return i13;
            }
        }
        return -1;
    }

    @Override // hg.nufgyqmvbu
    public int iobyxmoadg() {
        return this.f42522yggfygwlhe;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f42522yggfygwlhe == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i13 = this.f42522yggfygwlhe - 1; i13 >= 0; i13--) {
            if (zdlpuopuiu.eablkybsjg(this.f42523zdlpuopuiu[i13], obj)) {
                return i13;
            }
        }
        return -1;
    }

    public final List lereixgezr() {
        pmvmpeiblj();
        this.f42521jyumaefscl = true;
        return this.f42522yggfygwlhe > 0 ? this : f42519cqumvgiudr;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        pmvmpeiblj();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        pmvmpeiblj();
        return jpowsppfya(0, this.f42522yggfygwlhe, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        pmvmpeiblj();
        return jpowsppfya(0, this.f42522yggfygwlhe, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i13, Object obj) {
        pmvmpeiblj();
        hg.wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, this.f42522yggfygwlhe);
        Object[] objArr = this.f42523zdlpuopuiu;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i13, int i14) {
        hg.wkgbmnqykc.f40274zdlpuopuiu.wkgbmnqykc(i13, i14, this.f42522yggfygwlhe);
        return new iobyxmoadg(this.f42523zdlpuopuiu, i13, i14 - i13, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        zdlpuopuiu.btonecajqb(array, "array");
        int length = array.length;
        int i13 = this.f42522yggfygwlhe;
        if (length >= i13) {
            agtfadlqog.agtfadlqog(this.f42523zdlpuopuiu, array, 0, 0, i13);
            return jyumaefscl.gxszxtbevo(this.f42522yggfygwlhe, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f42523zdlpuopuiu, 0, i13, array.getClass());
        zdlpuopuiu.dxjokdxxww(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return ig.ppxfxbqfkf.btonecajqb(this.f42523zdlpuopuiu, 0, this.f42522yggfygwlhe, this);
    }

    @Override // hg.nufgyqmvbu
    public Object wkgbmnqykc(int i13) {
        pmvmpeiblj();
        hg.wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, this.f42522yggfygwlhe);
        return ylkuphrtab(i13);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i13) {
        hg.wkgbmnqykc.f40274zdlpuopuiu.ppxfxbqfkf(i13, this.f42522yggfygwlhe);
        return new ppxfxbqfkf(this, i13);
    }

    public /* synthetic */ zoijcleaow(int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 10 : i13);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i13, Object obj) {
        pmvmpeiblj();
        hg.wkgbmnqykc.f40274zdlpuopuiu.ppxfxbqfkf(i13, this.f42522yggfygwlhe);
        cqumvgiudr(i13, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i13, Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        pmvmpeiblj();
        hg.wkgbmnqykc.f40274zdlpuopuiu.ppxfxbqfkf(i13, this.f42522yggfygwlhe);
        int size = elements.size();
        jyumaefscl(i13, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return agtfadlqog.yggfygwlhe(this.f42523zdlpuopuiu, 0, this.f42522yggfygwlhe);
    }
}
