package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class nufgyqmvbu {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    static final int f22981agtfadlqog = 1;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f22983draadjrbmk;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f22985eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private CharSequence f22988iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f22991ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final TextPaint f22994zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f22993wkgbmnqykc = 0;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Layout.Alignment f22987gxszxtbevo = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f22989lqeggnwhkg = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private float f22990nufgyqmvbu = 0.0f;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private float f22984dxjokdxxww = 1.0f;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f22982btonecajqb = f22981agtfadlqog;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f22986gtknphoqwx = true;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private TextUtils.TruncateAt f22992wflxmlrfwp = null;

    static class iobyxmoadg extends Exception {
    }

    private nufgyqmvbu(CharSequence charSequence, TextPaint textPaint, int i13) {
        this.f22988iobyxmoadg = charSequence;
        this.f22994zoijcleaow = textPaint;
        this.f22991ppxfxbqfkf = i13;
        this.f22985eablkybsjg = charSequence.length();
    }

    public static nufgyqmvbu zoijcleaow(CharSequence charSequence, TextPaint textPaint, int i13) {
        return new nufgyqmvbu(charSequence, textPaint, i13);
    }

    public nufgyqmvbu btonecajqb(dxjokdxxww dxjokdxxwwVar) {
        return this;
    }

    public nufgyqmvbu dxjokdxxww(int i13) {
        this.f22989lqeggnwhkg = i13;
        return this;
    }

    public nufgyqmvbu eablkybsjg(int i13) {
        this.f22982btonecajqb = i13;
        return this;
    }

    public nufgyqmvbu gxszxtbevo(boolean z13) {
        this.f22986gtknphoqwx = z13;
        return this;
    }

    public StaticLayout iobyxmoadg() {
        if (this.f22988iobyxmoadg == null) {
            this.f22988iobyxmoadg = "";
        }
        int iMax = Math.max(0, this.f22991ppxfxbqfkf);
        CharSequence charSequenceEllipsize = this.f22988iobyxmoadg;
        if (this.f22989lqeggnwhkg == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f22994zoijcleaow, iMax, this.f22992wflxmlrfwp);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f22985eablkybsjg);
        this.f22985eablkybsjg = iMin;
        if (this.f22983draadjrbmk && this.f22989lqeggnwhkg == 1) {
            this.f22987gxszxtbevo = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f22993wkgbmnqykc, iMin, this.f22994zoijcleaow, iMax);
        builderObtain.setAlignment(this.f22987gxszxtbevo);
        builderObtain.setIncludePad(this.f22986gtknphoqwx);
        builderObtain.setTextDirection(this.f22983draadjrbmk ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f22992wflxmlrfwp;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f22989lqeggnwhkg);
        float f13 = this.f22990nufgyqmvbu;
        if (f13 != 0.0f || this.f22984dxjokdxxww != 1.0f) {
            builderObtain.setLineSpacing(f13, this.f22984dxjokdxxww);
        }
        if (this.f22989lqeggnwhkg > 1) {
            builderObtain.setHyphenationFrequency(this.f22982btonecajqb);
        }
        return builderObtain.build();
    }

    public nufgyqmvbu lqeggnwhkg(boolean z13) {
        this.f22983draadjrbmk = z13;
        return this;
    }

    public nufgyqmvbu nufgyqmvbu(float f13, float f14) {
        this.f22990nufgyqmvbu = f13;
        this.f22984dxjokdxxww = f14;
        return this;
    }

    public nufgyqmvbu ppxfxbqfkf(Layout.Alignment alignment) {
        this.f22987gxszxtbevo = alignment;
        return this;
    }

    public nufgyqmvbu wkgbmnqykc(TextUtils.TruncateAt truncateAt) {
        this.f22992wflxmlrfwp = truncateAt;
        return this;
    }
}
