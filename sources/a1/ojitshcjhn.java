package a1;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class ojitshcjhn {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    protected static float f248gtknphoqwx = 6.2831855f;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    protected long f250dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    protected int f251eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    protected String f252gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected zoijcleaow f253iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected int f258zoijcleaow = 0;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    protected int[] f256ppxfxbqfkf = new int[10];

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    protected float[][] f257wkgbmnqykc = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    protected float[] f254lqeggnwhkg = new float[3];

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    protected boolean f255nufgyqmvbu = false;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    protected float f249btonecajqb = Float.NaN;

    protected static class iobyxmoadg {
        static void iobyxmoadg(int[] iArr, float[][] fArr, int i13, int i14) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i14;
            iArr2[1] = i13;
            int i15 = 2;
            while (i15 > 0) {
                int i16 = iArr2[i15 - 1];
                int i17 = i15 - 2;
                int i18 = iArr2[i17];
                if (i16 < i18) {
                    int iZoijcleaow = zoijcleaow(iArr, fArr, i16, i18);
                    iArr2[i17] = iZoijcleaow - 1;
                    iArr2[i15 - 1] = i16;
                    int i19 = i15 + 1;
                    iArr2[i15] = i18;
                    i15 += 2;
                    iArr2[i19] = iZoijcleaow + 1;
                } else {
                    i15 = i17;
                }
            }
        }

        private static void ppxfxbqfkf(int[] iArr, float[][] fArr, int i13, int i14) {
            int i15 = iArr[i13];
            iArr[i13] = iArr[i14];
            iArr[i14] = i15;
            float[] fArr2 = fArr[i13];
            fArr[i13] = fArr[i14];
            fArr[i14] = fArr2;
        }

        private static int zoijcleaow(int[] iArr, float[][] fArr, int i13, int i14) {
            int i15 = iArr[i14];
            int i16 = i13;
            while (i13 < i14) {
                if (iArr[i13] <= i15) {
                    ppxfxbqfkf(iArr, fArr, i16, i13);
                    i16++;
                }
                i13++;
            }
            ppxfxbqfkf(iArr, fArr, i16, i14);
            return i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    public void eablkybsjg(int i13) {
        int i14 = this.f251eablkybsjg;
        if (i14 == 0) {
            System.err.println("Error no points added to " + this.f252gxszxtbevo);
            return;
        }
        iobyxmoadg.iobyxmoadg(this.f256ppxfxbqfkf, this.f257wkgbmnqykc, 0, i14 - 1);
        int i15 = 1;
        int i16 = 0;
        while (true) {
            int[] iArr = this.f256ppxfxbqfkf;
            if (i15 >= iArr.length) {
                break;
            }
            if (iArr[i15] != iArr[i15 - 1]) {
                i16++;
            }
            i15++;
        }
        if (i16 == 0) {
            i16 = 1;
        }
        double[] dArr = new double[i16];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i16, 3);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f251eablkybsjg; i18++) {
            if (i18 > 0) {
                int[] iArr2 = this.f256ppxfxbqfkf;
                if (iArr2[i18] != iArr2[i18 - 1]) {
                    dArr[i17] = ((double) this.f256ppxfxbqfkf[i18]) * 0.01d;
                    double[] dArr3 = dArr2[i17];
                    float[] fArr = this.f257wkgbmnqykc[i18];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i17++;
                }
            } else {
                dArr[i17] = ((double) this.f256ppxfxbqfkf[i18]) * 0.01d;
                double[] dArr4 = dArr2[i17];
                float[] fArr2 = this.f257wkgbmnqykc[i18];
                dArr4[0] = fArr2[0];
                dArr4[1] = fArr2[1];
                dArr4[2] = fArr2[2];
                i17++;
            }
        }
        this.f253iobyxmoadg = zoijcleaow.iobyxmoadg(i13, dArr, dArr2);
    }

    protected float iobyxmoadg(float f13) {
        float fAbs;
        switch (this.f258zoijcleaow) {
            case 1:
                return Math.signum(f13 * f248gtknphoqwx);
            case 2:
                fAbs = Math.abs(f13);
                break;
            case 3:
                return (((f13 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f13 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f13 * f248gtknphoqwx);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f13 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f13 * f248gtknphoqwx);
        }
        return 1.0f - fAbs;
    }

    protected void ppxfxbqfkf(long j13) {
        this.f250dxjokdxxww = j13;
    }

    public String toString() {
        String str = this.f252gxszxtbevo;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i13 = 0; i13 < this.f251eablkybsjg; i13++) {
            str = str + "[" + this.f256ppxfxbqfkf[i13] + " , " + decimalFormat.format(this.f257wkgbmnqykc[i13]) + "] ";
        }
        return str;
    }

    public void wkgbmnqykc(String str) {
        this.f252gxszxtbevo = str;
    }

    public void zoijcleaow(int i13, float f13, float f14, int i14, float f15) {
        int[] iArr = this.f256ppxfxbqfkf;
        int i15 = this.f251eablkybsjg;
        iArr[i15] = i13;
        float[] fArr = this.f257wkgbmnqykc[i15];
        fArr[0] = f13;
        fArr[1] = f14;
        fArr[2] = f15;
        this.f258zoijcleaow = Math.max(this.f258zoijcleaow, i14);
        this.f251eablkybsjg++;
    }
}
