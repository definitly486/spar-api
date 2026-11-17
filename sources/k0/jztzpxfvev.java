package k0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class jztzpxfvev {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final boolean f53316agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int f53317btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final float f53318draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final TextUtils.TruncateAt f53319dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f53320eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final float f53321gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final TextDirectionHeuristic f53322gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CharSequence f53323iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final int f53324kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Layout.Alignment f53325lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f53326nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final boolean f53327ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final int f53328oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f53329ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final int f53330rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final int f53331vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final int f53332wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final TextPaint f53333wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int[] f53334yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int[] f53335zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f53336zoijcleaow;

    public jztzpxfvev(CharSequence charSequence, int i13, int i14, TextPaint textPaint, int i15, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i16, TextUtils.TruncateAt truncateAt, int i17, float f13, float f14, int i18, boolean z13, boolean z14, int i19, int i23, int i24, int i25, int[] iArr, int[] iArr2) {
        this.f53323iobyxmoadg = charSequence;
        this.f53336zoijcleaow = i13;
        this.f53329ppxfxbqfkf = i14;
        this.f53333wkgbmnqykc = textPaint;
        this.f53320eablkybsjg = i15;
        this.f53322gxszxtbevo = textDirectionHeuristic;
        this.f53325lqeggnwhkg = alignment;
        this.f53326nufgyqmvbu = i16;
        this.f53319dxjokdxxww = truncateAt;
        this.f53317btonecajqb = i17;
        this.f53321gtknphoqwx = f13;
        this.f53318draadjrbmk = f14;
        this.f53332wflxmlrfwp = i18;
        this.f53316agtfadlqog = z13;
        this.f53327ojitshcjhn = z14;
        this.f53330rgvfuqvkyq = i19;
        this.f53331vdvldrhtss = i23;
        this.f53328oxmwwwfdhm = i24;
        this.f53324kcexrzcfyt = i25;
        this.f53335zdlpuopuiu = iArr;
        this.f53334yggfygwlhe = iArr2;
        if (!(i13 >= 0 && i13 <= i14)) {
            q0.iobyxmoadg.iobyxmoadg("invalid start value");
        }
        if (!(i14 >= 0 && i14 <= charSequence.length())) {
            q0.iobyxmoadg.iobyxmoadg("invalid end value");
        }
        if (!(i16 >= 0)) {
            q0.iobyxmoadg.iobyxmoadg("invalid maxLines value");
        }
        if (!(i15 >= 0)) {
            q0.iobyxmoadg.iobyxmoadg("invalid width value");
        }
        if (!(i17 >= 0)) {
            q0.iobyxmoadg.iobyxmoadg("invalid ellipsizedWidth value");
        }
        if (f13 >= 0.0f) {
            return;
        }
        q0.iobyxmoadg.iobyxmoadg("invalid lineSpacingMultiplier value");
    }

    public final int agtfadlqog() {
        return this.f53326nufgyqmvbu;
    }

    public final int btonecajqb() {
        return this.f53331vdvldrhtss;
    }

    public final float draadjrbmk() {
        return this.f53318draadjrbmk;
    }

    public final int[] dxjokdxxww() {
        return this.f53335zdlpuopuiu;
    }

    public final int eablkybsjg() {
        return this.f53329ppxfxbqfkf;
    }

    public final int gtknphoqwx() {
        return this.f53328oxmwwwfdhm;
    }

    public final int gxszxtbevo() {
        return this.f53324kcexrzcfyt;
    }

    public final Layout.Alignment iobyxmoadg() {
        return this.f53325lqeggnwhkg;
    }

    public final TextDirectionHeuristic kcexrzcfyt() {
        return this.f53322gxszxtbevo;
    }

    public final boolean lqeggnwhkg() {
        return this.f53316agtfadlqog;
    }

    public final int nufgyqmvbu() {
        return this.f53332wflxmlrfwp;
    }

    public final TextPaint ojitshcjhn() {
        return this.f53333wkgbmnqykc;
    }

    public final CharSequence oxmwwwfdhm() {
        return this.f53323iobyxmoadg;
    }

    public final TextUtils.TruncateAt ppxfxbqfkf() {
        return this.f53319dxjokdxxww;
    }

    public final int[] rgvfuqvkyq() {
        return this.f53334yggfygwlhe;
    }

    public final int vdvldrhtss() {
        return this.f53336zoijcleaow;
    }

    public final float wflxmlrfwp() {
        return this.f53321gtknphoqwx;
    }

    public final int wkgbmnqykc() {
        return this.f53317btonecajqb;
    }

    public final int yggfygwlhe() {
        return this.f53320eablkybsjg;
    }

    public final boolean zdlpuopuiu() {
        return this.f53327ojitshcjhn;
    }

    public final int zoijcleaow() {
        return this.f53330rgvfuqvkyq;
    }
}
