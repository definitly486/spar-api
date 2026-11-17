package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wypolnanlu extends vipkmwdibw {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f4402eablkybsjg;

    public wypolnanlu(int i13) {
        super(null);
        if (!(i13 >= 0)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Capacity must be a positive value.");
        }
        kcexrzcfyt(ribwqtqdhb.eablkybsjg(i13));
    }

    private final void kcexrzcfyt(int i13) {
        int iMax = i13 > 0 ? Math.max(7, ribwqtqdhb.wkgbmnqykc(i13)) : 0;
        this.f4396ppxfxbqfkf = iMax;
        oxmwwwfdhm(iMax);
        this.f4398zoijcleaow = iMax == 0 ? jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf : new Object[iMax];
    }

    private final int ojitshcjhn(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f4396ppxfxbqfkf;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f4395iobyxmoadg;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = i15;
            int i24 = i15;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j16) >> 3)) & i16;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4398zoijcleaow[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iRgvfuqvkyq = rgvfuqvkyq(i14);
                if (this.f4402eablkybsjg == 0 && ((this.f4395iobyxmoadg[iRgvfuqvkyq >> 3] >> ((iRgvfuqvkyq & 7) << 3)) & 255) != 254) {
                    gtknphoqwx();
                    iRgvfuqvkyq = rgvfuqvkyq(i14);
                }
                this.f4397wkgbmnqykc++;
                int i25 = this.f4402eablkybsjg;
                long[] jArr2 = this.f4395iobyxmoadg;
                int i26 = iRgvfuqvkyq >> 3;
                long j17 = jArr2[i26];
                int i27 = (iRgvfuqvkyq & 7) << 3;
                this.f4402eablkybsjg = i25 - (((j17 >> i27) & 255) == 128 ? 1 : 0);
                int i28 = this.f4396ppxfxbqfkf;
                long j18 = ((~(255 << i27)) & j17) | (j14 << i27);
                jArr2[i26] = j18;
                jArr2[(((iRgvfuqvkyq - 7) & i28) + (i28 & 7)) >> 3] = j18;
                return iRgvfuqvkyq;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i24;
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
        this.f4395iobyxmoadg = jArr;
        int i14 = i13 >> 3;
        long j13 = 255 << ((i13 & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        vdvldrhtss();
    }

    private final int rgvfuqvkyq(int i13) {
        int i14 = this.f4396ppxfxbqfkf;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f4395iobyxmoadg;
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

    private final void vdvldrhtss() {
        this.f4402eablkybsjg = ribwqtqdhb.iobyxmoadg(zoijcleaow()) - this.f4397wkgbmnqykc;
    }

    public final void agtfadlqog() {
        long[] jArr = this.f4395iobyxmoadg;
        int i13 = this.f4396ppxfxbqfkf;
        Object[] objArr = this.f4398zoijcleaow;
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
                int iRgvfuqvkyq = rgvfuqvkyq(i25);
                int i26 = i25 & i13;
                if (((iRgvfuqvkyq - i26) & i13) / 8 == ((i18 - i26) & i13) / 8) {
                    jArr[i19] = (((long) (i24 & 127)) << i23) | ((~(255 << i23)) & jArr[i19]);
                    jArr[hg.agtfadlqog.bfopjjpdmp(jArr)] = (jArr[i15] & j14) | Long.MIN_VALUE;
                } else {
                    int i27 = iRgvfuqvkyq >> 3;
                    long j16 = jArr[i27];
                    int i28 = (iRgvfuqvkyq & 7) << 3;
                    if (((j16 >> i28) & 255) == 128) {
                        jArr[i27] = ((~(255 << i28)) & j16) | (((long) (i24 & 127)) << i28);
                        jArr[i19] = (jArr[i19] & (~(255 << i23))) | (128 << i23);
                        objArr[iRgvfuqvkyq] = objArr[i18];
                        objArr[i18] = null;
                    } else {
                        jArr[i27] = (((long) (i24 & 127)) << i28) | ((~(255 << i28)) & j16);
                        Object obj2 = objArr[iRgvfuqvkyq];
                        objArr[iRgvfuqvkyq] = objArr[i18];
                        objArr[i18] = obj2;
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
        vdvldrhtss();
    }

    public final boolean btonecajqb(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int iPpxfxbqfkf = ppxfxbqfkf();
        iwizpuwonk(elements);
        return iPpxfxbqfkf != ppxfxbqfkf();
    }

    public final void cqumvgiudr(Object obj) {
        this.f4398zoijcleaow[ojitshcjhn(obj)] = obj;
    }

    public final Set draadjrbmk() {
        return new stevsuqkhv(this);
    }

    public final boolean dxjokdxxww(vipkmwdibw elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int iPpxfxbqfkf = ppxfxbqfkf();
        jyumaefscl(elements);
        return iPpxfxbqfkf != ppxfxbqfkf();
    }

    public final boolean esjtqupxsv(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f4396ppxfxbqfkf;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f4395iobyxmoadg;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = (((long) i14) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4398zoijcleaow[iNumberOfTrailingZeros], obj)) {
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
            pmvmpeiblj(iNumberOfTrailingZeros);
        }
        return z13;
    }

    public final void gtknphoqwx() {
        if (this.f4396ppxfxbqfkf <= 8 || Long.compareUnsigned(gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4397wkgbmnqykc) * 32), gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(this.f4396ppxfxbqfkf) * 25)) > 0) {
            zynmafqrjb(ribwqtqdhb.ppxfxbqfkf(this.f4396ppxfxbqfkf));
        } else {
            agtfadlqog();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0016->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[EDGE_INSN: B:23:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0054], SYNTHETIC] */
    public final boolean istkbnxepw(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Object[] objArr = this.f4398zoijcleaow;
        int i13 = this.f4397wkgbmnqykc;
        long[] jArr = this.f4395iobyxmoadg;
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
                                pmvmpeiblj(i17);
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
        return i13 != this.f4397wkgbmnqykc;
    }

    public final void iwizpuwonk(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            cqumvgiudr(it.next());
        }
    }

    public final void jyumaefscl(vipkmwdibw elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Object[] objArr = elements.f4398zoijcleaow;
        long[] jArr = elements.f4395iobyxmoadg;
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
                        cqumvgiudr(objArr[(i13 << 3) + i15]);
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

    public final boolean lereixgezr(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int iPpxfxbqfkf = ppxfxbqfkf();
        zdlpuopuiu(elements);
        return iPpxfxbqfkf != ppxfxbqfkf();
    }

    public final boolean nufgyqmvbu(Object obj) {
        int iPpxfxbqfkf = ppxfxbqfkf();
        this.f4398zoijcleaow[ojitshcjhn(obj)] = obj;
        return ppxfxbqfkf() != iPpxfxbqfkf;
    }

    public final void pmvmpeiblj(int i13) {
        this.f4397wkgbmnqykc--;
        long[] jArr = this.f4395iobyxmoadg;
        int i14 = this.f4396ppxfxbqfkf;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j13 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j13;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j13;
        this.f4398zoijcleaow[i13] = null;
    }

    public final void wflxmlrfwp() {
        this.f4397wkgbmnqykc = 0;
        long[] jArr = this.f4395iobyxmoadg;
        if (jArr != ribwqtqdhb.f4359iobyxmoadg) {
            hg.agtfadlqog.istkbnxepw(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f4395iobyxmoadg;
            int i13 = this.f4396ppxfxbqfkf;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        hg.agtfadlqog.lereixgezr(this.f4398zoijcleaow, null, 0, this.f4396ppxfxbqfkf);
        vdvldrhtss();
    }

    public final void yggfygwlhe(Object obj) {
        int iNumberOfTrailingZeros;
        int i13 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f4396ppxfxbqfkf;
        int i17 = i14 >>> 7;
        loop0: while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f4395iobyxmoadg;
            int i19 = i18 >> 3;
            int i23 = (i18 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (((long) i15) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i18) & i16;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4398zoijcleaow[iNumberOfTrailingZeros], obj)) {
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
            pmvmpeiblj(iNumberOfTrailingZeros);
        }
    }

    public final void zdlpuopuiu(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            yggfygwlhe(it.next());
        }
    }

    public final void zynmafqrjb(int i13) {
        long[] jArr = this.f4395iobyxmoadg;
        Object[] objArr = this.f4398zoijcleaow;
        int i14 = this.f4396ppxfxbqfkf;
        kcexrzcfyt(i13);
        long[] jArr2 = this.f4395iobyxmoadg;
        Object[] objArr2 = this.f4398zoijcleaow;
        int i15 = this.f4396ppxfxbqfkf;
        for (int i16 = 0; i16 < i14; i16++) {
            if (((jArr[i16 >> 3] >> ((i16 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i16];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i17 = iHashCode ^ (iHashCode << 16);
                int iRgvfuqvkyq = rgvfuqvkyq(i17 >>> 7);
                long j13 = i17 & 127;
                int i18 = iRgvfuqvkyq >> 3;
                int i19 = (iRgvfuqvkyq & 7) << 3;
                long j14 = (jArr2[i18] & (~(255 << i19))) | (j13 << i19);
                jArr2[i18] = j14;
                jArr2[(((iRgvfuqvkyq - 7) & i15) + (i15 & 7)) >> 3] = j14;
                objArr2[iRgvfuqvkyq] = obj;
            }
        }
    }

    public /* synthetic */ wypolnanlu(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 6 : i13);
    }
}
