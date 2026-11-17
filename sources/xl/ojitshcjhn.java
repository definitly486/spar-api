package xl;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final char[] f122703iobyxmoadg = {',', ';'};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final HashMap f122706zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final ArrayList f122704ppxfxbqfkf = new ArrayList(106);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final ThreadLocal f122705wkgbmnqykc = ThreadLocal.withInitial(new Supplier() { // from class: xl.agtfadlqog
        @Override // java.util.function.Supplier
        public final Object get() {
            return ojitshcjhn.vdvldrhtss();
        }
    });

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final ThreadLocal f122702eablkybsjg = new ThreadLocal();

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f122707iobyxmoadg;

        static {
            int[] iArr = new int[zoijcleaow.values().length];
            f122707iobyxmoadg = iArr;
            try {
                iArr[zoijcleaow.ascii.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122707iobyxmoadg[zoijcleaow.utf.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xl.ojitshcjhn$ppxfxbqfkf, still in use, count: 1, list:
      (r0v1 xl.ojitshcjhn$ppxfxbqfkf) from 0x0033: IGET (r0v1 xl.ojitshcjhn$ppxfxbqfkf) A[WRAPPED] xl.ojitshcjhn.ppxfxbqfkf.zdlpuopuiu java.lang.String[]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class ppxfxbqfkf {
        xhtml(vdvldrhtss.f122723iobyxmoadg, 4),
        base(vdvldrhtss.f122725zoijcleaow, 106),
        extended(vdvldrhtss.f122724ppxfxbqfkf, 2125);


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private String[] f122712iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int[] f122713jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int[] f122714yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private String[] f122715zdlpuopuiu;

        static {
            Collections.addAll(ojitshcjhn.f122704ppxfxbqfkf, new ppxfxbqfkf(vdvldrhtss.f122725zoijcleaow, 106).f122715zdlpuopuiu);
            ojitshcjhn.f122704ppxfxbqfkf.sort(new Comparator() { // from class: xl.rgvfuqvkyq
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ojitshcjhn.ppxfxbqfkf.kcexrzcfyt((String) obj, (String) obj2);
                }
            });
        }

        private ppxfxbqfkf(String str, int i13) {
            super(str, i);
            ojitshcjhn.oxmwwwfdhm(this, str, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int kcexrzcfyt(String str, String str2) {
            return str2.length() - str.length();
        }

        public static ppxfxbqfkf valueOf(String str) {
            return (ppxfxbqfkf) Enum.valueOf(ppxfxbqfkf.class, str);
        }

        public static ppxfxbqfkf[] values() {
            return (ppxfxbqfkf[]) f122711pmvmpeiblj.clone();
        }

        int vdvldrhtss(String str) {
            int iBinarySearch = Arrays.binarySearch(this.f122715zdlpuopuiu, str);
            if (iBinarySearch >= 0) {
                return this.f122714yggfygwlhe[iBinarySearch];
            }
            return -1;
        }

        String zdlpuopuiu(int i13) {
            int iBinarySearch = Arrays.binarySearch(this.f122713jyumaefscl, i13);
            if (iBinarySearch < 0) {
                return "";
            }
            String[] strArr = this.f122712iwizpuwonk;
            if (iBinarySearch < strArr.length - 1) {
                int i14 = iBinarySearch + 1;
                if (this.f122713jyumaefscl[i14] == i13) {
                    return strArr[i14];
                }
            }
            return strArr[iBinarySearch];
        }
    }

    enum zoijcleaow {
        ascii,
        utf,
        fallback;

        static zoijcleaow wkgbmnqykc(String str) {
            if (str.equals("US-ASCII")) {
                return ascii;
            }
            return str.startsWith("UTF-") ? utf : fallback;
        }
    }

    public static boolean agtfadlqog(String str) {
        return ppxfxbqfkf.base.vdvldrhtss(str) != -1;
    }

    private static void btonecajqb(String str, wl.lqeggnwhkg lqeggnwhkgVar, ppxfxbqfkf ppxfxbqfkfVar, Charset charset, int i13) {
        boolean z13;
        boolean z14;
        boolean z15;
        zoijcleaow zoijcleaowVarWkgbmnqykc = zoijcleaow.wkgbmnqykc(charset.name());
        CharsetEncoder charsetEncoderGtknphoqwx = gtknphoqwx(charset);
        int length = str.length();
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((i13 & 4) != 0) {
                if (wl.kcexrzcfyt.ojitshcjhn(iCodePointAt)) {
                    if (((i13 & 8) == 0 || z17) && !z18) {
                        if ((i13 & 16) != 0) {
                            z16 = true;
                        } else {
                            lqeggnwhkgVar.iobyxmoadg(' ');
                            z18 = true;
                        }
                    }
                } else if (z16) {
                    lqeggnwhkgVar.iobyxmoadg(' ');
                    z14 = true;
                    z13 = false;
                    z15 = false;
                } else {
                    z13 = z16;
                    z14 = true;
                    z15 = false;
                }
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                z13 = z16;
                z14 = z17;
                z15 = z18;
            }
            gxszxtbevo(iCodePointAt, lqeggnwhkgVar, i13, ppxfxbqfkfVar, zoijcleaowVarWkgbmnqykc, charsetEncoderGtknphoqwx);
            z16 = z13;
            z17 = z14;
            z18 = z15;
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    static void draadjrbmk(wl.lqeggnwhkg lqeggnwhkgVar, String str, gxszxtbevo.iobyxmoadg iobyxmoadgVar, int i13) {
        btonecajqb(str, lqeggnwhkgVar, iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.iobyxmoadg(), i13);
    }

    public static int dxjokdxxww(String str, int[] iArr) {
        String str2 = (String) f122706zoijcleaow.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iVdvldrhtss = ppxfxbqfkf.extended.vdvldrhtss(str);
        if (iVdvldrhtss == -1) {
            return 0;
        }
        iArr[0] = iVdvldrhtss;
        return 1;
    }

    private static void eablkybsjg(wl.lqeggnwhkg lqeggnwhkgVar, ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        String strZdlpuopuiu = ppxfxbqfkfVar.zdlpuopuiu(i13);
        if ("".equals(strZdlpuopuiu)) {
            lqeggnwhkgVar.zoijcleaow("&#x").zoijcleaow(Integer.toHexString(i13)).iobyxmoadg(';');
        } else {
            lqeggnwhkgVar.iobyxmoadg('&').zoijcleaow(strZdlpuopuiu).iobyxmoadg(';');
        }
    }

    private static CharsetEncoder gtknphoqwx(Charset charset) {
        ThreadLocal threadLocal = f122702eablkybsjg;
        CharsetEncoder charsetEncoder = (CharsetEncoder) threadLocal.get();
        if (charsetEncoder != null && charsetEncoder.charset().equals(charset)) {
            return charsetEncoder;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        threadLocal.set(charsetEncoderNewEncoder);
        return charsetEncoderNewEncoder;
    }

    private static void gxszxtbevo(int i13, wl.lqeggnwhkg lqeggnwhkgVar, int i14, ppxfxbqfkf ppxfxbqfkfVar, zoijcleaow zoijcleaowVar, CharsetEncoder charsetEncoder) {
        if (ppxfxbqfkf.xhtml != ppxfxbqfkfVar || rgvfuqvkyq(i13)) {
            char c13 = (char) i13;
            if (i13 >= 65536) {
                if (!nufgyqmvbu(zoijcleaowVar, c13, charsetEncoder)) {
                    eablkybsjg(lqeggnwhkgVar, ppxfxbqfkfVar, i13);
                    return;
                } else {
                    char[] cArr = (char[]) f122705wkgbmnqykc.get();
                    lqeggnwhkgVar.ppxfxbqfkf(cArr, 0, Character.toChars(i13, cArr, 0));
                    return;
                }
            }
            if (c13 == '\t' || c13 == '\n' || c13 == '\r') {
                lqeggnwhkgVar.iobyxmoadg(c13);
                return;
            }
            if (c13 == '\"') {
                if ((i14 & 2) != 0) {
                    lqeggnwhkgVar.zoijcleaow("&quot;");
                    return;
                } else {
                    lqeggnwhkgVar.iobyxmoadg(c13);
                    return;
                }
            }
            if (c13 == '<') {
                lqeggnwhkgVar.zoijcleaow("&lt;");
                return;
            }
            if (c13 == '>') {
                lqeggnwhkgVar.zoijcleaow("&gt;");
                return;
            }
            if (c13 == 160) {
                lqeggnwhkg(lqeggnwhkgVar, ppxfxbqfkfVar);
                return;
            }
            if (c13 == '&') {
                lqeggnwhkgVar.zoijcleaow("&amp;");
                return;
            }
            if (c13 == '\'') {
                wkgbmnqykc(lqeggnwhkgVar, i14, ppxfxbqfkfVar);
            } else if (c13 < ' ' || !nufgyqmvbu(zoijcleaowVar, c13, charsetEncoder)) {
                eablkybsjg(lqeggnwhkgVar, ppxfxbqfkfVar, i13);
            } else {
                lqeggnwhkgVar.iobyxmoadg(c13);
            }
        }
    }

    private static void lqeggnwhkg(wl.lqeggnwhkg lqeggnwhkgVar, ppxfxbqfkf ppxfxbqfkfVar) {
        if (ppxfxbqfkfVar != ppxfxbqfkf.xhtml) {
            lqeggnwhkgVar.zoijcleaow("&nbsp;");
        } else {
            lqeggnwhkgVar.zoijcleaow("&#xa0;");
        }
    }

    private static boolean nufgyqmvbu(zoijcleaow zoijcleaowVar, char c13, CharsetEncoder charsetEncoder) {
        int i13 = iobyxmoadg.f122707iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return c13 < 128;
        }
        if (i13 != 2) {
            return charsetEncoder.canEncode(c13);
        }
        return c13 < 55296 || c13 >= 57344;
    }

    public static boolean ojitshcjhn(String str) {
        return ppxfxbqfkf.extended.vdvldrhtss(str) != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oxmwwwfdhm(ppxfxbqfkf ppxfxbqfkfVar, String str, int i13) {
        int i14;
        ppxfxbqfkfVar.f122715zdlpuopuiu = new String[i13];
        ppxfxbqfkfVar.f122714yggfygwlhe = new int[i13];
        ppxfxbqfkfVar.f122713jyumaefscl = new int[i13];
        ppxfxbqfkfVar.f122712iwizpuwonk = new String[i13];
        yl.draadjrbmk draadjrbmkVar = new yl.draadjrbmk(str);
        int i15 = 0;
        while (!draadjrbmkVar.czzsidtyhn()) {
            try {
                String strMbcevpiqjq = draadjrbmkVar.mbcevpiqjq('=');
                draadjrbmkVar.rgvfuqvkyq();
                int i16 = Integer.parseInt(draadjrbmkVar.ulzqkzuiru(f122703iobyxmoadg), 36);
                char cXrmfcynszj = draadjrbmkVar.xrmfcynszj();
                draadjrbmkVar.rgvfuqvkyq();
                if (cXrmfcynszj == ',') {
                    i14 = Integer.parseInt(draadjrbmkVar.mbcevpiqjq(';'), 36);
                    draadjrbmkVar.rgvfuqvkyq();
                } else {
                    i14 = -1;
                }
                int i17 = Integer.parseInt(draadjrbmkVar.mbcevpiqjq('&'), 36);
                draadjrbmkVar.rgvfuqvkyq();
                ppxfxbqfkfVar.f122715zdlpuopuiu[i15] = strMbcevpiqjq;
                ppxfxbqfkfVar.f122714yggfygwlhe[i15] = i16;
                ppxfxbqfkfVar.f122713jyumaefscl[i17] = i16;
                ppxfxbqfkfVar.f122712iwizpuwonk[i17] = strMbcevpiqjq;
                if (i14 != -1) {
                    f122706zoijcleaow.put(strMbcevpiqjq, new String(new int[]{i16, i14}, 0, 2));
                }
                i15++;
            } catch (Throwable th2) {
                try {
                    draadjrbmkVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        vl.zoijcleaow.wkgbmnqykc(i15 == i13, "Unexpected count of entities loaded");
        draadjrbmkVar.close();
    }

    private static boolean rgvfuqvkyq(int i13) {
        return i13 == 9 || i13 == 10 || i13 == 13 || (i13 >= 32 && i13 <= 55295) || ((i13 >= 57344 && i13 <= 65533) || (i13 >= 65536 && i13 <= 1114111));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ char[] vdvldrhtss() {
        return new char[2];
    }

    public static String wflxmlrfwp(String str) {
        for (String str2 : f122704ppxfxbqfkf) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return "";
    }

    private static void wkgbmnqykc(wl.lqeggnwhkg lqeggnwhkgVar, int i13, ppxfxbqfkf ppxfxbqfkfVar) {
        if ((i13 & 2) == 0 || (i13 & 1) == 0) {
            lqeggnwhkgVar.iobyxmoadg('\'');
        } else if (ppxfxbqfkfVar == ppxfxbqfkf.xhtml) {
            lqeggnwhkgVar.zoijcleaow("&#x27;");
        } else {
            lqeggnwhkgVar.zoijcleaow("&apos;");
        }
    }
}
