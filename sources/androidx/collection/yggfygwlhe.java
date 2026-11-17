package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class yggfygwlhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public int f4407eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public long[] f4408iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public Object[] f4409ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public int f4410wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public long[] f4411zoijcleaow;

    public /* synthetic */ yggfygwlhe(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public final boolean eablkybsjg() {
        return this.f4407eablkybsjg == 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x007a A[LOOP:0: B:14:0x0027->B:35:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x007d A[EDGE_INSN: B:38:0x007d->B:36:0x007d BREAK  A[LOOP:0: B:14:0x0027->B:35:0x007a], SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yggfygwlhe)) {
            return false;
        }
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
        if (yggfygwlheVar.wkgbmnqykc() != wkgbmnqykc()) {
            return false;
        }
        long[] jArr = this.f4411zoijcleaow;
        Object[] objArr = this.f4409ppxfxbqfkf;
        long[] jArr2 = this.f4408iobyxmoadg;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr2[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j13) < 128) {
                            int i17 = (i13 << 3) + i16;
                            long j14 = jArr[i17];
                            Object obj2 = objArr[i17];
                            if (obj2 == null) {
                                if (yggfygwlheVar.zoijcleaow(j14) != null || !yggfygwlheVar.iobyxmoadg(j14)) {
                                    return false;
                                }
                            } else if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj2, yggfygwlheVar.zoijcleaow(j14))) {
                                return false;
                            }
                            i14 = 8;
                        }
                        j13 >>= i14;
                    }
                    if (i15 != i14) {
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

    public int hashCode() {
        long[] jArr = this.f4411zoijcleaow;
        Object[] objArr = this.f4409ppxfxbqfkf;
        long[] jArr2 = this.f4408iobyxmoadg;
        int length = jArr2.length - 2;
        int i13 = 0;
        if (length >= 0) {
            int i14 = 0;
            int iHashCode = 0;
            while (true) {
                long j13 = jArr2[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j13) < 128) {
                            int i17 = (i14 << 3) + i16;
                            long j14 = jArr[i17];
                            Object obj = objArr[i17];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j14);
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

    public final boolean iobyxmoadg(long j13) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int ppxfxbqfkf() {
        return this.f4410wkgbmnqykc;
    }

    public String toString() {
        int i13;
        int i14;
        if (eablkybsjg()) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append('{');
        long[] jArr = this.f4411zoijcleaow;
        Object[] objArr = this.f4409ppxfxbqfkf;
        long[] jArr2 = this.f4408iobyxmoadg;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i15 = 0;
            int i16 = 0;
            while (true) {
                long j13 = jArr2[i15];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((255 & j13) < 128) {
                            int i19 = (i15 << 3) + i18;
                            i14 = i15;
                            long j14 = jArr[i19];
                            Object obj = objArr[i19];
                            sb3.append(j14);
                            sb3.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb3.append(obj);
                            i16++;
                            if (i16 < this.f4407eablkybsjg) {
                                sb3.append(',');
                                sb3.append(' ');
                            }
                        } else {
                            i14 = i15;
                        }
                        j13 >>= 8;
                        i18++;
                        i15 = i14;
                    }
                    int i23 = i15;
                    if (i17 != 8) {
                        break;
                    }
                    i13 = i23;
                } else {
                    i13 = i15;
                }
                if (i13 == length) {
                    break;
                }
                i15 = i13 + 1;
            }
        }
        sb3.append('}');
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final int wkgbmnqykc() {
        return this.f4407eablkybsjg;
    }

    public final Object zoijcleaow(long j13) {
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
            return this.f4409ppxfxbqfkf[iNumberOfTrailingZeros];
        }
        return null;
    }

    private yggfygwlhe() {
        this.f4408iobyxmoadg = ribwqtqdhb.f4359iobyxmoadg;
        this.f4411zoijcleaow = cqumvgiudr.iobyxmoadg();
        this.f4409ppxfxbqfkf = jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf;
    }
}
