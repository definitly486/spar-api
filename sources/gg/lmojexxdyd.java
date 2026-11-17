package gg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class lmojexxdyd implements Collection, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final short[] f37123zdlpuopuiu;

    private static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f37124yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final short[] f37125zdlpuopuiu;

        public iobyxmoadg(short[] array) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
            this.f37125zdlpuopuiu = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37124yggfygwlhe < this.f37125zdlpuopuiu.length;
        }

        public short iobyxmoadg() {
            int i13 = this.f37124yggfygwlhe;
            short[] sArr = this.f37125zdlpuopuiu;
            if (i13 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f37124yggfygwlhe));
            }
            this.f37124yggfygwlhe = i13 + 1;
            return iozdgvuglv.zoijcleaow(sArr[i13]);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return iozdgvuglv.iobyxmoadg(iobyxmoadg());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ lmojexxdyd(short[] sArr) {
        this.f37123zdlpuopuiu = sArr;
    }

    public static boolean agtfadlqog(short[] sArr) {
        return sArr.length == 0;
    }

    public static final short btonecajqb(short[] sArr, int i13) {
        return iozdgvuglv.zoijcleaow(sArr[i13]);
    }

    public static int draadjrbmk(short[] sArr) {
        return sArr.length;
    }

    public static boolean dxjokdxxww(short[] sArr, Object obj) {
        return (obj instanceof lmojexxdyd) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(sArr, ((lmojexxdyd) obj).oxmwwwfdhm());
    }

    public static boolean eablkybsjg(short[] sArr, short s13) {
        return hg.agtfadlqog.jztzpxfvev(sArr, s13);
    }

    public static boolean gxszxtbevo(short[] sArr, Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof iozdgvuglv) || !hg.agtfadlqog.jztzpxfvev(sArr, ((iozdgvuglv) obj).gxszxtbevo())) {
                return false;
            }
        }
        return true;
    }

    public static final /* synthetic */ lmojexxdyd iobyxmoadg(short[] sArr) {
        return new lmojexxdyd(sArr);
    }

    public static Iterator ojitshcjhn(short[] sArr) {
        return new iobyxmoadg(sArr);
    }

    public static short[] ppxfxbqfkf(short[] storage) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storage, "storage");
        return storage;
    }

    public static final void rgvfuqvkyq(short[] sArr, int i13, short s13) {
        sArr[i13] = s13;
    }

    public static String vdvldrhtss(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public static int wflxmlrfwp(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static short[] zoijcleaow(int i13) {
        return ppxfxbqfkf(new short[i13]);
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
        if (obj instanceof iozdgvuglv) {
            return wkgbmnqykc(((iozdgvuglv) obj).gxszxtbevo());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return gxszxtbevo(this.f37123zdlpuopuiu, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return dxjokdxxww(this.f37123zdlpuopuiu, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public int size() {
        return draadjrbmk(this.f37123zdlpuopuiu);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return wflxmlrfwp(this.f37123zdlpuopuiu);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return agtfadlqog(this.f37123zdlpuopuiu);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return ojitshcjhn(this.f37123zdlpuopuiu);
    }

    public final /* synthetic */ short[] oxmwwwfdhm() {
        return this.f37123zdlpuopuiu;
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
        return vdvldrhtss(this.f37123zdlpuopuiu);
    }

    public boolean wkgbmnqykc(short s13) {
        return eablkybsjg(this.f37123zdlpuopuiu, s13);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, array);
    }
}
