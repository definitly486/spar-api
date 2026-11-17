package m0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements LineHeightSpan {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f64831draadjrbmk;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f64833eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final float f64835gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f64836iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f64837lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f64839ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f64840wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f64841wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f64842zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f64838nufgyqmvbu = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f64832dxjokdxxww = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f64830btonecajqb = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f64834gtknphoqwx = Integer.MIN_VALUE;

    public nufgyqmvbu(float f13, int i13, int i14, boolean z13, boolean z14, float f14, boolean z15) {
        this.f64836iobyxmoadg = f13;
        this.f64842zoijcleaow = i13;
        this.f64839ppxfxbqfkf = i14;
        this.f64841wkgbmnqykc = z13;
        this.f64833eablkybsjg = z14;
        this.f64835gxszxtbevo = f14;
        this.f64837lqeggnwhkg = z15;
        if ((0.0f <= f14 && f14 <= 1.0f) || f14 == -1.0f) {
            return;
        }
        q0.iobyxmoadg.ppxfxbqfkf("topRatio should be in [0..1] range or -1");
    }

    private final void iobyxmoadg(Paint.FontMetricsInt fontMetricsInt) {
        int iIobyxmoadg = dxjokdxxww.iobyxmoadg(fontMetricsInt);
        int iCeil = (int) Math.ceil(this.f64836iobyxmoadg);
        int i13 = iCeil - iIobyxmoadg;
        if (this.f64837lqeggnwhkg && i13 <= 0) {
            int i14 = fontMetricsInt.ascent;
            this.f64832dxjokdxxww = i14;
            int i15 = fontMetricsInt.descent;
            this.f64830btonecajqb = i15;
            this.f64838nufgyqmvbu = i14;
            this.f64834gtknphoqwx = i15;
            this.f64831draadjrbmk = 0;
            this.f64840wflxmlrfwp = 0;
            return;
        }
        float fAbs = this.f64835gxszxtbevo;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / dxjokdxxww.iobyxmoadg(fontMetricsInt);
        }
        int iCeil2 = (int) (i13 <= 0 ? Math.ceil(i13 * fAbs) : Math.ceil(i13 * (1.0f - fAbs)));
        int i16 = fontMetricsInt.descent;
        int i17 = iCeil2 + i16;
        this.f64830btonecajqb = i17;
        int i18 = i17 - iCeil;
        this.f64832dxjokdxxww = i18;
        if (this.f64841wkgbmnqykc) {
            i18 = fontMetricsInt.ascent;
        }
        this.f64838nufgyqmvbu = i18;
        if (this.f64833eablkybsjg) {
            i17 = i16;
        }
        this.f64834gtknphoqwx = i17;
        this.f64831draadjrbmk = fontMetricsInt.ascent - i18;
        this.f64840wflxmlrfwp = i17 - i16;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i13, int i14, int i15, int i16, Paint.FontMetricsInt fontMetricsInt) {
        if (dxjokdxxww.iobyxmoadg(fontMetricsInt) <= 0) {
            return;
        }
        boolean z13 = i13 == this.f64842zoijcleaow;
        boolean z14 = i14 == this.f64839ppxfxbqfkf;
        if (z13 && z14 && this.f64841wkgbmnqykc && this.f64833eablkybsjg) {
            return;
        }
        if (this.f64838nufgyqmvbu == Integer.MIN_VALUE) {
            iobyxmoadg(fontMetricsInt);
        }
        fontMetricsInt.ascent = z13 ? this.f64838nufgyqmvbu : this.f64832dxjokdxxww;
        fontMetricsInt.descent = z14 ? this.f64834gtknphoqwx : this.f64830btonecajqb;
    }

    public final boolean eablkybsjg() {
        return this.f64833eablkybsjg;
    }

    public final int ppxfxbqfkf() {
        return this.f64831draadjrbmk;
    }

    public final int wkgbmnqykc() {
        return this.f64840wflxmlrfwp;
    }

    public final nufgyqmvbu zoijcleaow(int i13, int i14, boolean z13) {
        return new nufgyqmvbu(this.f64836iobyxmoadg, i13, i14, z13, this.f64833eablkybsjg, this.f64835gxszxtbevo, this.f64837lqeggnwhkg);
    }
}
