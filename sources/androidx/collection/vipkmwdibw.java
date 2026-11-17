package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public long[] f4395iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int f4396ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public int f4397wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public Object[] f4398zoijcleaow;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return obj == vipkmwdibw.this ? "(this)" : String.valueOf(obj);
        }
    }

    public /* synthetic */ vipkmwdibw(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public static /* synthetic */ String lqeggnwhkg(vipkmwdibw vipkmwdibwVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, tg.draadjrbmk draadjrbmkVar, int i14, Object obj) {
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
        CharSequence charSequence7 = charSequence4;
        if ((i14 & 32) != 0) {
            draadjrbmkVar = null;
        }
        return vipkmwdibwVar.gxszxtbevo(charSequence, charSequence5, charSequence6, i15, charSequence7, draadjrbmkVar);
    }

    public final boolean eablkybsjg() {
        return this.f4397wkgbmnqykc != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:0: B:14:0x0025->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vipkmwdibw)) {
            return false;
        }
        vipkmwdibw vipkmwdibwVar = (vipkmwdibw) obj;
        if (vipkmwdibwVar.ppxfxbqfkf() != ppxfxbqfkf()) {
            return false;
        }
        Object[] objArr = this.f4398zoijcleaow;
        long[] jArr = this.f4395iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128 && !vipkmwdibwVar.iobyxmoadg(objArr[(i13 << 3) + i15])) {
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

    public final String gxszxtbevo(CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(prefix);
        Object[] objArr = this.f4398zoijcleaow;
        long[] jArr = this.f4395iobyxmoadg;
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
                for (int i18 = 0; i18 < i17; i18++) {
                    if ((j13 & 255) < 128) {
                        Object obj = objArr[(i14 << 3) + i18];
                        if (i15 == i13) {
                            sb3.append(truncated);
                            break loop0;
                        }
                        if (i15 != 0) {
                            sb3.append(separator);
                        }
                        if (draadjrbmkVar == null) {
                            sb3.append(obj);
                        } else {
                            sb3.append((CharSequence) draadjrbmkVar.invoke(obj));
                        }
                        i15++;
                        i16 = 8;
                    }
                    j13 >>= i16;
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

    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[DONT_INVERT, PHI: r0
      0x0051: PHI (r0v5 int) = (r0v4 int), (r0v6 int) binds: [B:6:0x0020, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053 A[LOOP:0: B:5:0x0012->B:20:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[EDGE_INSN: B:23:0x0056->B:21:0x0056 BREAK  A[LOOP:0: B:5:0x0012->B:20:0x0053], SYNTHETIC] */
    public int hashCode() {
        int iHashCode = (this.f4396ppxfxbqfkf * 31) + this.f4397wkgbmnqykc;
        Object[] objArr = this.f4398zoijcleaow;
        long[] jArr = this.f4395iobyxmoadg;
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
                            Object obj = objArr[(i13 << 3) + i15];
                            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
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
        return iHashCode;
    }

    public final boolean iobyxmoadg(Object obj) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int ppxfxbqfkf() {
        return this.f4397wkgbmnqykc;
    }

    public String toString() {
        return lqeggnwhkg(this, null, "[", "]", 0, null, new iobyxmoadg(), 25, null);
    }

    public final boolean wkgbmnqykc() {
        return this.f4397wkgbmnqykc == 0;
    }

    public final int zoijcleaow() {
        return this.f4396ppxfxbqfkf;
    }

    private vipkmwdibw() {
        this.f4395iobyxmoadg = ribwqtqdhb.f4359iobyxmoadg;
        this.f4398zoijcleaow = jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf;
    }
}
