package u0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import gg.wwaezpbzkn;
import h.e;
import h.jztzpxfvev;
import w0.zdlpuopuiu;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf implements LeadingMarginSpan {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f112421dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f112422eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final j.lqeggnwhkg f112423gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final e f112424iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final w0.wkgbmnqykc f112425lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f112426nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f112427ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jztzpxfvev f112428wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f112429zoijcleaow;

    public ppxfxbqfkf(e eVar, float f13, float f14, float f15, jztzpxfvev jztzpxfvevVar, float f16, j.lqeggnwhkg lqeggnwhkgVar, w0.wkgbmnqykc wkgbmnqykcVar, float f17) {
        this.f112424iobyxmoadg = eVar;
        this.f112429zoijcleaow = f13;
        this.f112427ppxfxbqfkf = f14;
        this.f112428wkgbmnqykc = jztzpxfvevVar;
        this.f112422eablkybsjg = f16;
        this.f112423gxszxtbevo = lqeggnwhkgVar;
        this.f112425lqeggnwhkg = wkgbmnqykcVar;
        int iWkgbmnqykc = vg.iobyxmoadg.wkgbmnqykc(f13 + f15);
        this.f112426nufgyqmvbu = iWkgbmnqykc;
        this.f112421dxjokdxxww = vg.iobyxmoadg.wkgbmnqykc(f17) - iWkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, long j13, int i13, Canvas canvas, Paint paint, int i14, float f13) {
        iobyxmoadg.wkgbmnqykc(ppxfxbqfkfVar.f112424iobyxmoadg.iobyxmoadg(j13, i13 > 0 ? zdlpuopuiu.Ltr : zdlpuopuiu.Rtl, ppxfxbqfkfVar.f112425lqeggnwhkg), canvas, paint, i14, f13, i13);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(final Canvas canvas, final Paint paint, int i13, final int i14, int i15, int i16, int i17, CharSequence charSequence, int i18, int i19, boolean z13, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f13 = (i15 + i17) / 2.0f;
        final int iGxszxtbevo = gtknphoqwx.gxszxtbevo(i13 - this.f112426nufgyqmvbu, 0);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(charSequence, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) charSequence).getSpanStart(this) != i18 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        iobyxmoadg.gxszxtbevo(paint, this.f112423gxszxtbevo);
        float f14 = this.f112429zoijcleaow;
        final long jWkgbmnqykc = g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(this.f112427ppxfxbqfkf)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32));
        iobyxmoadg.eablkybsjg(paint, this.f112428wkgbmnqykc, this.f112422eablkybsjg, jWkgbmnqykc, new tg.iobyxmoadg() { // from class: u0.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ppxfxbqfkf.zoijcleaow(this.f112437zdlpuopuiu, jWkgbmnqykc, i14, canvas, paint, iGxszxtbevo, f13);
            }
        });
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z13) {
        int i13 = this.f112421dxjokdxxww;
        if (i13 >= 0) {
            return 0;
        }
        return Math.abs(i13);
    }
}
