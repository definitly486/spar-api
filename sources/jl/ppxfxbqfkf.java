package jl;

import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.impl.C4007z9;
import java.io.IOException;
import java.io.Reader;
import java.math.BigInteger;
import org.jose4j.json.internal.json_simple.parser.ParseException;

/* JADX INFO: loaded from: classes3.dex */
class ppxfxbqfkf {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f51668btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f51670dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f51671eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f51672gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f51673gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Reader f51674iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f51675lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f51676nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f51678wflxmlrfwp;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f51680zoijcleaow;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final int[] f51661ojitshcjhn = {0, 0, 1, 1};

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final char[] f51663rgvfuqvkyq = wflxmlrfwp("\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016ﾂ\u0000");

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private static final int[] f51664vdvldrhtss = btonecajqb();

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private static final int[] f51662oxmwwwfdhm = ojitshcjhn();

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static final int[] f51660kcexrzcfyt = {2, 2, 3, 4, 2, 2, 2, 5, 2, 6, 2, 2, 7, 8, 2, 9, 2, 2, 2, 2, 2, 10, 11, 12, 13, 14, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 18, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, 19, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, 24, 25, 26, 27, 28, 29, 30, 31, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 35, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, 39, -1, 39, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, 42, -1, 42, -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, 43, -1, 43, -1, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, 44, -1, 44, -1, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final String[] f51666zdlpuopuiu = {"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final int[] f51665yggfygwlhe = draadjrbmk();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f51677ppxfxbqfkf = 0;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private char[] f51679wkgbmnqykc = new char[16384];

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f51669draadjrbmk = true;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private StringBuilder f51667agtfadlqog = new StringBuilder();

    ppxfxbqfkf(Reader reader) {
        this.f51674iobyxmoadg = reader;
    }

    private static int agtfadlqog(String str, int i13, int[] iArr) {
        int length = str.length();
        int i14 = 0;
        while (i14 < length) {
            int i15 = i14 + 1;
            int iCharAt = str.charAt(i14) << 16;
            i14 += 2;
            iArr[i13] = str.charAt(i15) | iCharAt;
            i13++;
        }
        return i13;
    }

    private static int[] btonecajqb() {
        int[] iArr = new int[45];
        dxjokdxxww("\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018", 0, iArr);
        return iArr;
    }

    private static int[] draadjrbmk() {
        int[] iArr = new int[45];
        gtknphoqwx("\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t", 0, iArr);
        return iArr;
    }

    private static int dxjokdxxww(String str, int i13, int[] iArr) {
        int length = str.length();
        int i14 = 0;
        while (i14 < length) {
            int i15 = i14 + 1;
            int iCharAt = str.charAt(i14);
            i14 += 2;
            char cCharAt = str.charAt(i15);
            do {
                iArr[i13] = cCharAt;
                iCharAt--;
                i13++;
            } while (iCharAt > 0);
        }
        return i13;
    }

    private static int gtknphoqwx(String str, int i13, int[] iArr) {
        int length = str.length();
        int i14 = 0;
        while (i14 < length) {
            int i15 = i14 + 1;
            int iCharAt = str.charAt(i14);
            i14 += 2;
            char cCharAt = str.charAt(i15);
            do {
                iArr[i13] = cCharAt;
                iCharAt--;
                i13++;
            } while (iCharAt > 0);
        }
        return i13;
    }

    private boolean lqeggnwhkg() throws IOException {
        int i13;
        int i14 = this.f51675lqeggnwhkg;
        if (i14 > 0) {
            char[] cArr = this.f51679wkgbmnqykc;
            System.arraycopy(cArr, i14, cArr, 0, this.f51676nufgyqmvbu - i14);
            int i15 = this.f51676nufgyqmvbu;
            int i16 = this.f51675lqeggnwhkg;
            this.f51676nufgyqmvbu = i15 - i16;
            this.f51673gxszxtbevo -= i16;
            this.f51671eablkybsjg -= i16;
            this.f51675lqeggnwhkg = 0;
        }
        int i17 = this.f51673gxszxtbevo;
        char[] cArr2 = this.f51679wkgbmnqykc;
        if (i17 >= cArr2.length) {
            char[] cArr3 = new char[i17 * 2];
            System.arraycopy(cArr2, 0, cArr3, 0, cArr2.length);
            this.f51679wkgbmnqykc = cArr3;
        }
        Reader reader = this.f51674iobyxmoadg;
        char[] cArr4 = this.f51679wkgbmnqykc;
        int i18 = this.f51676nufgyqmvbu;
        int i19 = reader.read(cArr4, i18, cArr4.length - i18);
        if (i19 > 0) {
            this.f51676nufgyqmvbu += i19;
            return false;
        }
        if (i19 != 0 || (i13 = this.f51674iobyxmoadg.read()) == -1) {
            return true;
        }
        char[] cArr5 = this.f51679wkgbmnqykc;
        int i23 = this.f51676nufgyqmvbu;
        this.f51676nufgyqmvbu = i23 + 1;
        cArr5[i23] = (char) i13;
        return false;
    }

    private void nufgyqmvbu(int i13) {
        String str;
        try {
            str = f51666zdlpuopuiu[i13];
        } catch (ArrayIndexOutOfBoundsException unused) {
            str = f51666zdlpuopuiu[0];
        }
        throw new Error(str);
    }

    private static int[] ojitshcjhn() {
        int[] iArr = new int[45];
        agtfadlqog("\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u0087\u00006\u0000¢\u0000½\u0000Ø\u00006\u00006\u00006\u00006\u00006\u00006\u0000ó\u0000Ď\u00006\u0000ĩ\u0000ń\u0000ş\u0000ź\u0000ƕ\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000ư\u0000ǋ\u0000Ǧ\u0000Ǧ\u0000ȁ\u0000Ȝ\u0000ȷ\u0000ɒ\u00006\u00006\u0000ɭ\u0000ʈ\u00006", 0, iArr);
        return iArr;
    }

    private static char[] wflxmlrfwp(String str) {
        char[] cArr = new char[65536];
        int i13 = 0;
        int i14 = 0;
        while (i13 < 90) {
            int i15 = i13 + 1;
            int iCharAt = str.charAt(i13);
            i13 += 2;
            char cCharAt = str.charAt(i15);
            do {
                cArr[i14] = cCharAt;
                iCharAt--;
                i14++;
            } while (iCharAt > 0);
        }
        return cArr;
    }

    public final void eablkybsjg(Reader reader) {
        this.f51674iobyxmoadg = reader;
        this.f51669draadjrbmk = true;
        this.f51678wflxmlrfwp = false;
        this.f51675lqeggnwhkg = 0;
        this.f51676nufgyqmvbu = 0;
        this.f51671eablkybsjg = 0;
        this.f51673gxszxtbevo = 0;
        this.f51672gtknphoqwx = 0;
        this.f51668btonecajqb = 0;
        this.f51670dxjokdxxww = 0;
        this.f51677ppxfxbqfkf = 0;
    }

    public final String gxszxtbevo() {
        char[] cArr = this.f51679wkgbmnqykc;
        int i13 = this.f51675lqeggnwhkg;
        return new String(cArr, i13, this.f51671eablkybsjg - i13);
    }

    int iobyxmoadg() {
        return this.f51668btonecajqb;
    }

    public final char ppxfxbqfkf(int i13) {
        return this.f51679wkgbmnqykc[this.f51675lqeggnwhkg + i13];
    }

    public wkgbmnqykc wkgbmnqykc() throws ParseException, IOException {
        int i13;
        int i14;
        int i15;
        int i16 = this.f51676nufgyqmvbu;
        char[] cArr = this.f51679wkgbmnqykc;
        char[] cArr2 = f51663rgvfuqvkyq;
        int[] iArr = f51660kcexrzcfyt;
        int[] iArr2 = f51662oxmwwwfdhm;
        int[] iArr3 = f51665yggfygwlhe;
        while (true) {
            int i17 = this.f51671eablkybsjg;
            this.f51668btonecajqb += i17 - this.f51675lqeggnwhkg;
            this.f51675lqeggnwhkg = i17;
            this.f51673gxszxtbevo = i17;
            this.f51680zoijcleaow = f51661ojitshcjhn[this.f51677ppxfxbqfkf];
            int i18 = -1;
            int i19 = i17;
            int i23 = -1;
            while (true) {
                if (i17 < i16) {
                    i14 = i17 + 1;
                    i13 = cArr[i17];
                } else if (this.f51678wflxmlrfwp) {
                    i13 = i18;
                } else {
                    this.f51673gxszxtbevo = i17;
                    this.f51671eablkybsjg = i19;
                    boolean zLqeggnwhkg = lqeggnwhkg();
                    int i24 = this.f51673gxszxtbevo;
                    i19 = this.f51671eablkybsjg;
                    char[] cArr3 = this.f51679wkgbmnqykc;
                    int i25 = this.f51676nufgyqmvbu;
                    if (zLqeggnwhkg) {
                        cArr = cArr3;
                        i13 = i18;
                        i16 = i25;
                    } else {
                        i14 = i24 + 1;
                        i16 = i25;
                        i13 = cArr3[i24];
                        cArr = cArr3;
                    }
                }
                int i26 = iArr[iArr2[this.f51680zoijcleaow] + cArr2[i13 == true ? 1 : 0]];
                if (i26 != i18) {
                    this.f51680zoijcleaow = i26;
                    int i27 = iArr3[i26];
                    if ((i27 & 1) != 1) {
                        i15 = -1;
                    } else if ((i27 & 8) == 8) {
                        i19 = i14;
                        i23 = i26;
                    } else {
                        i15 = -1;
                        i19 = i14;
                        i23 = i26;
                    }
                    i17 = i14;
                    i18 = i15;
                }
            }
            this.f51671eablkybsjg = i19;
            if (i23 >= 0) {
                i23 = f51664vdvldrhtss[i23];
            }
            switch (i23) {
                case 1:
                    throw new ParseException(this.f51668btonecajqb, 0, Character.valueOf(ppxfxbqfkf(0)));
                case 2:
                    String strGxszxtbevo = gxszxtbevo();
                    try {
                        return new wkgbmnqykc(0, Long.valueOf(strGxszxtbevo));
                    } catch (NumberFormatException unused) {
                        return new wkgbmnqykc(0, new BigInteger(strGxszxtbevo));
                    }
                case 3:
                case C4007z9.F /* 25 */:
                case C4007z9.G /* 26 */:
                case 27:
                case 28:
                case C4007z9.I /* 29 */:
                case 30:
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case C4007z9.J /* 35 */:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case C4007z9.K /* 38 */:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case 42:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                    break;
                case 4:
                    this.f51667agtfadlqog = null;
                    this.f51667agtfadlqog = new StringBuilder();
                    zoijcleaow(2);
                    break;
                case 5:
                    return new wkgbmnqykc(1, null);
                case 6:
                    return new wkgbmnqykc(2, null);
                case 7:
                    return new wkgbmnqykc(3, null);
                case 8:
                    return new wkgbmnqykc(4, null);
                case 9:
                    return new wkgbmnqykc(5, null);
                case 10:
                    return new wkgbmnqykc(6, null);
                case 11:
                    this.f51667agtfadlqog.append(gxszxtbevo());
                    break;
                case 12:
                    this.f51667agtfadlqog.append('\\');
                    break;
                case 13:
                    zoijcleaow(0);
                    return new wkgbmnqykc(0, this.f51667agtfadlqog.toString());
                case 14:
                    this.f51667agtfadlqog.append('\"');
                    break;
                case 15:
                    this.f51667agtfadlqog.append('/');
                    break;
                case 16:
                    this.f51667agtfadlqog.append('\b');
                    break;
                case 17:
                    this.f51667agtfadlqog.append('\f');
                    break;
                case 18:
                    this.f51667agtfadlqog.append('\n');
                    break;
                case 19:
                    this.f51667agtfadlqog.append('\r');
                    break;
                case 20:
                    this.f51667agtfadlqog.append('\t');
                    break;
                case 21:
                    return new wkgbmnqykc(0, Double.valueOf(gxszxtbevo()));
                case 22:
                    return new wkgbmnqykc(0, null);
                case 23:
                    return new wkgbmnqykc(0, Boolean.valueOf(gxszxtbevo()));
                case 24:
                    try {
                        this.f51667agtfadlqog.append((char) Integer.parseInt(gxszxtbevo().substring(2), 16));
                    } catch (Exception e13) {
                        throw new ParseException(this.f51668btonecajqb, 2, e13);
                    }
                    break;
                default:
                    if (i13 == -1 && this.f51675lqeggnwhkg == this.f51673gxszxtbevo) {
                        this.f51678wflxmlrfwp = true;
                        return null;
                    }
                    nufgyqmvbu(1);
                    break;
            }
        }
    }

    public final void zoijcleaow(int i13) {
        this.f51677ppxfxbqfkf = i13;
    }
}
