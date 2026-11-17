package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public final class hcddaimhww extends kegysxyocb {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f4273gxszxtbevo;

    public /* synthetic */ hcddaimhww(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 6 : i13);
    }

    private final void agtfadlqog() {
        this.f4273gxszxtbevo = ribwqtqdhb.iobyxmoadg(wkgbmnqykc()) - this.f4325eablkybsjg;
    }

    private final int draadjrbmk(int i13) {
        int i14 = this.f4328wkgbmnqykc;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f4326iobyxmoadg;
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
        long[] jArr;
        if (i13 == 0) {
            jArr = ribwqtqdhb.f4359iobyxmoadg;
        } else {
            jArr = new long[((i13 + 15) & (-8)) >> 3];
            hg.agtfadlqog.istkbnxepw(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f4326iobyxmoadg = jArr;
        int i14 = i13 >> 3;
        long j13 = 255 << ((i13 & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        agtfadlqog();
    }

    private final void rgvfuqvkyq(int i13) {
        int iMax = i13 > 0 ? Math.max(7, ribwqtqdhb.wkgbmnqykc(i13)) : 0;
        this.f4328wkgbmnqykc = iMax;
        ojitshcjhn(iMax);
        this.f4329zoijcleaow = new Object[iMax];
        this.f4327ppxfxbqfkf = new int[iMax];
    }

    private final int wflxmlrfwp(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f4328wkgbmnqykc;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f4326iobyxmoadg;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = i15;
            int i24 = i15;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j16) >> 3)) & i16;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4329zoijcleaow[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iDraadjrbmk = draadjrbmk(i14);
                if (this.f4273gxszxtbevo == 0 && ((this.f4326iobyxmoadg[iDraadjrbmk >> 3] >> ((iDraadjrbmk & 7) << 3)) & 255) != 254) {
                    dxjokdxxww();
                    iDraadjrbmk = draadjrbmk(i14);
                }
                this.f4325eablkybsjg++;
                int i25 = this.f4273gxszxtbevo;
                long[] jArr2 = this.f4326iobyxmoadg;
                int i26 = iDraadjrbmk >> 3;
                long j17 = jArr2[i26];
                int i27 = (iDraadjrbmk & 7) << 3;
                this.f4273gxszxtbevo = i25 - (((j17 >> i27) & 255) == 128 ? 1 : 0);
                int i28 = this.f4328wkgbmnqykc;
                long j18 = ((~(255 << i27)) & j17) | (j14 << i27);
                jArr2[i26] = j18;
                jArr2[(((iDraadjrbmk - 7) & i28) + (i28 & 7)) >> 3] = j18;
                return ~iDraadjrbmk;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i24;
        }
    }

    public final void btonecajqb() {
        this.f4325eablkybsjg = 0;
        long[] jArr = this.f4326iobyxmoadg;
        if (jArr != ribwqtqdhb.f4359iobyxmoadg) {
            hg.agtfadlqog.istkbnxepw(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f4326iobyxmoadg;
            int i13 = this.f4328wkgbmnqykc;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        hg.agtfadlqog.lereixgezr(this.f4329zoijcleaow, null, 0, this.f4328wkgbmnqykc);
        agtfadlqog();
    }

    public final void dxjokdxxww() {
        if (this.f4328wkgbmnqykc <= 8 || Long.compareUnsigned(gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4325eablkybsjg) * 32), gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4328wkgbmnqykc) * 25)) > 0) {
            zdlpuopuiu(ribwqtqdhb.ppxfxbqfkf(this.f4328wkgbmnqykc));
        } else {
            gtknphoqwx();
        }
    }

    public final void gtknphoqwx() {
        long[] jArr = this.f4326iobyxmoadg;
        int i13 = this.f4328wkgbmnqykc;
        Object[] objArr = this.f4329zoijcleaow;
        int[] iArr = this.f4327ppxfxbqfkf;
        int i14 = (i13 + 7) >> 3;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            long j13 = jArr[i16] & (-9187201950435737472L);
            jArr[i16] = (-72340172838076674L) & ((~j13) + (j13 >>> 7));
        }
        int iBfopjjpdmp = hg.agtfadlqog.bfopjjpdmp(jArr);
        int i17 = iBfopjjpdmp - 1;
        long j14 = 72057594037927935L;
        jArr[i17] = (jArr[i17] & 72057594037927935L) | (-72057594037927936L);
        jArr[iBfopjjpdmp] = jArr[0];
        int i18 = 0;
        while (i18 != i13) {
            int i19 = i18 >> 3;
            int i23 = (i18 & 7) << 3;
            long j15 = (jArr[i19] >> i23) & 255;
            if (j15 != 128 && j15 == 254) {
                Object obj = objArr[i18];
                int iHashCode = (obj != null ? obj.hashCode() : i15) * (-862048943);
                int i24 = iHashCode ^ (iHashCode << 16);
                int i25 = i24 >>> 7;
                int iDraadjrbmk = draadjrbmk(i25);
                int i26 = i25 & i13;
                if (((iDraadjrbmk - i26) & i13) / 8 == ((i18 - i26) & i13) / 8) {
                    jArr[i19] = (((long) (i24 & 127)) << i23) | ((~(255 << i23)) & jArr[i19]);
                    jArr[hg.agtfadlqog.bfopjjpdmp(jArr)] = (jArr[i15] & j14) | Long.MIN_VALUE;
                } else {
                    int i27 = iDraadjrbmk >> 3;
                    long j16 = jArr[i27];
                    int i28 = (iDraadjrbmk & 7) << 3;
                    if (((j16 >> i28) & 255) == 128) {
                        jArr[i27] = ((~(255 << i28)) & j16) | (((long) (i24 & 127)) << i28);
                        jArr[i19] = (jArr[i19] & (~(255 << i23))) | (128 << i23);
                        objArr[iDraadjrbmk] = objArr[i18];
                        objArr[i18] = null;
                        iArr[iDraadjrbmk] = iArr[i18];
                        iArr[i18] = 0;
                    } else {
                        jArr[i27] = (((long) (i24 & 127)) << i28) | ((~(255 << i28)) & j16);
                        Object obj2 = objArr[iDraadjrbmk];
                        objArr[iDraadjrbmk] = objArr[i18];
                        objArr[i18] = obj2;
                        int i29 = iArr[iDraadjrbmk];
                        iArr[iDraadjrbmk] = iArr[i18];
                        iArr[i18] = i29;
                        i18--;
                    }
                    j14 = 72057594037927935L;
                    jArr[hg.agtfadlqog.bfopjjpdmp(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    i18++;
                    i15 = 0;
                }
            }
            i18++;
        }
        agtfadlqog();
    }

    public final void kcexrzcfyt(int i13) {
        this.f4325eablkybsjg--;
        long[] jArr = this.f4326iobyxmoadg;
        int i14 = this.f4328wkgbmnqykc;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j13 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j13;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j13;
        this.f4329zoijcleaow[i13] = null;
    }

    public final void oxmwwwfdhm(Object obj) {
        int iZoijcleaow = zoijcleaow(obj);
        if (iZoijcleaow >= 0) {
            kcexrzcfyt(iZoijcleaow);
        }
    }

    public final int vdvldrhtss(Object obj, int i13, int i14) {
        int iWflxmlrfwp = wflxmlrfwp(obj);
        if (iWflxmlrfwp < 0) {
            iWflxmlrfwp = ~iWflxmlrfwp;
        } else {
            i14 = this.f4327ppxfxbqfkf[iWflxmlrfwp];
        }
        this.f4329zoijcleaow[iWflxmlrfwp] = obj;
        this.f4327ppxfxbqfkf[iWflxmlrfwp] = i13;
        return i14;
    }

    public final void yggfygwlhe(Object obj, int i13) {
        int iWflxmlrfwp = wflxmlrfwp(obj);
        if (iWflxmlrfwp < 0) {
            iWflxmlrfwp = ~iWflxmlrfwp;
        }
        this.f4329zoijcleaow[iWflxmlrfwp] = obj;
        this.f4327ppxfxbqfkf[iWflxmlrfwp] = i13;
    }

    public final void zdlpuopuiu(int i13) {
        int i14;
        long[] jArr = this.f4326iobyxmoadg;
        Object[] objArr = this.f4329zoijcleaow;
        int[] iArr = this.f4327ppxfxbqfkf;
        int i15 = this.f4328wkgbmnqykc;
        rgvfuqvkyq(i13);
        long[] jArr2 = this.f4326iobyxmoadg;
        Object[] objArr2 = this.f4329zoijcleaow;
        int[] iArr2 = this.f4327ppxfxbqfkf;
        int i16 = this.f4328wkgbmnqykc;
        int i17 = 0;
        while (i17 < i15) {
            if (((jArr[i17 >> 3] >> ((i17 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i17];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int iDraadjrbmk = draadjrbmk(i18 >>> 7);
                i14 = i17;
                long j13 = i18 & 127;
                int i19 = iDraadjrbmk >> 3;
                int i23 = (iDraadjrbmk & 7) << 3;
                long j14 = (j13 << i23) | (jArr2[i19] & (~(255 << i23)));
                jArr2[i19] = j14;
                jArr2[(((iDraadjrbmk - 7) & i16) + (i16 & 7)) >> 3] = j14;
                objArr2[iDraadjrbmk] = obj;
                iArr2[iDraadjrbmk] = iArr[i14];
            } else {
                i14 = i17;
            }
            i17 = i14 + 1;
        }
    }

    public hcddaimhww(int i13) {
        super(null);
        if (!(i13 >= 0)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Capacity must be a positive value.");
        }
        rgvfuqvkyq(ribwqtqdhb.eablkybsjg(i13));
    }
}
