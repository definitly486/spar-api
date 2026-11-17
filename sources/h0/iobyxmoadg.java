package h0;

import java.util.Arrays;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.oxmwwwfdhm;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int f39001ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public long[] f39000iobyxmoadg = new long[192];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public long[] f39002zoijcleaow = new long[192];

    private final void gtknphoqwx(long j13, int i13, int i14) {
        int i15;
        char c13;
        int i16;
        char c14;
        long[] jArr = this.f39000iobyxmoadg;
        long[] jArr2 = this.f39002zoijcleaow;
        ppxfxbqfkf();
        jArr2[0] = j13;
        int i17 = 1;
        while (i17 > 0) {
            i17--;
            long j14 = jArr2[i17];
            int i18 = 67108863;
            int i19 = ((int) j14) & 67108863;
            char c15 = 26;
            int i23 = ((int) (j14 >> 26)) & 67108863;
            char c16 = 511;
            int i24 = ((int) (j14 >> 52)) & 511;
            int length = i24 == 511 ? jArr.length : i24 + i23;
            if (i23 < 0) {
                return;
            }
            while (i23 < jArr.length - 2 && i23 < length) {
                int i25 = i23 + 2;
                long j15 = jArr[i25];
                if ((((int) (j15 >> c15)) & i18) == i19) {
                    long j16 = jArr[i23];
                    int i26 = i23 + 1;
                    long j17 = jArr[i26];
                    i15 = i19;
                    jArr[i23] = (((long) (((int) j16) + i14)) & 4294967295L) | (((long) (((int) (j16 >> 32)) + i13)) << 32);
                    jArr[i26] = (((long) (((int) j17) + i14)) & 4294967295L) | (((long) (((int) (j17 >> 32)) + i13)) << 32);
                    jArr[i25] = 2305843009213693952L | j15;
                    c13 = 511;
                    if ((((int) (j15 >> 52)) & 511) > 0) {
                        i16 = 67108863;
                        c14 = 26;
                        jArr2[i17] = (j15 & (-4503599560261633L)) | (((long) ((i23 + 3) & 67108863)) << 26);
                        i17++;
                    } else {
                        c14 = 26;
                        i16 = 67108863;
                    }
                } else {
                    i15 = i19;
                    c13 = c16;
                    char c17 = c15;
                    i16 = i18;
                    c14 = c17;
                }
                i23 += 3;
                c16 = c13;
                i19 = i15;
                int i27 = i16;
                c15 = c14;
                i18 = i27;
            }
        }
    }

    private final void nufgyqmvbu(int i13, int i14, long[] jArr) {
        int iMax = Math.max(i13 * 2, i14 + 3);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
        zdlpuopuiu.dxjokdxxww(jArrCopyOf, "copyOf(...)");
        this.f39000iobyxmoadg = jArrCopyOf;
        long[] jArrCopyOf2 = Arrays.copyOf(this.f39002zoijcleaow, iMax);
        zdlpuopuiu.dxjokdxxww(jArrCopyOf2, "copyOf(...)");
        this.f39002zoijcleaow = jArrCopyOf2;
    }

    public final boolean btonecajqb(int i13, boolean z13, boolean z14) {
        int i14 = i13 & 67108863;
        long[] jArr = this.f39000iobyxmoadg;
        int i15 = this.f39001ppxfxbqfkf;
        for (int i16 = 0; i16 < jArr.length - 2 && i16 < i15; i16 += 3) {
            int i17 = i16 + 2;
            long j13 = jArr[i17];
            if ((((int) j13) & 67108863) == i14) {
                jArr[i17] = ((z13 ? 1L : 0L) * 4611686018427387904L) | (4611686018427387903L & j13) | ((z14 ? 1L : 0L) * Long.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    public final boolean draadjrbmk(int i13, oxmwwwfdhm oxmwwwfdhmVar) {
        int i14 = i13 & 67108863;
        long[] jArr = this.f39000iobyxmoadg;
        int i15 = this.f39001ppxfxbqfkf;
        for (int i16 = 0; i16 < jArr.length - 2 && i16 < i15; i16 += 3) {
            if ((((int) jArr[i16 + 2]) & 67108863) == i14) {
                long j13 = jArr[i16];
                long j14 = jArr[i16 + 1];
                oxmwwwfdhmVar.invoke(Integer.valueOf((int) (j13 >> 32)), Integer.valueOf((int) j13), Integer.valueOf((int) (j14 >> 32)), Integer.valueOf((int) j14));
                return true;
            }
        }
        return false;
    }

    public final boolean dxjokdxxww(int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 & 67108863;
        long[] jArr = this.f39000iobyxmoadg;
        int i19 = this.f39001ppxfxbqfkf;
        for (int i23 = 0; i23 < jArr.length - 2 && i23 < i19; i23 += 3) {
            int i24 = i23 + 2;
            long j13 = jArr[i24];
            if ((((int) j13) & 67108863) == i18) {
                jArr[i23] = (((long) i14) << 32) | (((long) i15) & 4294967295L);
                jArr[i23 + 1] = (((long) i16) << 32) | (((long) i17) & 4294967295L);
                jArr[i24] = 2305843009213693952L | j13;
                return true;
            }
        }
        return false;
    }

    public final void eablkybsjg(int i13) {
        int i14 = i13 & 67108863;
        long[] jArr = this.f39000iobyxmoadg;
        int i15 = this.f39001ppxfxbqfkf;
        for (int i16 = 0; i16 < jArr.length - 2 && i16 < i15; i16 += 3) {
            int i17 = i16 + 2;
            long j13 = jArr[i17];
            if ((((int) j13) & 67108863) == i14) {
                jArr[i17] = 2305843009213693952L | j13;
                return;
            }
        }
    }

    public final boolean gxszxtbevo(int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 & 67108863;
        long[] jArr = this.f39000iobyxmoadg;
        int i19 = this.f39001ppxfxbqfkf;
        for (int i23 = 0; i23 < jArr.length - 2 && i23 < i19; i23 += 3) {
            int i24 = i23 + 2;
            long j13 = jArr[i24];
            if ((((int) j13) & 67108863) == i18) {
                long j14 = jArr[i23];
                jArr[i23] = (((long) i15) & 4294967295L) | (((long) i14) << 32);
                int i25 = i23;
                jArr[i23 + 1] = (((long) i17) & 4294967295L) | (((long) i16) << 32);
                jArr[i24] = 2305843009213693952L | j13;
                int i26 = i14 - ((int) (j14 >> 32));
                int i27 = i15 - ((int) j14);
                if ((i26 != 0) | (i27 != 0)) {
                    gtknphoqwx(((-4503599560261633L) & j13) | (((long) ((i25 + 3) & 67108863)) << 26), i26, i27);
                }
                return true;
            }
        }
        return false;
    }

    public final void iobyxmoadg() {
        long[] jArr = this.f39000iobyxmoadg;
        int i13 = this.f39001ppxfxbqfkf;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            int i15 = i14 + 2;
            jArr[i15] = jArr[i15] & (-2305843009213693953L);
        }
    }

    public final boolean lqeggnwhkg(int i13) {
        int i14 = i13 & 67108863;
        long[] jArr = this.f39000iobyxmoadg;
        int i15 = this.f39001ppxfxbqfkf;
        for (int i16 = 0; i16 < jArr.length - 2 && i16 < i15; i16 += 3) {
            int i17 = i16 + 2;
            if ((((int) jArr[i17]) & 67108863) == i14) {
                jArr[i16] = -1;
                jArr[i16 + 1] = -1;
                jArr[i17] = 2305843009213693951L;
                return true;
            }
        }
        return false;
    }

    public final int ppxfxbqfkf() {
        return this.f39001ppxfxbqfkf / 3;
    }

    public final void wkgbmnqykc(int i13, int i14, int i15, int i16, int i17, int i18, boolean z13, boolean z14) {
        long[] jArr = this.f39000iobyxmoadg;
        int i19 = this.f39001ppxfxbqfkf;
        int i23 = i19 + 3;
        this.f39001ppxfxbqfkf = i23;
        int length = jArr.length;
        if (length <= i23) {
            nufgyqmvbu(length, i19, jArr);
        }
        long[] jArr2 = this.f39000iobyxmoadg;
        jArr2[i19] = (((long) i14) << 32) | (((long) i15) & 4294967295L);
        jArr2[i19 + 1] = (((long) i16) << 32) | (((long) i17) & 4294967295L);
        int i24 = i18 & 67108863;
        jArr2[i19 + 2] = ((z14 ? 1L : 0L) << 63) | ((z13 ? 1L : 0L) << 62) | (((long) 1) << 61) | (((long) Math.min(0, 511)) << 52) | (((long) i24) << 26) | ((long) (i13 & 67108863));
        if (i18 < 0) {
            return;
        }
        for (int i25 = i19 - 3; i25 >= 0; i25 -= 3) {
            int i26 = i25 + 2;
            long j13 = jArr2[i26];
            if ((((int) j13) & 67108863) == i24) {
                jArr2[i26] = (((long) Math.min(i19 - i25, 511)) << 52) | ((-2301339409586323457L) & j13);
                return;
            }
        }
    }

    public final void zoijcleaow() {
        long[] jArr = this.f39000iobyxmoadg;
        int i13 = this.f39001ppxfxbqfkf;
        long[] jArr2 = this.f39002zoijcleaow;
        int i14 = 0;
        for (int i15 = 0; i15 < jArr.length - 2 && i14 < jArr2.length - 2 && i15 < i13; i15 += 3) {
            int i16 = i15 + 2;
            if (jArr[i16] != 2305843009213693951L) {
                jArr2[i14] = jArr[i15];
                jArr2[i14 + 1] = jArr[i15 + 1];
                jArr2[i14 + 2] = jArr[i16];
                i14 += 3;
            }
        }
        this.f39001ppxfxbqfkf = i14;
        this.f39000iobyxmoadg = jArr2;
        this.f39002zoijcleaow = jArr;
    }
}
