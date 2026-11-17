package org.xbill.DNS;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {
    static void iobyxmoadg(long j13) {
        if (j13 < 0 || j13 > 2147483647L) {
            throw new InvalidTTLException(j13);
        }
    }

    public static String zoijcleaow(long j13) {
        iobyxmoadg(j13);
        StringBuilder sb3 = new StringBuilder();
        long j14 = j13 % 60;
        long j15 = j13 / 60;
        long j16 = j15 % 60;
        long j17 = j15 / 60;
        long j18 = j17 % 24;
        long j19 = j17 / 24;
        long j23 = j19 % 7;
        long j24 = j19 / 7;
        if (j24 > 0) {
            sb3.append(j24);
            sb3.append("W");
        }
        if (j23 > 0) {
            sb3.append(j23);
            sb3.append("D");
        }
        if (j18 > 0) {
            sb3.append(j18);
            sb3.append("H");
        }
        if (j16 > 0) {
            sb3.append(j16);
            sb3.append("M");
        }
        if (j14 > 0 || (j24 == 0 && j23 == 0 && j18 == 0 && j16 == 0)) {
            sb3.append(j14);
            sb3.append("S");
        }
        return sb3.toString();
    }
}
