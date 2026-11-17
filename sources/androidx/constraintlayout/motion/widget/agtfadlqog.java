package androidx.constraintlayout.motion.widget;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
class agtfadlqog implements Comparable {

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    static String[] f7661hkdspvbjdz = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    int f7662cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    float f7663cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    float f7664esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    double[] f7665hcddaimhww;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    float f7666iozdgvuglv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    float f7668iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    double[] f7669jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    float f7670jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    float f7671lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    draadjrbmk f7672lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    int f7673pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    float f7674pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    LinkedHashMap f7675wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    int f7676yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    int f7678ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    a1.ppxfxbqfkf f7679zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    int f7677yggfygwlhe = 0;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    float f7680zynmafqrjb = Float.NaN;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    float f7667istkbnxepw = Float.NaN;

    agtfadlqog() {
        int i13 = ppxfxbqfkf.f7921gxszxtbevo;
        this.f7662cdpycssgdh = i13;
        this.f7676yadqdtsiqt = i13;
        this.f7666iozdgvuglv = Float.NaN;
        this.f7672lmojexxdyd = null;
        this.f7675wwaezpbzkn = new LinkedHashMap();
        this.f7678ylkuphrtab = 0;
        this.f7665hcddaimhww = new double[18];
        this.f7669jpowsppfya = new double[18];
    }

    private boolean ppxfxbqfkf(float f13, float f14) {
        if (Float.isNaN(f13) || Float.isNaN(f14)) {
            return Float.isNaN(f13) != Float.isNaN(f14);
        }
        return Math.abs(f13 - f14) > 1.0E-6f;
    }

    void agtfadlqog(lqeggnwhkg lqeggnwhkgVar, agtfadlqog agtfadlqogVar, agtfadlqog agtfadlqogVar2) {
        float f13 = lqeggnwhkgVar.f7923iobyxmoadg / 100.0f;
        this.f7670jyumaefscl = f13;
        this.f7677yggfygwlhe = lqeggnwhkgVar.f7826btonecajqb;
        float f14 = Float.isNaN(lqeggnwhkgVar.f7829gtknphoqwx) ? f13 : lqeggnwhkgVar.f7829gtknphoqwx;
        float f15 = Float.isNaN(lqeggnwhkgVar.f7827draadjrbmk) ? f13 : lqeggnwhkgVar.f7827draadjrbmk;
        float f16 = agtfadlqogVar2.f7671lereixgezr - agtfadlqogVar.f7671lereixgezr;
        float f17 = agtfadlqogVar2.f7674pmvmpeiblj - agtfadlqogVar.f7674pmvmpeiblj;
        this.f7668iwizpuwonk = this.f7670jyumaefscl;
        if (!Float.isNaN(lqeggnwhkgVar.f7836wflxmlrfwp)) {
            f13 = lqeggnwhkgVar.f7836wflxmlrfwp;
        }
        float f18 = agtfadlqogVar.f7663cqumvgiudr;
        float f19 = agtfadlqogVar.f7671lereixgezr;
        float f23 = agtfadlqogVar.f7664esjtqupxsv;
        float f24 = agtfadlqogVar.f7674pmvmpeiblj;
        float f25 = (agtfadlqogVar2.f7663cqumvgiudr + (agtfadlqogVar2.f7671lereixgezr / 2.0f)) - ((f19 / 2.0f) + f18);
        float f26 = (agtfadlqogVar2.f7664esjtqupxsv + (agtfadlqogVar2.f7674pmvmpeiblj / 2.0f)) - ((f24 / 2.0f) + f23);
        float f27 = f25 * f13;
        float f28 = f16 * f14;
        float f29 = f28 / 2.0f;
        this.f7663cqumvgiudr = (int) ((f18 + f27) - f29);
        float f33 = f13 * f26;
        float f34 = f17 * f15;
        float f35 = f34 / 2.0f;
        this.f7664esjtqupxsv = (int) ((f23 + f33) - f35);
        this.f7671lereixgezr = (int) (f19 + f28);
        this.f7674pmvmpeiblj = (int) (f24 + f34);
        float f36 = Float.isNaN(lqeggnwhkgVar.f7825agtfadlqog) ? 0.0f : lqeggnwhkgVar.f7825agtfadlqog;
        this.f7678ylkuphrtab = 1;
        float f37 = (int) ((agtfadlqogVar.f7663cqumvgiudr + f27) - f29);
        float f38 = (int) ((agtfadlqogVar.f7664esjtqupxsv + f33) - f35);
        this.f7663cqumvgiudr = f37 + ((-f26) * f36);
        this.f7664esjtqupxsv = f38 + (f25 * f36);
        this.f7676yadqdtsiqt = this.f7676yadqdtsiqt;
        this.f7679zdlpuopuiu = a1.ppxfxbqfkf.ppxfxbqfkf(lqeggnwhkgVar.f7831nufgyqmvbu);
        this.f7662cdpycssgdh = lqeggnwhkgVar.f7828dxjokdxxww;
    }

