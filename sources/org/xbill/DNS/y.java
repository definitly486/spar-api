package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    public static int iobyxmoadg(long j13, long j14) {
        if (j13 < 0 || j13 > 4294967295L) {
            throw new IllegalArgumentException(j13 + " out of range");
        }
        if (j14 < 0 || j14 > 4294967295L) {
            throw new IllegalArgumentException(j14 + " out of range");
        }
        long j15 = j13 - j14;
        if (j15 >= 4294967295L) {
            j15 -= 4294967296L;
        } else if (j15 < -4294967295L) {
            j15 += 4294967296L;
        }
        return (int) j15;
    }
}
