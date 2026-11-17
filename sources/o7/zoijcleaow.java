package o7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public float f72211btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public PointF f72212draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public int f72213dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public int f72214eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public boolean f72215gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public float f72216gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public String f72217iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public float f72218lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public int f72219nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public float f72220ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public PointF f72221wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public iobyxmoadg f72222wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public String f72223zoijcleaow;

    public enum iobyxmoadg {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public zoijcleaow(String str, String str2, float f13, iobyxmoadg iobyxmoadgVar, int i13, float f14, float f15, int i14, int i15, float f16, boolean z13, PointF pointF, PointF pointF2) {
        iobyxmoadg(str, str2, f13, iobyxmoadgVar, i13, f14, f15, i14, i15, f16, z13, pointF, pointF2);
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f72217iobyxmoadg.hashCode() * 31) + this.f72223zoijcleaow.hashCode()) * 31) + this.f72220ppxfxbqfkf)) * 31) + this.f72222wkgbmnqykc.ordinal()) * 31) + this.f72214eablkybsjg;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f72216gxszxtbevo);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f72219nufgyqmvbu;
    }

    public void iobyxmoadg(String str, String str2, float f13, iobyxmoadg iobyxmoadgVar, int i13, float f14, float f15, int i14, int i15, float f16, boolean z13, PointF pointF, PointF pointF2) {
        this.f72217iobyxmoadg = str;
        this.f72223zoijcleaow = str2;
        this.f72220ppxfxbqfkf = f13;
        this.f72222wkgbmnqykc = iobyxmoadgVar;
        this.f72214eablkybsjg = i13;
        this.f72216gxszxtbevo = f14;
        this.f72218lqeggnwhkg = f15;
        this.f72219nufgyqmvbu = i14;
        this.f72213dxjokdxxww = i15;
        this.f72211btonecajqb = f16;
        this.f72215gtknphoqwx = z13;
        this.f72212draadjrbmk = pointF;
        this.f72221wflxmlrfwp = pointF2;
    }

    public zoijcleaow() {
    }
}
