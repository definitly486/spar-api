package eg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class zoijcleaow {

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f31256iobyxmoadg;

        static {
            int[] iArr = new int[EnumC0663zoijcleaow.values().length];
            f31256iobyxmoadg = iArr;
            try {
                iArr[EnumC0663zoijcleaow.RC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31256iobyxmoadg[EnumC0663zoijcleaow.BETA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31256iobyxmoadg[EnumC0663zoijcleaow.ALPHA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31256iobyxmoadg[EnumC0663zoijcleaow.PRE_ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: eg.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    enum EnumC0663zoijcleaow {
        SNAPSHOT,
        PRE_ALPHA,
        ALPHA,
        BETA,
        RC,
        STABLE
    }

    static long eablkybsjg(String str, EnumC0663zoijcleaow enumC0663zoijcleaow) {
        int iPpxfxbqfkf;
        if (enumC0663zoijcleaow == EnumC0663zoijcleaow.STABLE || enumC0663zoijcleaow == EnumC0663zoijcleaow.SNAPSHOT || (iPpxfxbqfkf = ppxfxbqfkf(str, enumC0663zoijcleaow)) >= str.length() || !zoijcleaow(str.substring(iPpxfxbqfkf, Math.min(iPpxfxbqfkf + 2, str.length())))) {
            return 0L;
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = iPpxfxbqfkf; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (!Character.isDigit(cCharAt)) {
                if (i13 != iPpxfxbqfkf) {
                    break;
                }
            } else {
                sb3.append(cCharAt);
            }
        }
        return lqeggnwhkg(sb3.toString());
    }

    static EnumC0663zoijcleaow gxszxtbevo(String str) {
        if (str.length() > 0) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.contains("rc")) {
                return EnumC0663zoijcleaow.RC;
            }
            if (lowerCase.contains("beta")) {
                return EnumC0663zoijcleaow.BETA;
            }
            if (lowerCase.contains("alpha")) {
                return lowerCase.substring(0, lowerCase.indexOf("alpha")).contains("pre") ? EnumC0663zoijcleaow.PRE_ALPHA : EnumC0663zoijcleaow.ALPHA;
            }
            if (lowerCase.contains("snapshot")) {
                return EnumC0663zoijcleaow.SNAPSHOT;
            }
        }
        return EnumC0663zoijcleaow.STABLE;
    }

    static int iobyxmoadg(List list, List list2) {
        int size = list.size();
        int size2 = list2.size();
        int iMax = Math.max(size, size2);
        int i13 = 0;
        while (i13 < iMax) {
            if ((i13 < size ? ((Long) list.get(i13)).longValue() : 0L) > (i13 < size2 ? ((Long) list2.get(i13)).longValue() : 0L)) {
                return 1;
            }
            if ((i13 < size ? ((Long) list.get(i13)).longValue() : 0L) < (i13 < size2 ? ((Long) list2.get(i13)).longValue() : 0L)) {
                return -1;
            }
            i13++;
        }
        return 0;
    }

    static long lqeggnwhkg(String str) {
        if (str.length() > 19) {
            str = str.substring(0, 19);
        }
        return Long.parseLong(str);
    }

    static boolean nufgyqmvbu(String str) {
        String strTrim = str.trim();
        return strTrim.length() > 0 && Character.isDigit(strTrim.charAt(0));
    }

    private static int ppxfxbqfkf(String str, EnumC0663zoijcleaow enumC0663zoijcleaow) {
        String lowerCase = str.toLowerCase();
        int i13 = iobyxmoadg.f31256iobyxmoadg[enumC0663zoijcleaow.ordinal()];
        if (i13 == 1) {
            return lowerCase.indexOf("rc") + 2;
        }
        if (i13 == 2) {
            return lowerCase.indexOf("beta") + 4;
        }
        if (i13 == 3 || i13 == 4) {
            return lowerCase.indexOf("alpha") + 5;
        }
        return 0;
    }

    static boolean wkgbmnqykc(CharSequence charSequence) {
        int length = charSequence.length();
        if (length <= 0) {
            return false;
        }
        for (int i13 = 0; i13 < length; i13++) {
            if (!Character.isDigit(charSequence.charAt(i13))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zoijcleaow(CharSequence charSequence) {
        int length = charSequence.length();
        if (length > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                if (Character.isDigit(charSequence.charAt(i13))) {
                    return true;
                }
            }
        }
        return false;
    }
}
