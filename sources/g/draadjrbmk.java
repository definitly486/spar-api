package g;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk {
    public static final long iobyxmoadg(float f13, float f14) {
        return gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32));
    }

    public static final lqeggnwhkg ppxfxbqfkf(long j13) {
        return nufgyqmvbu.zoijcleaow(eablkybsjg.f35584zoijcleaow.ppxfxbqfkf(), j13);
    }

    public static final long zoijcleaow(long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) / 2.0f;
        return eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j13 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }
}
