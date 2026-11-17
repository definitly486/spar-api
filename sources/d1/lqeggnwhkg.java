package d1;

/* JADX INFO: loaded from: classes.dex */
class lqeggnwhkg extends gxszxtbevo {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public int f26621wflxmlrfwp;

    lqeggnwhkg(rgvfuqvkyq rgvfuqvkyqVar) {
        super(rgvfuqvkyqVar);
        if (rgvfuqvkyqVar instanceof draadjrbmk) {
            this.f26603eablkybsjg = gxszxtbevo.iobyxmoadg.HORIZONTAL_DIMENSION;
        } else {
            this.f26603eablkybsjg = gxszxtbevo.iobyxmoadg.VERTICAL_DIMENSION;
        }
    }

    @Override // d1.gxszxtbevo
    public void wkgbmnqykc(int i13) {
        if (this.f26600btonecajqb) {
            return;
        }
        this.f26600btonecajqb = true;
        this.f26607lqeggnwhkg = i13;
        for (wkgbmnqykc wkgbmnqykcVar : this.f26604gtknphoqwx) {
            wkgbmnqykcVar.iobyxmoadg(wkgbmnqykcVar);
        }
    }
}
