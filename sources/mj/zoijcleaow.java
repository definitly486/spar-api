package mj;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    public static final String eablkybsjg(char c13, Locale locale) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(locale, "locale");
        String strValueOf = String.valueOf(c13);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static int iobyxmoadg(int i13) {
        if (2 <= i13 && i13 < 37) {
            return i13;
        }
        throw new IllegalArgumentException("radix " + i13 + " was not in valid range " + new zg.btonecajqb(2, 36));
    }

    public static boolean ppxfxbqfkf(char c13) {
        return Character.isWhitespace(c13) || Character.isSpaceChar(c13);
    }

    public static String wkgbmnqykc(char c13, Locale locale) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(locale, "locale");
        String strEablkybsjg = eablkybsjg(c13, locale);
        if (strEablkybsjg.length() <= 1) {
            String strValueOf = String.valueOf(c13);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperCase, "toUpperCase(...)");
            return !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strEablkybsjg, upperCase) ? strEablkybsjg : String.valueOf(Character.toTitleCase(c13));
        }
        if (c13 == 329) {
            return strEablkybsjg;
        }
        char cCharAt = strEablkybsjg.charAt(0);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(strEablkybsjg, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = strEablkybsjg.substring(1);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    public static final int zoijcleaow(char c13, int i13) {
        return Character.digit((int) c13, i13);
    }
}
