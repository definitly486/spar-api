package v0;

import h.jztzpxfvev;
import h.oipsdeybqn;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc implements rgvfuqvkyq {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f115025zoijcleaow;

    public /* synthetic */ wkgbmnqykc(long j13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13);
    }

    @Override // v0.rgvfuqvkyq
    public jztzpxfvev dxjokdxxww() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && oipsdeybqn.ojitshcjhn(this.f115025zoijcleaow, ((wkgbmnqykc) obj).f115025zoijcleaow);
    }

    public int hashCode() {
        return oipsdeybqn.yggfygwlhe(this.f115025zoijcleaow);
    }

    @Override // v0.rgvfuqvkyq
    public float iobyxmoadg() {
        return oipsdeybqn.rgvfuqvkyq(zoijcleaow());
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) oipsdeybqn.jyumaefscl(this.f115025zoijcleaow)) + ')';
    }

    @Override // v0.rgvfuqvkyq
    public long zoijcleaow() {
        return this.f115025zoijcleaow;
    }

    private wkgbmnqykc(long j13) {
        this.f115025zoijcleaow = j13;
        if (j13 != 16) {
            return;
        }
        q0.iobyxmoadg.iobyxmoadg("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }
}
