package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class kegysxyocb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public int f4325eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public long[] f4326iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int[] f4327ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public int f4328wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public Object[] f4329zoijcleaow;

    public /* synthetic */ kegysxyocb(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public final int eablkybsjg(Object obj, int i13) {
        int iZoijcleaow = zoijcleaow(obj);
        return iZoijcleaow >= 0 ? this.f4327ppxfxbqfkf[iZoijcleaow] : i13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kegysxyocb)) {
            return false;
        }
        kegysxyocb kegysxyocbVar = (kegysxyocb) obj;
        if (kegysxyocbVar.gxszxtbevo() != gxszxtbevo()) {
            return false;
        }
        Object[] objArr = this.f4329zoijcleaow;
        int[] iArr = this.f4327ppxfxbqfkf;
        long[] jArr = this.f4326iobyxmoadg;
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
                        Object obj2 = objArr[i16];
                        int i17 = iArr[i16];
                        int iZoijcleaow = kegysxyocbVar.zoijcleaow(obj2);
                        if (iZoijcleaow < 0 || i17 != kegysxyocbVar.f4327ppxfxbqfkf[iZoijcleaow]) {
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
        return this.f4325eablkybsjg;
    }

    public int hashCode() {
        Object[] objArr = this.f4329zoijcleaow;
        int[] iArr = this.f4327ppxfxbqfkf;
        long[] jArr = this.f4326iobyxmoadg;
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
                            Object obj = objArr[i17];
                            iHashCode += Integer.hashCode(iArr[i17]) ^ (obj != null ? obj.hashCode() : 0);
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

    public final boolean iobyxmoadg(Object obj) {
        return zoijcleaow(obj) >= 0;
    }

    public final boolean lqeggnwhkg() {
        return this.f4325eablkybsjg == 0;
    }

    public final boolean nufgyqmvbu() {
        return this.f4325eablkybsjg != 0;
    }

    public final int ppxfxbqfkf(Object obj) {
        int iZoijcleaow = zoijcleaow(obj);
        if (iZoijcleaow < 0) {
            jlmebxxoox.wkgbmnqykc.wkgbmnqykc("There is no key " + obj + " in the map");
        }
        return this.f4327ppxfxbqfkf[iZoijcleaow];
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074 A[DONT_INVERT, PHI: r8
      0x0074: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:22:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0076 A[LOOP:0: B:9:0x0023->B:24:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[EDGE_INSN: B:28:0x0079->B:25:0x0079 BREAK  A[LOOP:0: B:9:0x0023->B:24:0x0076], SYNTHETIC] */
    public String toString() {
        if (lqeggnwhkg()) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append('{');
        Object[] objArr = this.f4329zoijcleaow;
        int[] iArr = this.f4327ppxfxbqfkf;
        long[] jArr = this.f4326iobyxmoadg;
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
                            Object obj = objArr[i17];
                            int i18 = iArr[i17];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb3.append(obj);
                            sb3.append("=");
                            sb3.append(i18);
                            i14++;
                            if (i14 < this.f4325eablkybsjg) {
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
        return this.f4328wkgbmnqykc;
    }

    public final int zoijcleaow(Object obj) {
        int i13 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f4328wkgbmnqykc;
        int i17 = i14 >>> 7;
        while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f4326iobyxmoadg;
            int i19 = i18 >> 3;
            int i23 = (i18 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (((long) i15) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i18) & i16;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4329zoijcleaow[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i13 += 8;
            i17 = i18 + i13;
        }
    }

    private kegysxyocb() {
        this.f4326iobyxmoadg = ribwqtqdhb.f4359iobyxmoadg;
        this.f4329zoijcleaow = jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf;
        this.f4327ppxfxbqfkf = oxmwwwfdhm.iobyxmoadg();
    }
}
