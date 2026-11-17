package l7;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.dsvhmnatus;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class rgvfuqvkyq {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private iobyxmoadg f61752agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private iobyxmoadg f61753btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private wkgbmnqykc f61754draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private iobyxmoadg f61755dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float[] f61756eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private wkgbmnqykc f61757gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private iobyxmoadg f61758gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Matrix f61759iobyxmoadg = new Matrix();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private iobyxmoadg f61760lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private iobyxmoadg f61761nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final boolean f61762ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Matrix f61763ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private iobyxmoadg f61764wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Matrix f61765wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Matrix f61766zoijcleaow;

    public rgvfuqvkyq(p7.draadjrbmk draadjrbmkVar) {
        this.f61758gxszxtbevo = draadjrbmkVar.ppxfxbqfkf() == null ? null : draadjrbmkVar.ppxfxbqfkf().eablkybsjg();
        this.f61760lqeggnwhkg = draadjrbmkVar.gxszxtbevo() == null ? null : draadjrbmkVar.gxszxtbevo().eablkybsjg();
        this.f61761nufgyqmvbu = draadjrbmkVar.nufgyqmvbu() == null ? null : draadjrbmkVar.nufgyqmvbu().eablkybsjg();
        this.f61755dxjokdxxww = draadjrbmkVar.lqeggnwhkg() == null ? null : draadjrbmkVar.lqeggnwhkg().eablkybsjg();
        this.f61757gtknphoqwx = draadjrbmkVar.dxjokdxxww() == null ? null : (wkgbmnqykc) draadjrbmkVar.dxjokdxxww().eablkybsjg();
        this.f61762ojitshcjhn = draadjrbmkVar.draadjrbmk();
        if (this.f61757gtknphoqwx != null) {
            this.f61766zoijcleaow = new Matrix();
            this.f61763ppxfxbqfkf = new Matrix();
            this.f61765wkgbmnqykc = new Matrix();
            this.f61756eablkybsjg = new float[9];
        } else {
            this.f61766zoijcleaow = null;
            this.f61763ppxfxbqfkf = null;
            this.f61765wkgbmnqykc = null;
            this.f61756eablkybsjg = null;
        }
        this.f61754draadjrbmk = draadjrbmkVar.btonecajqb() == null ? null : (wkgbmnqykc) draadjrbmkVar.btonecajqb().eablkybsjg();
        if (draadjrbmkVar.eablkybsjg() != null) {
            this.f61753btonecajqb = draadjrbmkVar.eablkybsjg().eablkybsjg();
        }
        if (draadjrbmkVar.gtknphoqwx() != null) {
            this.f61764wflxmlrfwp = draadjrbmkVar.gtknphoqwx().eablkybsjg();
        } else {
            this.f61764wflxmlrfwp = null;
        }
        if (draadjrbmkVar.wkgbmnqykc() != null) {
            this.f61752agtfadlqog = draadjrbmkVar.wkgbmnqykc().eablkybsjg();
        } else {
            this.f61752agtfadlqog = null;
        }
    }

    private void wkgbmnqykc() {
        for (int i13 = 0; i13 < 9; i13++) {
            this.f61756eablkybsjg[i13] = 0.0f;
        }
    }

    public void btonecajqb(float f13) {
        iobyxmoadg iobyxmoadgVar = this.f61753btonecajqb;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.agtfadlqog(f13);
        }
        iobyxmoadg iobyxmoadgVar2 = this.f61764wflxmlrfwp;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.agtfadlqog(f13);
        }
        iobyxmoadg iobyxmoadgVar3 = this.f61752agtfadlqog;
        if (iobyxmoadgVar3 != null) {
            iobyxmoadgVar3.agtfadlqog(f13);
        }
        iobyxmoadg iobyxmoadgVar4 = this.f61758gxszxtbevo;
        if (iobyxmoadgVar4 != null) {
            iobyxmoadgVar4.agtfadlqog(f13);
        }
        iobyxmoadg iobyxmoadgVar5 = this.f61760lqeggnwhkg;
        if (iobyxmoadgVar5 != null) {
            iobyxmoadgVar5.agtfadlqog(f13);
        }
        iobyxmoadg iobyxmoadgVar6 = this.f61761nufgyqmvbu;
        if (iobyxmoadgVar6 != null) {
            iobyxmoadgVar6.agtfadlqog(f13);
        }
        iobyxmoadg iobyxmoadgVar7 = this.f61755dxjokdxxww;
        if (iobyxmoadgVar7 != null) {
            iobyxmoadgVar7.agtfadlqog(f13);
        }
        wkgbmnqykc wkgbmnqykcVar = this.f61757gtknphoqwx;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.agtfadlqog(f13);
        }
        wkgbmnqykc wkgbmnqykcVar2 = this.f61754draadjrbmk;
        if (wkgbmnqykcVar2 != null) {
            wkgbmnqykcVar2.agtfadlqog(f13);
        }
    }

    public iobyxmoadg dxjokdxxww() {
        return this.f61764wflxmlrfwp;
    }

    public iobyxmoadg eablkybsjg() {
        return this.f61752agtfadlqog;
    }

    public Matrix gxszxtbevo() {
        PointF pointF;
        w7.wkgbmnqykc wkgbmnqykcVar;
        PointF pointF2;
        this.f61759iobyxmoadg.reset();
        iobyxmoadg iobyxmoadgVar = this.f61760lqeggnwhkg;
        if (iobyxmoadgVar != null && (pointF2 = (PointF) iobyxmoadgVar.nufgyqmvbu()) != null) {
            float f13 = pointF2.x;
            if (f13 != 0.0f || pointF2.y != 0.0f) {
                this.f61759iobyxmoadg.preTranslate(f13, pointF2.y);
            }
        }
        if (!this.f61762ojitshcjhn) {
            iobyxmoadg iobyxmoadgVar2 = this.f61755dxjokdxxww;
            if (iobyxmoadgVar2 != null) {
                float fFloatValue = iobyxmoadgVar2 instanceof vdvldrhtss ? ((Float) iobyxmoadgVar2.nufgyqmvbu()).floatValue() : ((wkgbmnqykc) iobyxmoadgVar2).vdvldrhtss();
                if (fFloatValue != 0.0f) {
                    this.f61759iobyxmoadg.preRotate(fFloatValue);
                }
            }
        } else if (iobyxmoadgVar != null) {
            float fGxszxtbevo = iobyxmoadgVar.gxszxtbevo();
            PointF pointF3 = (PointF) iobyxmoadgVar.nufgyqmvbu();
            float f14 = pointF3.x;
            float f15 = pointF3.y;
            iobyxmoadgVar.agtfadlqog(1.0E-4f + fGxszxtbevo);
            PointF pointF4 = (PointF) iobyxmoadgVar.nufgyqmvbu();
            iobyxmoadgVar.agtfadlqog(fGxszxtbevo);
            this.f61759iobyxmoadg.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f15, pointF4.x - f14)));
        }
        wkgbmnqykc wkgbmnqykcVar2 = this.f61757gtknphoqwx;
        if (wkgbmnqykcVar2 != null) {
            wkgbmnqykc wkgbmnqykcVar3 = this.f61754draadjrbmk;
            float fCos = wkgbmnqykcVar3 == null ? 0.0f : (float) Math.cos(Math.toRadians((-wkgbmnqykcVar3.vdvldrhtss()) + 90.0f));
            wkgbmnqykc wkgbmnqykcVar4 = this.f61754draadjrbmk;
            float fSin = wkgbmnqykcVar4 == null ? 1.0f : (float) Math.sin(Math.toRadians((-wkgbmnqykcVar4.vdvldrhtss()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(wkgbmnqykcVar2.vdvldrhtss()));
            wkgbmnqykc();
            float[] fArr = this.f61756eablkybsjg;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f16 = -fSin;
            fArr[3] = f16;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f61766zoijcleaow.setValues(fArr);
            wkgbmnqykc();
            float[] fArr2 = this.f61756eablkybsjg;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f61763ppxfxbqfkf.setValues(fArr2);
            wkgbmnqykc();
            float[] fArr3 = this.f61756eablkybsjg;
            fArr3[0] = fCos;
            fArr3[1] = f16;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f61765wkgbmnqykc.setValues(fArr3);
            this.f61763ppxfxbqfkf.preConcat(this.f61766zoijcleaow);
            this.f61765wkgbmnqykc.preConcat(this.f61763ppxfxbqfkf);
            this.f61759iobyxmoadg.preConcat(this.f61765wkgbmnqykc);
        }
        iobyxmoadg iobyxmoadgVar3 = this.f61761nufgyqmvbu;
        if (iobyxmoadgVar3 != null && (wkgbmnqykcVar = (w7.wkgbmnqykc) iobyxmoadgVar3.nufgyqmvbu()) != null && (wkgbmnqykcVar.zoijcleaow() != 1.0f || wkgbmnqykcVar.ppxfxbqfkf() != 1.0f)) {
            this.f61759iobyxmoadg.preScale(wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.ppxfxbqfkf());
        }
        iobyxmoadg iobyxmoadgVar4 = this.f61758gxszxtbevo;
        if (iobyxmoadgVar4 != null && (pointF = (PointF) iobyxmoadgVar4.nufgyqmvbu()) != null) {
            float f17 = pointF.x;
            if (f17 != 0.0f || pointF.y != 0.0f) {
                this.f61759iobyxmoadg.preTranslate(-f17, -pointF.y);
            }
        }
        return this.f61759iobyxmoadg;
    }

    public void iobyxmoadg(r7.zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.btonecajqb(this.f61753btonecajqb);
        zoijcleaowVar.btonecajqb(this.f61764wflxmlrfwp);
        zoijcleaowVar.btonecajqb(this.f61752agtfadlqog);
        zoijcleaowVar.btonecajqb(this.f61758gxszxtbevo);
        zoijcleaowVar.btonecajqb(this.f61760lqeggnwhkg);
        zoijcleaowVar.btonecajqb(this.f61761nufgyqmvbu);
        zoijcleaowVar.btonecajqb(this.f61755dxjokdxxww);
        zoijcleaowVar.btonecajqb(this.f61757gtknphoqwx);
        zoijcleaowVar.btonecajqb(this.f61754draadjrbmk);
    }

    public Matrix lqeggnwhkg(float f13) {
        iobyxmoadg iobyxmoadgVar = this.f61760lqeggnwhkg;
        PointF pointF = iobyxmoadgVar == null ? null : (PointF) iobyxmoadgVar.nufgyqmvbu();
        iobyxmoadg iobyxmoadgVar2 = this.f61761nufgyqmvbu;
        w7.wkgbmnqykc wkgbmnqykcVar = iobyxmoadgVar2 == null ? null : (w7.wkgbmnqykc) iobyxmoadgVar2.nufgyqmvbu();
        this.f61759iobyxmoadg.reset();
        if (pointF != null) {
            this.f61759iobyxmoadg.preTranslate(pointF.x * f13, pointF.y * f13);
        }
        if (wkgbmnqykcVar != null) {
            double d13 = f13;
            this.f61759iobyxmoadg.preScale((float) Math.pow(wkgbmnqykcVar.zoijcleaow(), d13), (float) Math.pow(wkgbmnqykcVar.ppxfxbqfkf(), d13));
        }
        iobyxmoadg iobyxmoadgVar3 = this.f61755dxjokdxxww;
        if (iobyxmoadgVar3 != null) {
            float fFloatValue = ((Float) iobyxmoadgVar3.nufgyqmvbu()).floatValue();
            iobyxmoadg iobyxmoadgVar4 = this.f61758gxszxtbevo;
            PointF pointF2 = iobyxmoadgVar4 != null ? (PointF) iobyxmoadgVar4.nufgyqmvbu() : null;
            this.f61759iobyxmoadg.preRotate(fFloatValue * f13, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.f61759iobyxmoadg;
    }

    public iobyxmoadg nufgyqmvbu() {
        return this.f61753btonecajqb;
    }

    public boolean ppxfxbqfkf(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        if (obj == dsvhmnatus.f20366gxszxtbevo) {
            iobyxmoadg iobyxmoadgVar = this.f61758gxszxtbevo;
            if (iobyxmoadgVar == null) {
                this.f61758gxszxtbevo = new vdvldrhtss(ppxfxbqfkfVar, new PointF());
                return true;
            }
            iobyxmoadgVar.ojitshcjhn(ppxfxbqfkfVar);
            return true;
        }
        if (obj == dsvhmnatus.f20378lqeggnwhkg) {
            iobyxmoadg iobyxmoadgVar2 = this.f61760lqeggnwhkg;
            if (iobyxmoadgVar2 == null) {
                this.f61760lqeggnwhkg = new vdvldrhtss(ppxfxbqfkfVar, new PointF());
                return true;
            }
            iobyxmoadgVar2.ojitshcjhn(ppxfxbqfkfVar);
            return true;
        }
        if (obj == dsvhmnatus.f20379nufgyqmvbu) {
            iobyxmoadg iobyxmoadgVar3 = this.f61760lqeggnwhkg;
            if (iobyxmoadgVar3 instanceof agtfadlqog) {
                ((agtfadlqog) iobyxmoadgVar3).kcexrzcfyt(ppxfxbqfkfVar);
                return true;
            }
        }
        if (obj == dsvhmnatus.f20362dxjokdxxww) {
            iobyxmoadg iobyxmoadgVar4 = this.f61760lqeggnwhkg;
            if (iobyxmoadgVar4 instanceof agtfadlqog) {
                ((agtfadlqog) iobyxmoadgVar4).zdlpuopuiu(ppxfxbqfkfVar);
                return true;
            }
        }
        if (obj == dsvhmnatus.f20380ojitshcjhn) {
            iobyxmoadg iobyxmoadgVar5 = this.f61761nufgyqmvbu;
            if (iobyxmoadgVar5 == null) {
                this.f61761nufgyqmvbu = new vdvldrhtss(ppxfxbqfkfVar, new w7.wkgbmnqykc());
                return true;
            }
            iobyxmoadgVar5.ojitshcjhn(ppxfxbqfkfVar);
            return true;
        }
        if (obj == dsvhmnatus.f20385rgvfuqvkyq) {
            iobyxmoadg iobyxmoadgVar6 = this.f61755dxjokdxxww;
            if (iobyxmoadgVar6 == null) {
                this.f61755dxjokdxxww = new vdvldrhtss(ppxfxbqfkfVar, Float.valueOf(0.0f));
                return true;
            }
            iobyxmoadgVar6.ojitshcjhn(ppxfxbqfkfVar);
            return true;
        }
        if (obj == dsvhmnatus.f20384ppxfxbqfkf) {
            iobyxmoadg iobyxmoadgVar7 = this.f61753btonecajqb;
            if (iobyxmoadgVar7 == null) {
                this.f61753btonecajqb = new vdvldrhtss(ppxfxbqfkfVar, 100);
                return true;
            }
            iobyxmoadgVar7.ojitshcjhn(ppxfxbqfkfVar);
            return true;
        }
        if (obj == dsvhmnatus.f20371istkbnxepw) {
            iobyxmoadg iobyxmoadgVar8 = this.f61764wflxmlrfwp;
            if (iobyxmoadgVar8 == null) {
                this.f61764wflxmlrfwp = new vdvldrhtss(ppxfxbqfkfVar, Float.valueOf(100.0f));
                return true;
            }
            iobyxmoadgVar8.ojitshcjhn(ppxfxbqfkfVar);
            return true;
        }
        if (obj == dsvhmnatus.f20357cdpycssgdh) {
            iobyxmoadg iobyxmoadgVar9 = this.f61752agtfadlqog;
            if (iobyxmoadgVar9 == null) {
                this.f61752agtfadlqog = new vdvldrhtss(ppxfxbqfkfVar, Float.valueOf(100.0f));
                return true;
            }
            iobyxmoadgVar9.ojitshcjhn(ppxfxbqfkfVar);
            return true;
        }
        if (obj == dsvhmnatus.f20386vdvldrhtss) {
            if (this.f61757gtknphoqwx == null) {
                this.f61757gtknphoqwx = new wkgbmnqykc(Collections.singletonList(new w7.iobyxmoadg(Float.valueOf(0.0f))));
            }
            this.f61757gtknphoqwx.ojitshcjhn(ppxfxbqfkfVar);
            return true;
        }
        if (obj != dsvhmnatus.f20381oxmwwwfdhm) {
            return false;
        }
        if (this.f61754draadjrbmk == null) {
            this.f61754draadjrbmk = new wkgbmnqykc(Collections.singletonList(new w7.iobyxmoadg(Float.valueOf(0.0f))));
        }
        this.f61754draadjrbmk.ojitshcjhn(ppxfxbqfkfVar);
        return true;
    }

    public void zoijcleaow(iobyxmoadg.zoijcleaow zoijcleaowVar) {
        iobyxmoadg iobyxmoadgVar = this.f61753btonecajqb;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg(zoijcleaowVar);
        }
        iobyxmoadg iobyxmoadgVar2 = this.f61764wflxmlrfwp;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.iobyxmoadg(zoijcleaowVar);
        }
        iobyxmoadg iobyxmoadgVar3 = this.f61752agtfadlqog;
        if (iobyxmoadgVar3 != null) {
            iobyxmoadgVar3.iobyxmoadg(zoijcleaowVar);
        }
        iobyxmoadg iobyxmoadgVar4 = this.f61758gxszxtbevo;
        if (iobyxmoadgVar4 != null) {
            iobyxmoadgVar4.iobyxmoadg(zoijcleaowVar);
        }
        iobyxmoadg iobyxmoadgVar5 = this.f61760lqeggnwhkg;
        if (iobyxmoadgVar5 != null) {
            iobyxmoadgVar5.iobyxmoadg(zoijcleaowVar);
        }
        iobyxmoadg iobyxmoadgVar6 = this.f61761nufgyqmvbu;
        if (iobyxmoadgVar6 != null) {
            iobyxmoadgVar6.iobyxmoadg(zoijcleaowVar);
        }
        iobyxmoadg iobyxmoadgVar7 = this.f61755dxjokdxxww;
        if (iobyxmoadgVar7 != null) {
            iobyxmoadgVar7.iobyxmoadg(zoijcleaowVar);
        }
        wkgbmnqykc wkgbmnqykcVar = this.f61757gtknphoqwx;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.iobyxmoadg(zoijcleaowVar);
        }
        wkgbmnqykc wkgbmnqykcVar2 = this.f61754draadjrbmk;
        if (wkgbmnqykcVar2 != null) {
            wkgbmnqykcVar2.iobyxmoadg(zoijcleaowVar);
        }
    }
}
