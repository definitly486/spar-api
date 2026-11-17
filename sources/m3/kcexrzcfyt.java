package m3;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public interface kcexrzcfyt {

    public static class iobyxmoadg implements kcexrzcfyt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Random f65039iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int[] f65040ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int[] f65041zoijcleaow;

        public iobyxmoadg(int i13) {
            this(i13, new Random());
        }

        private static int[] nufgyqmvbu(int i13, Random random) {
            int[] iArr = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                int iNextInt = random.nextInt(i15);
                iArr[i14] = iArr[iNextInt];
                iArr[iNextInt] = i14;
                i14 = i15;
            }
            return iArr;
        }

        @Override // m3.kcexrzcfyt
        public kcexrzcfyt eablkybsjg() {
            return new iobyxmoadg(0, new Random(this.f65039iobyxmoadg.nextLong()));
        }

        @Override // m3.kcexrzcfyt
        public int getLength() {
            return this.f65041zoijcleaow.length;
        }

        @Override // m3.kcexrzcfyt
        public int gxszxtbevo() {
            int[] iArr = this.f65041zoijcleaow;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // m3.kcexrzcfyt
        public kcexrzcfyt iobyxmoadg(int i13, int i14) {
            int i15 = i14 - i13;
            int[] iArr = new int[this.f65041zoijcleaow.length - i15];
            int i16 = 0;
            int i17 = 0;
            while (true) {
                int[] iArr2 = this.f65041zoijcleaow;
                if (i16 >= iArr2.length) {
                    return new iobyxmoadg(iArr, new Random(this.f65039iobyxmoadg.nextLong()));
                }
                int i18 = iArr2[i16];
                if (i18 < i13 || i18 >= i14) {
                    int i19 = i16 - i17;
                    if (i18 >= i13) {
                        i18 -= i15;
                    }
                    iArr[i19] = i18;
                } else {
                    i17++;
                }
                i16++;
            }
        }

        @Override // m3.kcexrzcfyt
        public kcexrzcfyt lqeggnwhkg(int i13, int i14) {
            int[] iArr = new int[i14];
            int[] iArr2 = new int[i14];
            int i15 = 0;
            int i16 = 0;
            while (i16 < i14) {
                iArr[i16] = this.f65039iobyxmoadg.nextInt(this.f65041zoijcleaow.length + 1);
                int i17 = i16 + 1;
                int iNextInt = this.f65039iobyxmoadg.nextInt(i17);
                iArr2[i16] = iArr2[iNextInt];
                iArr2[iNextInt] = i16 + i13;
                i16 = i17;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f65041zoijcleaow.length + i14];
            int i18 = 0;
            int i19 = 0;
            while (true) {
                int[] iArr4 = this.f65041zoijcleaow;
                if (i15 >= iArr4.length + i14) {
                    return new iobyxmoadg(iArr3, new Random(this.f65039iobyxmoadg.nextLong()));
                }
                if (i18 >= i14 || i19 != iArr[i18]) {
                    int i23 = i19 + 1;
                    int i24 = iArr4[i19];
                    iArr3[i15] = i24;
                    if (i24 >= i13) {
                        iArr3[i15] = i24 + i14;
                    }
                    i19 = i23;
                } else {
                    iArr3[i15] = iArr2[i18];
                    i18++;
                }
                i15++;
            }
        }

        @Override // m3.kcexrzcfyt
        public int ppxfxbqfkf(int i13) {
            int i14 = this.f65040ppxfxbqfkf[i13] + 1;
            int[] iArr = this.f65041zoijcleaow;
            if (i14 < iArr.length) {
                return iArr[i14];
            }
            return -1;
        }

        @Override // m3.kcexrzcfyt
        public int wkgbmnqykc() {
            int[] iArr = this.f65041zoijcleaow;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // m3.kcexrzcfyt
        public int zoijcleaow(int i13) {
            int i14 = this.f65040ppxfxbqfkf[i13] - 1;
            if (i14 >= 0) {
                return this.f65041zoijcleaow[i14];
            }
            return -1;
        }

        private iobyxmoadg(int i13, Random random) {
            this(nufgyqmvbu(i13, random), random);
        }

        private iobyxmoadg(int[] iArr, Random random) {
            this.f65041zoijcleaow = iArr;
            this.f65039iobyxmoadg = random;
            this.f65040ppxfxbqfkf = new int[iArr.length];
            for (int i13 = 0; i13 < iArr.length; i13++) {
                this.f65040ppxfxbqfkf[iArr[i13]] = i13;
            }
        }
    }

    kcexrzcfyt eablkybsjg();

    int getLength();

    int gxszxtbevo();

    kcexrzcfyt iobyxmoadg(int i13, int i14);

    kcexrzcfyt lqeggnwhkg(int i13, int i14);

    int ppxfxbqfkf(int i13);

    int wkgbmnqykc();

    int zoijcleaow(int i13);
}
