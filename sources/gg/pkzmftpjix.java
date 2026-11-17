package gg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pkzmftpjix {
    public static final int iobyxmoadg(int i13, int i14) {
        return kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(i13 ^ Integer.MIN_VALUE, i14 ^ Integer.MIN_VALUE);
    }

    public static final double ppxfxbqfkf(long j13) {
        return ((j13 >>> 11) * ((double) 2048)) + (j13 & 2047);
    }

    public static final String wkgbmnqykc(long j13, int i13) {
        if (j13 >= 0) {
            String string = Long.toString(j13, mj.iobyxmoadg.iobyxmoadg(i13));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
            return string;
        }
        long j14 = i13;
        long j15 = ((j13 >>> 1) / j14) << 1;
        long j16 = j13 - (j15 * j14);
        if (j16 >= j14) {
            j16 -= j14;
            j15++;
        }
        StringBuilder sb3 = new StringBuilder();
        String string2 = Long.toString(j15, mj.iobyxmoadg.iobyxmoadg(i13));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string2, "toString(...)");
        sb3.append(string2);
        String string3 = Long.toString(j16, mj.iobyxmoadg.iobyxmoadg(i13));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string3, "toString(...)");
        sb3.append(string3);
        return sb3.toString();
    }

    public static final int zoijcleaow(long j13, long j14) {
        return kotlin.jvm.internal.zdlpuopuiu.wflxmlrfwp(j13 ^ Long.MIN_VALUE, j14 ^ Long.MIN_VALUE);
    }
}
