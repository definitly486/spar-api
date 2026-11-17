package lereixgezr;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
final class nufgyqmvbu extends tbqsvytpvh.nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Matrix f62339eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f62340gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Rect f62341iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f62342ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f62343wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f62344zoijcleaow;

    nufgyqmvbu(Rect rect, int i13, int i14, boolean z13, Matrix matrix, boolean z14) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f62341iobyxmoadg = rect;
        this.f62344zoijcleaow = i13;
        this.f62342ppxfxbqfkf = i14;
        this.f62343wkgbmnqykc = z13;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f62339eablkybsjg = matrix;
        this.f62340gxszxtbevo = z14;
    }

    @Override // lereixgezr.tbqsvytpvh.nufgyqmvbu
    public boolean eablkybsjg() {
        return this.f62343wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tbqsvytpvh.nufgyqmvbu)) {
            return false;
        }
        tbqsvytpvh.nufgyqmvbu nufgyqmvbuVar = (tbqsvytpvh.nufgyqmvbu) obj;
        return this.f62341iobyxmoadg.equals(nufgyqmvbuVar.iobyxmoadg()) && this.f62344zoijcleaow == nufgyqmvbuVar.zoijcleaow() && this.f62342ppxfxbqfkf == nufgyqmvbuVar.wkgbmnqykc() && this.f62343wkgbmnqykc == nufgyqmvbuVar.eablkybsjg() && this.f62339eablkybsjg.equals(nufgyqmvbuVar.ppxfxbqfkf()) && this.f62340gxszxtbevo == nufgyqmvbuVar.gxszxtbevo();
    }

    @Override // lereixgezr.tbqsvytpvh.nufgyqmvbu
    public boolean gxszxtbevo() {
        return this.f62340gxszxtbevo;
    }

    public int hashCode() {
        return ((((((((((this.f62341iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f62344zoijcleaow) * 1000003) ^ this.f62342ppxfxbqfkf) * 1000003) ^ (this.f62343wkgbmnqykc ? 1231 : 1237)) * 1000003) ^ this.f62339eablkybsjg.hashCode()) * 1000003) ^ (this.f62340gxszxtbevo ? 1231 : 1237);
    }

    @Override // lereixgezr.tbqsvytpvh.nufgyqmvbu
    public Rect iobyxmoadg() {
        return this.f62341iobyxmoadg;
    }

    @Override // lereixgezr.tbqsvytpvh.nufgyqmvbu
    public Matrix ppxfxbqfkf() {
        return this.f62339eablkybsjg;
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f62341iobyxmoadg + ", getRotationDegrees=" + this.f62344zoijcleaow + ", getTargetRotation=" + this.f62342ppxfxbqfkf + ", hasCameraTransform=" + this.f62343wkgbmnqykc + ", getSensorToBufferTransform=" + this.f62339eablkybsjg + ", isMirroring=" + this.f62340gxszxtbevo + "}";
    }

    @Override // lereixgezr.tbqsvytpvh.nufgyqmvbu
    public int wkgbmnqykc() {
        return this.f62342ppxfxbqfkf;
    }

    @Override // lereixgezr.tbqsvytpvh.nufgyqmvbu
    public int zoijcleaow() {
        return this.f62344zoijcleaow;
    }
}
