package bfopjjpdmp;

import g.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg implements zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f16084iobyxmoadg;

    public eablkybsjg(float f13) {
        this.f16084iobyxmoadg = f13;
        if (f13 < 0.0f || f13 > 100.0f) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("The percent should be in the range of [0, 100]");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eablkybsjg) && Float.compare(this.f16084iobyxmoadg, ((eablkybsjg) obj).f16084iobyxmoadg) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f16084iobyxmoadg);
    }

    @Override // bfopjjpdmp.zoijcleaow
    public float iobyxmoadg(long j13, w0.wkgbmnqykc wkgbmnqykcVar) {
        return gtknphoqwx.btonecajqb(j13) * (this.f16084iobyxmoadg / 100.0f);
    }

    public String toString() {
        return "CornerSize(size = " + this.f16084iobyxmoadg + "%)";
    }
}
