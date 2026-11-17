package y2;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private byte[] f123621iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f123622ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f123623zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final char[] f123620wkgbmnqykc = {'\r', '\n'};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final char[] f123618eablkybsjg = {'\n'};

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final com.google.common.collect.jyumaefscl f123619gxszxtbevo = com.google.common.collect.jyumaefscl.yadqdtsiqt(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    public yadqdtsiqt() {
        this.f123621iobyxmoadg = stevsuqkhv.f123601gxszxtbevo;
    }

    private int dxjokdxxww(Charset charset) {
        byte b13;
        byte b14;
        byte b15 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && iobyxmoadg() >= 1) {
            b13 = this.f123621iobyxmoadg[this.f123623zoijcleaow];
            b14 = 0;
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && iobyxmoadg() >= 2) {
                byte[] bArr = this.f123621iobyxmoadg;
                int i13 = this.f123623zoijcleaow;
                b14 = bArr[i13];
                b13 = bArr[i13 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || iobyxmoadg() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f123621iobyxmoadg;
                int i14 = this.f123623zoijcleaow;
                b14 = bArr2[i14 + 1];
                b13 = bArr2[i14];
            }
            b15 = 2;
        }
        return com.google.common.primitives.gxszxtbevo.lqeggnwhkg(b14, b13, (byte) 0, b15);
    }

    private void jlmebxxoox(Charset charset) {
        if (wflxmlrfwp(charset, f123620wkgbmnqykc) == '\r') {
            wflxmlrfwp(charset, f123618eablkybsjg);
        }
    }

    private char wflxmlrfwp(Charset charset, char[] cArr) {
        int iDxjokdxxww = dxjokdxxww(charset);
        if (iDxjokdxxww == 0) {
            return (char) 0;
        }
        char c13 = (char) (iDxjokdxxww >> 16);
        if (!com.google.common.primitives.zoijcleaow.iobyxmoadg(cArr, c13)) {
            return (char) 0;
        }
        this.f123623zoijcleaow += iDxjokdxxww & 65535;
        return c13;
    }

    private int wkgbmnqykc(Charset charset) {
        int i13;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i13 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i13 = 2;
        }
        int i14 = this.f123623zoijcleaow;
        while (true) {
            int i15 = this.f123622ppxfxbqfkf;
            if (i14 >= i15 - (i13 - 1)) {
                return i15;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && stevsuqkhv.lxfrhoxuzk(this.f123621iobyxmoadg[i14])) {
                return i14;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f123621iobyxmoadg;
                if (bArr[i14] == 0 && stevsuqkhv.lxfrhoxuzk(bArr[i14 + 1])) {
                    return i14;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f123621iobyxmoadg;
                if (bArr2[i14 + 1] == 0 && stevsuqkhv.lxfrhoxuzk(bArr2[i14])) {
                    return i14;
                }
            }
            i14 += i13;
        }
    }

    public String agtfadlqog(char c13) {
        if (iobyxmoadg() == 0) {
            return null;
        }
        int i13 = this.f123623zoijcleaow;
        while (i13 < this.f123622ppxfxbqfkf && this.f123621iobyxmoadg[i13] != c13) {
            i13++;
        }
        byte[] bArr = this.f123621iobyxmoadg;
        int i14 = this.f123623zoijcleaow;
        String strWwaezpbzkn = stevsuqkhv.wwaezpbzkn(bArr, i14, i13 - i14);
        this.f123623zoijcleaow = i13;
        if (i13 < this.f123622ppxfxbqfkf) {
            this.f123623zoijcleaow = i13 + 1;
        }
        return strWwaezpbzkn;
    }

    public int btonecajqb() {
        return this.f123621iobyxmoadg[this.f123623zoijcleaow] & 255;
    }

    public short cdpycssgdh() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        int i15 = (bArr[i13] & 255) << 8;
        this.f123623zoijcleaow = i13 + 2;
        return (short) ((bArr[i14] & 255) | i15);
    }

    public long cllcsxoeiz() {
        long j13 = 0;
        for (int i13 = 0; i13 < 9; i13++) {
            if (this.f123623zoijcleaow == this.f123622ppxfxbqfkf) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jWwaezpbzkn = wwaezpbzkn();
            j13 |= (127 & jWwaezpbzkn) << (i13 * 7);
            if ((jWwaezpbzkn & 128) == 0) {
                break;
            }
        }
        return j13;
    }

    public long cqumvgiudr() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        long j13 = ((long) bArr[i13]) & 255;
        int i15 = i13 + 2;
        this.f123623zoijcleaow = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 8);
        int i16 = i13 + 3;
        this.f123623zoijcleaow = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        this.f123623zoijcleaow = i13 + 4;
        return ((((long) bArr[i16]) & 255) << 24) | j15;
    }

    public void crxdokpmqz(int i13) {
        sopmlzcsov(this.f123623zoijcleaow + i13);
    }

    public void draadjrbmk(byte[] bArr, int i13, int i14) {
        System.arraycopy(this.f123621iobyxmoadg, this.f123623zoijcleaow, bArr, i13, i14);
        this.f123623zoijcleaow += i14;
    }

    public long dsvhmnatus() {
        long jPmvmpeiblj = pmvmpeiblj();
        if (jPmvmpeiblj >= 0) {
            return jPmvmpeiblj;
        }
        throw new IllegalStateException("Top bit not zero: " + jPmvmpeiblj);
    }

    public byte[] eablkybsjg() {
        return this.f123621iobyxmoadg;
    }

    public int esjtqupxsv() {
        int iYggfygwlhe = yggfygwlhe();
        if (iYggfygwlhe >= 0) {
            return iYggfygwlhe;
        }
        throw new IllegalStateException("Top bit not zero: " + iYggfygwlhe);
    }

    public void gtknphoqwx(cdpycssgdh cdpycssgdhVar, int i13) {
        draadjrbmk(cdpycssgdhVar.f123526iobyxmoadg, 0, i13);
        cdpycssgdhVar.rgvfuqvkyq(0);
    }

    public int gxszxtbevo() {
        return this.f123623zoijcleaow;
    }

    public int hcddaimhww() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        int i15 = (bArr[i13] & 255) << 16;
        int i16 = i13 + 2;
        this.f123623zoijcleaow = i16;
        int i17 = ((bArr[i14] & 255) << 8) | i15;
        this.f123623zoijcleaow = i13 + 3;
        return (bArr[i16] & 255) | i17;
    }

    public int hkdspvbjdz() {
        return com.google.common.primitives.gxszxtbevo.wkgbmnqykc(cllcsxoeiz());
    }

    public int iobyxmoadg() {
        return this.f123622ppxfxbqfkf - this.f123623zoijcleaow;
    }

    public String iozdgvuglv(int i13, Charset charset) {
        String str = new String(this.f123621iobyxmoadg, this.f123623zoijcleaow, i13, charset);
        this.f123623zoijcleaow += i13;
        return str;
    }

    public String istkbnxepw(int i13) {
        if (i13 == 0) {
            return "";
        }
        int i14 = this.f123623zoijcleaow;
        int i15 = (i14 + i13) - 1;
        String strWwaezpbzkn = stevsuqkhv.wwaezpbzkn(this.f123621iobyxmoadg, i14, (i15 >= this.f123622ppxfxbqfkf || this.f123621iobyxmoadg[i15] != 0) ? i13 : i13 - 1);
        this.f123623zoijcleaow += i13;
        return strWwaezpbzkn;
    }

    public short iwizpuwonk() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        int i15 = bArr[i13] & 255;
        this.f123623zoijcleaow = i13 + 2;
        return (short) (((bArr[i14] & 255) << 8) | i15);
    }

    public int jpowsppfya() {
        int iVdvldrhtss = vdvldrhtss();
        if (iVdvldrhtss >= 0) {
            return iVdvldrhtss;
        }
        throw new IllegalStateException("Top bit not zero: " + iVdvldrhtss);
    }

    public long jyumaefscl() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        long j13 = ((long) bArr[i13]) & 255;
        int i15 = i13 + 2;
        this.f123623zoijcleaow = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 8);
        int i16 = i13 + 3;
        this.f123623zoijcleaow = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i13 + 4;
        this.f123623zoijcleaow = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 24);
        int i18 = i13 + 5;
        this.f123623zoijcleaow = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 32);
        int i19 = i13 + 6;
        this.f123623zoijcleaow = i19;
        long j18 = j17 | ((((long) bArr[i18]) & 255) << 40);
        int i23 = i13 + 7;
        this.f123623zoijcleaow = i23;
        long j19 = j18 | ((((long) bArr[i19]) & 255) << 48);
        this.f123623zoijcleaow = i13 + 8;
        return ((((long) bArr[i23]) & 255) << 56) | j19;
    }

    public String kcexrzcfyt() {
        return zdlpuopuiu(StandardCharsets.UTF_8);
    }

    public Charset kegysxyocb() {
        if (iobyxmoadg() >= 3) {
            byte[] bArr = this.f123621iobyxmoadg;
            int i13 = this.f123623zoijcleaow;
            if (bArr[i13] == -17 && bArr[i13 + 1] == -69 && bArr[i13 + 2] == -65) {
                this.f123623zoijcleaow = i13 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (iobyxmoadg() < 2) {
            return null;
        }
        byte[] bArr2 = this.f123621iobyxmoadg;
        int i14 = this.f123623zoijcleaow;
        byte b13 = bArr2[i14];
        if (b13 == -2 && bArr2[i14 + 1] == -1) {
            this.f123623zoijcleaow = i14 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b13 != -1 || bArr2[i14 + 1] != -2) {
            return null;
        }
        this.f123623zoijcleaow = i14 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public int lereixgezr() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        int i15 = bArr[i13] & 255;
        this.f123623zoijcleaow = i13 + 2;
        return ((bArr[i14] & 255) << 8) | i15;
    }

    public int lmojexxdyd() {
        return (wwaezpbzkn() << 21) | (wwaezpbzkn() << 14) | (wwaezpbzkn() << 7) | wwaezpbzkn();
    }

    public int lqeggnwhkg() {
        return this.f123622ppxfxbqfkf;
    }

    public void mbcevpiqjq(byte[] bArr) {
        ntlheqmsrt(bArr, bArr.length);
    }

    public void ntlheqmsrt(byte[] bArr, int i13) {
        this.f123621iobyxmoadg = bArr;
        this.f123622ppxfxbqfkf = i13;
        this.f123623zoijcleaow = 0;
    }

    public char nufgyqmvbu(Charset charset) {
        iobyxmoadg.zoijcleaow(f123619gxszxtbevo.contains(charset), "Unsupported charset: " + charset);
        return (char) (dxjokdxxww(charset) >> 16);
    }

    public double ojitshcjhn() {
        return Double.longBitsToDouble(pmvmpeiblj());
    }

    public int oxmwwwfdhm() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        int i15 = ((bArr[i13] & 255) << 24) >> 8;
        int i16 = i13 + 2;
        this.f123623zoijcleaow = i16;
        int i17 = ((bArr[i14] & 255) << 8) | i15;
        this.f123623zoijcleaow = i13 + 3;
        return (bArr[i16] & 255) | i17;
    }

    public long pkzmftpjix() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        long j13 = (((long) bArr[i13]) & 255) << 24;
        int i15 = i13 + 2;
        this.f123623zoijcleaow = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 16);
        int i16 = i13 + 3;
        this.f123623zoijcleaow = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 8);
        this.f123623zoijcleaow = i13 + 4;
        return (((long) bArr[i16]) & 255) | j15;
    }

    public long pmvmpeiblj() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        long j13 = (((long) bArr[i13]) & 255) << 56;
        int i15 = i13 + 2;
        this.f123623zoijcleaow = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 48);
        int i16 = i13 + 3;
        this.f123623zoijcleaow = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i13 + 4;
        this.f123623zoijcleaow = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 32);
        int i18 = i13 + 5;
        this.f123623zoijcleaow = i18;
        long j17 = j16 | ((((long) bArr[i17]) & 255) << 24);
        int i19 = i13 + 6;
        this.f123623zoijcleaow = i19;
        long j18 = j17 | ((((long) bArr[i18]) & 255) << 16);
        int i23 = i13 + 7;
        this.f123623zoijcleaow = i23;
        long j19 = j18 | ((((long) bArr[i19]) & 255) << 8);
        this.f123623zoijcleaow = i13 + 8;
        return (((long) bArr[i23]) & 255) | j19;
    }

    public void ppxfxbqfkf(int i13) {
        if (i13 > zoijcleaow()) {
            this.f123621iobyxmoadg = Arrays.copyOf(this.f123621iobyxmoadg, i13);
        }
    }

    public float rgvfuqvkyq() {
        return Float.intBitsToFloat(vdvldrhtss());
    }

    public void sopmlzcsov(int i13) {
        iobyxmoadg.iobyxmoadg(i13 >= 0 && i13 <= this.f123622ppxfxbqfkf);
        this.f123623zoijcleaow = i13;
    }

    public long stevsuqkhv() {
        int i13;
        int i14;
        long j13 = this.f123621iobyxmoadg[this.f123623zoijcleaow];
        int i15 = 7;
        while (true) {
            if (i15 >= 0) {
                int i16 = 1 << i15;
                if ((((long) i16) & j13) == 0) {
                    if (i15 < 6) {
                        j13 &= (long) (i16 - 1);
                        i14 = 7 - i15;
                        break;
                    }
                    if (i15 == 7) {
                        i14 = 1;
                        break;
                    }
                } else {
                    i15--;
                }
            }
            i14 = 0;
            break;
        }
        if (i14 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j13);
        }
        for (i13 = 1; i13 < i14; i13++) {
            byte b13 = this.f123621iobyxmoadg[this.f123623zoijcleaow + i13];
            if ((b13 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j13);
            }
            j13 = (j13 << 6) | ((long) (b13 & 63));
        }
        this.f123623zoijcleaow += i14;
        return j13;
    }

    public void tzroggbefp(int i13) {
        ntlheqmsrt(zoijcleaow() < i13 ? new byte[i13] : this.f123621iobyxmoadg, i13);
    }

    public void ulzqkzuiru(int i13) {
        iobyxmoadg.iobyxmoadg(i13 >= 0 && i13 <= this.f123621iobyxmoadg.length);
        this.f123622ppxfxbqfkf = i13;
    }

    public int vdvldrhtss() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        int i15 = (bArr[i13] & 255) << 24;
        int i16 = i13 + 2;
        this.f123623zoijcleaow = i16;
        int i17 = ((bArr[i14] & 255) << 16) | i15;
        int i18 = i13 + 3;
        this.f123623zoijcleaow = i18;
        int i19 = i17 | ((bArr[i16] & 255) << 8);
        this.f123623zoijcleaow = i13 + 4;
        return (bArr[i18] & 255) | i19;
    }

    public int wwaezpbzkn() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        this.f123623zoijcleaow = i13 + 1;
        return bArr[i13] & 255;
    }

    public int wypolnanlu() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        int i15 = (bArr[i13] & 255) << 8;
        this.f123623zoijcleaow = i13 + 2;
        return (bArr[i14] & 255) | i15;
    }

    public String yadqdtsiqt(int i13) {
        return iozdgvuglv(i13, StandardCharsets.UTF_8);
    }

    public int yggfygwlhe() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        int i15 = bArr[i13] & 255;
        int i16 = i13 + 2;
        this.f123623zoijcleaow = i16;
        int i17 = ((bArr[i14] & 255) << 8) | i15;
        int i18 = i13 + 3;
        this.f123623zoijcleaow = i18;
        int i19 = i17 | ((bArr[i16] & 255) << 16);
        this.f123623zoijcleaow = i13 + 4;
        return ((bArr[i18] & 255) << 24) | i19;
    }

    public int ylkuphrtab() {
        byte[] bArr = this.f123621iobyxmoadg;
        int i13 = this.f123623zoijcleaow;
        int i14 = i13 + 1;
        this.f123623zoijcleaow = i14;
        int i15 = (bArr[i13] & 255) << 8;
        this.f123623zoijcleaow = i13 + 2;
        int i16 = (bArr[i14] & 255) | i15;
        this.f123623zoijcleaow = i13 + 4;
        return i16;
    }

    public String zdlpuopuiu(Charset charset) {
        iobyxmoadg.zoijcleaow(f123619gxszxtbevo.contains(charset), "Unsupported charset: " + charset);
        if (iobyxmoadg() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            kegysxyocb();
        }
        String strIozdgvuglv = iozdgvuglv(wkgbmnqykc(charset) - this.f123623zoijcleaow, charset);
        if (this.f123623zoijcleaow == this.f123622ppxfxbqfkf) {
            return strIozdgvuglv;
        }
        jlmebxxoox(charset);
        return strIozdgvuglv;
    }

    public int zoijcleaow() {
        return this.f123621iobyxmoadg.length;
    }

    public String zynmafqrjb() {
        return agtfadlqog((char) 0);
    }

    public yadqdtsiqt(int i13) {
        this.f123621iobyxmoadg = new byte[i13];
        this.f123622ppxfxbqfkf = i13;
    }

    public yadqdtsiqt(byte[] bArr) {
        this.f123621iobyxmoadg = bArr;
        this.f123622ppxfxbqfkf = bArr.length;
    }

    public yadqdtsiqt(byte[] bArr, int i13) {
        this.f123621iobyxmoadg = bArr;
        this.f123622ppxfxbqfkf = i13;
    }
}
