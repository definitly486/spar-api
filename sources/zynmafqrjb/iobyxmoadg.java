package zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends lqeggnwhkg.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jpowsppfya.jyumaefscl f131621iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f131622zoijcleaow;

    iobyxmoadg(jpowsppfya.jyumaefscl jyumaefsclVar, int i13) {
        if (jyumaefsclVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f131621iobyxmoadg = jyumaefsclVar;
        this.f131622zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg.zoijcleaow)) {
            return false;
        }
        lqeggnwhkg.zoijcleaow zoijcleaowVar = (lqeggnwhkg.zoijcleaow) obj;
        return this.f131621iobyxmoadg.equals(zoijcleaowVar.zoijcleaow()) && this.f131622zoijcleaow == zoijcleaowVar.iobyxmoadg();
    }

    public int hashCode() {
        return ((this.f131621iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f131622zoijcleaow;
    }

    @Override // zynmafqrjb.lqeggnwhkg.zoijcleaow
    int iobyxmoadg() {
        return this.f131622zoijcleaow;
    }

    public String toString() {
        return "In{packet=" + this.f131621iobyxmoadg + ", jpegQuality=" + this.f131622zoijcleaow + "}";
    }

    @Override // zynmafqrjb.lqeggnwhkg.zoijcleaow
    jpowsppfya.jyumaefscl zoijcleaow() {
        return this.f131621iobyxmoadg;
    }
}
