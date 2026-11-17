package hk;

import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public int f40509iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f40510ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final yggfygwlhe f40512zoijcleaow = new yggfygwlhe();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private StringBuilder f40511wkgbmnqykc = new StringBuilder();

    private static final double agtfadlqog(long j13, boolean z13) {
        if (!z13) {
            return Math.pow(10.0d, -j13);
        }
        if (z13) {
            return Math.pow(10.0d, j13);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Void cqumvgiudr(iobyxmoadg iobyxmoadgVar, String str, int i13, String str2, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i14 & 2) != 0) {
            i13 = iobyxmoadgVar.f40509iobyxmoadg;
        }
        if ((i14 & 4) != 0) {
            str2 = "";
        }
        return iobyxmoadgVar.iwizpuwonk(str, i13, str2);
    }

    public static /* synthetic */ boolean dsvhmnatus(iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        return iobyxmoadgVar.cllcsxoeiz(z13);
    }

    private final boolean gxszxtbevo(int i13) {
        int iWwaezpbzkn = wwaezpbzkn(i13);
        if (iWwaezpbzkn >= istkbnxepw().length() || iWwaezpbzkn == -1) {
            cqumvgiudr(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i14 = iWwaezpbzkn + 1;
        int iCharAt = istkbnxepw().charAt(iWwaezpbzkn) | ' ';
        if (iCharAt == 102) {
            nufgyqmvbu("alse", i14);
            return false;
        }
        if (iCharAt == 116) {
            nufgyqmvbu("rue", i14);
            return true;
        }
        cqumvgiudr(this, "Expected valid boolean literal prefix, but had '" + vdvldrhtss() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int iobyxmoadg(int i13) {
        int iWwaezpbzkn = wwaezpbzkn(i13);
        if (iWwaezpbzkn == -1) {
            cqumvgiudr(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i14 = iWwaezpbzkn + 1;
        char cCharAt = istkbnxepw().charAt(iWwaezpbzkn);
        if (cCharAt == 'u') {
            return ppxfxbqfkf(istkbnxepw(), i14);
        }
        char cZoijcleaow = zoijcleaow.zoijcleaow(cCharAt);
        if (cZoijcleaow != 0) {
            this.f40511wkgbmnqykc.append(cZoijcleaow);
            return i14;
        }
        cqumvgiudr(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final String jpowsppfya() {
        String str = this.f40510ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(str);
        this.f40510ppxfxbqfkf = null;
        return str;
    }

    private final String kcexrzcfyt(int i13, int i14) {
        wkgbmnqykc(i13, i14);
        String string = this.f40511wkgbmnqykc.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        this.f40511wkgbmnqykc.setLength(0);
        return string;
    }

    public static /* synthetic */ Void lereixgezr(iobyxmoadg iobyxmoadgVar, byte b13, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        return iobyxmoadgVar.esjtqupxsv(b13, z13);
    }

    private final void nufgyqmvbu(String str, int i13) {
        if (istkbnxepw().length() - i13 < str.length()) {
            cqumvgiudr(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (str.charAt(i14) != (istkbnxepw().charAt(i13 + i14) | ' ')) {
                cqumvgiudr(this, "Expected valid boolean literal prefix, but had '" + vdvldrhtss() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.f40509iobyxmoadg = i13 + str.length();
    }

    private final int ppxfxbqfkf(CharSequence charSequence, int i13) {
        int i14 = i13 + 4;
        if (i14 < charSequence.length()) {
            this.f40511wkgbmnqykc.append((char) ((zynmafqrjb(charSequence, i13) << 12) + (zynmafqrjb(charSequence, i13 + 1) << 8) + (zynmafqrjb(charSequence, i13 + 2) << 4) + zynmafqrjb(charSequence, i13 + 3)));
            return i14;
        }
        this.f40509iobyxmoadg = i13;
        yggfygwlhe();
        if (this.f40509iobyxmoadg + 4 < charSequence.length()) {
            return ppxfxbqfkf(charSequence, this.f40509iobyxmoadg);
        }
        cqumvgiudr(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean stevsuqkhv() {
        return istkbnxepw().charAt(this.f40509iobyxmoadg - 1) != '\"';
    }

    private final int zoijcleaow(int i13, int i14) {
        wkgbmnqykc(i13, i14);
        return iobyxmoadg(i14 + 1);
    }

    private final int zynmafqrjb(CharSequence charSequence, int i13) {
        char cCharAt = charSequence.charAt(i13);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        cqumvgiudr(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public abstract byte btonecajqb();

    protected final boolean cdpycssgdh(char c13) {
        return (c13 == ',' || c13 == ':' || c13 == ']' || c13 == '}') ? false : true;
    }

    public final boolean cllcsxoeiz(boolean z13) {
        int iWwaezpbzkn = wwaezpbzkn(pkzmftpjix());
        int length = istkbnxepw().length() - iWwaezpbzkn;
        if (length < 4 || iWwaezpbzkn == -1) {
            return false;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if ("null".charAt(i13) != istkbnxepw().charAt(iWwaezpbzkn + i13)) {
                return false;
            }
        }
        if (length > 4 && zoijcleaow.iobyxmoadg(istkbnxepw().charAt(iWwaezpbzkn + 4)) == 0) {
            return false;
        }
        if (!z13) {
            return true;
        }
        this.f40509iobyxmoadg = iWwaezpbzkn + 4;
        return true;
    }

    public abstract void draadjrbmk(char c13);

    public abstract String dxjokdxxww();

    public abstract boolean eablkybsjg();

    public final Void esjtqupxsv(byte b13, boolean z13) {
        String strPpxfxbqfkf = zoijcleaow.ppxfxbqfkf(b13);
        int i13 = z13 ? this.f40509iobyxmoadg - 1 : this.f40509iobyxmoadg;
        cqumvgiudr(this, "Expected " + strPpxfxbqfkf + ", but had '" + ((this.f40509iobyxmoadg == istkbnxepw().length() || i13 < 0) ? "EOF" : String.valueOf(istkbnxepw().charAt(i13))) + "' instead", i13, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final byte gtknphoqwx(byte b13) {
        byte bBtonecajqb = btonecajqb();
        if (bBtonecajqb == b13) {
            return bBtonecajqb;
        }
        lereixgezr(this, b13, false, 2, null);
        throw new KotlinNothingValueException();
    }

    public String hcddaimhww(int i13, int i14) {
        return istkbnxepw().subSequence(i13, i14).toString();
    }

    public final boolean hkdspvbjdz() {
        int iPkzmftpjix = pkzmftpjix();
        CharSequence charSequenceIstkbnxepw = istkbnxepw();
        if (iPkzmftpjix >= charSequenceIstkbnxepw.length() || iPkzmftpjix == -1 || charSequenceIstkbnxepw.charAt(iPkzmftpjix) != ',') {
            return false;
        }
        this.f40509iobyxmoadg++;
        return true;
    }

    public byte iozdgvuglv() {
        CharSequence charSequenceIstkbnxepw = istkbnxepw();
        int i13 = this.f40509iobyxmoadg;
        while (true) {
            int iWwaezpbzkn = wwaezpbzkn(i13);
            if (iWwaezpbzkn == -1) {
                this.f40509iobyxmoadg = iWwaezpbzkn;
                return (byte) 10;
            }
            char cCharAt = charSequenceIstkbnxepw.charAt(iWwaezpbzkn);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f40509iobyxmoadg = iWwaezpbzkn;
                return zoijcleaow.iobyxmoadg(cCharAt);
            }
            i13 = iWwaezpbzkn + 1;
        }
    }

    protected abstract CharSequence istkbnxepw();

    public final Void iwizpuwonk(String message, int i13, String hint) {
        String str;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw oxmwwwfdhm.eablkybsjg(i13, message + " at path: " + this.f40512zoijcleaow.iobyxmoadg() + str, istkbnxepw());
    }

    public final void jyumaefscl() {
        if (btonecajqb() == 10) {
            return;
        }
        cqumvgiudr(this, "Expected EOF after parsing, but had " + istkbnxepw().charAt(this.f40509iobyxmoadg - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String lmojexxdyd(boolean z13) {
        String strOjitshcjhn;
        byte bIozdgvuglv = iozdgvuglv();
        if (z13) {
            if (bIozdgvuglv != 1 && bIozdgvuglv != 0) {
                return null;
            }
            strOjitshcjhn = vdvldrhtss();
        } else {
            if (bIozdgvuglv != 1) {
                return null;
            }
            strOjitshcjhn = ojitshcjhn();
        }
        this.f40510ppxfxbqfkf = strOjitshcjhn;
        return strOjitshcjhn;
    }

    public final boolean lqeggnwhkg() {
        boolean z13;
        int iPkzmftpjix = pkzmftpjix();
        if (iPkzmftpjix == istkbnxepw().length()) {
            cqumvgiudr(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (istkbnxepw().charAt(iPkzmftpjix) == '\"') {
            iPkzmftpjix++;
            z13 = true;
        } else {
            z13 = false;
        }
        boolean zGxszxtbevo = gxszxtbevo(iPkzmftpjix);
        if (z13) {
            if (this.f40509iobyxmoadg == istkbnxepw().length()) {
                cqumvgiudr(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (istkbnxepw().charAt(this.f40509iobyxmoadg) != '\"') {
                cqumvgiudr(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            this.f40509iobyxmoadg++;
        }
        return zGxszxtbevo;
    }

    public final String ojitshcjhn() {
        return this.f40510ppxfxbqfkf != null ? jpowsppfya() : dxjokdxxww();
    }

    public final String oxmwwwfdhm() {
        String strVdvldrhtss = vdvldrhtss();
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strVdvldrhtss, "null") || !stevsuqkhv()) {
            return strVdvldrhtss;
        }
        cqumvgiudr(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public abstract int pkzmftpjix();

    public final void pmvmpeiblj(String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        iwizpuwonk("Encountered an unknown key '" + key + '\'', mj.kcexrzcfyt.iyctptxqzt(hcddaimhww(0, this.f40509iobyxmoadg), key, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    protected final String rgvfuqvkyq(CharSequence source, int i13, int i14) {
        int iWwaezpbzkn;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        char cCharAt = source.charAt(i14);
        boolean z13 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iWwaezpbzkn = wwaezpbzkn(zoijcleaow(i13, i14));
                if (iWwaezpbzkn == -1) {
                    cqumvgiudr(this, "Unexpected EOF", iWwaezpbzkn, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i14++;
                if (i14 >= source.length()) {
                    wkgbmnqykc(i13, i14);
                    iWwaezpbzkn = wwaezpbzkn(i14);
                    if (iWwaezpbzkn == -1) {
                        cqumvgiudr(this, "Unexpected EOF", iWwaezpbzkn, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                }
                cCharAt = source.charAt(i14);
            }
            z13 = true;
            i13 = iWwaezpbzkn;
            i14 = i13;
            cCharAt = source.charAt(i14);
        }
        String strHcddaimhww = !z13 ? hcddaimhww(i13, i14) : kcexrzcfyt(i13, i14);
        this.f40509iobyxmoadg = i14 + 1;
        return strHcddaimhww;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) istkbnxepw()) + "', currentPosition=" + this.f40509iobyxmoadg + ')';
    }

    public final String vdvldrhtss() {
        if (this.f40510ppxfxbqfkf != null) {
            return jpowsppfya();
        }
        int iPkzmftpjix = pkzmftpjix();
        if (iPkzmftpjix >= istkbnxepw().length() || iPkzmftpjix == -1) {
            cqumvgiudr(this, "EOF", iPkzmftpjix, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bIobyxmoadg = zoijcleaow.iobyxmoadg(istkbnxepw().charAt(iPkzmftpjix));
        if (bIobyxmoadg == 1) {
            return ojitshcjhn();
        }
        if (bIobyxmoadg != 0) {
            cqumvgiudr(this, "Expected beginning of the string, but got " + istkbnxepw().charAt(iPkzmftpjix), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z13 = false;
        while (zoijcleaow.iobyxmoadg(istkbnxepw().charAt(iPkzmftpjix)) == 0) {
            iPkzmftpjix++;
            if (iPkzmftpjix >= istkbnxepw().length()) {
                wkgbmnqykc(this.f40509iobyxmoadg, iPkzmftpjix);
                int iWwaezpbzkn = wwaezpbzkn(iPkzmftpjix);
                if (iWwaezpbzkn == -1) {
                    this.f40509iobyxmoadg = iPkzmftpjix;
                    return kcexrzcfyt(0, 0);
                }
                iPkzmftpjix = iWwaezpbzkn;
                z13 = true;
            }
        }
        String strHcddaimhww = !z13 ? hcddaimhww(this.f40509iobyxmoadg, iPkzmftpjix) : kcexrzcfyt(this.f40509iobyxmoadg, iPkzmftpjix);
        this.f40509iobyxmoadg = iPkzmftpjix;
        return strHcddaimhww;
    }

    public final long wflxmlrfwp() {
        boolean z13;
        boolean z14;
        int iWwaezpbzkn = wwaezpbzkn(pkzmftpjix());
        if (iWwaezpbzkn >= istkbnxepw().length() || iWwaezpbzkn == -1) {
            cqumvgiudr(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (istkbnxepw().charAt(iWwaezpbzkn) == '\"') {
            iWwaezpbzkn++;
            if (iWwaezpbzkn == istkbnxepw().length()) {
                cqumvgiudr(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z13 = true;
        } else {
            z13 = false;
        }
        int i13 = iWwaezpbzkn;
        long j13 = 0;
        long j14 = 0;
        boolean z15 = false;
        boolean z16 = false;
        loop0: while (true) {
            z14 = false;
            while (true) {
                if (i13 == istkbnxepw().length()) {
                    break loop0;
                }
                char cCharAt = istkbnxepw().charAt(i13);
                if ((cCharAt == 'e' || cCharAt == 'E') && !z15) {
                    if (i13 == iWwaezpbzkn) {
                        cqumvgiudr(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i13++;
                    z15 = true;
                } else if (cCharAt != '-' || !z15) {
                    if (cCharAt != '+' || !z15) {
                        if (cCharAt != '-') {
                            if (zoijcleaow.iobyxmoadg(cCharAt) != 0) {
                                break loop0;
                            }
                            i13++;
                            int i14 = cCharAt - '0';
                            if (i14 < 0 || i14 >= 10) {
                                cqumvgiudr(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            if (z15) {
                                j14 = (j14 * ((long) 10)) + ((long) i14);
                            } else {
                                j13 = (j13 * ((long) 10)) - ((long) i14);
                                if (j13 > 0) {
                                    cqumvgiudr(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new KotlinNothingValueException();
                                }
                            }
                        } else {
                            if (i13 != iWwaezpbzkn) {
                                cqumvgiudr(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            i13++;
                            z16 = true;
                        }
                    } else {
                        if (i13 == iWwaezpbzkn) {
                            cqumvgiudr(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i13++;
                    }
                }
                z14 = true;
            }
            if (i13 == iWwaezpbzkn) {
                cqumvgiudr(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i13++;
        }
        boolean z17 = i13 != iWwaezpbzkn;
        if (iWwaezpbzkn == i13 || (z16 && iWwaezpbzkn == i13 - 1)) {
            cqumvgiudr(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z13) {
            if (!z17) {
                cqumvgiudr(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (istkbnxepw().charAt(i13) != '\"') {
                cqumvgiudr(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i13++;
        }
        this.f40509iobyxmoadg = i13;
        if (z15) {
            double dAgtfadlqog = j13 * agtfadlqog(j14, z14);
            if (dAgtfadlqog > 9.223372036854776E18d || dAgtfadlqog < -9.223372036854776E18d) {
                cqumvgiudr(this, "Numeric value overflow", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (Math.floor(dAgtfadlqog) != dAgtfadlqog) {
                cqumvgiudr(this, "Can't convert " + dAgtfadlqog + " to Long", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            j13 = (long) dAgtfadlqog;
        }
        if (z16) {
            return j13;
        }
        if (j13 != Long.MIN_VALUE) {
            return -j13;
        }
        cqumvgiudr(this, "Numeric value overflow", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    protected void wkgbmnqykc(int i13, int i14) {
        this.f40511wkgbmnqykc.append(istkbnxepw(), i13, i14);
    }

    public abstract int wwaezpbzkn(int i13);

    protected final void wypolnanlu(char c13) {
        int i13 = this.f40509iobyxmoadg;
        if (i13 > 0 && c13 == '\"') {
            try {
                this.f40509iobyxmoadg = i13 - 1;
                String strVdvldrhtss = vdvldrhtss();
                this.f40509iobyxmoadg = i13;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strVdvldrhtss, "null")) {
                    iwizpuwonk("Expected string literal but 'null' literal was found", this.f40509iobyxmoadg - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                this.f40509iobyxmoadg = i13;
                throw th2;
            }
        }
        lereixgezr(this, zoijcleaow.iobyxmoadg(c13), false, 2, null);
        throw new KotlinNothingValueException();
    }

    public abstract String yadqdtsiqt(String str, boolean z13);

    public void yggfygwlhe() {
    }

    public final void ylkuphrtab(boolean z13) {
        ArrayList arrayList = new ArrayList();
        byte bIozdgvuglv = iozdgvuglv();
        if (bIozdgvuglv != 8 && bIozdgvuglv != 6) {
            vdvldrhtss();
            return;
        }
        while (true) {
            byte bIozdgvuglv2 = iozdgvuglv();
            if (bIozdgvuglv2 != 1) {
                if (bIozdgvuglv2 == 8 || bIozdgvuglv2 == 6) {
                    arrayList.add(Byte.valueOf(bIozdgvuglv2));
                } else if (bIozdgvuglv2 == 9) {
                    if (((Number) hg.jyumaefscl.skhdrjzrfn(arrayList)).byteValue() != 8) {
                        throw oxmwwwfdhm.eablkybsjg(this.f40509iobyxmoadg, "found ] instead of } at path: " + this.f40512zoijcleaow, istkbnxepw());
                    }
                    hg.jyumaefscl.hkdspvbjdz(arrayList);
                } else if (bIozdgvuglv2 == 7) {
                    if (((Number) hg.jyumaefscl.skhdrjzrfn(arrayList)).byteValue() != 6) {
                        throw oxmwwwfdhm.eablkybsjg(this.f40509iobyxmoadg, "found } instead of ] at path: " + this.f40512zoijcleaow, istkbnxepw());
                    }
                    hg.jyumaefscl.hkdspvbjdz(arrayList);
                } else if (bIozdgvuglv2 == 10) {
                    cqumvgiudr(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                btonecajqb();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z13) {
                vdvldrhtss();
            } else {
                dxjokdxxww();
            }
        }
    }

    public final void zdlpuopuiu() {
        this.f40510ppxfxbqfkf = null;
    }
}
