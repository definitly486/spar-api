package bfopjjpdmp;

import kotlin.jvm.internal.gtknphoqwx;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc implements zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f16091iobyxmoadg;

    public /* synthetic */ wkgbmnqykc(float f13, gtknphoqwx gtknphoqwxVar) {
        this(f13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && nufgyqmvbu.dxjokdxxww(this.f16091iobyxmoadg, ((wkgbmnqykc) obj).f16091iobyxmoadg);
    }

    public int hashCode() {
        return nufgyqmvbu.btonecajqb(this.f16091iobyxmoadg);
    }

    @Override // bfopjjpdmp.zoijcleaow
    public float iobyxmoadg(long j13, w0.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.I(this.f16091iobyxmoadg);
    }

    public String toString() {
        return "CornerSize(size = " + this.f16091iobyxmoadg + ".dp)";
    }

    private wkgbmnqykc(float f13) {
        this.f16091iobyxmoadg = f13;
    }
}
