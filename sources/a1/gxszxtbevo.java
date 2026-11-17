package a1;

/* JADX INFO: loaded from: classes.dex */
public class gxszxtbevo extends zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    double[] f208eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private double[] f209iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private double f210ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f211wkgbmnqykc = true;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private double[][] f212zoijcleaow;

    public gxszxtbevo(double[] dArr, double[][] dArr2) {
        this.f210ppxfxbqfkf = Double.NaN;
        int length = dArr2[0].length;
        this.f208eablkybsjg = new double[length];
        this.f209iobyxmoadg = dArr;
        this.f212zoijcleaow = dArr2;
        if (length <= 2) {
            return;
        }
        int i13 = 0;
        double d13 = 0.0d;
        while (true) {
            double d14 = d13;
            if (i13 >= dArr.length) {
                this.f210ppxfxbqfkf = 0.0d;
                return;
            }
            double d15 = dArr2[i13][0];
            if (i13 > 0) {
                Math.hypot(d15 - d13, d15 - d14);
            }
            i13++;
            d13 = d15;
        }
    }

    @Override // a1.zoijcleaow
    public void eablkybsjg(double d13, float[] fArr) {
        double[] dArr = this.f209iobyxmoadg;
        int length = dArr.length;
        int i13 = 0;
        int length2 = this.f212zoijcleaow[0].length;
        if (this.f211wkgbmnqykc) {
            double d14 = dArr[0];
            if (d13 <= d14) {
                gxszxtbevo(d14, this.f208eablkybsjg);
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) (this.f212zoijcleaow[0][i14] + ((d13 - this.f209iobyxmoadg[0]) * this.f208eablkybsjg[i14]));
                }
                return;
            }
            int i15 = length - 1;
            double d15 = dArr[i15];
            if (d13 >= d15) {
                gxszxtbevo(d15, this.f208eablkybsjg);
                while (i13 < length2) {
                    fArr[i13] = (float) (this.f212zoijcleaow[i15][i13] + ((d13 - this.f209iobyxmoadg[i15]) * this.f208eablkybsjg[i13]));
                    i13++;
                }
                return;
            }
        } else {
            if (d13 <= dArr[0]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    fArr[i16] = (float) this.f212zoijcleaow[0][i16];
                }
                return;
            }
            int i17 = length - 1;
            if (d13 >= dArr[i17]) {
                while (i13 < length2) {
                    fArr[i13] = (float) this.f212zoijcleaow[i17][i13];
                    i13++;
                }
                return;
            }
        }
        int i18 = 0;
        while (i18 < length - 1) {
            if (d13 == this.f209iobyxmoadg[i18]) {
                for (int i19 = 0; i19 < length2; i19++) {
                    fArr[i19] = (float) this.f212zoijcleaow[i18][i19];
                }
            }
            double[] dArr2 = this.f209iobyxmoadg;
            int i23 = i18 + 1;
            double d16 = dArr2[i23];
            if (d13 < d16) {
                double d17 = dArr2[i18];
                double d18 = (d13 - d17) / (d16 - d17);
                while (i13 < length2) {
                    double[][] dArr3 = this.f212zoijcleaow;
                    fArr[i13] = (float) ((dArr3[i18][i13] * (1.0d - d18)) + (dArr3[i23][i13] * d18));
                    i13++;
                }
                return;
            }
            i18 = i23;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r4
      0x000f: PHI (r4v5 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a1.zoijcleaow
    public void gxszxtbevo(double d13, double[] dArr) {
        double[] dArr2 = this.f209iobyxmoadg;
        int length = dArr2.length;
        int length2 = this.f212zoijcleaow[0].length;
        double d14 = dArr2[0];
        if (d13 <= d14) {
            d13 = d14;
        } else {
            d14 = dArr2[length - 1];
            if (d13 >= d14) {
                d13 = d14;
            }
        }
        int i13 = 0;
        while (i13 < length - 1) {
            double[] dArr3 = this.f209iobyxmoadg;
            int i14 = i13 + 1;
            double d15 = dArr3[i14];
            if (d13 <= d15) {
                double d16 = d15 - dArr3[i13];
                for (int i15 = 0; i15 < length2; i15++) {
                    double[][] dArr4 = this.f212zoijcleaow;
                    dArr[i15] = (dArr4[i14][i15] - dArr4[i13][i15]) / d16;
                }
                return;
            }
            i13 = i14;
        }
    }

    @Override // a1.zoijcleaow
    public double[] lqeggnwhkg() {
        return this.f209iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v4 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    public double nufgyqmvbu(double d13, int i13) {
        double[] dArr = this.f209iobyxmoadg;
        int length = dArr.length;
        int i14 = 0;
        double d14 = dArr[0];
        if (d13 < d14) {
            d13 = d14;
        } else {
            d14 = dArr[length - 1];
            if (d13 >= d14) {
                d13 = d14;
            }
        }
        while (i14 < length - 1) {
            double[] dArr2 = this.f209iobyxmoadg;
            int i15 = i14 + 1;
            double d15 = dArr2[i15];
            if (d13 <= d15) {
                double d16 = d15 - dArr2[i14];
                double[][] dArr3 = this.f212zoijcleaow;
                return (dArr3[i15][i13] - dArr3[i14][i13]) / d16;
            }
            i14 = i15;
        }
        return 0.0d;
    }

    @Override // a1.zoijcleaow
    public double ppxfxbqfkf(double d13, int i13) {
        double d14;
        double d15;
        double dNufgyqmvbu;
        double[] dArr = this.f209iobyxmoadg;
        int length = dArr.length;
        int i14 = 0;
        if (this.f211wkgbmnqykc) {
            double d16 = dArr[0];
            if (d13 <= d16) {
                d14 = this.f212zoijcleaow[0][i13];
                d15 = d13 - d16;
                dNufgyqmvbu = nufgyqmvbu(d16, i13);
            } else {
                int i15 = length - 1;
                double d17 = dArr[i15];
                if (d13 >= d17) {
                    d14 = this.f212zoijcleaow[i15][i13];
                    d15 = d13 - d17;
                    dNufgyqmvbu = nufgyqmvbu(d17, i13);
                }
            }
            return d14 + (d15 * dNufgyqmvbu);
        }
        if (d13 <= dArr[0]) {
            return this.f212zoijcleaow[0][i13];
        }
        int i16 = length - 1;
        if (d13 >= dArr[i16]) {
            return this.f212zoijcleaow[i16][i13];
        }
        while (i14 < length - 1) {
            double[] dArr2 = this.f209iobyxmoadg;
            double d18 = dArr2[i14];
            if (d13 == d18) {
                return this.f212zoijcleaow[i14][i13];
            }
            int i17 = i14 + 1;
            double d19 = dArr2[i17];
            if (d13 < d19) {
                double d23 = (d13 - d18) / (d19 - d18);
                double[][] dArr3 = this.f212zoijcleaow;
                return (dArr3[i14][i13] * (1.0d - d23)) + (dArr3[i17][i13] * d23);
            }
            i14 = i17;
        }
        return 0.0d;
    }

    @Override // a1.zoijcleaow
    public void wkgbmnqykc(double d13, double[] dArr) {
        double[] dArr2 = this.f209iobyxmoadg;
        int length = dArr2.length;
        int i13 = 0;
        int length2 = this.f212zoijcleaow[0].length;
        if (this.f211wkgbmnqykc) {
            double d14 = dArr2[0];
            if (d13 <= d14) {
                gxszxtbevo(d14, this.f208eablkybsjg);
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.f212zoijcleaow[0][i14] + ((d13 - this.f209iobyxmoadg[0]) * this.f208eablkybsjg[i14]);
                }
                return;
            }
            int i15 = length - 1;
            double d15 = dArr2[i15];
            if (d13 >= d15) {
                gxszxtbevo(d15, this.f208eablkybsjg);
                while (i13 < length2) {
                    dArr[i13] = this.f212zoijcleaow[i15][i13] + ((d13 - this.f209iobyxmoadg[i15]) * this.f208eablkybsjg[i13]);
                    i13++;
                }
                return;
            }
        } else {
            if (d13 <= dArr2[0]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    dArr[i16] = this.f212zoijcleaow[0][i16];
                }
                return;
            }
            int i17 = length - 1;
            if (d13 >= dArr2[i17]) {
                while (i13 < length2) {
                    dArr[i13] = this.f212zoijcleaow[i17][i13];
                    i13++;
                }
                return;
            }
        }
        int i18 = 0;
        while (i18 < length - 1) {
            if (d13 == this.f209iobyxmoadg[i18]) {
                for (int i19 = 0; i19 < length2; i19++) {
                    dArr[i19] = this.f212zoijcleaow[i18][i19];
                }
            }
            double[] dArr3 = this.f209iobyxmoadg;
            int i23 = i18 + 1;
            double d16 = dArr3[i23];
            if (d13 < d16) {
                double d17 = dArr3[i18];
                double d18 = (d13 - d17) / (d16 - d17);
                while (i13 < length2) {
                    double[][] dArr4 = this.f212zoijcleaow;
                    dArr[i13] = (dArr4[i18][i13] * (1.0d - d18)) + (dArr4[i23][i13] * d18);
                    i13++;
                }
                return;
            }
            i18 = i23;
        }
    }
}
