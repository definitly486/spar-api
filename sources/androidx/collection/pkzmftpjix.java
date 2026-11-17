package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public final class pkzmftpjix extends iwizpuwonk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f4357eablkybsjg;

    public pkzmftpjix(int i13) {
        super(null);
        if (!(i13 >= 0)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Capacity must be a positive value.");
        }
        gtknphoqwx(ribwqtqdhb.eablkybsjg(i13));
    }

    private final void agtfadlqog(int i13) {
        this.f4295wkgbmnqykc--;
        long[] jArr = this.f4293iobyxmoadg;
        int i14 = this.f4294ppxfxbqfkf;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j13 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j13;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j13;
    }

    private final void btonecajqb(int i13) {
        long[] jArr;
        if (i13 == 0) {
            jArr = ribwqtqdhb.f4359iobyxmoadg;
        } else {
            jArr = new long[((i13 + 15) & (-8)) >> 3];
            hg.agtfadlqog.istkbnxepw(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f4293iobyxmoadg = jArr;
        int i14 = i13 >> 3;
        long j13 = 255 << ((i13 & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        dxjokdxxww();
    }

    private final void dxjokdxxww() {
        this.f4357eablkybsjg = ribwqtqdhb.iobyxmoadg(zoijcleaow()) - this.f4295wkgbmnqykc;
    }

    private final void gtknphoqwx(int i13) {
        int iMax = i13 > 0 ? Math.max(7, ribwqtqdhb.wkgbmnqykc(i13)) : 0;
        this.f4294ppxfxbqfkf = iMax;
        btonecajqb(iMax);
        this.f4296zoijcleaow = new long[iMax];
    }

    private final int lqeggnwhkg(long j13) {
        int iHashCode = Long.hashCode(j13) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f4294ppxfxbqfkf;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f4293iobyxmoadg;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j14 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j15 = i15;
            int i24 = i18;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            for (long j17 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L); j17 != 0; j17 &= j17 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i17) & i16;
                if (this.f4296zoijcleaow[iNumberOfTrailingZeros] == j13) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j14) << 6) & j14 & (-9187201950435737472L)) != 0) {
                int iNufgyqmvbu = nufgyqmvbu(i14);
                if (this.f4357eablkybsjg == 0 && ((this.f4293iobyxmoadg[iNufgyqmvbu >> 3] >> ((iNufgyqmvbu & 7) << 3)) & 255) != 254) {
                    eablkybsjg();
                    iNufgyqmvbu = nufgyqmvbu(i14);
                }
                this.f4295wkgbmnqykc++;
                int i25 = this.f4357eablkybsjg;
                long[] jArr2 = this.f4293iobyxmoadg;
                int i26 = iNufgyqmvbu >> 3;
                long j18 = jArr2[i26];
                int i27 = (iNufgyqmvbu & 7) << 3;
                this.f4357eablkybsjg = i25 - (((j18 >> i27) & 255) == 128 ? 1 : 0);
                int i28 = this.f4294ppxfxbqfkf;
                long j19 = ((~(255 << i27)) & j18) | (j15 << i27);
                jArr2[i26] = j19;
                jArr2[(((iNufgyqmvbu - 7) & i28) + (i28 & 7)) >> 3] = j19;
                return iNufgyqmvbu;
            }
            i18 = i24 + 8;
            i17 = (i17 + i18) & i16;
        }
    }

    private final int nufgyqmvbu(int i13) {
        int i14 = this.f4294ppxfxbqfkf;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f4293iobyxmoadg;
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

    public final void draadjrbmk(long j13) {
        this.f4296zoijcleaow[lqeggnwhkg(j13)] = j13;
    }

    public final void eablkybsjg() {
        if (this.f4294ppxfxbqfkf <= 8 || Long.compareUnsigned(gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4295wkgbmnqykc) * 32), gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4294ppxfxbqfkf) * 25)) > 0) {
            ojitshcjhn(ribwqtqdhb.ppxfxbqfkf(this.f4294ppxfxbqfkf));
        } else {
            gxszxtbevo();
        }
    }

    public final void gxszxtbevo() {
        long[] jArr = this.f4293iobyxmoadg;
        int i13 = this.f4294ppxfxbqfkf;
        long[] jArr2 = this.f4296zoijcleaow;
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
                int iHashCode = Long.hashCode(jArr2[i17]) * (-862048943);
                int i23 = iHashCode ^ (iHashCode << 16);
                int i24 = i23 >>> 7;
                int iNufgyqmvbu = nufgyqmvbu(i24);
                int i25 = i24 & i13;
                if (((iNufgyqmvbu - i25) & i13) / 8 == ((i17 - i25) & i13) / 8) {
                    jArr[i18] = (((long) (i23 & 127)) << i19) | ((~(255 << i19)) & jArr[i18]);
                    jArr[hg.agtfadlqog.bfopjjpdmp(jArr)] = (jArr[c13] & j14) | Long.MIN_VALUE;
                } else {
                    int i26 = iNufgyqmvbu >> 3;
                    long j16 = jArr[i26];
                    int i27 = (iNufgyqmvbu & 7) << 3;
                    if (((j16 >> i27) & 255) == 128) {
                        jArr[i26] = ((~(255 << i27)) & j16) | (((long) (i23 & 127)) << i27);
                        jArr[i18] = (jArr[i18] & (~(255 << i19))) | (128 << i19);
                        jArr2[iNufgyqmvbu] = jArr2[i17];
                        jArr2[i17] = 0;
                    } else {
                        jArr[i26] = (((long) (i23 & 127)) << i27) | ((~(255 << i27)) & j16);
                        long j17 = jArr2[iNufgyqmvbu];
                        jArr2[iNufgyqmvbu] = jArr2[i17];
                        jArr2[i17] = j17;
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
        dxjokdxxww();
    }

    public final void ojitshcjhn(int i13) {
        long[] jArr = this.f4293iobyxmoadg;
        long[] jArr2 = this.f4296zoijcleaow;
        int i14 = this.f4294ppxfxbqfkf;
        gtknphoqwx(i13);
        long[] jArr3 = this.f4293iobyxmoadg;
        long[] jArr4 = this.f4296zoijcleaow;
        int i15 = this.f4294ppxfxbqfkf;
        for (int i16 = 0; i16 < i14; i16++) {
            if (((jArr[i16 >> 3] >> ((i16 & 7) << 3)) & 255) < 128) {
                long j13 = jArr2[i16];
                int iHashCode = Long.hashCode(j13) * (-862048943);
                int i17 = iHashCode ^ (iHashCode << 16);
                int iNufgyqmvbu = nufgyqmvbu(i17 >>> 7);
                long j14 = i17 & 127;
                int i18 = iNufgyqmvbu >> 3;
                int i19 = (iNufgyqmvbu & 7) << 3;
                long j15 = (jArr3[i18] & (~(255 << i19))) | (j14 << i19);
                jArr3[i18] = j15;
                jArr3[(((iNufgyqmvbu - 7) & i15) + (i15 & 7)) >> 3] = j15;
                jArr4[iNufgyqmvbu] = j13;
            }
        }
    }

    public final boolean wflxmlrfwp(long j13) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j13) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f4294ppxfxbqfkf;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f4293iobyxmoadg;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j14 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j15 = (((long) i14) * 72340172838076673L) ^ j14;
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i16) & i15;
                if (this.f4296zoijcleaow[iNumberOfTrailingZeros] == j13) {
                    break loop0;
                }
            }
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
        boolean z13 = iNumberOfTrailingZeros >= 0;
        if (z13) {
            agtfadlqog(iNumberOfTrailingZeros);
        }
        return z13;
    }
}
