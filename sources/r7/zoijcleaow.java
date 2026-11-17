package r7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.hcddaimhww;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import l7.rgvfuqvkyq;
import v7.btonecajqb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow implements k7.eablkybsjg, l7.iobyxmoadg.zoijcleaow, o7.gxszxtbevo {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final String f81947agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final RectF f81948btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    final rgvfuqvkyq f81949cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final RectF f81950draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final RectF f81951dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Paint f81952eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f81953esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final RectF f81954gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Paint f81955gxszxtbevo;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    BlurMaskFilter f81957istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final List f81958iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private List f81959jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private l7.wkgbmnqykc f81960kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f81961lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Paint f81962lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Paint f81963nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    final Matrix f81964ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private l7.nufgyqmvbu f81965oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private Paint f81966pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    final hcddaimhww f81968rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    final eablkybsjg f81969vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final RectF f81970wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private zoijcleaow f81972yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private zoijcleaow f81973zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    float f81975zynmafqrjb;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Path f81956iobyxmoadg = new Path();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Matrix f81974zoijcleaow = new Matrix();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Matrix f81967ppxfxbqfkf = new Matrix();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Paint f81971wkgbmnqykc = new j7.iobyxmoadg(1);

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f81976iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f81977zoijcleaow;

        static {
            int[] iArr = new int[q7.dxjokdxxww.iobyxmoadg.values().length];
            f81977zoijcleaow = iArr;
            try {
                iArr[q7.dxjokdxxww.iobyxmoadg.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81977zoijcleaow[q7.dxjokdxxww.iobyxmoadg.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81977zoijcleaow[q7.dxjokdxxww.iobyxmoadg.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81977zoijcleaow[q7.dxjokdxxww.iobyxmoadg.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[eablkybsjg.iobyxmoadg.values().length];
            f81976iobyxmoadg = iArr2;
            try {
                iArr2[eablkybsjg.iobyxmoadg.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f81976iobyxmoadg[eablkybsjg.iobyxmoadg.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f81976iobyxmoadg[eablkybsjg.iobyxmoadg.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f81976iobyxmoadg[eablkybsjg.iobyxmoadg.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f81976iobyxmoadg[eablkybsjg.iobyxmoadg.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f81976iobyxmoadg[eablkybsjg.iobyxmoadg.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f81976iobyxmoadg[eablkybsjg.iobyxmoadg.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    zoijcleaow(hcddaimhww hcddaimhwwVar, eablkybsjg eablkybsjgVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f81952eablkybsjg = new j7.iobyxmoadg(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f81955gxszxtbevo = new j7.iobyxmoadg(1, mode2);
        j7.iobyxmoadg iobyxmoadgVar = new j7.iobyxmoadg(1);
        this.f81962lqeggnwhkg = iobyxmoadgVar;
        this.f81963nufgyqmvbu = new j7.iobyxmoadg(PorterDuff.Mode.CLEAR);
        this.f81951dxjokdxxww = new RectF();
        this.f81948btonecajqb = new RectF();
        this.f81954gtknphoqwx = new RectF();
        this.f81950draadjrbmk = new RectF();
        this.f81970wflxmlrfwp = new RectF();
        this.f81964ojitshcjhn = new Matrix();
        this.f81958iwizpuwonk = new ArrayList();
        this.f81953esjtqupxsv = true;
        this.f81975zynmafqrjb = 0.0f;
        this.f81968rgvfuqvkyq = hcddaimhwwVar;
        this.f81969vdvldrhtss = eablkybsjgVar;
        this.f81947agtfadlqog = eablkybsjgVar.btonecajqb() + "#draw";
        if (eablkybsjgVar.dxjokdxxww() == eablkybsjg.zoijcleaow.INVERT) {
            iobyxmoadgVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            iobyxmoadgVar.setXfermode(new PorterDuffXfermode(mode));
        }
        rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = eablkybsjgVar.cqumvgiudr().zoijcleaow();
        this.f81949cqumvgiudr = rgvfuqvkyqVarZoijcleaow;
        rgvfuqvkyqVarZoijcleaow.zoijcleaow(this);
        if (eablkybsjgVar.nufgyqmvbu() != null && !eablkybsjgVar.nufgyqmvbu().isEmpty()) {
            l7.nufgyqmvbu nufgyqmvbuVar = new l7.nufgyqmvbu(eablkybsjgVar.nufgyqmvbu());
            this.f81965oxmwwwfdhm = nufgyqmvbuVar;
            Iterator it = nufgyqmvbuVar.iobyxmoadg().iterator();
            while (it.hasNext()) {
                ((l7.iobyxmoadg) it.next()).iobyxmoadg(this);
            }
            for (l7.iobyxmoadg iobyxmoadgVar2 : this.f81965oxmwwwfdhm.ppxfxbqfkf()) {
                btonecajqb(iobyxmoadgVar2);
                iobyxmoadgVar2.iobyxmoadg(this);
            }
        }
        wypolnanlu();
    }

    private void agtfadlqog(Canvas canvas, Matrix matrix, l7.iobyxmoadg iobyxmoadgVar, l7.iobyxmoadg iobyxmoadgVar2) {
        btonecajqb.wflxmlrfwp(canvas, this.f81951dxjokdxxww, this.f81952eablkybsjg);
        canvas.drawRect(this.f81951dxjokdxxww, this.f81971wkgbmnqykc);
        this.f81955gxszxtbevo.setAlpha((int) (((Integer) iobyxmoadgVar2.nufgyqmvbu()).intValue() * 2.55f));
        this.f81956iobyxmoadg.set((Path) iobyxmoadgVar.nufgyqmvbu());
        this.f81956iobyxmoadg.transform(matrix);
        canvas.drawPath(this.f81956iobyxmoadg, this.f81955gxszxtbevo);
        canvas.restore();
    }

    private void cdpycssgdh(RectF rectF, Matrix matrix) {
        this.f81954gtknphoqwx.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (zynmafqrjb()) {
            int size = this.f81965oxmwwwfdhm.zoijcleaow().size();
            for (int i13 = 0; i13 < size; i13++) {
                q7.dxjokdxxww dxjokdxxwwVar = (q7.dxjokdxxww) this.f81965oxmwwwfdhm.zoijcleaow().get(i13);
                Path path = (Path) ((l7.iobyxmoadg) this.f81965oxmwwwfdhm.iobyxmoadg().get(i13)).nufgyqmvbu();
                if (path != null) {
                    this.f81956iobyxmoadg.set(path);
                    this.f81956iobyxmoadg.transform(matrix);
                    int i14 = iobyxmoadg.f81977zoijcleaow[dxjokdxxwwVar.iobyxmoadg().ordinal()];
                    if (i14 == 1 || i14 == 2) {
                        return;
                    }
                    if ((i14 == 3 || i14 == 4) && dxjokdxxwwVar.wkgbmnqykc()) {
                        return;
                    }
                    this.f81956iobyxmoadg.computeBounds(this.f81970wflxmlrfwp, false);
                    if (i13 == 0) {
                        this.f81954gtknphoqwx.set(this.f81970wflxmlrfwp);
                    } else {
                        RectF rectF2 = this.f81954gtknphoqwx;
                        rectF2.set(Math.min(rectF2.left, this.f81970wflxmlrfwp.left), Math.min(this.f81954gtknphoqwx.top, this.f81970wflxmlrfwp.top), Math.max(this.f81954gtknphoqwx.right, this.f81970wflxmlrfwp.right), Math.max(this.f81954gtknphoqwx.bottom, this.f81970wflxmlrfwp.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f81954gtknphoqwx)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void draadjrbmk(Canvas canvas, Matrix matrix, l7.iobyxmoadg iobyxmoadgVar, l7.iobyxmoadg iobyxmoadgVar2) {
        btonecajqb.wflxmlrfwp(canvas, this.f81951dxjokdxxww, this.f81952eablkybsjg);
        this.f81956iobyxmoadg.set((Path) iobyxmoadgVar.nufgyqmvbu());
        this.f81956iobyxmoadg.transform(matrix);
        this.f81971wkgbmnqykc.setAlpha((int) (((Integer) iobyxmoadgVar2.nufgyqmvbu()).intValue() * 2.55f));
        canvas.drawPath(this.f81956iobyxmoadg, this.f81971wkgbmnqykc);
        canvas.restore();
    }

    private void dsvhmnatus(boolean z13) {
        if (z13 != this.f81953esjtqupxsv) {
            this.f81953esjtqupxsv = z13;
            iozdgvuglv();
        }
    }

    private void gtknphoqwx(Canvas canvas, Matrix matrix, l7.iobyxmoadg iobyxmoadgVar, l7.iobyxmoadg iobyxmoadgVar2) {
        this.f81956iobyxmoadg.set((Path) iobyxmoadgVar.nufgyqmvbu());
        this.f81956iobyxmoadg.transform(matrix);
        this.f81971wkgbmnqykc.setAlpha((int) (((Integer) iobyxmoadgVar2.nufgyqmvbu()).intValue() * 2.55f));
        canvas.drawPath(this.f81956iobyxmoadg, this.f81971wkgbmnqykc);
    }

    private void iozdgvuglv() {
        this.f81968rgvfuqvkyq.invalidateSelf();
    }

    static zoijcleaow jyumaefscl(ppxfxbqfkf ppxfxbqfkfVar, eablkybsjg eablkybsjgVar, hcddaimhww hcddaimhwwVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        switch (iobyxmoadg.f81976iobyxmoadg[eablkybsjgVar.lqeggnwhkg().ordinal()]) {
            case 1:
                return new lqeggnwhkg(hcddaimhwwVar, eablkybsjgVar, ppxfxbqfkfVar, btonecajqbVar);
            case 2:
                return new ppxfxbqfkf(hcddaimhwwVar, eablkybsjgVar, btonecajqbVar.ojitshcjhn(eablkybsjgVar.agtfadlqog()), btonecajqbVar);
            case 3:
                return new nufgyqmvbu(hcddaimhwwVar, eablkybsjgVar);
            case 4:
                return new wkgbmnqykc(hcddaimhwwVar, eablkybsjgVar);
            case 5:
                return new gxszxtbevo(hcddaimhwwVar, eablkybsjgVar);
            case 6:
                return new dxjokdxxww(hcddaimhwwVar, eablkybsjgVar);
            default:
                v7.wkgbmnqykc.ppxfxbqfkf("Unknown layer type " + eablkybsjgVar.lqeggnwhkg());
                return null;
        }
    }

    private void kcexrzcfyt() {
        if (this.f81959jyumaefscl != null) {
            return;
        }
        if (this.f81972yggfygwlhe == null) {
            this.f81959jyumaefscl = Collections.emptyList();
            return;
        }
        this.f81959jyumaefscl = new ArrayList();
        for (zoijcleaow zoijcleaowVar = this.f81972yggfygwlhe; zoijcleaowVar != null; zoijcleaowVar = zoijcleaowVar.f81972yggfygwlhe) {
            this.f81959jyumaefscl.add(zoijcleaowVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lmojexxdyd() {
        dsvhmnatus(this.f81960kcexrzcfyt.vdvldrhtss() == 1.0f);
    }

    private void ojitshcjhn(Canvas canvas, Matrix matrix, l7.iobyxmoadg iobyxmoadgVar, l7.iobyxmoadg iobyxmoadgVar2) {
        btonecajqb.wflxmlrfwp(canvas, this.f81951dxjokdxxww, this.f81955gxszxtbevo);
        canvas.drawRect(this.f81951dxjokdxxww, this.f81971wkgbmnqykc);
        this.f81955gxszxtbevo.setAlpha((int) (((Integer) iobyxmoadgVar2.nufgyqmvbu()).intValue() * 2.55f));
        this.f81956iobyxmoadg.set((Path) iobyxmoadgVar.nufgyqmvbu());
        this.f81956iobyxmoadg.transform(matrix);
        canvas.drawPath(this.f81956iobyxmoadg, this.f81955gxszxtbevo);
        canvas.restore();
    }

    private boolean oxmwwwfdhm() {
        if (this.f81965oxmwwwfdhm.iobyxmoadg().isEmpty()) {
            return false;
        }
        for (int i13 = 0; i13 < this.f81965oxmwwwfdhm.zoijcleaow().size(); i13++) {
            if (((q7.dxjokdxxww) this.f81965oxmwwwfdhm.zoijcleaow().get(i13)).iobyxmoadg() != q7.dxjokdxxww.iobyxmoadg.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void rgvfuqvkyq(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("Layer#saveLayer");
        btonecajqb.agtfadlqog(canvas, this.f81951dxjokdxxww, this.f81952eablkybsjg, 19);
        if (Build.VERSION.SDK_INT < 28) {
            zdlpuopuiu(canvas);
        }
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Layer#saveLayer");
        for (int i13 = 0; i13 < this.f81965oxmwwwfdhm.zoijcleaow().size(); i13++) {
            q7.dxjokdxxww dxjokdxxwwVar = (q7.dxjokdxxww) this.f81965oxmwwwfdhm.zoijcleaow().get(i13);
            l7.iobyxmoadg iobyxmoadgVar = (l7.iobyxmoadg) this.f81965oxmwwwfdhm.iobyxmoadg().get(i13);
            l7.iobyxmoadg iobyxmoadgVar2 = (l7.iobyxmoadg) this.f81965oxmwwwfdhm.ppxfxbqfkf().get(i13);
            int i14 = iobyxmoadg.f81977zoijcleaow[dxjokdxxwwVar.iobyxmoadg().ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    if (i13 == 0) {
                        this.f81971wkgbmnqykc.setColor(-16777216);
                        this.f81971wkgbmnqykc.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                        canvas.drawRect(this.f81951dxjokdxxww, this.f81971wkgbmnqykc);
                    }
                    if (dxjokdxxwwVar.wkgbmnqykc()) {
                        ojitshcjhn(canvas, matrix, iobyxmoadgVar, iobyxmoadgVar2);
                    } else {
                        vdvldrhtss(canvas, matrix, iobyxmoadgVar);
                    }
                } else if (i14 != 3) {
                    if (i14 == 4) {
                        if (dxjokdxxwwVar.wkgbmnqykc()) {
                            wflxmlrfwp(canvas, matrix, iobyxmoadgVar, iobyxmoadgVar2);
                        } else {
                            gtknphoqwx(canvas, matrix, iobyxmoadgVar, iobyxmoadgVar2);
                        }
                    }
                } else if (dxjokdxxwwVar.wkgbmnqykc()) {
                    agtfadlqog(canvas, matrix, iobyxmoadgVar, iobyxmoadgVar2);
                } else {
                    draadjrbmk(canvas, matrix, iobyxmoadgVar, iobyxmoadgVar2);
                }
            } else if (oxmwwwfdhm()) {
                this.f81971wkgbmnqykc.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                canvas.drawRect(this.f81951dxjokdxxww, this.f81971wkgbmnqykc);
            }
        }
        com.airbnb.lottie.eablkybsjg.zoijcleaow("Layer#restoreLayer");
        canvas.restore();
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Layer#restoreLayer");
    }

    private void vdvldrhtss(Canvas canvas, Matrix matrix, l7.iobyxmoadg iobyxmoadgVar) {
        this.f81956iobyxmoadg.set((Path) iobyxmoadgVar.nufgyqmvbu());
        this.f81956iobyxmoadg.transform(matrix);
        canvas.drawPath(this.f81956iobyxmoadg, this.f81955gxszxtbevo);
    }

    private void wflxmlrfwp(Canvas canvas, Matrix matrix, l7.iobyxmoadg iobyxmoadgVar, l7.iobyxmoadg iobyxmoadgVar2) {
        btonecajqb.wflxmlrfwp(canvas, this.f81951dxjokdxxww, this.f81971wkgbmnqykc);
        canvas.drawRect(this.f81951dxjokdxxww, this.f81971wkgbmnqykc);
        this.f81956iobyxmoadg.set((Path) iobyxmoadgVar.nufgyqmvbu());
        this.f81956iobyxmoadg.transform(matrix);
        this.f81971wkgbmnqykc.setAlpha((int) (((Integer) iobyxmoadgVar2.nufgyqmvbu()).intValue() * 2.55f));
        canvas.drawPath(this.f81956iobyxmoadg, this.f81955gxszxtbevo);
        canvas.restore();
    }

    private void wwaezpbzkn(float f13) {
        this.f81968rgvfuqvkyq.pkzmftpjix().agtfadlqog().iobyxmoadg(this.f81969vdvldrhtss.btonecajqb(), f13);
    }

    private void wypolnanlu() {
        if (this.f81969vdvldrhtss.gxszxtbevo().isEmpty()) {
            dsvhmnatus(true);
            return;
        }
        l7.wkgbmnqykc wkgbmnqykcVar = new l7.wkgbmnqykc(this.f81969vdvldrhtss.gxszxtbevo());
        this.f81960kcexrzcfyt = wkgbmnqykcVar;
        wkgbmnqykcVar.wflxmlrfwp();
        this.f81960kcexrzcfyt.iobyxmoadg(new l7.iobyxmoadg.zoijcleaow() { // from class: r7.iobyxmoadg
            @Override // l7.iobyxmoadg.zoijcleaow
            public final void iobyxmoadg() {
                this.f81923iobyxmoadg.lmojexxdyd();
            }
        });
        dsvhmnatus(((Float) this.f81960kcexrzcfyt.nufgyqmvbu()).floatValue() == 1.0f);
        btonecajqb(this.f81960kcexrzcfyt);
    }

    private void yadqdtsiqt(RectF rectF, Matrix matrix) {
        if (istkbnxepw() && this.f81969vdvldrhtss.dxjokdxxww() != eablkybsjg.zoijcleaow.INVERT) {
            this.f81950draadjrbmk.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f81973zdlpuopuiu.eablkybsjg(this.f81950draadjrbmk, matrix, true);
            if (rectF.intersect(this.f81950draadjrbmk)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void zdlpuopuiu(Canvas canvas) {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("Layer#clearLayer");
        RectF rectF = this.f81951dxjokdxxww;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f81963nufgyqmvbu);
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Layer#clearLayer");
    }

    public void btonecajqb(l7.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == null) {
            return;
        }
        this.f81958iwizpuwonk.add(iobyxmoadgVar);
    }

    void cllcsxoeiz(float f13) {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("BaseLayer#setProgress");
        com.airbnb.lottie.eablkybsjg.zoijcleaow("BaseLayer#setProgress.transform");
        this.f81949cqumvgiudr.btonecajqb(f13);
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("BaseLayer#setProgress.transform");
        if (this.f81965oxmwwwfdhm != null) {
            com.airbnb.lottie.eablkybsjg.zoijcleaow("BaseLayer#setProgress.mask");
            for (int i13 = 0; i13 < this.f81965oxmwwwfdhm.iobyxmoadg().size(); i13++) {
                ((l7.iobyxmoadg) this.f81965oxmwwwfdhm.iobyxmoadg().get(i13)).agtfadlqog(f13);
            }
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("BaseLayer#setProgress.mask");
        }
        if (this.f81960kcexrzcfyt != null) {
            com.airbnb.lottie.eablkybsjg.zoijcleaow("BaseLayer#setProgress.inout");
            this.f81960kcexrzcfyt.agtfadlqog(f13);
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("BaseLayer#setProgress.inout");
        }
        if (this.f81973zdlpuopuiu != null) {
            com.airbnb.lottie.eablkybsjg.zoijcleaow("BaseLayer#setProgress.matte");
            this.f81973zdlpuopuiu.cllcsxoeiz(f13);
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("BaseLayer#setProgress.matte");
        }
        com.airbnb.lottie.eablkybsjg.zoijcleaow("BaseLayer#setProgress.animations." + this.f81958iwizpuwonk.size());
        for (int i14 = 0; i14 < this.f81958iwizpuwonk.size(); i14++) {
            ((l7.iobyxmoadg) this.f81958iwizpuwonk.get(i14)).agtfadlqog(f13);
        }
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("BaseLayer#setProgress.animations." + this.f81958iwizpuwonk.size());
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("BaseLayer#setProgress");
    }

    public q7.iobyxmoadg cqumvgiudr() {
        return this.f81969vdvldrhtss.zoijcleaow();
    }

    @Override // k7.eablkybsjg
    public void dxjokdxxww(Canvas canvas, Matrix matrix, int i13) {
        Paint paint;
        Integer num;
        com.airbnb.lottie.eablkybsjg.zoijcleaow(this.f81947agtfadlqog);
        if (!this.f81953esjtqupxsv || this.f81969vdvldrhtss.esjtqupxsv()) {
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf(this.f81947agtfadlqog);
            return;
        }
        kcexrzcfyt();
        com.airbnb.lottie.eablkybsjg.zoijcleaow("Layer#parentMatrix");
        this.f81974zoijcleaow.reset();
        this.f81974zoijcleaow.set(matrix);
        for (int size = this.f81959jyumaefscl.size() - 1; size >= 0; size--) {
            this.f81974zoijcleaow.preConcat(((zoijcleaow) this.f81959jyumaefscl.get(size)).f81949cqumvgiudr.gxszxtbevo());
        }
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Layer#parentMatrix");
        l7.iobyxmoadg iobyxmoadgVarNufgyqmvbu = this.f81949cqumvgiudr.nufgyqmvbu();
        int iIntValue = (int) ((((i13 / 255.0f) * ((iobyxmoadgVarNufgyqmvbu == null || (num = (Integer) iobyxmoadgVarNufgyqmvbu.nufgyqmvbu()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
        if (!istkbnxepw() && !zynmafqrjb()) {
            this.f81974zoijcleaow.preConcat(this.f81949cqumvgiudr.gxszxtbevo());
            com.airbnb.lottie.eablkybsjg.zoijcleaow("Layer#drawLayer");
            yggfygwlhe(canvas, this.f81974zoijcleaow, iIntValue);
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Layer#drawLayer");
            wwaezpbzkn(com.airbnb.lottie.eablkybsjg.ppxfxbqfkf(this.f81947agtfadlqog));
            return;
        }
        com.airbnb.lottie.eablkybsjg.zoijcleaow("Layer#computeBounds");
        eablkybsjg(this.f81951dxjokdxxww, this.f81974zoijcleaow, false);
        yadqdtsiqt(this.f81951dxjokdxxww, matrix);
        this.f81974zoijcleaow.preConcat(this.f81949cqumvgiudr.gxszxtbevo());
        cdpycssgdh(this.f81951dxjokdxxww, this.f81974zoijcleaow);
        this.f81948btonecajqb.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f81967ppxfxbqfkf);
        if (!this.f81967ppxfxbqfkf.isIdentity()) {
            Matrix matrix2 = this.f81967ppxfxbqfkf;
            matrix2.invert(matrix2);
            this.f81967ppxfxbqfkf.mapRect(this.f81948btonecajqb);
        }
        if (!this.f81951dxjokdxxww.intersect(this.f81948btonecajqb)) {
            this.f81951dxjokdxxww.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Layer#computeBounds");
        if (this.f81951dxjokdxxww.width() >= 1.0f && this.f81951dxjokdxxww.height() >= 1.0f) {
            com.airbnb.lottie.eablkybsjg.zoijcleaow("Layer#saveLayer");
            this.f81971wkgbmnqykc.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            btonecajqb.wflxmlrfwp(canvas, this.f81951dxjokdxxww, this.f81971wkgbmnqykc);
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Layer#saveLayer");
            zdlpuopuiu(canvas);
            com.airbnb.lottie.eablkybsjg.zoijcleaow("Layer#drawLayer");
            yggfygwlhe(canvas, this.f81974zoijcleaow, iIntValue);
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Layer#drawLayer");
            if (zynmafqrjb()) {
                rgvfuqvkyq(canvas, this.f81974zoijcleaow);
            }
            if (istkbnxepw()) {
                com.airbnb.lottie.eablkybsjg.zoijcleaow("Layer#drawMatte");
                com.airbnb.lottie.eablkybsjg.zoijcleaow("Layer#saveLayer");
                btonecajqb.agtfadlqog(canvas, this.f81951dxjokdxxww, this.f81962lqeggnwhkg, 19);
                com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Layer#saveLayer");
                zdlpuopuiu(canvas);
                this.f81973zdlpuopuiu.dxjokdxxww(canvas, matrix, iIntValue);
                com.airbnb.lottie.eablkybsjg.zoijcleaow("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Layer#restoreLayer");
                com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Layer#drawMatte");
            }
            com.airbnb.lottie.eablkybsjg.zoijcleaow("Layer#restoreLayer");
            canvas.restore();
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Layer#restoreLayer");
        }
        if (this.f81961lereixgezr && (paint = this.f81966pmvmpeiblj) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f81966pmvmpeiblj.setColor(-251901);
            this.f81966pmvmpeiblj.setStrokeWidth(4.0f);
            canvas.drawRect(this.f81951dxjokdxxww, this.f81966pmvmpeiblj);
            this.f81966pmvmpeiblj.setStyle(Paint.Style.FILL);
            this.f81966pmvmpeiblj.setColor(1357638635);
            canvas.drawRect(this.f81951dxjokdxxww, this.f81966pmvmpeiblj);
        }
        wwaezpbzkn(com.airbnb.lottie.eablkybsjg.ppxfxbqfkf(this.f81947agtfadlqog));
    }

    @Override // k7.eablkybsjg
    public void eablkybsjg(RectF rectF, Matrix matrix, boolean z13) {
        this.f81951dxjokdxxww.set(0.0f, 0.0f, 0.0f, 0.0f);
        kcexrzcfyt();
        this.f81964ojitshcjhn.set(matrix);
        if (z13) {
            List list = this.f81959jyumaefscl;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f81964ojitshcjhn.preConcat(((zoijcleaow) this.f81959jyumaefscl.get(size)).f81949cqumvgiudr.gxszxtbevo());
                }
            } else {
                zoijcleaow zoijcleaowVar = this.f81972yggfygwlhe;
                if (zoijcleaowVar != null) {
                    this.f81964ojitshcjhn.preConcat(zoijcleaowVar.f81949cqumvgiudr.gxszxtbevo());
                }
            }
        }
        this.f81964ojitshcjhn.preConcat(this.f81949cqumvgiudr.gxszxtbevo());
    }

    public BlurMaskFilter esjtqupxsv(float f13) {
        if (this.f81975zynmafqrjb == f13) {
            return this.f81957istkbnxepw;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f13 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f81957istkbnxepw = blurMaskFilter;
        this.f81975zynmafqrjb = f13;
        return blurMaskFilter;
    }

    @Override // k7.ppxfxbqfkf
    public String getName() {
        return this.f81969vdvldrhtss.btonecajqb();
    }

    void hcddaimhww(zoijcleaow zoijcleaowVar) {
        this.f81973zdlpuopuiu = zoijcleaowVar;
    }

    void hkdspvbjdz(zoijcleaow zoijcleaowVar) {
        this.f81972yggfygwlhe = zoijcleaowVar;
    }

    @Override // l7.iobyxmoadg.zoijcleaow
    public void iobyxmoadg() {
        iozdgvuglv();
    }

    boolean istkbnxepw() {
        return this.f81973zdlpuopuiu != null;
    }

    public q7.nufgyqmvbu iwizpuwonk() {
        return this.f81969vdvldrhtss.iobyxmoadg();
    }

    void jpowsppfya(boolean z13) {
        if (z13 && this.f81966pmvmpeiblj == null) {
            this.f81966pmvmpeiblj = new j7.iobyxmoadg();
        }
        this.f81961lereixgezr = z13;
    }

    public t7.btonecajqb lereixgezr() {
        return this.f81969vdvldrhtss.wkgbmnqykc();
    }

    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f81949cqumvgiudr.ppxfxbqfkf(obj, ppxfxbqfkfVar);
    }

    void pkzmftpjix(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
    }

    eablkybsjg pmvmpeiblj() {
        return this.f81969vdvldrhtss;
    }

    @Override // o7.gxszxtbevo
    public void ppxfxbqfkf(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
        zoijcleaow zoijcleaowVar = this.f81973zdlpuopuiu;
        if (zoijcleaowVar != null) {
            o7.eablkybsjg eablkybsjgVarIobyxmoadg = eablkybsjgVar2.iobyxmoadg(zoijcleaowVar.getName());
            if (eablkybsjgVar.ppxfxbqfkf(this.f81973zdlpuopuiu.getName(), i13)) {
                list.add(eablkybsjgVarIobyxmoadg.dxjokdxxww(this.f81973zdlpuopuiu));
            }
            if (eablkybsjgVar.nufgyqmvbu(getName(), i13)) {
                this.f81973zdlpuopuiu.pkzmftpjix(eablkybsjgVar, eablkybsjgVar.eablkybsjg(this.f81973zdlpuopuiu.getName(), i13) + i13, list, eablkybsjgVarIobyxmoadg);
            }
        }
        if (eablkybsjgVar.lqeggnwhkg(getName(), i13)) {
            if (!"__container".equals(getName())) {
                eablkybsjgVar2 = eablkybsjgVar2.iobyxmoadg(getName());
                if (eablkybsjgVar.ppxfxbqfkf(getName(), i13)) {
                    list.add(eablkybsjgVar2.dxjokdxxww(this));
                }
            }
            if (eablkybsjgVar.nufgyqmvbu(getName(), i13)) {
                pkzmftpjix(eablkybsjgVar, i13 + eablkybsjgVar.eablkybsjg(getName(), i13), list, eablkybsjgVar2);
            }
        }
    }

    abstract void yggfygwlhe(Canvas canvas, Matrix matrix, int i13);

    public void ylkuphrtab(l7.iobyxmoadg iobyxmoadgVar) {
        this.f81958iwizpuwonk.remove(iobyxmoadgVar);
    }

    @Override // k7.ppxfxbqfkf
    public void zoijcleaow(List list, List list2) {
    }

    boolean zynmafqrjb() {
        l7.nufgyqmvbu nufgyqmvbuVar = this.f81965oxmwwwfdhm;
        return (nufgyqmvbuVar == null || nufgyqmvbuVar.iobyxmoadg().isEmpty()) ? false : true;
    }
}
