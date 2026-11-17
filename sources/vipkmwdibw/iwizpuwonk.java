package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg[][] f117107iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f117108zoijcleaow = true;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        public final float f117109agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private final float[] f117110btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private final float f117111draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private float f117112dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final float f117113eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private final float f117114gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final float f117115gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f117116iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private float f117117lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private float f117118nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        public final float f117119ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        public final float f117120oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f117121ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        public final boolean f117122rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        public final float f117123vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private final float f117124wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f117125wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final float f117126zoijcleaow;

        public iobyxmoadg(int i13, float f13, float f14, float f15, float f16, float f17, float f18) {
            this.f117116iobyxmoadg = f13;
            this.f117126zoijcleaow = f14;
            this.f117121ppxfxbqfkf = f15;
            this.f117125wkgbmnqykc = f16;
            this.f117113eablkybsjg = f17;
            this.f117115gxszxtbevo = f18;
            float f19 = f17 - f15;
            float f23 = f18 - f16;
            boolean z13 = true;
            boolean z14 = i13 == 1 || (i13 == 4 ? f23 > 0.0f : !(i13 != 5 || f23 >= 0.0f));
            float f24 = z14 ? -1.0f : 1.0f;
            this.f117124wflxmlrfwp = f24;
            float f25 = 1 / (f14 - f13);
            this.f117114gtknphoqwx = f25;
            this.f117110btonecajqb = new float[101];
            boolean z15 = i13 == 3;
            if (z15 || Math.abs(f19) < 0.001f || Math.abs(f23) < 0.001f) {
                float fHypot = (float) Math.hypot(f23, f19);
                this.f117117lqeggnwhkg = fHypot;
                this.f117111draadjrbmk = fHypot * f25;
                this.f117123vdvldrhtss = f19 * f25;
                this.f117120oxmwwwfdhm = f23 * f25;
                this.f117109agtfadlqog = Float.NaN;
                this.f117119ojitshcjhn = Float.NaN;
            } else {
                this.f117109agtfadlqog = f19 * f24;
                this.f117119ojitshcjhn = f23 * (-f24);
                this.f117123vdvldrhtss = z14 ? f17 : f15;
                this.f117120oxmwwwfdhm = z14 ? f16 : f18;
                ppxfxbqfkf(f15, f16, f17, f18);
                this.f117111draadjrbmk = this.f117117lqeggnwhkg * f25;
                z13 = z15;
            }
            this.f117122rgvfuqvkyq = z13;
        }

        private final float btonecajqb(float f13) {
            if (f13 <= 0.0f) {
                return 0.0f;
            }
            if (f13 >= 1.0f) {
                return 1.0f;
            }
            float f14 = f13 * 100;
            int i13 = (int) f14;
            float f15 = f14 - i13;
            float[] fArr = this.f117110btonecajqb;
            float f16 = fArr[i13];
            return f16 + (f15 * (fArr[i13 + 1] - f16));
        }

        public final float dxjokdxxww() {
            return this.f117126zoijcleaow;
        }

        public final float eablkybsjg() {
            float f13 = this.f117109agtfadlqog * this.f117112dxjokdxxww;
            float f14 = (-this.f117119ojitshcjhn) * this.f117118nufgyqmvbu;
            return f14 * this.f117124wflxmlrfwp * (this.f117111draadjrbmk / ((float) Math.hypot(f13, f14)));
        }

        public final void gtknphoqwx(float f13) {
            double dBtonecajqb = btonecajqb((this.f117124wflxmlrfwp == -1.0f ? this.f117126zoijcleaow - f13 : f13 - this.f117116iobyxmoadg) * this.f117114gtknphoqwx) * 1.5707964f;
            this.f117118nufgyqmvbu = (float) Math.sin(dBtonecajqb);
            this.f117112dxjokdxxww = (float) Math.cos(dBtonecajqb);
        }

        public final float gxszxtbevo(float f13) {
            float f14 = (f13 - this.f117116iobyxmoadg) * this.f117114gtknphoqwx;
            float f15 = this.f117121ppxfxbqfkf;
            return f15 + (f14 * (this.f117113eablkybsjg - f15));
        }

        public final float lqeggnwhkg(float f13) {
            float f14 = (f13 - this.f117116iobyxmoadg) * this.f117114gtknphoqwx;
            float f15 = this.f117125wkgbmnqykc;
            return f15 + (f14 * (this.f117115gxszxtbevo - f15));
        }

        public final float nufgyqmvbu() {
            return this.f117116iobyxmoadg;
        }

        public final void ppxfxbqfkf(float f13, float f14, float f15, float f16) {
            float f17;
            float fHypot;
            float f18 = f15 - f13;
            float f19 = f14 - f16;
            float[] fArr = cqumvgiudr.f117047iobyxmoadg;
            int length = fArr.length - 1;
            float f23 = length;
            float[] fArr2 = this.f117110btonecajqb;
            if (1 <= length) {
                float f24 = f19;
                int i13 = 1;
                fHypot = 0.0f;
                float f25 = 0.0f;
                while (true) {
                    f17 = f23;
                    double radians = (float) Math.toRadians((((double) i13) * 90.0d) / ((double) length));
                    float fSin = ((float) Math.sin(radians)) * f18;
                    float fCos = ((float) Math.cos(radians)) * f19;
                    fHypot += (float) Math.hypot(fSin - f25, fCos - f24);
                    fArr[i13] = fHypot;
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    f23 = f17;
                    f25 = fSin;
                    f24 = fCos;
                }
            } else {
                f17 = f23;
                fHypot = 0.0f;
            }
            this.f117117lqeggnwhkg = fHypot;
            if (1 <= length) {
                int i14 = 1;
                while (true) {
                    fArr[i14] = fArr[i14] / fHypot;
                    if (i14 == length) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i15 = 0; i15 < length2; i15++) {
                float f26 = i15 / 100.0f;
                int iNufgyqmvbu = hg.agtfadlqog.nufgyqmvbu(fArr, f26, 0, 0, 6, null);
                if (iNufgyqmvbu >= 0) {
                    fArr2[i15] = iNufgyqmvbu / f17;
                } else {
                    if (iNufgyqmvbu == -1) {
                        fArr2[i15] = 0.0f;
                    } else {
                        int i16 = -iNufgyqmvbu;
                        int i17 = i16 - 2;
                        float f27 = i17;
                        float f28 = fArr[i17];
                        fArr2[i15] = (f27 + ((f26 - f28) / (fArr[i16 - 1] - f28))) / f17;
                    }
                }
            }
        }

        public final float wkgbmnqykc() {
            float f13 = this.f117109agtfadlqog * this.f117112dxjokdxxww;
            return f13 * this.f117124wflxmlrfwp * (this.f117111draadjrbmk / ((float) Math.hypot(f13, (-this.f117119ojitshcjhn) * this.f117118nufgyqmvbu)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[PHI: r10
      0x0027: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    public iwizpuwonk(int[] iArr, float[] fArr, float[][] fArr2) {
        int length = fArr.length - 1;
        iobyxmoadg[][] iobyxmoadgVarArr = new iobyxmoadg[length][];
        int i13 = 1;
        int i14 = 1;
        int i15 = 0;
        while (i15 < length) {
            int i16 = iArr[i15];
            int i17 = 3;
            if (i16 == 0) {
                i14 = i17;
            } else if (i16 == 1) {
                i13 = 1;
                i14 = i13;
            } else {
                if (i16 != 2) {
                    if (i16 != 3) {
                        i17 = 4;
                        if (i16 != 4) {
                            i17 = 5;
                            if (i16 == 5) {
                                i14 = i17;
                            }
                        } else {
                            i14 = i17;
                        }
                    } else {
                        if (i13 != 1) {
                            i13 = 1;
                        }
                        i14 = i13;
                    }
                }
                i13 = 2;
                i14 = i13;
            }
            float[] fArr3 = fArr2[i15];
            int i18 = i15 + 1;
            float[] fArr4 = fArr2[i18];
            float f13 = fArr[i15];
            float f14 = fArr[i18];
            int length2 = (fArr3.length / 2) + (fArr3.length % 2);
            iobyxmoadg[] iobyxmoadgVarArr2 = new iobyxmoadg[length2];
            int i19 = 0;
            while (i19 < length2) {
                int i23 = i19 * 2;
                int i24 = i23 + 1;
                int i25 = i19;
                iobyxmoadg[] iobyxmoadgVarArr3 = iobyxmoadgVarArr2;
                iobyxmoadgVarArr3[i25] = new iobyxmoadg(i14, f13, f14, fArr3[i23], fArr3[i24], fArr4[i23], fArr4[i24]);
                i19 = i25 + 1;
                iobyxmoadgVarArr2 = iobyxmoadgVarArr3;
            }
            iobyxmoadgVarArr[i15] = iobyxmoadgVarArr2;
            i15 = i18;
        }
        this.f117107iobyxmoadg = iobyxmoadgVarArr;
    }

    public final void iobyxmoadg(float f13, float[] fArr) {
        iobyxmoadg[][] iobyxmoadgVarArr = this.f117107iobyxmoadg;
        int length = iobyxmoadgVarArr.length - 1;
        int i13 = 0;
        float fNufgyqmvbu = iobyxmoadgVarArr[0][0].nufgyqmvbu();
        float fDxjokdxxww = iobyxmoadgVarArr[length][0].dxjokdxxww();
        int length2 = fArr.length;
        if (!this.f117108zoijcleaow) {
            f13 = Math.min(Math.max(f13, fNufgyqmvbu), fDxjokdxxww);
        } else if (f13 < fNufgyqmvbu || f13 > fDxjokdxxww) {
            if (f13 > fDxjokdxxww) {
                fNufgyqmvbu = fDxjokdxxww;
            } else {
                length = 0;
            }
            float f14 = f13 - fNufgyqmvbu;
            int i14 = 0;
            while (i13 < length2 - 1) {
                iobyxmoadg iobyxmoadgVar = iobyxmoadgVarArr[length][i14];
                if (iobyxmoadgVar.f117122rgvfuqvkyq) {
                    fArr[i13] = iobyxmoadgVar.gxszxtbevo(fNufgyqmvbu) + (iobyxmoadgVar.f117123vdvldrhtss * f14);
                    fArr[i13 + 1] = iobyxmoadgVar.lqeggnwhkg(fNufgyqmvbu) + (iobyxmoadgVar.f117120oxmwwwfdhm * f14);
                } else {
                    iobyxmoadgVar.gtknphoqwx(fNufgyqmvbu);
                    fArr[i13] = iobyxmoadgVar.f117123vdvldrhtss + (iobyxmoadgVar.f117109agtfadlqog * iobyxmoadgVar.f117118nufgyqmvbu) + (iobyxmoadgVar.wkgbmnqykc() * f14);
                    fArr[i13 + 1] = iobyxmoadgVar.f117120oxmwwwfdhm + (iobyxmoadgVar.f117119ojitshcjhn * iobyxmoadgVar.f117112dxjokdxxww) + (iobyxmoadgVar.eablkybsjg() * f14);
                }
                i13 += 2;
                i14++;
            }
            return;
        }
        boolean z13 = false;
        for (iobyxmoadg[] iobyxmoadgVarArr2 : iobyxmoadgVarArr) {
            int i15 = 0;
            int i16 = 0;
            while (i15 < length2 - 1) {
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVarArr2[i16];
                if (f13 <= iobyxmoadgVar2.dxjokdxxww()) {
                    if (iobyxmoadgVar2.f117122rgvfuqvkyq) {
                        fArr[i15] = iobyxmoadgVar2.gxszxtbevo(f13);
                        fArr[i15 + 1] = iobyxmoadgVar2.lqeggnwhkg(f13);
                    } else {
                        iobyxmoadgVar2.gtknphoqwx(f13);
                        fArr[i15] = iobyxmoadgVar2.f117123vdvldrhtss + (iobyxmoadgVar2.f117109agtfadlqog * iobyxmoadgVar2.f117118nufgyqmvbu);
                        fArr[i15 + 1] = iobyxmoadgVar2.f117120oxmwwwfdhm + (iobyxmoadgVar2.f117119ojitshcjhn * iobyxmoadgVar2.f117112dxjokdxxww);
                    }
                    z13 = true;
                }
                i15 += 2;
                i16++;
            }
            if (z13) {
                return;
            }
        }
    }

    public final void zoijcleaow(float f13, float[] fArr) {
        iobyxmoadg[][] iobyxmoadgVarArr = this.f117107iobyxmoadg;
        float fNufgyqmvbu = iobyxmoadgVarArr[0][0].nufgyqmvbu();
        float fDxjokdxxww = iobyxmoadgVarArr[iobyxmoadgVarArr.length - 1][0].dxjokdxxww();
        if (f13 < fNufgyqmvbu) {
            f13 = fNufgyqmvbu;
        }
        if (f13 <= fDxjokdxxww) {
            fDxjokdxxww = f13;
        }
        int length = fArr.length;
        boolean z13 = false;
        for (iobyxmoadg[] iobyxmoadgVarArr2 : iobyxmoadgVarArr) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < length - 1) {
                iobyxmoadg iobyxmoadgVar = iobyxmoadgVarArr2[i14];
                if (fDxjokdxxww <= iobyxmoadgVar.dxjokdxxww()) {
                    if (iobyxmoadgVar.f117122rgvfuqvkyq) {
                        fArr[i13] = iobyxmoadgVar.f117123vdvldrhtss;
                        fArr[i13 + 1] = iobyxmoadgVar.f117120oxmwwwfdhm;
                    } else {
                        iobyxmoadgVar.gtknphoqwx(fDxjokdxxww);
                        fArr[i13] = iobyxmoadgVar.wkgbmnqykc();
                        fArr[i13 + 1] = iobyxmoadgVar.eablkybsjg();
                    }
                    z13 = true;
                }
                i13 += 2;
                i14++;
            }
            if (z13) {
                return;
            }
        }
    }
}
