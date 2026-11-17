package mj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class iwizpuwonk extends zdlpuopuiu {
    public static String btonecajqb(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        return nufgyqmvbu(str, "");
    }

    public static /* synthetic */ String draadjrbmk(String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str2 = "|";
        }
        return gtknphoqwx(str, str2);
    }

    public static final String dxjokdxxww(String str, String newIndent, String marginPrefix) {
        int i13;
        String str2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newIndent, "newIndent");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(marginPrefix, "marginPrefix");
        if (kcexrzcfyt.zfvoamnweg(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listZeieaojujs = lmojexxdyd.zeieaojujs(str);
        int length = str.length() + (newIndent.length() * listZeieaojujs.size());
        tg.draadjrbmk draadjrbmkVarWkgbmnqykc = wkgbmnqykc(newIndent);
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(listZeieaojujs);
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Object obj : listZeieaojujs) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i14 == 0 || i14 == iOjitshcjhn) && kcexrzcfyt.zfvoamnweg(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i16 = 0;
                while (true) {
                    if (i16 >= length2) {
                        i13 = -1;
                        break;
                    }
                    if (!iobyxmoadg.ppxfxbqfkf(str3.charAt(i16))) {
                        i13 = i16;
                        break;
                    }
                    i16++;
                }
                if (i13 != -1) {
                    int i17 = i13;
                    if (kcexrzcfyt.wypolnanlu(str3, marginPrefix, i13, false, 4, null)) {
                        int length3 = i17 + marginPrefix.length();
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(str3, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str3.substring(length3);
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str2 = (String) draadjrbmkVarWkgbmnqykc.invoke(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i14 = i15;
        }
        return ((StringBuilder) hg.wwaezpbzkn.roivzttewh(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String eablkybsjg(String line) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(line, "line");
        return line;
    }

    public static final String gtknphoqwx(String str, String marginPrefix) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(marginPrefix, "marginPrefix");
        return dxjokdxxww(str, "", marginPrefix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gxszxtbevo(String str, String line) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(line, "line");
        return str + line;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    private static final int lqeggnwhkg(String str) {
        int length = str.length();
        int i13 = 0;
        while (i13 < length) {
            if (!iobyxmoadg.ppxfxbqfkf(str.charAt(i13))) {
                if (i13 == -1) {
                    return str.length();
                }
                return i13;
            }
            i13++;
        }
        i13 = -1;
        if (i13 == -1) {
            return str.length();
        }
        return i13;
    }

    public static final String nufgyqmvbu(String str, String newIndent) {
        String str2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newIndent, "newIndent");
        List listZeieaojujs = lmojexxdyd.zeieaojujs(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZeieaojujs) {
            if (!kcexrzcfyt.zfvoamnweg((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(lqeggnwhkg((String) it.next())));
        }
        Integer num = (Integer) hg.jyumaefscl.ageimvtcrz(arrayList2);
        int i13 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listZeieaojujs.size());
        tg.draadjrbmk draadjrbmkVarWkgbmnqykc = wkgbmnqykc(newIndent);
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(listZeieaojujs);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listZeieaojujs) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            String str3 = (String) obj2;
            if ((i13 == 0 || i13 == iOjitshcjhn) && kcexrzcfyt.zfvoamnweg(str3)) {
                str3 = null;
            } else {
                String strT = kcexrzcfyt.t(str3, iIntValue);
                if (strT != null && (str2 = (String) draadjrbmkVarWkgbmnqykc.invoke(strT)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i13 = i14;
        }
        return ((StringBuilder) hg.wwaezpbzkn.roivzttewh(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    private static final tg.draadjrbmk wkgbmnqykc(final String str) {
        return str.length() == 0 ? new tg.draadjrbmk() { // from class: mj.yggfygwlhe
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return iwizpuwonk.eablkybsjg((String) obj);
            }
        } : new tg.draadjrbmk() { // from class: mj.jyumaefscl
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return iwizpuwonk.gxszxtbevo(str, (String) obj);
            }
        };
    }
}
