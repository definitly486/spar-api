package hk;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class pkzmftpjix extends wwaezpbzkn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkzmftpjix(String source) {
        super(source);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
    }

    @Override // hk.wwaezpbzkn, hk.iobyxmoadg
    public byte btonecajqb() {
        String strIstkbnxepw = istkbnxepw();
        int iPkzmftpjix = pkzmftpjix();
        if (iPkzmftpjix >= strIstkbnxepw.length() || iPkzmftpjix == -1) {
            return (byte) 10;
        }
        this.f40509iobyxmoadg = iPkzmftpjix + 1;
        return zoijcleaow.iobyxmoadg(strIstkbnxepw.charAt(iPkzmftpjix));
    }

    @Override // hk.wwaezpbzkn, hk.iobyxmoadg
    public void draadjrbmk(char c13) {
        String strIstkbnxepw = istkbnxepw();
        int iPkzmftpjix = pkzmftpjix();
        if (iPkzmftpjix >= strIstkbnxepw.length() || iPkzmftpjix == -1) {
            this.f40509iobyxmoadg = -1;
            wypolnanlu(c13);
        }
        char cCharAt = strIstkbnxepw.charAt(iPkzmftpjix);
        this.f40509iobyxmoadg = iPkzmftpjix + 1;
        if (cCharAt == c13) {
            return;
        }
        wypolnanlu(c13);
    }

    @Override // hk.wwaezpbzkn, hk.iobyxmoadg
    public boolean eablkybsjg() {
        int iPkzmftpjix = pkzmftpjix();
        if (iPkzmftpjix >= istkbnxepw().length() || iPkzmftpjix == -1) {
            return false;
        }
        return cdpycssgdh(istkbnxepw().charAt(iPkzmftpjix));
    }

    @Override // hk.iobyxmoadg
    public byte iozdgvuglv() {
        String strIstkbnxepw = istkbnxepw();
        int iPkzmftpjix = pkzmftpjix();
        if (iPkzmftpjix >= strIstkbnxepw.length() || iPkzmftpjix == -1) {
            return (byte) 10;
        }
        this.f40509iobyxmoadg = iPkzmftpjix;
        return zoijcleaow.iobyxmoadg(strIstkbnxepw.charAt(iPkzmftpjix));
    }

    @Override // hk.wwaezpbzkn, hk.iobyxmoadg
    public int pkzmftpjix() {
        int i13;
        int iYfnezrywwk = this.f40509iobyxmoadg;
        if (iYfnezrywwk == -1) {
            return iYfnezrywwk;
        }
        String strIstkbnxepw = istkbnxepw();
        while (iYfnezrywwk < strIstkbnxepw.length()) {
            char cCharAt = strIstkbnxepw.charAt(iYfnezrywwk);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i13 = iYfnezrywwk + 1) >= strIstkbnxepw.length()) {
                    break;
                }
                char cCharAt2 = strIstkbnxepw.charAt(i13);
                if (cCharAt2 == '*') {
                    int iYdmasvzmpa = mj.kcexrzcfyt.ydmasvzmpa(strIstkbnxepw, "*/", iYfnezrywwk + 2, false, 4, null);
                    if (iYdmasvzmpa == -1) {
                        this.f40509iobyxmoadg = strIstkbnxepw.length();
                        iobyxmoadg.cqumvgiudr(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    iYfnezrywwk = iYdmasvzmpa + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iYfnezrywwk = mj.kcexrzcfyt.yfnezrywwk(strIstkbnxepw, '\n', iYfnezrywwk + 2, false, 4, null);
                    if (iYfnezrywwk == -1) {
                        iYfnezrywwk = strIstkbnxepw.length();
                    }
                }
            }
            iYfnezrywwk++;
        }
        this.f40509iobyxmoadg = iYfnezrywwk;
        return iYfnezrywwk;
    }
}
