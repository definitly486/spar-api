package gg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class zynmafqrjb implements Collection, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int[] f37150zdlpuopuiu;

    private static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f37151yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int[] f37152zdlpuopuiu;

        public iobyxmoadg(int[] array) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
            this.f37152zdlpuopuiu = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37151yggfygwlhe < this.f37152zdlpuopuiu.length;
        }

        public int iobyxmoadg() {
            int i13 = this.f37151yggfygwlhe;
            int[] iArr = this.f37152zdlpuopuiu;
            if (i13 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f37151yggfygwlhe));
            }
            this.f37151yggfygwlhe = i13 + 1;
            return pmvmpeiblj.zoijcleaow(iArr[i13]);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return pmvmpeiblj.iobyxmoadg(iobyxmoadg());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ zynmafqrjb(int[] iArr) {
        this.f37150zdlpuopuiu = iArr;
    }

    public static boolean agtfadlqog(int[] iArr) {
        return iArr.length == 0;
    }

    public static final int btonecajqb(int[] iArr, int i13) {
        return pmvmpeiblj.zoijcleaow(iArr[i13]);
    }

    public static int draadjrbmk(int[] iArr) {
        return iArr.length;
    }

    public static boolean dxjokdxxww(int[] iArr, Object obj) {
        return (obj instanceof zynmafqrjb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iArr, ((zynmafqrjb) obj).oxmwwwfdhm());
    }

    public static boolean eablkybsjg(int[] iArr, int i13) {
        return hg.agtfadlqog.jhduphickx(iArr, i13);
    }

    public static boolean gxszxtbevo(int[] iArr, Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof pmvmpeiblj) || !hg.agtfadlqog.jhduphickx(iArr, ((pmvmpeiblj) obj).gxszxtbevo())) {
                return false;
            }
        }
        return true;
    }

    public static final /* synthetic */ zynmafqrjb iobyxmoadg(int[] iArr) {
        return new zynmafqrjb(iArr);
    }

    public static Iterator ojitshcjhn(int[] iArr) {
        return new iobyxmoadg(iArr);
    }

    public static int[] ppxfxbqfkf(int[] storage) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storage, "storage");
        return storage;
    }

    public static final void rgvfuqvkyq(int[] iArr, int i13, int i14) {
        iArr[i13] = i14;
    }

    public static String vdvldrhtss(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public static int wflxmlrfwp(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static int[] zoijcleaow(int i13) {
        return ppxfxbqfkf(new int[i13]);
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
        if (obj instanceof pmvmpeiblj) {
            return wkgbmnqykc(((pmvmpeiblj) obj).gxszxtbevo());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return gxszxtbevo(this.f37150zdlpuopuiu, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return dxjokdxxww(this.f37150zdlpuopuiu, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public int size() {
        return draadjrbmk(this.f37150zdlpuopuiu);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return wflxmlrfwp(this.f37150zdlpuopuiu);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return agtfadlqog(this.f37150zdlpuopuiu);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return ojitshcjhn(this.f37150zdlpuopuiu);
    }

    public final /* synthetic */ int[] oxmwwwfdhm() {
        return this.f37150zdlpuopuiu;
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
        return vdvldrhtss(this.f37150zdlpuopuiu);
    }

    public boolean wkgbmnqykc(int i13) {
        return eablkybsjg(this.f37150zdlpuopuiu, i13);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, array);
    }
}
