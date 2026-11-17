package hk;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public class wwaezpbzkn extends iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f40549eablkybsjg;

    public wwaezpbzkn(String source) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        this.f40549eablkybsjg = source;
    }

    @Override // hk.iobyxmoadg
    public byte btonecajqb() {
        String strIstkbnxepw = istkbnxepw();
        int i13 = this.f40509iobyxmoadg;
        while (i13 != -1 && i13 < strIstkbnxepw.length()) {
            int i14 = i13 + 1;
            char cCharAt = strIstkbnxepw.charAt(i13);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f40509iobyxmoadg = i14;
                return zoijcleaow.iobyxmoadg(cCharAt);
            }
            i13 = i14;
        }
        this.f40509iobyxmoadg = strIstkbnxepw.length();
        return (byte) 10;
    }

    @Override // hk.iobyxmoadg
    public void draadjrbmk(char c13) {
        if (this.f40509iobyxmoadg == -1) {
            wypolnanlu(c13);
        }
        String strIstkbnxepw = istkbnxepw();
        int i13 = this.f40509iobyxmoadg;
        while (i13 < strIstkbnxepw.length()) {
            int i14 = i13 + 1;
            char cCharAt = strIstkbnxepw.charAt(i13);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f40509iobyxmoadg = i14;
                if (cCharAt == c13) {
                    return;
                } else {
                    wypolnanlu(c13);
                }
            }
            i13 = i14;
        }
        this.f40509iobyxmoadg = -1;
        wypolnanlu(c13);
    }

    @Override // hk.iobyxmoadg
    public String dxjokdxxww() {
        draadjrbmk('\"');
        int i13 = this.f40509iobyxmoadg;
        int iYfnezrywwk = mj.kcexrzcfyt.yfnezrywwk(istkbnxepw(), '\"', i13, false, 4, null);
        if (iYfnezrywwk == -1) {
            vdvldrhtss();
            esjtqupxsv((byte) 1, false);
            throw new KotlinNothingValueException();
        }
        for (int i14 = i13; i14 < iYfnezrywwk; i14++) {
            if (istkbnxepw().charAt(i14) == '\\') {
                return rgvfuqvkyq(istkbnxepw(), this.f40509iobyxmoadg, i14);
            }
        }
        this.f40509iobyxmoadg = iYfnezrywwk + 1;
        String strSubstring = istkbnxepw().substring(i13, iYfnezrywwk);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // hk.iobyxmoadg
    public boolean eablkybsjg() {
        int i13 = this.f40509iobyxmoadg;
        if (i13 == -1) {
            return false;
        }
        String strIstkbnxepw = istkbnxepw();
        while (i13 < strIstkbnxepw.length()) {
            char cCharAt = strIstkbnxepw.charAt(i13);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f40509iobyxmoadg = i13;
                return cdpycssgdh(cCharAt);
            }
            i13++;
        }
        this.f40509iobyxmoadg = i13;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // hk.iobyxmoadg
    /* JADX INFO: renamed from: kegysxyocb, reason: merged with bridge method [inline-methods] */
    public String istkbnxepw() {
        return this.f40549eablkybsjg;
    }

    @Override // hk.iobyxmoadg
    public int pkzmftpjix() {
        char cCharAt;
        int i13 = this.f40509iobyxmoadg;
        if (i13 == -1) {
            return i13;
        }
        String strIstkbnxepw = istkbnxepw();
        while (i13 < strIstkbnxepw.length() && ((cCharAt = strIstkbnxepw.charAt(i13)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i13++;
        }
        this.f40509iobyxmoadg = i13;
        return i13;
    }

    @Override // hk.iobyxmoadg
    public int wwaezpbzkn(int i13) {
        if (i13 < istkbnxepw().length()) {
            return i13;
        }
        return -1;
    }

    @Override // hk.iobyxmoadg
    public String yadqdtsiqt(String keyToMatch, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(keyToMatch, "keyToMatch");
        int i13 = this.f40509iobyxmoadg;
        try {
            if (btonecajqb() == 6 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lmojexxdyd(z13), keyToMatch)) {
                zdlpuopuiu();
                if (btonecajqb() == 5) {
                    return lmojexxdyd(z13);
                }
            }
            return null;
        } finally {
            this.f40509iobyxmoadg = i13;
            zdlpuopuiu();
        }
    }
}
