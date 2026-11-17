package hj;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    private static final String eablkybsjg(String str, boolean z13) {
        if (z13) {
            return gxszxtbevo(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String gxszxtbevo(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        StringBuilder sb3 = new StringBuilder(str.length());
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb3.append(cCharAt);
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public static final String iobyxmoadg(String str) {
        char cCharAt;
        zdlpuopuiu.btonecajqb(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str.length());
        sb3.append(Character.toUpperCase(cCharAt));
        sb3.append((CharSequence) str, 1, str.length());
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public static final String ppxfxbqfkf(String str, boolean z13) {
        Object next;
        zdlpuopuiu.btonecajqb(str, "<this>");
        if (str.length() == 0 || !wkgbmnqykc(str, 0, z13)) {
            return str;
        }
        if (str.length() == 1 || !wkgbmnqykc(str, 1, z13)) {
            if (z13) {
                return zoijcleaow(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
            return lowerCase + strSubstring;
        }
        Iterator it = kcexrzcfyt.jztzpxfvev(str).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (wkgbmnqykc(str, ((Number) next).intValue(), z13));
        Integer num = (Integer) next;
        if (num == null) {
            return eablkybsjg(str, z13);
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb3 = new StringBuilder();
        String strSubstring2 = str.substring(0, iIntValue);
        zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
        sb3.append(eablkybsjg(strSubstring2, z13));
        String strSubstring3 = str.substring(iIntValue);
        zdlpuopuiu.dxjokdxxww(strSubstring3, "substring(...)");
        sb3.append(strSubstring3);
        return sb3.toString();
    }

    private static final boolean wkgbmnqykc(String str, int i13, boolean z13) {
        char cCharAt = str.charAt(i13);
        if (z13) {
            return 'A' <= cCharAt && cCharAt < '[';
        }
        return Character.isUpperCase(cCharAt);
    }

    public static final String zoijcleaow(String str) {
        char cCharAt;
        zdlpuopuiu.btonecajqb(str, "<this>");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return lowerCase + strSubstring;
    }
}
