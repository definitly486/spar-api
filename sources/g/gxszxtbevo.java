package g;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {
    public static final long iobyxmoadg(float f13, float f14) {
        return eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32));
    }

    public static final long zoijcleaow(long j13, long j14, float f13) {
        float fZoijcleaow = y0.wkgbmnqykc.zoijcleaow(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j14 >> 32)), f13);
        float fZoijcleaow2 = y0.wkgbmnqykc.zoijcleaow(Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j14 & 4294967295L)), f13);
        return eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fZoijcleaow)) << 32) | (((long) Float.floatToRawIntBits(fZoijcleaow2)) & 4294967295L));
    }
}
