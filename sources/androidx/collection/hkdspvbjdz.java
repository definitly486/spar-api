package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hkdspvbjdz extends ulzqkzuiru {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f4274nufgyqmvbu;

    public /* synthetic */ hkdspvbjdz(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 6 : i13);
    }

    private final int agtfadlqog(int i13) {
        int i14 = this.f4384gxszxtbevo;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f4385iobyxmoadg;
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

    private final void kcexrzcfyt(int i13) {
        long[] jArrIobyxmoadg;
        int iMax = i13 > 0 ? Math.max(7, ribwqtqdhb.wkgbmnqykc(i13)) : 0;
        this.f4384gxszxtbevo = iMax;
        oxmwwwfdhm(iMax);
        this.f4389zoijcleaow = iMax == 0 ? jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf : new Object[iMax];
        if (iMax == 0) {
            jArrIobyxmoadg = okpsazkaxt.iobyxmoadg();
        } else {
            jArrIobyxmoadg = new long[iMax];
            hg.agtfadlqog.istkbnxepw(jArrIobyxmoadg, 4611686018427387903L, 0, 0, 6, null);
        }
        this.f4387ppxfxbqfkf = jArrIobyxmoadg;
    }

    private final void ojitshcjhn(int[] iArr) {
        long[] jArr = this.f4387ppxfxbqfkf;
        int length = jArr.length;
        int i13 = 0;
        while (true) {
            int i14 = Integer.MAX_VALUE;
            if (i13 >= length) {
                break;
            }
            long j13 = jArr[i13];
            int i15 = (int) ((j13 >> 31) & 2147483647L);
            int i16 = (int) (j13 & 2147483647L);
            long j14 = ((j13 & (-4611686018427387904L)) | ((long) (i15 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i15]))) << 31;
            if (i16 != Integer.MAX_VALUE) {
                i14 = iArr[i16];
            }
            jArr[i13] = j14 | ((long) i14);
            i13++;
        }
        int i17 = this.f4388wkgbmnqykc;
        if (i17 != Integer.MAX_VALUE) {
            this.f4388wkgbmnqykc = iArr[i17];
        }
        int i18 = this.f4383eablkybsjg;
        if (i18 != Integer.MAX_VALUE) {
            this.f4383eablkybsjg = iArr[i18];
        }
    }

    private final void oxmwwwfdhm(int i13) {
        long[] jArr;
        if (i13 == 0) {
            jArr = ribwqtqdhb.f4359iobyxmoadg;
        } else {
            jArr = new long[((i13 + 15) & (-8)) >> 3];
            hg.agtfadlqog.istkbnxepw(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f4385iobyxmoadg = jArr;
        int i14 = i13 >> 3;
        long j13 = 255 << ((i13 & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        vdvldrhtss();
    }

    private final void rgvfuqvkyq(long[] jArr) {
        long[] jArr2 = this.f4387ppxfxbqfkf;
        int length = jArr2.length;
        int i13 = 0;
        while (true) {
            int i14 = Integer.MAX_VALUE;
            if (i13 >= length) {
                break;
            }
            long j13 = jArr2[i13];
            int i15 = (int) ((j13 >> 31) & 2147483647L);
            int i16 = (int) (j13 & 2147483647L);
            long j14 = ((j13 & (-4611686018427387904L)) | ((long) (i15 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i15] & 4294967295L)))) << 31;
            if (i16 != Integer.MAX_VALUE) {
                i14 = (int) (4294967295L & jArr[i16]);
            }
            jArr2[i13] = ((long) i14) | j14;
            i13++;
        }
        int i17 = this.f4388wkgbmnqykc;
        if (i17 != Integer.MAX_VALUE) {
            this.f4388wkgbmnqykc = (int) (jArr[i17] & 4294967295L);
        }
        int i18 = this.f4383eablkybsjg;
        if (i18 != Integer.MAX_VALUE) {
            this.f4383eablkybsjg = (int) (jArr[i18] & 4294967295L);
        }
    }

    private final void vdvldrhtss() {
        this.f4274nufgyqmvbu = ribwqtqdhb.iobyxmoadg(zoijcleaow()) - this.f4386lqeggnwhkg;
    }

    private final int wflxmlrfwp(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f4384gxszxtbevo;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f4385iobyxmoadg;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = i15;
            int i24 = i15;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j16) >> 3)) & i16;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4389zoijcleaow[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iAgtfadlqog = agtfadlqog(i14);
                if (this.f4274nufgyqmvbu == 0 && ((this.f4385iobyxmoadg[iAgtfadlqog >> 3] >> ((iAgtfadlqog & 7) << 3)) & 255) != 254) {
                    dxjokdxxww();
                    iAgtfadlqog = agtfadlqog(i14);
                }
                this.f4386lqeggnwhkg++;
                int i25 = this.f4274nufgyqmvbu;
                long[] jArr2 = this.f4385iobyxmoadg;
                int i26 = iAgtfadlqog >> 3;
                long j17 = jArr2[i26];
                int i27 = (iAgtfadlqog & 7) << 3;
                this.f4274nufgyqmvbu = i25 - (((j17 >> i27) & 255) == 128 ? 1 : 0);
                int i28 = this.f4384gxszxtbevo;
                long j18 = ((~(255 << i27)) & j17) | (j14 << i27);
                jArr2[i26] = j18;
                jArr2[(((iAgtfadlqog - 7) & i28) + (i28 & 7)) >> 3] = j18;
                return iAgtfadlqog;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i24;
        }
    }

    public final Set btonecajqb() {
        return new cllcsxoeiz(this);
    }

    public final boolean cqumvgiudr(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f4384gxszxtbevo;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f4385iobyxmoadg;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = (((long) i14) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4389zoijcleaow[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
        boolean z13 = iNumberOfTrailingZeros >= 0;
        if (z13) {
            lereixgezr(iNumberOfTrailingZeros);
        }
        return z13;
    }

    public final void draadjrbmk() {
        long[] jArr;
        long[] jArr2;
        char c13;
        long[] jArr3 = this.f4385iobyxmoadg;
        if (jArr3 == null) {
            return;
        }
        int i13 = this.f4384gxszxtbevo;
        Object[] objArr = this.f4389zoijcleaow;
        long[] jArr4 = this.f4387ppxfxbqfkf;
        long[] jArr5 = new long[i13];
        int i14 = 0;
        hg.agtfadlqog.esjtqupxsv(jArr5, 9223372034707292159L, 0, i13);
        int i15 = (i13 + 7) >> 3;
        for (int i16 = 0; i16 < i15; i16++) {
            long j13 = jArr3[i16] & (-9187201950435737472L);
            jArr3[i16] = (-72340172838076674L) & ((~j13) + (j13 >>> 7));
        }
        int iBfopjjpdmp = hg.agtfadlqog.bfopjjpdmp(jArr3);
        int i17 = iBfopjjpdmp - 1;
        jArr3[i17] = (jArr3[i17] & 72057594037927935L) | (-72057594037927936L);
        jArr3[iBfopjjpdmp] = jArr3[0];
        int i18 = 0;
        while (i18 != i13) {
            int i19 = i18 >> 3;
            int i23 = (i18 & 7) << 3;
            long j14 = (jArr3[i19] >> i23) & 255;
            if (j14 != 128 && j14 == 254) {
                Object obj = objArr[i18];
                int iHashCode = (obj != null ? obj.hashCode() : i14) * (-862048943);
                int i24 = iHashCode ^ (iHashCode << 16);
                int i25 = i24 >>> 7;
                int iAgtfadlqog = agtfadlqog(i25);
                int i26 = i25 & i13;
                if (((iAgtfadlqog - i26) & i13) / 8 == ((i18 - i26) & i13) / 8) {
                    jArr3[i19] = (((long) (i24 & 127)) << i23) | (jArr3[i19] & (~(255 << i23)));
                    if (jArr5[i18] == 9223372034707292159L) {
                        long j15 = i18;
                        jArr5[i18] = j15 | (j15 << 32);
                    }
                    jArr3[jArr3.length - 1] = jArr3[0];
                    i18++;
                    i14 = 0;
                } else {
                    int i27 = iAgtfadlqog >> 3;
                    long j16 = jArr3[i27];
                    int i28 = (iAgtfadlqog & 7) << 3;
                    if (((j16 >> i28) & 255) == 128) {
                        jArr = jArr4;
                        jArr2 = jArr5;
                        jArr3[i27] = (j16 & (~(255 << i28))) | (((long) (i24 & 127)) << i28);
                        jArr3[i19] = (jArr3[i19] & (~(255 << i23))) | (128 << i23);
                        objArr[iAgtfadlqog] = objArr[i18];
                        objArr[i18] = null;
                        jArr[iAgtfadlqog] = jArr[i18];
                        jArr[i18] = 4611686018427387903L;
                        int i29 = (int) ((jArr2[i18] >> 32) & 4294967295L);
                        if (i29 != Integer.MAX_VALUE) {
                            jArr2[i29] = (jArr2[i29] & (-4294967296L)) | ((long) iAgtfadlqog);
                            jArr2[i18] = (jArr2[i18] & 4294967295L) | (-4294967296L);
                            c13 = ' ';
                        } else {
                            c13 = ' ';
                            jArr2[i18] = (((long) Integer.MAX_VALUE) << 32) | ((long) iAgtfadlqog);
                        }
                        jArr2[iAgtfadlqog] = ((long) Integer.MAX_VALUE) | (((long) i18) << c13);
                    } else {
                        jArr = jArr4;
                        jArr2 = jArr5;
                        jArr3[i27] = (((long) (i24 & 127)) << i28) | (j16 & (~(255 << i28)));
                        Object obj2 = objArr[iAgtfadlqog];
                        objArr[iAgtfadlqog] = objArr[i18];
                        objArr[i18] = obj2;
                        long j17 = jArr[iAgtfadlqog];
                        jArr[iAgtfadlqog] = jArr[i18];
                        jArr[i18] = j17;
                        int i33 = (int) ((jArr2[i18] >> 32) & 4294967295L);
                        if (i33 != Integer.MAX_VALUE) {
                            long j18 = iAgtfadlqog;
                            jArr2[i33] = (jArr2[i33] & (-4294967296L)) | j18;
                            jArr2[i18] = (jArr2[i18] & 4294967295L) | (j18 << 32);
                        } else {
                            long j19 = iAgtfadlqog;
                            jArr2[i18] = j19 | (j19 << 32);
                            i33 = i18;
                        }
                        jArr2[iAgtfadlqog] = (((long) i33) << 32) | ((long) i18);
                        i18--;
                    }
                    jArr3[jArr3.length - 1] = jArr3[0];
                    i18++;
                    i14 = 0;
                    jArr4 = jArr;
                    jArr5 = jArr2;
                }
            } else {
                i18++;
            }
        }
        vdvldrhtss();
        rgvfuqvkyq(jArr5);
    }

    public final void dxjokdxxww() {
        if (this.f4384gxszxtbevo <= 8 || Long.compareUnsigned(gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4386lqeggnwhkg) * 32), gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4384gxszxtbevo) * 25)) > 0) {
            pmvmpeiblj(ribwqtqdhb.ppxfxbqfkf(this.f4384gxszxtbevo));
        } else {
            draadjrbmk();
        }
    }

    public final boolean esjtqupxsv(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int iPpxfxbqfkf = ppxfxbqfkf();
        zdlpuopuiu(elements);
        return iPpxfxbqfkf != ppxfxbqfkf();
    }

    public final void gtknphoqwx() {
        this.f4386lqeggnwhkg = 0;
        long[] jArr = this.f4385iobyxmoadg;
        if (jArr != ribwqtqdhb.f4359iobyxmoadg) {
            hg.agtfadlqog.istkbnxepw(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f4385iobyxmoadg;
            int i13 = this.f4384gxszxtbevo;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        hg.agtfadlqog.lereixgezr(this.f4389zoijcleaow, null, 0, this.f4384gxszxtbevo);
        hg.agtfadlqog.istkbnxepw(this.f4387ppxfxbqfkf, 4611686018427387903L, 0, 0, 6, null);
        this.f4388wkgbmnqykc = Integer.MAX_VALUE;
        this.f4383eablkybsjg = Integer.MAX_VALUE;
        vdvldrhtss();
    }

    public final void iwizpuwonk(Object obj) {
        int iWflxmlrfwp = wflxmlrfwp(obj);
        this.f4389zoijcleaow[iWflxmlrfwp] = obj;
        long[] jArr = this.f4387ppxfxbqfkf;
        int i13 = this.f4388wkgbmnqykc;
        jArr[iWflxmlrfwp] = (((long) i13) & 2147483647L) | 4611686016279904256L;
        if (i13 != Integer.MAX_VALUE) {
            jArr[i13] = ((((long) iWflxmlrfwp) & 2147483647L) << 31) | (jArr[i13] & (-4611686016279904257L));
        }
        this.f4388wkgbmnqykc = iWflxmlrfwp;
        if (this.f4383eablkybsjg == Integer.MAX_VALUE) {
            this.f4383eablkybsjg = iWflxmlrfwp;
        }
    }

    public final void jyumaefscl(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            iwizpuwonk(it.next());
        }
    }

    public final void lereixgezr(int i13) {
        this.f4386lqeggnwhkg--;
        long[] jArr = this.f4385iobyxmoadg;
        int i14 = this.f4384gxszxtbevo;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j13 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j13;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j13;
        this.f4389zoijcleaow[i13] = null;
        long[] jArr2 = this.f4387ppxfxbqfkf;
        long j14 = jArr2[i13];
        int i17 = (int) ((j14 >> 31) & 2147483647L);
        int i18 = (int) (j14 & 2147483647L);
        if (i17 != Integer.MAX_VALUE) {
            jArr2[i17] = (jArr2[i17] & (-2147483648L)) | (((long) i18) & 2147483647L);
        } else {
            this.f4388wkgbmnqykc = i18;
        }
        if (i18 != Integer.MAX_VALUE) {
            jArr2[i18] = ((((long) i17) & 2147483647L) << 31) | (jArr2[i18] & (-4611686016279904257L));
        } else {
            this.f4383eablkybsjg = i17;
        }
        jArr2[i13] = 4611686018427387903L;
    }

    public final boolean lqeggnwhkg(Object obj) {
        int iPpxfxbqfkf = ppxfxbqfkf();
        int iWflxmlrfwp = wflxmlrfwp(obj);
        this.f4389zoijcleaow[iWflxmlrfwp] = obj;
        long[] jArr = this.f4387ppxfxbqfkf;
        int i13 = this.f4388wkgbmnqykc;
        jArr[iWflxmlrfwp] = (((long) i13) & 2147483647L) | 4611686016279904256L;
        if (i13 != Integer.MAX_VALUE) {
            jArr[i13] = ((((long) iWflxmlrfwp) & 2147483647L) << 31) | (jArr[i13] & (-4611686016279904257L));
        }
        this.f4388wkgbmnqykc = iWflxmlrfwp;
        if (this.f4383eablkybsjg == Integer.MAX_VALUE) {
            this.f4383eablkybsjg = iWflxmlrfwp;
        }
        return ppxfxbqfkf() != iPpxfxbqfkf;
    }

    public final boolean nufgyqmvbu(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int iPpxfxbqfkf = ppxfxbqfkf();
        jyumaefscl(elements);
        return iPpxfxbqfkf != ppxfxbqfkf();
    }

    public final void pmvmpeiblj(int i13) {
        long[] jArr = this.f4385iobyxmoadg;
        Object[] objArr = this.f4389zoijcleaow;
        long[] jArr2 = this.f4387ppxfxbqfkf;
        int i14 = this.f4384gxszxtbevo;
        int[] iArr = new int[i14];
        kcexrzcfyt(i13);
        long[] jArr3 = this.f4385iobyxmoadg;
        Object[] objArr2 = this.f4389zoijcleaow;
        long[] jArr4 = this.f4387ppxfxbqfkf;
        int i15 = this.f4384gxszxtbevo;
        int i16 = 0;
        while (i16 < i14) {
            if (((jArr[i16 >> 3] >> ((i16 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i16];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i17 = iHashCode ^ (iHashCode << 16);
                int iAgtfadlqog = agtfadlqog(i17 >>> 7);
                long j13 = i17 & 127;
                int i18 = iAgtfadlqog >> 3;
                int i19 = (iAgtfadlqog & 7) << 3;
                long j14 = (jArr3[i18] & (~(255 << i19))) | (j13 << i19);
                jArr3[i18] = j14;
                jArr3[(((iAgtfadlqog - 7) & i15) + (i15 & 7)) >> 3] = j14;
                objArr2[iAgtfadlqog] = obj;
                jArr4[iAgtfadlqog] = jArr2[i16];
                iArr[i16] = iAgtfadlqog;
            }
            i16++;
            jArr = jArr;
            objArr = objArr;
        }
        ojitshcjhn(iArr);
    }

    public final void yggfygwlhe(Object obj) {
        int iNumberOfTrailingZeros;
        int i13 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f4384gxszxtbevo;
        int i17 = i14 >>> 7;
        loop0: while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f4385iobyxmoadg;
            int i19 = i18 >> 3;
            int i23 = (i18 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (((long) i15) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i18) & i16;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4389zoijcleaow[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i13 += 8;
                i17 = i18 + i13;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            lereixgezr(iNumberOfTrailingZeros);
        }
    }

    public final void zdlpuopuiu(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            yggfygwlhe(it.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0016->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[EDGE_INSN: B:23:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0054], SYNTHETIC] */
    public final boolean zynmafqrjb(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Object[] objArr = this.f4389zoijcleaow;
        int i13 = this.f4386lqeggnwhkg;
        long[] jArr = this.f4385iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j13 = jArr[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i14 != length) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j13) < 128) {
                            int i17 = (i14 << 3) + i16;
                            if (!hg.jyumaefscl.xrmfcynszj(elements, objArr[i17])) {
                                lereixgezr(i17);
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                    if (i14 != length) {
                        break;
                    }
                    i14++;
                }
            }
        }
        return i13 != this.f4386lqeggnwhkg;
    }

    public hkdspvbjdz(int i13) {
        super(null);
        if (!(i13 >= 0)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Capacity must be a positive value.");
        }
        kcexrzcfyt(ribwqtqdhb.eablkybsjg(i13));
    }
}
