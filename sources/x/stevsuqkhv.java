package x;

/* JADX INFO: loaded from: classes.dex */
public abstract class stevsuqkhv {
    public static final long iobyxmoadg(long j13, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) * Float.intBitsToFloat((int) (j14 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) * Float.intBitsToFloat((int) (j14 & 4294967295L));
        return g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long zoijcleaow(long j13, long j14) {
        return iobyxmoadg(j14, j13);
    }
}
