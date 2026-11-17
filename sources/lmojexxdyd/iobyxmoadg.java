package lmojexxdyd;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f63638iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f63639ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f63640wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f63641zoijcleaow;

    iobyxmoadg(float f13, float f14, float f15, float f16) {
        this.f63638iobyxmoadg = f13;
        this.f63641zoijcleaow = f14;
        this.f63639ppxfxbqfkf = f15;
        this.f63640wkgbmnqykc = f16;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return Float.floatToIntBits(this.f63638iobyxmoadg) == Float.floatToIntBits(eablkybsjgVar.wkgbmnqykc()) && Float.floatToIntBits(this.f63641zoijcleaow) == Float.floatToIntBits(eablkybsjgVar.iobyxmoadg()) && Float.floatToIntBits(this.f63639ppxfxbqfkf) == Float.floatToIntBits(eablkybsjgVar.ppxfxbqfkf()) && Float.floatToIntBits(this.f63640wkgbmnqykc) == Float.floatToIntBits(eablkybsjgVar.zoijcleaow());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f63638iobyxmoadg) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f63641zoijcleaow)) * 1000003) ^ Float.floatToIntBits(this.f63639ppxfxbqfkf)) * 1000003) ^ Float.floatToIntBits(this.f63640wkgbmnqykc);
    }

    @Override // lmojexxdyd.eablkybsjg, lereixgezr.auzgnhcxok
    public float iobyxmoadg() {
        return this.f63641zoijcleaow;
    }

    @Override // lmojexxdyd.eablkybsjg, lereixgezr.auzgnhcxok
    public float ppxfxbqfkf() {
        return this.f63639ppxfxbqfkf;
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f63638iobyxmoadg + ", maxZoomRatio=" + this.f63641zoijcleaow + ", minZoomRatio=" + this.f63639ppxfxbqfkf + ", linearZoom=" + this.f63640wkgbmnqykc + "}";
    }

    @Override // lmojexxdyd.eablkybsjg, lereixgezr.auzgnhcxok
    public float wkgbmnqykc() {
        return this.f63638iobyxmoadg;
    }

    @Override // lmojexxdyd.eablkybsjg, lereixgezr.auzgnhcxok
    public float zoijcleaow() {
        return this.f63640wkgbmnqykc;
    }
}
