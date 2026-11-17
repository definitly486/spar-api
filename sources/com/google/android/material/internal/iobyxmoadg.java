package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import v1.jhduphickx;
import v1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private static final boolean f22899lrnfpwlwnk = false;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    private static final Paint f22900zeieaojujs = null;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private ColorStateList f22901agtfadlqog;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private oa.iobyxmoadg f22904cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private float f22905cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Typeface f22906cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private TimeInterpolator f22907crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private float f22908czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private float f22910dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final RectF f22911dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f22912eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Typeface f22913esjtqupxsv;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f22915gxszxtbevo;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f22916hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private Paint f22917hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private ColorStateList f22918ikoacuggdj;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f22919iobyxmoadg;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private Typeface f22921istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Typeface f22922iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private float f22924jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private TimeInterpolator f22925jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private Bitmap f22926jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private float f22927jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private float f22928jztzpxfvev;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private float f22929kcexrzcfyt;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private float f22930kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Typeface f22931lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private CharSequence f22932lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Rect f22933lqeggnwhkg;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private int[] f22934mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private ColorStateList f22935metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private boolean f22936ntlheqmsrt;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Rect f22937nufgyqmvbu;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private CharSequence f22938oipsdeybqn;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private ColorStateList f22939ojitshcjhn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private float f22940okpsazkaxt;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private float f22942oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private Typeface f22944pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f22945ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f22946rgvfuqvkyq;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private float f22947ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private float f22948rlfsiqarku;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private float f22949sflfametgt;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private final TextPaint f22950sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private float f22951stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private int f22952tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private final TextPaint f22953ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private float f22954uwvvkdfqfp;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private float f22955vdvldrhtss;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private float f22956vipkmwdibw;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float f22959wkgbmnqykc;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private CharSequence f22960wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private float f22961wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private float f22962xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private oa.iobyxmoadg f22963yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private float f22964ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private StaticLayout f22965yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private float f22966yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private boolean f22967ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private float f22968zdlpuopuiu;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private float f22969zfvoamnweg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private float f22970zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private Typeface f22971zynmafqrjb;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f22903btonecajqb = 16;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f22914gtknphoqwx = 16;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private float f22909draadjrbmk = 15.0f;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private float f22958wflxmlrfwp = 15.0f;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private TextUtils.TruncateAt f22920iozdgvuglv = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f22943pkzmftpjix = true;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private int f22902bfopjjpdmp = 1;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private float f22941opjhrmiecq = 0.0f;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private float f22923iyctptxqzt = 1.0f;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private int f22957weqkydbzbr = nufgyqmvbu.f22981agtfadlqog;

    /* JADX INFO: renamed from: com.google.android.material.internal.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0400iobyxmoadg implements oa.iobyxmoadg.InterfaceC1568iobyxmoadg {
        C0400iobyxmoadg() {
        }

        @Override // oa.iobyxmoadg.InterfaceC1568iobyxmoadg
        public void iobyxmoadg(Typeface typeface) {
            iobyxmoadg.this.ydmasvzmpa(typeface);
        }
    }

    class zoijcleaow implements oa.iobyxmoadg.InterfaceC1568iobyxmoadg {
        zoijcleaow() {
        }

        @Override // oa.iobyxmoadg.InterfaceC1568iobyxmoadg
        public void iobyxmoadg(Typeface typeface) {
            iobyxmoadg.this.tbqsvytpvh(typeface);
        }
    }

    public iobyxmoadg(View view) {
        this.f22919iobyxmoadg = view;
        TextPaint textPaint = new TextPaint(129);
        this.f22953ulzqkzuiru = textPaint;
        this.f22950sopmlzcsov = new TextPaint(textPaint);
        this.f22937nufgyqmvbu = new Rect();
        this.f22933lqeggnwhkg = new Rect();
        this.f22911dxjokdxxww = new RectF();
        this.f22912eablkybsjg = eablkybsjg();
        jlmebxxoox(view.getContext().getResources().getConfiguration());
    }

    private void agtfadlqog() {
        if (this.f22926jpowsppfya != null || this.f22933lqeggnwhkg.isEmpty() || TextUtils.isEmpty(this.f22960wwaezpbzkn)) {
            return;
        }
        lqeggnwhkg(0.0f);
        int width = this.f22965yfnezrywwk.getWidth();
        int height = this.f22965yfnezrywwk.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f22926jpowsppfya = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f22965yfnezrywwk.draw(new Canvas(this.f22926jpowsppfya));
        if (this.f22917hkdspvbjdz == null) {
            this.f22917hkdspvbjdz = new Paint(3);
        }
    }

    private void btonecajqb() {
        Bitmap bitmap = this.f22926jpowsppfya;
        if (bitmap != null) {
            bitmap.recycle();
            this.f22926jpowsppfya = null;
        }
    }

    private int cqumvgiudr(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f22934mbcevpiqjq;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private static float crxdokpmqz(float f13, float f14, float f15, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f15 = timeInterpolator.getInterpolation(f15);
        }
        return ea.iobyxmoadg.iobyxmoadg(f13, f14, f15);
    }

    private void dxjokdxxww(float f13, boolean z13) {
        float f14;
        float f15;
        Typeface typeface;
        if (this.f22932lmojexxdyd == null) {
            return;
        }
        float fWidth = this.f22937nufgyqmvbu.width();
        float fWidth2 = this.f22933lqeggnwhkg.width();
        if (mbcevpiqjq(f13, 1.0f)) {
            f14 = this.f22958wflxmlrfwp;
            f15 = this.f22948rlfsiqarku;
            this.f22905cllcsxoeiz = 1.0f;
            typeface = this.f22922iwizpuwonk;
        } else {
            float f16 = this.f22909draadjrbmk;
            float f17 = this.f22908czzsidtyhn;
            Typeface typeface2 = this.f22931lereixgezr;
            if (mbcevpiqjq(f13, 0.0f)) {
                this.f22905cllcsxoeiz = 1.0f;
            } else {
                this.f22905cllcsxoeiz = crxdokpmqz(this.f22909draadjrbmk, this.f22958wflxmlrfwp, f13, this.f22925jlmebxxoox) / this.f22909draadjrbmk;
            }
            float f18 = this.f22958wflxmlrfwp / this.f22909draadjrbmk;
            fWidth = (z13 || this.f22945ppxfxbqfkf || fWidth2 * f18 <= fWidth) ? fWidth2 : Math.min(fWidth / f18, fWidth2);
            f14 = f16;
            f15 = f17;
            typeface = typeface2;
        }
        boolean z14 = false;
        if (fWidth > 0.0f) {
            boolean z15 = this.f22910dsvhmnatus != f14;
            boolean z16 = this.f22954uwvvkdfqfp != f15;
            boolean z17 = this.f22921istkbnxepw != typeface;
            StaticLayout staticLayout = this.f22965yfnezrywwk;
            boolean z18 = z15 || z16 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z17 || this.f22936ntlheqmsrt;
            this.f22910dsvhmnatus = f14;
            this.f22954uwvvkdfqfp = f15;
            this.f22921istkbnxepw = typeface;
            this.f22936ntlheqmsrt = false;
            this.f22953ulzqkzuiru.setLinearText(this.f22905cllcsxoeiz != 1.0f);
            z14 = z18;
        }
        if (this.f22960wwaezpbzkn == null || z14) {
            this.f22953ulzqkzuiru.setTextSize(this.f22910dsvhmnatus);
            this.f22953ulzqkzuiru.setTypeface(this.f22921istkbnxepw);
            this.f22953ulzqkzuiru.setLetterSpacing(this.f22954uwvvkdfqfp);
            this.f22967ylkuphrtab = gxszxtbevo(this.f22932lmojexxdyd);
            StaticLayout staticLayoutGtknphoqwx = gtknphoqwx(jrbgnlbqoe() ? this.f22902bfopjjpdmp : 1, fWidth, this.f22967ylkuphrtab);
            this.f22965yfnezrywwk = staticLayoutGtknphoqwx;
            this.f22960wwaezpbzkn = staticLayoutGtknphoqwx.getText();
        }
    }

    private float eablkybsjg() {
        float f13 = this.f22959wkgbmnqykc;
        return f13 + ((1.0f - f13) * 0.5f);
    }

    private int esjtqupxsv() {
        return cqumvgiudr(this.f22901agtfadlqog);
    }

    private StaticLayout gtknphoqwx(int i13, float f13, boolean z13) {
        return (StaticLayout) u1.nufgyqmvbu.gxszxtbevo(nufgyqmvbu.zoijcleaow(this.f22932lmojexxdyd, this.f22953ulzqkzuiru, (int) f13).wkgbmnqykc(this.f22920iozdgvuglv).lqeggnwhkg(z13).ppxfxbqfkf(i13 == 1 ? Layout.Alignment.ALIGN_NORMAL : hkdspvbjdz()).gxszxtbevo(false).dxjokdxxww(i13).nufgyqmvbu(this.f22941opjhrmiecq, this.f22923iyctptxqzt).eablkybsjg(this.f22957weqkydbzbr).btonecajqb(null).iobyxmoadg());
    }

    private boolean gxszxtbevo(CharSequence charSequence) {
        boolean zNtlheqmsrt = ntlheqmsrt();
        return this.f22943pkzmftpjix ? sopmlzcsov(charSequence, zNtlheqmsrt) : zNtlheqmsrt;
    }

    private Layout.Alignment hkdspvbjdz() {
        int iZoijcleaow = zdlpuopuiu.zoijcleaow(this.f22903btonecajqb, this.f22967ylkuphrtab ? 1 : 0) & 7;
        if (iZoijcleaow == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (iZoijcleaow != 5) {
            return this.f22967ylkuphrtab ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.f22967ylkuphrtab ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static boolean ikoacuggdj(Rect rect, int i13, int i14, int i15, int i16) {
        return rect.left == i13 && rect.top == i14 && rect.right == i15 && rect.bottom == i16;
    }

    private static int iobyxmoadg(int i13, int i14, float f13) {
        float f14 = 1.0f - f13;
        return Color.argb(Math.round((Color.alpha(i13) * f14) + (Color.alpha(i14) * f13)), Math.round((Color.red(i13) * f14) + (Color.red(i14) * f13)), Math.round((Color.green(i13) * f14) + (Color.green(i14) * f13)), Math.round((Color.blue(i13) * f14) + (Color.blue(i14) * f13)));
    }

    private boolean jrbgnlbqoe() {
        return this.f22902bfopjjpdmp > 1 && (!this.f22967ylkuphrtab || this.f22945ppxfxbqfkf) && !this.f22916hcddaimhww;
    }

    private float kcexrzcfyt(int i13, int i14) {
        if (i14 == 17 || (i14 & 7) == 1) {
            return (i13 / 2.0f) - (this.f22964ydmasvzmpa / 2.0f);
        }
        if ((i14 & 8388613) == 8388613 || (i14 & 5) == 5) {
            return this.f22967ylkuphrtab ? this.f22937nufgyqmvbu.left : this.f22937nufgyqmvbu.right - this.f22964ydmasvzmpa;
        }
        return this.f22967ylkuphrtab ? this.f22937nufgyqmvbu.right - this.f22964ydmasvzmpa : this.f22937nufgyqmvbu.left;
    }

    private void lqeggnwhkg(float f13) {
        float f14;
        tzroggbefp(f13);
        if (!this.f22945ppxfxbqfkf) {
            this.f22966yggfygwlhe = crxdokpmqz(this.f22929kcexrzcfyt, this.f22968zdlpuopuiu, f13, this.f22907crxdokpmqz);
            this.f22927jyumaefscl = crxdokpmqz(this.f22955vdvldrhtss, this.f22942oxmwwwfdhm, f13, this.f22907crxdokpmqz);
            skhdrjzrfn(f13);
            f14 = f13;
        } else if (f13 < this.f22912eablkybsjg) {
            this.f22966yggfygwlhe = this.f22929kcexrzcfyt;
            this.f22927jyumaefscl = this.f22955vdvldrhtss;
            skhdrjzrfn(0.0f);
            f14 = 0.0f;
        } else {
            this.f22966yggfygwlhe = this.f22968zdlpuopuiu;
            this.f22927jyumaefscl = this.f22942oxmwwwfdhm - Math.max(0, this.f22915gxszxtbevo);
            skhdrjzrfn(1.0f);
            f14 = 1.0f;
        }
        TimeInterpolator timeInterpolator = ea.iobyxmoadg.f31023zoijcleaow;
        rlfsiqarku(1.0f - crxdokpmqz(0.0f, 1.0f, 1.0f - f13, timeInterpolator));
        weqkydbzbr(crxdokpmqz(1.0f, 0.0f, f13, timeInterpolator));
        if (this.f22939ojitshcjhn != this.f22901agtfadlqog) {
            this.f22953ulzqkzuiru.setColor(iobyxmoadg(esjtqupxsv(), iwizpuwonk(), f14));
        } else {
            this.f22953ulzqkzuiru.setColor(iwizpuwonk());
        }
        int i13 = Build.VERSION.SDK_INT;
        float f15 = this.f22948rlfsiqarku;
        float f16 = this.f22908czzsidtyhn;
        if (f15 != f16) {
            this.f22953ulzqkzuiru.setLetterSpacing(crxdokpmqz(f16, f15, f13, timeInterpolator));
        } else {
            this.f22953ulzqkzuiru.setLetterSpacing(f15);
        }
        this.f22961wypolnanlu = crxdokpmqz(this.f22940okpsazkaxt, this.f22947ribwqtqdhb, f13, null);
        this.f22951stevsuqkhv = crxdokpmqz(this.f22928jztzpxfvev, this.f22956vipkmwdibw, f13, null);
        this.f22930kegysxyocb = crxdokpmqz(this.f22962xrmfcynszj, this.f22924jhduphickx, f13, null);
        int iIobyxmoadg = iobyxmoadg(cqumvgiudr(this.f22935metgxyhuhe), cqumvgiudr(this.f22918ikoacuggdj), f13);
        this.f22952tzroggbefp = iIobyxmoadg;
        this.f22953ulzqkzuiru.setShadowLayer(this.f22961wypolnanlu, this.f22951stevsuqkhv, this.f22930kegysxyocb, iIobyxmoadg);
        if (this.f22945ppxfxbqfkf) {
            this.f22953ulzqkzuiru.setAlpha((int) (wkgbmnqykc(f13) * this.f22953ulzqkzuiru.getAlpha()));
            if (i13 >= 31) {
                TextPaint textPaint = this.f22953ulzqkzuiru;
                textPaint.setShadowLayer(this.f22961wypolnanlu, this.f22951stevsuqkhv, this.f22930kegysxyocb, ia.iobyxmoadg.iobyxmoadg(this.f22952tzroggbefp, textPaint.getAlpha()));
            }
        }
        jhduphickx.xrmfcynszj(this.f22919iobyxmoadg);
    }

    private static boolean mbcevpiqjq(float f13, float f14) {
        return Math.abs(f13 - f14) < 1.0E-5f;
    }

    private boolean ntlheqmsrt() {
        return jhduphickx.lereixgezr(this.f22919iobyxmoadg) == 1;
    }

    private void nufgyqmvbu(float f13) {
        dxjokdxxww(f13, false);
    }

    private void ppxfxbqfkf() {
        lqeggnwhkg(this.f22970zoijcleaow);
    }

    private float ribwqtqdhb(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private void rlfsiqarku(float f13) {
        this.f22949sflfametgt = f13;
        jhduphickx.xrmfcynszj(this.f22919iobyxmoadg);
    }

    private boolean roivzttewh(Typeface typeface) {
        oa.iobyxmoadg iobyxmoadgVar = this.f22904cdpycssgdh;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf();
        }
        if (this.f22971zynmafqrjb == typeface) {
            return false;
        }
        this.f22971zynmafqrjb = typeface;
        Typeface typefaceZoijcleaow = oa.nufgyqmvbu.zoijcleaow(this.f22919iobyxmoadg.getContext().getResources().getConfiguration(), typeface);
        this.f22944pmvmpeiblj = typefaceZoijcleaow;
        if (typefaceZoijcleaow == null) {
            typefaceZoijcleaow = this.f22971zynmafqrjb;
        }
        this.f22931lereixgezr = typefaceZoijcleaow;
        return true;
    }

    private boolean sflfametgt(Typeface typeface) {
        oa.iobyxmoadg iobyxmoadgVar = this.f22963yadqdtsiqt;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf();
        }
        if (this.f22913esjtqupxsv == typeface) {
            return false;
        }
        this.f22913esjtqupxsv = typeface;
        Typeface typefaceZoijcleaow = oa.nufgyqmvbu.zoijcleaow(this.f22919iobyxmoadg.getContext().getResources().getConfiguration(), typeface);
        this.f22906cqumvgiudr = typefaceZoijcleaow;
        if (typefaceZoijcleaow == null) {
            typefaceZoijcleaow = this.f22913esjtqupxsv;
        }
        this.f22922iwizpuwonk = typefaceZoijcleaow;
        return true;
    }

    private void skhdrjzrfn(float f13) {
        nufgyqmvbu(f13);
        boolean z13 = f22899lrnfpwlwnk && this.f22905cllcsxoeiz != 1.0f;
        this.f22916hcddaimhww = z13;
        if (z13) {
            agtfadlqog();
        }
        jhduphickx.xrmfcynszj(this.f22919iobyxmoadg);
    }

    private boolean sopmlzcsov(CharSequence charSequence, boolean z13) {
        return (z13 ? t1.agtfadlqog.f109253wkgbmnqykc : t1.agtfadlqog.f109252ppxfxbqfkf).iobyxmoadg(charSequence, 0, charSequence.length());
    }

    private void stevsuqkhv(TextPaint textPaint) {
        textPaint.setTextSize(this.f22909draadjrbmk);
        textPaint.setTypeface(this.f22931lereixgezr);
        textPaint.setLetterSpacing(this.f22908czzsidtyhn);
    }

    private void tzroggbefp(float f13) {
        if (this.f22945ppxfxbqfkf) {
            this.f22911dxjokdxxww.set(f13 < this.f22912eablkybsjg ? this.f22933lqeggnwhkg : this.f22937nufgyqmvbu);
            return;
        }
        this.f22911dxjokdxxww.left = crxdokpmqz(this.f22933lqeggnwhkg.left, this.f22937nufgyqmvbu.left, f13, this.f22907crxdokpmqz);
        this.f22911dxjokdxxww.top = crxdokpmqz(this.f22955vdvldrhtss, this.f22942oxmwwwfdhm, f13, this.f22907crxdokpmqz);
        this.f22911dxjokdxxww.right = crxdokpmqz(this.f22933lqeggnwhkg.right, this.f22937nufgyqmvbu.right, f13, this.f22907crxdokpmqz);
        this.f22911dxjokdxxww.bottom = crxdokpmqz(this.f22933lqeggnwhkg.bottom, this.f22937nufgyqmvbu.bottom, f13, this.f22907crxdokpmqz);
    }

    private void weqkydbzbr(float f13) {
        this.f22969zfvoamnweg = f13;
        jhduphickx.xrmfcynszj(this.f22919iobyxmoadg);
    }

    private void wflxmlrfwp(Canvas canvas, float f13, float f14) {
        int alpha = this.f22953ulzqkzuiru.getAlpha();
        canvas.translate(f13, f14);
        if (!this.f22945ppxfxbqfkf) {
            this.f22953ulzqkzuiru.setAlpha((int) (this.f22969zfvoamnweg * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f22953ulzqkzuiru;
                textPaint.setShadowLayer(this.f22961wypolnanlu, this.f22951stevsuqkhv, this.f22930kegysxyocb, ia.iobyxmoadg.iobyxmoadg(this.f22952tzroggbefp, textPaint.getAlpha()));
            }
            this.f22965yfnezrywwk.draw(canvas);
        }
        if (!this.f22945ppxfxbqfkf) {
            this.f22953ulzqkzuiru.setAlpha((int) (this.f22949sflfametgt * alpha));
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31) {
            TextPaint textPaint2 = this.f22953ulzqkzuiru;
            textPaint2.setShadowLayer(this.f22961wypolnanlu, this.f22951stevsuqkhv, this.f22930kegysxyocb, ia.iobyxmoadg.iobyxmoadg(this.f22952tzroggbefp, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f22965yfnezrywwk.getLineBaseline(0);
        CharSequence charSequence = this.f22938oipsdeybqn;
        float f15 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f15, this.f22953ulzqkzuiru);
        if (i13 >= 31) {
            this.f22953ulzqkzuiru.setShadowLayer(this.f22961wypolnanlu, this.f22951stevsuqkhv, this.f22930kegysxyocb, this.f22952tzroggbefp);
        }
        if (this.f22945ppxfxbqfkf) {
            return;
        }
        String strTrim = this.f22938oipsdeybqn.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f22953ulzqkzuiru.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f22965yfnezrywwk.getLineEnd(0), str.length()), 0.0f, f15, (Paint) this.f22953ulzqkzuiru);
    }

    private float wkgbmnqykc(float f13) {
        float f14 = this.f22912eablkybsjg;
        return f13 <= f14 ? ea.iobyxmoadg.zoijcleaow(1.0f, 0.0f, this.f22959wkgbmnqykc, f14, f13) : ea.iobyxmoadg.zoijcleaow(0.0f, 1.0f, f14, 1.0f, f13);
    }

    private void wypolnanlu(TextPaint textPaint) {
        textPaint.setTextSize(this.f22958wflxmlrfwp);
        textPaint.setTypeface(this.f22922iwizpuwonk);
        textPaint.setLetterSpacing(this.f22948rlfsiqarku);
    }

    private float zdlpuopuiu(RectF rectF, int i13, int i14) {
        if (i14 == 17 || (i14 & 7) == 1) {
            return (i13 / 2.0f) + (this.f22964ydmasvzmpa / 2.0f);
        }
        if ((i14 & 8388613) == 8388613 || (i14 & 5) == 5) {
            return this.f22967ylkuphrtab ? rectF.left + this.f22964ydmasvzmpa : this.f22937nufgyqmvbu.right;
        }
        return this.f22967ylkuphrtab ? this.f22937nufgyqmvbu.right : rectF.left + this.f22964ydmasvzmpa;
    }

    private void zoijcleaow(boolean z13) {
        StaticLayout staticLayout;
        dxjokdxxww(1.0f, z13);
        CharSequence charSequence = this.f22960wwaezpbzkn;
        if (charSequence != null && (staticLayout = this.f22965yfnezrywwk) != null) {
            this.f22938oipsdeybqn = TextUtils.ellipsize(charSequence, this.f22953ulzqkzuiru, staticLayout.getWidth(), this.f22920iozdgvuglv);
        }
        CharSequence charSequence2 = this.f22938oipsdeybqn;
        float fRibwqtqdhb = 0.0f;
        if (charSequence2 != null) {
            this.f22964ydmasvzmpa = ribwqtqdhb(this.f22953ulzqkzuiru, charSequence2);
        } else {
            this.f22964ydmasvzmpa = 0.0f;
        }
        int iZoijcleaow = zdlpuopuiu.zoijcleaow(this.f22914gtknphoqwx, this.f22967ylkuphrtab ? 1 : 0);
        int i13 = iZoijcleaow & 112;
        if (i13 == 48) {
            this.f22942oxmwwwfdhm = this.f22937nufgyqmvbu.top;
        } else if (i13 != 80) {
            this.f22942oxmwwwfdhm = this.f22937nufgyqmvbu.centerY() - ((this.f22953ulzqkzuiru.descent() - this.f22953ulzqkzuiru.ascent()) / 2.0f);
        } else {
            this.f22942oxmwwwfdhm = this.f22937nufgyqmvbu.bottom + this.f22953ulzqkzuiru.ascent();
        }
        int i14 = iZoijcleaow & 8388615;
        if (i14 == 1) {
            this.f22968zdlpuopuiu = this.f22937nufgyqmvbu.centerX() - (this.f22964ydmasvzmpa / 2.0f);
        } else if (i14 != 5) {
            this.f22968zdlpuopuiu = this.f22937nufgyqmvbu.left;
        } else {
            this.f22968zdlpuopuiu = this.f22937nufgyqmvbu.right - this.f22964ydmasvzmpa;
        }
        dxjokdxxww(0.0f, z13);
        StaticLayout staticLayout2 = this.f22965yfnezrywwk;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f22965yfnezrywwk;
        if (staticLayout3 == null || this.f22902bfopjjpdmp <= 1) {
            CharSequence charSequence3 = this.f22960wwaezpbzkn;
            if (charSequence3 != null) {
                fRibwqtqdhb = ribwqtqdhb(this.f22953ulzqkzuiru, charSequence3);
            }
        } else {
            fRibwqtqdhb = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f22965yfnezrywwk;
        this.f22946rgvfuqvkyq = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int iZoijcleaow2 = zdlpuopuiu.zoijcleaow(this.f22903btonecajqb, this.f22967ylkuphrtab ? 1 : 0);
        int i15 = iZoijcleaow2 & 112;
        if (i15 == 48) {
            this.f22955vdvldrhtss = this.f22933lqeggnwhkg.top;
        } else if (i15 != 80) {
            this.f22955vdvldrhtss = this.f22933lqeggnwhkg.centerY() - (height / 2.0f);
        } else {
            this.f22955vdvldrhtss = (this.f22933lqeggnwhkg.bottom - height) + this.f22953ulzqkzuiru.descent();
        }
        int i16 = iZoijcleaow2 & 8388615;
        if (i16 == 1) {
            this.f22929kcexrzcfyt = this.f22933lqeggnwhkg.centerX() - (fRibwqtqdhb / 2.0f);
        } else if (i16 != 5) {
            this.f22929kcexrzcfyt = this.f22933lqeggnwhkg.left;
        } else {
            this.f22929kcexrzcfyt = this.f22933lqeggnwhkg.right - fRibwqtqdhb;
        }
        btonecajqb();
        skhdrjzrfn(this.f22970zoijcleaow);
    }

    public final boolean ageimvtcrz(int[] iArr) {
        this.f22934mbcevpiqjq = iArr;
        if (!ulzqkzuiru()) {
            return false;
        }
        vipkmwdibw();
        return true;
    }

    public void auzgnhcxok(boolean z13) {
        this.f22945ppxfxbqfkf = z13;
    }

    public void bfopjjpdmp(Rect rect) {
        oipsdeybqn(rect.left, rect.top, rect.right, rect.bottom);
    }

    public float cdpycssgdh() {
        return this.f22909draadjrbmk;
    }

    public TimeInterpolator cllcsxoeiz() {
        return this.f22907crxdokpmqz;
    }

    public void czzsidtyhn(ColorStateList colorStateList) {
        if (this.f22939ojitshcjhn != colorStateList) {
            this.f22939ojitshcjhn = colorStateList;
            vipkmwdibw();
        }
    }

    public void draadjrbmk(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f22960wwaezpbzkn == null || this.f22911dxjokdxxww.width() <= 0.0f || this.f22911dxjokdxxww.height() <= 0.0f) {
            return;
        }
        this.f22953ulzqkzuiru.setTextSize(this.f22910dsvhmnatus);
        float f13 = this.f22966yggfygwlhe;
        float f14 = this.f22927jyumaefscl;
        boolean z13 = this.f22916hcddaimhww && this.f22926jpowsppfya != null;
        float f15 = this.f22905cllcsxoeiz;
        if (f15 != 1.0f && !this.f22945ppxfxbqfkf) {
            canvas.scale(f15, f15, f13, f14);
        }
        if (z13) {
            canvas.drawBitmap(this.f22926jpowsppfya, f13, f14, this.f22917hkdspvbjdz);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!jrbgnlbqoe() || (this.f22945ppxfxbqfkf && this.f22970zoijcleaow <= this.f22912eablkybsjg)) {
            canvas.translate(f13, f14);
            this.f22965yfnezrywwk.draw(canvas);
        } else {
            wflxmlrfwp(canvas, this.f22966yggfygwlhe - this.f22965yfnezrywwk.getLineStart(0), f14);
        }
        canvas.restoreToCount(iSave);
    }

    public CharSequence dsvhmnatus() {
        return this.f22932lmojexxdyd;
    }

    public void dvvnrvtcbc(int i13) {
        this.f22957weqkydbzbr = i13;
    }

    public void fiwbwshyhd(boolean z13) {
        this.f22943pkzmftpjix = z13;
    }

    public void fyldjkxazc(dxjokdxxww dxjokdxxwwVar) {
        if (dxjokdxxwwVar != null) {
            jhduphickx(true);
        }
    }

    public void grlcpdaxtj(TimeInterpolator timeInterpolator) {
        this.f22925jlmebxxoox = timeInterpolator;
        vipkmwdibw();
    }

    public float hcddaimhww() {
        return this.f22965yfnezrywwk.getSpacingMultiplier();
    }

    public void hszhottldk(TimeInterpolator timeInterpolator) {
        this.f22907crxdokpmqz = timeInterpolator;
        vipkmwdibw();
    }

    public void igdgnonuha(float f13) {
        this.f22941opjhrmiecq = f13;
    }

    public float iozdgvuglv() {
        return this.f22970zoijcleaow;
    }

    public void ipoelvxyzq(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f22932lmojexxdyd, charSequence)) {
            this.f22932lmojexxdyd = charSequence;
            this.f22960wwaezpbzkn = null;
            btonecajqb();
            vipkmwdibw();
        }
    }

    public float istkbnxepw() {
        stevsuqkhv(this.f22950sopmlzcsov);
        return -this.f22950sopmlzcsov.ascent();
    }

    public int iwizpuwonk() {
        return cqumvgiudr(this.f22939ojitshcjhn);
    }

    public void iwxlajgraz(float f13) {
        this.f22959wkgbmnqykc = f13;
        this.f22912eablkybsjg = eablkybsjg();
    }

    public void ixidwrxhsl(Typeface typeface) {
        boolean zSflfametgt = sflfametgt(typeface);
        boolean zRoivzttewh = roivzttewh(typeface);
        if (zSflfametgt || zRoivzttewh) {
            vipkmwdibw();
        }
    }

    public void iyctptxqzt(int i13) {
        oa.wkgbmnqykc wkgbmnqykcVar = new oa.wkgbmnqykc(this.f22919iobyxmoadg.getContext(), i13);
        if (wkgbmnqykcVar.dxjokdxxww() != null) {
            this.f22901agtfadlqog = wkgbmnqykcVar.dxjokdxxww();
        }
        if (wkgbmnqykcVar.btonecajqb() != 0.0f) {
            this.f22909draadjrbmk = wkgbmnqykcVar.btonecajqb();
        }
        ColorStateList colorStateList = wkgbmnqykcVar.f72400ppxfxbqfkf;
        if (colorStateList != null) {
            this.f22935metgxyhuhe = colorStateList;
        }
        this.f22928jztzpxfvev = wkgbmnqykcVar.f72398nufgyqmvbu;
        this.f22962xrmfcynszj = wkgbmnqykcVar.f72392dxjokdxxww;
        this.f22940okpsazkaxt = wkgbmnqykcVar.f72390btonecajqb;
        this.f22908czzsidtyhn = wkgbmnqykcVar.f72391draadjrbmk;
        oa.iobyxmoadg iobyxmoadgVar = this.f22904cdpycssgdh;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf();
        }
        this.f22904cdpycssgdh = new oa.iobyxmoadg(new zoijcleaow(), wkgbmnqykcVar.eablkybsjg());
        wkgbmnqykcVar.nufgyqmvbu(this.f22919iobyxmoadg.getContext(), this.f22904cdpycssgdh);
        vipkmwdibw();
    }

    public void jhduphickx(boolean z13) {
        if ((this.f22919iobyxmoadg.getHeight() <= 0 || this.f22919iobyxmoadg.getWidth() <= 0) && !z13) {
            return;
        }
        zoijcleaow(z13);
        ppxfxbqfkf();
    }

    public void jlmebxxoox(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f22913esjtqupxsv;
            if (typeface != null) {
                this.f22906cqumvgiudr = oa.nufgyqmvbu.zoijcleaow(configuration, typeface);
            }
            Typeface typeface2 = this.f22971zynmafqrjb;
            if (typeface2 != null) {
                this.f22944pmvmpeiblj = oa.nufgyqmvbu.zoijcleaow(configuration, typeface2);
            }
            Typeface typeface3 = this.f22906cqumvgiudr;
            if (typeface3 == null) {
                typeface3 = this.f22913esjtqupxsv;
            }
            this.f22922iwizpuwonk = typeface3;
            Typeface typeface4 = this.f22944pmvmpeiblj;
            if (typeface4 == null) {
                typeface4 = this.f22971zynmafqrjb;
            }
            this.f22931lereixgezr = typeface4;
            jhduphickx(true);
        }
    }

    public int jpowsppfya() {
        return this.f22902bfopjjpdmp;
    }

    public Typeface jyumaefscl() {
        Typeface typeface = this.f22922iwizpuwonk;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void jztzpxfvev(int i13, int i14, int i15, int i16) {
        if (ikoacuggdj(this.f22937nufgyqmvbu, i13, i14, i15, i16)) {
            return;
        }
        this.f22937nufgyqmvbu.set(i13, i14, i15, i16);
        this.f22936ntlheqmsrt = true;
    }

    public TextUtils.TruncateAt kegysxyocb() {
        return this.f22920iozdgvuglv;
    }

    public int lereixgezr() {
        return this.f22946rgvfuqvkyq;
    }

    public float lmojexxdyd() {
        return this.f22912eablkybsjg;
    }

    public void lrnfpwlwnk(ColorStateList colorStateList) {
        if (this.f22901agtfadlqog != colorStateList) {
            this.f22901agtfadlqog = colorStateList;
            vipkmwdibw();
        }
    }

    public void lxfrhoxuzk(float f13) {
        this.f22923iyctptxqzt = f13;
    }

    public void metgxyhuhe(int i13) {
        oa.wkgbmnqykc wkgbmnqykcVar = new oa.wkgbmnqykc(this.f22919iobyxmoadg.getContext(), i13);
        if (wkgbmnqykcVar.dxjokdxxww() != null) {
            this.f22939ojitshcjhn = wkgbmnqykcVar.dxjokdxxww();
        }
        if (wkgbmnqykcVar.btonecajqb() != 0.0f) {
            this.f22958wflxmlrfwp = wkgbmnqykcVar.btonecajqb();
        }
        ColorStateList colorStateList = wkgbmnqykcVar.f72400ppxfxbqfkf;
        if (colorStateList != null) {
            this.f22918ikoacuggdj = colorStateList;
        }
        this.f22956vipkmwdibw = wkgbmnqykcVar.f72398nufgyqmvbu;
        this.f22924jhduphickx = wkgbmnqykcVar.f72392dxjokdxxww;
        this.f22947ribwqtqdhb = wkgbmnqykcVar.f72390btonecajqb;
        this.f22948rlfsiqarku = wkgbmnqykcVar.f72391draadjrbmk;
        oa.iobyxmoadg iobyxmoadgVar = this.f22963yadqdtsiqt;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf();
        }
        this.f22963yadqdtsiqt = new oa.iobyxmoadg(new C0400iobyxmoadg(), wkgbmnqykcVar.eablkybsjg());
        wkgbmnqykcVar.nufgyqmvbu(this.f22919iobyxmoadg.getContext(), this.f22963yadqdtsiqt);
        vipkmwdibw();
    }

    public void mhtqkkgtqm(TextUtils.TruncateAt truncateAt) {
        this.f22920iozdgvuglv = truncateAt;
        vipkmwdibw();
    }

    public void nuxfzjnpeb(float f13) {
        if (this.f22909draadjrbmk != f13) {
            this.f22909draadjrbmk = f13;
            vipkmwdibw();
        }
    }

    public void oipsdeybqn(int i13, int i14, int i15, int i16) {
        if (ikoacuggdj(this.f22933lqeggnwhkg, i13, i14, i15, i16)) {
            return;
        }
        this.f22933lqeggnwhkg.set(i13, i14, i15, i16);
        this.f22936ntlheqmsrt = true;
    }

    public void ojitshcjhn(RectF rectF, int i13, int i14) {
        this.f22967ylkuphrtab = gxszxtbevo(this.f22932lmojexxdyd);
        rectF.left = Math.max(kcexrzcfyt(i13, i14), this.f22937nufgyqmvbu.left);
        rectF.top = this.f22937nufgyqmvbu.top;
        rectF.right = Math.min(zdlpuopuiu(rectF, i13, i14), this.f22937nufgyqmvbu.right);
        rectF.bottom = this.f22937nufgyqmvbu.top + oxmwwwfdhm();
    }

    public void okpsazkaxt(ColorStateList colorStateList) {
        if (this.f22939ojitshcjhn == colorStateList && this.f22901agtfadlqog == colorStateList) {
            return;
        }
        this.f22939ojitshcjhn = colorStateList;
        this.f22901agtfadlqog = colorStateList;
        vipkmwdibw();
    }

    public void opjhrmiecq(float f13) {
        if (this.f22908czzsidtyhn != f13) {
            this.f22908czzsidtyhn = f13;
            vipkmwdibw();
        }
    }

    public float oxmwwwfdhm() {
        wypolnanlu(this.f22950sopmlzcsov);
        return -this.f22950sopmlzcsov.ascent();
    }

    public float pkzmftpjix() {
        return this.f22965yfnezrywwk.getSpacingAdd();
    }

    public float pmvmpeiblj() {
        stevsuqkhv(this.f22950sopmlzcsov);
        return (-this.f22950sopmlzcsov.ascent()) + this.f22950sopmlzcsov.descent();
    }

    public ColorStateList rgvfuqvkyq() {
        return this.f22939ojitshcjhn;
    }

    public void tbqsvytpvh(Typeface typeface) {
        if (roivzttewh(typeface)) {
            vipkmwdibw();
        }
    }

    public void uawqvzlxes(float f13) {
        float fIobyxmoadg = o1.iobyxmoadg.iobyxmoadg(f13, 0.0f, 1.0f);
        if (fIobyxmoadg != this.f22970zoijcleaow) {
            this.f22970zoijcleaow = fIobyxmoadg;
            ppxfxbqfkf();
        }
    }

    public final boolean ulzqkzuiru() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f22939ojitshcjhn;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f22901agtfadlqog) != null && colorStateList.isStateful());
    }

    public void uwvvkdfqfp(int i13) {
        if (this.f22914gtknphoqwx != i13) {
            this.f22914gtknphoqwx = i13;
            vipkmwdibw();
        }
    }

    public int vdvldrhtss() {
        return this.f22914gtknphoqwx;
    }

    public void vipkmwdibw() {
        jhduphickx(false);
    }

    public void wizcaqwiak(int i13) {
        if (i13 != this.f22902bfopjjpdmp) {
            this.f22902bfopjjpdmp = i13;
            btonecajqb();
            vipkmwdibw();
        }
    }

    public int wwaezpbzkn() {
        return this.f22957weqkydbzbr;
    }

    public void xrmfcynszj(Rect rect) {
        jztzpxfvev(rect.left, rect.top, rect.right, rect.bottom);
    }

    public Typeface yadqdtsiqt() {
        Typeface typeface = this.f22931lereixgezr;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void ydmasvzmpa(Typeface typeface) {
        if (sflfametgt(typeface)) {
            vipkmwdibw();
        }
    }

    public void yfnezrywwk(float f13) {
        if (this.f22958wflxmlrfwp != f13) {
            this.f22958wflxmlrfwp = f13;
            vipkmwdibw();
        }
    }

    public float yggfygwlhe() {
        return this.f22958wflxmlrfwp;
    }

    public int ylkuphrtab() {
        StaticLayout staticLayout = this.f22965yfnezrywwk;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public void zeieaojujs(int i13) {
        if (this.f22903btonecajqb != i13) {
            this.f22903btonecajqb = i13;
            vipkmwdibw();
        }
    }

    public void zfvoamnweg(int i13) {
        this.f22915gxszxtbevo = i13;
    }

    public int zynmafqrjb() {
        return this.f22903btonecajqb;
    }
}
