package x;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float ppxfxbqfkf(long j13, long j14) {
        return Math.max(Float.intBitsToFloat((int) (j14 >> 32)) / Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)) / Float.intBitsToFloat((int) (j13 & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float wkgbmnqykc(long j13, long j14) {
        return Math.min(Float.intBitsToFloat((int) (j14 >> 32)) / Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)) / Float.intBitsToFloat((int) (j13 & 4294967295L)));
    }
}
