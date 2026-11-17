package i1;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final float[][] f41683iobyxmoadg = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final float[][] f41686zoijcleaow = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final float[] f41684ppxfxbqfkf = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final float[][] f41685wkgbmnqykc = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static float eablkybsjg(int i13) {
        float f13 = i13 / 255.0f;
        return (f13 <= 0.04045f ? f13 / 12.92f : (float) Math.pow((f13 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    static void gxszxtbevo(int i13, float[] fArr) {
        float fEablkybsjg = eablkybsjg(Color.red(i13));
        float fEablkybsjg2 = eablkybsjg(Color.green(i13));
        float fEablkybsjg3 = eablkybsjg(Color.blue(i13));
        float[][] fArr2 = f41685wkgbmnqykc;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fEablkybsjg) + (fArr3[1] * fEablkybsjg2) + (fArr3[2] * fEablkybsjg3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fEablkybsjg) + (fArr4[1] * fEablkybsjg2) + (fArr4[2] * fEablkybsjg3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fEablkybsjg * fArr5[0]) + (fEablkybsjg2 * fArr5[1]) + (fEablkybsjg3 * fArr5[2]);
    }

    static int iobyxmoadg(float f13) {
        if (f13 < 1.0f) {
            return -16777216;
        }
        if (f13 > 99.0f) {
            return -1;
        }
        float f14 = (f13 + 16.0f) / 116.0f;
        float f15 = f13 > 8.0f ? f14 * f14 * f14 : f13 / 903.2963f;
        float f16 = f14 * f14 * f14;
        boolean z13 = f16 > 0.008856452f;
        float f17 = z13 ? f16 : ((f14 * 116.0f) - 16.0f) / 903.2963f;
        if (!z13) {
            f16 = ((f14 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f41684ppxfxbqfkf;
        return j1.ppxfxbqfkf.zoijcleaow(f17 * fArr[0], f15 * fArr[1], f16 * fArr[2]);
    }

    static float lqeggnwhkg(int i13) {
        float fEablkybsjg = eablkybsjg(Color.red(i13));
        float fEablkybsjg2 = eablkybsjg(Color.green(i13));
        float fEablkybsjg3 = eablkybsjg(Color.blue(i13));
        float[] fArr = f41685wkgbmnqykc[1];
        return (fEablkybsjg * fArr[0]) + (fEablkybsjg2 * fArr[1]) + (fEablkybsjg3 * fArr[2]);
    }

    static float nufgyqmvbu(float f13) {
        return (f13 > 8.0f ? (float) Math.pow((((double) f13) + 16.0d) / 116.0d, 3.0d) : f13 / 903.2963f) * 100.0f;
    }

    static float ppxfxbqfkf(float f13) {
        float f14 = f13 / 100.0f;
        return f14 <= 0.008856452f ? f14 * 903.2963f : (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
    }

    static float wkgbmnqykc(float f13, float f14, float f15) {
        return f13 + ((f14 - f13) * f15);
    }

    static float zoijcleaow(int i13) {
        return ppxfxbqfkf(lqeggnwhkg(i13));
    }
}
