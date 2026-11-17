package z2;

import v2.jyumaefscl;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc implements jyumaefscl.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final float f127712iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final float f127713zoijcleaow;

    public wkgbmnqykc(float f13, float f14) {
        y2.iobyxmoadg.zoijcleaow(f13 >= -90.0f && f13 <= 90.0f && f14 >= -180.0f && f14 <= 180.0f, "Invalid latitude or longitude");
        this.f127712iobyxmoadg = f13;
        this.f127713zoijcleaow = f14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wkgbmnqykc.class != obj.getClass()) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f127712iobyxmoadg == wkgbmnqykcVar.f127712iobyxmoadg && this.f127713zoijcleaow == wkgbmnqykcVar.f127713zoijcleaow;
    }

    public int hashCode() {
        return ((527 + com.google.common.primitives.ppxfxbqfkf.iobyxmoadg(this.f127712iobyxmoadg)) * 31) + com.google.common.primitives.ppxfxbqfkf.iobyxmoadg(this.f127713zoijcleaow);
    }

    public String toString() {
        return "xyz: latitude=" + this.f127712iobyxmoadg + ", longitude=" + this.f127713zoijcleaow;
    }
}
