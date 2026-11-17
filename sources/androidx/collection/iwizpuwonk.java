package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public long[] f4293iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int f4294ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public int f4295wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public long[] f4296zoijcleaow;

    public /* synthetic */ iwizpuwonk(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public static /* synthetic */ String wkgbmnqykc(iwizpuwonk iwizpuwonkVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i14 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i14 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i14 & 4) == 0 ? charSequence3 : "";
        if ((i14 & 8) != 0) {
            i13 = -1;
        }
        int i15 = i13;
        if ((i14 & 16) != 0) {
            charSequence4 = "...";
        }
        return iwizpuwonkVar.ppxfxbqfkf(charSequence, charSequence5, charSequence6, i15, charSequence4);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iwizpuwonk)) {
            return false;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        if (iwizpuwonkVar.f4295wkgbmnqykc != this.f4295wkgbmnqykc) {
            return false;
        }
        long[] jArr = this.f4296zoijcleaow;
        long[] jArr2 = this.f4293iobyxmoadg;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr2[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128 && !iwizpuwonkVar.iobyxmoadg(jArr[(i13 << 3) + i15])) {
                            return false;
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
        return true;
    }

    public int hashCode() {
        long[] jArr = this.f4296zoijcleaow;
        long[] jArr2 = this.f4293iobyxmoadg;
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
                            iHashCode += Long.hashCode(jArr[(i14 << 3) + i16]);
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
        int i15 = this.f4294ppxfxbqfkf;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f4293iobyxmoadg;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j14 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j15 = (((long) i14) * 72340172838076673L) ^ j14;
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i16) & i15;
                if (this.f4296zoijcleaow[iNumberOfTrailingZeros] == j13) {
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

    public final String ppxfxbqfkf(CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated) {
        int i14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(prefix);
        long[] jArr = this.f4296zoijcleaow;
        long[] jArr2 = this.f4293iobyxmoadg;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb3.append(postfix);
            break;
        }
        int i15 = 0;
        int i16 = 0;
        loop0: while (true) {
            long j13 = jArr2[i15];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8;
                int i18 = 8 - ((~(i15 - length)) >>> 31);
                int i19 = 0;
                while (i19 < i18) {
                    if ((j13 & 255) < 128) {
                        long j14 = jArr[(i15 << 3) + i19];
                        if (i16 == i13) {
                            sb3.append(truncated);
                            break loop0;
                        }
                        if (i16 != 0) {
                            sb3.append(separator);
                        }
                        sb3.append(j14);
                        i16++;
                    }
                    j13 >>= 8;
                    i19++;
                    i17 = 8;
                    i15 = i15;
                }
                int i23 = i15;
                if (i18 == i17) {
                    i14 = i23;
                }
                sb3.append(postfix);
                break;
            }
            i14 = i15;
            if (i14 == length) {
                sb3.append(postfix);
                break;
            }
            i15 = i14 + 1;
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public String toString() {
        return wkgbmnqykc(this, null, "[", "]", 0, null, 25, null);
    }

    public final int zoijcleaow() {
        return this.f4294ppxfxbqfkf;
    }

    private iwizpuwonk() {
        this.f4293iobyxmoadg = ribwqtqdhb.f4359iobyxmoadg;
        this.f4296zoijcleaow = cqumvgiudr.iobyxmoadg();
    }
}
