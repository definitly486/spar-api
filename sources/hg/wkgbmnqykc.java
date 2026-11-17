package hg;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc extends hg.zoijcleaow implements List, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f40274zdlpuopuiu = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int eablkybsjg(int i13, int i14) {
            int i15 = i13 + (i13 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - 2147483639 > 0) {
                return i14 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            return i15;
        }

        public final boolean gxszxtbevo(Collection c13, Collection other) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
            if (c13.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c13.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final void iobyxmoadg(int i13, int i14, int i15) {
            if (i13 < 0 || i14 > i15) {
                throw new IndexOutOfBoundsException("startIndex: " + i13 + ", endIndex: " + i14 + ", size: " + i15);
            }
            if (i13 <= i14) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i13 + " > endIndex: " + i14);
        }

        public final int lqeggnwhkg(Collection c13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
            Iterator it = c13.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public final void ppxfxbqfkf(int i13, int i14) {
            if (i13 < 0 || i13 > i14) {
                throw new IndexOutOfBoundsException("index: " + i13 + ", size: " + i14);
            }
        }

        public final void wkgbmnqykc(int i13, int i14, int i15) {
            if (i13 < 0 || i14 > i15) {
                throw new IndexOutOfBoundsException("fromIndex: " + i13 + ", toIndex: " + i14 + ", size: " + i15);
            }
            if (i13 <= i14) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i13 + " > toIndex: " + i14);
        }

        public final void zoijcleaow(int i13, int i14) {
            if (i13 < 0 || i13 >= i14) {
                throw new IndexOutOfBoundsException("index: " + i13 + ", size: " + i14);
            }
        }

        private iobyxmoadg() {
        }
    }

    private class ppxfxbqfkf extends zoijcleaow implements ListIterator, ug.iobyxmoadg {
        public ppxfxbqfkf(int i13) {
            super();
            wkgbmnqykc.f40274zdlpuopuiu.ppxfxbqfkf(i13, wkgbmnqykc.this.size());
            zoijcleaow(i13);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return iobyxmoadg() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return iobyxmoadg();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
            zoijcleaow(iobyxmoadg() - 1);
            return wkgbmnqykcVar.get(iobyxmoadg());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return iobyxmoadg() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: hg.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    private static final class C0933wkgbmnqykc extends wkgbmnqykc implements RandomAccess {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f40276iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final int f40277jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final wkgbmnqykc f40278yggfygwlhe;

        public C0933wkgbmnqykc(wkgbmnqykc list, int i13, int i14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "list");
            this.f40278yggfygwlhe = list;
            this.f40277jyumaefscl = i13;
            wkgbmnqykc.f40274zdlpuopuiu.wkgbmnqykc(i13, i14, list.size());
            this.f40276iwizpuwonk = i14 - i13;
        }

        @Override // hg.wkgbmnqykc, java.util.List
        public Object get(int i13) {
            wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, this.f40276iwizpuwonk);
            return this.f40278yggfygwlhe.get(this.f40277jyumaefscl + i13);
        }

        @Override // hg.zoijcleaow
        public int wkgbmnqykc() {
            return this.f40276iwizpuwonk;
        }
    }

    private class zoijcleaow implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f40280zdlpuopuiu;

        public zoijcleaow() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40280zdlpuopuiu < wkgbmnqykc.this.size();
        }

        protected final int iobyxmoadg() {
            return this.f40280zdlpuopuiu;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
            int i13 = this.f40280zdlpuopuiu;
            this.f40280zdlpuopuiu = i13 + 1;
            return wkgbmnqykcVar.get(i13);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        protected final void zoijcleaow(int i13) {
            this.f40280zdlpuopuiu = i13;
        }
    }

    protected wkgbmnqykc() {
    }

    @Override // java.util.List
    public void add(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f40274zdlpuopuiu.gxszxtbevo(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i13);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f40274zdlpuopuiu.lqeggnwhkg(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(it.next(), obj)) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new zoijcleaow();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new ppxfxbqfkf(0);
    }

    @Override // java.util.List
    public Object remove(int i13) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i13, int i14) {
        return new C0933wkgbmnqykc(this, i13, i14);
    }

    public ListIterator listIterator(int i13) {
        return new ppxfxbqfkf(i13);
    }
}
