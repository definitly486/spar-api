package g;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {
    public static final lqeggnwhkg iobyxmoadg(long j13, long j14) {
        return new lqeggnwhkg(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)));
    }

    public static final lqeggnwhkg zoijcleaow(long j13, long j14) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        return new lqeggnwhkg(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14), Float.intBitsToFloat(i13) + Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat(i14) + Float.intBitsToFloat((int) (j14 & 4294967295L)));
    }
}
