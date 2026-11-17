package mj;

import java.util.Comparator;
import kotlin.jvm.internal.tzroggbefp;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cdpycssgdh extends istkbnxepw {
    public static /* synthetic */ boolean cdpycssgdh(String str, String str2, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return kcexrzcfyt.istkbnxepw(str, str2, z13);
    }

    public static boolean cllcsxoeiz(String str, String prefix, int i13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        return !z13 ? str.startsWith(prefix, i13) : kcexrzcfyt.iozdgvuglv(str, i13, prefix, 0, prefix.length(), z13);
    }

    public static boolean cqumvgiudr(CharSequence charSequence, CharSequence charSequence2, boolean z13) {
        return z13 ? lmojexxdyd.crxdokpmqz(charSequence, charSequence2) : iwizpuwonk(charSequence, charSequence2);
    }

    public static boolean dsvhmnatus(String str, String prefix, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        return !z13 ? str.startsWith(prefix) : kcexrzcfyt.iozdgvuglv(str, 0, prefix, 0, prefix.length(), z13);
    }

    public static String esjtqupxsv(byte[] bArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        return new String(bArr, wkgbmnqykc.f67326zoijcleaow);
    }

    public static /* synthetic */ String hcddaimhww(String str, String str2, String str3, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        return ylkuphrtab(str, str2, str3, z13);
    }

    public static /* synthetic */ String hkdspvbjdz(String str, String str2, String str3, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        return kcexrzcfyt.jpowsppfya(str, str2, str3, z13);
    }

    public static boolean iozdgvuglv(String str, int i13, String other, int i14, int i15, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        return !z13 ? str.regionMatches(i13, other, i14, i15) : str.regionMatches(z13, i13, other, i14, i15);
    }

    public static boolean istkbnxepw(String str, String str2, boolean z13) {
        if (str == null) {
            return str2 == null;
        }
        return !z13 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final boolean iwizpuwonk(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? lmojexxdyd.jlmebxxoox(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    public static String jpowsppfya(String str, String oldValue, String newValue, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oldValue, "oldValue");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newValue, "newValue");
        int iYdmasvzmpa = kcexrzcfyt.ydmasvzmpa(str, oldValue, 0, z13, 2, null);
        return iYdmasvzmpa < 0 ? str : kcexrzcfyt.fiwbwshyhd(str, iYdmasvzmpa, oldValue.length() + iYdmasvzmpa, newValue).toString();
    }

    public static String jyumaefscl(char[] cArr, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cArr, "<this>");
        hg.wkgbmnqykc.f40274zdlpuopuiu.iobyxmoadg(i13, i14, cArr.length);
        return new String(cArr, i13, i14 - i13);
    }

    public static byte[] lereixgezr(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        byte[] bytes = str.getBytes(wkgbmnqykc.f67326zoijcleaow);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bytes, "getBytes(...)");
        return bytes;
    }

    public static String lmojexxdyd(CharSequence charSequence, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i13 + '.').toString());
        }
        if (i13 == 0) {
            return "";
        }
        int i14 = 1;
        if (i13 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i13];
            for (int i15 = 0; i15 < i13; i15++) {
                cArr[i15] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb3 = new StringBuilder(charSequence.length() * i13);
        if (1 <= i13) {
            while (true) {
                sb3.append(charSequence);
                if (i14 == i13) {
                    break;
                }
                i14++;
            }
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(string);
        return string;
    }

    public static /* synthetic */ String pkzmftpjix(String str, char c13, char c14, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        return wwaezpbzkn(str, c13, c14, z13);
    }

    public static boolean pmvmpeiblj(String str, String suffix, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(suffix, "suffix");
        return !z13 ? str.endsWith(suffix) : kcexrzcfyt.iozdgvuglv(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean stevsuqkhv(String str, String str2, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return kcexrzcfyt.dsvhmnatus(str, str2, z13);
    }

    public static final String wwaezpbzkn(String str, char c13, char c14, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        if (!z13) {
            String strReplace = str.replace(c13, c14);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb3 = new StringBuilder(str.length());
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (ppxfxbqfkf.gxszxtbevo(cCharAt, c13, z13)) {
                cCharAt = c14;
            }
            sb3.append(cCharAt);
        }
        return sb3.toString();
    }

    public static /* synthetic */ boolean wypolnanlu(String str, String str2, int i13, boolean z13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            z13 = false;
        }
        return kcexrzcfyt.cllcsxoeiz(str, str2, i13, z13);
    }

    public static Comparator yadqdtsiqt(tzroggbefp tzroggbefpVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tzroggbefpVar, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static String yggfygwlhe(char[] cArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cArr, "<this>");
        return new String(cArr);
    }

    public static final String ylkuphrtab(String str, String oldValue, String newValue, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oldValue, "oldValue");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newValue, "newValue");
        int i13 = 0;
        int iRlfsiqarku = lmojexxdyd.rlfsiqarku(str, oldValue, 0, z13);
        if (iRlfsiqarku < 0) {
            return str;
        }
        int length = oldValue.length();
        int iGxszxtbevo = zg.gtknphoqwx.gxszxtbevo(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb3 = new StringBuilder(length2);
        do {
            sb3.append((CharSequence) str, i13, iRlfsiqarku);
            sb3.append(newValue);
            i13 = iRlfsiqarku + length;
            if (iRlfsiqarku >= str.length()) {
                break;
            }
            iRlfsiqarku = lmojexxdyd.rlfsiqarku(str, oldValue, iRlfsiqarku + iGxszxtbevo, z13);
        } while (iRlfsiqarku > 0);
        sb3.append((CharSequence) str, i13, str.length());
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ boolean zynmafqrjb(String str, String str2, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return kcexrzcfyt.pmvmpeiblj(str, str2, z13);
    }
}
