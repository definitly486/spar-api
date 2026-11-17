package androidx.collection;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dsvhmnatus extends jlmebxxoox {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f4259gxszxtbevo;

    public /* synthetic */ dsvhmnatus(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 6 : i13);
    }

    private final void ojitshcjhn() {
        this.f4259gxszxtbevo = ribwqtqdhb.iobyxmoadg(gxszxtbevo()) - this.f4298eablkybsjg;
    }

    private final void rgvfuqvkyq(int i13) {
        long[] jArr;
        if (i13 == 0) {
            jArr = ribwqtqdhb.f4359iobyxmoadg;
        } else {
            long[] jArr2 = new long[((i13 + 15) & (-8)) >> 3];
            hg.agtfadlqog.istkbnxepw(jArr2, -9187201950435737472L, 0, 0, 6, null);
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
            jArr = jArr2;
        }
        this.f4299iobyxmoadg = jArr;
        ojitshcjhn();
    }

    private final void vdvldrhtss(int i13) {
        int iMax = i13 > 0 ? Math.max(7, ribwqtqdhb.wkgbmnqykc(i13)) : 0;
        this.f4301wkgbmnqykc = iMax;
        rgvfuqvkyq(iMax);
        this.f4302zoijcleaow = iMax == 0 ? jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf : new Object[iMax];
        this.f4300ppxfxbqfkf = iMax == 0 ? jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf : new Object[iMax];
    }

    private final int wflxmlrfwp(int i13) {
        int i14 = this.f4301wkgbmnqykc;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f4299iobyxmoadg;
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

    public final int agtfadlqog(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f4301wkgbmnqykc;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f4299iobyxmoadg;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = i15;
            int i24 = i15;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j16) >> 3)) & i16;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4302zoijcleaow[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iWflxmlrfwp = wflxmlrfwp(i14);
                if (this.f4259gxszxtbevo == 0 && ((this.f4299iobyxmoadg[iWflxmlrfwp >> 3] >> ((iWflxmlrfwp & 7) << 3)) & 255) != 254) {
                    btonecajqb();
                    iWflxmlrfwp = wflxmlrfwp(i14);
                }
                this.f4298eablkybsjg++;
                int i25 = this.f4259gxszxtbevo;
                long[] jArr2 = this.f4299iobyxmoadg;
                int i26 = iWflxmlrfwp >> 3;
                long j17 = jArr2[i26];
                int i27 = (iWflxmlrfwp & 7) << 3;
                this.f4259gxszxtbevo = i25 - (((j17 >> i27) & 255) == 128 ? 1 : 0);
                int i28 = this.f4301wkgbmnqykc;
                long j18 = ((~(255 << i27)) & j17) | (j14 << i27);
                jArr2[i26] = j18;
                jArr2[(((iWflxmlrfwp - 7) & i28) + (i28 & 7)) >> 3] = j18;
                return ~iWflxmlrfwp;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i24;
        }
    }

    public final void btonecajqb() {
        if (this.f4301wkgbmnqykc <= 8 || Long.compareUnsigned(gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4298eablkybsjg) * 32), gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4301wkgbmnqykc) * 25)) > 0) {
            iwizpuwonk(ribwqtqdhb.ppxfxbqfkf(this.f4301wkgbmnqykc));
        } else {
            draadjrbmk();
        }
    }

    public final void cqumvgiudr(Object obj, Object obj2) {
        int iAgtfadlqog = agtfadlqog(obj);
        if (iAgtfadlqog < 0) {
            iAgtfadlqog = ~iAgtfadlqog;
        }
        this.f4302zoijcleaow[iAgtfadlqog] = obj;
        this.f4300ppxfxbqfkf[iAgtfadlqog] = obj2;
    }

    public final void draadjrbmk() {
        Object[] objArr;
        long[] jArr = this.f4299iobyxmoadg;
        int i13 = this.f4301wkgbmnqykc;
        Object[] objArr2 = this.f4302zoijcleaow;
        Object[] objArr3 = this.f4300ppxfxbqfkf;
        int i14 = (i13 + 7) >> 3;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            long j13 = jArr[i16] & (-9187201950435737472L);
            jArr[i16] = (-72340172838076674L) & ((~j13) + (j13 >>> 7));
        }
        int iBfopjjpdmp = hg.agtfadlqog.bfopjjpdmp(jArr);
        int i17 = iBfopjjpdmp - 1;
        jArr[i17] = (jArr[i17] & 72057594037927935L) | (-72057594037927936L);
        jArr[iBfopjjpdmp] = jArr[0];
        int i18 = 0;
        while (i18 != i13) {
            int i19 = i18 >> 3;
            int i23 = (i18 & 7) << 3;
            long j14 = (jArr[i19] >> i23) & 255;
            if (j14 != 128 && j14 == 254) {
                Object obj = objArr2[i18];
                int iHashCode = (obj != null ? obj.hashCode() : i15) * (-862048943);
                int i24 = iHashCode ^ (iHashCode << 16);
                int i25 = i24 >>> 7;
                int iWflxmlrfwp = wflxmlrfwp(i25);
                int i26 = i25 & i13;
                if (((iWflxmlrfwp - i26) & i13) / 8 == ((i18 - i26) & i13) / 8) {
                    jArr[i19] = (((long) (i24 & 127)) << i23) | ((~(255 << i23)) & jArr[i19]);
                    jArr[hg.agtfadlqog.bfopjjpdmp(jArr)] = jArr[i15];
                } else {
                    int i27 = iWflxmlrfwp >> 3;
                    long j15 = jArr[i27];
                    int i28 = (iWflxmlrfwp & 7) << 3;
                    if (((j15 >> i28) & 255) == 128) {
                        objArr = objArr2;
                        jArr[i27] = ((~(255 << i28)) & j15) | (((long) (i24 & 127)) << i28);
                        jArr[i19] = (jArr[i19] & (~(255 << i23))) | (128 << i23);
                        objArr[iWflxmlrfwp] = objArr[i18];
                        objArr[i18] = null;
                        objArr3[iWflxmlrfwp] = objArr3[i18];
                        objArr3[i18] = null;
                    } else {
                        objArr = objArr2;
                        jArr[i27] = (((long) (i24 & 127)) << i28) | ((~(255 << i28)) & j15);
                        Object obj2 = objArr[iWflxmlrfwp];
                        objArr[iWflxmlrfwp] = objArr[i18];
                        objArr[i18] = obj2;
                        Object obj3 = objArr3[iWflxmlrfwp];
                        objArr3[iWflxmlrfwp] = objArr3[i18];
                        objArr3[i18] = obj3;
                        i18--;
                    }
                    jArr[hg.agtfadlqog.bfopjjpdmp(jArr)] = jArr[0];
                    i18++;
                    i15 = 0;
                    i13 = i13;
                    objArr2 = objArr;
                }
            }
            i18++;
        }
        ojitshcjhn();
    }

    public final void gtknphoqwx() {
        this.f4298eablkybsjg = 0;
        long[] jArr = this.f4299iobyxmoadg;
        if (jArr != ribwqtqdhb.f4359iobyxmoadg) {
            hg.agtfadlqog.istkbnxepw(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f4299iobyxmoadg;
            int i13 = this.f4301wkgbmnqykc;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        hg.agtfadlqog.lereixgezr(this.f4300ppxfxbqfkf, null, 0, this.f4301wkgbmnqykc);
        hg.agtfadlqog.lereixgezr(this.f4302zoijcleaow, null, 0, this.f4301wkgbmnqykc);
        ojitshcjhn();
    }

    public final void iwizpuwonk(int i13) {
        int i14;
        long[] jArr = this.f4299iobyxmoadg;
        Object[] objArr = this.f4302zoijcleaow;
        Object[] objArr2 = this.f4300ppxfxbqfkf;
        int i15 = this.f4301wkgbmnqykc;
        vdvldrhtss(i13);
        long[] jArr2 = this.f4299iobyxmoadg;
        Object[] objArr3 = this.f4302zoijcleaow;
        Object[] objArr4 = this.f4300ppxfxbqfkf;
        int i16 = this.f4301wkgbmnqykc;
        int i17 = 0;
        while (i17 < i15) {
            if (((jArr[i17 >> 3] >> ((i17 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i17];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int iWflxmlrfwp = wflxmlrfwp(i18 >>> 7);
                i14 = i17;
                long j13 = i18 & 127;
                int i19 = iWflxmlrfwp >> 3;
                int i23 = (iWflxmlrfwp & 7) << 3;
                long j14 = (j13 << i23) | (jArr2[i19] & (~(255 << i23)));
                jArr2[i19] = j14;
                jArr2[(((iWflxmlrfwp - 7) & i16) + (i16 & 7)) >> 3] = j14;
                objArr3[iWflxmlrfwp] = obj;
                objArr4[iWflxmlrfwp] = objArr2[i14];
            } else {
                i14 = i17;
            }
            i17 = i14 + 1;
        }
    }

    public final Object jyumaefscl(int i13) {
        this.f4298eablkybsjg--;
        long[] jArr = this.f4299iobyxmoadg;
        int i14 = this.f4301wkgbmnqykc;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j13 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j13;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j13;
        this.f4302zoijcleaow[i13] = null;
        Object[] objArr = this.f4300ppxfxbqfkf;
        Object obj = objArr[i13];
        objArr[i13] = null;
        return obj;
    }

    public final void kcexrzcfyt(jlmebxxoox from) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(from, "from");
        Object[] objArr = from.f4302zoijcleaow;
        Object[] objArr2 = from.f4300ppxfxbqfkf;
        long[] jArr = from.f4299iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        int i16 = (i13 << 3) + i15;
                        cqumvgiudr(objArr[i16], objArr2[i16]);
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final Object oxmwwwfdhm(Object obj, Object obj2) {
        int iAgtfadlqog = agtfadlqog(obj);
        if (iAgtfadlqog < 0) {
            iAgtfadlqog = ~iAgtfadlqog;
        }
        Object[] objArr = this.f4300ppxfxbqfkf;
        Object obj3 = objArr[iAgtfadlqog];
        this.f4302zoijcleaow[iAgtfadlqog] = obj;
        objArr[iAgtfadlqog] = obj2;
        return obj3;
    }

    public final Object yggfygwlhe(Object obj) {
        int iNumberOfTrailingZeros;
        int i13 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f4301wkgbmnqykc;
        int i17 = i14 >>> 7;
        loop0: while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f4299iobyxmoadg;
            int i19 = i18 >> 3;
            int i23 = (i18 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (((long) i15) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i18) & i16;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4302zoijcleaow[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i17 = i18 + i13;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return jyumaefscl(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final void zdlpuopuiu(Map from) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            cqumvgiudr(entry.getKey(), entry.getValue());
        }
    }

    public dsvhmnatus(int i13) {
        super(null);
        if (!(i13 >= 0)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Capacity must be a positive value.");
        }
        vdvldrhtss(ribwqtqdhb.eablkybsjg(i13));
    }
}
