package g;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    public static final String iobyxmoadg(float f13, int i13) {
        if (Float.isNaN(f13)) {
            return "NaN";
        }
        if (Float.isInfinite(f13)) {
            return f13 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(i13, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f14 = f13 * fPow;
        int i14 = (int) f14;
        if (f14 - i14 >= 0.5f) {
            i14++;
        }
        float f15 = i14 / fPow;
        return iMax > 0 ? String.valueOf(f15) : String.valueOf((int) f15);
    }
}
