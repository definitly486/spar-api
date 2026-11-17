package zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc extends jpowsppfya.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jpowsppfya.vdvldrhtss f131677iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f131678ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f131679wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya.vdvldrhtss f131680zoijcleaow;

    wkgbmnqykc(jpowsppfya.vdvldrhtss vdvldrhtssVar, jpowsppfya.vdvldrhtss vdvldrhtssVar2, int i13, int i14) {
        if (vdvldrhtssVar == null) {
            throw new NullPointerException("Null edge");
        }
        this.f131677iobyxmoadg = vdvldrhtssVar;
        if (vdvldrhtssVar2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.f131680zoijcleaow = vdvldrhtssVar2;
        this.f131678ppxfxbqfkf = i13;
        this.f131679wkgbmnqykc = i14;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jpowsppfya.iobyxmoadg)) {
            return false;
        }
        jpowsppfya.iobyxmoadg iobyxmoadgVar = (jpowsppfya.iobyxmoadg) obj;
        return this.f131677iobyxmoadg.equals(iobyxmoadgVar.iobyxmoadg()) && this.f131680zoijcleaow.equals(iobyxmoadgVar.wkgbmnqykc()) && this.f131678ppxfxbqfkf == iobyxmoadgVar.zoijcleaow() && this.f131679wkgbmnqykc == iobyxmoadgVar.ppxfxbqfkf();
    }

    public int hashCode() {
        return ((((((this.f131677iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f131680zoijcleaow.hashCode()) * 1000003) ^ this.f131678ppxfxbqfkf) * 1000003) ^ this.f131679wkgbmnqykc;
    }

    @Override // zynmafqrjb.jpowsppfya.iobyxmoadg
    jpowsppfya.vdvldrhtss iobyxmoadg() {
        return this.f131677iobyxmoadg;
    }

    @Override // zynmafqrjb.jpowsppfya.iobyxmoadg
    int ppxfxbqfkf() {
        return this.f131679wkgbmnqykc;
    }

    public String toString() {
        return "In{edge=" + this.f131677iobyxmoadg + ", postviewEdge=" + this.f131680zoijcleaow + ", inputFormat=" + this.f131678ppxfxbqfkf + ", outputFormat=" + this.f131679wkgbmnqykc + "}";
    }

    @Override // zynmafqrjb.jpowsppfya.iobyxmoadg
    jpowsppfya.vdvldrhtss wkgbmnqykc() {
        return this.f131680zoijcleaow;
    }

    @Override // zynmafqrjb.jpowsppfya.iobyxmoadg
    int zoijcleaow() {
        return this.f131678ppxfxbqfkf;
    }
}
