package gg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class cdpycssgdh implements Collection, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long[] f37096zdlpuopuiu;

    private static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f37097yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final long[] f37098zdlpuopuiu;

        public iobyxmoadg(long[] array) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
            this.f37098zdlpuopuiu = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37097yggfygwlhe < this.f37098zdlpuopuiu.length;
        }

        public long iobyxmoadg() {
            int i13 = this.f37097yggfygwlhe;
            long[] jArr = this.f37098zdlpuopuiu;
            if (i13 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f37097yggfygwlhe));
            }
            this.f37097yggfygwlhe = i13 + 1;
            return istkbnxepw.zoijcleaow(jArr[i13]);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return istkbnxepw.iobyxmoadg(iobyxmoadg());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ cdpycssgdh(long[] jArr) {
        this.f37096zdlpuopuiu = jArr;
    }

    public static boolean agtfadlqog(long[] jArr) {
        return jArr.length == 0;
    }

    public static final long btonecajqb(long[] jArr, int i13) {
        return istkbnxepw.zoijcleaow(jArr[i13]);
    }

    public static int draadjrbmk(long[] jArr) {
        return jArr.length;
    }

    public static boolean dxjokdxxww(long[] jArr, Object obj) {
        return (obj instanceof cdpycssgdh) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jArr, ((cdpycssgdh) obj).oxmwwwfdhm());
    }

    public static boolean eablkybsjg(long[] jArr, long j13) {
        return hg.agtfadlqog.ikoacuggdj(jArr, j13);
    }

    public static boolean gxszxtbevo(long[] jArr, Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof istkbnxepw) || !hg.agtfadlqog.ikoacuggdj(jArr, ((istkbnxepw) obj).lqeggnwhkg())) {
                return false;
            }
        }
        return true;
    }

    public static final /* synthetic */ cdpycssgdh iobyxmoadg(long[] jArr) {
        return new cdpycssgdh(jArr);
    }

    public static Iterator ojitshcjhn(long[] jArr) {
        return new iobyxmoadg(jArr);
    }

    public static long[] ppxfxbqfkf(long[] storage) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storage, "storage");
        return storage;
    }

    public static final void rgvfuqvkyq(long[] jArr, int i13, long j13) {
        jArr[i13] = j13;
    }

    public static String vdvldrhtss(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public static int wflxmlrfwp(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static long[] zoijcleaow(int i13) {
        return ppxfxbqfkf(new long[i13]);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof istkbnxepw) {
            return wkgbmnqykc(((istkbnxepw) obj).lqeggnwhkg());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return gxszxtbevo(this.f37096zdlpuopuiu, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return dxjokdxxww(this.f37096zdlpuopuiu, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public int size() {
        return draadjrbmk(this.f37096zdlpuopuiu);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return wflxmlrfwp(this.f37096zdlpuopuiu);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return agtfadlqog(this.f37096zdlpuopuiu);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return ojitshcjhn(this.f37096zdlpuopuiu);
    }

    public final /* synthetic */ long[] oxmwwwfdhm() {
        return this.f37096zdlpuopuiu;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
    }

    public String toString() {
        return vdvldrhtss(this.f37096zdlpuopuiu);
    }

    public boolean wkgbmnqykc(long j13) {
        return eablkybsjg(this.f37096zdlpuopuiu, j13);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, array);
    }
}
