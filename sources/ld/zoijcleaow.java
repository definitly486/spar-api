package ld;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final gd.iobyxmoadg f62130wkgbmnqykc = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f62131iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private o9.dxjokdxxww f62132ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tc.zoijcleaow f62133zoijcleaow;

    zoijcleaow(tc.zoijcleaow zoijcleaowVar, String str) {
        this.f62131iobyxmoadg = str;
        this.f62133zoijcleaow = zoijcleaowVar;
    }

    private boolean iobyxmoadg() {
        if (this.f62132ppxfxbqfkf == null) {
            o9.btonecajqb btonecajqbVar = (o9.btonecajqb) this.f62133zoijcleaow.get();
            if (btonecajqbVar != null) {
                this.f62132ppxfxbqfkf = btonecajqbVar.iobyxmoadg(this.f62131iobyxmoadg, nd.dxjokdxxww.class, o9.ppxfxbqfkf.zoijcleaow("proto"), new o9.nufgyqmvbu() { // from class: ld.iobyxmoadg
                    @Override // o9.nufgyqmvbu
                    public final Object apply(Object obj) {
                        return ((nd.dxjokdxxww) obj).toByteArray();
                    }
                });
            } else {
                f62130wkgbmnqykc.btonecajqb("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f62132ppxfxbqfkf != null;
    }

    public void zoijcleaow(nd.dxjokdxxww dxjokdxxwwVar) {
        if (iobyxmoadg()) {
            this.f62132ppxfxbqfkf.zoijcleaow(o9.wkgbmnqykc.gxszxtbevo(dxjokdxxwwVar));
        } else {
            f62130wkgbmnqykc.btonecajqb("Unable to dispatch event because Flg Transport is not available");
        }
    }
}
