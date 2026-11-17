package a1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    lqeggnwhkg f240eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    int f241gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    double[] f245ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    String f246wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    float[] f242iobyxmoadg = new float[0];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    double[] f247zoijcleaow = new double[0];

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    double f243lqeggnwhkg = 6.283185307179586d;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f244nufgyqmvbu = false;

    public void eablkybsjg(int i13, String str) {
        this.f241gxszxtbevo = i13;
        this.f246wkgbmnqykc = str;
        if (str != null) {
            this.f240eablkybsjg = lqeggnwhkg.nufgyqmvbu(str);
        }
    }

    public void iobyxmoadg(double d13, float f13) {
        int length = this.f242iobyxmoadg.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f247zoijcleaow, d13);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f247zoijcleaow = Arrays.copyOf(this.f247zoijcleaow, length);
        this.f242iobyxmoadg = Arrays.copyOf(this.f242iobyxmoadg, length);
        this.f245ppxfxbqfkf = new double[length];
        double[] dArr = this.f247zoijcleaow;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f247zoijcleaow[iBinarySearch] = d13;
        this.f242iobyxmoadg[iBinarySearch] = f13;
        this.f244nufgyqmvbu = false;
    }

    public double ppxfxbqfkf(double d13, double d14) {
        double dAbs;
        double dZoijcleaow = zoijcleaow(d13) + d14;
        switch (this.f241gxszxtbevo) {
            case 1:
                return Math.signum(0.5d - (dZoijcleaow % 1.0d));
            case 2:
                dAbs = Math.abs((((dZoijcleaow * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dZoijcleaow * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dZoijcleaow * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f243lqeggnwhkg * (d14 + dZoijcleaow));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dZoijcleaow * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f240eablkybsjg.ppxfxbqfkf(dZoijcleaow % 1.0d, 0);
            default:
                return Math.sin(this.f243lqeggnwhkg * dZoijcleaow);
        }
        return 1.0d - dAbs;
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f247zoijcleaow) + " period=" + Arrays.toString(this.f242iobyxmoadg);
    }

    public void wkgbmnqykc() {
        double d13 = 0.0d;
        int i13 = 0;
        while (true) {
            float[] fArr = this.f242iobyxmoadg;
            if (i13 >= fArr.length) {
                break;
            }
            d13 += (double) fArr[i13];
            i13++;
        }
        double d14 = 0.0d;
        int i14 = 1;
        while (true) {
            float[] fArr2 = this.f242iobyxmoadg;
            if (i14 >= fArr2.length) {
                break;
            }
            int i15 = i14 - 1;
            float f13 = (fArr2[i15] + fArr2[i14]) / 2.0f;
            double[] dArr = this.f247zoijcleaow;
            d14 += (dArr[i14] - dArr[i15]) * ((double) f13);
            i14++;
        }
        int i16 = 0;
        while (true) {
            float[] fArr3 = this.f242iobyxmoadg;
            if (i16 >= fArr3.length) {
                break;
            }
            fArr3[i16] = fArr3[i16] * ((float) (d13 / d14));
            i16++;
        }
        this.f245ppxfxbqfkf[0] = 0.0d;
        int i17 = 1;
        while (true) {
            float[] fArr4 = this.f242iobyxmoadg;
            if (i17 >= fArr4.length) {
                this.f244nufgyqmvbu = true;
                return;
            }
            int i18 = i17 - 1;
            float f14 = (fArr4[i18] + fArr4[i17]) / 2.0f;
            double[] dArr2 = this.f247zoijcleaow;
            double d15 = dArr2[i17] - dArr2[i18];
            double[] dArr3 = this.f245ppxfxbqfkf;
            dArr3[i17] = dArr3[i18] + (d15 * ((double) f14));
            i17++;
        }
    }

    double zoijcleaow(double d13) {
        if (d13 <= 0.0d) {
            return 0.0d;
        }
        if (d13 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f247zoijcleaow, d13);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f242iobyxmoadg;
        float f13 = fArr[iBinarySearch];
        int i13 = iBinarySearch - 1;
        float f14 = fArr[i13];
        double d14 = f13 - f14;
        double[] dArr = this.f247zoijcleaow;
        double d15 = dArr[iBinarySearch];
        double d16 = dArr[i13];
        double d17 = d14 / (d15 - d16);
        return this.f245ppxfxbqfkf[i13] + ((((double) f14) - (d17 * d16)) * (d13 - d16)) + ((d17 * ((d13 * d13) - (d16 * d16))) / 2.0d);
    }
}
