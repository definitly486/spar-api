package vg;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf extends zoijcleaow {
    public static long eablkybsjg(double d13) {
        if (Double.isNaN(d13)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d13);
    }

    public static long gxszxtbevo(float f13) {
        return iobyxmoadg.eablkybsjg(f13);
    }

    public static int iobyxmoadg(int i13) {
        return Integer.signum(i13);
    }

    public static int ppxfxbqfkf(double d13) {
        if (Double.isNaN(d13)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d13 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d13 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d13);
    }

    public static int wkgbmnqykc(float f13) {
        if (Float.isNaN(f13)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f13);
    }

    public static int zoijcleaow(long j13) {
        return Long.signum(j13);
    }
}
