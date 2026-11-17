package a1;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String f160eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected zoijcleaow f161iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f163wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected int[] f164zoijcleaow = new int[10];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    protected float[] f162ppxfxbqfkf = new float[10];

    private static class iobyxmoadg {
        static void iobyxmoadg(int[] iArr, float[] fArr, int i13, int i14) {
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

        private static void ppxfxbqfkf(int[] iArr, float[] fArr, int i13, int i14) {
            int i15 = iArr[i13];
            iArr[i13] = iArr[i14];
            iArr[i14] = i15;
            float f13 = fArr[i13];
            fArr[i13] = fArr[i14];
            fArr[i14] = f13;
        }

        private static int zoijcleaow(int[] iArr, float[] fArr, int i13, int i14) {
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

    public float iobyxmoadg(float f13) {
        return (float) this.f161iobyxmoadg.ppxfxbqfkf(f13, 0);
    }

    public void ppxfxbqfkf(String str) {
        this.f160eablkybsjg = str;
    }

    public String toString() {
        String str = this.f160eablkybsjg;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i13 = 0; i13 < this.f163wkgbmnqykc; i13++) {
            str = str + "[" + this.f164zoijcleaow[i13] + " , " + decimalFormat.format(this.f162ppxfxbqfkf[i13]) + "] ";
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public void wkgbmnqykc(int i13) {
        int i14 = this.f163wkgbmnqykc;
        if (i14 == 0) {
            return;
        }
        iobyxmoadg.iobyxmoadg(this.f164zoijcleaow, this.f162ppxfxbqfkf, 0, i14 - 1);
        int i15 = 1;
        for (int i16 = 1; i16 < this.f163wkgbmnqykc; i16++) {
            int[] iArr = this.f164zoijcleaow;
            if (iArr[i16 - 1] != iArr[i16]) {
                i15++;
            }
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 1);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f163wkgbmnqykc; i18++) {
            if (i18 > 0) {
                int[] iArr2 = this.f164zoijcleaow;
                if (iArr2[i18] != iArr2[i18 - 1]) {
                    dArr[i17] = ((double) this.f164zoijcleaow[i18]) * 0.01d;
                    dArr2[i17][0] = this.f162ppxfxbqfkf[i18];
                    i17++;
                }
            } else {
                dArr[i17] = ((double) this.f164zoijcleaow[i18]) * 0.01d;
                dArr2[i17][0] = this.f162ppxfxbqfkf[i18];
                i17++;
            }
        }
        this.f161iobyxmoadg = zoijcleaow.iobyxmoadg(i13, dArr, dArr2);
    }

    public void zoijcleaow(int i13, float f13) {
        int[] iArr = this.f164zoijcleaow;
        if (iArr.length < this.f163wkgbmnqykc + 1) {
            this.f164zoijcleaow = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f162ppxfxbqfkf;
            this.f162ppxfxbqfkf = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f164zoijcleaow;
        int i14 = this.f163wkgbmnqykc;
        iArr2[i14] = i13;
        this.f162ppxfxbqfkf[i14] = f13;
        this.f163wkgbmnqykc = i14 + 1;
    }
}
