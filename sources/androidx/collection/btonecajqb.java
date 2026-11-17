package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public int f4226eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public long[] f4227iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int[] f4228ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public int f4229wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public int[] f4230zoijcleaow;

    public /* synthetic */ btonecajqb(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public final int eablkybsjg(int i13, int i14) {
        int iZoijcleaow = zoijcleaow(i13);
        return iZoijcleaow >= 0 ? this.f4228ppxfxbqfkf[iZoijcleaow] : i14;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        if (btonecajqbVar.gxszxtbevo() != gxszxtbevo()) {
            return false;
        }
        int[] iArr = this.f4230zoijcleaow;
        int[] iArr2 = this.f4228ppxfxbqfkf;
        long[] jArr = this.f4227iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        loop0: while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        int i16 = (i13 << 3) + i15;
                        int i17 = iArr[i16];
                        int i18 = iArr2[i16];
                        int iZoijcleaow = btonecajqbVar.zoijcleaow(i17);
                        if (iZoijcleaow < 0 || i18 != btonecajqbVar.f4228ppxfxbqfkf[iZoijcleaow]) {
                            break loop0;
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return true;
                }
            }
            if (i13 == length) {
                return true;
            }
            i13++;
        }
        return false;
    }

    public final int gxszxtbevo() {
        return this.f4226eablkybsjg;
    }

    public int hashCode() {
        int[] iArr = this.f4230zoijcleaow;
        int[] iArr2 = this.f4228ppxfxbqfkf;
        long[] jArr = this.f4227iobyxmoadg;
        int length = jArr.length - 2;
        int i13 = 0;
        if (length >= 0) {
            int i14 = 0;
            int iHashCode = 0;
            while (true) {
                long j13 = jArr[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j13) < 128) {
                            int i17 = (i14 << 3) + i16;
                            int i18 = iArr[i17];
                            iHashCode += Integer.hashCode(iArr2[i17]) ^ Integer.hashCode(i18);
                        }
                        j13 >>= 8;
                    }
                    if (i15 != 8) {
                        return iHashCode;
                    }
                }
                if (i14 != length) {
                    i14++;
                } else {
                    i13 = iHashCode;
                }
            }
        }
        return i13;
    }

    public final boolean iobyxmoadg(int i13) {
        return zoijcleaow(i13) >= 0;
    }

    public final boolean lqeggnwhkg() {
        return this.f4226eablkybsjg == 0;
    }

    public final int ppxfxbqfkf(int i13) {
        int iZoijcleaow = zoijcleaow(i13);
        if (iZoijcleaow < 0) {
            jlmebxxoox.wkgbmnqykc.wkgbmnqykc("Cannot find value for key " + i13);
        }
        return this.f4228ppxfxbqfkf[iZoijcleaow];
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070 A[DONT_INVERT, PHI: r8
      0x0070: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:19:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[LOOP:0: B:9:0x0023->B:21:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0075 A[EDGE_INSN: B:25:0x0075->B:22:0x0075 BREAK  A[LOOP:0: B:9:0x0023->B:21:0x0072], SYNTHETIC] */
    public String toString() {
        if (lqeggnwhkg()) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append('{');
        int[] iArr = this.f4230zoijcleaow;
        int[] iArr2 = this.f4228ppxfxbqfkf;
        long[] jArr = this.f4227iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j13) < 128) {
                            int i17 = (i13 << 3) + i16;
                            int i18 = iArr[i17];
                            int i19 = iArr2[i17];
                            sb3.append(i18);
                            sb3.append("=");
                            sb3.append(i19);
                            i14++;
                            if (i14 < this.f4226eablkybsjg) {
                                sb3.append(',');
                                sb3.append(' ');
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        sb3.append('}');
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final int wkgbmnqykc() {
        return this.f4229wkgbmnqykc;
    }

    public final int zoijcleaow(int i13) {
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f4229wkgbmnqykc;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f4227iobyxmoadg;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (((long) i15) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                if (this.f4230zoijcleaow[iNumberOfTrailingZeros] == i13) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
    }

    private btonecajqb() {
        this.f4227iobyxmoadg = ribwqtqdhb.f4359iobyxmoadg;
        this.f4230zoijcleaow = oxmwwwfdhm.iobyxmoadg();
        this.f4228ppxfxbqfkf = oxmwwwfdhm.iobyxmoadg();
    }
}
