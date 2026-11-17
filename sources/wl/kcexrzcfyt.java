package wl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final String[] f120176iobyxmoadg = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Pattern f120179zoijcleaow = Pattern.compile("^/(?>(?>\\.\\.?/)+)");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Pattern f120177ppxfxbqfkf = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Pattern f120178wkgbmnqykc = Pattern.compile("[\\x00-\\x1f]*");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final wflxmlrfwp f120175eablkybsjg = new wflxmlrfwp(new Supplier() { // from class: wl.agtfadlqog
        @Override // java.util.function.Supplier
        public final Object get() {
            return kcexrzcfyt.jyumaefscl();
        }
    });

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        StringBuilder f120180iobyxmoadg = kcexrzcfyt.eablkybsjg();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        boolean f120181ppxfxbqfkf = true;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final String f120182zoijcleaow;

        public iobyxmoadg(String str) {
            this.f120182zoijcleaow = str;
        }

        public iobyxmoadg iobyxmoadg(Object obj) {
            vl.zoijcleaow.btonecajqb(this.f120180iobyxmoadg);
            if (!this.f120181ppxfxbqfkf) {
                this.f120180iobyxmoadg.append(this.f120182zoijcleaow);
            }
            this.f120180iobyxmoadg.append(obj);
            this.f120181ppxfxbqfkf = false;
            return this;
        }

        public String ppxfxbqfkf() {
            String strEsjtqupxsv = kcexrzcfyt.esjtqupxsv(this.f120180iobyxmoadg);
            this.f120180iobyxmoadg = null;
            return strEsjtqupxsv;
        }

        public iobyxmoadg zoijcleaow(Object obj) {
            vl.zoijcleaow.btonecajqb(this.f120180iobyxmoadg);
            this.f120180iobyxmoadg.append(obj);
            return this;
        }
    }

    public static boolean agtfadlqog(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (!gtknphoqwx(str.charAt(i13))) {
                return false;
            }
        }
        return true;
    }

    public static boolean btonecajqb(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i13 = 0; i13 < length; i13++) {
                if (!ojitshcjhn(str.codePointAt(i13))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String cqumvgiudr(int i13, int i14) {
        vl.zoijcleaow.wkgbmnqykc(i13 >= 0, "width must be >= 0");
        vl.zoijcleaow.ppxfxbqfkf(i14 >= -1);
        if (i14 != -1) {
            i13 = Math.min(i13, i14);
        }
        String[] strArr = f120176iobyxmoadg;
        if (i13 < strArr.length) {
            return strArr[i13];
        }
        char[] cArr = new char[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            cArr[i15] = ' ';
        }
        return String.valueOf(cArr);
    }

    public static boolean draadjrbmk(char c13) {
        return gtknphoqwx(c13) || (c13 >= 'a' && c13 <= 'f') || (c13 >= 'A' && c13 <= 'F');
    }

    public static boolean dxjokdxxww(char c13) {
        return (c13 >= 'a' && c13 <= 'z') || (c13 >= 'A' && c13 <= 'Z');
    }

    public static StringBuilder eablkybsjg() {
        return (StringBuilder) f120175eablkybsjg.zoijcleaow();
    }

    public static String esjtqupxsv(StringBuilder sb3) {
        vl.zoijcleaow.btonecajqb(sb3);
        String string = sb3.toString();
        lereixgezr(sb3);
        return string;
    }

    public static boolean gtknphoqwx(char c13) {
        return c13 >= '0' && c13 <= '9';
    }

    public static boolean gxszxtbevo(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static String istkbnxepw(String str) {
        return f120178wkgbmnqykc.matcher(str).replaceAll("");
    }

    public static String iwizpuwonk(String str) {
        StringBuilder sbEablkybsjg = eablkybsjg();
        wkgbmnqykc(sbEablkybsjg, str, false);
        return esjtqupxsv(sbEablkybsjg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StringBuilder jyumaefscl() {
        return new StringBuilder(UserVerificationMethods.USER_VERIFY_ALL);
    }

    public static Collector kcexrzcfyt(final String str) {
        return Collector.of(new Supplier() { // from class: wl.ojitshcjhn
            @Override // java.util.function.Supplier
            public final Object get() {
                return kcexrzcfyt.zdlpuopuiu(str);
            }
        }, new BiConsumer() { // from class: wl.rgvfuqvkyq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((kcexrzcfyt.iobyxmoadg) obj).iobyxmoadg((CharSequence) obj2);
            }
        }, new BinaryOperator() { // from class: wl.vdvldrhtss
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return kcexrzcfyt.yggfygwlhe((kcexrzcfyt.iobyxmoadg) obj, (kcexrzcfyt.iobyxmoadg) obj2);
            }
        }, new Function() { // from class: wl.oxmwwwfdhm
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((kcexrzcfyt.iobyxmoadg) obj).ppxfxbqfkf();
            }
        }, new Collector.Characteristics[0]);
    }

    public static void lereixgezr(StringBuilder sb3) {
        if (sb3.length() <= 8192) {
            sb3.delete(0, sb3.length());
            f120175eablkybsjg.eablkybsjg(sb3);
        }
    }

    public static boolean lqeggnwhkg(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean nufgyqmvbu(int i13) {
        return i13 == 32 || i13 == 9 || i13 == 10 || i13 == 12 || i13 == 13 || i13 == 160;
    }

    public static boolean ojitshcjhn(int i13) {
        return i13 == 32 || i13 == 9 || i13 == 10 || i13 == 12 || i13 == 13;
    }

    public static String oxmwwwfdhm(String[] strArr, String str) {
        return rgvfuqvkyq(Arrays.asList(strArr), str);
    }

    public static String pmvmpeiblj(String str, String str2) {
        String strIstkbnxepw = istkbnxepw(str);
        String strIstkbnxepw2 = istkbnxepw(str2);
        try {
            try {
                return zynmafqrjb(new URL(strIstkbnxepw), strIstkbnxepw2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strIstkbnxepw2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return f120177ppxfxbqfkf.matcher(strIstkbnxepw2).find() ? strIstkbnxepw2 : "";
        }
    }

    public static String rgvfuqvkyq(Collection collection, String str) {
        return vdvldrhtss(collection.iterator(), str);
    }

    public static String vdvldrhtss(Iterator it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(str);
        iobyxmoadgVar.iobyxmoadg(string);
        while (it.hasNext()) {
            iobyxmoadgVar.iobyxmoadg(it.next());
        }
        return iobyxmoadgVar.ppxfxbqfkf();
    }

    public static boolean wflxmlrfwp(int i13) {
        return i13 == 8203 || i13 == 173;
    }

    public static void wkgbmnqykc(StringBuilder sb3, String str, boolean z13) {
        int length = str.length();
        int iCharCount = 0;
        boolean z14 = false;
        boolean z15 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (nufgyqmvbu(iCodePointAt)) {
                if ((!z13 || z14) && !z15) {
                    sb3.append(' ');
                    z15 = true;
                }
            } else if (!wflxmlrfwp(iCodePointAt)) {
                sb3.appendCodePoint(iCodePointAt);
                z15 = false;
                z14 = true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ iobyxmoadg yggfygwlhe(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        iobyxmoadgVar.zoijcleaow(iobyxmoadgVar2.ppxfxbqfkf());
        return iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ iobyxmoadg zdlpuopuiu(String str) {
        return new iobyxmoadg(str);
    }

    public static URL zynmafqrjb(URL url, String str) {
        String strIstkbnxepw = istkbnxepw(str);
        if (strIstkbnxepw.startsWith("?")) {
            strIstkbnxepw = url.getPath() + strIstkbnxepw;
        }
        URL url2 = new URL(url, strIstkbnxepw);
        String strReplaceFirst = f120179zoijcleaow.matcher(url2.getFile()).replaceFirst(CardDateFormatTextWatcher.DIVIDER_CHARACTER);
        if (url2.getRef() != null) {
            strReplaceFirst = strReplaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }
}
