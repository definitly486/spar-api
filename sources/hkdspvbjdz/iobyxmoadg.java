package hkdspvbjdz;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz.gxszxtbevo f40671iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cllcsxoeiz.gxszxtbevo f40672zoijcleaow;

    iobyxmoadg(cllcsxoeiz.gxszxtbevo gxszxtbevoVar, cllcsxoeiz.gxszxtbevo gxszxtbevoVar2) {
        if (gxszxtbevoVar == null) {
            throw new NullPointerException("Null primaryOutConfig");
        }
        this.f40671iobyxmoadg = gxszxtbevoVar;
        if (gxszxtbevoVar2 == null) {
            throw new NullPointerException("Null secondaryOutConfig");
        }
        this.f40672zoijcleaow = gxszxtbevoVar2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f40671iobyxmoadg.equals(wkgbmnqykcVar.iobyxmoadg()) && this.f40672zoijcleaow.equals(wkgbmnqykcVar.zoijcleaow());
    }

    public int hashCode() {
        return ((this.f40671iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f40672zoijcleaow.hashCode();
    }

    @Override // hkdspvbjdz.wkgbmnqykc
    public cllcsxoeiz.gxszxtbevo iobyxmoadg() {
        return this.f40671iobyxmoadg;
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f40671iobyxmoadg + ", secondaryOutConfig=" + this.f40672zoijcleaow + "}";
    }

    @Override // hkdspvbjdz.wkgbmnqykc
    public cllcsxoeiz.gxszxtbevo zoijcleaow() {
        return this.f40672zoijcleaow;
    }
}
