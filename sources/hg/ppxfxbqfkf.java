package hg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f40260yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f40261zdlpuopuiu;

    private final boolean wkgbmnqykc() {
        this.f40261zdlpuopuiu = 3;
        iobyxmoadg();
        return this.f40261zdlpuopuiu == 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i13 = this.f40261zdlpuopuiu;
        if (i13 == 0) {
            return wkgbmnqykc();
        }
        if (i13 == 1) {
            return true;
        }
        if (i13 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    protected abstract void iobyxmoadg();

    @Override // java.util.Iterator
    public Object next() {
        int i13 = this.f40261zdlpuopuiu;
        if (i13 == 1) {
            this.f40261zdlpuopuiu = 0;
            return this.f40260yggfygwlhe;
        }
        if (i13 == 2 || !wkgbmnqykc()) {
            throw new NoSuchElementException();
        }
        this.f40261zdlpuopuiu = 0;
        return this.f40260yggfygwlhe;
    }

    protected final void ppxfxbqfkf(Object obj) {
        this.f40260yggfygwlhe = obj;
        this.f40261zdlpuopuiu = 1;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected final void zoijcleaow() {
        this.f40261zdlpuopuiu = 2;
    }
}
