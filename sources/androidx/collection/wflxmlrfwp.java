package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public int[] f4400iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public int f4401zoijcleaow;

    public /* synthetic */ wflxmlrfwp(int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(i13);
    }

    public static /* synthetic */ String lqeggnwhkg(wflxmlrfwp wflxmlrfwpVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, int i14, Object obj) {
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
        return wflxmlrfwpVar.gxszxtbevo(charSequence, charSequence5, charSequence6, i15, charSequence4);
    }

    public static /* synthetic */ int zoijcleaow(wflxmlrfwp wflxmlrfwpVar, int i13, int i14, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i16 & 2) != 0) {
            i14 = 0;
        }
        if ((i16 & 4) != 0) {
            i15 = wflxmlrfwpVar.f4401zoijcleaow;
        }
        return wflxmlrfwpVar.iobyxmoadg(i13, i14, i15);
    }

    public final int eablkybsjg(int i13) {
        if (i13 < 0 || i13 >= this.f4401zoijcleaow) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("Index must be between 0 and size");
        }
        return this.f4400iobyxmoadg[i13];
    }

    public boolean equals(Object obj) {
        if (obj instanceof wflxmlrfwp) {
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            int i13 = wflxmlrfwpVar.f4401zoijcleaow;
            int i14 = this.f4401zoijcleaow;
            if (i13 == i14) {
                int[] iArr = this.f4400iobyxmoadg;
                int[] iArr2 = wflxmlrfwpVar.f4400iobyxmoadg;
                zg.btonecajqb btonecajqbVarJyumaefscl = zg.gtknphoqwx.jyumaefscl(0, i14);
                int iWkgbmnqykc = btonecajqbVarJyumaefscl.wkgbmnqykc();
                int iEablkybsjg = btonecajqbVarJyumaefscl.eablkybsjg();
                if (iWkgbmnqykc > iEablkybsjg) {
                    return true;
                }
                while (iArr[iWkgbmnqykc] == iArr2[iWkgbmnqykc]) {
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

    public final String gxszxtbevo(CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(prefix);
        int[] iArr = this.f4400iobyxmoadg;
        int i14 = this.f4401zoijcleaow;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = iArr[i15];
            if (i15 == i13) {
                sb3.append(truncated);
                String string = sb3.toString();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
                return string;
            }
            if (i15 != 0) {
                sb3.append(separator);
            }
            sb3.append(i16);
        }
        sb3.append(postfix);
        String string2 = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string2, "toString(...)");
        return string2;
    }

    public int hashCode() {
        int[] iArr = this.f4400iobyxmoadg;
        int i13 = this.f4401zoijcleaow;
        int iHashCode = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode += Integer.hashCode(iArr[i14]) * 31;
        }
        return iHashCode;
    }

    public final int iobyxmoadg(int i13, int i14, int i15) {
        if (i14 < 0 || i14 >= i15 || i15 > this.f4401zoijcleaow) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("");
        }
        int i16 = i15 - 1;
        while (i14 <= i16) {
            int i17 = (i14 + i16) >>> 1;
            int i18 = this.f4400iobyxmoadg[i17];
            if (i18 < i13) {
                i14 = i17 + 1;
            } else {
                if (i18 <= i13) {
                    return i17;
                }
                i16 = i17 - 1;
            }
        }
        return -(i14 + 1);
    }

    public final int nufgyqmvbu() {
        if (this.f4401zoijcleaow == 0) {
            jlmebxxoox.wkgbmnqykc.wkgbmnqykc("IntList is empty.");
        }
        return this.f4400iobyxmoadg[this.f4401zoijcleaow - 1];
    }

    public final boolean ppxfxbqfkf(int i13) {
        int[] iArr = this.f4400iobyxmoadg;
        int i14 = this.f4401zoijcleaow;
        for (int i15 = 0; i15 < i14; i15++) {
            if (iArr[i15] == i13) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return lqeggnwhkg(this, null, "[", "]", 0, null, 25, null);
    }

    public final int wkgbmnqykc() {
        if (this.f4401zoijcleaow == 0) {
            jlmebxxoox.wkgbmnqykc.wkgbmnqykc("IntList is empty.");
        }
        return this.f4400iobyxmoadg[0];
    }

    private wflxmlrfwp(int i13) {
        this.f4400iobyxmoadg = i13 == 0 ? oxmwwwfdhm.iobyxmoadg() : new int[i13];
    }
}
