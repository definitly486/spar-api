package w0;

/* JADX INFO: loaded from: classes.dex */
public abstract class kcexrzcfyt {
    public static final long iobyxmoadg(int i13, int i14) {
        return oxmwwwfdhm.ppxfxbqfkf((((long) i14) & 4294967295L) | (((long) i13) << 32));
    }

    public static final long ppxfxbqfkf(long j13) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j13 >> 32)));
        return oxmwwwfdhm.ppxfxbqfkf((((long) Math.round(Float.intBitsToFloat((int) (j13 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32));
    }

    public static final long wkgbmnqykc(long j13) {
        return g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits((int) (j13 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j13 >> 32)) << 32));
    }

    public static final long zoijcleaow(long j13) {
        return agtfadlqog.wkgbmnqykc((((j13 << 32) >> 33) & 4294967295L) | ((j13 >> 33) << 32));
    }
}
