package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class iobyxmoadg extends sopmlzcsov {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f23662yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f23663zdlpuopuiu;

    protected iobyxmoadg(int i13, int i14) {
        xa.draadjrbmk.draadjrbmk(i14, i13);
        this.f23663zdlpuopuiu = i13;
        this.f23662yggfygwlhe = i14;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f23662yggfygwlhe < this.f23663zdlpuopuiu;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23662yggfygwlhe > 0;
    }

    protected abstract Object iobyxmoadg(int i13);

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f23662yggfygwlhe;
        this.f23662yggfygwlhe = i13 + 1;
        return iobyxmoadg(i13);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23662yggfygwlhe;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f23662yggfygwlhe - 1;
        this.f23662yggfygwlhe = i13;
        return iobyxmoadg(i13);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23662yggfygwlhe - 1;
    }
}