    void btonecajqb(int[] iArr, double[] dArr, float[] fArr, int i13) {
        float f13 = this.f7663cqumvgiudr;
        float fCos = this.f7664esjtqupxsv;
        float f14 = this.f7671lereixgezr;
        float f15 = this.f7674pmvmpeiblj;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            float f16 = (float) dArr[i14];
            int i15 = iArr[i14];
            if (i15 == 1) {
                f13 = f16;
            } else if (i15 == 2) {
                fCos = f16;
            } else if (i15 == 3) {
                f14 = f16;
            } else if (i15 == 4) {
                f15 = f16;
            }
        }
        draadjrbmk draadjrbmkVar = this.f7672lmojexxdyd;
        if (draadjrbmkVar != null) {
            float fBtonecajqb = draadjrbmkVar.btonecajqb();
            float fGtknphoqwx = this.f7672lmojexxdyd.gtknphoqwx();
            double d13 = f13;
            double d14 = fCos;
            float fSin = (float) ((((double) fBtonecajqb) + (Math.sin(d14) * d13)) - ((double) (f14 / 2.0f)));
            fCos = (float) ((((double) fGtknphoqwx) - (d13 * Math.cos(d14))) - ((double) (f15 / 2.0f)));
            f13 = fSin;
        }
        float f17 = f14 + f13;
        float f18 = f15 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i13] = f13 + 0.0f;
        fArr[i13 + 1] = fCos + 0.0f;
        fArr[i13 + 2] = f17 + 0.0f;
        fArr[i13 + 3] = fCos + 0.0f;
        fArr[i13 + 4] = f17 + 0.0f;
        fArr[i13 + 5] = f18 + 0.0f;
        fArr[i13 + 6] = f13 + 0.0f;
        fArr[i13 + 7] = f18 + 0.0f;
    }

    void draadjrbmk(lqeggnwhkg lqeggnwhkgVar, agtfadlqog agtfadlqogVar, agtfadlqog agtfadlqogVar2) {
        float f13 = lqeggnwhkgVar.f7923iobyxmoadg / 100.0f;
        this.f7670jyumaefscl = f13;
        this.f7677yggfygwlhe = lqeggnwhkgVar.f7826btonecajqb;
        float f14 = Float.isNaN(lqeggnwhkgVar.f7829gtknphoqwx) ? f13 : lqeggnwhkgVar.f7829gtknphoqwx;
        float f15 = Float.isNaN(lqeggnwhkgVar.f7827draadjrbmk) ? f13 : lqeggnwhkgVar.f7827draadjrbmk;
        float f16 = agtfadlqogVar2.f7671lereixgezr;
        float f17 = agtfadlqogVar.f7671lereixgezr;
        float f18 = f16 - f17;
        float f19 = agtfadlqogVar2.f7674pmvmpeiblj;
        float f23 = agtfadlqogVar.f7674pmvmpeiblj;
        float f24 = f19 - f23;
        this.f7668iwizpuwonk = this.f7670jyumaefscl;
        float f25 = agtfadlqogVar.f7663cqumvgiudr;
        float f26 = (f17 / 2.0f) + f25;
        float f27 = agtfadlqogVar.f7664esjtqupxsv;
        float f28 = f27 + (f23 / 2.0f);
        float f29 = agtfadlqogVar2.f7663cqumvgiudr + (f16 / 2.0f);
        float f33 = agtfadlqogVar2.f7664esjtqupxsv + (f19 / 2.0f);
        if (f26 > f29) {
            f26 = f29;
            f29 = f26;
        }
        if (f28 <= f33) {
            f28 = f33;
            f33 = f28;
        }
        float f34 = f29 - f26;
        float f35 = f28 - f33;
        float f36 = f18 * f14;
        float f37 = f36 / 2.0f;
        this.f7663cqumvgiudr = (int) ((f25 + (f34 * f13)) - f37);
        float f38 = f24 * f15;
        float f39 = f38 / 2.0f;
        this.f7664esjtqupxsv = (int) ((f27 + (f35 * f13)) - f39);
        this.f7671lereixgezr = (int) (f17 + f36);
        this.f7674pmvmpeiblj = (int) (f23 + f38);
        float f43 = Float.isNaN(lqeggnwhkgVar.f7836wflxmlrfwp) ? f13 : lqeggnwhkgVar.f7836wflxmlrfwp;
        float f44 = Float.isNaN(lqeggnwhkgVar.f7834rgvfuqvkyq) ? 0.0f : lqeggnwhkgVar.f7834rgvfuqvkyq;
        if (!Float.isNaN(lqeggnwhkgVar.f7825agtfadlqog)) {
            f13 = lqeggnwhkgVar.f7825agtfadlqog;
        }
        float f45 = Float.isNaN(lqeggnwhkgVar.f7832ojitshcjhn) ? 0.0f : lqeggnwhkgVar.f7832ojitshcjhn;
        this.f7678ylkuphrtab = 0;
        this.f7663cqumvgiudr = (int) (((agtfadlqogVar.f7663cqumvgiudr + (f43 * f34)) + (f45 * f35)) - f37);
        this.f7664esjtqupxsv = (int) (((agtfadlqogVar.f7664esjtqupxsv + (f34 * f44)) + (f35 * f13)) - f39);
        this.f7679zdlpuopuiu = a1.ppxfxbqfkf.ppxfxbqfkf(lqeggnwhkgVar.f7831nufgyqmvbu);
        this.f7662cdpycssgdh = lqeggnwhkgVar.f7828dxjokdxxww;
    }

    int dxjokdxxww(String str) {
        androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar = (androidx.constraintlayout.widget.iobyxmoadg) this.f7675wwaezpbzkn.get(str);
        if (iobyxmoadgVar == null) {
            return 0;
        }
        return iobyxmoadgVar.nufgyqmvbu();
    }

    void eablkybsjg(double[] dArr, int[] iArr) {
        float[] fArr = {this.f7668iwizpuwonk, this.f7663cqumvgiudr, this.f7664esjtqupxsv, this.f7671lereixgezr, this.f7674pmvmpeiblj, this.f7680zynmafqrjb};
        int i13 = 0;
        for (int i14 : iArr) {
            if (i14 < 6) {
                dArr[i13] = fArr[i14];
                i13++;
            }
        }
    }

    boolean gtknphoqwx(String str) {
        return this.f7675wwaezpbzkn.containsKey(str);
    }

    void gxszxtbevo(double d13, int[] iArr, double[] dArr, float[] fArr, int i13) {
        float fSin = this.f7663cqumvgiudr;
        float fCos = this.f7664esjtqupxsv;
        float f13 = this.f7671lereixgezr;
        float f14 = this.f7674pmvmpeiblj;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            float f15 = (float) dArr[i14];
            int i15 = iArr[i14];
            if (i15 == 1) {
                fSin = f15;
            } else if (i15 == 2) {
                fCos = f15;
            } else if (i15 == 3) {
                f13 = f15;
            } else if (i15 == 4) {
                f14 = f15;
            }
        }
        draadjrbmk draadjrbmkVar = this.f7672lmojexxdyd;
        if (draadjrbmkVar != null) {
            float[] fArr2 = new float[2];
            draadjrbmkVar.dxjokdxxww(d13, fArr2, new float[2]);
            float f16 = fArr2[0];
            float f17 = fArr2[1];
            double d14 = f16;
            double d15 = fSin;
            double d16 = fCos;
            fSin = (float) ((d14 + (Math.sin(d16) * d15)) - ((double) (f13 / 2.0f)));
            fCos = (float) ((((double) f17) - (d15 * Math.cos(d16))) - ((double) (f14 / 2.0f)));
        }
        fArr[i13] = fSin + (f13 / 2.0f) + 0.0f;
        fArr[i13 + 1] = fCos + (f14 / 2.0f) + 0.0f;
    }

    public void iobyxmoadg(androidx.constraintlayout.widget.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        this.f7679zdlpuopuiu = a1.ppxfxbqfkf.ppxfxbqfkf(iobyxmoadgVar.f8175wkgbmnqykc.f8202wkgbmnqykc);
        androidx.constraintlayout.widget.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar.f8175wkgbmnqykc;
        this.f7662cdpycssgdh = ppxfxbqfkfVar.f8194eablkybsjg;
        this.f7676yadqdtsiqt = ppxfxbqfkfVar.f8203zoijcleaow;
        this.f7680zynmafqrjb = ppxfxbqfkfVar.f8193dxjokdxxww;
        this.f7677yggfygwlhe = ppxfxbqfkfVar.f8196gxszxtbevo;
        this.f7673pkzmftpjix = ppxfxbqfkfVar.f8200ppxfxbqfkf;
        this.f7667istkbnxepw = iobyxmoadgVar.f8174ppxfxbqfkf.f8204eablkybsjg;
        this.f7666iozdgvuglv = iobyxmoadgVar.f8169eablkybsjg.f8213cdpycssgdh;
        for (String str : iobyxmoadgVar.f8172lqeggnwhkg.keySet()) {
            androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar2 = (androidx.constraintlayout.widget.iobyxmoadg) iobyxmoadgVar.f8172lqeggnwhkg.get(str);
            if (iobyxmoadgVar2 != null && iobyxmoadgVar2.lqeggnwhkg()) {
                this.f7675wwaezpbzkn.put(str, iobyxmoadgVar2);
            }
        }
    }

    void kcexrzcfyt(float f13, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z13) {
        float f14;
        float f15;
        float f16 = this.f7663cqumvgiudr;
        float f17 = this.f7664esjtqupxsv;
        float f18 = this.f7671lereixgezr;
        float f19 = this.f7674pmvmpeiblj;
        if (iArr.length != 0 && this.f7665hcddaimhww.length <= iArr[iArr.length - 1]) {
            int i13 = iArr[iArr.length - 1] + 1;
            this.f7665hcddaimhww = new double[i13];
            this.f7669jpowsppfya = new double[i13];
        }
        Arrays.fill(this.f7665hcddaimhww, Double.NaN);
        for (int i14 = 0; i14 < iArr.length; i14++) {
            double[] dArr4 = this.f7665hcddaimhww;
            int i15 = iArr[i14];
            dArr4[i15] = dArr[i14];
            this.f7669jpowsppfya[i15] = dArr2[i14];
        }
        float f23 = Float.NaN;
        int i16 = 0;
        float f24 = 0.0f;
        float f25 = 0.0f;
        float f26 = 0.0f;
        float f27 = 0.0f;
        while (true) {
            double[] dArr5 = this.f7665hcddaimhww;
            if (i16 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i16]) && (dArr3 == null || dArr3[i16] == 0.0d)) {
                f15 = f23;
            } else {
                double d13 = dArr3 != null ? dArr3[i16] : 0.0d;
                if (!Double.isNaN(this.f7665hcddaimhww[i16])) {
                    d13 = this.f7665hcddaimhww[i16] + d13;
                }
                f15 = f23;
                float f28 = (float) d13;
                float f29 = (float) this.f7669jpowsppfya[i16];
                if (i16 == 1) {
                    f23 = f15;
                    f24 = f29;
                    f16 = f28;
                } else if (i16 == 2) {
                    f23 = f15;
                    f25 = f29;
                    f17 = f28;
                } else if (i16 == 3) {
                    f23 = f15;
                    f26 = f29;
                    f18 = f28;
                } else if (i16 == 4) {
                    f23 = f15;
                    f27 = f29;
                    f19 = f28;
                } else if (i16 == 5) {
                    f23 = f28;
                }
                i16++;
            }
            f23 = f15;
            i16++;
        }
        float f33 = f23;
        draadjrbmk draadjrbmkVar = this.f7672lmojexxdyd;
        if (draadjrbmkVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            draadjrbmkVar.dxjokdxxww(f13, fArr, fArr2);
            float f34 = fArr[0];
            float f35 = fArr[1];
            float f36 = fArr2[0];
            float f37 = fArr2[1];
            double d14 = f16;
            double d15 = f17;
            float fSin = (float) ((((double) f34) + (Math.sin(d15) * d14)) - ((double) (f18 / 2.0f)));
            f14 = f19;
            float fCos = (float) ((((double) f35) - (Math.cos(d15) * d14)) - ((double) (f19 / 2.0f)));
            double d16 = f24;
            double d17 = f25;
            float fSin2 = (float) (((double) f36) + (Math.sin(d15) * d16) + (Math.cos(d15) * d14 * d17));
            float fCos2 = (float) ((((double) f37) - (d16 * Math.cos(d15))) + (d14 * Math.sin(d15) * d17));
            if (dArr2.length >= 2) {
                dArr2[0] = fSin2;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f33)) {
                view.setRotation((float) (((double) f33) + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f16 = fSin;
            f17 = fCos;
        } else {
            f14 = f19;
            if (!Float.isNaN(f33)) {
                view.setRotation(f33 + ((float) Math.toDegrees(Math.atan2(f25 + (f27 / 2.0f), f24 + (f26 / 2.0f)))) + 0.0f);
            }
        }
        float f38 = f16 + 0.5f;
        int i17 = (int) f38;
        float f39 = f17 + 0.5f;
        int i18 = (int) f39;
        int i19 = (int) (f38 + f18);
        int i23 = (int) (f39 + f14);
        int i24 = i19 - i17;
        int i25 = i23 - i18;
        if (i24 != view.getMeasuredWidth() || i25 != view.getMeasuredHeight() || z13) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i24, 1073741824), View.MeasureSpec.makeMeasureSpec(i25, 1073741824));
        }
        view.layout(i17, i18, i19, i23);
    }

    void lqeggnwhkg(double d13, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f13 = this.f7663cqumvgiudr;
        float f14 = this.f7664esjtqupxsv;
        float f15 = this.f7671lereixgezr;
        float f16 = this.f7674pmvmpeiblj;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f23 = 0.0f;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            float f24 = (float) dArr[i13];
            float f25 = (float) dArr2[i13];
            int i14 = iArr[i13];
            if (i14 == 1) {
                f13 = f24;
                f17 = f25;
            } else if (i14 == 2) {
                f14 = f24;
                f19 = f25;
            } else if (i14 == 3) {
                f15 = f24;
                f18 = f25;
            } else if (i14 == 4) {
                f16 = f24;
                f23 = f25;
            }
        }
        float f26 = 2.0f;
        float f27 = (f18 / 2.0f) + f17;
        float fCos = (f23 / 2.0f) + f19;
        draadjrbmk draadjrbmkVar = this.f7672lmojexxdyd;
        if (draadjrbmkVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            draadjrbmkVar.dxjokdxxww(d13, fArr3, fArr4);
            float f28 = fArr3[0];
            float f29 = fArr3[1];
            float f33 = fArr4[0];
            float f34 = fArr4[1];
            double d14 = f13;
            double d15 = f14;
            float fSin = (float) ((((double) f28) + (Math.sin(d15) * d14)) - ((double) (f15 / 2.0f)));
            float fCos2 = (float) ((((double) f29) - (d14 * Math.cos(d15))) - ((double) (f16 / 2.0f)));
            double d16 = f17;
            double d17 = f19;
            float fSin2 = (float) (((double) f33) + (Math.sin(d15) * d16) + (Math.cos(d15) * d17));
            fCos = (float) ((((double) f34) - (d16 * Math.cos(d15))) + (Math.sin(d15) * d17));
            f27 = fSin2;
            f13 = fSin;
            f14 = fCos2;
            f26 = 2.0f;
        }
        fArr[0] = f13 + (f15 / f26) + 0.0f;
        fArr[1] = f14 + (f16 / f26) + 0.0f;
        fArr2[0] = f27;
        fArr2[1] = fCos;
    }

    int nufgyqmvbu(String str, double[] dArr, int i13) {
        androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar = (androidx.constraintlayout.widget.iobyxmoadg) this.f7675wwaezpbzkn.get(str);
        int i14 = 0;
        if (iobyxmoadgVar == null) {
            return 0;
        }
        if (iobyxmoadgVar.nufgyqmvbu() == 1) {
            dArr[i13] = iobyxmoadgVar.eablkybsjg();
            return 1;
        }
        int iNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu();
        float[] fArr = new float[iNufgyqmvbu];
        iobyxmoadgVar.gxszxtbevo(fArr);
        while (i14 < iNufgyqmvbu) {
            dArr[i13] = fArr[i14];
            i14++;
            i13++;
        }
        return iNufgyqmvbu;
    }

    void ojitshcjhn(int i13, int i14, lqeggnwhkg lqeggnwhkgVar, agtfadlqog agtfadlqogVar, agtfadlqog agtfadlqogVar2) {
        float fMin;
        float f13;
        float f14 = lqeggnwhkgVar.f7923iobyxmoadg / 100.0f;
        this.f7670jyumaefscl = f14;
        this.f7677yggfygwlhe = lqeggnwhkgVar.f7826btonecajqb;
        this.f7678ylkuphrtab = lqeggnwhkgVar.f7835vdvldrhtss;
        float f15 = Float.isNaN(lqeggnwhkgVar.f7829gtknphoqwx) ? f14 : lqeggnwhkgVar.f7829gtknphoqwx;
        float f16 = Float.isNaN(lqeggnwhkgVar.f7827draadjrbmk) ? f14 : lqeggnwhkgVar.f7827draadjrbmk;
        float f17 = agtfadlqogVar2.f7671lereixgezr;
        float f18 = agtfadlqogVar.f7671lereixgezr;
        float f19 = agtfadlqogVar2.f7674pmvmpeiblj;
        float f23 = agtfadlqogVar.f7674pmvmpeiblj;
        this.f7668iwizpuwonk = this.f7670jyumaefscl;
        this.f7671lereixgezr = (int) (f18 + ((f17 - f18) * f15));
        this.f7674pmvmpeiblj = (int) (f23 + ((f19 - f23) * f16));
        if (lqeggnwhkgVar.f7835vdvldrhtss != 2) {
            float f24 = Float.isNaN(lqeggnwhkgVar.f7836wflxmlrfwp) ? f14 : lqeggnwhkgVar.f7836wflxmlrfwp;
            float f25 = agtfadlqogVar2.f7663cqumvgiudr;
            float f26 = agtfadlqogVar.f7663cqumvgiudr;
            this.f7663cqumvgiudr = (f24 * (f25 - f26)) + f26;
            if (!Float.isNaN(lqeggnwhkgVar.f7825agtfadlqog)) {
                f14 = lqeggnwhkgVar.f7825agtfadlqog;
            }
            float f27 = agtfadlqogVar2.f7664esjtqupxsv;
            float f28 = agtfadlqogVar.f7664esjtqupxsv;
            this.f7664esjtqupxsv = (f14 * (f27 - f28)) + f28;
        } else {
            if (Float.isNaN(lqeggnwhkgVar.f7836wflxmlrfwp)) {
                float f29 = agtfadlqogVar2.f7663cqumvgiudr;
                float f33 = agtfadlqogVar.f7663cqumvgiudr;
                fMin = ((f29 - f33) * f14) + f33;
            } else {
                fMin = Math.min(f16, f15) * lqeggnwhkgVar.f7836wflxmlrfwp;
            }
            this.f7663cqumvgiudr = fMin;
            if (Float.isNaN(lqeggnwhkgVar.f7825agtfadlqog)) {
                float f34 = agtfadlqogVar2.f7664esjtqupxsv;
                float f35 = agtfadlqogVar.f7664esjtqupxsv;
                f13 = (f14 * (f34 - f35)) + f35;
            } else {
                f13 = lqeggnwhkgVar.f7825agtfadlqog;
            }
            this.f7664esjtqupxsv = f13;
        }
        this.f7676yadqdtsiqt = agtfadlqogVar.f7676yadqdtsiqt;
        this.f7679zdlpuopuiu = a1.ppxfxbqfkf.ppxfxbqfkf(lqeggnwhkgVar.f7831nufgyqmvbu);
        this.f7662cdpycssgdh = lqeggnwhkgVar.f7828dxjokdxxww;
    }

    void oxmwwwfdhm(float f13, float f14, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            float f19 = (float) dArr[i13];
            double d13 = dArr2[i13];
            int i14 = iArr[i13];
            if (i14 == 1) {
                f15 = f19;
            } else if (i14 == 2) {
                f17 = f19;
            } else if (i14 == 3) {
                f16 = f19;
            } else if (i14 == 4) {
                f18 = f19;
            }
        }
        float f23 = f15 - ((0.0f * f16) / 2.0f);
        float f24 = f17 - ((0.0f * f18) / 2.0f);
        fArr[0] = (f23 * (1.0f - f13)) + (((f16 * 1.0f) + f23) * f13) + 0.0f;
        fArr[1] = (f24 * (1.0f - f14)) + (((f18 * 1.0f) + f24) * f14) + 0.0f;
    }

    void rgvfuqvkyq(int i13, int i14, lqeggnwhkg lqeggnwhkgVar, agtfadlqog agtfadlqogVar, agtfadlqog agtfadlqogVar2) {
        float f13 = lqeggnwhkgVar.f7923iobyxmoadg / 100.0f;
        this.f7670jyumaefscl = f13;
        this.f7677yggfygwlhe = lqeggnwhkgVar.f7826btonecajqb;
        float f14 = Float.isNaN(lqeggnwhkgVar.f7829gtknphoqwx) ? f13 : lqeggnwhkgVar.f7829gtknphoqwx;
        float f15 = Float.isNaN(lqeggnwhkgVar.f7827draadjrbmk) ? f13 : lqeggnwhkgVar.f7827draadjrbmk;
        float f16 = agtfadlqogVar2.f7671lereixgezr;
        float f17 = agtfadlqogVar.f7671lereixgezr;
        float f18 = agtfadlqogVar2.f7674pmvmpeiblj;
        float f19 = agtfadlqogVar.f7674pmvmpeiblj;
        this.f7668iwizpuwonk = this.f7670jyumaefscl;
        float f23 = agtfadlqogVar.f7663cqumvgiudr;
        float f24 = agtfadlqogVar.f7664esjtqupxsv;
        float f25 = agtfadlqogVar2.f7663cqumvgiudr + (f16 / 2.0f);
        float f26 = agtfadlqogVar2.f7664esjtqupxsv + (f18 / 2.0f);
        float f27 = (f16 - f17) * f14;
        this.f7663cqumvgiudr = (int) ((f23 + ((f25 - ((f17 / 2.0f) + f23)) * f13)) - (f27 / 2.0f));
        float f28 = (f18 - f19) * f15;
        this.f7664esjtqupxsv = (int) ((f24 + ((f26 - (f24 + (f19 / 2.0f))) * f13)) - (f28 / 2.0f));
        this.f7671lereixgezr = (int) (f17 + f27);
        this.f7674pmvmpeiblj = (int) (f19 + f28);
        this.f7678ylkuphrtab = 2;
        if (!Float.isNaN(lqeggnwhkgVar.f7836wflxmlrfwp)) {
            this.f7663cqumvgiudr = (int) (lqeggnwhkgVar.f7836wflxmlrfwp * (i13 - ((int) this.f7671lereixgezr)));
        }
        if (!Float.isNaN(lqeggnwhkgVar.f7825agtfadlqog)) {
            this.f7664esjtqupxsv = (int) (lqeggnwhkgVar.f7825agtfadlqog * (i14 - ((int) this.f7674pmvmpeiblj)));
        }
        this.f7676yadqdtsiqt = this.f7676yadqdtsiqt;
        this.f7679zdlpuopuiu = a1.ppxfxbqfkf.ppxfxbqfkf(lqeggnwhkgVar.f7831nufgyqmvbu);
        this.f7662cdpycssgdh = lqeggnwhkgVar.f7828dxjokdxxww;
    }

    void vdvldrhtss(float f13, float f14, float f15, float f16) {
        this.f7663cqumvgiudr = f13;
        this.f7664esjtqupxsv = f14;
        this.f7671lereixgezr = f15;
        this.f7674pmvmpeiblj = f16;
    }

    void wflxmlrfwp(lqeggnwhkg lqeggnwhkgVar, agtfadlqog agtfadlqogVar, agtfadlqog agtfadlqogVar2) {
        float f13 = lqeggnwhkgVar.f7923iobyxmoadg / 100.0f;
        this.f7670jyumaefscl = f13;
        this.f7677yggfygwlhe = lqeggnwhkgVar.f7826btonecajqb;
        float f14 = Float.isNaN(lqeggnwhkgVar.f7829gtknphoqwx) ? f13 : lqeggnwhkgVar.f7829gtknphoqwx;
        float f15 = Float.isNaN(lqeggnwhkgVar.f7827draadjrbmk) ? f13 : lqeggnwhkgVar.f7827draadjrbmk;
        float f16 = agtfadlqogVar2.f7671lereixgezr;
        float f17 = agtfadlqogVar.f7671lereixgezr;
        float f18 = agtfadlqogVar2.f7674pmvmpeiblj;
        float f19 = agtfadlqogVar.f7674pmvmpeiblj;
        this.f7668iwizpuwonk = this.f7670jyumaefscl;
        float f23 = agtfadlqogVar.f7663cqumvgiudr;
        float f24 = agtfadlqogVar.f7664esjtqupxsv;
        float f25 = (agtfadlqogVar2.f7663cqumvgiudr + (f16 / 2.0f)) - ((f17 / 2.0f) + f23);
        float f26 = (agtfadlqogVar2.f7664esjtqupxsv + (f18 / 2.0f)) - (f24 + (f19 / 2.0f));
        float f27 = (f16 - f17) * f14;
        float f28 = f27 / 2.0f;
        this.f7663cqumvgiudr = (int) ((f23 + (f25 * f13)) - f28);
        float f29 = (f18 - f19) * f15;
        float f33 = f29 / 2.0f;
        this.f7664esjtqupxsv = (int) ((f24 + (f26 * f13)) - f33);
        this.f7671lereixgezr = (int) (f17 + f27);
        this.f7674pmvmpeiblj = (int) (f19 + f29);
        float f34 = Float.isNaN(lqeggnwhkgVar.f7836wflxmlrfwp) ? f13 : lqeggnwhkgVar.f7836wflxmlrfwp;
        float f35 = Float.isNaN(lqeggnwhkgVar.f7834rgvfuqvkyq) ? 0.0f : lqeggnwhkgVar.f7834rgvfuqvkyq;
        if (!Float.isNaN(lqeggnwhkgVar.f7825agtfadlqog)) {
            f13 = lqeggnwhkgVar.f7825agtfadlqog;
        }
        float f36 = Float.isNaN(lqeggnwhkgVar.f7832ojitshcjhn) ? 0.0f : lqeggnwhkgVar.f7832ojitshcjhn;
        this.f7678ylkuphrtab = 0;
        this.f7663cqumvgiudr = (int) (((agtfadlqogVar.f7663cqumvgiudr + (f34 * f25)) + (f36 * f26)) - f28);
        this.f7664esjtqupxsv = (int) (((agtfadlqogVar.f7664esjtqupxsv + (f25 * f35)) + (f26 * f13)) - f33);
        this.f7679zdlpuopuiu = a1.ppxfxbqfkf.ppxfxbqfkf(lqeggnwhkgVar.f7831nufgyqmvbu);
        this.f7662cdpycssgdh = lqeggnwhkgVar.f7828dxjokdxxww;
    }

    void wkgbmnqykc(agtfadlqog agtfadlqogVar, boolean[] zArr, String[] strArr, boolean z13) {
        boolean zPpxfxbqfkf = ppxfxbqfkf(this.f7663cqumvgiudr, agtfadlqogVar.f7663cqumvgiudr);
        boolean zPpxfxbqfkf2 = ppxfxbqfkf(this.f7664esjtqupxsv, agtfadlqogVar.f7664esjtqupxsv);
        zArr[0] = zArr[0] | ppxfxbqfkf(this.f7668iwizpuwonk, agtfadlqogVar.f7668iwizpuwonk);
        boolean z14 = zPpxfxbqfkf | zPpxfxbqfkf2 | z13;
        zArr[1] = zArr[1] | z14;
        zArr[2] = z14 | zArr[2];
        zArr[3] = zArr[3] | ppxfxbqfkf(this.f7671lereixgezr, agtfadlqogVar.f7671lereixgezr);
        zArr[4] = ppxfxbqfkf(this.f7674pmvmpeiblj, agtfadlqogVar.f7674pmvmpeiblj) | zArr[4];
    }

    public void zdlpuopuiu(draadjrbmk draadjrbmkVar, agtfadlqog agtfadlqogVar) {
        double d13 = ((this.f7663cqumvgiudr + (this.f7671lereixgezr / 2.0f)) - agtfadlqogVar.f7663cqumvgiudr) - (agtfadlqogVar.f7671lereixgezr / 2.0f);
        double d14 = ((this.f7664esjtqupxsv + (this.f7674pmvmpeiblj / 2.0f)) - agtfadlqogVar.f7664esjtqupxsv) - (agtfadlqogVar.f7674pmvmpeiblj / 2.0f);
        this.f7672lmojexxdyd = draadjrbmkVar;
        this.f7663cqumvgiudr = (float) Math.hypot(d14, d13);
        if (Float.isNaN(this.f7666iozdgvuglv)) {
            this.f7664esjtqupxsv = (float) (Math.atan2(d14, d13) + 1.5707963267948966d);
        } else {
            this.f7664esjtqupxsv = (float) Math.toRadians(this.f7666iozdgvuglv);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public int compareTo(agtfadlqog agtfadlqogVar) {
        return Float.compare(this.f7668iwizpuwonk, agtfadlqogVar.f7668iwizpuwonk);
    }

    agtfadlqog(int i13, int i14, lqeggnwhkg lqeggnwhkgVar, agtfadlqog agtfadlqogVar, agtfadlqog agtfadlqogVar2) {
        int i15 = ppxfxbqfkf.f7921gxszxtbevo;
        this.f7662cdpycssgdh = i15;
        this.f7676yadqdtsiqt = i15;
        this.f7666iozdgvuglv = Float.NaN;
        this.f7672lmojexxdyd = null;
        this.f7675wwaezpbzkn = new LinkedHashMap();
        this.f7678ylkuphrtab = 0;
        this.f7665hcddaimhww = new double[18];
        this.f7669jpowsppfya = new double[18];
        if (agtfadlqogVar.f7676yadqdtsiqt != ppxfxbqfkf.f7921gxszxtbevo) {
            ojitshcjhn(i13, i14, lqeggnwhkgVar, agtfadlqogVar, agtfadlqogVar2);
            return;
        }
        int i16 = lqeggnwhkgVar.f7835vdvldrhtss;
        if (i16 == 1) {
            agtfadlqog(lqeggnwhkgVar, agtfadlqogVar, agtfadlqogVar2);
            return;
        }
        if (i16 == 2) {
            rgvfuqvkyq(i13, i14, lqeggnwhkgVar, agtfadlqogVar, agtfadlqogVar2);
        } else if (i16 != 3) {
            wflxmlrfwp(lqeggnwhkgVar, agtfadlqogVar, agtfadlqogVar2);
        } else {
            draadjrbmk(lqeggnwhkgVar, agtfadlqogVar, agtfadlqogVar2);
        }
    }
}
