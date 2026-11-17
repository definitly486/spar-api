package p8;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg extends g9.nufgyqmvbu implements nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private nufgyqmvbu.iobyxmoadg f76001eablkybsjg;

    public lqeggnwhkg(long j13) {
        super(j13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g9.nufgyqmvbu
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public int dxjokdxxww(n8.ppxfxbqfkf ppxfxbqfkfVar) {
        return ppxfxbqfkfVar == null ? super.dxjokdxxww(null) : ppxfxbqfkfVar.getSize();
    }

    @Override // p8.nufgyqmvbu
    public void eablkybsjg(nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        this.f76001eablkybsjg = iobyxmoadgVar;
    }

    @Override // p8.nufgyqmvbu
    public void iobyxmoadg(int i13) {
        if (i13 >= 40) {
            zoijcleaow();
        } else if (i13 >= 20 || i13 == 15) {
            wflxmlrfwp(nufgyqmvbu() / 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g9.nufgyqmvbu
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(l8.eablkybsjg eablkybsjgVar, n8.ppxfxbqfkf ppxfxbqfkfVar) {
        nufgyqmvbu.iobyxmoadg iobyxmoadgVar = this.f76001eablkybsjg;
        if (iobyxmoadgVar == null || ppxfxbqfkfVar == null) {
            return;
        }
        iobyxmoadgVar.iobyxmoadg(ppxfxbqfkfVar);
    }

    @Override // p8.nufgyqmvbu
    public /* bridge */ /* synthetic */ n8.ppxfxbqfkf ppxfxbqfkf(l8.eablkybsjg eablkybsjgVar, n8.ppxfxbqfkf ppxfxbqfkfVar) {
        return (n8.ppxfxbqfkf) super.gtknphoqwx(eablkybsjgVar, ppxfxbqfkfVar);
    }

    @Override // p8.nufgyqmvbu
    public /* bridge */ /* synthetic */ n8.ppxfxbqfkf wkgbmnqykc(l8.eablkybsjg eablkybsjgVar) {
        return (n8.ppxfxbqfkf) super.draadjrbmk(eablkybsjgVar);
    }
}
