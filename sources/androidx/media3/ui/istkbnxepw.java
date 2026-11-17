package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class istkbnxepw {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f11804agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private Layout.Alignment f11805btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f11806cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private float f11807cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private float f11808draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private CharSequence f11809dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f11810eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private float f11811esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private Bitmap f11812gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final TextPaint f11813gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f11814iobyxmoadg;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private StaticLayout f11815iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f11816istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f11817iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f11818jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private int f11819kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private float f11820lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private int f11821lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Paint f11822lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Paint f11823nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private float f11824ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private float f11825oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private Rect f11826pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f11827pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f11828ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f11829rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private float f11830vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f11831wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f11832wkgbmnqykc;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private int f11833wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private StaticLayout f11834yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f11835yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f11836ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f11837zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f11838zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f11839zynmafqrjb;

    public istkbnxepw(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f11810eablkybsjg = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f11832wkgbmnqykc = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f11814iobyxmoadg = fRound;
        this.f11838zoijcleaow = fRound;
        this.f11828ppxfxbqfkf = fRound;
        TextPaint textPaint = new TextPaint();
        this.f11813gxszxtbevo = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f11822lqeggnwhkg = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f11823nufgyqmvbu = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private void eablkybsjg(Canvas canvas) {
        StaticLayout staticLayout = this.f11834yadqdtsiqt;
        StaticLayout staticLayout2 = this.f11815iozdgvuglv;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f11821lmojexxdyd, this.f11833wwaezpbzkn);
        if (Color.alpha(this.f11835yggfygwlhe) > 0) {
            this.f11822lqeggnwhkg.setColor(this.f11835yggfygwlhe);
            canvas.drawRect(-this.f11836ylkuphrtab, 0.0f, staticLayout.getWidth() + this.f11836ylkuphrtab, staticLayout.getHeight(), this.f11822lqeggnwhkg);
        }
        int i13 = this.f11817iwizpuwonk;
        if (i13 == 1) {
            this.f11813gxszxtbevo.setStrokeJoin(Paint.Join.ROUND);
            this.f11813gxszxtbevo.setStrokeWidth(this.f11814iobyxmoadg);
            this.f11813gxszxtbevo.setColor(this.f11818jyumaefscl);
            this.f11813gxszxtbevo.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i13 == 2) {
            TextPaint textPaint = this.f11813gxszxtbevo;
            float f13 = this.f11838zoijcleaow;
            float f14 = this.f11828ppxfxbqfkf;
            textPaint.setShadowLayer(f13, f14, f14, this.f11818jyumaefscl);
        } else if (i13 == 3 || i13 == 4) {
            boolean z13 = i13 == 3;
            int i14 = z13 ? -1 : this.f11818jyumaefscl;
            int i15 = z13 ? this.f11818jyumaefscl : -1;
            float f15 = this.f11838zoijcleaow / 2.0f;
            this.f11813gxszxtbevo.setColor(this.f11819kcexrzcfyt);
            this.f11813gxszxtbevo.setStyle(Paint.Style.FILL);
            float f16 = -f15;
            this.f11813gxszxtbevo.setShadowLayer(this.f11838zoijcleaow, f16, f16, i14);
            staticLayout2.draw(canvas);
            this.f11813gxszxtbevo.setShadowLayer(this.f11838zoijcleaow, f15, f15, i15);
        }
        this.f11813gxszxtbevo.setColor(this.f11819kcexrzcfyt);
        this.f11813gxszxtbevo.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f11813gxszxtbevo.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    private void gxszxtbevo() {
        float f13;
        int i13;
        float f14;
        Bitmap bitmap = this.f11812gtknphoqwx;
        int i14 = this.f11816istkbnxepw;
        int i15 = this.f11827pmvmpeiblj;
        int i16 = this.f11806cdpycssgdh;
        int i17 = this.f11839zynmafqrjb;
        float f15 = i14 - i15;
        float f16 = i15 + (this.f11824ojitshcjhn * f15);
        float f17 = i16 - i17;
        float f18 = i17 + (this.f11808draadjrbmk * f17);
        int iRound = Math.round(f15 * this.f11830vdvldrhtss);
        float f19 = this.f11825oxmwwwfdhm;
        int iRound2 = f19 != -3.4028235E38f ? Math.round(f17 * f19) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i18 = this.f11829rgvfuqvkyq;
        if (i18 != 2) {
            if (i18 == 1) {
                f13 = iRound / 2;
            }
            int iRound3 = Math.round(f16);
            i13 = this.f11804agtfadlqog;
            if (i13 == 2) {
                if (i13 == 1) {
                    f14 = iRound2 / 2;
                }
                int iRound4 = Math.round(f18);
                this.f11826pkzmftpjix = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f14 = iRound2;
            f18 -= f14;
            int iRound5 = Math.round(f18);
            this.f11826pkzmftpjix = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f13 = iRound;
        f16 -= f13;
        int iRound6 = Math.round(f16);
        i13 = this.f11804agtfadlqog;
        if (i13 == 2) {
            if (i13 == 1) {
                f14 = iRound2 / 2;
            }
            int iRound7 = Math.round(f18);
            this.f11826pkzmftpjix = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f14 = iRound2;
        f18 -= f14;
        int iRound8 = Math.round(f18);
        this.f11826pkzmftpjix = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    private static boolean iobyxmoadg(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    private void lqeggnwhkg() {
        int i13;
        int i14;
        int iMax;
        int iMin;
        int iRound;
        int i15;
        CharSequence charSequence = this.f11809dxjokdxxww;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f11809dxjokdxxww);
        int i16 = this.f11816istkbnxepw - this.f11827pmvmpeiblj;
        int i17 = this.f11806cdpycssgdh - this.f11839zynmafqrjb;
        this.f11813gxszxtbevo.setTextSize(this.f11807cqumvgiudr);
        int i18 = (int) ((this.f11807cqumvgiudr * 0.125f) + 0.5f);
        int i19 = i18 * 2;
        int i23 = i16 - i19;
        float f13 = this.f11830vdvldrhtss;
        if (f13 != -3.4028235E38f) {
            i23 = (int) (i23 * f13);
        }
        int i24 = i23;
        if (i24 <= 0) {
            y2.kcexrzcfyt.nufgyqmvbu("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f11811esjtqupxsv > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f11811esjtqupxsv), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f11817iwizpuwonk == 1) {
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (Color.alpha(this.f11837zdlpuopuiu) > 0) {
            int i25 = this.f11817iwizpuwonk;
            if (i25 == 0 || i25 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f11837zdlpuopuiu), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f11837zdlpuopuiu), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f11805btonecajqb;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f11813gxszxtbevo, i24, alignment2, this.f11832wkgbmnqykc, this.f11810eablkybsjg, true);
        this.f11834yadqdtsiqt = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.f11834yadqdtsiqt.getLineCount();
        int iMax2 = 0;
        for (int i26 = 0; i26 < lineCount; i26++) {
            iMax2 = Math.max((int) Math.ceil(this.f11834yadqdtsiqt.getLineWidth(i26)), iMax2);
        }
        if (this.f11830vdvldrhtss == -3.4028235E38f || iMax2 >= i24) {
            i24 = iMax2;
        }
        int i27 = i24 + i19;
        float f14 = this.f11824ojitshcjhn;
        if (f14 != -3.4028235E38f) {
            int iRound2 = Math.round(i16 * f14);
            int i28 = this.f11827pmvmpeiblj;
            int i29 = iRound2 + i28;
            int i33 = this.f11829rgvfuqvkyq;
            i13 = 1;
            if (i33 != 1) {
                i14 = 2;
                if (i33 == 2) {
                    i29 -= i27;
                }
            } else {
                i14 = 2;
                i29 = ((i29 * 2) - i27) / 2;
            }
            iMax = Math.max(i29, i28);
            iMin = Math.min(i27 + iMax, this.f11816istkbnxepw);
        } else {
            i13 = 1;
            i14 = 2;
            iMax = ((i16 - i27) / 2) + this.f11827pmvmpeiblj;
            iMin = iMax + i27;
        }
        int i34 = iMin - iMax;
        if (i34 <= 0) {
            y2.kcexrzcfyt.nufgyqmvbu("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f15 = this.f11808draadjrbmk;
        if (f15 != -3.4028235E38f) {
            if (this.f11831wflxmlrfwp == 0) {
                iRound = Math.round(i17 * f15) + this.f11839zynmafqrjb;
                int i35 = this.f11804agtfadlqog;
                if (i35 == i14) {
                    iRound -= height;
                } else if (i35 == i13) {
                    iRound = ((iRound * 2) - height) / i14;
                }
            } else {
                int lineBottom = this.f11834yadqdtsiqt.getLineBottom(0) - this.f11834yadqdtsiqt.getLineTop(0);
                float f16 = this.f11808draadjrbmk;
                if (f16 >= 0.0f) {
                    iRound = Math.round(f16 * lineBottom) + this.f11839zynmafqrjb;
                } else {
                    iRound = Math.round((f16 + 1.0f) * lineBottom) + this.f11806cdpycssgdh;
                    iRound -= height;
                }
            }
            int i36 = iRound + height;
            int i37 = this.f11806cdpycssgdh;
            if (i36 <= i37) {
                int i38 = this.f11839zynmafqrjb;
                if (iRound < i38) {
                    i15 = i38;
                }
                this.f11834yadqdtsiqt = new StaticLayout(spannableStringBuilder, this.f11813gxszxtbevo, i34, alignment2, this.f11832wkgbmnqykc, this.f11810eablkybsjg, true);
                this.f11815iozdgvuglv = new StaticLayout(spannableStringBuilder2, this.f11813gxszxtbevo, i34, alignment2, this.f11832wkgbmnqykc, this.f11810eablkybsjg, true);
                this.f11821lmojexxdyd = iMax;
                this.f11833wwaezpbzkn = i15;
                this.f11836ylkuphrtab = i18;
            }
            iRound = i37 - height;
        } else {
            iRound = (this.f11806cdpycssgdh - height) - ((int) (i17 * this.f11820lereixgezr));
        }
        i15 = iRound;
        this.f11834yadqdtsiqt = new StaticLayout(spannableStringBuilder, this.f11813gxszxtbevo, i34, alignment2, this.f11832wkgbmnqykc, this.f11810eablkybsjg, true);
        this.f11815iozdgvuglv = new StaticLayout(spannableStringBuilder2, this.f11813gxszxtbevo, i34, alignment2, this.f11832wkgbmnqykc, this.f11810eablkybsjg, true);
        this.f11821lmojexxdyd = iMax;
        this.f11833wwaezpbzkn = i15;
        this.f11836ylkuphrtab = i18;
    }

    private void ppxfxbqfkf(Canvas canvas) {
        canvas.drawBitmap(this.f11812gtknphoqwx, (Rect) null, this.f11826pkzmftpjix, this.f11823nufgyqmvbu);
    }

    private void wkgbmnqykc(Canvas canvas, boolean z13) {
        if (z13) {
            eablkybsjg(canvas);
            return;
        }
        y2.iobyxmoadg.eablkybsjg(this.f11826pkzmftpjix);
        y2.iobyxmoadg.eablkybsjg(this.f11812gtknphoqwx);
        ppxfxbqfkf(canvas);
    }

    public void zoijcleaow(x2.iobyxmoadg iobyxmoadgVar, d5.iobyxmoadg iobyxmoadgVar2, float f13, float f14, float f15, Canvas canvas, int i13, int i14, int i15, int i16) {
        int i17;
        boolean z13 = iobyxmoadgVar.f120970wkgbmnqykc == null;
        if (!z13) {
            i17 = -16777216;
        } else if (TextUtils.isEmpty(iobyxmoadgVar.f120962iobyxmoadg)) {
            return;
        } else {
            i17 = iobyxmoadgVar.f120957draadjrbmk ? iobyxmoadgVar.f120969wflxmlrfwp : iobyxmoadgVar2.f27059ppxfxbqfkf;
        }
        if (iobyxmoadg(this.f11809dxjokdxxww, iobyxmoadgVar.f120962iobyxmoadg) && Objects.equals(this.f11805btonecajqb, iobyxmoadgVar.f120971zoijcleaow) && this.f11812gtknphoqwx == iobyxmoadgVar.f120970wkgbmnqykc && this.f11808draadjrbmk == iobyxmoadgVar.f120959eablkybsjg && this.f11831wflxmlrfwp == iobyxmoadgVar.f120961gxszxtbevo && Integer.valueOf(this.f11804agtfadlqog).equals(Integer.valueOf(iobyxmoadgVar.f120963lqeggnwhkg)) && this.f11824ojitshcjhn == iobyxmoadgVar.f120964nufgyqmvbu && Integer.valueOf(this.f11829rgvfuqvkyq).equals(Integer.valueOf(iobyxmoadgVar.f120958dxjokdxxww)) && this.f11830vdvldrhtss == iobyxmoadgVar.f120956btonecajqb && this.f11825oxmwwwfdhm == iobyxmoadgVar.f120960gtknphoqwx && this.f11819kcexrzcfyt == iobyxmoadgVar2.f27058iobyxmoadg && this.f11837zdlpuopuiu == iobyxmoadgVar2.f27061zoijcleaow && this.f11835yggfygwlhe == i17 && this.f11817iwizpuwonk == iobyxmoadgVar2.f27060wkgbmnqykc && this.f11818jyumaefscl == iobyxmoadgVar2.f27056eablkybsjg && Objects.equals(this.f11813gxszxtbevo.getTypeface(), iobyxmoadgVar2.f27057gxszxtbevo) && this.f11807cqumvgiudr == f13 && this.f11811esjtqupxsv == f14 && this.f11820lereixgezr == f15 && this.f11827pmvmpeiblj == i13 && this.f11839zynmafqrjb == i14 && this.f11816istkbnxepw == i15 && this.f11806cdpycssgdh == i16) {
            wkgbmnqykc(canvas, z13);
            return;
        }
        this.f11809dxjokdxxww = iobyxmoadgVar.f120962iobyxmoadg;
        this.f11805btonecajqb = iobyxmoadgVar.f120971zoijcleaow;
        this.f11812gtknphoqwx = iobyxmoadgVar.f120970wkgbmnqykc;
        this.f11808draadjrbmk = iobyxmoadgVar.f120959eablkybsjg;
        this.f11831wflxmlrfwp = iobyxmoadgVar.f120961gxszxtbevo;
        this.f11804agtfadlqog = iobyxmoadgVar.f120963lqeggnwhkg;
        this.f11824ojitshcjhn = iobyxmoadgVar.f120964nufgyqmvbu;
        this.f11829rgvfuqvkyq = iobyxmoadgVar.f120958dxjokdxxww;
        this.f11830vdvldrhtss = iobyxmoadgVar.f120956btonecajqb;
        this.f11825oxmwwwfdhm = iobyxmoadgVar.f120960gtknphoqwx;
        this.f11819kcexrzcfyt = iobyxmoadgVar2.f27058iobyxmoadg;
        this.f11837zdlpuopuiu = iobyxmoadgVar2.f27061zoijcleaow;
        this.f11835yggfygwlhe = i17;
        this.f11817iwizpuwonk = iobyxmoadgVar2.f27060wkgbmnqykc;
        this.f11818jyumaefscl = iobyxmoadgVar2.f27056eablkybsjg;
        this.f11813gxszxtbevo.setTypeface(iobyxmoadgVar2.f27057gxszxtbevo);
        this.f11807cqumvgiudr = f13;
        this.f11811esjtqupxsv = f14;
        this.f11820lereixgezr = f15;
        this.f11827pmvmpeiblj = i13;
        this.f11839zynmafqrjb = i14;
        this.f11816istkbnxepw = i15;
        this.f11806cdpycssgdh = i16;
        if (z13) {
            y2.iobyxmoadg.eablkybsjg(this.f11809dxjokdxxww);
            lqeggnwhkg();
        } else {
            y2.iobyxmoadg.eablkybsjg(this.f11812gtknphoqwx);
            gxszxtbevo();
        }
        wkgbmnqykc(canvas, z13);
    }
}
