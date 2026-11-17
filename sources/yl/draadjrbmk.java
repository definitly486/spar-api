package yl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk implements AutoCloseable {

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final wl.wflxmlrfwp f125723lmojexxdyd = new wl.wflxmlrfwp(new Supplier() { // from class: yl.iobyxmoadg
        @Override // java.util.function.Supplier
        public final Object get() {
            return draadjrbmk.wizcaqwiak();
        }
    });

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final wl.wflxmlrfwp f125724wwaezpbzkn = new wl.wflxmlrfwp(new Supplier() { // from class: yl.ppxfxbqfkf
        @Override // java.util.function.Supplier
        public final Object get() {
            return draadjrbmk.hszhottldk();
        }
    });

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f125725cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f125726cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f125727esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f125728iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private ArrayList f125729istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f125730iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private char[] f125731jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f125732lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f125733pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private String f125734yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Reader f125735yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private String[] f125736zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f125737zynmafqrjb;

    interface iobyxmoadg {
        boolean iobyxmoadg(char c13);
    }

    public draadjrbmk(Reader reader) {
        this.f125727esjtqupxsv = 0;
        this.f125733pmvmpeiblj = -1;
        this.f125729istkbnxepw = null;
        this.f125725cdpycssgdh = 1;
        vl.zoijcleaow.btonecajqb(reader);
        this.f125735yggfygwlhe = reader;
        this.f125731jyumaefscl = (char[]) f125724wwaezpbzkn.zoijcleaow();
        this.f125736zdlpuopuiu = (String[]) f125723lmojexxdyd.zoijcleaow();
        vdvldrhtss();
    }

    static boolean A(char[] cArr, int i13, int i14, String str) {
        if (i14 != str.length()) {
            return false;
        }
        int i15 = 0;
        while (true) {
            int i16 = i14 - 1;
            if (i14 == 0) {
                return true;
            }
            int i17 = i13 + 1;
            int i18 = i15 + 1;
            if (cArr[i13] != str.charAt(i15)) {
                return false;
            }
            i13 = i17;
            i14 = i16;
            i15 = i18;
        }
    }

    private void J() {
        if (zfvoamnweg()) {
            if (this.f125729istkbnxepw.size() > 0) {
                int iAgeimvtcrz = ageimvtcrz(this.f125732lereixgezr);
                if (iAgeimvtcrz == -1) {
                    iAgeimvtcrz = 0;
                }
                Integer num = (Integer) this.f125729istkbnxepw.get(iAgeimvtcrz);
                num.intValue();
                this.f125725cdpycssgdh += iAgeimvtcrz;
                this.f125729istkbnxepw.clear();
                this.f125729istkbnxepw.add(num);
            }
            for (int i13 = this.f125730iwizpuwonk; i13 < this.f125726cqumvgiudr; i13++) {
                if (this.f125731jyumaefscl[i13] == '\n') {
                    this.f125729istkbnxepw.add(Integer.valueOf(this.f125732lereixgezr + 1 + i13));
                }
            }
        }
    }

    private int ageimvtcrz(int i13) {
        if (!zfvoamnweg()) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(this.f125729istkbnxepw, Integer.valueOf(i13));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ char[] hszhottldk() {
        return new char[2048];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean iyctptxqzt(char c13) {
        return (c13 == '&' || c13 == '<' || c13 == 0) ? false : true;
    }

    private static String kcexrzcfyt(char[] cArr, String[] strArr, int i13, int i14) {
        if (i14 > 12) {
            return new String(cArr, i13, i14);
        }
        if (i14 < 1) {
            return "";
        }
        int i15 = i14 + i13;
        int i16 = 0;
        for (int i17 = i13; i17 < i15; i17++) {
            i16 = (i16 * 31) + cArr[i17];
        }
        int i18 = i16 & 511;
        String str = strArr[i18];
        if (str != null && A(cArr, i13, i14, str)) {
            return str;
        }
        String str2 = new String(cArr, i13, i14);
        strArr[i18] = str2;
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lxfrhoxuzk(char[] cArr, char c13) {
        return Arrays.binarySearch(cArr, c13) < 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean nuxfzjnpeb(char c13) {
        return (c13 == '<' || c13 == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean opjhrmiecq(boolean z13, char c13) {
        return (c13 == 0 || c13 == '&' || (!z13 ? c13 != '\"' : c13 != '\'')) ? false : true;
    }

    private void rlfsiqarku() {
        int i13 = this.f125732lereixgezr;
        int i14 = this.f125730iwizpuwonk;
        this.f125732lereixgezr = i13 + i14;
        int i15 = this.f125726cqumvgiudr - i14;
        this.f125726cqumvgiudr = i15;
        if (i15 > 0) {
            char[] cArr = this.f125731jyumaefscl;
            System.arraycopy(cArr, i14, cArr, 0, i15);
        }
        this.f125730iwizpuwonk = 0;
        while (true) {
            int i16 = this.f125726cqumvgiudr;
            if (i16 >= 2048) {
                break;
            }
            try {
                Reader reader = this.f125735yggfygwlhe;
                char[] cArr2 = this.f125731jyumaefscl;
                int i17 = reader.read(cArr2, i16, cArr2.length - i16);
                if (i17 == -1) {
                    this.f125737zynmafqrjb = true;
                    break;
                }
                this.f125726cqumvgiudr += i17;
            } catch (IOException e13) {
                throw new UncheckedIOException(e13);
            }
        }
        this.f125727esjtqupxsv = Math.min(this.f125726cqumvgiudr, UserVerificationMethods.USER_VERIFY_ALL);
        J();
        this.f125734yadqdtsiqt = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean tbqsvytpvh(char c13) {
        return (c13 == '\t' || c13 == '\n' || c13 == '\f' || c13 == '\r' || c13 == ' ' || c13 == '/' || c13 == '>') ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean uawqvzlxes(char[] cArr, char c13) {
        for (char c14 : cArr) {
            if (c13 == c14) {
                return false;
            }
        }
        return true;
    }

    private void vdvldrhtss() {
        if (this.f125737zynmafqrjb || this.f125730iwizpuwonk < this.f125727esjtqupxsv || this.f125733pmvmpeiblj != -1) {
            return;
        }
        rlfsiqarku();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean weqkydbzbr(char c13) {
        return c13 >= '0' && c13 <= '9';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] wizcaqwiak() {
        return new String[UserVerificationMethods.USER_VERIFY_NONE];
    }

    private boolean yfnezrywwk() {
        return this.f125730iwizpuwonk >= this.f125726cqumvgiudr;
    }

    boolean B() {
        return this.f125737zynmafqrjb;
    }

    void D() {
        int i13 = this.f125733pmvmpeiblj;
        if (i13 == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.f125730iwizpuwonk = i13;
        O();
    }

    public void L(boolean z13) {
        if (z13 && this.f125729istkbnxepw == null) {
            this.f125729istkbnxepw = new ArrayList(25);
            J();
        } else {
            if (z13) {
                return;
            }
            this.f125729istkbnxepw = null;
        }
    }

    void M() {
        int i13 = this.f125730iwizpuwonk;
        if (i13 < 1) {
            throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f125730iwizpuwonk = i13 - 1;
    }

    void O() {
        this.f125733pmvmpeiblj = -1;
    }

    boolean a(char c13) {
        return !czzsidtyhn() && this.f125731jyumaefscl[this.f125730iwizpuwonk] == c13;
    }

    boolean b(String str) {
        vdvldrhtss();
        int length = str.length();
        if (length > this.f125726cqumvgiudr - this.f125730iwizpuwonk) {
            return false;
        }
        for (int i13 = 0; i13 < length; i13++) {
            if (str.charAt(i13) != this.f125731jyumaefscl[this.f125730iwizpuwonk + i13]) {
                return false;
            }
        }
        return true;
    }

    String cdpycssgdh() {
        return hkdspvbjdz(new iobyxmoadg() { // from class: yl.zoijcleaow
            @Override // yl.draadjrbmk.iobyxmoadg
            public final boolean iobyxmoadg(char c13) {
                return Character.isLetter(c13);
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        Reader reader = this.f125735yggfygwlhe;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
            this.f125735yggfygwlhe = null;
            Arrays.fill(this.f125731jyumaefscl, (char) 0);
            f125724wwaezpbzkn.eablkybsjg(this.f125731jyumaefscl);
            this.f125731jyumaefscl = null;
            f125723lmojexxdyd.eablkybsjg(this.f125736zdlpuopuiu);
        } catch (IOException unused) {
            this.f125735yggfygwlhe = null;
            Arrays.fill(this.f125731jyumaefscl, (char) 0);
            f125724wwaezpbzkn.eablkybsjg(this.f125731jyumaefscl);
            this.f125731jyumaefscl = null;
            f125723lmojexxdyd.eablkybsjg(this.f125736zdlpuopuiu);
        } finally {
            this.f125735yggfygwlhe = null;
            Arrays.fill(this.f125731jyumaefscl, (char) 0);
            f125724wwaezpbzkn.eablkybsjg(this.f125731jyumaefscl);
            this.f125731jyumaefscl = null;
            f125723lmojexxdyd.eablkybsjg(this.f125736zdlpuopuiu);
            this.f125736zdlpuopuiu = null;
        }
    }

    public char cqumvgiudr() {
        vdvldrhtss();
        char c13 = yfnezrywwk() ? (char) 65535 : this.f125731jyumaefscl[this.f125730iwizpuwonk];
        this.f125730iwizpuwonk++;
        return c13;
    }

    String crxdokpmqz(final char... cArr) {
        return hkdspvbjdz(new iobyxmoadg() { // from class: yl.gxszxtbevo
            @Override // yl.draadjrbmk.iobyxmoadg
            public final boolean iobyxmoadg(char c13) {
                return draadjrbmk.lxfrhoxuzk(cArr, c13);
            }
        });
    }

    public boolean czzsidtyhn() {
        vdvldrhtss();
        return this.f125730iwizpuwonk >= this.f125726cqumvgiudr;
    }

    String dsvhmnatus(iobyxmoadg iobyxmoadgVar, int i13) {
        vdvldrhtss();
        int i14 = this.f125730iwizpuwonk;
        int i15 = this.f125726cqumvgiudr;
        char[] cArr = this.f125731jyumaefscl;
        int i16 = i14;
        while (i16 < i15 && ((i13 == -1 || i16 - i14 < i13) && iobyxmoadgVar.iobyxmoadg(cArr[i16]))) {
            i16++;
        }
        this.f125730iwizpuwonk = i16;
        return i16 > i14 ? kcexrzcfyt(this.f125731jyumaefscl, this.f125736zdlpuopuiu, i14, i16 - i14) : "";
    }

    void ezmngbhpjk() {
        if (this.f125726cqumvgiudr - this.f125730iwizpuwonk < 1024) {
            this.f125727esjtqupxsv = 0;
        }
        vdvldrhtss();
        this.f125733pmvmpeiblj = this.f125730iwizpuwonk;
    }

    boolean f(char... cArr) {
        if (czzsidtyhn()) {
            return false;
        }
        vdvldrhtss();
        char c13 = this.f125731jyumaefscl[this.f125730iwizpuwonk];
        for (char c14 : cArr) {
            if (c14 == c13) {
                return true;
            }
        }
        return false;
    }

    boolean g(char[] cArr) {
        vdvldrhtss();
        return !czzsidtyhn() && Arrays.binarySearch(cArr, this.f125731jyumaefscl[this.f125730iwizpuwonk]) >= 0;
    }

    String hkdspvbjdz(iobyxmoadg iobyxmoadgVar) {
        return dsvhmnatus(iobyxmoadgVar, -1);
    }

    boolean i() {
        if (czzsidtyhn()) {
            return false;
        }
        return wl.kcexrzcfyt.dxjokdxxww(this.f125731jyumaefscl[this.f125730iwizpuwonk]);
    }

    public int ipoelvxyzq() {
        return mhtqkkgtqm(w());
    }

    String istkbnxepw() {
        return hkdspvbjdz(new gtknphoqwx());
    }

    String jlmebxxoox() {
        vdvldrhtss();
        char[] cArr = this.f125731jyumaefscl;
        String[] strArr = this.f125736zdlpuopuiu;
        int i13 = this.f125730iwizpuwonk;
        String strKcexrzcfyt = kcexrzcfyt(cArr, strArr, i13, this.f125726cqumvgiudr - i13);
        this.f125730iwizpuwonk = this.f125726cqumvgiudr;
        return strKcexrzcfyt;
    }

    int jyumaefscl(int i13) {
        int iAgeimvtcrz;
        if (zfvoamnweg() && (iAgeimvtcrz = ageimvtcrz(i13)) != -1) {
            return (i13 - ((Integer) this.f125729istkbnxepw.get(iAgeimvtcrz)).intValue()) + 1;
        }
        return i13 + 1;
    }

    String kegysxyocb() {
        return hkdspvbjdz(new iobyxmoadg() { // from class: yl.lqeggnwhkg
            @Override // yl.draadjrbmk.iobyxmoadg
            public final boolean iobyxmoadg(char c13) {
                return draadjrbmk.tbqsvytpvh(c13);
            }
        });
    }

    boolean krqnebusok(String str) {
        if (!q(str)) {
            return false;
        }
        this.f125730iwizpuwonk += str.length();
        return true;
    }

    String lereixgezr(final boolean z13) {
        return hkdspvbjdz(new iobyxmoadg() { // from class: yl.dxjokdxxww
            @Override // yl.draadjrbmk.iobyxmoadg
            public final boolean iobyxmoadg(char c13) {
                return draadjrbmk.opjhrmiecq(z13, c13);
            }
        });
    }

    boolean m() {
        if (czzsidtyhn()) {
            return false;
        }
        return wl.kcexrzcfyt.gtknphoqwx(this.f125731jyumaefscl[this.f125730iwizpuwonk]);
    }

    public String mbcevpiqjq(char c13) {
        int iR = r(c13);
        if (iR == -1) {
            return jlmebxxoox();
        }
        String strKcexrzcfyt = kcexrzcfyt(this.f125731jyumaefscl, this.f125736zdlpuopuiu, this.f125730iwizpuwonk, iR);
        this.f125730iwizpuwonk += iR;
        return strKcexrzcfyt;
    }

    int mhtqkkgtqm(int i13) {
        if (!zfvoamnweg()) {
            return 1;
        }
        int iAgeimvtcrz = ageimvtcrz(i13);
        return iAgeimvtcrz == -1 ? this.f125725cdpycssgdh : iAgeimvtcrz + this.f125725cdpycssgdh + 1;
    }

    public String ntlheqmsrt(String str) {
        int iV = v(str);
        if (iV != -1) {
            String strKcexrzcfyt = kcexrzcfyt(this.f125731jyumaefscl, this.f125736zdlpuopuiu, this.f125730iwizpuwonk, iV);
            this.f125730iwizpuwonk += iV;
            return strKcexrzcfyt;
        }
        if (this.f125726cqumvgiudr - this.f125730iwizpuwonk < str.length()) {
            return jlmebxxoox();
        }
        int length = (this.f125726cqumvgiudr - str.length()) + 1;
        char[] cArr = this.f125731jyumaefscl;
        String[] strArr = this.f125736zdlpuopuiu;
        int i13 = this.f125730iwizpuwonk;
        String strKcexrzcfyt2 = kcexrzcfyt(cArr, strArr, i13, length - i13);
        this.f125730iwizpuwonk = length;
        return strKcexrzcfyt2;
    }

    boolean okpsazkaxt(String str) {
        if (str.equals(this.f125734yadqdtsiqt)) {
            int i13 = this.f125728iozdgvuglv;
            if (i13 == -1) {
                return false;
            }
            if (i13 >= this.f125730iwizpuwonk) {
                return true;
            }
        }
        this.f125734yadqdtsiqt = str;
        Locale locale = Locale.ENGLISH;
        int iV = v(str.toLowerCase(locale));
        if (iV > -1) {
            this.f125728iozdgvuglv = this.f125730iwizpuwonk + iV;
            return true;
        }
        int iV2 = v(str.toUpperCase(locale));
        boolean z13 = iV2 > -1;
        this.f125728iozdgvuglv = z13 ? this.f125730iwizpuwonk + iV2 : -1;
        return z13;
    }

    String pmvmpeiblj() {
        return hkdspvbjdz(new iobyxmoadg() { // from class: yl.nufgyqmvbu
            @Override // yl.draadjrbmk.iobyxmoadg
            public final boolean iobyxmoadg(char c13) {
                return draadjrbmk.iyctptxqzt(c13);
            }
        });
    }

    boolean q(String str) {
        vdvldrhtss();
        int length = str.length();
        if (length > this.f125726cqumvgiudr - this.f125730iwizpuwonk) {
            return false;
        }
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            char c13 = this.f125731jyumaefscl[this.f125730iwizpuwonk + i13];
            if (cCharAt != c13 && Character.toUpperCase(cCharAt) != Character.toUpperCase(c13)) {
                return false;
            }
        }
        return true;
    }

    int r(char c13) {
        vdvldrhtss();
        for (int i13 = this.f125730iwizpuwonk; i13 < this.f125726cqumvgiudr; i13++) {
            if (c13 == this.f125731jyumaefscl[i13]) {
                return i13 - this.f125730iwizpuwonk;
            }
        }
        return -1;
    }

    public void rgvfuqvkyq() {
        this.f125730iwizpuwonk++;
    }

    boolean rhgxfdycjh(String str) {
        vdvldrhtss();
        if (!b(str)) {
            return false;
        }
        this.f125730iwizpuwonk += str.length();
        return true;
    }

    public String toString() {
        int i13 = this.f125726cqumvgiudr;
        int i14 = this.f125730iwizpuwonk;
        return i13 - i14 < 0 ? "" : new String(this.f125731jyumaefscl, i14, i13 - i14);
    }

    public String ulzqkzuiru(final char... cArr) {
        return hkdspvbjdz(new iobyxmoadg() { // from class: yl.wkgbmnqykc
            @Override // yl.draadjrbmk.iobyxmoadg
            public final boolean iobyxmoadg(char c13) {
                return draadjrbmk.uawqvzlxes(cArr, c13);
            }
        });
    }

    int v(CharSequence charSequence) {
        vdvldrhtss();
        char cCharAt = charSequence.charAt(0);
        int i13 = this.f125730iwizpuwonk;
        while (i13 < this.f125726cqumvgiudr) {
            if (cCharAt != this.f125731jyumaefscl[i13]) {
                do {
                    i13++;
                    if (i13 >= this.f125726cqumvgiudr) {
                        break;
                    }
                } while (cCharAt != this.f125731jyumaefscl[i13]);
            }
            int i14 = i13 + 1;
            int length = (charSequence.length() + i14) - 1;
            int i15 = this.f125726cqumvgiudr;
            if (i13 < i15 && length <= i15) {
                int i16 = i14;
                for (int i17 = 1; i16 < length && charSequence.charAt(i17) == this.f125731jyumaefscl[i16]; i17++) {
                    i16++;
                }
                if (i16 == length) {
                    return i13 - this.f125730iwizpuwonk;
                }
            }
            i13 = i14;
        }
        return -1;
    }

    public int w() {
        return this.f125732lereixgezr + this.f125730iwizpuwonk;
    }

    String wwaezpbzkn() {
        vdvldrhtss();
        int i13 = this.f125730iwizpuwonk;
        while (true) {
            int i14 = this.f125730iwizpuwonk;
            if (i14 >= this.f125726cqumvgiudr || !wl.kcexrzcfyt.dxjokdxxww(this.f125731jyumaefscl[i14])) {
                break;
            }
            this.f125730iwizpuwonk++;
        }
        while (!yfnezrywwk() && wl.kcexrzcfyt.gtknphoqwx(this.f125731jyumaefscl[this.f125730iwizpuwonk])) {
            this.f125730iwizpuwonk++;
        }
        return kcexrzcfyt(this.f125731jyumaefscl, this.f125736zdlpuopuiu, i13, this.f125730iwizpuwonk - i13);
    }

    String wypolnanlu() {
        return hkdspvbjdz(new iobyxmoadg() { // from class: yl.eablkybsjg
            @Override // yl.draadjrbmk.iobyxmoadg
            public final boolean iobyxmoadg(char c13) {
                return draadjrbmk.nuxfzjnpeb(c13);
            }
        });
    }

    public char xrmfcynszj() {
        vdvldrhtss();
        if (yfnezrywwk()) {
            return (char) 65535;
        }
        return this.f125731jyumaefscl[this.f125730iwizpuwonk];
    }

    String z() {
        return ipoelvxyzq() + StringUtils.PROCESS_POSTFIX_DELIMITER + zdlpuopuiu();
    }

    public int zdlpuopuiu() {
        return jyumaefscl(w());
    }

    public boolean zfvoamnweg() {
        return this.f125729istkbnxepw != null;
    }

    String zynmafqrjb() {
        return hkdspvbjdz(new iobyxmoadg() { // from class: yl.btonecajqb
            @Override // yl.draadjrbmk.iobyxmoadg
            public final boolean iobyxmoadg(char c13) {
                return draadjrbmk.weqkydbzbr(c13);
            }
        });
    }

    public draadjrbmk(String str) {
        this(new StringReader(str));
    }
}
