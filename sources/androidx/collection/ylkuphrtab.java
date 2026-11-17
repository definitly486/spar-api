package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public final class ylkuphrtab extends yggfygwlhe {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f4412gxszxtbevo;

    public /* synthetic */ ylkuphrtab(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 6 : i13);
    }

    private final int btonecajqb(int i13) {
        int i14 = this.f4410wkgbmnqykc;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f4408iobyxmoadg;
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

    private final void draadjrbmk(int i13) {
        long[] jArr;
        if (i13 == 0) {
            jArr = ribwqtqdhb.f4359iobyxmoadg;
        } else {
            jArr = new long[((i13 + 15) & (-8)) >> 3];
            hg.agtfadlqog.istkbnxepw(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f4408iobyxmoadg = jArr;
        int i14 = i13 >> 3;
        long j13 = 255 << ((i13 & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        gtknphoqwx();
    }

    private final int dxjokdxxww(long j13) {
        int iHashCode = Long.hashCode(j13) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f4410wkgbmnqykc;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f4408iobyxmoadg;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j14 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j15 = i15;
            int i24 = i18;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            for (long j17 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L); j17 != 0; j17 &= j17 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i17) & i16;
                if (this.f4411zoijcleaow[iNumberOfTrailingZeros] == j13) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j14) << 6) & j14 & (-9187201950435737472L)) != 0) {
                int iBtonecajqb = btonecajqb(i14);
                if (this.f4412gxszxtbevo == 0 && ((this.f4408iobyxmoadg[iBtonecajqb >> 3] >> ((iBtonecajqb & 7) << 3)) & 255) != 254) {
                    gxszxtbevo();
                    iBtonecajqb = btonecajqb(i14);
                }
                this.f4407eablkybsjg++;
                int i25 = this.f4412gxszxtbevo;
                long[] jArr2 = this.f4408iobyxmoadg;
                int i26 = iBtonecajqb >> 3;
                long j18 = jArr2[i26];
                int i27 = (iBtonecajqb & 7) << 3;
                this.f4412gxszxtbevo = i25 - (((j18 >> i27) & 255) == 128 ? 1 : 0);
                int i28 = this.f4410wkgbmnqykc;
                long j19 = ((~(255 << i27)) & j18) | (j15 << i27);
                jArr2[i26] = j19;
                jArr2[(((iBtonecajqb - 7) & i28) + (i28 & 7)) >> 3] = j19;
                return iBtonecajqb;
            }
            i18 = i24 + 8;
            i17 = (i17 + i18) & i16;
        }
    }

    private final void gtknphoqwx() {
        this.f4412gxszxtbevo = ribwqtqdhb.iobyxmoadg(ppxfxbqfkf()) - this.f4407eablkybsjg;
    }

    private final void wflxmlrfwp(int i13) {
        int iMax = i13 > 0 ? Math.max(7, ribwqtqdhb.wkgbmnqykc(i13)) : 0;
        this.f4410wkgbmnqykc = iMax;
        draadjrbmk(iMax);
        this.f4411zoijcleaow = new long[iMax];
        this.f4409ppxfxbqfkf = new Object[iMax];
    }

    public final Object agtfadlqog(long j13) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j13) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f4410wkgbmnqykc;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f4408iobyxmoadg;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j14 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j15 = (((long) i14) * 72340172838076673L) ^ j14;
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i16) & i15;
                if (this.f4411zoijcleaow[iNumberOfTrailingZeros] == j13) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return ojitshcjhn(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final void gxszxtbevo() {
        if (this.f4410wkgbmnqykc <= 8 || Long.compareUnsigned(gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4407eablkybsjg) * 32), gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4410wkgbmnqykc) * 25)) > 0) {
            rgvfuqvkyq(ribwqtqdhb.ppxfxbqfkf(this.f4410wkgbmnqykc));
        } else {
            nufgyqmvbu();
        }
    }

    public final void lqeggnwhkg() {
        this.f4407eablkybsjg = 0;
        long[] jArr = this.f4408iobyxmoadg;
        if (jArr != ribwqtqdhb.f4359iobyxmoadg) {
            hg.agtfadlqog.istkbnxepw(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f4408iobyxmoadg;
            int i13 = this.f4410wkgbmnqykc;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        hg.agtfadlqog.lereixgezr(this.f4409ppxfxbqfkf, null, 0, this.f4410wkgbmnqykc);
        gtknphoqwx();
    }

    public final void nufgyqmvbu() {
        long[] jArr = this.f4408iobyxmoadg;
        int i13 = this.f4410wkgbmnqykc;
        long[] jArr2 = this.f4411zoijcleaow;
        Object[] objArr = this.f4409ppxfxbqfkf;
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
                int iBtonecajqb = btonecajqb(i24);
                int i25 = i24 & i13;
                if (((iBtonecajqb - i25) & i13) / 8 == ((i17 - i25) & i13) / 8) {
                    jArr[i18] = (((long) (i23 & 127)) << i19) | ((~(255 << i19)) & jArr[i18]);
                    jArr[hg.agtfadlqog.bfopjjpdmp(jArr)] = (jArr[c13] & j14) | Long.MIN_VALUE;
                } else {
                    int i26 = iBtonecajqb >> 3;
                    long j16 = jArr[i26];
                    int i27 = (iBtonecajqb & 7) << 3;
                    if (((j16 >> i27) & 255) == 128) {
                        jArr[i26] = ((~(255 << i27)) & j16) | (((long) (i23 & 127)) << i27);
                        jArr[i18] = (jArr[i18] & (~(255 << i19))) | (128 << i19);
                        jArr2[iBtonecajqb] = jArr2[i17];
                        jArr2[i17] = 0;
                        objArr[iBtonecajqb] = objArr[i17];
                        objArr[i17] = null;
                    } else {
                        jArr[i26] = (((long) (i23 & 127)) << i27) | ((~(255 << i27)) & j16);
                        long j17 = jArr2[iBtonecajqb];
                        jArr2[iBtonecajqb] = jArr2[i17];
                        jArr2[i17] = j17;
                        Object obj = objArr[iBtonecajqb];
                        objArr[iBtonecajqb] = objArr[i17];
                        objArr[i17] = obj;
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
        gtknphoqwx();
    }

    public final Object ojitshcjhn(int i13) {
        this.f4407eablkybsjg--;
        long[] jArr = this.f4408iobyxmoadg;
        int i14 = this.f4410wkgbmnqykc;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j13 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j13;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j13;
        Object[] objArr = this.f4409ppxfxbqfkf;
        Object obj = objArr[i13];
        objArr[i13] = null;
        return obj;
    }

    public final void rgvfuqvkyq(int i13) {
        ylkuphrtab ylkuphrtabVar = this;
        long[] jArr = ylkuphrtabVar.f4408iobyxmoadg;
        long[] jArr2 = ylkuphrtabVar.f4411zoijcleaow;
        Object[] objArr = ylkuphrtabVar.f4409ppxfxbqfkf;
        int i14 = ylkuphrtabVar.f4410wkgbmnqykc;
        wflxmlrfwp(i13);
        long[] jArr3 = ylkuphrtabVar.f4408iobyxmoadg;
        long[] jArr4 = ylkuphrtabVar.f4411zoijcleaow;
        Object[] objArr2 = ylkuphrtabVar.f4409ppxfxbqfkf;
        int i15 = ylkuphrtabVar.f4410wkgbmnqykc;
        int i16 = 0;
        while (i16 < i14) {
            if (((jArr[i16 >> 3] >> ((i16 & 7) << 3)) & 255) < 128) {
                long j13 = jArr2[i16];
                int iHashCode = Long.hashCode(j13) * (-862048943);
                int i17 = iHashCode ^ (iHashCode << 16);
                int iBtonecajqb = ylkuphrtabVar.btonecajqb(i17 >>> 7);
                long j14 = i17 & 127;
                int i18 = iBtonecajqb >> 3;
                int i19 = (iBtonecajqb & 7) << 3;
                long j15 = (jArr3[i18] & (~(255 << i19))) | (j14 << i19);
                jArr3[i18] = j15;
                jArr3[(((iBtonecajqb - 7) & i15) + (i15 & 7)) >> 3] = j15;
                jArr4[iBtonecajqb] = j13;
                objArr2[iBtonecajqb] = objArr[i16];
            }
            i16++;
            ylkuphrtabVar = this;
            jArr = jArr;
        }
    }

    public final void vdvldrhtss(long j13, Object obj) {
        int iDxjokdxxww = dxjokdxxww(j13);
        this.f4411zoijcleaow[iDxjokdxxww] = j13;
        this.f4409ppxfxbqfkf[iDxjokdxxww] = obj;
    }

    public ylkuphrtab(int i13) {
        super(null);
        if (!(i13 >= 0)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Capacity must be a positive value.");
        }
        wflxmlrfwp(ribwqtqdhb.eablkybsjg(i13));
    }
}
