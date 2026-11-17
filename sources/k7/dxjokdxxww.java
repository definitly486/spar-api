package k7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.esjtqupxsv;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;

/* JADX INFO: loaded from: classes2.dex */
public class dxjokdxxww extends iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f53974cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final l7.iobyxmoadg f53975esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final q7.lqeggnwhkg f53976iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final RectF f53977jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final boolean f53978kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final l7.iobyxmoadg f53979lereixgezr;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final String f53980oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final l7.iobyxmoadg f53981pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final esjtqupxsv f53982yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final esjtqupxsv f53983zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private l7.vdvldrhtss f53984zynmafqrjb;

    public dxjokdxxww(hcddaimhww hcddaimhwwVar, r7.zoijcleaow zoijcleaowVar, q7.gxszxtbevo gxszxtbevoVar) {
        super(hcddaimhwwVar, zoijcleaowVar, gxszxtbevoVar.zoijcleaow().wkgbmnqykc(), gxszxtbevoVar.lqeggnwhkg().wkgbmnqykc(), gxszxtbevoVar.dxjokdxxww(), gxszxtbevoVar.gtknphoqwx(), gxszxtbevoVar.wflxmlrfwp(), gxszxtbevoVar.nufgyqmvbu(), gxszxtbevoVar.ppxfxbqfkf());
        this.f53983zdlpuopuiu = new esjtqupxsv();
        this.f53982yggfygwlhe = new esjtqupxsv();
        this.f53977jyumaefscl = new RectF();
        this.f53980oxmwwwfdhm = gxszxtbevoVar.btonecajqb();
        this.f53976iwizpuwonk = gxszxtbevoVar.gxszxtbevo();
        this.f53978kcexrzcfyt = gxszxtbevoVar.agtfadlqog();
        this.f53974cqumvgiudr = (int) (hcddaimhwwVar.pkzmftpjix().wkgbmnqykc() / 32.0f);
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg = gxszxtbevoVar.eablkybsjg().eablkybsjg();
        this.f53975esjtqupxsv = iobyxmoadgVarEablkybsjg;
        iobyxmoadgVarEablkybsjg.iobyxmoadg(this);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg);
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg2 = gxszxtbevoVar.draadjrbmk().eablkybsjg();
        this.f53979lereixgezr = iobyxmoadgVarEablkybsjg2;
        iobyxmoadgVarEablkybsjg2.iobyxmoadg(this);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg2);
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg3 = gxszxtbevoVar.wkgbmnqykc().eablkybsjg();
        this.f53981pmvmpeiblj = iobyxmoadgVarEablkybsjg3;
        iobyxmoadgVarEablkybsjg3.iobyxmoadg(this);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg3);
    }

    private RadialGradient agtfadlqog() {
        long jDraadjrbmk = draadjrbmk();
        RadialGradient radialGradient = (RadialGradient) this.f53982yggfygwlhe.wkgbmnqykc(jDraadjrbmk);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f53979lereixgezr.nufgyqmvbu();
        PointF pointF2 = (PointF) this.f53981pmvmpeiblj.nufgyqmvbu();
        q7.wkgbmnqykc wkgbmnqykcVar = (q7.wkgbmnqykc) this.f53975esjtqupxsv.nufgyqmvbu();
        int[] iArrGtknphoqwx = gtknphoqwx(wkgbmnqykcVar.wkgbmnqykc());
        float[] fArrEablkybsjg = wkgbmnqykcVar.eablkybsjg();
        float f13 = pointF.x;
        float f14 = pointF.y;
        RadialGradient radialGradient2 = new RadialGradient(f13, f14, (float) Math.hypot(pointF2.x - f13, pointF2.y - f14), iArrGtknphoqwx, fArrEablkybsjg, Shader.TileMode.CLAMP);
        this.f53982yggfygwlhe.nufgyqmvbu(jDraadjrbmk, radialGradient2);
        return radialGradient2;
    }

    private int draadjrbmk() {
        int iRound = Math.round(this.f53979lereixgezr.gxszxtbevo() * this.f53974cqumvgiudr);
        int iRound2 = Math.round(this.f53981pmvmpeiblj.gxszxtbevo() * this.f53974cqumvgiudr);
        int iRound3 = Math.round(this.f53975esjtqupxsv.gxszxtbevo() * this.f53974cqumvgiudr);
        int i13 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i13 = i13 * 31 * iRound2;
        }
        return iRound3 != 0 ? i13 * 31 * iRound3 : i13;
    }

    private int[] gtknphoqwx(int[] iArr) {
        l7.vdvldrhtss vdvldrhtssVar = this.f53984zynmafqrjb;
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

    private LinearGradient wflxmlrfwp() {
        long jDraadjrbmk = draadjrbmk();
        LinearGradient linearGradient = (LinearGradient) this.f53983zdlpuopuiu.wkgbmnqykc(jDraadjrbmk);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f53979lereixgezr.nufgyqmvbu();
        PointF pointF2 = (PointF) this.f53981pmvmpeiblj.nufgyqmvbu();
        q7.wkgbmnqykc wkgbmnqykcVar = (q7.wkgbmnqykc) this.f53975esjtqupxsv.nufgyqmvbu();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, gtknphoqwx(wkgbmnqykcVar.wkgbmnqykc()), wkgbmnqykcVar.eablkybsjg(), Shader.TileMode.CLAMP);
        this.f53983zdlpuopuiu.nufgyqmvbu(jDraadjrbmk, linearGradient2);
        return linearGradient2;
    }

    @Override // k7.iobyxmoadg, k7.eablkybsjg
    public void dxjokdxxww(Canvas canvas, Matrix matrix, int i13) {
        if (this.f53978kcexrzcfyt) {
            return;
        }
        eablkybsjg(this.f53977jyumaefscl, matrix, false);
        Shader shaderWflxmlrfwp = this.f53976iwizpuwonk == q7.lqeggnwhkg.LINEAR ? wflxmlrfwp() : agtfadlqog();
        shaderWflxmlrfwp.setLocalMatrix(matrix);
        this.f53996dxjokdxxww.setShader(shaderWflxmlrfwp);
        super.dxjokdxxww(canvas, matrix, i13);
    }

    @Override // k7.ppxfxbqfkf
    public String getName() {
        return this.f53980oxmwwwfdhm;
    }

    @Override // k7.iobyxmoadg, o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        super.nufgyqmvbu(obj, ppxfxbqfkfVar);
        if (obj == dsvhmnatus.f20373jpowsppfya) {
            l7.vdvldrhtss vdvldrhtssVar = this.f53984zynmafqrjb;
            if (vdvldrhtssVar != null) {
                this.f53999gxszxtbevo.ylkuphrtab(vdvldrhtssVar);
            }
            if (ppxfxbqfkfVar == null) {
                this.f53984zynmafqrjb = null;
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar2 = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f53984zynmafqrjb = vdvldrhtssVar2;
            vdvldrhtssVar2.iobyxmoadg(this);
            this.f53999gxszxtbevo.btonecajqb(this.f53984zynmafqrjb);
        }
    }
}
