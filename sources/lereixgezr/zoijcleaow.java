package lereixgezr;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vdvldrhtss.zoijcleaow f62489iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final vdvldrhtss.iobyxmoadg f62490zoijcleaow;

    zoijcleaow(vdvldrhtss.zoijcleaow zoijcleaowVar, vdvldrhtss.iobyxmoadg iobyxmoadgVar) {
        if (zoijcleaowVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f62489iobyxmoadg = zoijcleaowVar;
        this.f62490zoijcleaow = iobyxmoadgVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        if (this.f62489iobyxmoadg.equals(vdvldrhtssVar.wkgbmnqykc())) {
            vdvldrhtss.iobyxmoadg iobyxmoadgVar = this.f62490zoijcleaow;
            if (iobyxmoadgVar == null) {
                if (vdvldrhtssVar.ppxfxbqfkf() == null) {
                    return true;
                }
            } else if (iobyxmoadgVar.equals(vdvldrhtssVar.ppxfxbqfkf())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f62489iobyxmoadg.hashCode() ^ 1000003) * 1000003;
        vdvldrhtss.iobyxmoadg iobyxmoadgVar = this.f62490zoijcleaow;
        return iHashCode ^ (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode());
    }

    @Override // lereixgezr.vdvldrhtss
    public vdvldrhtss.iobyxmoadg ppxfxbqfkf() {
        return this.f62490zoijcleaow;
    }

    public String toString() {
        return "CameraState{type=" + this.f62489iobyxmoadg + ", error=" + this.f62490zoijcleaow + "}";
    }

    @Override // lereixgezr.vdvldrhtss
    public vdvldrhtss.zoijcleaow wkgbmnqykc() {
        return this.f62489iobyxmoadg;
    }
}
