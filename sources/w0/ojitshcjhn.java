package w0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ojitshcjhn {
    public static final long iobyxmoadg(long j13, long j14) {
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j13 >> 32)) - agtfadlqog.dxjokdxxww(j14))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j13 & 4294967295L)) - agtfadlqog.btonecajqb(j14))) & 4294967295L));
    }

    public static final long ppxfxbqfkf(long j13) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j13 >> 32)));
        return agtfadlqog.wkgbmnqykc((((long) Math.round(Float.intBitsToFloat((int) (j13 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32));
    }

    public static final long zoijcleaow(long j13, long j14) {
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j13 >> 32)) + agtfadlqog.dxjokdxxww(j14))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j13 & 4294967295L)) + agtfadlqog.btonecajqb(j14))) & 4294967295L));
    }
}
