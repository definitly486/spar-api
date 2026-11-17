package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public final class iozdgvuglv extends ojitshcjhn {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f4288gxszxtbevo;

    public /* synthetic */ iozdgvuglv(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 6 : i13);
    }

    private final int btonecajqb(int i13) {
        int i14 = this.f4352wkgbmnqykc;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f4350iobyxmoadg;
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
        this.f4350iobyxmoadg = jArr;
        int i14 = i13 >> 3;
        long j13 = 255 << ((i13 & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        gtknphoqwx();
    }

    private final int dxjokdxxww(int i13) {
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f4352wkgbmnqykc;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr = this.f4350iobyxmoadg;
            int i23 = i18 >> 3;
            int i24 = (i18 & 7) << 3;
            long j13 = ((jArr[i23 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i23] >>> i24);
            long j14 = i16;
            int i25 = i19;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i18) & i17;
                if (this.f4353zoijcleaow[iNumberOfTrailingZeros] == i13) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iBtonecajqb = btonecajqb(i15);
                if (this.f4288gxszxtbevo == 0 && ((this.f4350iobyxmoadg[iBtonecajqb >> 3] >> ((iBtonecajqb & 7) << 3)) & 255) != 254) {
                    gxszxtbevo();
                    iBtonecajqb = btonecajqb(i15);
                }
                this.f4349eablkybsjg++;
                int i26 = this.f4288gxszxtbevo;
                long[] jArr2 = this.f4350iobyxmoadg;
                int i27 = iBtonecajqb >> 3;
                long j17 = jArr2[i27];
                int i28 = (iBtonecajqb & 7) << 3;
                this.f4288gxszxtbevo = i26 - (((j17 >> i28) & 255) == 128 ? 1 : 0);
                int i29 = this.f4352wkgbmnqykc;
                long j18 = ((~(255 << i28)) & j17) | (j14 << i28);
                jArr2[i27] = j18;
                jArr2[(((iBtonecajqb - 7) & i29) + (i29 & 7)) >> 3] = j18;
                return iBtonecajqb;
            }
            i19 = i25 + 8;
            i18 = (i18 + i19) & i17;
        }
    }

    private final void gtknphoqwx() {
        this.f4288gxszxtbevo = ribwqtqdhb.iobyxmoadg(ppxfxbqfkf()) - this.f4349eablkybsjg;
    }

    private final void wflxmlrfwp(int i13) {
        int iMax = i13 > 0 ? Math.max(7, ribwqtqdhb.wkgbmnqykc(i13)) : 0;
        this.f4352wkgbmnqykc = iMax;
        draadjrbmk(iMax);
        this.f4353zoijcleaow = new int[iMax];
        this.f4351ppxfxbqfkf = new Object[iMax];
    }

    public final Object agtfadlqog(int i13, Object obj) {
        int iDxjokdxxww = dxjokdxxww(i13);
        Object[] objArr = this.f4351ppxfxbqfkf;
        Object obj2 = objArr[iDxjokdxxww];
        this.f4353zoijcleaow[iDxjokdxxww] = i13;
        objArr[iDxjokdxxww] = obj;
        return obj2;
    }

    public final void gxszxtbevo() {
        if (this.f4352wkgbmnqykc <= 8 || Long.compareUnsigned(gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4349eablkybsjg) * 32), gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4352wkgbmnqykc) * 25)) > 0) {
            vdvldrhtss(ribwqtqdhb.ppxfxbqfkf(this.f4352wkgbmnqykc));
        } else {
            nufgyqmvbu();
        }
    }

    public final void lqeggnwhkg() {
        this.f4349eablkybsjg = 0;
        long[] jArr = this.f4350iobyxmoadg;
        if (jArr != ribwqtqdhb.f4359iobyxmoadg) {
            hg.agtfadlqog.istkbnxepw(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f4350iobyxmoadg;
            int i13 = this.f4352wkgbmnqykc;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        hg.agtfadlqog.lereixgezr(this.f4351ppxfxbqfkf, null, 0, this.f4352wkgbmnqykc);
        gtknphoqwx();
    }

    public final void nufgyqmvbu() {
        long[] jArr = this.f4350iobyxmoadg;
        int i13 = this.f4352wkgbmnqykc;
        int[] iArr = this.f4353zoijcleaow;
        Object[] objArr = this.f4351ppxfxbqfkf;
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
                        iArr[iBtonecajqb] = iArr[i17];
                        iArr[i17] = 0;
                        objArr[iBtonecajqb] = objArr[i17];
                        objArr[i17] = null;
                    } else {
                        jArr[i26] = (((long) (i23 & 127)) << i27) | ((~(255 << i27)) & j16);
                        int i28 = iArr[iBtonecajqb];
                        iArr[iBtonecajqb] = iArr[i17];
                        iArr[i17] = i28;
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
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f4352wkgbmnqykc;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f4350iobyxmoadg;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (((long) i15) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                if (this.f4353zoijcleaow[iNumberOfTrailingZeros] == i13) {
                    break loop0;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return rgvfuqvkyq(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final void oxmwwwfdhm(int i13, Object obj) {
        int iDxjokdxxww = dxjokdxxww(i13);
        this.f4353zoijcleaow[iDxjokdxxww] = i13;
        this.f4351ppxfxbqfkf[iDxjokdxxww] = obj;
    }

    public final Object rgvfuqvkyq(int i13) {
        this.f4349eablkybsjg--;
        long[] jArr = this.f4350iobyxmoadg;
        int i14 = this.f4352wkgbmnqykc;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j13 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j13;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j13;
        Object[] objArr = this.f4351ppxfxbqfkf;
        Object obj = objArr[i13];
        objArr[i13] = null;
        return obj;
    }

    public final void vdvldrhtss(int i13) {
        iozdgvuglv iozdgvuglvVar = this;
        long[] jArr = iozdgvuglvVar.f4350iobyxmoadg;
        int[] iArr = iozdgvuglvVar.f4353zoijcleaow;
        Object[] objArr = iozdgvuglvVar.f4351ppxfxbqfkf;
        int i14 = iozdgvuglvVar.f4352wkgbmnqykc;
        wflxmlrfwp(i13);
        long[] jArr2 = iozdgvuglvVar.f4350iobyxmoadg;
        int[] iArr2 = iozdgvuglvVar.f4353zoijcleaow;
        Object[] objArr2 = iozdgvuglvVar.f4351ppxfxbqfkf;
        int i15 = iozdgvuglvVar.f4352wkgbmnqykc;
        int i16 = 0;
        while (i16 < i14) {
            if (((jArr[i16 >> 3] >> ((i16 & 7) << 3)) & 255) < 128) {
                int i17 = iArr[i16];
                int iHashCode = Integer.hashCode(i17) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int iBtonecajqb = iozdgvuglvVar.btonecajqb(i18 >>> 7);
                long j13 = i18 & 127;
                int i19 = iBtonecajqb >> 3;
                int i23 = (iBtonecajqb & 7) << 3;
                long j14 = (jArr2[i19] & (~(255 << i23))) | (j13 << i23);
                jArr2[i19] = j14;
                jArr2[(((iBtonecajqb - 7) & i15) + (i15 & 7)) >> 3] = j14;
                iArr2[iBtonecajqb] = i17;
                objArr2[iBtonecajqb] = objArr[i16];
            }
            i16++;
            iozdgvuglvVar = this;
            jArr = jArr;
        }
    }

    public iozdgvuglv(int i13) {
        super(null);
        if (!(i13 >= 0)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Capacity must be a positive value.");
        }
        wflxmlrfwp(ribwqtqdhb.eablkybsjg(i13));
    }
}
