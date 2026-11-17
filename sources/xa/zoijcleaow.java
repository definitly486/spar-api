package xa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    public static String eablkybsjg(String str) {
        int length = str.length();
        int i13 = 0;
        while (i13 < length) {
            if (wkgbmnqykc(str.charAt(i13))) {
                char[] charArray = str.toCharArray();
                while (i13 < length) {
                    char c13 = charArray[i13];
                    if (wkgbmnqykc(c13)) {
                        charArray[i13] = (char) (c13 ^ ' ');
                    }
                    i13++;
                }
                return String.valueOf(charArray);
            }
            i13++;
        }
        return str;
    }

    public static String gxszxtbevo(String str) {
        int length = str.length();
        int i13 = 0;
        while (i13 < length) {
            if (ppxfxbqfkf(str.charAt(i13))) {
                char[] charArray = str.toCharArray();
                while (i13 < length) {
                    char c13 = charArray[i13];
                    if (ppxfxbqfkf(c13)) {
                        charArray[i13] = (char) (c13 ^ ' ');
                    }
                    i13++;
                }
                return String.valueOf(charArray);
            }
            i13++;
        }
        return str;
    }

    public static boolean iobyxmoadg(CharSequence charSequence, CharSequence charSequence2) {
        int iZoijcleaow;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = charSequence.charAt(i13);
            char cCharAt2 = charSequence2.charAt(i13);
            if (cCharAt != cCharAt2 && ((iZoijcleaow = zoijcleaow(cCharAt)) >= 26 || iZoijcleaow != zoijcleaow(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean ppxfxbqfkf(char c13) {
        return c13 >= 'a' && c13 <= 'z';
    }

    public static boolean wkgbmnqykc(char c13) {
        return c13 >= 'A' && c13 <= 'Z';
    }

    private static int zoijcleaow(char c13) {
        return (char) ((c13 | ' ') - 97);
    }
}
