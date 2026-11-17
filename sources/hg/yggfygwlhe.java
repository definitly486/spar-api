package hg;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yggfygwlhe implements Iterator, ug.iobyxmoadg {
    public abstract char iobyxmoadg();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(iobyxmoadg());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
