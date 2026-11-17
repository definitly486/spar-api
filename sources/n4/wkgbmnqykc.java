package n4;

import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
abstract class wkgbmnqykc {

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final int[] f68700eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final long f68701gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long[] f68702iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public final long f68703lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f68704ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final long[] f68705wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int[] f68706zoijcleaow;

        private zoijcleaow(long[] jArr, int[] iArr, int i13, long[] jArr2, int[] iArr2, long j13, long j14) {
            this.f68702iobyxmoadg = jArr;
            this.f68706zoijcleaow = iArr;
            this.f68704ppxfxbqfkf = i13;
            this.f68705wkgbmnqykc = jArr2;
            this.f68700eablkybsjg = iArr2;
            this.f68701gxszxtbevo = j13;
            this.f68703lqeggnwhkg = j14;
        }
    }

    public static zoijcleaow iobyxmoadg(int i13, long[] jArr, int[] iArr, long j13) {
        int[] iArr2 = iArr;
        int i14 = 8192 / i13;
        int i15 = 0;
        int iBtonecajqb = 0;
        for (int i16 : iArr2) {
            iBtonecajqb += stevsuqkhv.btonecajqb(i16, i14);
        }
        long[] jArr2 = new long[iBtonecajqb];
        int[] iArr3 = new int[iBtonecajqb];
        long[] jArr3 = new long[iBtonecajqb];
        int[] iArr4 = new int[iBtonecajqb];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int iMax = 0;
        while (i15 < iArr2.length) {
            int i23 = iArr2[i15];
            long j14 = jArr[i15];
            while (i23 > 0) {
                int iMin = Math.min(i14, i23);
                jArr2[i19] = j14;
                int i24 = i13 * iMin;
                iArr3[i19] = i24;
                i18 += i24;
                iMax = Math.max(iMax, i24);
                jArr3[i19] = ((long) i17) * j13;
                iArr4[i19] = 1;
                j14 += (long) iArr3[i19];
                i17 += iMin;
                i23 -= iMin;
                i19++;
                i14 = i14;
            }
            i15++;
            iArr2 = iArr;
        }
        return new zoijcleaow(jArr2, iArr3, iMax, jArr3, iArr4, j13 * ((long) i17), i18);
    }
}
