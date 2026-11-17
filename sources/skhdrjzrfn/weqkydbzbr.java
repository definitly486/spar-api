package skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
final class weqkydbzbr implements okpsazkaxt {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f107643gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final pkzmftpjix f107644eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f107645iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f107646ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jpowsppfya f107647wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f107648zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public weqkydbzbr(boolean z13, int i13, int i14, jpowsppfya jpowsppfyaVar, pkzmftpjix pkzmftpjixVar) {
        this.f107645iobyxmoadg = z13;
        this.f107648zoijcleaow = i13;
        this.f107646ppxfxbqfkf = i14;
        this.f107647wkgbmnqykc = jpowsppfyaVar;
        this.f107644eablkybsjg = pkzmftpjixVar;
    }

    @Override // skhdrjzrfn.okpsazkaxt
    public pkzmftpjix btonecajqb() {
        return this.f107644eablkybsjg;
    }

    @Override // skhdrjzrfn.okpsazkaxt
    public boolean dxjokdxxww(okpsazkaxt okpsazkaxtVar) {
        if (lqeggnwhkg() != null && okpsazkaxtVar != null && (okpsazkaxtVar instanceof weqkydbzbr)) {
            weqkydbzbr weqkydbzbrVar = (weqkydbzbr) okpsazkaxtVar;
            if (gtknphoqwx() == weqkydbzbrVar.gtknphoqwx() && wkgbmnqykc() == weqkydbzbrVar.wkgbmnqykc() && iobyxmoadg() == weqkydbzbrVar.iobyxmoadg() && !this.f107644eablkybsjg.wflxmlrfwp(weqkydbzbrVar.f107644eablkybsjg)) {
                return false;
            }
        }
        return true;
    }

    @Override // skhdrjzrfn.okpsazkaxt
    public void eablkybsjg(tg.draadjrbmk draadjrbmkVar) {
    }

    @Override // skhdrjzrfn.okpsazkaxt
    public int getSize() {
        return 1;
    }

    @Override // skhdrjzrfn.okpsazkaxt
    public int gtknphoqwx() {
        return this.f107648zoijcleaow;
    }

    @Override // skhdrjzrfn.okpsazkaxt
    public wflxmlrfwp gxszxtbevo() {
        if (gtknphoqwx() < wkgbmnqykc()) {
            return wflxmlrfwp.NOT_CROSSED;
        }
        return gtknphoqwx() > wkgbmnqykc() ? wflxmlrfwp.CROSSED : this.f107644eablkybsjg.wkgbmnqykc();
    }

    @Override // skhdrjzrfn.okpsazkaxt
    public boolean iobyxmoadg() {
        return this.f107645iobyxmoadg;
    }

    @Override // skhdrjzrfn.okpsazkaxt
    public jpowsppfya lqeggnwhkg() {
        return this.f107647wkgbmnqykc;
    }

    @Override // skhdrjzrfn.okpsazkaxt
    public pkzmftpjix nufgyqmvbu() {
        return this.f107644eablkybsjg;
    }

    @Override // skhdrjzrfn.okpsazkaxt
    public pkzmftpjix ppxfxbqfkf() {
        return this.f107644eablkybsjg;
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + iobyxmoadg() + ", crossed=" + gxszxtbevo() + ", info=\n\t" + this.f107644eablkybsjg + ')';
    }

    @Override // skhdrjzrfn.okpsazkaxt
    public int wkgbmnqykc() {
        return this.f107646ppxfxbqfkf;
    }

    @Override // skhdrjzrfn.okpsazkaxt
    public pkzmftpjix zoijcleaow() {
        return this.f107644eablkybsjg;
    }
}
