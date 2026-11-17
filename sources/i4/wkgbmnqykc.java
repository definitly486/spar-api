package i4;

import v2.jyumaefscl;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc implements jyumaefscl.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final float f41955iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f41956zoijcleaow;

    public wkgbmnqykc(float f13, int i13) {
        this.f41955iobyxmoadg = f13;
        this.f41956zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wkgbmnqykc.class != obj.getClass()) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f41955iobyxmoadg == wkgbmnqykcVar.f41955iobyxmoadg && this.f41956zoijcleaow == wkgbmnqykcVar.f41956zoijcleaow;
    }

    public int hashCode() {
        return ((527 + com.google.common.primitives.ppxfxbqfkf.iobyxmoadg(this.f41955iobyxmoadg)) * 31) + this.f41956zoijcleaow;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f41955iobyxmoadg + ", svcTemporalLayerCount=" + this.f41956zoijcleaow;
    }
}
