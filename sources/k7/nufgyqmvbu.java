package k7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.esjtqupxsv;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu implements eablkybsjg, l7.iobyxmoadg.zoijcleaow, gtknphoqwx {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final l7.iobyxmoadg f54025agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q7.lqeggnwhkg f54026btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final l7.iobyxmoadg f54027draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final List f54028dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final l7.iobyxmoadg f54030gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Path f54031gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f54032iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private l7.iobyxmoadg f54033kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Paint f54034lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final RectF f54035nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private l7.iobyxmoadg f54036ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final int f54037oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final r7.zoijcleaow f54038ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private l7.vdvldrhtss f54039rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final hcddaimhww f54040vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final l7.iobyxmoadg f54041wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private l7.ppxfxbqfkf f54043yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    float f54044zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f54045zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final esjtqupxsv f54042wkgbmnqykc = new esjtqupxsv();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final esjtqupxsv f54029eablkybsjg = new esjtqupxsv();

    public nufgyqmvbu(hcddaimhww hcddaimhwwVar, com.airbnb.lottie.btonecajqb btonecajqbVar, r7.zoijcleaow zoijcleaowVar, q7.eablkybsjg eablkybsjgVar) {
        Path path = new Path();
        this.f54031gxszxtbevo = path;
        this.f54034lqeggnwhkg = new j7.iobyxmoadg(1);
        this.f54035nufgyqmvbu = new RectF();
        this.f54028dxjokdxxww = new ArrayList();
        this.f54044zdlpuopuiu = 0.0f;
        this.f54038ppxfxbqfkf = zoijcleaowVar;
        this.f54032iobyxmoadg = eablkybsjgVar.gxszxtbevo();
        this.f54045zoijcleaow = eablkybsjgVar.dxjokdxxww();
        this.f54040vdvldrhtss = hcddaimhwwVar;
        this.f54026btonecajqb = eablkybsjgVar.eablkybsjg();
        path.setFillType(eablkybsjgVar.ppxfxbqfkf());
        this.f54037oxmwwwfdhm = (int) (btonecajqbVar.wkgbmnqykc() / 32.0f);
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg = eablkybsjgVar.wkgbmnqykc().eablkybsjg();
        this.f54030gtknphoqwx = iobyxmoadgVarEablkybsjg;
        iobyxmoadgVarEablkybsjg.iobyxmoadg(this);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg);
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg2 = eablkybsjgVar.lqeggnwhkg().eablkybsjg();
        this.f54027draadjrbmk = iobyxmoadgVarEablkybsjg2;
        iobyxmoadgVarEablkybsjg2.iobyxmoadg(this);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg2);
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg3 = eablkybsjgVar.nufgyqmvbu().eablkybsjg();
        this.f54041wflxmlrfwp = iobyxmoadgVarEablkybsjg3;
        iobyxmoadgVarEablkybsjg3.iobyxmoadg(this);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg3);
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg4 = eablkybsjgVar.zoijcleaow().eablkybsjg();
        this.f54025agtfadlqog = iobyxmoadgVarEablkybsjg4;
        iobyxmoadgVarEablkybsjg4.iobyxmoadg(this);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg4);
        if (zoijcleaowVar.cqumvgiudr() != null) {
            l7.iobyxmoadg iobyxmoadgVarEablkybsjg5 = zoijcleaowVar.cqumvgiudr().iobyxmoadg().eablkybsjg();
            this.f54033kcexrzcfyt = iobyxmoadgVarEablkybsjg5;
            iobyxmoadgVarEablkybsjg5.iobyxmoadg(this);
            zoijcleaowVar.btonecajqb(this.f54033kcexrzcfyt);
        }
        if (zoijcleaowVar.lereixgezr() != null) {
            this.f54043yggfygwlhe = new l7.ppxfxbqfkf(this, zoijcleaowVar, zoijcleaowVar.lereixgezr());
        }
    }

    private int btonecajqb() {
        int iRound = Math.round(this.f54041wflxmlrfwp.gxszxtbevo() * this.f54037oxmwwwfdhm);
        int iRound2 = Math.round(this.f54025agtfadlqog.gxszxtbevo() * this.f54037oxmwwwfdhm);
        int iRound3 = Math.round(this.f54030gtknphoqwx.gxszxtbevo() * this.f54037oxmwwwfdhm);
        int i13 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i13 = i13 * 31 * iRound2;
        }
        return iRound3 != 0 ? i13 * 31 * iRound3 : i13;
    }

    private RadialGradient draadjrbmk() {
        long jBtonecajqb = btonecajqb();
        RadialGradient radialGradient = (RadialGradient) this.f54029eablkybsjg.wkgbmnqykc(jBtonecajqb);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f54041wflxmlrfwp.nufgyqmvbu();
        PointF pointF2 = (PointF) this.f54025agtfadlqog.nufgyqmvbu();
        q7.wkgbmnqykc wkgbmnqykcVar = (q7.wkgbmnqykc) this.f54030gtknphoqwx.nufgyqmvbu();
        int[] iArrLqeggnwhkg = lqeggnwhkg(wkgbmnqykcVar.wkgbmnqykc());
        float[] fArrEablkybsjg = wkgbmnqykcVar.eablkybsjg();
        float f13 = pointF.x;
        float f14 = pointF.y;
        float fHypot = (float) Math.hypot(pointF2.x - f13, pointF2.y - f14);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f13, f14, fHypot, iArrLqeggnwhkg, fArrEablkybsjg, Shader.TileMode.CLAMP);
        this.f54029eablkybsjg.nufgyqmvbu(jBtonecajqb, radialGradient2);
        return radialGradient2;
    }

    private LinearGradient gtknphoqwx() {
        long jBtonecajqb = btonecajqb();
        LinearGradient linearGradient = (LinearGradient) this.f54042wkgbmnqykc.wkgbmnqykc(jBtonecajqb);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f54041wflxmlrfwp.nufgyqmvbu();
        PointF pointF2 = (PointF) this.f54025agtfadlqog.nufgyqmvbu();
        q7.wkgbmnqykc wkgbmnqykcVar = (q7.wkgbmnqykc) this.f54030gtknphoqwx.nufgyqmvbu();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, lqeggnwhkg(wkgbmnqykcVar.wkgbmnqykc()), wkgbmnqykcVar.eablkybsjg(), Shader.TileMode.CLAMP);
        this.f54042wkgbmnqykc.nufgyqmvbu(jBtonecajqb, linearGradient2);
        return linearGradient2;
    }

    private int[] lqeggnwhkg(int[] iArr) {
        l7.vdvldrhtss vdvldrhtssVar = this.f54039rgvfuqvkyq;
        if (vdvldrhtssVar != null) {
            Integer[] numArr = (Integer[]) vdvldrhtssVar.nufgyqmvbu();
            int i13 = 0;
            if (iArr.length == numArr.length) {
                while (i13 < iArr.length) {
                    iArr[i13] = numArr[i13].intValue();
                    i13++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i13 < numArr.length) {
                    iArr[i13] = numArr[i13].intValue();
                    i13++;
                }
            }
        }
        return iArr;
    }

    @Override // k7.eablkybsjg
    public void dxjokdxxww(Canvas canvas, Matrix matrix, int i13) {
        if (this.f54045zoijcleaow) {
            return;
        }
        com.airbnb.lottie.eablkybsjg.zoijcleaow("GradientFillContent#draw");
        this.f54031gxszxtbevo.reset();
        for (int i14 = 0; i14 < this.f54028dxjokdxxww.size(); i14++) {
            this.f54031gxszxtbevo.addPath(((wflxmlrfwp) this.f54028dxjokdxxww.get(i14)).gxszxtbevo(), matrix);
        }
        this.f54031gxszxtbevo.computeBounds(this.f54035nufgyqmvbu, false);
        Shader shaderGtknphoqwx = this.f54026btonecajqb == q7.lqeggnwhkg.LINEAR ? gtknphoqwx() : draadjrbmk();
        shaderGtknphoqwx.setLocalMatrix(matrix);
        this.f54034lqeggnwhkg.setShader(shaderGtknphoqwx);
        l7.iobyxmoadg iobyxmoadgVar = this.f54036ojitshcjhn;
        if (iobyxmoadgVar != null) {
            this.f54034lqeggnwhkg.setColorFilter((ColorFilter) iobyxmoadgVar.nufgyqmvbu());
        }
        l7.iobyxmoadg iobyxmoadgVar2 = this.f54033kcexrzcfyt;
        if (iobyxmoadgVar2 != null) {
            float fFloatValue = ((Float) iobyxmoadgVar2.nufgyqmvbu()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f54034lqeggnwhkg.setMaskFilter(null);
            } else if (fFloatValue != this.f54044zdlpuopuiu) {
                this.f54034lqeggnwhkg.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f54044zdlpuopuiu = fFloatValue;
        }
        l7.ppxfxbqfkf ppxfxbqfkfVar = this.f54043yggfygwlhe;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.zoijcleaow(this.f54034lqeggnwhkg);
        }
        this.f54034lqeggnwhkg.setAlpha(v7.dxjokdxxww.ppxfxbqfkf((int) ((((i13 / 255.0f) * ((Integer) this.f54027draadjrbmk.nufgyqmvbu()).intValue()) / 100.0f) * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        canvas.drawPath(this.f54031gxszxtbevo, this.f54034lqeggnwhkg);
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("GradientFillContent#draw");
    }

    @Override // k7.eablkybsjg
    public void eablkybsjg(RectF rectF, Matrix matrix, boolean z13) {
        this.f54031gxszxtbevo.reset();
        for (int i13 = 0; i13 < this.f54028dxjokdxxww.size(); i13++) {
            this.f54031gxszxtbevo.addPath(((wflxmlrfwp) this.f54028dxjokdxxww.get(i13)).gxszxtbevo(), matrix);
        }
        this.f54031gxszxtbevo.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // k7.ppxfxbqfkf
    public String getName() {
        return this.f54032iobyxmoadg;
    }

    @Override // l7.iobyxmoadg.zoijcleaow
    public void iobyxmoadg() {
        this.f54040vdvldrhtss.invalidateSelf();
    }

    @Override // o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        l7.ppxfxbqfkf ppxfxbqfkfVar2;
        l7.ppxfxbqfkf ppxfxbqfkfVar3;
        l7.ppxfxbqfkf ppxfxbqfkfVar4;
        l7.ppxfxbqfkf ppxfxbqfkfVar5;
        l7.ppxfxbqfkf ppxfxbqfkfVar6;
        if (obj == dsvhmnatus.f20388wkgbmnqykc) {
            this.f54027draadjrbmk.ojitshcjhn(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20367hcddaimhww) {
            l7.iobyxmoadg iobyxmoadgVar = this.f54036ojitshcjhn;
            if (iobyxmoadgVar != null) {
                this.f54038ppxfxbqfkf.ylkuphrtab(iobyxmoadgVar);
            }
            if (ppxfxbqfkfVar == null) {
                this.f54036ojitshcjhn = null;
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f54036ojitshcjhn = vdvldrhtssVar;
            vdvldrhtssVar.iobyxmoadg(this);
            this.f54038ppxfxbqfkf.btonecajqb(this.f54036ojitshcjhn);
            return;
        }
        if (obj == dsvhmnatus.f20373jpowsppfya) {
            l7.vdvldrhtss vdvldrhtssVar2 = this.f54039rgvfuqvkyq;
            if (vdvldrhtssVar2 != null) {
                this.f54038ppxfxbqfkf.ylkuphrtab(vdvldrhtssVar2);
            }
            if (ppxfxbqfkfVar == null) {
                this.f54039rgvfuqvkyq = null;
                return;
            }
            this.f54042wkgbmnqykc.iobyxmoadg();
            this.f54029eablkybsjg.iobyxmoadg();
            l7.vdvldrhtss vdvldrhtssVar3 = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f54039rgvfuqvkyq = vdvldrhtssVar3;
            vdvldrhtssVar3.iobyxmoadg(this);
            this.f54038ppxfxbqfkf.btonecajqb(this.f54039rgvfuqvkyq);
            return;
        }
        if (obj == dsvhmnatus.f20356btonecajqb) {
            l7.iobyxmoadg iobyxmoadgVar2 = this.f54033kcexrzcfyt;
            if (iobyxmoadgVar2 != null) {
                iobyxmoadgVar2.ojitshcjhn(ppxfxbqfkfVar);
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar4 = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f54033kcexrzcfyt = vdvldrhtssVar4;
            vdvldrhtssVar4.iobyxmoadg(this);
            this.f54038ppxfxbqfkf.btonecajqb(this.f54033kcexrzcfyt);
            return;
        }
        if (obj == dsvhmnatus.f20363eablkybsjg && (ppxfxbqfkfVar6 = this.f54043yggfygwlhe) != null) {
            ppxfxbqfkfVar6.ppxfxbqfkf(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20377lmojexxdyd && (ppxfxbqfkfVar5 = this.f54043yggfygwlhe) != null) {
            ppxfxbqfkfVar5.gxszxtbevo(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20389wwaezpbzkn && (ppxfxbqfkfVar4 = this.f54043yggfygwlhe) != null) {
            ppxfxbqfkfVar4.wkgbmnqykc(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20393ylkuphrtab && (ppxfxbqfkfVar3 = this.f54043yggfygwlhe) != null) {
            ppxfxbqfkfVar3.eablkybsjg(ppxfxbqfkfVar);
        } else {
            if (obj != dsvhmnatus.f20382pkzmftpjix || (ppxfxbqfkfVar2 = this.f54043yggfygwlhe) == null) {
                return;
            }
            ppxfxbqfkfVar2.lqeggnwhkg(ppxfxbqfkfVar);
        }
    }

    @Override // o7.gxszxtbevo
    public void ppxfxbqfkf(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
        v7.dxjokdxxww.gtknphoqwx(eablkybsjgVar, i13, list, eablkybsjgVar2, this);
    }

    @Override // k7.ppxfxbqfkf
    public void zoijcleaow(List list, List list2) {
        for (int i13 = 0; i13 < list2.size(); i13++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) list2.get(i13);
            if (ppxfxbqfkfVar instanceof wflxmlrfwp) {
                this.f54028dxjokdxxww.add((wflxmlrfwp) ppxfxbqfkfVar);
            }
        }
    }
}
