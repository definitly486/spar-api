package z;

/* JADX INFO: loaded from: classes.dex */
public abstract class oxmwwwfdhm {
    public static final boolean eablkybsjg(long j13) {
        return (j13 & 1) != 0;
    }

    public static final int iobyxmoadg(long j13, long j14) {
        boolean zEablkybsjg = eablkybsjg(j13);
        if (zEablkybsjg != eablkybsjg(j14)) {
            return zEablkybsjg ? -1 : 1;
        }
        int iSignum = (int) Math.signum(ppxfxbqfkf(j13) - ppxfxbqfkf(j14));
        if (Math.min(ppxfxbqfkf(j13), ppxfxbqfkf(j14)) >= 0.0f && wkgbmnqykc(j13) != wkgbmnqykc(j14)) {
            return wkgbmnqykc(j13) ? -1 : 1;
        }
        return iSignum;
    }

    public static final float ppxfxbqfkf(long j13) {
        return Float.intBitsToFloat((int) (j13 >> 32));
    }

    public static final boolean wkgbmnqykc(long j13) {
        return (j13 & 2) != 0;
    }

    public static long zoijcleaow(long j13) {
        return j13;
    }
}
