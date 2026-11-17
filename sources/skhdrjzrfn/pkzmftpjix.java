package skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
public final class pkzmftpjix {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f107523lqeggnwhkg = j0.f.f50196lqeggnwhkg;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f107524eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final j0.f f107525gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f107526iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f107527ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f107528wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f107529zoijcleaow;

    public pkzmftpjix(long j13, int i13, int i14, int i15, int i16, j0.f fVar) {
        this.f107526iobyxmoadg = j13;
        this.f107529zoijcleaow = i13;
        this.f107527ppxfxbqfkf = i14;
        this.f107528wkgbmnqykc = i15;
        this.f107524eablkybsjg = i16;
        this.f107525gxszxtbevo = fVar;
    }

    private final v0.dxjokdxxww btonecajqb() {
        return ikoacuggdj.iobyxmoadg(this.f107525gxszxtbevo, this.f107527ppxfxbqfkf);
    }

    private final v0.dxjokdxxww zoijcleaow() {
        return ikoacuggdj.iobyxmoadg(this.f107525gxszxtbevo, this.f107528wkgbmnqykc);
    }

    public final int draadjrbmk() {
        return ppxfxbqfkf().length();
    }

    public final int dxjokdxxww() {
        return this.f107529zoijcleaow;
    }

    public final int eablkybsjg() {
        return this.f107528wkgbmnqykc;
    }

    public final j0.f gtknphoqwx() {
        return this.f107525gxszxtbevo;
    }

    public final int gxszxtbevo() {
        return this.f107524eablkybsjg;
    }

    public final jpowsppfya.iobyxmoadg iobyxmoadg(int i13) {
        return new jpowsppfya.iobyxmoadg(ikoacuggdj.iobyxmoadg(this.f107525gxszxtbevo, i13), i13, this.f107526iobyxmoadg);
    }

    public final int lqeggnwhkg() {
        return this.f107527ppxfxbqfkf;
    }

    public final long nufgyqmvbu() {
        return this.f107526iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f107525gxszxtbevo.draadjrbmk().btonecajqb().btonecajqb();
    }

    public String toString() {
        return "SelectionInfo(id=" + this.f107526iobyxmoadg + ", range=(" + this.f107527ppxfxbqfkf + '-' + btonecajqb() + ',' + this.f107528wkgbmnqykc + '-' + zoijcleaow() + "), prevOffset=" + this.f107524eablkybsjg + ')';
    }

    public final boolean wflxmlrfwp(pkzmftpjix pkzmftpjixVar) {
        return (this.f107526iobyxmoadg == pkzmftpjixVar.f107526iobyxmoadg && this.f107527ppxfxbqfkf == pkzmftpjixVar.f107527ppxfxbqfkf && this.f107528wkgbmnqykc == pkzmftpjixVar.f107528wkgbmnqykc) ? false : true;
    }

    public final wflxmlrfwp wkgbmnqykc() {
        int i13 = this.f107527ppxfxbqfkf;
        int i14 = this.f107528wkgbmnqykc;
        if (i13 < i14) {
            return wflxmlrfwp.NOT_CROSSED;
        }
        return i13 > i14 ? wflxmlrfwp.CROSSED : wflxmlrfwp.COLLAPSED;
    }
}
