package androidx.collection;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class jlmebxxoox {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public int f4298eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public long[] f4299iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public Object[] f4300ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public int f4301wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public Object[] f4302zoijcleaow;

    public /* synthetic */ jlmebxxoox(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public final boolean dxjokdxxww() {
        return this.f4298eablkybsjg != 0;
    }

    public final Object eablkybsjg(Object obj) {
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
            return this.f4300ppxfxbqfkf[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:0: B:14:0x0027->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:34:0x0078 BREAK  A[LOOP:0: B:14:0x0027->B:33:0x0075], SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jlmebxxoox)) {
            return false;
        }
        jlmebxxoox jlmebxxooxVar = (jlmebxxoox) obj;
        if (jlmebxxooxVar.lqeggnwhkg() != lqeggnwhkg()) {
            return false;
        }
        Object[] objArr = this.f4302zoijcleaow;
        Object[] objArr2 = this.f4300ppxfxbqfkf;
        long[] jArr = this.f4299iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128) {
                            int i16 = (i13 << 3) + i15;
                            Object obj2 = objArr[i16];
                            Object obj3 = objArr2[i16];
                            if (obj3 == null) {
                                if (jlmebxxooxVar.eablkybsjg(obj2) != null || !jlmebxxooxVar.ppxfxbqfkf(obj2)) {
                                    return false;
                                }
                            } else if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj3, jlmebxxooxVar.eablkybsjg(obj2))) {
                                return false;
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        return true;
    }

    public final int gxszxtbevo() {
        return this.f4301wkgbmnqykc;
    }

    public int hashCode() {
        Object[] objArr = this.f4302zoijcleaow;
        Object[] objArr2 = this.f4300ppxfxbqfkf;
        long[] jArr = this.f4299iobyxmoadg;
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
                            Object obj2 = objArr2[i17];
                            iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final Map iobyxmoadg() {
        return new istkbnxepw(this);
    }

    public final int lqeggnwhkg() {
        return this.f4298eablkybsjg;
    }

    public final boolean nufgyqmvbu() {
        return this.f4298eablkybsjg == 0;
    }

    public final boolean ppxfxbqfkf(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f4301wkgbmnqykc;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f4299iobyxmoadg;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = (((long) i14) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4302zoijcleaow[iNumberOfTrailingZeros], obj)) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a A[DONT_INVERT, PHI: r8
      0x007a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:25:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[LOOP:0: B:9:0x0023->B:27:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007f A[EDGE_INSN: B:31:0x007f->B:28:0x007f BREAK  A[LOOP:0: B:9:0x0023->B:27:0x007c], SYNTHETIC] */
    public String toString() {
        if (nufgyqmvbu()) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append('{');
        Object[] objArr = this.f4302zoijcleaow;
        Object[] objArr2 = this.f4300ppxfxbqfkf;
        long[] jArr = this.f4299iobyxmoadg;
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
                            Object obj2 = objArr2[i17];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb3.append(obj);
                            sb3.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb3.append(obj2);
                            i14++;
                            if (i14 < this.f4298eablkybsjg) {
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

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean wkgbmnqykc(Object obj) {
        Object[] objArr = this.f4300ppxfxbqfkf;
        long[] jArr = this.f4299iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, objArr[(i13 << 3) + i15])) {
                            return true;
                        }
                        j13 >>= 8;
                    }
                    if (i14 == 8) {
                        if (i13 != length) {
                            i13++;
                        }
                    }
                } else if (i13 != length) {
                    i13++;
                }
            }
        }
        return false;
    }

    public final boolean zoijcleaow(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f4301wkgbmnqykc;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f4299iobyxmoadg;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = (((long) i14) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4302zoijcleaow[iNumberOfTrailingZeros], obj)) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    private jlmebxxoox() {
        this.f4299iobyxmoadg = ribwqtqdhb.f4359iobyxmoadg;
        Object[] objArr = jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf;
        this.f4302zoijcleaow = objArr;
        this.f4300ppxfxbqfkf = objArr;
    }
}
