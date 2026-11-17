package j1;

import android.graphics.Color;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ThreadLocal f50503iobyxmoadg = new ThreadLocal();

    private static double[] btonecajqb() {
        ThreadLocal threadLocal = f50503iobyxmoadg;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    private static int dxjokdxxww(int i13, int i14, int i15) {
        return i13 < i14 ? i14 : Math.min(i13, i15);
    }

    public static void eablkybsjg(int i13, double[] dArr) {
        iobyxmoadg(Color.red(i13), Color.green(i13), Color.blue(i13), dArr);
    }

    public static int gtknphoqwx(int i13, int i14) {
        if (i14 < 0 || i14 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i13 & 16777215) | (i14 << 24);
    }

    private static int gxszxtbevo(int i13, int i14) {
        return 255 - (((255 - i14) * (255 - i13)) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static void iobyxmoadg(int i13, int i14, int i15, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d13 = ((double) i13) / 255.0d;
        double dPow = d13 < 0.04045d ? d13 / 12.92d : Math.pow((d13 + 0.055d) / 1.055d, 2.4d);
        double d14 = ((double) i14) / 255.0d;
        double dPow2 = d14 < 0.04045d ? d14 / 12.92d : Math.pow((d14 + 0.055d) / 1.055d, 2.4d);
        double d15 = ((double) i15) / 255.0d;
        double dPow3 = d15 < 0.04045d ? d15 / 12.92d : Math.pow((d15 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    public static int lqeggnwhkg(int i13, int i14) {
        int iAlpha = Color.alpha(i14);
        int iAlpha2 = Color.alpha(i13);
        int iGxszxtbevo = gxszxtbevo(iAlpha2, iAlpha);
        return Color.argb(iGxszxtbevo, nufgyqmvbu(Color.red(i13), iAlpha2, Color.red(i14), iAlpha, iGxszxtbevo), nufgyqmvbu(Color.green(i13), iAlpha2, Color.green(i14), iAlpha, iGxszxtbevo), nufgyqmvbu(Color.blue(i13), iAlpha2, Color.blue(i14), iAlpha, iGxszxtbevo));
    }

    private static int nufgyqmvbu(int i13, int i14, int i15, int i16, int i17) {
        if (i17 == 0) {
            return 0;
        }
        return (((i13 * KotlinVersion.MAX_COMPONENT_VALUE) * i14) + ((i15 * i16) * (255 - i14))) / (i17 * KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int ppxfxbqfkf(int i13, int i14, float f13) {
        float f14 = 1.0f - f13;
        return Color.argb((int) ((Color.alpha(i13) * f14) + (Color.alpha(i14) * f13)), (int) ((Color.red(i13) * f14) + (Color.red(i14) * f13)), (int) ((Color.green(i13) * f14) + (Color.green(i14) * f13)), (int) ((Color.blue(i13) * f14) + (Color.blue(i14) * f13)));
    }

    public static double wkgbmnqykc(int i13) {
        double[] dArrBtonecajqb = btonecajqb();
        eablkybsjg(i13, dArrBtonecajqb);
        return dArrBtonecajqb[1] / 100.0d;
    }

    public static int zoijcleaow(double d13, double d14, double d15) {
        double d16 = (((3.2406d * d13) + ((-1.5372d) * d14)) + ((-0.4986d) * d15)) / 100.0d;
        double d17 = ((((-0.9689d) * d13) + (1.8758d * d14)) + (0.0415d * d15)) / 100.0d;
        double d18 = (((0.0557d * d13) + ((-0.204d) * d14)) + (1.057d * d15)) / 100.0d;
        return Color.rgb(dxjokdxxww((int) Math.round((d16 > 0.0031308d ? (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d : d16 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE), dxjokdxxww((int) Math.round((d17 > 0.0031308d ? (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d : d17 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE), dxjokdxxww((int) Math.round((d18 > 0.0031308d ? (Math.pow(d18, 0.4166666666666667d) * 1.055d) - 0.055d : d18 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE));
    }
}
