package ka;

import android.content.Context;
import android.graphics.Color;
import j1.ppxfxbqfkf;
import kotlin.KotlinVersion;
import oa.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f54344gxszxtbevo = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f54345eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f54346iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f54347ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f54348wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f54349zoijcleaow;

    public iobyxmoadg(Context context) {
        this(zoijcleaow.zoijcleaow(context, da.zoijcleaow.elevationOverlayEnabled, false), ia.iobyxmoadg.zoijcleaow(context, da.zoijcleaow.elevationOverlayColor, 0), ia.iobyxmoadg.zoijcleaow(context, da.zoijcleaow.elevationOverlayAccentColor, 0), ia.iobyxmoadg.zoijcleaow(context, da.zoijcleaow.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean gxszxtbevo(int i13) {
        return ppxfxbqfkf.gtknphoqwx(i13, KotlinVersion.MAX_COMPONENT_VALUE) == this.f54348wkgbmnqykc;
    }

    public boolean eablkybsjg() {
        return this.f54346iobyxmoadg;
    }

    public float iobyxmoadg(float f13) {
        float f14 = this.f54345eablkybsjg;
        if (f14 <= 0.0f || f13 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f13 / f14)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int ppxfxbqfkf(int i13, float f13) {
        return (this.f54346iobyxmoadg && gxszxtbevo(i13)) ? zoijcleaow(i13, f13) : i13;
    }

    public int wkgbmnqykc(float f13) {
        return ppxfxbqfkf(this.f54348wkgbmnqykc, f13);
    }

    public int zoijcleaow(int i13, float f13) {
        int i14;
        float fIobyxmoadg = iobyxmoadg(f13);
        int iAlpha = Color.alpha(i13);
        int iBtonecajqb = ia.iobyxmoadg.btonecajqb(ppxfxbqfkf.gtknphoqwx(i13, KotlinVersion.MAX_COMPONENT_VALUE), this.f54349zoijcleaow, fIobyxmoadg);
        if (fIobyxmoadg > 0.0f && (i14 = this.f54347ppxfxbqfkf) != 0) {
            iBtonecajqb = ia.iobyxmoadg.dxjokdxxww(iBtonecajqb, ppxfxbqfkf.gtknphoqwx(i14, f54344gxszxtbevo));
        }
        return ppxfxbqfkf.gtknphoqwx(iBtonecajqb, iAlpha);
    }

    public iobyxmoadg(boolean z13, int i13, int i14, int i15, float f13) {
        this.f54346iobyxmoadg = z13;
        this.f54349zoijcleaow = i13;
        this.f54347ppxfxbqfkf = i14;
        this.f54348wkgbmnqykc = i15;
        this.f54345eablkybsjg = f13;
    }
}
