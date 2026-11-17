package mhtqkkgtqm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc extends iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object[] f67235jyumaefscl;

    public wkgbmnqykc(Object[] objArr, int i13, int i14) {
        super(i13, i14);
        this.f67235jyumaefscl = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f67235jyumaefscl;
        int iPpxfxbqfkf = ppxfxbqfkf();
        eablkybsjg(iPpxfxbqfkf + 1);
        return objArr[iPpxfxbqfkf];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f67235jyumaefscl;
        eablkybsjg(ppxfxbqfkf() - 1);
        return objArr[ppxfxbqfkf()];
    }
}
