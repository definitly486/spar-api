package i1;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final float f41659dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f41660eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final float f41661gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f41662iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final float f41663lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final float f41664nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f41665ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f41666wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f41667zoijcleaow;

    iobyxmoadg(float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f23, float f24) {
        this.f41662iobyxmoadg = f13;
        this.f41667zoijcleaow = f14;
        this.f41665ppxfxbqfkf = f15;
        this.f41666wkgbmnqykc = f16;
        this.f41660eablkybsjg = f17;
        this.f41661gxszxtbevo = f18;
        this.f41663lqeggnwhkg = f19;
        this.f41664nufgyqmvbu = f23;
        this.f41659dxjokdxxww = f24;
    }

    static int agtfadlqog(float f13, float f14, float f15, draadjrbmk draadjrbmkVar) {
        if (f14 < 1.0d || Math.round(f15) <= 0.0d || Math.round(f15) >= 100.0d) {
            return zoijcleaow.iobyxmoadg(f15);
        }
        float fMin = f13 < 0.0f ? 0.0f : Math.min(360.0f, f13);
        iobyxmoadg iobyxmoadgVar = null;
        boolean z13 = true;
        float f16 = 0.0f;
        float f17 = f14;
        while (Math.abs(f16 - f14) >= 0.4f) {
            iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaow(fMin, f17, f15);
            if (!z13) {
                if (iobyxmoadgVarZoijcleaow == null) {
                    f14 = f17;
                } else {
                    f16 = f17;
                    iobyxmoadgVar = iobyxmoadgVarZoijcleaow;
                }
                f17 = ((f14 - f16) / 2.0f) + f16;
            } else {
                if (iobyxmoadgVarZoijcleaow != null) {
                    return iobyxmoadgVarZoijcleaow.ojitshcjhn(draadjrbmkVar);
                }
                f17 = ((f14 - f16) / 2.0f) + f16;
                z13 = false;
            }
        }
        return iobyxmoadgVar == null ? zoijcleaow.iobyxmoadg(f15) : iobyxmoadgVar.ojitshcjhn(draadjrbmkVar);
    }

    private static iobyxmoadg eablkybsjg(float f13, float f14, float f15) {
        return gxszxtbevo(f13, f14, f15, draadjrbmk.f41632gtknphoqwx);
    }

    private static iobyxmoadg gxszxtbevo(float f13, float f14, float f15, draadjrbmk draadjrbmkVar) {
        double d13 = ((double) f13) / 100.0d;
        float fZoijcleaow = (4.0f / draadjrbmkVar.zoijcleaow()) * ((float) Math.sqrt(d13)) * (draadjrbmkVar.iobyxmoadg() + 4.0f) * draadjrbmkVar.wkgbmnqykc();
        float fWkgbmnqykc = f14 * draadjrbmkVar.wkgbmnqykc();
        float fSqrt = ((float) Math.sqrt(((f14 / ((float) Math.sqrt(d13))) * draadjrbmkVar.zoijcleaow()) / (draadjrbmkVar.iobyxmoadg() + 4.0f))) * 50.0f;
        float f16 = (1.7f * f13) / ((0.007f * f13) + 1.0f);
        float fLog = ((float) Math.log((((double) fWkgbmnqykc) * 0.0228d) + 1.0d)) * 43.85965f;
        double d14 = (3.1415927f * f15) / 180.0f;
        return new iobyxmoadg(f15, f14, f13, fZoijcleaow, fWkgbmnqykc, fSqrt, f16, fLog * ((float) Math.cos(d14)), fLog * ((float) Math.sin(d14)));
    }

    static iobyxmoadg ppxfxbqfkf(int i13) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        wkgbmnqykc(i13, draadjrbmk.f41632gtknphoqwx, fArr, fArr2);
        return new iobyxmoadg(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static int wflxmlrfwp(float f13, float f14, float f15) {
        return agtfadlqog(f13, f14, f15, draadjrbmk.f41632gtknphoqwx);
    }

    static void wkgbmnqykc(int i13, draadjrbmk draadjrbmkVar, float[] fArr, float[] fArr2) {
        zoijcleaow.gxszxtbevo(i13, fArr2);
        float[][] fArr3 = zoijcleaow.f41683iobyxmoadg;
        float f13 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f14 = fArr4[0] * f13;
        float f15 = fArr2[1];
        float f16 = f14 + (fArr4[1] * f15);
        float f17 = fArr2[2];
        float f18 = f16 + (fArr4[2] * f17);
        float[] fArr5 = fArr3[1];
        float f19 = (fArr5[0] * f13) + (fArr5[1] * f15) + (fArr5[2] * f17);
        float[] fArr6 = fArr3[2];
        float f23 = (f13 * fArr6[0]) + (f15 * fArr6[1]) + (f17 * fArr6[2]);
        float f24 = draadjrbmkVar.dxjokdxxww()[0] * f18;
        float f25 = draadjrbmkVar.dxjokdxxww()[1] * f19;
        float f26 = draadjrbmkVar.dxjokdxxww()[2] * f23;
        float fPow = (float) Math.pow(((double) (draadjrbmkVar.ppxfxbqfkf() * Math.abs(f24))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (draadjrbmkVar.ppxfxbqfkf() * Math.abs(f25))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (draadjrbmkVar.ppxfxbqfkf() * Math.abs(f26))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f24) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f25) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f26) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d13 = fSignum3;
        float f27 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d13)) / 11.0f;
        float f28 = ((float) (((double) (fSignum + fSignum2)) - (d13 * 2.0d))) / 9.0f;
        float f29 = fSignum2 * 20.0f;
        float f33 = (((fSignum * 20.0f) + f29) + (21.0f * fSignum3)) / 20.0f;
        float f34 = (((fSignum * 40.0f) + f29) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f28, f27)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f35 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f34 * draadjrbmkVar.gxszxtbevo()) / draadjrbmkVar.iobyxmoadg(), draadjrbmkVar.zoijcleaow() * draadjrbmkVar.btonecajqb())) * 100.0f;
        float fZoijcleaow = (4.0f / draadjrbmkVar.zoijcleaow()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (draadjrbmkVar.iobyxmoadg() + 4.0f) * draadjrbmkVar.wkgbmnqykc();
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, draadjrbmkVar.eablkybsjg()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * draadjrbmkVar.lqeggnwhkg()) * draadjrbmkVar.nufgyqmvbu()) * ((float) Math.sqrt((f27 * f27) + (f28 * f28)))) / (f33 + 0.305f), 0.9d));
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float fWkgbmnqykc = draadjrbmkVar.wkgbmnqykc() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((fPow5 * draadjrbmkVar.zoijcleaow()) / (draadjrbmkVar.iobyxmoadg() + 4.0f))) * 50.0f;
        float f36 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fWkgbmnqykc) + 1.0f)) * 43.85965f;
        double d14 = f35;
        float fCos = ((float) Math.cos(d14)) * fLog;
        float fSin = fLog * ((float) Math.sin(d14));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fZoijcleaow;
            fArr[2] = fWkgbmnqykc;
            fArr[3] = fSqrt2;
            fArr[4] = f36;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    private static iobyxmoadg zoijcleaow(float f13, float f14, float f15) {
        float f16 = 100.0f;
        float f17 = 1000.0f;
        float f18 = 0.0f;
        iobyxmoadg iobyxmoadgVar = null;
        float f19 = 1000.0f;
        while (Math.abs(f18 - f16) > 0.01f) {
            float f23 = ((f16 - f18) / 2.0f) + f18;
            int iRgvfuqvkyq = eablkybsjg(f23, f14, f13).rgvfuqvkyq();
            float fZoijcleaow = zoijcleaow.zoijcleaow(iRgvfuqvkyq);
            float fAbs = Math.abs(f15 - fZoijcleaow);
            if (fAbs < 0.2f) {
                iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf(iRgvfuqvkyq);
                float fIobyxmoadg = iobyxmoadgVarPpxfxbqfkf.iobyxmoadg(eablkybsjg(iobyxmoadgVarPpxfxbqfkf.gtknphoqwx(), iobyxmoadgVarPpxfxbqfkf.dxjokdxxww(), f13));
                if (fIobyxmoadg <= 1.0f) {
                    iobyxmoadgVar = iobyxmoadgVarPpxfxbqfkf;
                    f17 = fAbs;
                    f19 = fIobyxmoadg;
                }
            }
            if (f17 == 0.0f && f19 == 0.0f) {
                break;
            }
            if (fZoijcleaow < f15) {
                f18 = f23;
            } else {
                f16 = f23;
            }
        }
        return iobyxmoadgVar;
    }

    float btonecajqb() {
        return this.f41662iobyxmoadg;
    }

    float draadjrbmk() {
        return this.f41663lqeggnwhkg;
    }

    float dxjokdxxww() {
        return this.f41667zoijcleaow;
    }

    float gtknphoqwx() {
        return this.f41665ppxfxbqfkf;
    }

    float iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        float fDraadjrbmk = draadjrbmk() - iobyxmoadgVar.draadjrbmk();
        float fLqeggnwhkg = lqeggnwhkg() - iobyxmoadgVar.lqeggnwhkg();
        float fNufgyqmvbu = nufgyqmvbu() - iobyxmoadgVar.nufgyqmvbu();
        return (float) (Math.pow(Math.sqrt((fDraadjrbmk * fDraadjrbmk) + (fLqeggnwhkg * fLqeggnwhkg) + (fNufgyqmvbu * fNufgyqmvbu)), 0.63d) * 1.41d);
    }

    float lqeggnwhkg() {
        return this.f41664nufgyqmvbu;
    }

    float nufgyqmvbu() {
        return this.f41659dxjokdxxww;
    }

    int ojitshcjhn(draadjrbmk draadjrbmkVar) {
        float fPow = (float) Math.pow(((double) ((((double) dxjokdxxww()) == 0.0d || ((double) gtknphoqwx()) == 0.0d) ? 0.0f : dxjokdxxww() / ((float) Math.sqrt(((double) gtknphoqwx()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, draadjrbmkVar.eablkybsjg()), 0.73d), 1.1111111111111112d);
        double dBtonecajqb = (btonecajqb() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dBtonecajqb) + 3.8d)) * 0.25f;
        float fIobyxmoadg = draadjrbmkVar.iobyxmoadg() * ((float) Math.pow(((double) gtknphoqwx()) / 100.0d, (1.0d / ((double) draadjrbmkVar.zoijcleaow())) / ((double) draadjrbmkVar.btonecajqb())));
        float fLqeggnwhkg = fCos * 3846.1538f * draadjrbmkVar.lqeggnwhkg() * draadjrbmkVar.nufgyqmvbu();
        float fGxszxtbevo = fIobyxmoadg / draadjrbmkVar.gxszxtbevo();
        float fSin = (float) Math.sin(dBtonecajqb);
        float fCos2 = (float) Math.cos(dBtonecajqb);
        float f13 = (((0.305f + fGxszxtbevo) * 23.0f) * fPow) / (((fLqeggnwhkg * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f14 = fCos2 * f13;
        float f15 = f13 * fSin;
        float f16 = fGxszxtbevo * 460.0f;
        float f17 = (((451.0f * f14) + f16) + (288.0f * f15)) / 1403.0f;
        float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
        float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
        float fSignum = Math.signum(f17) * (100.0f / draadjrbmkVar.ppxfxbqfkf()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f18) * (100.0f / draadjrbmkVar.ppxfxbqfkf()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f19) * (100.0f / draadjrbmkVar.ppxfxbqfkf()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19)))), 2.380952380952381d));
        float f23 = fSignum / draadjrbmkVar.dxjokdxxww()[0];
        float f24 = fSignum2 / draadjrbmkVar.dxjokdxxww()[1];
        float f25 = fSignum3 / draadjrbmkVar.dxjokdxxww()[2];
        float[][] fArr = zoijcleaow.f41686zoijcleaow;
        float[] fArr2 = fArr[0];
        float f26 = (fArr2[0] * f23) + (fArr2[1] * f24) + (fArr2[2] * f25);
        float[] fArr3 = fArr[1];
        float f27 = (fArr3[0] * f23) + (fArr3[1] * f24) + (fArr3[2] * f25);
        float[] fArr4 = fArr[2];
        return j1.ppxfxbqfkf.zoijcleaow(f26, f27, (f23 * fArr4[0]) + (f24 * fArr4[1]) + (f25 * fArr4[2]));
    }

    int rgvfuqvkyq() {
        return ojitshcjhn(draadjrbmk.f41632gtknphoqwx);
    }
}
