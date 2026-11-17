package k7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class agtfadlqog implements wflxmlrfwp, l7.iobyxmoadg.zoijcleaow, gtknphoqwx {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final l7.iobyxmoadg f53948agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final l7.iobyxmoadg f53949btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final l7.iobyxmoadg f53950draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f53951dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f53952eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final l7.iobyxmoadg f53953gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final hcddaimhww f53954gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final q7.gtknphoqwx.iobyxmoadg f53956lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f53957nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final l7.iobyxmoadg f53958ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f53959oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final l7.iobyxmoadg f53961rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final l7.iobyxmoadg f53963wflxmlrfwp;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Path f53955iobyxmoadg = new Path();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Path f53965zoijcleaow = new Path();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final PathMeasure f53960ppxfxbqfkf = new PathMeasure();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float[] f53964wkgbmnqykc = new float[2];

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final zoijcleaow f53962vdvldrhtss = new zoijcleaow();

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f53966iobyxmoadg;

        static {
            int[] iArr = new int[q7.gtknphoqwx.iobyxmoadg.values().length];
            f53966iobyxmoadg = iArr;
            try {
                iArr[q7.gtknphoqwx.iobyxmoadg.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53966iobyxmoadg[q7.gtknphoqwx.iobyxmoadg.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public agtfadlqog(hcddaimhww hcddaimhwwVar, r7.zoijcleaow zoijcleaowVar, q7.gtknphoqwx gtknphoqwxVar) {
        this.f53954gxszxtbevo = hcddaimhwwVar;
        this.f53952eablkybsjg = gtknphoqwxVar.wkgbmnqykc();
        q7.gtknphoqwx.iobyxmoadg iobyxmoadgVarBtonecajqb = gtknphoqwxVar.btonecajqb();
        this.f53956lqeggnwhkg = iobyxmoadgVarBtonecajqb;
        this.f53957nufgyqmvbu = gtknphoqwxVar.gtknphoqwx();
        this.f53951dxjokdxxww = gtknphoqwxVar.draadjrbmk();
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg = gtknphoqwxVar.lqeggnwhkg().eablkybsjg();
        this.f53949btonecajqb = iobyxmoadgVarEablkybsjg;
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg2 = gtknphoqwxVar.nufgyqmvbu().eablkybsjg();
        this.f53953gtknphoqwx = iobyxmoadgVarEablkybsjg2;
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg3 = gtknphoqwxVar.dxjokdxxww().eablkybsjg();
        this.f53950draadjrbmk = iobyxmoadgVarEablkybsjg3;
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg4 = gtknphoqwxVar.eablkybsjg().eablkybsjg();
        this.f53948agtfadlqog = iobyxmoadgVarEablkybsjg4;
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg5 = gtknphoqwxVar.gxszxtbevo().eablkybsjg();
        this.f53961rgvfuqvkyq = iobyxmoadgVarEablkybsjg5;
        q7.gtknphoqwx.iobyxmoadg iobyxmoadgVar = q7.gtknphoqwx.iobyxmoadg.STAR;
        if (iobyxmoadgVarBtonecajqb == iobyxmoadgVar) {
            this.f53963wflxmlrfwp = gtknphoqwxVar.zoijcleaow().eablkybsjg();
            this.f53958ojitshcjhn = gtknphoqwxVar.ppxfxbqfkf().eablkybsjg();
        } else {
            this.f53963wflxmlrfwp = null;
            this.f53958ojitshcjhn = null;
        }
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg2);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg3);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg4);
        zoijcleaowVar.btonecajqb(iobyxmoadgVarEablkybsjg5);
        if (iobyxmoadgVarBtonecajqb == iobyxmoadgVar) {
            zoijcleaowVar.btonecajqb(this.f53963wflxmlrfwp);
            zoijcleaowVar.btonecajqb(this.f53958ojitshcjhn);
        }
        iobyxmoadgVarEablkybsjg.iobyxmoadg(this);
        iobyxmoadgVarEablkybsjg2.iobyxmoadg(this);
        iobyxmoadgVarEablkybsjg3.iobyxmoadg(this);
        iobyxmoadgVarEablkybsjg4.iobyxmoadg(this);
        iobyxmoadgVarEablkybsjg5.iobyxmoadg(this);
        if (iobyxmoadgVarBtonecajqb == iobyxmoadgVar) {
            this.f53963wflxmlrfwp.iobyxmoadg(this);
            this.f53958ojitshcjhn.iobyxmoadg(this);
        }
    }

    private void btonecajqb() {
        float f13;
        float f14;
        double d13;
        float fSin;
        float f15;
        float f16;
        float f17;
        float fFloatValue = ((Float) this.f53949btonecajqb.nufgyqmvbu()).floatValue();
        l7.iobyxmoadg iobyxmoadgVar = this.f53950draadjrbmk;
        double radians = Math.toRadians((iobyxmoadgVar == null ? 0.0d : ((Float) iobyxmoadgVar.nufgyqmvbu()).floatValue()) - 90.0d);
        double d14 = fFloatValue;
        float f18 = (float) (6.283185307179586d / d14);
        if (this.f53951dxjokdxxww) {
            f18 *= -1.0f;
        }
        float f19 = f18 / 2.0f;
        float f23 = fFloatValue - ((int) fFloatValue);
        if (f23 != 0.0f) {
            radians += (double) ((1.0f - f23) * f19);
        }
        float fFloatValue2 = ((Float) this.f53948agtfadlqog.nufgyqmvbu()).floatValue();
        float fFloatValue3 = ((Float) this.f53963wflxmlrfwp.nufgyqmvbu()).floatValue();
        l7.iobyxmoadg iobyxmoadgVar2 = this.f53958ojitshcjhn;
        float fFloatValue4 = iobyxmoadgVar2 != null ? ((Float) iobyxmoadgVar2.nufgyqmvbu()).floatValue() / 100.0f : 0.0f;
        l7.iobyxmoadg iobyxmoadgVar3 = this.f53961rgvfuqvkyq;
        float fFloatValue5 = iobyxmoadgVar3 != null ? ((Float) iobyxmoadgVar3.nufgyqmvbu()).floatValue() / 100.0f : 0.0f;
        if (f23 != 0.0f) {
            f15 = ((fFloatValue2 - fFloatValue3) * f23) + fFloatValue3;
            double d15 = f15;
            float fCos = (float) (d15 * Math.cos(radians));
            fSin = (float) (d15 * Math.sin(radians));
            this.f53955iobyxmoadg.moveTo(fCos, fSin);
            d13 = radians + ((double) ((f18 * f23) / 2.0f));
            f13 = fCos;
            f14 = f19;
        } else {
            double d16 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d16);
            float fSin2 = (float) (d16 * Math.sin(radians));
            this.f53955iobyxmoadg.moveTo(fCos2, fSin2);
            f13 = fCos2;
            f14 = f19;
            d13 = radians + ((double) f14);
            fSin = fSin2;
            f15 = 0.0f;
        }
        double dCeil = Math.ceil(d14) * 2.0d;
        int i13 = 0;
        float f24 = f14;
        float f25 = f13;
        boolean z13 = false;
        while (true) {
            double d17 = i13;
            if (d17 >= dCeil) {
                PointF pointF = (PointF) this.f53953gtknphoqwx.nufgyqmvbu();
                this.f53955iobyxmoadg.offset(pointF.x, pointF.y);
                this.f53955iobyxmoadg.close();
                return;
            }
            float f26 = z13 ? fFloatValue2 : fFloatValue3;
            float f27 = (f15 == 0.0f || d17 != dCeil - 2.0d) ? f24 : (f18 * f23) / 2.0f;
            if (f15 == 0.0f || d17 != dCeil - 1.0d) {
                f15 = f26;
            }
            double d18 = f15;
            double d19 = dCeil;
            float fCos3 = (float) (d18 * Math.cos(d13));
            float fSin3 = (float) (d18 * Math.sin(d13));
            if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                this.f53955iobyxmoadg.lineTo(fCos3, fSin3);
                f16 = fFloatValue4;
                f17 = fFloatValue5;
            } else {
                f16 = fFloatValue4;
                double dAtan2 = (float) (Math.atan2(fSin, f25) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin4 = (float) Math.sin(dAtan2);
                f17 = fFloatValue5;
                double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin5 = (float) Math.sin(dAtan3);
                float f28 = z13 ? f16 : f17;
                float f29 = z13 ? f17 : f16;
                float f33 = (z13 ? fFloatValue3 : fFloatValue2) * f28 * 0.47829f;
                float f34 = fCos4 * f33;
                float f35 = f33 * fSin4;
                float f36 = (z13 ? fFloatValue2 : fFloatValue3) * f29 * 0.47829f;
                float f37 = fCos5 * f36;
                float f38 = f36 * fSin5;
                if (f23 != 0.0f) {
                    if (i13 == 0) {
                        f34 *= f23;
                        f35 *= f23;
                    } else if (d17 == d19 - 1.0d) {
                        f37 *= f23;
                        f38 *= f23;
                    }
                }
                this.f53955iobyxmoadg.cubicTo(f25 - f34, fSin - f35, fCos3 + f37, fSin3 + f38, fCos3, fSin3);
            }
            d13 += (double) f27;
            z13 = !z13;
            i13++;
            f25 = fCos3;
            fSin = fSin3;
            fFloatValue5 = f17;
            fFloatValue4 = f16;
            f15 = f15;
            f18 = f18;
            dCeil = d19;
        }
    }

    private void gtknphoqwx() {
        this.f53959oxmwwwfdhm = false;
        this.f53954gxszxtbevo.invalidateSelf();
    }

    private void lqeggnwhkg() {
        double d13;
        float f13;
        agtfadlqog agtfadlqogVar;
        agtfadlqog agtfadlqogVar2 = this;
        int iFloor = (int) Math.floor(((Float) agtfadlqogVar2.f53949btonecajqb.nufgyqmvbu()).floatValue());
        l7.iobyxmoadg iobyxmoadgVar = agtfadlqogVar2.f53950draadjrbmk;
        double radians = Math.toRadians((iobyxmoadgVar == null ? 0.0d : ((Float) iobyxmoadgVar.nufgyqmvbu()).floatValue()) - 90.0d);
        double d14 = iFloor;
        float fFloatValue = ((Float) agtfadlqogVar2.f53961rgvfuqvkyq.nufgyqmvbu()).floatValue() / 100.0f;
        float fFloatValue2 = ((Float) agtfadlqogVar2.f53948agtfadlqog.nufgyqmvbu()).floatValue();
        double d15 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d15);
        float fSin = (float) (Math.sin(radians) * d15);
        agtfadlqogVar2.f53955iobyxmoadg.moveTo(fCos, fSin);
        double d16 = (float) (6.283185307179586d / d14);
        double dCeil = Math.ceil(d14);
        double d17 = radians + d16;
        int i13 = 0;
        while (true) {
            double d18 = i13;
            if (d18 >= dCeil) {
                agtfadlqog agtfadlqogVar3 = agtfadlqogVar2;
                PointF pointF = (PointF) agtfadlqogVar3.f53953gtknphoqwx.nufgyqmvbu();
                agtfadlqogVar3.f53955iobyxmoadg.offset(pointF.x, pointF.y);
                agtfadlqogVar3.f53955iobyxmoadg.close();
                return;
            }
            int i14 = i13;
            float fCos2 = (float) (d15 * Math.cos(d17));
            double d19 = d16;
            float fSin2 = (float) (d15 * Math.sin(d17));
            if (fFloatValue != 0.0f) {
                d13 = d15;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                f13 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f14 = fFloatValue2 * fFloatValue * 0.25f;
                float f15 = fCos3 * f14;
                float f16 = fSin3 * f14;
                float fCos4 = ((float) Math.cos(dAtan3)) * f14;
                float fSin4 = f14 * ((float) Math.sin(dAtan3));
                if (d18 == dCeil - 1.0d) {
                    agtfadlqogVar = this;
                    agtfadlqogVar.f53965zoijcleaow.reset();
                    agtfadlqogVar.f53965zoijcleaow.moveTo(fCos, fSin);
                    float f17 = fCos - f15;
                    float f18 = fSin - f16;
                    float f19 = fCos2 + fCos4;
                    float f23 = fSin4 + f13;
                    agtfadlqogVar.f53965zoijcleaow.cubicTo(f17, f18, f19, f23, fCos2, f13);
                    agtfadlqogVar.f53960ppxfxbqfkf.setPath(agtfadlqogVar.f53965zoijcleaow, false);
                    PathMeasure pathMeasure = agtfadlqogVar.f53960ppxfxbqfkf;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, agtfadlqogVar.f53964wkgbmnqykc, null);
                    Path path = agtfadlqogVar.f53955iobyxmoadg;
                    float[] fArr = agtfadlqogVar.f53964wkgbmnqykc;
                    path.cubicTo(f17, f18, f19, f23, fArr[0], fArr[1]);
                } else {
                    agtfadlqogVar = this;
                    agtfadlqogVar.f53955iobyxmoadg.cubicTo(fCos - f15, fSin - f16, fCos2 + fCos4, f13 + fSin4, fCos2, f13);
                }
            } else {
                d13 = d15;
                f13 = fSin2;
                agtfadlqogVar = agtfadlqogVar2;
                if (d18 != dCeil - 1.0d) {
                    agtfadlqogVar.f53955iobyxmoadg.lineTo(fCos2, f13);
                }
                fSin = f13;
                fCos = fCos2;
                d16 = d19;
                i13 = i14 + 1;
                agtfadlqogVar2 = agtfadlqogVar;
                d15 = d13;
            }
            d17 += d19;
            fSin = f13;
            fCos = fCos2;
            d16 = d19;
            i13 = i14 + 1;
            agtfadlqogVar2 = agtfadlqogVar;
            d15 = d13;
        }
    }

    @Override // k7.ppxfxbqfkf
    public String getName() {
        return this.f53952eablkybsjg;
    }

    @Override // k7.wflxmlrfwp
    public Path gxszxtbevo() {
        if (this.f53959oxmwwwfdhm) {
            return this.f53955iobyxmoadg;
        }
        this.f53955iobyxmoadg.reset();
        if (this.f53957nufgyqmvbu) {
            this.f53959oxmwwwfdhm = true;
            return this.f53955iobyxmoadg;
        }
        int i13 = iobyxmoadg.f53966iobyxmoadg[this.f53956lqeggnwhkg.ordinal()];
        if (i13 == 1) {
            btonecajqb();
        } else if (i13 == 2) {
            lqeggnwhkg();
        }
        this.f53955iobyxmoadg.close();
        this.f53962vdvldrhtss.zoijcleaow(this.f53955iobyxmoadg);
        this.f53959oxmwwwfdhm = true;
        return this.f53955iobyxmoadg;
    }

    @Override // l7.iobyxmoadg.zoijcleaow
    public void iobyxmoadg() {
        gtknphoqwx();
    }

    @Override // o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        l7.iobyxmoadg iobyxmoadgVar;
        l7.iobyxmoadg iobyxmoadgVar2;
        if (obj == dsvhmnatus.f20372iwizpuwonk) {
            this.f53949btonecajqb.ojitshcjhn(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20359cqumvgiudr) {
            this.f53950draadjrbmk.ojitshcjhn(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20355agtfadlqog) {
            this.f53953gtknphoqwx.ojitshcjhn(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20364esjtqupxsv && (iobyxmoadgVar2 = this.f53963wflxmlrfwp) != null) {
            iobyxmoadgVar2.ojitshcjhn(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20376lereixgezr) {
            this.f53948agtfadlqog.ojitshcjhn(ppxfxbqfkfVar);
            return;
        }
        if (obj == dsvhmnatus.f20383pmvmpeiblj && (iobyxmoadgVar = this.f53958ojitshcjhn) != null) {
            iobyxmoadgVar.ojitshcjhn(ppxfxbqfkfVar);
        } else if (obj == dsvhmnatus.f20396zynmafqrjb) {
            this.f53961rgvfuqvkyq.ojitshcjhn(ppxfxbqfkfVar);
        }
    }

    @Override // o7.gxszxtbevo
    public void ppxfxbqfkf(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
        v7.dxjokdxxww.gtknphoqwx(eablkybsjgVar, i13, list, eablkybsjgVar2, this);
    }

    @Override // k7.ppxfxbqfkf
    public void zoijcleaow(List list, List list2) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) list.get(i13);
            if (ppxfxbqfkfVar instanceof yggfygwlhe) {
                yggfygwlhe yggfygwlheVar = (yggfygwlhe) ppxfxbqfkfVar;
                if (yggfygwlheVar.gtknphoqwx() == q7.zdlpuopuiu.iobyxmoadg.SIMULTANEOUSLY) {
                    this.f53962vdvldrhtss.iobyxmoadg(yggfygwlheVar);
                    yggfygwlheVar.ppxfxbqfkf(this);
                }
            }
        }
    }
}
