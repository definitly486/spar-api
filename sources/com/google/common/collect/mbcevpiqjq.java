package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
abstract class mbcevpiqjq implements Iterator {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final Iterator f23686zdlpuopuiu;

    mbcevpiqjq(Iterator it) {
        this.f23686zdlpuopuiu = (Iterator) xa.draadjrbmk.btonecajqb(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23686zdlpuopuiu.hasNext();
    }

    abstract Object iobyxmoadg(Object obj);

    @Override // java.util.Iterator
    public final Object next() {
        return iobyxmoadg(this.f23686zdlpuopuiu.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f23686zdlpuopuiu.remove();
    }
}
