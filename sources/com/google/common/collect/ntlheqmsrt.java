package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
abstract class ntlheqmsrt extends mbcevpiqjq implements ListIterator {
    ntlheqmsrt(ListIterator listIterator) {
        super(listIterator);
    }

    private ListIterator zoijcleaow() {
        return (ListIterator) this.f23686zdlpuopuiu;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return zoijcleaow().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return zoijcleaow().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return iobyxmoadg(zoijcleaow().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return zoijcleaow().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
