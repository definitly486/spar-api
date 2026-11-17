package mhtqkkgtqm;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg implements ListIterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f67221yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f67222zdlpuopuiu;

    public iobyxmoadg(int i13, int i14) {
        this.f67222zdlpuopuiu = i13;
        this.f67221yggfygwlhe = i14;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void eablkybsjg(int i13) {
        this.f67222zdlpuopuiu = i13;
    }

    public final void gxszxtbevo(int i13) {
        this.f67221yggfygwlhe = i13;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f67222zdlpuopuiu < this.f67221yggfygwlhe;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f67222zdlpuopuiu > 0;
    }

    public final void iobyxmoadg() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f67222zdlpuopuiu;
    }

    public final int ppxfxbqfkf() {
        return this.f67222zdlpuopuiu;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f67222zdlpuopuiu - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int wkgbmnqykc() {
        return this.f67221yggfygwlhe;
    }

    public final void zoijcleaow() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }
}
