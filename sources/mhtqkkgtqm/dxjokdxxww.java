package mhtqkkgtqm;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww extends iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final wflxmlrfwp f67213iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object[] f67214jyumaefscl;

    public dxjokdxxww(Object[] objArr, Object[] objArr2, int i13, int i14, int i15) {
        super(i13, i14);
        this.f67214jyumaefscl = objArr2;
        int iWkgbmnqykc = agtfadlqog.wkgbmnqykc(i14);
        this.f67213iwizpuwonk = new wflxmlrfwp(objArr, zg.gtknphoqwx.btonecajqb(i13, iWkgbmnqykc), iWkgbmnqykc, i15);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        iobyxmoadg();
        if (this.f67213iwizpuwonk.hasNext()) {
            eablkybsjg(ppxfxbqfkf() + 1);
            return this.f67213iwizpuwonk.next();
        }
        Object[] objArr = this.f67214jyumaefscl;
        int iPpxfxbqfkf = ppxfxbqfkf();
        eablkybsjg(iPpxfxbqfkf + 1);
        return objArr[iPpxfxbqfkf - this.f67213iwizpuwonk.wkgbmnqykc()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        zoijcleaow();
        if (ppxfxbqfkf() <= this.f67213iwizpuwonk.wkgbmnqykc()) {
            eablkybsjg(ppxfxbqfkf() - 1);
            return this.f67213iwizpuwonk.previous();
        }
        Object[] objArr = this.f67214jyumaefscl;
        eablkybsjg(ppxfxbqfkf() - 1);
        return objArr[ppxfxbqfkf() - this.f67213iwizpuwonk.wkgbmnqykc()];
    }
}
