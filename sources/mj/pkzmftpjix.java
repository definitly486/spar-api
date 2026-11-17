package mj;

import hg.metgxyhuhe;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pkzmftpjix extends wwaezpbzkn {
    public static final List A(CharSequence charSequence, int i13, int i14, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        return B(charSequence, i13, i14, z13, new tg.draadjrbmk() { // from class: mj.ylkuphrtab
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return pkzmftpjix.C((CharSequence) obj);
            }
        });
    }

    public static final List B(CharSequence charSequence, int i13, int i14, boolean z13, tg.draadjrbmk transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        metgxyhuhe.iobyxmoadg(i13, i14);
        int length = charSequence.length();
        int i15 = 0;
        ArrayList arrayList = new ArrayList((length / i14) + (length % i14 == 0 ? 0 : 1));
        while (i15 >= 0 && i15 < length) {
            int i16 = i15 + i13;
            if (i16 < 0 || i16 > length) {
                if (!z13) {
                    break;
                }
                i16 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i15, i16)));
            i15 += i14;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String C(CharSequence it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.toString();
    }

    public static List s(CharSequence charSequence, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        return A(charSequence, i13, i13, true);
    }

    public static String t(String str, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        if (i13 >= 0) {
            String strSubstring = str.substring(zg.gtknphoqwx.btonecajqb(i13, str.length()));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i13 + " is less than zero.").toString());
    }

    public static Character u(CharSequence charSequence) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static char v(CharSequence charSequence) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(kcexrzcfyt.xrmfcynszj(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char w(CharSequence charSequence) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static CharSequence x(CharSequence charSequence, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(charSequence, "<this>");
        if (i13 >= 0) {
            return charSequence.subSequence(0, zg.gtknphoqwx.btonecajqb(i13, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i13 + " is less than zero.").toString());
    }

    public static String y(String str, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        if (i13 >= 0) {
            String strSubstring = str.substring(0, zg.gtknphoqwx.btonecajqb(i13, str.length()));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i13 + " is less than zero.").toString());
    }

    public static String z(String str, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        if (i13 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - zg.gtknphoqwx.btonecajqb(i13, length));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i13 + " is less than zero.").toString());
    }
}
