package a1;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class lqeggnwhkg extends zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    double[] f235eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private double[] f236iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private double[][] f237ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f238wkgbmnqykc = true;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private double[][] f239zoijcleaow;

    public lqeggnwhkg(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f235eablkybsjg = new double[length2];
        int i13 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i13, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i14 = 0; i14 < length2; i14++) {
            int i15 = 0;
            while (i15 < i13) {
                int i16 = i15 + 1;
                double d13 = dArr[i16] - dArr[i15];
                double[] dArr5 = dArr3[i15];
                double d14 = (dArr2[i16][i14] - dArr2[i15][i14]) / d13;
                dArr5[i14] = d14;
                if (i15 == 0) {
                    dArr4[i15][i14] = d14;
                } else {
                    dArr4[i15][i14] = (dArr3[i15 - 1][i14] + d14) * 0.5d;
                }
                i15 = i16;
            }
            dArr4[i13][i14] = dArr3[length - 2][i14];
        }
        for (int i17 = 0; i17 < i13; i17++) {
            for (int i18 = 0; i18 < length2; i18++) {
                double d15 = dArr3[i17][i18];
                if (d15 == 0.0d) {
                    dArr4[i17][i18] = 0.0d;
                    dArr4[i17 + 1][i18] = 0.0d;
                } else {
                    double d16 = dArr4[i17][i18] / d15;
                    int i19 = i17 + 1;
                    double d17 = dArr4[i19][i18] / d15;
                    double dHypot = Math.hypot(d16, d17);
                    if (dHypot > 9.0d) {
                        double d18 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i17];
                        double[] dArr7 = dArr3[i17];
                        dArr6[i18] = d16 * d18 * dArr7[i18];
                        dArr4[i19][i18] = d18 * d17 * dArr7[i18];
                    }
                }
            }
        }
        this.f236iobyxmoadg = dArr;
        this.f239zoijcleaow = dArr2;
        this.f237ppxfxbqfkf = dArr4;
    }

    private static double btonecajqb(double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = d14 * d14;
        double d23 = d14 * 6.0d;
        double d24 = 3.0d * d13;
        return ((((((((((-6.0d) * d19) * d16) + (d23 * d16)) + ((6.0d * d19) * d15)) - (d23 * d15)) + ((d24 * d18) * d19)) + ((d24 * d17) * d19)) - (((2.0d * d13) * d18) * d14)) - (((4.0d * d13) * d17) * d14)) + (d13 * d17);
    }

    private static double draadjrbmk(double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = d14 * d14;
        double d23 = d19 * d14;
        double d24 = 3.0d * d19;
        double d25 = ((((((-2.0d) * d23) * d16) + (d24 * d16)) + ((d23 * 2.0d) * d15)) - (d24 * d15)) + d15;
        double d26 = d13 * d18;
        double d27 = d13 * d17;
        return ((((d25 + (d26 * d23)) + (d23 * d27)) - (d26 * d19)) - (((d13 * 2.0d) * d17) * d19)) + (d27 * d14);
    }

    private static lqeggnwhkg dxjokdxxww(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d13 = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i13 = 0; i13 < dArr.length; i13++) {
            double d14 = dArr[i13];
            int i14 = i13 + length2;
            dArr2[i14][0] = d14;
            double d15 = ((double) i13) * d13;
            dArr3[i14] = d15;
            if (i13 > 0) {
                int i15 = (length2 * 2) + i13;
                dArr2[i15][0] = d14 + 1.0d;
                dArr3[i15] = d15 + 1.0d;
                int i16 = i13 - 1;
                dArr2[i16][0] = (d14 - 1.0d) - d13;
                dArr3[i16] = (d15 - 1.0d) - d13;
            }
        }
        return new lqeggnwhkg(dArr3, dArr2);
    }

    public static lqeggnwhkg nufgyqmvbu(String str) {
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i13 = 0;
        while (iIndexOf2 != -1) {
            dArr[i13] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i13++;
        }
        dArr[i13] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        return dxjokdxxww(Arrays.copyOf(dArr, i13 + 1));
    }

    @Override // a1.zoijcleaow
    public void eablkybsjg(double d13, float[] fArr) {
        double[] dArr = this.f236iobyxmoadg;
        int length = dArr.length;
        int i13 = 0;
        int length2 = this.f239zoijcleaow[0].length;
        if (this.f238wkgbmnqykc) {
            double d14 = dArr[0];
            if (d13 <= d14) {
                gxszxtbevo(d14, this.f235eablkybsjg);
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) (this.f239zoijcleaow[0][i14] + ((d13 - this.f236iobyxmoadg[0]) * this.f235eablkybsjg[i14]));
                }
                return;
            }
            int i15 = length - 1;
            double d15 = dArr[i15];
            if (d13 >= d15) {
                gxszxtbevo(d15, this.f235eablkybsjg);
                while (i13 < length2) {
                    fArr[i13] = (float) (this.f239zoijcleaow[i15][i13] + ((d13 - this.f236iobyxmoadg[i15]) * this.f235eablkybsjg[i13]));
                    i13++;
                }
                return;
            }
        } else {
            if (d13 <= dArr[0]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    fArr[i16] = (float) this.f239zoijcleaow[0][i16];
                }
                return;
            }
            int i17 = length - 1;
            if (d13 >= dArr[i17]) {
                while (i13 < length2) {
                    fArr[i13] = (float) this.f239zoijcleaow[i17][i13];
                    i13++;
                }
                return;
            }
        }
        int i18 = 0;
        while (i18 < length - 1) {
            if (d13 == this.f236iobyxmoadg[i18]) {
                for (int i19 = 0; i19 < length2; i19++) {
                    fArr[i19] = (float) this.f239zoijcleaow[i18][i19];
                }
            }
            double[] dArr2 = this.f236iobyxmoadg;
            int i23 = i18 + 1;
            double d16 = dArr2[i23];
            if (d13 < d16) {
                double d17 = dArr2[i18];
                double d18 = d16 - d17;
                double d19 = (d13 - d17) / d18;
                while (i13 < length2) {
                    double[][] dArr3 = this.f239zoijcleaow;
                    double d23 = dArr3[i18][i13];
                    double d24 = dArr3[i23][i13];
                    double[][] dArr4 = this.f237ppxfxbqfkf;
                    fArr[i13] = (float) draadjrbmk(d18, d19, d23, d24, dArr4[i18][i13], dArr4[i23][i13]);
                    i13++;
                }
                return;
            }
            i18 = i23;
        }
    }

    public double gtknphoqwx(double d13, int i13) {
        double[] dArr = this.f236iobyxmoadg;
        int length = dArr.length;
        int i14 = 0;
        double d14 = dArr[0];
        if (d13 >= d14) {
            d14 = dArr[length - 1];
            if (d13 < d14) {
                d14 = d13;
            }
        }
        while (i14 < length - 1) {
            double[] dArr2 = this.f236iobyxmoadg;
            int i15 = i14 + 1;
            double d15 = dArr2[i15];
            if (d14 <= d15) {
                double d16 = dArr2[i14];
                double d17 = d15 - d16;
                double[][] dArr3 = this.f239zoijcleaow;
                double d18 = dArr3[i14][i13];
                double d19 = dArr3[i15][i13];
                double[][] dArr4 = this.f237ppxfxbqfkf;
                return btonecajqb(d17, (d14 - d16) / d17, d18, d19, dArr4[i14][i13], dArr4[i15][i13]) / d17;
            }
            i14 = i15;
        }
        return 0.0d;
    }

    @Override // a1.zoijcleaow
    public void gxszxtbevo(double d13, double[] dArr) {
        double[] dArr2 = this.f236iobyxmoadg;
        int length = dArr2.length;
        int length2 = this.f239zoijcleaow[0].length;
        double d14 = dArr2[0];
        if (d13 > d14) {
            d14 = dArr2[length - 1];
            if (d13 < d14) {
                d14 = d13;
            }
        }
        int i13 = 0;
        while (i13 < length - 1) {
            double[] dArr3 = this.f236iobyxmoadg;
            int i14 = i13 + 1;
            double d15 = dArr3[i14];
            if (d14 <= d15) {
                double d16 = dArr3[i13];
                double d17 = d15 - d16;
                double d18 = (d14 - d16) / d17;
                for (int i15 = 0; i15 < length2; i15++) {
                    double[][] dArr4 = this.f239zoijcleaow;
                    double d19 = dArr4[i13][i15];
                    double d23 = dArr4[i14][i15];
                    double[][] dArr5 = this.f237ppxfxbqfkf;
                    dArr[i15] = btonecajqb(d17, d18, d19, d23, dArr5[i13][i15], dArr5[i14][i15]) / d17;
                }
                return;
            }
            i13 = i14;
        }
    }

    @Override // a1.zoijcleaow
    public double[] lqeggnwhkg() {
        return this.f236iobyxmoadg;
    }

    @Override // a1.zoijcleaow
    public double ppxfxbqfkf(double d13, int i13) {
        double d14;
        double d15;
        double dGtknphoqwx;
        double[] dArr = this.f236iobyxmoadg;
        int length = dArr.length;
        int i14 = 0;
        if (this.f238wkgbmnqykc) {
            double d16 = dArr[0];
            if (d13 <= d16) {
                d14 = this.f239zoijcleaow[0][i13];
                d15 = d13 - d16;
                dGtknphoqwx = gtknphoqwx(d16, i13);
            } else {
                int i15 = length - 1;
                double d17 = dArr[i15];
                if (d13 >= d17) {
                    d14 = this.f239zoijcleaow[i15][i13];
                    d15 = d13 - d17;
                    dGtknphoqwx = gtknphoqwx(d17, i13);
                }
            }
            return d14 + (d15 * dGtknphoqwx);
        }
        if (d13 <= dArr[0]) {
            return this.f239zoijcleaow[0][i13];
        }
        int i16 = length - 1;
        if (d13 >= dArr[i16]) {
            return this.f239zoijcleaow[i16][i13];
        }
        while (i14 < length - 1) {
            double[] dArr2 = this.f236iobyxmoadg;
            double d18 = dArr2[i14];
            if (d13 == d18) {
                return this.f239zoijcleaow[i14][i13];
            }
            int i17 = i14 + 1;
            double d19 = dArr2[i17];
            if (d13 < d19) {
                double d23 = d19 - d18;
                double d24 = (d13 - d18) / d23;
                double[][] dArr3 = this.f239zoijcleaow;
                double d25 = dArr3[i14][i13];
                double d26 = dArr3[i17][i13];
                double[][] dArr4 = this.f237ppxfxbqfkf;
                return draadjrbmk(d23, d24, d25, d26, dArr4[i14][i13], dArr4[i17][i13]);
            }
            i14 = i17;
        }
        return 0.0d;
    }

    @Override // a1.zoijcleaow
    public void wkgbmnqykc(double d13, double[] dArr) {
        double[] dArr2 = this.f236iobyxmoadg;
        int length = dArr2.length;
        int i13 = 0;
        int length2 = this.f239zoijcleaow[0].length;
        if (this.f238wkgbmnqykc) {
            double d14 = dArr2[0];
            if (d13 <= d14) {
                gxszxtbevo(d14, this.f235eablkybsjg);
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.f239zoijcleaow[0][i14] + ((d13 - this.f236iobyxmoadg[0]) * this.f235eablkybsjg[i14]);
                }
                return;
            }
            int i15 = length - 1;
            double d15 = dArr2[i15];
            if (d13 >= d15) {
                gxszxtbevo(d15, this.f235eablkybsjg);
                while (i13 < length2) {
                    dArr[i13] = this.f239zoijcleaow[i15][i13] + ((d13 - this.f236iobyxmoadg[i15]) * this.f235eablkybsjg[i13]);
                    i13++;
                }
                return;
            }
        } else {
            if (d13 <= dArr2[0]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    dArr[i16] = this.f239zoijcleaow[0][i16];
                }
                return;
            }
            int i17 = length - 1;
            if (d13 >= dArr2[i17]) {
                while (i13 < length2) {
                    dArr[i13] = this.f239zoijcleaow[i17][i13];
                    i13++;
                }
                return;
            }
        }
        int i18 = 0;
        while (i18 < length - 1) {
            if (d13 == this.f236iobyxmoadg[i18]) {
                for (int i19 = 0; i19 < length2; i19++) {
                    dArr[i19] = this.f239zoijcleaow[i18][i19];
                }
            }
            double[] dArr3 = this.f236iobyxmoadg;
            int i23 = i18 + 1;
            double d16 = dArr3[i23];
            if (d13 < d16) {
                double d17 = dArr3[i18];
                double d18 = d16 - d17;
                double d19 = (d13 - d17) / d18;
                while (i13 < length2) {
                    double[][] dArr4 = this.f239zoijcleaow;
                    double d23 = dArr4[i18][i13];
                    double d24 = dArr4[i23][i13];
                    double[][] dArr5 = this.f237ppxfxbqfkf;
                    dArr[i13] = draadjrbmk(d18, d19, d23, d24, dArr5[i18][i13], dArr5[i23][i13]);
                    i13++;
                }
                return;
            }
            i18 = i23;
        }
    }
}
