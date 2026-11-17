package jlmebxxoox;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final int[] f51694iobyxmoadg = new int[0];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final long[] f51696zoijcleaow = new long[0];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final Object[] f51695ppxfxbqfkf = new Object[0];

    public static final int eablkybsjg(int i13) {
        return wkgbmnqykc(i13 * 4) / 4;
    }

    public static final int gxszxtbevo(int i13) {
        return wkgbmnqykc(i13 * 8) / 8;
    }

    public static final int iobyxmoadg(int[] array, int i13, int i14) {
        zdlpuopuiu.btonecajqb(array, "array");
        int i15 = i13 - 1;
        int i16 = 0;
        while (i16 <= i15) {
            int i17 = (i16 + i15) >>> 1;
            int i18 = array[i17];
            if (i18 < i14) {
                i16 = i17 + 1;
            } else {
                if (i18 <= i14) {
                    return i17;
                }
                i15 = i17 - 1;
            }
        }
        return ~i16;
    }

    public static final boolean ppxfxbqfkf(Object obj, Object obj2) {
        return zdlpuopuiu.eablkybsjg(obj, obj2);
    }

    public static final int wkgbmnqykc(int i13) {
        for (int i14 = 4; i14 < 32; i14++) {
            int i15 = (1 << i14) - 12;
            if (i13 <= i15) {
                return i15;
            }
        }
        return i13;
    }

    public static final int zoijcleaow(long[] array, int i13, long j13) {
        zdlpuopuiu.btonecajqb(array, "array");
        int i14 = i13 - 1;
        int i15 = 0;
        while (i15 <= i14) {
            int i16 = (i15 + i14) >>> 1;
            long j14 = array[i16];
            if (j14 < j13) {
                i15 = i16 + 1;
            } else {
                if (j14 <= j13) {
                    return i16;
                }
                i14 = i16 - 1;
            }
        }
        return ~i15;
    }
}
