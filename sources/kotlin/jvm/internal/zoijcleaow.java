package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class zoijcleaow implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f60039yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object[] f60040zdlpuopuiu;

    public zoijcleaow(Object[] array) {
        zdlpuopuiu.btonecajqb(array, "array");
        this.f60040zdlpuopuiu = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f60039yggfygwlhe < this.f60040zdlpuopuiu.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f60040zdlpuopuiu;
            int i13 = this.f60039yggfygwlhe;
            this.f60039yggfygwlhe = i13 + 1;
            return objArr[i13];
        } catch (ArrayIndexOutOfBoundsException e13) {
            this.f60039yggfygwlhe--;
            throw new NoSuchElementException(e13.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
