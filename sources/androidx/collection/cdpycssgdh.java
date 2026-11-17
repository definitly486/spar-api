package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public final class cdpycssgdh extends btonecajqb {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f4231gxszxtbevo;

    public cdpycssgdh(int i13) {
        super(null);
        if (!(i13 >= 0)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Capacity must be a positive value.");
        }
        ojitshcjhn(ribwqtqdhb.eablkybsjg(i13));
    }

    private final void agtfadlqog(int i13) {
        long[] jArr;
        if (i13 == 0) {
            jArr = ribwqtqdhb.f4359iobyxmoadg;
        } else {
            jArr = new long[((i13 + 15) & (-8)) >> 3];
            hg.agtfadlqog.istkbnxepw(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f4227iobyxmoadg = jArr;
        int i14 = i13 >> 3;
        long j13 = 255 << ((i13 & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        wflxmlrfwp();
    }

    private final int draadjrbmk(int i13) {
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f4229wkgbmnqykc;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr = this.f4227iobyxmoadg;
            int i23 = i18 >> 3;
            int i24 = (i18 & 7) << 3;
            long j13 = ((jArr[i23 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i23] >>> i24);
            long j14 = i16;
            int i25 = i19;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i18) & i17;
                if (this.f4230zoijcleaow[iNumberOfTrailingZeros] == i13) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iGtknphoqwx = gtknphoqwx(i15);
                if (this.f4231gxszxtbevo == 0 && ((this.f4227iobyxmoadg[iGtknphoqwx >> 3] >> ((iGtknphoqwx & 7) << 3)) & 255) != 254) {
                    nufgyqmvbu();
                    iGtknphoqwx = gtknphoqwx(i15);
                }
                this.f4226eablkybsjg++;
                int i26 = this.f4231gxszxtbevo;
                long[] jArr2 = this.f4227iobyxmoadg;
                int i27 = iGtknphoqwx >> 3;
                long j17 = jArr2[i27];
                int i28 = (iGtknphoqwx & 7) << 3;
                this.f4231gxszxtbevo = i26 - (((j17 >> i28) & 255) == 128 ? 1 : 0);
                int i29 = this.f4229wkgbmnqykc;
                long j18 = ((~(255 << i28)) & j17) | (j14 << i28);
                jArr2[i27] = j18;
                jArr2[(((iGtknphoqwx - 7) & i29) + (i29 & 7)) >> 3] = j18;
                return ~iGtknphoqwx;
            }
            i19 = i25 + 8;
            i18 = (i18 + i19) & i17;
        }
    }

    private final int gtknphoqwx(int i13) {
        int i14 = this.f4229wkgbmnqykc;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f4227iobyxmoadg;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j13 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j14 = j13 & ((~j13) << 7) & (-9187201950435737472L);
            if (j14 != 0) {
                return (i15 + (Long.numberOfTrailingZeros(j14) >> 3)) & i14;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final void ojitshcjhn(int i13) {
        int iMax = i13 > 0 ? Math.max(7, ribwqtqdhb.wkgbmnqykc(i13)) : 0;
        this.f4229wkgbmnqykc = iMax;
        agtfadlqog(iMax);
        this.f4230zoijcleaow = new int[iMax];
        this.f4228ppxfxbqfkf = new int[iMax];
    }

    private final void wflxmlrfwp() {
        this.f4231gxszxtbevo = ribwqtqdhb.iobyxmoadg(wkgbmnqykc()) - this.f4226eablkybsjg;
    }

    public final void btonecajqb() {
        long[] jArr = this.f4227iobyxmoadg;
        int i13 = this.f4229wkgbmnqykc;
        int[] iArr = this.f4230zoijcleaow;
        int[] iArr2 = this.f4228ppxfxbqfkf;
        int i14 = (i13 + 7) >> 3;
        char c13 = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            long j13 = jArr[i15] & (-9187201950435737472L);
            jArr[i15] = (-72340172838076674L) & ((~j13) + (j13 >>> 7));
        }
        int iBfopjjpdmp = hg.agtfadlqog.bfopjjpdmp(jArr);
        int i16 = iBfopjjpdmp - 1;
        long j14 = 72057594037927935L;
        jArr[i16] = (jArr[i16] & 72057594037927935L) | (-72057594037927936L);
        jArr[iBfopjjpdmp] = jArr[0];
        int i17 = 0;
        while (i17 != i13) {
            int i18 = i17 >> 3;
            int i19 = (i17 & 7) << 3;
            long j15 = (jArr[i18] >> i19) & 255;
            if (j15 != 128 && j15 == 254) {
                int iHashCode = Integer.hashCode(iArr[i17]) * (-862048943);
                int i23 = iHashCode ^ (iHashCode << 16);
                int i24 = i23 >>> 7;
                int iGtknphoqwx = gtknphoqwx(i24);
                int i25 = i24 & i13;
                if (((iGtknphoqwx - i25) & i13) / 8 == ((i17 - i25) & i13) / 8) {
                    jArr[i18] = (((long) (i23 & 127)) << i19) | ((~(255 << i19)) & jArr[i18]);
                    jArr[hg.agtfadlqog.bfopjjpdmp(jArr)] = (jArr[c13] & j14) | Long.MIN_VALUE;
                } else {
                    int i26 = iGtknphoqwx >> 3;
                    long j16 = jArr[i26];
                    int i27 = (iGtknphoqwx & 7) << 3;
                    if (((j16 >> i27) & 255) == 128) {
                        jArr[i26] = ((~(255 << i27)) & j16) | (((long) (i23 & 127)) << i27);
                        jArr[i18] = (jArr[i18] & (~(255 << i19))) | (128 << i19);
                        iArr[iGtknphoqwx] = iArr[i17];
                        iArr[i17] = 0;
                        iArr2[iGtknphoqwx] = iArr2[i17];
                        iArr2[i17] = 0;
                    } else {
                        jArr[i26] = (((long) (i23 & 127)) << i27) | ((~(255 << i27)) & j16);
                        int i28 = iArr[iGtknphoqwx];
                        iArr[iGtknphoqwx] = iArr[i17];
                        iArr[i17] = i28;
                        int i29 = iArr2[iGtknphoqwx];
                        iArr2[iGtknphoqwx] = iArr2[i17];
                        iArr2[i17] = i29;
                        i17--;
                    }
                    j14 = 72057594037927935L;
                    jArr[hg.agtfadlqog.bfopjjpdmp(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    i17++;
                    c13 = 0;
                }
            }
            i17++;
        }
        wflxmlrfwp();
    }

    public final void dxjokdxxww() {
        this.f4226eablkybsjg = 0;
        long[] jArr = this.f4227iobyxmoadg;
        if (jArr != ribwqtqdhb.f4359iobyxmoadg) {
            hg.agtfadlqog.istkbnxepw(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f4227iobyxmoadg;
            int i13 = this.f4229wkgbmnqykc;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        wflxmlrfwp();
    }

    public final void nufgyqmvbu() {
        if (this.f4229wkgbmnqykc <= 8 || Long.compareUnsigned(gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4226eablkybsjg) * 32), gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4229wkgbmnqykc) * 25)) > 0) {
            vdvldrhtss(ribwqtqdhb.ppxfxbqfkf(this.f4229wkgbmnqykc));
        } else {
            btonecajqb();
        }
    }

    public final void oxmwwwfdhm(int i13, int i14) {
        int iDraadjrbmk = draadjrbmk(i13);
        if (iDraadjrbmk < 0) {
            iDraadjrbmk = ~iDraadjrbmk;
        }
        this.f4230zoijcleaow[iDraadjrbmk] = i13;
        this.f4228ppxfxbqfkf[iDraadjrbmk] = i14;
    }

    public final void rgvfuqvkyq(int i13, int i14) {
        oxmwwwfdhm(i13, i14);
    }

    public final void vdvldrhtss(int i13) {
        cdpycssgdh cdpycssgdhVar = this;
        long[] jArr = cdpycssgdhVar.f4227iobyxmoadg;
        int[] iArr = cdpycssgdhVar.f4230zoijcleaow;
        int[] iArr2 = cdpycssgdhVar.f4228ppxfxbqfkf;
        int i14 = cdpycssgdhVar.f4229wkgbmnqykc;
        ojitshcjhn(i13);
        long[] jArr2 = cdpycssgdhVar.f4227iobyxmoadg;
        int[] iArr3 = cdpycssgdhVar.f4230zoijcleaow;
        int[] iArr4 = cdpycssgdhVar.f4228ppxfxbqfkf;
        int i15 = cdpycssgdhVar.f4229wkgbmnqykc;
        int i16 = 0;
        while (i16 < i14) {
            if (((jArr[i16 >> 3] >> ((i16 & 7) << 3)) & 255) < 128) {
                int i17 = iArr[i16];
                int iHashCode = Integer.hashCode(i17) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int iGtknphoqwx = cdpycssgdhVar.gtknphoqwx(i18 >>> 7);
                long j13 = i18 & 127;
                int i19 = iGtknphoqwx >> 3;
                int i23 = (iGtknphoqwx & 7) << 3;
                long j14 = (jArr2[i19] & (~(255 << i23))) | (j13 << i23);
                jArr2[i19] = j14;
                jArr2[(((iGtknphoqwx - 7) & i15) + (i15 & 7)) >> 3] = j14;
                iArr3[iGtknphoqwx] = i17;
                iArr4[iGtknphoqwx] = iArr2[i16];
            }
            i16++;
            cdpycssgdhVar = this;
            jArr = jArr;
        }
    }

    public /* synthetic */ cdpycssgdh(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 6 : i13);
    }
}
