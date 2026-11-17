package k0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public final class rlfsiqarku {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final boolean f53347agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int f53348btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final float f53349draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f53350dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final pkzmftpjix f53351eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final int f53352gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f53353gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TextPaint f53354iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private wwaezpbzkn f53355kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private l0.dxjokdxxww f53356lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Layout f53357nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final Paint.FontMetricsInt f53358ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final Rect f53359oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f53360ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final int f53361rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final m0.nufgyqmvbu[] f53362vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final float f53363wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f53364wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final TextUtils.TruncateAt f53365zoijcleaow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public rlfsiqarku(CharSequence charSequence, float f13, TextPaint textPaint, int i13, TextUtils.TruncateAt truncateAt, int i14, float f14, float f15, boolean z13, boolean z14, int i15, int i16, int i17, int i18, int i19, int i23, int[] iArr, int[] iArr2, pkzmftpjix pkzmftpjixVar) {
        boolean z15;
        boolean z16;
        Layout layoutIobyxmoadg;
        this.f53354iobyxmoadg = textPaint;
        this.f53365zoijcleaow = truncateAt;
        this.f53360ppxfxbqfkf = z13;
        this.f53364wkgbmnqykc = z14;
        this.f53351eablkybsjg = pkzmftpjixVar;
        this.f53359oxmwwwfdhm = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicGtknphoqwx = uwvvkdfqfp.gtknphoqwx(i14);
        Layout.Alignment alignmentIobyxmoadg = xrmfcynszj.f53380iobyxmoadg.iobyxmoadg(i13);
        boolean z17 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, m0.iobyxmoadg.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsEablkybsjg = pkzmftpjixVar.eablkybsjg();
            double d13 = f13;
            int iCeil = (int) Math.ceil(d13);
            if (metricsEablkybsjg == null || pkzmftpjixVar.dxjokdxxww() > f13 || z17) {
                z15 = true;
                this.f53347agtfadlqog = false;
                z16 = false;
                layoutIobyxmoadg = ikoacuggdj.f53307iobyxmoadg.iobyxmoadg(charSequence, textPaint, iCeil, 0, charSequence.length(), textDirectionHeuristicGtknphoqwx, alignmentIobyxmoadg, i15, truncateAt, (int) Math.ceil(d13), f14, f15, i23, z13, z14, i16, i17, i18, i19, iArr, iArr2);
            } else {
                this.f53347agtfadlqog = true;
                z15 = true;
                layoutIobyxmoadg = gtknphoqwx.f53303iobyxmoadg.iobyxmoadg(charSequence, textPaint, iCeil, metricsEablkybsjg, alignmentIobyxmoadg, z13, z14, truncateAt, iCeil);
                z16 = false;
            }
            this.f53357nufgyqmvbu = layoutIobyxmoadg;
            Trace.endSection();
            int iMin = Math.min(layoutIobyxmoadg.getLineCount(), i15);
            this.f53350dxjokdxxww = iMin;
            int i24 = iMin - 1;
            this.f53353gxszxtbevo = (iMin >= i15 && (layoutIobyxmoadg.getEllipsisCount(i24) > 0 || layoutIobyxmoadg.getLineEnd(i24) != charSequence.length())) ? z15 : z16;
            long jDraadjrbmk = uwvvkdfqfp.draadjrbmk(this);
            m0.nufgyqmvbu[] nufgyqmvbuVarArrBtonecajqb = uwvvkdfqfp.btonecajqb(this);
            this.f53362vdvldrhtss = nufgyqmvbuVarArrBtonecajqb;
            long jDxjokdxxww = nufgyqmvbuVarArrBtonecajqb != null ? uwvvkdfqfp.dxjokdxxww(nufgyqmvbuVarArrBtonecajqb) : uwvvkdfqfp.f53369zoijcleaow;
            this.f53348btonecajqb = Math.max(yfnezrywwk.ppxfxbqfkf(jDraadjrbmk), yfnezrywwk.ppxfxbqfkf(jDxjokdxxww));
            this.f53352gtknphoqwx = Math.max(yfnezrywwk.zoijcleaow(jDraadjrbmk), yfnezrywwk.zoijcleaow(jDxjokdxxww));
            Paint.FontMetricsInt fontMetricsIntNufgyqmvbu = uwvvkdfqfp.nufgyqmvbu(this, textPaint, textDirectionHeuristicGtknphoqwx, nufgyqmvbuVarArrBtonecajqb);
            this.f53361rgvfuqvkyq = fontMetricsIntNufgyqmvbu != null ? fontMetricsIntNufgyqmvbu.bottom - ((int) kcexrzcfyt(i24)) : z16;
            this.f53358ojitshcjhn = fontMetricsIntNufgyqmvbu;
            this.f53349draadjrbmk = m0.wkgbmnqykc.zoijcleaow(layoutIobyxmoadg, i24, null, 2, null);
            this.f53363wflxmlrfwp = m0.wkgbmnqykc.wkgbmnqykc(layoutIobyxmoadg, i24, null, 2, null);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    private final wwaezpbzkn btonecajqb() {
        wwaezpbzkn wwaezpbzknVar = this.f53355kcexrzcfyt;
        if (wwaezpbzknVar != null) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wwaezpbzknVar);
            return wwaezpbzknVar;
        }
        wwaezpbzkn wwaezpbzknVar2 = new wwaezpbzkn(this.f53357nufgyqmvbu);
        this.f53355kcexrzcfyt = wwaezpbzknVar2;
        return wwaezpbzknVar2;
    }

    private final float lqeggnwhkg(int i13) {
        if (i13 == this.f53350dxjokdxxww - 1) {
            return this.f53349draadjrbmk + this.f53363wflxmlrfwp;
        }
        return 0.0f;
    }

    public static /* synthetic */ float yadqdtsiqt(rlfsiqarku rlfsiqarkuVar, int i13, boolean z13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        return rlfsiqarkuVar.cdpycssgdh(i13, z13);
    }

    public static /* synthetic */ float zynmafqrjb(rlfsiqarku rlfsiqarkuVar, int i13, boolean z13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        return rlfsiqarkuVar.pmvmpeiblj(i13, z13);
    }

    public final int agtfadlqog(int i13) {
        return this.f53357nufgyqmvbu.getEllipsisCount(i13);
    }

    public final float cdpycssgdh(int i13, boolean z13) {
        return btonecajqb().ppxfxbqfkf(i13, false, z13) + lqeggnwhkg(vdvldrhtss(i13));
    }

    public final int cqumvgiudr(int i13) {
        return (uwvvkdfqfp.wflxmlrfwp(this.f53357nufgyqmvbu, i13) && this.f53365zoijcleaow == TextUtils.TruncateAt.END) ? this.f53357nufgyqmvbu.getLineStart(i13) + this.f53357nufgyqmvbu.getEllipsisStart(i13) : btonecajqb().eablkybsjg(i13);
    }

    public final float draadjrbmk(int i13) {
        if (i13 != this.f53350dxjokdxxww - 1 || this.f53358ojitshcjhn == null) {
            return this.f53348btonecajqb + this.f53357nufgyqmvbu.getLineBottom(i13) + (i13 == this.f53350dxjokdxxww + (-1) ? this.f53352gtknphoqwx : 0);
        }
        return this.f53357nufgyqmvbu.getLineBottom(i13 - 1) + this.f53358ojitshcjhn.bottom;
    }

    public final Layout dxjokdxxww() {
        return this.f53357nufgyqmvbu;
    }

    public final boolean eablkybsjg() {
        return this.f53364wkgbmnqykc;
    }

    public final int esjtqupxsv(int i13, float f13) {
        return this.f53357nufgyqmvbu.getOffsetForHorizontal(i13, f13 + ((-1) * lqeggnwhkg(i13)));
    }

    public final float gtknphoqwx(int i13) {
        return this.f53348btonecajqb + ((i13 != this.f53350dxjokdxxww + (-1) || this.f53358ojitshcjhn == null) ? this.f53357nufgyqmvbu.getLineBaseline(i13) : iwizpuwonk(i13) - this.f53358ojitshcjhn.ascent);
    }

    public final int gxszxtbevo() {
        return (this.f53353gxszxtbevo ? this.f53357nufgyqmvbu.getLineBottom(this.f53350dxjokdxxww - 1) : this.f53357nufgyqmvbu.getHeight()) + this.f53348btonecajqb + this.f53352gtknphoqwx + this.f53361rgvfuqvkyq;
    }

    public final boolean hcddaimhww(int i13) {
        return this.f53357nufgyqmvbu.isRtlCharAt(i13);
    }

    public final void iobyxmoadg(int i13, int i14, float[] fArr, int i15) {
        float fWkgbmnqykc;
        float fEablkybsjg;
        int length = lmojexxdyd().length();
        if (!(i13 >= 0)) {
            q0.iobyxmoadg.iobyxmoadg("startOffset must be > 0");
        }
        if (!(i13 < length)) {
            q0.iobyxmoadg.iobyxmoadg("startOffset must be less than text length");
        }
        if (!(i14 > i13)) {
            q0.iobyxmoadg.iobyxmoadg("endOffset must be greater than startOffset");
        }
        if (!(i14 <= length)) {
            q0.iobyxmoadg.iobyxmoadg("endOffset must be smaller or equal to text length");
        }
        if (!(fArr.length - i15 >= (i14 - i13) * 4)) {
            q0.iobyxmoadg.iobyxmoadg("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iVdvldrhtss = vdvldrhtss(i13);
        int iVdvldrhtss2 = vdvldrhtss(i14 - 1);
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(this);
        if (iVdvldrhtss > iVdvldrhtss2) {
            return;
        }
        int i16 = iVdvldrhtss;
        int i17 = i15;
        while (true) {
            int iJyumaefscl = jyumaefscl(i16);
            int iRgvfuqvkyq = rgvfuqvkyq(i16);
            int iMin = Math.min(i14, iRgvfuqvkyq);
            float fIwizpuwonk = iwizpuwonk(i16);
            float fDraadjrbmk = draadjrbmk(i16);
            boolean z13 = lereixgezr(i16) == 1;
            for (int iMax = Math.max(i13, iJyumaefscl); iMax < iMin; iMax++) {
                boolean zHcddaimhww = hcddaimhww(iMax);
                if (z13 && !zHcddaimhww) {
                    fWkgbmnqykc = yadqdtsiqtVar.zoijcleaow(iMax);
                    fEablkybsjg = yadqdtsiqtVar.ppxfxbqfkf(iMax + 1);
                } else if (z13 && zHcddaimhww) {
                    fEablkybsjg = yadqdtsiqtVar.wkgbmnqykc(iMax);
                    fWkgbmnqykc = yadqdtsiqtVar.eablkybsjg(iMax + 1);
                } else if (z13 || !zHcddaimhww) {
                    fWkgbmnqykc = yadqdtsiqtVar.wkgbmnqykc(iMax);
                    fEablkybsjg = yadqdtsiqtVar.eablkybsjg(iMax + 1);
                } else {
                    fEablkybsjg = yadqdtsiqtVar.zoijcleaow(iMax);
                    fWkgbmnqykc = yadqdtsiqtVar.ppxfxbqfkf(iMax + 1);
                }
                fArr[i17] = fWkgbmnqykc;
                fArr[i17 + 1] = fIwizpuwonk;
                fArr[i17 + 2] = fEablkybsjg;
                fArr[i17 + 3] = fDraadjrbmk;
                i17 += 4;
            }
            if (i16 == iVdvldrhtss2) {
                return;
            } else {
                i16++;
            }
        }
    }

    public final void iozdgvuglv(int i13, int i14, Path path) {
        this.f53357nufgyqmvbu.getSelectionPath(i13, i14, path);
        if (this.f53348btonecajqb == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.f53348btonecajqb);
    }

    public final int[] istkbnxepw(RectF rectF, int i13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return Build.VERSION.SDK_INT >= 34 ? gxszxtbevo.f53304iobyxmoadg.ppxfxbqfkf(this, rectF, i13, rgvfuqvkyqVar) : czzsidtyhn.wkgbmnqykc(this, this.f53357nufgyqmvbu, btonecajqb(), rectF, i13, rgvfuqvkyqVar);
    }

    public final float iwizpuwonk(int i13) {
        return this.f53357nufgyqmvbu.getLineTop(i13) + (i13 == 0 ? 0 : this.f53348btonecajqb);
    }

    public final void jpowsppfya(Canvas canvas) {
        if (canvas.getClipBounds(this.f53359oxmwwwfdhm)) {
            int i13 = this.f53348btonecajqb;
            if (i13 != 0) {
                canvas.translate(0.0f, i13);
            }
            metgxyhuhe metgxyhuheVar = uwvvkdfqfp.f53368iobyxmoadg;
            metgxyhuheVar.iobyxmoadg(canvas);
            this.f53357nufgyqmvbu.draw(metgxyhuheVar);
            int i14 = this.f53348btonecajqb;
            if (i14 != 0) {
                canvas.translate(0.0f, (-1) * i14);
            }
        }
    }

    public final int jyumaefscl(int i13) {
        return this.f53357nufgyqmvbu.getLineStart(i13);
    }

    public final float kcexrzcfyt(int i13) {
        return draadjrbmk(i13) - iwizpuwonk(i13);
    }

    public final int lereixgezr(int i13) {
        return this.f53357nufgyqmvbu.getParagraphDirection(i13);
    }

    public final CharSequence lmojexxdyd() {
        return this.f53357nufgyqmvbu.getText();
    }

    public final boolean nufgyqmvbu() {
        return this.f53360ppxfxbqfkf;
    }

    public final int ojitshcjhn(int i13) {
        return this.f53357nufgyqmvbu.getEllipsisStart(i13);
    }

    public final int oxmwwwfdhm(int i13) {
        return this.f53357nufgyqmvbu.getLineForVertical(i13 - this.f53348btonecajqb);
    }

    public final boolean pkzmftpjix() {
        if (this.f53347agtfadlqog) {
            gtknphoqwx gtknphoqwxVar = gtknphoqwx.f53303iobyxmoadg;
            Layout layout = this.f53357nufgyqmvbu;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return gtknphoqwxVar.zoijcleaow((BoringLayout) layout);
        }
        ikoacuggdj ikoacuggdjVar = ikoacuggdj.f53307iobyxmoadg;
        Layout layout2 = this.f53357nufgyqmvbu;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return ikoacuggdjVar.ppxfxbqfkf((StaticLayout) layout2, this.f53364wkgbmnqykc);
    }

    public final float pmvmpeiblj(int i13, boolean z13) {
        return btonecajqb().ppxfxbqfkf(i13, true, z13) + lqeggnwhkg(vdvldrhtss(i13));
    }

    public final RectF ppxfxbqfkf(int i13) {
        float fCdpycssgdh;
        float fCdpycssgdh2;
        float fPmvmpeiblj;
        float fPmvmpeiblj2;
        int iVdvldrhtss = vdvldrhtss(i13);
        float fIwizpuwonk = iwizpuwonk(iVdvldrhtss);
        float fDraadjrbmk = draadjrbmk(iVdvldrhtss);
        boolean z13 = lereixgezr(iVdvldrhtss) == 1;
        boolean zIsRtlCharAt = this.f53357nufgyqmvbu.isRtlCharAt(i13);
        if (!z13 || zIsRtlCharAt) {
            if (z13 && zIsRtlCharAt) {
                fPmvmpeiblj = cdpycssgdh(i13, false);
                fPmvmpeiblj2 = cdpycssgdh(i13 + 1, true);
            } else if (zIsRtlCharAt) {
                fPmvmpeiblj = pmvmpeiblj(i13, false);
                fPmvmpeiblj2 = pmvmpeiblj(i13 + 1, true);
            } else {
                fCdpycssgdh = cdpycssgdh(i13, false);
                fCdpycssgdh2 = cdpycssgdh(i13 + 1, true);
            }
            float f13 = fPmvmpeiblj;
            fCdpycssgdh = fPmvmpeiblj2;
            fCdpycssgdh2 = f13;
        } else {
            fCdpycssgdh = pmvmpeiblj(i13, false);
            fCdpycssgdh2 = pmvmpeiblj(i13 + 1, true);
        }
        return new RectF(fCdpycssgdh, fIwizpuwonk, fCdpycssgdh2, fDraadjrbmk);
    }

    public final int rgvfuqvkyq(int i13) {
        return (uwvvkdfqfp.wflxmlrfwp(this.f53357nufgyqmvbu, i13) && this.f53365zoijcleaow == TextUtils.TruncateAt.END) ? this.f53357nufgyqmvbu.getText().length() : this.f53357nufgyqmvbu.getLineEnd(i13);
    }

    public final int vdvldrhtss(int i13) {
        return this.f53357nufgyqmvbu.getLineForOffset(i13);
    }

    public final int wflxmlrfwp() {
        return this.f53350dxjokdxxww;
    }

    public final boolean wkgbmnqykc() {
        return this.f53353gxszxtbevo;
    }

    public final TextPaint wwaezpbzkn() {
        return this.f53354iobyxmoadg;
    }

    public final float yggfygwlhe(int i13) {
        return this.f53357nufgyqmvbu.getLineRight(i13) + (i13 == this.f53350dxjokdxxww + (-1) ? this.f53363wflxmlrfwp : 0.0f);
    }

    public final l0.dxjokdxxww ylkuphrtab() {
        l0.dxjokdxxww dxjokdxxwwVar = this.f53356lqeggnwhkg;
        if (dxjokdxxwwVar != null) {
            return dxjokdxxwwVar;
        }
        l0.dxjokdxxww dxjokdxxwwVar2 = new l0.dxjokdxxww(this.f53357nufgyqmvbu.getText(), 0, this.f53357nufgyqmvbu.getText().length(), this.f53354iobyxmoadg.getTextLocale());
        this.f53356lqeggnwhkg = dxjokdxxwwVar2;
        return dxjokdxxwwVar2;
    }

    public final float zdlpuopuiu(int i13) {
        return this.f53357nufgyqmvbu.getLineLeft(i13) + (i13 == this.f53350dxjokdxxww + (-1) ? this.f53349draadjrbmk : 0.0f);
    }

    public final void zoijcleaow(int i13, float[] fArr) {
        float fWkgbmnqykc;
        float fEablkybsjg;
        int iJyumaefscl = jyumaefscl(i13);
        int iRgvfuqvkyq = rgvfuqvkyq(i13);
        int i14 = 0;
        if (!(fArr.length >= (iRgvfuqvkyq - iJyumaefscl) * 2)) {
            q0.iobyxmoadg.iobyxmoadg("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(this);
        boolean z13 = lereixgezr(i13) == 1;
        while (iJyumaefscl < iRgvfuqvkyq) {
            boolean zHcddaimhww = hcddaimhww(iJyumaefscl);
            if (z13 && !zHcddaimhww) {
                fWkgbmnqykc = yadqdtsiqtVar.zoijcleaow(iJyumaefscl);
                fEablkybsjg = yadqdtsiqtVar.ppxfxbqfkf(iJyumaefscl + 1);
            } else if (z13 && zHcddaimhww) {
                fEablkybsjg = yadqdtsiqtVar.wkgbmnqykc(iJyumaefscl);
                fWkgbmnqykc = yadqdtsiqtVar.eablkybsjg(iJyumaefscl + 1);
            } else if (zHcddaimhww) {
                fEablkybsjg = yadqdtsiqtVar.zoijcleaow(iJyumaefscl);
                fWkgbmnqykc = yadqdtsiqtVar.ppxfxbqfkf(iJyumaefscl + 1);
            } else {
                fWkgbmnqykc = yadqdtsiqtVar.wkgbmnqykc(iJyumaefscl);
                fEablkybsjg = yadqdtsiqtVar.eablkybsjg(iJyumaefscl + 1);
            }
            fArr[i14] = fWkgbmnqykc;
            fArr[i14 + 1] = fEablkybsjg;
            i14 += 2;
            iJyumaefscl++;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rlfsiqarku(CharSequence charSequence, float f13, TextPaint textPaint, int i13, TextUtils.TruncateAt truncateAt, int i14, float f14, float f15, boolean z13, boolean z14, int i15, int i16, int i17, int i18, int i19, int i23, int[] iArr, int[] iArr2, pkzmftpjix pkzmftpjixVar, int i24, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        int i25 = (i24 & 8) != 0 ? 0 : i13;
        TextUtils.TruncateAt truncateAt2 = (i24 & 16) != 0 ? null : truncateAt;
        int i26 = (i24 & 32) != 0 ? 2 : i14;
        this(charSequence, f13, textPaint, i25, truncateAt2, i26, (i24 & 64) != 0 ? 1.0f : f14, (i24 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0.0f : f15, (i24 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z13, (i24 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? true : z14, (i24 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? Integer.MAX_VALUE : i15, (i24 & 2048) != 0 ? 0 : i16, (i24 & 4096) != 0 ? 0 : i17, (i24 & 8192) != 0 ? 0 : i18, (i24 & 16384) != 0 ? 0 : i19, (32768 & i24) != 0 ? 0 : i23, (65536 & i24) != 0 ? null : iArr, (131072 & i24) != 0 ? null : iArr2, (i24 & 262144) != 0 ? new pkzmftpjix(charSequence, textPaint, i26) : pkzmftpjixVar);
    }
}
