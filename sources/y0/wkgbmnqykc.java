package y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    public static final float iobyxmoadg(float f13) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f13)) & 8589934591L) / ((long) 3))) + 709952852);
        float f14 = fIntBitsToFloat - ((fIntBitsToFloat - (f13 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f14 - ((f14 - (f13 / (f14 * f14))) * 0.33333334f);
    }

    public static final int ppxfxbqfkf(int i13, int i14, float f13) {
        return i13 + ((int) Math.round(((double) (i14 - i13)) * ((double) f13)));
    }

    public static final float zoijcleaow(float f13, float f14, float f15) {
        return ((1 - f15) * f13) + (f15 * f14);
    }
}
