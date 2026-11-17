package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public long[] f4413iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public int f4414zoijcleaow;

    public /* synthetic */ zdlpuopuiu(int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(i13);
    }

    public static /* synthetic */ String ppxfxbqfkf(zdlpuopuiu zdlpuopuiuVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, int i14, Object obj) {
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
        return zdlpuopuiuVar.zoijcleaow(charSequence, charSequence5, charSequence6, i15, charSequence4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof zdlpuopuiu) {
            zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) obj;
            int i13 = zdlpuopuiuVar.f4414zoijcleaow;
            int i14 = this.f4414zoijcleaow;
            if (i13 == i14) {
                long[] jArr = this.f4413iobyxmoadg;
                long[] jArr2 = zdlpuopuiuVar.f4413iobyxmoadg;
                zg.btonecajqb btonecajqbVarJyumaefscl = zg.gtknphoqwx.jyumaefscl(0, i14);
                int iWkgbmnqykc = btonecajqbVarJyumaefscl.wkgbmnqykc();
                int iEablkybsjg = btonecajqbVarJyumaefscl.eablkybsjg();
                if (iWkgbmnqykc > iEablkybsjg) {
                    return true;
                }
                while (jArr[iWkgbmnqykc] == jArr2[iWkgbmnqykc]) {
                    if (iWkgbmnqykc == iEablkybsjg) {
                        return true;
                    }
                    iWkgbmnqykc++;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        long[] jArr = this.f4413iobyxmoadg;
        int i13 = this.f4414zoijcleaow;
        int iHashCode = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode += Long.hashCode(jArr[i14]) * 31;
        }
        return iHashCode;
    }

    public final long iobyxmoadg(int i13) {
        if (i13 < 0 || i13 >= this.f4414zoijcleaow) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("Index must be between 0 and size");
        }
        return this.f4413iobyxmoadg[i13];
    }

    public String toString() {
        return ppxfxbqfkf(this, null, "[", "]", 0, null, 25, null);
    }

    public final String zoijcleaow(CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(prefix);
        long[] jArr = this.f4413iobyxmoadg;
        int i14 = this.f4414zoijcleaow;
        for (int i15 = 0; i15 < i14; i15++) {
            long j13 = jArr[i15];
            if (i15 == i13) {
                sb3.append(truncated);
                String string = sb3.toString();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
                return string;
            }
            if (i15 != 0) {
                sb3.append(separator);
            }
            sb3.append(j13);
        }
        sb3.append(postfix);
        String string2 = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string2, "toString(...)");
        return string2;
    }

    private zdlpuopuiu(int i13) {
        this.f4413iobyxmoadg = i13 == 0 ? cqumvgiudr.iobyxmoadg() : new long[i13];
    }
}
