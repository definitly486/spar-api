package mj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lmojexxdyd extends cdpycssgdh {

    public static final class iobyxmoadg implements lj.btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ CharSequence f67274iobyxmoadg;

        public iobyxmoadg(CharSequence charSequence) {
            this.f67274iobyxmoadg = charSequence;
        }

        @Override // lj.btonecajqb
        public Iterator iterator() {
            return new dxjokdxxww(this.f67274iobyxmoadg);
        }
    }

    public static final String a(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delimiter, "delimiter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(missingDelimiterValue, "missingDelimiterValue");
        int iYdmasvzmpa = kcexrzcfyt.ydmasvzmpa(str, delimiter, 0, false, 6, null);
        if (iYdmasvzmpa == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iYdmasvzmpa + delimiter.length(), str.length());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void ageimvtcrz(int i13) {
        if (i13 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i13).toString());
    }

    static /* synthetic */ lj.btonecajqb auzgnhcxok(CharSequence charSequence, char[] cArr, int i13, boolean z13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            z13 = false;
        }
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        return roivzttewh(charSequence, cArr, i13, z13, i14);
    }

    public static /* synthetic */ String b(String str, char c13, String str2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = str;
        }
        return kcexrzcfyt.krqnebusok(str, c13, str2);
    }

    public static final int bfopjjpdmp(CharSequence charSequence, String string, int i13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(string, "string");
        return (z13 || !(charSequence instanceof String)) ? czzsidtyhn(charSequence, string, i13, 0, z13, true) : ((String) charSequence).lastIndexOf(string, i13);
    }

    public static /* synthetic */ String c(String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str3 = str;
        }
        return a(str, str2, str3);
    }

    public static final boolean crxdokpmqz(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return kcexrzcfyt.istkbnxepw((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (!ppxfxbqfkf.gxszxtbevo(charSequence.charAt(i13), charSequence2.charAt(i13), true)) {
                return false;
            }
        }
        return true;
    }

    private static final int czzsidtyhn(CharSequence charSequence, CharSequence charSequence2, int i13, int i14, boolean z13, boolean z14) {
        zg.nufgyqmvbu btonecajqbVar = !z14 ? new zg.btonecajqb(zg.gtknphoqwx.gxszxtbevo(i13, 0), zg.gtknphoqwx.btonecajqb(i14, charSequence.length())) : zg.gtknphoqwx.vdvldrhtss(zg.gtknphoqwx.btonecajqb(i13, kcexrzcfyt.xrmfcynszj(charSequence)), zg.gtknphoqwx.gxszxtbevo(i14, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int iWkgbmnqykc = btonecajqbVar.wkgbmnqykc();
            int iEablkybsjg = btonecajqbVar.eablkybsjg();
            int iGxszxtbevo = btonecajqbVar.gxszxtbevo();
            if ((iGxszxtbevo <= 0 || iWkgbmnqykc > iEablkybsjg) && (iGxszxtbevo >= 0 || iEablkybsjg > iWkgbmnqykc)) {
                return -1;
            }
            while (!igdgnonuha(charSequence2, 0, charSequence, iWkgbmnqykc, charSequence2.length(), z13)) {
                if (iWkgbmnqykc == iEablkybsjg) {
                    return -1;
                }
                iWkgbmnqykc += iGxszxtbevo;
            }
            return iWkgbmnqykc;
        }
        int iWkgbmnqykc2 = btonecajqbVar.wkgbmnqykc();
        int iEablkybsjg2 = btonecajqbVar.eablkybsjg();
        int iGxszxtbevo2 = btonecajqbVar.gxszxtbevo();
        if ((iGxszxtbevo2 <= 0 || iWkgbmnqykc2 > iEablkybsjg2) && (iGxszxtbevo2 >= 0 || iEablkybsjg2 > iWkgbmnqykc2)) {
            return -1;
        }
        while (true) {
            String str = (String) charSequence2;
            if (kcexrzcfyt.iozdgvuglv(str, 0, (String) charSequence, iWkgbmnqykc2, str.length(), z13)) {
                return iWkgbmnqykc2;
            }
            if (iWkgbmnqykc2 == iEablkybsjg2) {
                return -1;
            }
            iWkgbmnqykc2 += iGxszxtbevo2;
        }
    }

    public static String d(String str, char c13, String missingDelimiterValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(missingDelimiterValue, "missingDelimiterValue");
        int iOpjhrmiecq = kcexrzcfyt.opjhrmiecq(str, c13, 0, false, 6, null);
        if (iOpjhrmiecq == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iOpjhrmiecq + 1, str.length());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.vdvldrhtss dvvnrvtcbc(char[] cArr, boolean z13, CharSequence DelimitedRangesSequence, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iSflfametgt = sflfametgt(DelimitedRangesSequence, cArr, i13, z13);
        if (iSflfametgt < 0) {
            return null;
        }
        return gg.cqumvgiudr.iobyxmoadg(Integer.valueOf(iSflfametgt), 1);
    }

    public static final String e(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delimiter, "delimiter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(missingDelimiterValue, "missingDelimiterValue");
        int iIyctptxqzt = kcexrzcfyt.iyctptxqzt(str, delimiter, 0, false, 6, null);
        if (iIyctptxqzt == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iIyctptxqzt + delimiter.length(), str.length());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String eslsurpljm(String str, zg.btonecajqb range) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(range, "range");
        String strSubstring = str.substring(range.wflxmlrfwp().intValue(), range.draadjrbmk().intValue() + 1);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean ezmngbhpjk(CharSequence charSequence, char c13, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return jrbgnlbqoe(charSequence, c13, z13);
    }

    public static /* synthetic */ String f(String str, char c13, String str2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = str;
        }
        return kcexrzcfyt.d(str, c13, str2);
    }

    public static CharSequence fiwbwshyhd(CharSequence charSequence, int i13, int i14, CharSequence replacement) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(replacement, "replacement");
        if (i14 >= i13) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(charSequence, 0, i13);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
            sb3.append(replacement);
            sb3.append(charSequence, i14, charSequence.length());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
            return sb3;
        }
        throw new IndexOutOfBoundsException("End index (" + i14 + ") is less than start index (" + i13 + ").");
    }

    public static final boolean fmlbqenlif(CharSequence charSequence, CharSequence prefix, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        return (!z13 && (charSequence instanceof String) && (prefix instanceof String)) ? kcexrzcfyt.stevsuqkhv((String) charSequence, (String) prefix, false, 2, null) : igdgnonuha(charSequence, 0, prefix, 0, prefix.length(), z13);
    }

    public static final List fyldjkxazc(CharSequence charSequence, char[] delimiters, boolean z13, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return grlcpdaxtj(charSequence, String.valueOf(delimiters[0]), z13, i13);
        }
        Iterable iterableJyumaefscl = lj.wflxmlrfwp.jyumaefscl(auzgnhcxok(charSequence, delimiters, 0, z13, i13, 2, null));
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(iterableJyumaefscl, 10));
        Iterator it = iterableJyumaefscl.iterator();
        while (it.hasNext()) {
            arrayList.add(yzdjzghtvl(charSequence, (zg.btonecajqb) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ String g(String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str3 = str;
        }
        return e(str, str2, str3);
    }

    private static final List grlcpdaxtj(CharSequence charSequence, String str, boolean z13, int i13) {
        ageimvtcrz(i13);
        int length = 0;
        int iRlfsiqarku = rlfsiqarku(charSequence, str, 0, z13);
        if (iRlfsiqarku == -1 || i13 == 1) {
            return hg.jyumaefscl.eablkybsjg(charSequence.toString());
        }
        boolean z14 = i13 > 0;
        ArrayList arrayList = new ArrayList(z14 ? zg.gtknphoqwx.btonecajqb(i13, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iRlfsiqarku).toString());
            length = str.length() + iRlfsiqarku;
            if (z14 && arrayList.size() == i13 - 1) {
                break;
            }
            iRlfsiqarku = rlfsiqarku(charSequence, str, length, z13);
        } while (iRlfsiqarku != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static final String h(String str, char c13, String missingDelimiterValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(missingDelimiterValue, "missingDelimiterValue");
        int iYfnezrywwk = kcexrzcfyt.yfnezrywwk(str, c13, 0, false, 6, null);
        if (iYfnezrywwk == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iYfnezrywwk);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String hszhottldk(String str, CharSequence suffix) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(suffix, "suffix");
        if (!kcexrzcfyt.ikoacuggdj(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String i(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delimiter, "delimiter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(missingDelimiterValue, "missingDelimiterValue");
        int iYdmasvzmpa = kcexrzcfyt.ydmasvzmpa(str, delimiter, 0, false, 6, null);
        if (iYdmasvzmpa == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iYdmasvzmpa);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean igdgnonuha(CharSequence charSequence, int i13, CharSequence other, int i14, int i15, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        if (i14 < 0 || i13 < 0 || i13 > charSequence.length() - i15 || i14 > other.length() - i15) {
            return false;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (!ppxfxbqfkf.gxszxtbevo(charSequence.charAt(i13 + i16), other.charAt(i14 + i16), z13)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean ikoacuggdj(CharSequence charSequence, CharSequence charSequence2, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return vipkmwdibw(charSequence, charSequence2, z13);
    }

    public static final List ipoelvxyzq(CharSequence charSequence, String[] delimiters, boolean z13, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return grlcpdaxtj(charSequence, str, z13, i13);
            }
        }
        Iterable iterableJyumaefscl = lj.wflxmlrfwp.jyumaefscl(iwxlajgraz(charSequence, delimiters, 0, z13, i13, 2, null));
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(iterableJyumaefscl, 10));
        Iterator it = iterableJyumaefscl.iterator();
        while (it.hasNext()) {
            arrayList.add(yzdjzghtvl(charSequence, (zg.btonecajqb) it.next()));
        }
        return arrayList;
    }

    static /* synthetic */ lj.btonecajqb iwxlajgraz(CharSequence charSequence, String[] strArr, int i13, boolean z13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            z13 = false;
        }
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        return uawqvzlxes(charSequence, strArr, i13, z13, i14);
    }

    public static /* synthetic */ List ixidwrxhsl(CharSequence charSequence, String[] strArr, boolean z13, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        return ipoelvxyzq(charSequence, strArr, z13, i13);
    }

    public static /* synthetic */ int iyctptxqzt(CharSequence charSequence, String str, int i13, boolean z13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = kcexrzcfyt.xrmfcynszj(charSequence);
        }
        if ((i14 & 4) != 0) {
            z13 = false;
        }
        return bfopjjpdmp(charSequence, str, i13, z13);
    }

    public static /* synthetic */ String j(String str, char c13, String str2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = str;
        }
        return h(str, c13, str2);
    }

    public static /* synthetic */ boolean jhduphickx(CharSequence charSequence, char c13, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return ribwqtqdhb(charSequence, c13, z13);
    }

    public static final boolean jlmebxxoox(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (charSequence.charAt(i13) != charSequence2.charAt(i13)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean jrbgnlbqoe(CharSequence charSequence, char c13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        return charSequence.length() > 0 && ppxfxbqfkf.gxszxtbevo(charSequence.charAt(0), c13, z13);
    }

    public static zg.btonecajqb jztzpxfvev(CharSequence charSequence) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        return new zg.btonecajqb(0, charSequence.length() - 1);
    }

    public static /* synthetic */ String k(String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str3 = str;
        }
        return i(str, str2, str3);
    }

    public static String krqnebusok(String str, char c13, String missingDelimiterValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(missingDelimiterValue, "missingDelimiterValue");
        int iYfnezrywwk = kcexrzcfyt.yfnezrywwk(str, c13, 0, false, 6, null);
        if (iYfnezrywwk == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iYfnezrywwk + 1, str.length());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String l(String str, char c13, String missingDelimiterValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(missingDelimiterValue, "missingDelimiterValue");
        int iOpjhrmiecq = kcexrzcfyt.opjhrmiecq(str, c13, 0, false, 6, null);
        if (iOpjhrmiecq == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iOpjhrmiecq);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final lj.btonecajqb lrnfpwlwnk(CharSequence charSequence) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        return new iobyxmoadg(charSequence);
    }

    public static String lxfrhoxuzk(String str, CharSequence prefix) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        if (!rhgxfdycjh(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String m(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delimiter, "delimiter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(missingDelimiterValue, "missingDelimiterValue");
        int iIyctptxqzt = kcexrzcfyt.iyctptxqzt(str, delimiter, 0, false, 6, null);
        if (iIyctptxqzt == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iIyctptxqzt);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean mbcevpiqjq(CharSequence charSequence, char c13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        return kcexrzcfyt.yfnezrywwk(charSequence, c13, 0, z13, 2, null) >= 0;
    }

    public static final int metgxyhuhe(CharSequence charSequence, char c13, int i13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        return (z13 || !(charSequence instanceof String)) ? sflfametgt(charSequence, new char[]{c13}, i13, z13) : ((String) charSequence).indexOf(c13, i13);
    }

    public static /* synthetic */ List mhtqkkgtqm(CharSequence charSequence, char[] cArr, boolean z13, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        return fyldjkxazc(charSequence, cArr, z13, i13);
    }

    public static /* synthetic */ String n(String str, char c13, String str2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = str;
        }
        return l(str, c13, str2);
    }

    public static boolean ntlheqmsrt(CharSequence charSequence, CharSequence other, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        if (other instanceof String) {
            if (kcexrzcfyt.ydmasvzmpa(charSequence, (String) other, 0, z13, 2, null) < 0) {
                return false;
            }
        } else if (uwvvkdfqfp(charSequence, other, 0, charSequence.length(), z13, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static final CharSequence nuxfzjnpeb(CharSequence charSequence, int i13, char c13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException("Desired length " + i13 + " is less than zero.");
        }
        if (i13 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb3 = new StringBuilder(i13);
        int length = i13 - charSequence.length();
        int i14 = 1;
        if (1 <= length) {
            while (true) {
                sb3.append(c13);
                if (i14 == length) {
                    break;
                }
                i14++;
            }
        }
        sb3.append(charSequence);
        return sb3;
    }

    public static Boolean o(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "true")) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int oipsdeybqn(CharSequence charSequence, char c13, int i13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        return (z13 || !(charSequence instanceof String)) ? weqkydbzbr(charSequence, new char[]{c13}, i13, z13) : ((String) charSequence).lastIndexOf(c13, i13);
    }

    private static final gg.vdvldrhtss okpsazkaxt(CharSequence charSequence, Collection collection, int i13, boolean z13, boolean z14) {
        Object next;
        String str;
        Object next2;
        String str2;
        if (!z13 && collection.size() == 1) {
            String str3 = (String) hg.jyumaefscl.rhgxfdycjh(collection);
            int iYdmasvzmpa = !z14 ? kcexrzcfyt.ydmasvzmpa(charSequence, str3, i13, false, 4, null) : kcexrzcfyt.iyctptxqzt(charSequence, str3, i13, false, 4, null);
            if (iYdmasvzmpa < 0) {
                return null;
            }
            return gg.cqumvgiudr.iobyxmoadg(Integer.valueOf(iYdmasvzmpa), str3);
        }
        zg.nufgyqmvbu btonecajqbVar = !z14 ? new zg.btonecajqb(zg.gtknphoqwx.gxszxtbevo(i13, 0), charSequence.length()) : zg.gtknphoqwx.vdvldrhtss(zg.gtknphoqwx.btonecajqb(i13, kcexrzcfyt.xrmfcynszj(charSequence)), 0);
        if (charSequence instanceof String) {
            int iWkgbmnqykc = btonecajqbVar.wkgbmnqykc();
            int iEablkybsjg = btonecajqbVar.eablkybsjg();
            int iGxszxtbevo = btonecajqbVar.gxszxtbevo();
            if ((iGxszxtbevo > 0 && iWkgbmnqykc <= iEablkybsjg) || (iGxszxtbevo < 0 && iEablkybsjg <= iWkgbmnqykc)) {
                while (true) {
                    Iterator it = collection.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        str2 = (String) next2;
                    } while (!kcexrzcfyt.iozdgvuglv(str2, 0, (String) charSequence, iWkgbmnqykc, str2.length(), z13));
                    String str4 = (String) next2;
                    if (str4 != null) {
                        return gg.cqumvgiudr.iobyxmoadg(Integer.valueOf(iWkgbmnqykc), str4);
                    }
                    if (iWkgbmnqykc != iEablkybsjg) {
                        iWkgbmnqykc += iGxszxtbevo;
                    }
                }
            }
        } else {
            int iWkgbmnqykc2 = btonecajqbVar.wkgbmnqykc();
            int iEablkybsjg2 = btonecajqbVar.eablkybsjg();
            int iGxszxtbevo2 = btonecajqbVar.gxszxtbevo();
            if ((iGxszxtbevo2 > 0 && iWkgbmnqykc2 <= iEablkybsjg2) || (iGxszxtbevo2 < 0 && iEablkybsjg2 <= iWkgbmnqykc2)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        str = (String) next;
                    } while (!igdgnonuha(str, 0, charSequence, iWkgbmnqykc2, str.length(), z13));
                    String str5 = (String) next;
                    if (str5 != null) {
                        return gg.cqumvgiudr.iobyxmoadg(Integer.valueOf(iWkgbmnqykc2), str5);
                    }
                    if (iWkgbmnqykc2 != iEablkybsjg2) {
                        iWkgbmnqykc2 += iGxszxtbevo2;
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ int opjhrmiecq(CharSequence charSequence, char c13, int i13, boolean z13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = kcexrzcfyt.xrmfcynszj(charSequence);
        }
        if ((i14 & 4) != 0) {
            z13 = false;
        }
        return oipsdeybqn(charSequence, c13, i13, z13);
    }

    public static CharSequence p(CharSequence charSequence) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i13 = 0;
        boolean z13 = false;
        while (i13 <= length) {
            boolean zPpxfxbqfkf = mj.iobyxmoadg.ppxfxbqfkf(charSequence.charAt(!z13 ? i13 : length));
            if (z13) {
                if (!zPpxfxbqfkf) {
                    break;
                }
                length--;
            } else if (zPpxfxbqfkf) {
                i13++;
            } else {
                z13 = true;
            }
        }
        return charSequence.subSequence(i13, length + 1);
    }

    public static String q(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(chars, "chars");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i13 = length - 1;
            if (!hg.agtfadlqog.vipkmwdibw(chars, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i13 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i13;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ boolean rhgxfdycjh(CharSequence charSequence, CharSequence charSequence2, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return fmlbqenlif(charSequence, charSequence2, z13);
    }

    public static final boolean ribwqtqdhb(CharSequence charSequence, char c13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        return charSequence.length() > 0 && ppxfxbqfkf.gxszxtbevo(charSequence.charAt(kcexrzcfyt.xrmfcynszj(charSequence)), c13, z13);
    }

    public static final int rlfsiqarku(CharSequence charSequence, String string, int i13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(string, "string");
        return (z13 || !(charSequence instanceof String)) ? uwvvkdfqfp(charSequence, string, i13, charSequence.length(), z13, false, 16, null) : ((String) charSequence).indexOf(string, i13);
    }

    private static final lj.btonecajqb roivzttewh(CharSequence charSequence, final char[] cArr, int i13, final boolean z13, int i14) {
        ageimvtcrz(i14);
        return new eablkybsjg(charSequence, i13, i14, new tg.rgvfuqvkyq() { // from class: mj.yadqdtsiqt
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return lmojexxdyd.dvvnrvtcbc(cArr, z13, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static final int sflfametgt(CharSequence charSequence, char[] chars, int i13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(chars, "chars");
        if (!z13 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(hg.agtfadlqog.mhtqkkgtqm(chars), i13);
        }
        int iGxszxtbevo = zg.gtknphoqwx.gxszxtbevo(i13, 0);
        int iXrmfcynszj = kcexrzcfyt.xrmfcynszj(charSequence);
        if (iGxszxtbevo > iXrmfcynszj) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iGxszxtbevo);
            for (char c13 : chars) {
                if (ppxfxbqfkf.gxszxtbevo(c13, cCharAt, z13)) {
                    return iGxszxtbevo;
                }
            }
            if (iGxszxtbevo == iXrmfcynszj) {
                return -1;
            }
            iGxszxtbevo++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.vdvldrhtss skhdrjzrfn(List list, boolean z13, CharSequence DelimitedRangesSequence, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        gg.vdvldrhtss vdvldrhtssVarOkpsazkaxt = okpsazkaxt(DelimitedRangesSequence, list, i13, z13, false);
        if (vdvldrhtssVarOkpsazkaxt != null) {
            return gg.cqumvgiudr.iobyxmoadg(vdvldrhtssVarOkpsazkaxt.lqeggnwhkg(), Integer.valueOf(((String) vdvldrhtssVarOkpsazkaxt.nufgyqmvbu()).length()));
        }
        return null;
    }

    public static /* synthetic */ boolean sopmlzcsov(CharSequence charSequence, CharSequence charSequence2, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return kcexrzcfyt.ntlheqmsrt(charSequence, charSequence2, z13);
    }

    public static String tbqsvytpvh(String str, int i13, char c13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        return nuxfzjnpeb(str, i13, c13).toString();
    }

    private static final lj.btonecajqb uawqvzlxes(CharSequence charSequence, String[] strArr, int i13, final boolean z13, int i14) {
        ageimvtcrz(i14);
        final List listGxszxtbevo = hg.agtfadlqog.gxszxtbevo(strArr);
        return new eablkybsjg(charSequence, i13, i14, new tg.rgvfuqvkyq() { // from class: mj.iozdgvuglv
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return lmojexxdyd.skhdrjzrfn(listGxszxtbevo, z13, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static /* synthetic */ boolean ulzqkzuiru(CharSequence charSequence, char c13, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return mbcevpiqjq(charSequence, c13, z13);
    }

    static /* synthetic */ int uwvvkdfqfp(CharSequence charSequence, CharSequence charSequence2, int i13, int i14, boolean z13, boolean z14, int i15, Object obj) {
        if ((i15 & 16) != 0) {
            z14 = false;
        }
        return czzsidtyhn(charSequence, charSequence2, i13, i14, z13, z14);
    }

    public static final boolean vipkmwdibw(CharSequence charSequence, CharSequence suffix, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(suffix, "suffix");
        return (!z13 && (charSequence instanceof String) && (suffix instanceof String)) ? kcexrzcfyt.zynmafqrjb((String) charSequence, (String) suffix, false, 2, null) : igdgnonuha(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z13);
    }

    public static final int weqkydbzbr(CharSequence charSequence, char[] chars, int i13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(chars, "chars");
        if (!z13 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(hg.agtfadlqog.mhtqkkgtqm(chars), i13);
        }
        for (int iBtonecajqb = zg.gtknphoqwx.btonecajqb(i13, kcexrzcfyt.xrmfcynszj(charSequence)); -1 < iBtonecajqb; iBtonecajqb--) {
            char cCharAt = charSequence.charAt(iBtonecajqb);
            for (char c13 : chars) {
                if (ppxfxbqfkf.gxszxtbevo(c13, cCharAt, z13)) {
                    return iBtonecajqb;
                }
            }
        }
        return -1;
    }

    public static CharSequence wizcaqwiak(CharSequence charSequence, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("End index (" + i14 + ") is less than start index (" + i13 + ").");
        }
        if (i14 == i13) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb3 = new StringBuilder(charSequence.length() - (i14 - i13));
        sb3.append(charSequence, 0, i13);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
        sb3.append(charSequence, i14, charSequence.length());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
        return sb3;
    }

    public static int xrmfcynszj(CharSequence charSequence) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ int ydmasvzmpa(CharSequence charSequence, String str, int i13, boolean z13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        if ((i14 & 4) != 0) {
            z13 = false;
        }
        return rlfsiqarku(charSequence, str, i13, z13);
    }

    public static /* synthetic */ int yfnezrywwk(CharSequence charSequence, char c13, int i13, boolean z13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        if ((i14 & 4) != 0) {
            z13 = false;
        }
        return metgxyhuhe(charSequence, c13, i13, z13);
    }

    public static final String yzdjzghtvl(CharSequence charSequence, zg.btonecajqb range) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(range, "range");
        return charSequence.subSequence(range.wflxmlrfwp().intValue(), range.draadjrbmk().intValue() + 1).toString();
    }

    public static final List zeieaojujs(CharSequence charSequence) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        return lj.wflxmlrfwp.crxdokpmqz(lrnfpwlwnk(charSequence));
    }

    public static boolean zfvoamnweg(CharSequence charSequence) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        for (int i13 = 0; i13 < charSequence.length(); i13++) {
            if (!mj.iobyxmoadg.ppxfxbqfkf(charSequence.charAt(i13))) {
                return false;
            }
        }
        return true;
    }
}
