package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public long[] f4391iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int f4392ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public int f4393wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public int[] f4394zoijcleaow;

    public /* synthetic */ vdvldrhtss(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public static /* synthetic */ String gxszxtbevo(vdvldrhtss vdvldrhtssVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, int i14, Object obj) {
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
        return vdvldrhtssVar.eablkybsjg(charSequence, charSequence5, charSequence6, i15, charSequence4);
    }

    public final String eablkybsjg(CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(prefix);
        int[] iArr = this.f4394zoijcleaow;
        long[] jArr = this.f4391iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            sb3.append(postfix);
            break;
        }
        int i14 = 0;
        int i15 = 0;
        loop0: while (true) {
            long j13 = jArr[i14];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i14 - length)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((j13 & 255) < 128) {
                        int i19 = iArr[(i14 << 3) + i18];
                        if (i15 == i13) {
                            sb3.append(truncated);
                            break loop0;
                        }
                        if (i15 != 0) {
                            sb3.append(separator);
                        }
                        sb3.append(i19);
                        i15++;
                    }
                    j13 >>= 8;
                    i18++;
                    i16 = 8;
                }
                if (i17 == i16) {
                }
                sb3.append(postfix);
                break;
            }
            if (i14 == length) {
                sb3.append(postfix);
                break;
            }
            i14++;
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        if (vdvldrhtssVar.f4393wkgbmnqykc != this.f4393wkgbmnqykc) {
            return false;
        }
        int[] iArr = this.f4394zoijcleaow;
        long[] jArr = this.f4391iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128 && !vdvldrhtssVar.iobyxmoadg(iArr[(i13 << 3) + i15])) {
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
        int[] iArr = this.f4394zoijcleaow;
        long[] jArr = this.f4391iobyxmoadg;
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
                            iHashCode += Integer.hashCode(iArr[(i14 << 3) + i16]);
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
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f4392ppxfxbqfkf;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f4391iobyxmoadg;
            int i19 = i17 >> 3;
            int i23 = (i17 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (((long) i15) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                if (this.f4394zoijcleaow[iNumberOfTrailingZeros] == i13) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean ppxfxbqfkf() {
        return this.f4393wkgbmnqykc == 0;
    }

    public String toString() {
        return gxszxtbevo(this, null, "[", "]", 0, null, 25, null);
    }

    public final boolean wkgbmnqykc() {
        return this.f4393wkgbmnqykc != 0;
    }

    public final int zoijcleaow() {
        return this.f4392ppxfxbqfkf;
    }

    private vdvldrhtss() {
        this.f4391iobyxmoadg = ribwqtqdhb.f4359iobyxmoadg;
        this.f4394zoijcleaow = oxmwwwfdhm.iobyxmoadg();
    }
}
