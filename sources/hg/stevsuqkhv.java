package hg;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class stevsuqkhv implements Iterator, ug.iobyxmoadg {
    public abstract int iobyxmoadg();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(iobyxmoadg());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
