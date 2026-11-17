package ce;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.gson.internal.eablkybsjg;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements Closeable {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private String f19748cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f19752istkbnxepw;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private String[] f19756lmojexxdyd;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private int[] f19758wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int[] f19759yadqdtsiqt;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Reader f19761zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private long f19762zynmafqrjb;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f19760yggfygwlhe = false;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final char[] f19754jyumaefscl = new char[UserVerificationMethods.USER_VERIFY_ALL];

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f19753iwizpuwonk = 0;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f19749cqumvgiudr = 0;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f19750esjtqupxsv = 0;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f19755lereixgezr = 0;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    int f19757pmvmpeiblj = 0;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f19751iozdgvuglv = 1;

    /* JADX INFO: renamed from: ce.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0359iobyxmoadg extends eablkybsjg {
        C0359iobyxmoadg() {
        }

        @Override // com.google.gson.internal.eablkybsjg
        public void iobyxmoadg(iobyxmoadg iobyxmoadgVar) throws IOException {
            int iDxjokdxxww = iobyxmoadgVar.f19757pmvmpeiblj;
            if (iDxjokdxxww == 0) {
                iDxjokdxxww = iobyxmoadgVar.dxjokdxxww();
            }
            if (iDxjokdxxww == 13) {
                iobyxmoadgVar.f19757pmvmpeiblj = 9;
                return;
            }
            if (iDxjokdxxww == 12) {
                iobyxmoadgVar.f19757pmvmpeiblj = 8;
                return;
            }
            if (iDxjokdxxww == 14) {
                iobyxmoadgVar.f19757pmvmpeiblj = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + iobyxmoadgVar.kegysxyocb() + iobyxmoadgVar.jyumaefscl());
        }
    }

    static {
        eablkybsjg.f25113iobyxmoadg = new C0359iobyxmoadg();
    }

    public iobyxmoadg(Reader reader) {
        int[] iArr = new int[32];
        this.f19759yadqdtsiqt = iArr;
        iArr[0] = 6;
        this.f19756lmojexxdyd = new String[32];
        this.f19758wwaezpbzkn = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f19761zdlpuopuiu = reader;
    }

    private boolean agtfadlqog(int i13) throws IOException {
        int i14;
        int i15;
        char[] cArr = this.f19754jyumaefscl;
        int i16 = this.f19755lereixgezr;
        int i17 = this.f19753iwizpuwonk;
        this.f19755lereixgezr = i16 - i17;
        int i18 = this.f19749cqumvgiudr;
        if (i18 != i17) {
            int i19 = i18 - i17;
            this.f19749cqumvgiudr = i19;
            System.arraycopy(cArr, i17, cArr, 0, i19);
        } else {
            this.f19749cqumvgiudr = 0;
        }
        this.f19753iwizpuwonk = 0;
        do {
            Reader reader = this.f19761zdlpuopuiu;
            int i23 = this.f19749cqumvgiudr;
            int i24 = reader.read(cArr, i23, cArr.length - i23);
            if (i24 == -1) {
                return false;
            }
            i14 = this.f19749cqumvgiudr + i24;
            this.f19749cqumvgiudr = i14;
            if (this.f19750esjtqupxsv == 0 && (i15 = this.f19755lereixgezr) == 0 && i14 > 0 && cArr[0] == 65279) {
                this.f19753iwizpuwonk++;
                this.f19755lereixgezr = i15 + 1;
                i13++;
            }
        } while (i14 < i13);
        return true;
    }

    private int cdpycssgdh(boolean z13) throws IOException {
        char[] cArr = this.f19754jyumaefscl;
        int i13 = this.f19753iwizpuwonk;
        int i14 = this.f19749cqumvgiudr;
        while (true) {
            if (i13 == i14) {
                this.f19753iwizpuwonk = i13;
                if (!agtfadlqog(1)) {
                    if (!z13) {
                        return -1;
                    }
                    throw new EOFException("End of input" + jyumaefscl());
                }
                i13 = this.f19753iwizpuwonk;
                i14 = this.f19749cqumvgiudr;
            }
            int i15 = i13 + 1;
            char c13 = cArr[i13];
            if (c13 == '\n') {
                this.f19750esjtqupxsv++;
                this.f19755lereixgezr = i15;
            } else if (c13 != ' ' && c13 != '\r' && c13 != '\t') {
                if (c13 == '/') {
                    this.f19753iwizpuwonk = i15;
                    if (i15 == i14) {
                        this.f19753iwizpuwonk = i13;
                        boolean zAgtfadlqog = agtfadlqog(2);
                        this.f19753iwizpuwonk++;
                        if (!zAgtfadlqog) {
                            return c13;
                        }
                    }
                    lqeggnwhkg();
                    int i16 = this.f19753iwizpuwonk;
                    char c14 = cArr[i16];
                    if (c14 == '*') {
                        this.f19753iwizpuwonk = i16 + 1;
                        if (!xrmfcynszj("*/")) {
                            throw zfvoamnweg("Unterminated comment");
                        }
                        i13 = this.f19753iwizpuwonk + 2;
                        i14 = this.f19749cqumvgiudr;
                    } else {
                        if (c14 != '/') {
                            return c13;
                        }
                        this.f19753iwizpuwonk = i16 + 1;
                        rlfsiqarku();
                        i13 = this.f19753iwizpuwonk;
                        i14 = this.f19749cqumvgiudr;
                    }
                } else {
                    if (c13 != '#') {
                        this.f19753iwizpuwonk = i15;
                        return c13;
                    }
                    this.f19753iwizpuwonk = i15;
                    lqeggnwhkg();
                    rlfsiqarku();
                    i13 = this.f19753iwizpuwonk;
                    i14 = this.f19749cqumvgiudr;
                }
            }
            i13 = i15;
        }
    }

    private char crxdokpmqz() throws IOException {
        int i13;
        if (this.f19753iwizpuwonk == this.f19749cqumvgiudr && !agtfadlqog(1)) {
            throw zfvoamnweg("Unterminated escape sequence");
        }
        char[] cArr = this.f19754jyumaefscl;
        int i14 = this.f19753iwizpuwonk;
        int i15 = i14 + 1;
        this.f19753iwizpuwonk = i15;
        char c13 = cArr[i14];
        if (c13 == '\n') {
            this.f19750esjtqupxsv++;
            this.f19755lereixgezr = i15;
        } else if (c13 != '\"' && c13 != '\'' && c13 != '/' && c13 != '\\') {
            if (c13 == 'b') {
                return '\b';
            }
            if (c13 == 'f') {
                return '\f';
            }
            if (c13 == 'n') {
                return '\n';
            }
            if (c13 == 'r') {
                return '\r';
            }
            if (c13 == 't') {
                return '\t';
            }
            if (c13 != 'u') {
                throw zfvoamnweg("Invalid escape sequence");
            }
            if (i14 + 5 > this.f19749cqumvgiudr && !agtfadlqog(4)) {
                throw zfvoamnweg("Unterminated escape sequence");
            }
            int i16 = this.f19753iwizpuwonk;
            int i17 = i16 + 4;
            char c14 = 0;
            while (i16 < i17) {
                char c15 = this.f19754jyumaefscl[i16];
                char c16 = (char) (c14 << 4);
                if (c15 >= '0' && c15 <= '9') {
                    i13 = c15 - '0';
                } else if (c15 >= 'a' && c15 <= 'f') {
                    i13 = c15 - 'W';
                } else {
                    if (c15 < 'A' || c15 > 'F') {
                        throw new NumberFormatException("\\u" + new String(this.f19754jyumaefscl, this.f19753iwizpuwonk, 4));
                    }
                    i13 = c15 - '7';
                }
                c14 = (char) (c16 + i13);
                i16++;
            }
            this.f19753iwizpuwonk += 4;
            return c14;
        }
        return c13;
    }

    private void czzsidtyhn() throws IOException {
        do {
            int i13 = 0;
            while (true) {
                int i14 = this.f19753iwizpuwonk;
                if (i14 + i13 < this.f19749cqumvgiudr) {
                    char c13 = this.f19754jyumaefscl[i14 + i13];
                    if (c13 != '\t' && c13 != '\n' && c13 != '\f' && c13 != '\r' && c13 != ' ') {
                        if (c13 != '#') {
                            if (c13 != ',') {
                                if (c13 != '/' && c13 != '=') {
                                    if (c13 != '{' && c13 != '}' && c13 != ':') {
                                        if (c13 != ';') {
                                            switch (c13) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i13++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        lqeggnwhkg();
                    }
                    this.f19753iwizpuwonk += i13;
                    return;
                }
                this.f19753iwizpuwonk = i14 + i13;
            }
        } while (agtfadlqog(1));
    }

    private String hkdspvbjdz(char c13) throws IOException {
        int i13;
        char[] cArr = this.f19754jyumaefscl;
        StringBuilder sb3 = null;
        do {
            int i14 = this.f19753iwizpuwonk;
            int i15 = this.f19749cqumvgiudr;
            while (true) {
                int i16 = i15;
                i13 = i14;
                while (true) {
                    if (i14 < i16) {
                        int i17 = i14 + 1;
                        char c14 = cArr[i14];
                        if (c14 == c13) {
                            this.f19753iwizpuwonk = i17;
                            int i18 = (i17 - i13) - 1;
                            if (sb3 == null) {
                                return new String(cArr, i13, i18);
                            }
                            sb3.append(cArr, i13, i18);
                            return sb3.toString();
                        }
                        if (c14 == '\\') {
                            this.f19753iwizpuwonk = i17;
                            int i19 = i17 - i13;
                            int i23 = i19 - 1;
                            if (sb3 == null) {
                                sb3 = new StringBuilder(Math.max(i19 * 2, 16));
                            }
                            sb3.append(cArr, i13, i23);
                            sb3.append(crxdokpmqz());
                            i14 = this.f19753iwizpuwonk;
                            i15 = this.f19749cqumvgiudr;
                        } else {
                            if (c14 == '\n') {
                                this.f19750esjtqupxsv++;
                                this.f19755lereixgezr = i17;
                            }
                            i14 = i17;
                        }
                    }
                }
            }
            if (sb3 == null) {
                sb3 = new StringBuilder(Math.max((i14 - i13) * 2, 16));
            }
            sb3.append(cArr, i13, i14 - i13);
            this.f19753iwizpuwonk = i14;
        } while (agtfadlqog(1));
        throw zfvoamnweg("Unterminated string");
    }

    private void lqeggnwhkg() throws IOException {
        if (!this.f19760yggfygwlhe) {
            throw zfvoamnweg("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int mbcevpiqjq() {
        String str;
        String str2;
        int i13;
        char c13 = this.f19754jyumaefscl[this.f19753iwizpuwonk];
        if (c13 == 't' || c13 == 'T') {
            str = "true";
            str2 = "TRUE";
            i13 = 5;
        } else if (c13 == 'f' || c13 == 'F') {
            str = "false";
            str2 = "FALSE";
            i13 = 6;
        } else {
            if (c13 != 'n' && c13 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i13 = 7;
        }
        int length = str.length();
        for (int i14 = 1; i14 < length; i14++) {
            if (this.f19753iwizpuwonk + i14 >= this.f19749cqumvgiudr && !agtfadlqog(i14 + 1)) {
                return 0;
            }
            char c14 = this.f19754jyumaefscl[this.f19753iwizpuwonk + i14];
            if (c14 != str.charAt(i14) && c14 != str2.charAt(i14)) {
                return 0;
            }
        }
        if ((this.f19753iwizpuwonk + length < this.f19749cqumvgiudr || agtfadlqog(length + 1)) && zdlpuopuiu(this.f19754jyumaefscl[this.f19753iwizpuwonk + length])) {
            return 0;
        }
        this.f19753iwizpuwonk += length;
        this.f19757pmvmpeiblj = i13;
        return i13;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:90:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00ec  */
    private int ntlheqmsrt() {
        char c13;
        char c14;
        char[] cArr = this.f19754jyumaefscl;
        int i13 = this.f19753iwizpuwonk;
        int i14 = this.f19749cqumvgiudr;
        int i15 = 0;
        int i16 = 0;
        char c15 = 0;
        boolean z13 = false;
        boolean z14 = true;
        long j13 = 0;
        while (true) {
            if (i13 + i16 != i14) {
                c13 = cArr[i13 + i16];
                if (c13 != '+') {
                    if (c13 != 'E' || c13 == 'e') {
                        i15 = 0;
                        if (c15 == 2 && c15 != 4) {
                            return 0;
                        }
                        c15 = 5;
                    } else if (c13 != '-') {
                        c14 = 3;
                        if (c13 == '.') {
                            i15 = 0;
                            if (c15 != 2) {
                                return 0;
                            }
                        } else {
                            if (c13 < '0' || c13 > '9') {
                                if (!zdlpuopuiu(c13)) {
                                    break;
                                }
                                return 0;
                            }
                            if (c15 == 1 || c15 == 0) {
                                j13 = -(c13 - '0');
                                c15 = 2;
                            } else if (c15 == 2) {
                                if (j13 == 0) {
                                    return 0;
                                }
                                long j14 = (10 * j13) - ((long) (c13 - '0'));
                                z14 &= j13 > -922337203685477580L || (j13 == -922337203685477580L && j14 < j13);
                                j13 = j14;
                            } else if (c15 == 3) {
                                i15 = 0;
                                c15 = 4;
                            } else if (c15 == 5 || c15 == 6) {
                                i15 = 0;
                                c15 = 7;
                            }
                            i15 = 0;
                        }
                    } else {
                        c14 = 6;
                        i15 = 0;
                        if (c15 == 0) {
                            c15 = 1;
                            z13 = true;
                        } else if (c15 != 5) {
                            return 0;
                        }
                    }
                    i16++;
                } else {
                    c14 = 6;
                    i15 = 0;
                    if (c15 != 5) {
                        return 0;
                    }
                }
                c15 = c14;
                i16++;
            } else {
                if (i16 == cArr.length) {
                    return i15;
                }
                if (!agtfadlqog(i16 + 1)) {
                    break;
                }
                i13 = this.f19753iwizpuwonk;
                i14 = this.f19749cqumvgiudr;
                c13 = cArr[i13 + i16];
                if (c13 != '+') {
                    if (c13 != 'E') {
                        i15 = 0;
                        if (c15 == 2) {
                        }
                        c15 = 5;
                    } else {
                        i15 = 0;
                        if (c15 == 2) {
                        }
                        c15 = 5;
                    }
                    i16++;
                } else {
                    c14 = 6;
                    i15 = 0;
                    if (c15 != 5) {
                        return 0;
                    }
                }
                c15 = c14;
                i16++;
            }
        }
        if (c15 == 2 && z14 && ((j13 != Long.MIN_VALUE || z13) && (j13 != 0 || !z13))) {
            if (!z13) {
                j13 = -j13;
            }
            this.f19762zynmafqrjb = j13;
            this.f19753iwizpuwonk += i16;
            this.f19757pmvmpeiblj = 15;
            return 15;
        }
        if (c15 != 2 && c15 != 4 && c15 != 7) {
            return 0;
        }
        this.f19752istkbnxepw = i16;
        this.f19757pmvmpeiblj = 16;
        return 16;
    }

    private void nufgyqmvbu() throws IOException {
        cdpycssgdh(true);
        int i13 = this.f19753iwizpuwonk;
        this.f19753iwizpuwonk = i13 - 1;
        if (i13 + 4 <= this.f19749cqumvgiudr || agtfadlqog(5)) {
            int i14 = this.f19753iwizpuwonk;
            char[] cArr = this.f19754jyumaefscl;
            if (cArr[i14] == ')' && cArr[i14 + 1] == ']' && cArr[i14 + 2] == '}' && cArr[i14 + 3] == '\'' && cArr[i14 + 4] == '\n') {
                this.f19753iwizpuwonk = i14 + 5;
            }
        }
    }

    private String ojitshcjhn(boolean z13) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append('$');
        int i13 = 0;
        while (true) {
            int i14 = this.f19751iozdgvuglv;
            if (i13 >= i14) {
                return sb3.toString();
            }
            int i15 = this.f19759yadqdtsiqt[i13];
            if (i15 == 1 || i15 == 2) {
                int i16 = this.f19758wwaezpbzkn[i13];
                if (z13 && i16 > 0 && i13 == i14 - 1) {
                    i16--;
                }
                sb3.append('[');
                sb3.append(i16);
                sb3.append(']');
            } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                sb3.append('.');
                String str = this.f19756lmojexxdyd[i13];
                if (str != null) {
                    sb3.append(str);
                }
            }
            i13++;
        }
    }

    private void okpsazkaxt(char c13) throws IOException {
        char[] cArr = this.f19754jyumaefscl;
        do {
            int i13 = this.f19753iwizpuwonk;
            int i14 = this.f19749cqumvgiudr;
            while (i13 < i14) {
                int i15 = i13 + 1;
                char c14 = cArr[i13];
                if (c14 == c13) {
                    this.f19753iwizpuwonk = i15;
                    return;
                }
                if (c14 == '\\') {
                    this.f19753iwizpuwonk = i15;
                    crxdokpmqz();
                    i13 = this.f19753iwizpuwonk;
                    i14 = this.f19749cqumvgiudr;
                } else {
                    if (c14 == '\n') {
                        this.f19750esjtqupxsv++;
                        this.f19755lereixgezr = i15;
                    }
                    i13 = i15;
                }
            }
            this.f19753iwizpuwonk = i13;
        } while (agtfadlqog(1));
        throw zfvoamnweg("Unterminated string");
    }

    private void rlfsiqarku() {
        char c13;
        do {
            if (this.f19753iwizpuwonk >= this.f19749cqumvgiudr && !agtfadlqog(1)) {
                return;
            }
            char[] cArr = this.f19754jyumaefscl;
            int i13 = this.f19753iwizpuwonk;
            int i14 = i13 + 1;
            this.f19753iwizpuwonk = i14;
            c13 = cArr[i13];
            if (c13 == '\n') {
                this.f19750esjtqupxsv++;
                this.f19755lereixgezr = i14;
                return;
            }
        } while (c13 != '\r');
    }

    private void ulzqkzuiru(int i13) {
        int i14 = this.f19751iozdgvuglv;
        int[] iArr = this.f19759yadqdtsiqt;
        if (i14 == iArr.length) {
            int i15 = i14 * 2;
            this.f19759yadqdtsiqt = Arrays.copyOf(iArr, i15);
            this.f19758wwaezpbzkn = Arrays.copyOf(this.f19758wwaezpbzkn, i15);
            this.f19756lmojexxdyd = (String[]) Arrays.copyOf(this.f19756lmojexxdyd, i15);
        }
        int[] iArr2 = this.f19759yadqdtsiqt;
        int i16 = this.f19751iozdgvuglv;
        this.f19751iozdgvuglv = i16 + 1;
        iArr2[i16] = i13;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String wypolnanlu() throws IOException {
        String string;
        StringBuilder sb3 = null;
        int i13 = 0;
        while (true) {
            int i14 = 0;
            while (true) {
                int i15 = this.f19753iwizpuwonk;
                if (i15 + i14 < this.f19749cqumvgiudr) {
                    char c13 = this.f19754jyumaefscl[i15 + i14];
                    if (c13 != '\t' && c13 != '\n' && c13 != '\f' && c13 != '\r' && c13 != ' ') {
                        if (c13 != '#') {
                            if (c13 != ',') {
                                if (c13 != '/' && c13 != '=') {
                                    if (c13 != '{' && c13 != '}' && c13 != ':') {
                                        if (c13 != ';') {
                                            switch (c13) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i14++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        lqeggnwhkg();
                    }
                    i13 = i14;
                } else if (i14 >= this.f19754jyumaefscl.length) {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i14, 16));
                    }
                    sb3.append(this.f19754jyumaefscl, this.f19753iwizpuwonk, i14);
                    this.f19753iwizpuwonk += i14;
                    if (!agtfadlqog(1)) {
                    }
                } else if (!agtfadlqog(i14 + 1)) {
                    i13 = i14;
                }
                if (sb3 == null) {
                    string = new String(this.f19754jyumaefscl, this.f19753iwizpuwonk, i13);
                } else {
                    sb3.append(this.f19754jyumaefscl, this.f19753iwizpuwonk, i13);
                    string = sb3.toString();
                }
                this.f19753iwizpuwonk += i13;
                return string;
            }
        }
    }

    private boolean xrmfcynszj(String str) {
        int length = str.length();
        while (true) {
            if (this.f19753iwizpuwonk + length > this.f19749cqumvgiudr && !agtfadlqog(length)) {
                return false;
            }
            char[] cArr = this.f19754jyumaefscl;
            int i13 = this.f19753iwizpuwonk;
            if (cArr[i13] != '\n') {
                for (int i14 = 0; i14 < length; i14++) {
                    if (this.f19754jyumaefscl[this.f19753iwizpuwonk + i14] == str.charAt(i14)) {
                    }
                }
                return true;
            }
            this.f19750esjtqupxsv++;
            this.f19755lereixgezr = i13 + 1;
            this.f19753iwizpuwonk++;
        }
    }

    private boolean zdlpuopuiu(char c13) throws IOException {
        if (c13 == '\t' || c13 == '\n' || c13 == '\f' || c13 == '\r' || c13 == ' ') {
            return false;
        }
        if (c13 != '#') {
            if (c13 == ',') {
                return false;
            }
            if (c13 != '/' && c13 != '=') {
                if (c13 == '{' || c13 == '}' || c13 == ':') {
                    return false;
                }
                if (c13 != ';') {
                    switch (c13) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        lqeggnwhkg();
        return false;
    }

    private IOException zfvoamnweg(String str) throws MalformedJsonException {
        throw new MalformedJsonException(str + jyumaefscl());
    }

    public void btonecajqb() throws IOException {
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        if (iDxjokdxxww != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + kegysxyocb() + jyumaefscl());
        }
        int i13 = this.f19751iozdgvuglv;
        this.f19751iozdgvuglv = i13 - 1;
        int[] iArr = this.f19758wwaezpbzkn;
        int i14 = i13 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f19757pmvmpeiblj = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19757pmvmpeiblj = 0;
        this.f19759yadqdtsiqt[0] = 8;
        this.f19751iozdgvuglv = 1;
        this.f19761zdlpuopuiu.close();
    }

    public boolean cqumvgiudr() throws IOException {
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        if (iDxjokdxxww == 5) {
            this.f19757pmvmpeiblj = 0;
            int[] iArr = this.f19758wwaezpbzkn;
            int i13 = this.f19751iozdgvuglv - 1;
            iArr[i13] = iArr[i13] + 1;
            return true;
        }
        if (iDxjokdxxww == 6) {
            this.f19757pmvmpeiblj = 0;
            int[] iArr2 = this.f19758wwaezpbzkn;
            int i14 = this.f19751iozdgvuglv - 1;
            iArr2[i14] = iArr2[i14] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + kegysxyocb() + jyumaefscl());
    }

    public void draadjrbmk() throws IOException {
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        if (iDxjokdxxww != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + kegysxyocb() + jyumaefscl());
        }
        int i13 = this.f19751iozdgvuglv;
        int i14 = i13 - 1;
        this.f19751iozdgvuglv = i14;
        this.f19756lmojexxdyd[i14] = null;
        int[] iArr = this.f19758wwaezpbzkn;
        int i15 = i13 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.f19757pmvmpeiblj = 0;
    }

    public String dsvhmnatus() throws IOException {
        String str;
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        if (iDxjokdxxww == 10) {
            str = wypolnanlu();
        } else if (iDxjokdxxww == 8) {
            str = hkdspvbjdz('\'');
        } else if (iDxjokdxxww == 9) {
            str = hkdspvbjdz('\"');
        } else if (iDxjokdxxww == 11) {
            str = this.f19748cdpycssgdh;
            this.f19748cdpycssgdh = null;
        } else if (iDxjokdxxww == 15) {
            str = Long.toString(this.f19762zynmafqrjb);
        } else {
            if (iDxjokdxxww != 16) {
                throw new IllegalStateException("Expected a string but was " + kegysxyocb() + jyumaefscl());
            }
            str = new String(this.f19754jyumaefscl, this.f19753iwizpuwonk, this.f19752istkbnxepw);
            this.f19753iwizpuwonk += this.f19752istkbnxepw;
        }
        this.f19757pmvmpeiblj = 0;
        int[] iArr = this.f19758wwaezpbzkn;
        int i13 = this.f19751iozdgvuglv - 1;
        iArr[i13] = iArr[i13] + 1;
        return str;
    }

    int dxjokdxxww() throws IOException {
        int iCdpycssgdh;
        int[] iArr = this.f19759yadqdtsiqt;
        int i13 = this.f19751iozdgvuglv;
        int i14 = iArr[i13 - 1];
        if (i14 == 1) {
            iArr[i13 - 1] = 2;
        } else if (i14 == 2) {
            int iCdpycssgdh2 = cdpycssgdh(true);
            if (iCdpycssgdh2 != 44) {
                if (iCdpycssgdh2 != 59) {
                    if (iCdpycssgdh2 != 93) {
                        throw zfvoamnweg("Unterminated array");
                    }
                    this.f19757pmvmpeiblj = 4;
                    return 4;
                }
                lqeggnwhkg();
            }
        } else {
            if (i14 == 3 || i14 == 5) {
                iArr[i13 - 1] = 4;
                if (i14 == 5 && (iCdpycssgdh = cdpycssgdh(true)) != 44) {
                    if (iCdpycssgdh != 59) {
                        if (iCdpycssgdh != 125) {
                            throw zfvoamnweg("Unterminated object");
                        }
                        this.f19757pmvmpeiblj = 2;
                        return 2;
                    }
                    lqeggnwhkg();
                }
                int iCdpycssgdh3 = cdpycssgdh(true);
                if (iCdpycssgdh3 == 34) {
                    this.f19757pmvmpeiblj = 13;
                    return 13;
                }
                if (iCdpycssgdh3 == 39) {
                    lqeggnwhkg();
                    this.f19757pmvmpeiblj = 12;
                    return 12;
                }
                if (iCdpycssgdh3 == 125) {
                    if (i14 == 5) {
                        throw zfvoamnweg("Expected name");
                    }
                    this.f19757pmvmpeiblj = 2;
                    return 2;
                }
                lqeggnwhkg();
                this.f19753iwizpuwonk--;
                if (!zdlpuopuiu((char) iCdpycssgdh3)) {
                    throw zfvoamnweg("Expected name");
                }
                this.f19757pmvmpeiblj = 14;
                return 14;
            }
            if (i14 == 4) {
                iArr[i13 - 1] = 5;
                int iCdpycssgdh4 = cdpycssgdh(true);
                if (iCdpycssgdh4 != 58) {
                    if (iCdpycssgdh4 != 61) {
                        throw zfvoamnweg("Expected ':'");
                    }
                    lqeggnwhkg();
                    if (this.f19753iwizpuwonk < this.f19749cqumvgiudr || agtfadlqog(1)) {
                        char[] cArr = this.f19754jyumaefscl;
                        int i15 = this.f19753iwizpuwonk;
                        if (cArr[i15] == '>') {
                            this.f19753iwizpuwonk = i15 + 1;
                        }
                    }
                }
            } else if (i14 == 6) {
                if (this.f19760yggfygwlhe) {
                    nufgyqmvbu();
                }
                this.f19759yadqdtsiqt[this.f19751iozdgvuglv - 1] = 7;
            } else if (i14 == 7) {
                if (cdpycssgdh(false) == -1) {
                    this.f19757pmvmpeiblj = 17;
                    return 17;
                }
                lqeggnwhkg();
                this.f19753iwizpuwonk--;
            } else if (i14 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iCdpycssgdh5 = cdpycssgdh(true);
        if (iCdpycssgdh5 == 34) {
            this.f19757pmvmpeiblj = 9;
            return 9;
        }
        if (iCdpycssgdh5 == 39) {
            lqeggnwhkg();
            this.f19757pmvmpeiblj = 8;
            return 8;
        }
        if (iCdpycssgdh5 != 44 && iCdpycssgdh5 != 59) {
            if (iCdpycssgdh5 == 91) {
                this.f19757pmvmpeiblj = 3;
                return 3;
            }
            if (iCdpycssgdh5 != 93) {
                if (iCdpycssgdh5 == 123) {
                    this.f19757pmvmpeiblj = 1;
                    return 1;
                }
                this.f19753iwizpuwonk--;
                int iMbcevpiqjq = mbcevpiqjq();
                if (iMbcevpiqjq != 0) {
                    return iMbcevpiqjq;
                }
                int iNtlheqmsrt = ntlheqmsrt();
                if (iNtlheqmsrt != 0) {
                    return iNtlheqmsrt;
                }
                if (!zdlpuopuiu(this.f19754jyumaefscl[this.f19753iwizpuwonk])) {
                    throw zfvoamnweg("Expected value");
                }
                lqeggnwhkg();
                this.f19757pmvmpeiblj = 10;
                return 10;
            }
            if (i14 == 1) {
                this.f19757pmvmpeiblj = 4;
                return 4;
            }
        }
        if (i14 != 1 && i14 != 2) {
            throw zfvoamnweg("Unexpected value");
        }
        lqeggnwhkg();
        this.f19753iwizpuwonk--;
        this.f19757pmvmpeiblj = 7;
        return 7;
    }

    public String gxszxtbevo() {
        return ojitshcjhn(false);
    }

    public void iobyxmoadg() throws IOException {
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        if (iDxjokdxxww == 3) {
            ulzqkzuiru(1);
            this.f19758wwaezpbzkn[this.f19751iozdgvuglv - 1] = 0;
            this.f19757pmvmpeiblj = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + kegysxyocb() + jyumaefscl());
        }
    }

    public String istkbnxepw() throws IOException {
        String strHkdspvbjdz;
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        if (iDxjokdxxww == 14) {
            strHkdspvbjdz = wypolnanlu();
        } else if (iDxjokdxxww == 12) {
            strHkdspvbjdz = hkdspvbjdz('\'');
        } else {
            if (iDxjokdxxww != 13) {
                throw new IllegalStateException("Expected a name but was " + kegysxyocb() + jyumaefscl());
            }
            strHkdspvbjdz = hkdspvbjdz('\"');
        }
        this.f19757pmvmpeiblj = 0;
        this.f19756lmojexxdyd[this.f19751iozdgvuglv - 1] = strHkdspvbjdz;
        return strHkdspvbjdz;
    }

    public final void jlmebxxoox(boolean z13) {
        this.f19760yggfygwlhe = z13;
    }

    String jyumaefscl() {
        return " at line " + (this.f19750esjtqupxsv + 1) + " column " + ((this.f19753iwizpuwonk - this.f19755lereixgezr) + 1) + " path " + gxszxtbevo();
    }

    public final boolean kcexrzcfyt() {
        return this.f19760yggfygwlhe;
    }

    public zoijcleaow kegysxyocb() throws IOException {
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        switch (iDxjokdxxww) {
            case 1:
                return zoijcleaow.BEGIN_OBJECT;
            case 2:
                return zoijcleaow.END_OBJECT;
            case 3:
                return zoijcleaow.BEGIN_ARRAY;
            case 4:
                return zoijcleaow.END_ARRAY;
            case 5:
            case 6:
                return zoijcleaow.BOOLEAN;
            case 7:
                return zoijcleaow.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return zoijcleaow.STRING;
            case 12:
            case 13:
            case 14:
                return zoijcleaow.NAME;
            case 15:
            case 16:
                return zoijcleaow.NUMBER;
            case 17:
                return zoijcleaow.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public double lereixgezr() throws IOException {
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        if (iDxjokdxxww == 15) {
            this.f19757pmvmpeiblj = 0;
            int[] iArr = this.f19758wwaezpbzkn;
            int i13 = this.f19751iozdgvuglv - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.f19762zynmafqrjb;
        }
        if (iDxjokdxxww == 16) {
            this.f19748cdpycssgdh = new String(this.f19754jyumaefscl, this.f19753iwizpuwonk, this.f19752istkbnxepw);
            this.f19753iwizpuwonk += this.f19752istkbnxepw;
        } else if (iDxjokdxxww == 8 || iDxjokdxxww == 9) {
            this.f19748cdpycssgdh = hkdspvbjdz(iDxjokdxxww == 8 ? '\'' : '\"');
        } else if (iDxjokdxxww == 10) {
            this.f19748cdpycssgdh = wypolnanlu();
        } else if (iDxjokdxxww != 11) {
            throw new IllegalStateException("Expected a double but was " + kegysxyocb() + jyumaefscl());
        }
        this.f19757pmvmpeiblj = 11;
        double d13 = Double.parseDouble(this.f19748cdpycssgdh);
        if (!this.f19760yggfygwlhe && (Double.isNaN(d13) || Double.isInfinite(d13))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d13 + jyumaefscl());
        }
        this.f19748cdpycssgdh = null;
        this.f19757pmvmpeiblj = 0;
        int[] iArr2 = this.f19758wwaezpbzkn;
        int i14 = this.f19751iozdgvuglv - 1;
        iArr2[i14] = iArr2[i14] + 1;
        return d13;
    }

    public int pmvmpeiblj() throws IOException {
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        if (iDxjokdxxww == 15) {
            long j13 = this.f19762zynmafqrjb;
            int i13 = (int) j13;
            if (j13 == i13) {
                this.f19757pmvmpeiblj = 0;
                int[] iArr = this.f19758wwaezpbzkn;
                int i14 = this.f19751iozdgvuglv - 1;
                iArr[i14] = iArr[i14] + 1;
                return i13;
            }
            throw new NumberFormatException("Expected an int but was " + this.f19762zynmafqrjb + jyumaefscl());
        }
        if (iDxjokdxxww == 16) {
            this.f19748cdpycssgdh = new String(this.f19754jyumaefscl, this.f19753iwizpuwonk, this.f19752istkbnxepw);
            this.f19753iwizpuwonk += this.f19752istkbnxepw;
        } else {
            if (iDxjokdxxww != 8 && iDxjokdxxww != 9 && iDxjokdxxww != 10) {
                throw new IllegalStateException("Expected an int but was " + kegysxyocb() + jyumaefscl());
            }
            if (iDxjokdxxww == 10) {
                this.f19748cdpycssgdh = wypolnanlu();
            } else {
                this.f19748cdpycssgdh = hkdspvbjdz(iDxjokdxxww == 8 ? '\'' : '\"');
            }
            try {
                int i15 = Integer.parseInt(this.f19748cdpycssgdh);
                this.f19757pmvmpeiblj = 0;
                int[] iArr2 = this.f19758wwaezpbzkn;
                int i16 = this.f19751iozdgvuglv - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return i15;
            } catch (NumberFormatException unused) {
            }
        }
        this.f19757pmvmpeiblj = 11;
        double d13 = Double.parseDouble(this.f19748cdpycssgdh);
        int i17 = (int) d13;
        if (i17 != d13) {
            throw new NumberFormatException("Expected an int but was " + this.f19748cdpycssgdh + jyumaefscl());
        }
        this.f19748cdpycssgdh = null;
        this.f19757pmvmpeiblj = 0;
        int[] iArr3 = this.f19758wwaezpbzkn;
        int i18 = this.f19751iozdgvuglv - 1;
        iArr3[i18] = iArr3[i18] + 1;
        return i17;
    }

    public String rgvfuqvkyq() {
        return ojitshcjhn(true);
    }

    public String toString() {
        return getClass().getSimpleName() + jyumaefscl();
    }

    public boolean vdvldrhtss() throws IOException {
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        return (iDxjokdxxww == 2 || iDxjokdxxww == 4 || iDxjokdxxww == 17) ? false : true;
    }

    public void wkgbmnqykc() throws IOException {
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        if (iDxjokdxxww == 1) {
            ulzqkzuiru(3);
            this.f19757pmvmpeiblj = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + kegysxyocb() + jyumaefscl());
        }
    }

    public void wwaezpbzkn() throws IOException {
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        if (iDxjokdxxww == 7) {
            this.f19757pmvmpeiblj = 0;
            int[] iArr = this.f19758wwaezpbzkn;
            int i13 = this.f19751iozdgvuglv - 1;
            iArr[i13] = iArr[i13] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + kegysxyocb() + jyumaefscl());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void yfnezrywwk() throws IOException {
        int i13 = 0;
        do {
            int iDxjokdxxww = this.f19757pmvmpeiblj;
            if (iDxjokdxxww == 0) {
                iDxjokdxxww = dxjokdxxww();
            }
            switch (iDxjokdxxww) {
                case 1:
                    ulzqkzuiru(3);
                    i13++;
                    this.f19757pmvmpeiblj = 0;
                    break;
                case 2:
                    if (i13 == 0) {
                        this.f19756lmojexxdyd[this.f19751iozdgvuglv - 1] = null;
                    }
                    this.f19751iozdgvuglv--;
                    i13--;
                    this.f19757pmvmpeiblj = 0;
                    break;
                case 3:
                    ulzqkzuiru(1);
                    i13++;
                    this.f19757pmvmpeiblj = 0;
                    break;
                case 4:
                    this.f19751iozdgvuglv--;
                    i13--;
                    this.f19757pmvmpeiblj = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f19757pmvmpeiblj = 0;
                    break;
                case 8:
                    okpsazkaxt('\'');
                    this.f19757pmvmpeiblj = 0;
                    break;
                case 9:
                    okpsazkaxt('\"');
                    this.f19757pmvmpeiblj = 0;
                    break;
                case 10:
                    czzsidtyhn();
                    this.f19757pmvmpeiblj = 0;
                    break;
                case 12:
                    okpsazkaxt('\'');
                    if (i13 == 0) {
                        this.f19756lmojexxdyd[this.f19751iozdgvuglv - 1] = "<skipped>";
                    }
                    this.f19757pmvmpeiblj = 0;
                    break;
                case 13:
                    okpsazkaxt('\"');
                    if (i13 == 0) {
                        this.f19756lmojexxdyd[this.f19751iozdgvuglv - 1] = "<skipped>";
                    }
                    this.f19757pmvmpeiblj = 0;
                    break;
                case 14:
                    czzsidtyhn();
                    if (i13 == 0) {
                        this.f19756lmojexxdyd[this.f19751iozdgvuglv - 1] = "<skipped>";
                    }
                    this.f19757pmvmpeiblj = 0;
                    break;
                case 16:
                    this.f19753iwizpuwonk += this.f19752istkbnxepw;
                    this.f19757pmvmpeiblj = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i13 > 0);
        int[] iArr = this.f19758wwaezpbzkn;
        int i14 = this.f19751iozdgvuglv - 1;
        iArr[i14] = iArr[i14] + 1;
    }

    public long zynmafqrjb() throws IOException {
        int iDxjokdxxww = this.f19757pmvmpeiblj;
        if (iDxjokdxxww == 0) {
            iDxjokdxxww = dxjokdxxww();
        }
        if (iDxjokdxxww == 15) {
            this.f19757pmvmpeiblj = 0;
            int[] iArr = this.f19758wwaezpbzkn;
            int i13 = this.f19751iozdgvuglv - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.f19762zynmafqrjb;
        }
        if (iDxjokdxxww == 16) {
            this.f19748cdpycssgdh = new String(this.f19754jyumaefscl, this.f19753iwizpuwonk, this.f19752istkbnxepw);
            this.f19753iwizpuwonk += this.f19752istkbnxepw;
        } else {
            if (iDxjokdxxww != 8 && iDxjokdxxww != 9 && iDxjokdxxww != 10) {
                throw new IllegalStateException("Expected a long but was " + kegysxyocb() + jyumaefscl());
            }
            if (iDxjokdxxww == 10) {
                this.f19748cdpycssgdh = wypolnanlu();
            } else {
                this.f19748cdpycssgdh = hkdspvbjdz(iDxjokdxxww == 8 ? '\'' : '\"');
            }
            try {
                long j13 = Long.parseLong(this.f19748cdpycssgdh);
                this.f19757pmvmpeiblj = 0;
                int[] iArr2 = this.f19758wwaezpbzkn;
                int i14 = this.f19751iozdgvuglv - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return j13;
            } catch (NumberFormatException unused) {
            }
        }
        this.f19757pmvmpeiblj = 11;
        double d13 = Double.parseDouble(this.f19748cdpycssgdh);
        long j14 = (long) d13;
        if (j14 != d13) {
            throw new NumberFormatException("Expected a long but was " + this.f19748cdpycssgdh + jyumaefscl());
        }
        this.f19748cdpycssgdh = null;
        this.f19757pmvmpeiblj = 0;
        int[] iArr3 = this.f19758wwaezpbzkn;
        int i15 = this.f19751iozdgvuglv - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return j14;
    }
}
