package jpowsppfya;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends jyumaefscl {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Rect f51980eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f51981gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f51982iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Matrix f51983lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final istkbnxepw.ojitshcjhn f51984nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f51985ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Size f51986wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cdpycssgdh.gxszxtbevo f51987zoijcleaow;

    iobyxmoadg(Object obj, cdpycssgdh.gxszxtbevo gxszxtbevoVar, int i13, Size size, Rect rect, int i14, Matrix matrix, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f51982iobyxmoadg = obj;
        this.f51987zoijcleaow = gxszxtbevoVar;
        this.f51985ppxfxbqfkf = i13;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f51986wkgbmnqykc = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f51980eablkybsjg = rect;
        this.f51981gxszxtbevo = i14;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f51983lqeggnwhkg = matrix;
        if (ojitshcjhnVar == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f51984nufgyqmvbu = ojitshcjhnVar;
    }

    @Override // jpowsppfya.jyumaefscl
    public int eablkybsjg() {
        return this.f51985ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        cdpycssgdh.gxszxtbevo gxszxtbevoVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jyumaefscl)) {
            return false;
        }
        jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
        return this.f51982iobyxmoadg.equals(jyumaefsclVar.ppxfxbqfkf()) && ((gxszxtbevoVar = this.f51987zoijcleaow) != null ? gxszxtbevoVar.equals(jyumaefsclVar.wkgbmnqykc()) : jyumaefsclVar.wkgbmnqykc() == null) && this.f51985ppxfxbqfkf == jyumaefsclVar.eablkybsjg() && this.f51986wkgbmnqykc.equals(jyumaefsclVar.nufgyqmvbu()) && this.f51980eablkybsjg.equals(jyumaefsclVar.zoijcleaow()) && this.f51981gxszxtbevo == jyumaefsclVar.gxszxtbevo() && this.f51983lqeggnwhkg.equals(jyumaefsclVar.lqeggnwhkg()) && this.f51984nufgyqmvbu.equals(jyumaefsclVar.iobyxmoadg());
    }

    @Override // jpowsppfya.jyumaefscl
    public int gxszxtbevo() {
        return this.f51981gxszxtbevo;
    }

    public int hashCode() {
        int iHashCode = (this.f51982iobyxmoadg.hashCode() ^ 1000003) * 1000003;
        cdpycssgdh.gxszxtbevo gxszxtbevoVar = this.f51987zoijcleaow;
        return ((((((((((((iHashCode ^ (gxszxtbevoVar == null ? 0 : gxszxtbevoVar.hashCode())) * 1000003) ^ this.f51985ppxfxbqfkf) * 1000003) ^ this.f51986wkgbmnqykc.hashCode()) * 1000003) ^ this.f51980eablkybsjg.hashCode()) * 1000003) ^ this.f51981gxszxtbevo) * 1000003) ^ this.f51983lqeggnwhkg.hashCode()) * 1000003) ^ this.f51984nufgyqmvbu.hashCode();
    }

    @Override // jpowsppfya.jyumaefscl
    public istkbnxepw.ojitshcjhn iobyxmoadg() {
        return this.f51984nufgyqmvbu;
    }

    @Override // jpowsppfya.jyumaefscl
    public Matrix lqeggnwhkg() {
        return this.f51983lqeggnwhkg;
    }

    @Override // jpowsppfya.jyumaefscl
    public Size nufgyqmvbu() {
        return this.f51986wkgbmnqykc;
    }

    @Override // jpowsppfya.jyumaefscl
    public Object ppxfxbqfkf() {
        return this.f51982iobyxmoadg;
    }

    public String toString() {
        return "Packet{data=" + this.f51982iobyxmoadg + ", exif=" + this.f51987zoijcleaow + ", format=" + this.f51985ppxfxbqfkf + ", size=" + this.f51986wkgbmnqykc + ", cropRect=" + this.f51980eablkybsjg + ", rotationDegrees=" + this.f51981gxszxtbevo + ", sensorToBufferTransform=" + this.f51983lqeggnwhkg + ", cameraCaptureResult=" + this.f51984nufgyqmvbu + "}";
    }

    @Override // jpowsppfya.jyumaefscl
    public cdpycssgdh.gxszxtbevo wkgbmnqykc() {
        return this.f51987zoijcleaow;
    }

    @Override // jpowsppfya.jyumaefscl
    public Rect zoijcleaow() {
        return this.f51980eablkybsjg;
    }
}
