package gg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class lereixgezr implements Collection, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final byte[] f37120zdlpuopuiu;

    private static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f37121yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final byte[] f37122zdlpuopuiu;

        public iobyxmoadg(byte[] array) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
            this.f37122zdlpuopuiu = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37121yggfygwlhe < this.f37122zdlpuopuiu.length;
        }

        public byte iobyxmoadg() {
            int i13 = this.f37121yggfygwlhe;
            byte[] bArr = this.f37122zdlpuopuiu;
            if (i13 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f37121yggfygwlhe));
            }
            this.f37121yggfygwlhe = i13 + 1;
            return esjtqupxsv.zoijcleaow(bArr[i13]);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return esjtqupxsv.iobyxmoadg(iobyxmoadg());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ lereixgezr(byte[] bArr) {
        this.f37120zdlpuopuiu = bArr;
    }

    public static boolean agtfadlqog(byte[] bArr) {
        return bArr.length == 0;
    }

    public static final byte btonecajqb(byte[] bArr, int i13) {
        return esjtqupxsv.zoijcleaow(bArr[i13]);
    }

    public static int draadjrbmk(byte[] bArr) {
        return bArr.length;
    }

    public static boolean dxjokdxxww(byte[] bArr, Object obj) {
        return (obj instanceof lereixgezr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bArr, ((lereixgezr) obj).oxmwwwfdhm());
    }

    public static boolean eablkybsjg(byte[] bArr, byte b13) {
        return hg.agtfadlqog.ribwqtqdhb(bArr, b13);
    }

    public static boolean gxszxtbevo(byte[] bArr, Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof esjtqupxsv) || !hg.agtfadlqog.ribwqtqdhb(bArr, ((esjtqupxsv) obj).gxszxtbevo())) {
                return false;
            }
        }
        return true;
    }

    public static final /* synthetic */ lereixgezr iobyxmoadg(byte[] bArr) {
        return new lereixgezr(bArr);
    }

    public static Iterator ojitshcjhn(byte[] bArr) {
        return new iobyxmoadg(bArr);
    }

    public static byte[] ppxfxbqfkf(byte[] storage) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storage, "storage");
        return storage;
    }

    public static final void rgvfuqvkyq(byte[] bArr, int i13, byte b13) {
        bArr[i13] = b13;
    }

    public static String vdvldrhtss(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public static int wflxmlrfwp(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static byte[] zoijcleaow(int i13) {
        return ppxfxbqfkf(new byte[i13]);
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
        if (obj instanceof esjtqupxsv) {
            return wkgbmnqykc(((esjtqupxsv) obj).gxszxtbevo());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return gxszxtbevo(this.f37120zdlpuopuiu, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return dxjokdxxww(this.f37120zdlpuopuiu, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public int size() {
        return draadjrbmk(this.f37120zdlpuopuiu);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return wflxmlrfwp(this.f37120zdlpuopuiu);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return agtfadlqog(this.f37120zdlpuopuiu);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return ojitshcjhn(this.f37120zdlpuopuiu);
    }

    public final /* synthetic */ byte[] oxmwwwfdhm() {
        return this.f37120zdlpuopuiu;
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
        return vdvldrhtss(this.f37120zdlpuopuiu);
    }

    public boolean wkgbmnqykc(byte b13) {
        return eablkybsjg(this.f37120zdlpuopuiu, b13);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, array);
    }
}
