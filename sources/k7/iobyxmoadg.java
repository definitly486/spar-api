package k7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg implements l7.iobyxmoadg.zoijcleaow, gtknphoqwx, eablkybsjg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private l7.iobyxmoadg f53993agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final l7.iobyxmoadg f53994btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final List f53995draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    final Paint f53996dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final hcddaimhww f53997eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final l7.iobyxmoadg f53998gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    protected final r7.zoijcleaow f53999gxszxtbevo;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final float[] f54002nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private l7.iobyxmoadg f54003ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    float f54005rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private l7.ppxfxbqfkf f54006vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final l7.iobyxmoadg f54007wflxmlrfwp;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final PathMeasure f54000iobyxmoadg = new PathMeasure();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Path f54009zoijcleaow = new Path();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Path f54004ppxfxbqfkf = new Path();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final RectF f54008wkgbmnqykc = new RectF();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f54001lqeggnwhkg = new ArrayList();

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f54010iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final yggfygwlhe f54011zoijcleaow;

        private zoijcleaow(yggfygwlhe yggfygwlheVar) {
            this.f54010iobyxmoadg = new ArrayList();
            this.f54011zoijcleaow = yggfygwlheVar;
        }
    }

    iobyxmoadg(hcddaimhww hcddaimhwwVar, r7.zoijcleaow zoijcleaowVar, Paint.Cap cap, Paint.Join join, float f13, p7.wkgbmnqykc wkgbmnqykcVar, p7.zoijcleaow zoijcleaowVar2, List list, p7.zoijcleaow zoijcleaowVar3) {
        j7.iobyxmoadg iobyxmoadgVar = new j7.iobyxmoadg(1);
        this.f53996dxjokdxxww = iobyxmoadgVar;
        this.f54005rgvfuqvkyq = 0.0f;
        this.f53997eablkybsjg = hcddaimhwwVar;
        this.f53999gxszxtbevo = zoijcleaowVar;
        iobyxmoadgVar.setStyle(Paint.Style.STROKE);
        iobyxmoadgVar.setStrokeCap(cap);
        iobyxmoadgVar.setStrokeJoin(join);
        iobyxmoadgVar.setStrokeMiter(f13);
        this.f53998gtknphoqwx = wkgbmnqykcVar.eablkybsjg();
        this.f53994btonecajqb = zoijcleaowVar2.eablkybsjg();
        if (zoijcleaowVar3 == null) {
            this.f54007wflxmlrfwp = null;
        } else {
            this.f54007wflxmlrfwp = zoijcleaowVar3.eablkybsjg();
        }
        this.f53995draadjrbmk = new ArrayList(list.size());
        this.f54002nufgyqmvbu = new float[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.f53995draadjrbmk.add(((p7.zoijcleaow) list.get(i13)).eablkybsjg());
        }
        zoijcleaowVar.btonecajqb(this.f53998gtknphoqwx);
        zoijcleaowVar.btonecajqb(this.f53994btonecajqb);
        for (int i14 = 0; i14 < this.f53995draadjrbmk.size(); i14++) {
            zoijcleaowVar.btonecajqb((l7.iobyxmoadg) this.f53995draadjrbmk.get(i14));
        }
        l7.iobyxmoadg iobyxmoadgVar2 = this.f54007wflxmlrfwp;
        if (iobyxmoadgVar2 != null) {
            zoijcleaowVar.btonecajqb(iobyxmoadgVar2);
        }
        this.f53998gtknphoqwx.iobyxmoadg(this);
        this.f53994btonecajqb.iobyxmoadg(this);
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((l7.iobyxmoadg) this.f53995draadjrbmk.get(i15)).iobyxmoadg(this);
        }
        l7.iobyxmoadg iobyxmoadgVar3 = this.f54007wflxmlrfwp;
        if (iobyxmoadgVar3 != null) {
            iobyxmoadgVar3.iobyxmoadg(this);
        }
        if (zoijcleaowVar.cqumvgiudr() != null) {
            l7.iobyxmoadg iobyxmoadgVarEablkybsjg = zoijcleaowVar.cqumvgiudr().iobyxmoadg().eablkybsjg();
            this.f54003ojitshcjhn = iobyxmoadgVarEablkybsjg;
            iobyxmoadgVarEablkybsjg.iobyxmoadg(this);
            zoijcleaowVar.btonecajqb(this.f54003ojitshcjhn);
        }
        if (zoijcleaowVar.lereixgezr() != null) {
            this.f54006vdvldrhtss = new l7.ppxfxbqfkf(this, zoijcleaowVar, zoijcleaowVar.lereixgezr());
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011c  */
    private void btonecajqb(Canvas canvas, zoijcleaow zoijcleaowVar, Matrix matrix) {
        float f13;
        com.airbnb.lottie.eablkybsjg.zoijcleaow("StrokeContent#applyTrimPath");
        if (zoijcleaowVar.f54011zoijcleaow == null) {
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("StrokeContent#applyTrimPath");
            return;
        }
        this.f54009zoijcleaow.reset();
        for (int size = zoijcleaowVar.f54010iobyxmoadg.size() - 1; size >= 0; size--) {
            this.f54009zoijcleaow.addPath(((wflxmlrfwp) zoijcleaowVar.f54010iobyxmoadg.get(size)).gxszxtbevo(), matrix);
        }
        float fFloatValue = ((Float) zoijcleaowVar.f54011zoijcleaow.btonecajqb().nufgyqmvbu()).floatValue() / 100.0f;
        float fFloatValue2 = ((Float) zoijcleaowVar.f54011zoijcleaow.lqeggnwhkg().nufgyqmvbu()).floatValue() / 100.0f;
        float fFloatValue3 = ((Float) zoijcleaowVar.f54011zoijcleaow.nufgyqmvbu().nufgyqmvbu()).floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.f54009zoijcleaow, this.f53996dxjokdxxww);
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("StrokeContent#applyTrimPath");
            return;
        }
        this.f54000iobyxmoadg.setPath(this.f54009zoijcleaow, false);
        float length = this.f54000iobyxmoadg.getLength();
        while (this.f54000iobyxmoadg.nextContour()) {
            length += this.f54000iobyxmoadg.getLength();
        }
        float f14 = fFloatValue3 * length;
        float f15 = (fFloatValue * length) + f14;
        float fMin = Math.min((fFloatValue2 * length) + f14, (f15 + length) - 1.0f);
        float f16 = 0.0f;
        for (int size2 = zoijcleaowVar.f54010iobyxmoadg.size() - 1; size2 >= 0; size2--) {
            this.f54004ppxfxbqfkf.set(((wflxmlrfwp) zoijcleaowVar.f54010iobyxmoadg.get(size2)).gxszxtbevo());
            this.f54004ppxfxbqfkf.transform(matrix);
            this.f54000iobyxmoadg.setPath(this.f54004ppxfxbqfkf, false);
            float length2 = this.f54000iobyxmoadg.getLength();
            if (fMin > length) {
                float f17 = fMin - length;
                if (f17 >= f16 + length2 || f16 >= f17) {
                    f13 = f16 + length2;
                    if (f13 < f15 && f16 <= fMin) {
                        if (f13 > fMin || f15 >= f16) {
                            v7.btonecajqb.iobyxmoadg(this.f54004ppxfxbqfkf, f15 < f16 ? 0.0f : (f15 - f16) / length2, fMin > f13 ? 1.0f : (fMin - f16) / length2, 0.0f);
                            canvas.drawPath(this.f54004ppxfxbqfkf, this.f53996dxjokdxxww);
                        } else {
                            canvas.drawPath(this.f54004ppxfxbqfkf, this.f53996dxjokdxxww);
                        }
                    }
                } else {
                    v7.btonecajqb.iobyxmoadg(this.f54004ppxfxbqfkf, f15 > length ? (f15 - length) / length2 : 0.0f, Math.min(f17 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f54004ppxfxbqfkf, this.f53996dxjokdxxww);
                }
            } else {
                f13 = f16 + length2;
                if (f13 < f15) {
                }
            }
            f16 += length2;
        }
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("StrokeContent#applyTrimPath");
    }

    private void lqeggnwhkg(Matrix matrix) {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("StrokeContent#applyDashPattern");
        if (this.f53995draadjrbmk.isEmpty()) {
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("StrokeContent#applyDashPattern");
            return;
        }
        float fLqeggnwhkg = v7.btonecajqb.lqeggnwhkg(matrix);
        for (int i13 = 0; i13 < this.f53995draadjrbmk.size(); i13++) {
            this.f54002nufgyqmvbu[i13] = ((Float) ((l7.iobyxmoadg) this.f53995draadjrbmk.get(i13)).nufgyqmvbu()).floatValue();
            if (i13 % 2 == 0) {
                float[] fArr = this.f54002nufgyqmvbu;
                if (fArr[i13] < 1.0f) {
                    fArr[i13] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f54002nufgyqmvbu;
                if (fArr2[i13] < 0.1f) {
                    fArr2[i13] = 0.1f;
                }
            }
            float[] fArr3 = this.f54002nufgyqmvbu;
            fArr3[i13] = fArr3[i13] * fLqeggnwhkg;
        }
        l7.iobyxmoadg iobyxmoadgVar = this.f54007wflxmlrfwp;
        this.f53996dxjokdxxww.setPathEffect(new DashPathEffect(this.f54002nufgyqmvbu, iobyxmoadgVar == null ? 0.0f : fLqeggnwhkg * ((Float) iobyxmoadgVar.nufgyqmvbu()).floatValue()));
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("StrokeContent#applyDashPattern");
    }

    public void dxjokdxxww(Canvas canvas, Matrix matrix, int i13) {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("StrokeContent#draw");
        if (v7.btonecajqb.nufgyqmvbu(matrix)) {
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("StrokeContent#draw");
            return;
        }
        this.f53996dxjokdxxww.setAlpha(v7.dxjokdxxww.ppxfxbqfkf((int) ((((i13 / 255.0f) * ((l7.gxszxtbevo) this.f53998gtknphoqwx).vdvldrhtss()) / 100.0f) * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        this.f53996dxjokdxxww.setStrokeWidth(((l7.wkgbmnqykc) this.f53994btonecajqb).vdvldrhtss() * v7.btonecajqb.lqeggnwhkg(matrix));
        if (this.f53996dxjokdxxww.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("StrokeContent#draw");
            return;
        }
        lqeggnwhkg(matrix);
        l7.iobyxmoadg iobyxmoadgVar = this.f53993agtfadlqog;
        if (iobyxmoadgVar != null) {
            this.f53996dxjokdxxww.setColorFilter((ColorFilter) iobyxmoadgVar.nufgyqmvbu());
        }
        l7.iobyxmoadg iobyxmoadgVar2 = this.f54003ojitshcjhn;
        if (iobyxmoadgVar2 != null) {
            float fFloatValue = ((Float) iobyxmoadgVar2.nufgyqmvbu()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f53996dxjokdxxww.setMaskFilter(null);
            } else if (fFloatValue != this.f54005rgvfuqvkyq) {
                this.f53996dxjokdxxww.setMaskFilter(this.f53999gxszxtbevo.esjtqupxsv(fFloatValue));
            }
            this.f54005rgvfuqvkyq = fFloatValue;
        }
        l7.ppxfxbqfkf ppxfxbqfkfVar = this.f54006vdvldrhtss;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.zoijcleaow(this.f53996dxjokdxxww);
        }
        for (int i14 = 0; i14 < this.f54001lqeggnwhkg.size(); i14++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f54001lqeggnwhkg.get(i14);
            if (zoijcleaowVar.f54011zoijcleaow != null) {
                btonecajqb(canvas, zoijcleaowVar, matrix);
            } else {
                com.airbnb.lottie.eablkybsjg.zoijcleaow("StrokeContent#buildPath");
                this.f54009zoijcleaow.reset();
                for (int size = zoijcleaowVar.f54010iobyxmoadg.size() - 1; size >= 0; size--) {
                    this.f54009zoijcleaow.addPath(((wflxmlrfwp) zoijcleaowVar.f54010iobyxmoadg.get(size)).gxszxtbevo(), matrix);
                }
                com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("StrokeContent#buildPath");
                com.airbnb.lottie.eablkybsjg.zoijcleaow("StrokeContent#drawPath");
                canvas.drawPath(this.f54009zoijcleaow, this.f53996dxjokdxxww);
                com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("StrokeContent#drawPath");
            }
        }
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("StrokeContent#draw");
    }

    @Override // k7.eablkybsjg
    public void eablkybsjg(RectF rectF, Matrix matrix, boolean z13) {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("StrokeContent#getBounds");
        this.f54009zoijcleaow.reset();
        for (int i13 = 0; i13 < this.f54001lqeggnwhkg.size(); i13++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f54001lqeggnwhkg.get(i13);
            for (int i14 = 0; i14 < zoijcleaowVar.f54010iobyxmoadg.size(); i14++) {
                this.f54009zoijcleaow.addPath(((wflxmlrfwp) zoijcleaowVar.f54010iobyxmoadg.get(i14)).gxszxtbevo(), matrix);
            }
        }
        this.f54009zoijcleaow.computeBounds(this.f54008wkgbmnqykc, false);
        float fVdvldrhtss = ((l7.wkgbmnqykc) this.f53994btonecajqb).vdvldrhtss();
        RectF rectF2 = this.f54008wkgbmnqykc;
        float f13 = fVdvldrhtss / 2.0f;
        rectF2.set(rectF2.left - f13, rectF2.top - f13, rectF2.right + f13, rectF2.bottom + f13);
        rectF.set(this.f54008wkgbmnqykc);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("StrokeContent#getBounds");
    }

    @Override // l7.iobyxmoadg.zoijcleaow
    public void iobyxmoadg() {
        this.f53997eablkybsjg.invalidateSelf();
    }

    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        l7.ppxfxbqfkf ppxfxbqfkfVar2;
        l7.ppxfxbqfkf ppxfxbqfkfVar3;
        l7.ppxfxbqfkf ppxfxbqfkfVar4;
        l7.ppxfxbqfkf ppxfxbqfkfVar5;
        l7.ppxfxbqfkf ppxfxbqfkfVar6;
        if (obj == dsvhmnatus.f20388wkgbmnqykc) {
            this.f53998gtknphoqwx.ojitshcjhn(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20375kcexrzcfyt) {
            this.f53994btonecajqb.ojitshcjhn(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20367hcddaimhww) {
            l7.iobyxmoadg iobyxmoadgVar = this.f53993agtfadlqog;
            if (iobyxmoadgVar != null) {
                this.f53999gxszxtbevo.ylkuphrtab(iobyxmoadgVar);
            }
            if (ppxfxbqfkfVar == null) {
                this.f53993agtfadlqog = null;
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f53993agtfadlqog = vdvldrhtssVar;
            vdvldrhtssVar.iobyxmoadg(this);
            this.f53999gxszxtbevo.btonecajqb(this.f53993agtfadlqog);
            return;
        }
        if (obj == dsvhmnatus.f20356btonecajqb) {
            l7.iobyxmoadg iobyxmoadgVar2 = this.f54003ojitshcjhn;
            if (iobyxmoadgVar2 != null) {
                iobyxmoadgVar2.ojitshcjhn(ppxfxbqfkfVar);
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar2 = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f54003ojitshcjhn = vdvldrhtssVar2;
            vdvldrhtssVar2.iobyxmoadg(this);
            this.f53999gxszxtbevo.btonecajqb(this.f54003ojitshcjhn);
            return;
        }
        if (obj == dsvhmnatus.f20363eablkybsjg && (ppxfxbqfkfVar6 = this.f54006vdvldrhtss) != null) {
            ppxfxbqfkfVar6.ppxfxbqfkf(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20377lmojexxdyd && (ppxfxbqfkfVar5 = this.f54006vdvldrhtss) != null) {
            ppxfxbqfkfVar5.gxszxtbevo(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20389wwaezpbzkn && (ppxfxbqfkfVar4 = this.f54006vdvldrhtss) != null) {
            ppxfxbqfkfVar4.wkgbmnqykc(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20393ylkuphrtab && (ppxfxbqfkfVar3 = this.f54006vdvldrhtss) != null) {
            ppxfxbqfkfVar3.eablkybsjg(ppxfxbqfkfVar);
        } else {
            if (obj != dsvhmnatus.f20382pkzmftpjix || (ppxfxbqfkfVar2 = this.f54006vdvldrhtss) == null) {
                return;
            }
            ppxfxbqfkfVar2.lqeggnwhkg(ppxfxbqfkfVar);
        }
    }

    @Override // o7.gxszxtbevo
    public void ppxfxbqfkf(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
        v7.dxjokdxxww.gtknphoqwx(eablkybsjgVar, i13, list, eablkybsjgVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // k7.ppxfxbqfkf
    public void zoijcleaow(List list, List list2) {
        yggfygwlhe yggfygwlheVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) list.get(size);
            if (ppxfxbqfkfVar instanceof yggfygwlhe) {
                yggfygwlhe yggfygwlheVar2 = (yggfygwlhe) ppxfxbqfkfVar;
                if (yggfygwlheVar2.gtknphoqwx() == q7.zdlpuopuiu.iobyxmoadg.INDIVIDUALLY) {
                    yggfygwlheVar = yggfygwlheVar2;
                }
            }
        }
        if (yggfygwlheVar != null) {
            yggfygwlheVar.ppxfxbqfkf(this);
        }
        zoijcleaow zoijcleaowVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) list2.get(size2);
            if (ppxfxbqfkfVar2 instanceof yggfygwlhe) {
                yggfygwlhe yggfygwlheVar3 = (yggfygwlhe) ppxfxbqfkfVar2;
                if (yggfygwlheVar3.gtknphoqwx() == q7.zdlpuopuiu.iobyxmoadg.INDIVIDUALLY) {
                    if (zoijcleaowVar != null) {
                        this.f54001lqeggnwhkg.add(zoijcleaowVar);
                    }
                    zoijcleaowVar = new zoijcleaow(yggfygwlheVar3);
                    yggfygwlheVar3.ppxfxbqfkf(this);
                } else if (!(ppxfxbqfkfVar2 instanceof wflxmlrfwp)) {
                    if (zoijcleaowVar == null) {
                        zoijcleaowVar = new zoijcleaow(yggfygwlheVar);
                    }
                    zoijcleaowVar.f54010iobyxmoadg.add((wflxmlrfwp) ppxfxbqfkfVar2);
                }
            } else if (!(ppxfxbqfkfVar2 instanceof wflxmlrfwp)) {
                if (zoijcleaowVar == null) {
                    zoijcleaowVar = new zoijcleaow(yggfygwlheVar);
                }
                zoijcleaowVar.f54010iobyxmoadg.add((wflxmlrfwp) ppxfxbqfkfVar2);
            }
        }
        if (zoijcleaowVar != null) {
            this.f54001lqeggnwhkg.add(zoijcleaowVar);
        }
    }
}
