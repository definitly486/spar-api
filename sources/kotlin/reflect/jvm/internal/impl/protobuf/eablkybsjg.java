package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f60055gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final InputStream f60056gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f60058lqeggnwhkg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f60062wkgbmnqykc;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f60059nufgyqmvbu = false;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f60051btonecajqb = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f60052draadjrbmk = 64;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f60061wflxmlrfwp = 67108864;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f60057iobyxmoadg = new byte[4096];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f60060ppxfxbqfkf = 0;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f60054eablkybsjg = 0;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f60053dxjokdxxww = 0;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f60063zoijcleaow = false;

    private eablkybsjg(InputStream inputStream) {
        this.f60056gxszxtbevo = inputStream;
    }

    private void cllcsxoeiz(int i13) throws InvalidProtocolBufferException {
        if (!tzroggbefp(i13)) {
            throw InvalidProtocolBufferException.vdvldrhtss();
        }
    }

    private void hkdspvbjdz() {
        int i13 = this.f60060ppxfxbqfkf + this.f60062wkgbmnqykc;
        this.f60060ppxfxbqfkf = i13;
        int i14 = this.f60053dxjokdxxww + i13;
        int i15 = this.f60051btonecajqb;
        if (i14 <= i15) {
            this.f60062wkgbmnqykc = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f60062wkgbmnqykc = i16;
        this.f60060ppxfxbqfkf = i13 - i16;
    }

    private byte[] iwizpuwonk(int i13) throws InvalidProtocolBufferException {
        if (i13 <= 0) {
            if (i13 == 0) {
                return dxjokdxxww.f60049iobyxmoadg;
            }
            throw InvalidProtocolBufferException.draadjrbmk();
        }
        int i14 = this.f60053dxjokdxxww;
        int i15 = this.f60054eablkybsjg;
        int i16 = i14 + i15 + i13;
        int i17 = this.f60051btonecajqb;
        if (i16 > i17) {
            stevsuqkhv((i17 - i14) - i15);
            throw InvalidProtocolBufferException.vdvldrhtss();
        }
        if (i13 < 4096) {
            byte[] bArr = new byte[i13];
            int i18 = this.f60060ppxfxbqfkf - i15;
            System.arraycopy(this.f60057iobyxmoadg, i15, bArr, 0, i18);
            this.f60054eablkybsjg = this.f60060ppxfxbqfkf;
            int i19 = i13 - i18;
            wkgbmnqykc(i19);
            System.arraycopy(this.f60057iobyxmoadg, 0, bArr, i18, i19);
            this.f60054eablkybsjg = i19;
            return bArr;
        }
        int i23 = this.f60060ppxfxbqfkf;
        this.f60053dxjokdxxww = i14 + i23;
        this.f60054eablkybsjg = 0;
        this.f60060ppxfxbqfkf = 0;
        int length = i23 - i15;
        int i24 = i13 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i24 > 0) {
            int iMin = Math.min(i24, 4096);
            byte[] bArr2 = new byte[iMin];
            int i25 = 0;
            while (i25 < iMin) {
                InputStream inputStream = this.f60056gxszxtbevo;
                int i26 = inputStream == null ? -1 : inputStream.read(bArr2, i25, iMin - i25);
                if (i26 == -1) {
                    throw InvalidProtocolBufferException.vdvldrhtss();
                }
                this.f60053dxjokdxxww += i26;
                i25 += i26;
            }
            i24 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i13];
        System.arraycopy(this.f60057iobyxmoadg, i15, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    private void kegysxyocb(int i13) throws InvalidProtocolBufferException {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.draadjrbmk();
        }
        int i14 = this.f60053dxjokdxxww;
        int i15 = this.f60054eablkybsjg;
        int i16 = i14 + i15 + i13;
        int i17 = this.f60051btonecajqb;
        if (i16 > i17) {
            stevsuqkhv((i17 - i14) - i15);
            throw InvalidProtocolBufferException.vdvldrhtss();
        }
        int i18 = this.f60060ppxfxbqfkf;
        int i19 = i18 - i15;
        this.f60054eablkybsjg = i18;
        cllcsxoeiz(1);
        while (true) {
            int i23 = i13 - i19;
            int i24 = this.f60060ppxfxbqfkf;
            if (i23 <= i24) {
                this.f60054eablkybsjg = i23;
                return;
            } else {
                i19 += i24;
                this.f60054eablkybsjg = i24;
                cllcsxoeiz(1);
            }
        }
    }

    public static eablkybsjg lqeggnwhkg(InputStream inputStream) {
        return new eablkybsjg(inputStream);
    }

    public static int pmvmpeiblj(int i13, InputStream inputStream) throws IOException {
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
            return i13;
        }
        int i14 = i13 & 127;
        int i15 = 7;
        while (i15 < 32) {
            int i16 = inputStream.read();
            if (i16 == -1) {
                throw InvalidProtocolBufferException.vdvldrhtss();
            }
            i14 |= (i16 & 127) << i15;
            if ((i16 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                return i14;
            }
            i15 += 7;
        }
        while (i15 < 64) {
            int i17 = inputStream.read();
            if (i17 == -1) {
                throw InvalidProtocolBufferException.vdvldrhtss();
            }
            if ((i17 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                return i14;
            }
            i15 += 7;
        }
        throw InvalidProtocolBufferException.btonecajqb();
    }

    public static long ppxfxbqfkf(long j13) {
        return (-(j13 & 1)) ^ (j13 >>> 1);
    }

    private boolean tzroggbefp(int i13) throws IOException {
        int i14 = this.f60054eablkybsjg;
        int i15 = i14 + i13;
        int i16 = this.f60060ppxfxbqfkf;
        if (i15 <= i16) {
            StringBuilder sb3 = new StringBuilder(77);
            sb3.append("refillBuffer() called when ");
            sb3.append(i13);
            sb3.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb3.toString());
        }
        if (this.f60053dxjokdxxww + i14 + i13 <= this.f60051btonecajqb && this.f60056gxszxtbevo != null) {
            if (i14 > 0) {
                if (i16 > i14) {
                    byte[] bArr = this.f60057iobyxmoadg;
                    System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
                }
                this.f60053dxjokdxxww += i14;
                this.f60060ppxfxbqfkf -= i14;
                this.f60054eablkybsjg = 0;
            }
            InputStream inputStream = this.f60056gxszxtbevo;
            byte[] bArr2 = this.f60057iobyxmoadg;
            int i17 = this.f60060ppxfxbqfkf;
            int i18 = inputStream.read(bArr2, i17, bArr2.length - i17);
            if (i18 == 0 || i18 < -1 || i18 > this.f60057iobyxmoadg.length) {
                StringBuilder sb4 = new StringBuilder(102);
                sb4.append("InputStream#read(byte[]) returned invalid result: ");
                sb4.append(i18);
                sb4.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb4.toString());
            }
            if (i18 > 0) {
                this.f60060ppxfxbqfkf += i18;
                if ((this.f60053dxjokdxxww + i13) - this.f60061wflxmlrfwp > 0) {
                    throw InvalidProtocolBufferException.rgvfuqvkyq();
                }
                hkdspvbjdz();
                if (this.f60060ppxfxbqfkf >= i13) {
                    return true;
                }
                return tzroggbefp(i13);
            }
        }
        return false;
    }

    private void wkgbmnqykc(int i13) throws InvalidProtocolBufferException {
        if (this.f60060ppxfxbqfkf - this.f60054eablkybsjg < i13) {
            cllcsxoeiz(i13);
        }
    }

    public static int zoijcleaow(int i13) {
        return (-(i13 & 1)) ^ (i13 >>> 1);
    }

    public int agtfadlqog() {
        return cqumvgiudr();
    }

    public boolean btonecajqb() {
        return zynmafqrjb() != 0;
    }

    public int cdpycssgdh() {
        return cqumvgiudr();
    }

    public int cqumvgiudr() throws InvalidProtocolBufferException {
        int i13 = this.f60054eablkybsjg;
        if (this.f60060ppxfxbqfkf - i13 < 4) {
            cllcsxoeiz(4);
            i13 = this.f60054eablkybsjg;
        }
        byte[] bArr = this.f60057iobyxmoadg;
        this.f60054eablkybsjg = i13 + 4;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public double draadjrbmk() {
        return Double.longBitsToDouble(esjtqupxsv());
    }

    public boolean dsvhmnatus(int i13, CodedOutputStream codedOutputStream) throws IOException {
        int iZoijcleaow = jyumaefscl.zoijcleaow(i13);
        if (iZoijcleaow == 0) {
            long jKcexrzcfyt = kcexrzcfyt();
            codedOutputStream.zfvoamnweg(i13);
            codedOutputStream.uawqvzlxes(jKcexrzcfyt);
            return true;
        }
        if (iZoijcleaow == 1) {
            long jEsjtqupxsv = esjtqupxsv();
            codedOutputStream.zfvoamnweg(i13);
            codedOutputStream.ntlheqmsrt(jEsjtqupxsv);
            return true;
        }
        if (iZoijcleaow == 2) {
            wkgbmnqykc wkgbmnqykcVarGtknphoqwx = gtknphoqwx();
            codedOutputStream.zfvoamnweg(i13);
            codedOutputStream.dsvhmnatus(wkgbmnqykcVarGtknphoqwx);
            return true;
        }
        if (iZoijcleaow == 3) {
            codedOutputStream.zfvoamnweg(i13);
            wypolnanlu(codedOutputStream);
            int iPpxfxbqfkf = jyumaefscl.ppxfxbqfkf(jyumaefscl.iobyxmoadg(i13), 4);
            iobyxmoadg(iPpxfxbqfkf);
            codedOutputStream.zfvoamnweg(iPpxfxbqfkf);
            return true;
        }
        if (iZoijcleaow == 4) {
            return false;
        }
        if (iZoijcleaow != 5) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int iCqumvgiudr = cqumvgiudr();
        codedOutputStream.zfvoamnweg(i13);
        codedOutputStream.mbcevpiqjq(iCqumvgiudr);
        return true;
    }

    public int dxjokdxxww(int i13) throws InvalidProtocolBufferException {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.draadjrbmk();
        }
        int i14 = i13 + this.f60053dxjokdxxww + this.f60054eablkybsjg;
        int i15 = this.f60051btonecajqb;
        if (i14 > i15) {
            throw InvalidProtocolBufferException.vdvldrhtss();
        }
        this.f60051btonecajqb = i14;
        hkdspvbjdz();
        return i15;
    }

    public int eablkybsjg() {
        int i13 = this.f60051btonecajqb;
        if (i13 == Integer.MAX_VALUE) {
            return -1;
        }
        return i13 - (this.f60053dxjokdxxww + this.f60054eablkybsjg);
    }

    public long esjtqupxsv() throws InvalidProtocolBufferException {
        int i13 = this.f60054eablkybsjg;
        if (this.f60060ppxfxbqfkf - i13 < 8) {
            cllcsxoeiz(8);
            i13 = this.f60054eablkybsjg;
        }
        byte[] bArr = this.f60057iobyxmoadg;
        this.f60054eablkybsjg = i13 + 8;
        return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
    }

    public wkgbmnqykc gtknphoqwx() {
        int iLereixgezr = lereixgezr();
        int i13 = this.f60060ppxfxbqfkf;
        int i14 = this.f60054eablkybsjg;
        if (iLereixgezr > i13 - i14 || iLereixgezr <= 0) {
            return iLereixgezr == 0 ? wkgbmnqykc.f60173zdlpuopuiu : new wflxmlrfwp(iwizpuwonk(iLereixgezr));
        }
        wkgbmnqykc ppxfxbqfkfVar = (this.f60063zoijcleaow && this.f60059nufgyqmvbu) ? new ppxfxbqfkf(this.f60057iobyxmoadg, this.f60054eablkybsjg, iLereixgezr) : wkgbmnqykc.eablkybsjg(this.f60057iobyxmoadg, i14, iLereixgezr);
        this.f60054eablkybsjg += iLereixgezr;
        return ppxfxbqfkfVar;
    }

    public boolean gxszxtbevo() {
        return this.f60054eablkybsjg == this.f60060ppxfxbqfkf && !tzroggbefp(1);
    }

    public int hcddaimhww() {
        return lereixgezr();
    }

    public void iobyxmoadg(int i13) throws InvalidProtocolBufferException {
        if (this.f60058lqeggnwhkg != i13) {
            throw InvalidProtocolBufferException.wkgbmnqykc();
        }
    }

    public int iozdgvuglv() {
        return zoijcleaow(lereixgezr());
    }

    long istkbnxepw() throws InvalidProtocolBufferException {
        long j13 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            byte bJyumaefscl = jyumaefscl();
            j13 |= ((long) (bJyumaefscl & 127)) << i13;
            if ((bJyumaefscl & 128) == 0) {
                return j13;
            }
        }
        throw InvalidProtocolBufferException.btonecajqb();
    }

    public long jpowsppfya() {
        return zynmafqrjb();
    }

    public byte jyumaefscl() throws InvalidProtocolBufferException {
        if (this.f60054eablkybsjg == this.f60060ppxfxbqfkf) {
            cllcsxoeiz(1);
        }
        byte[] bArr = this.f60057iobyxmoadg;
        int i13 = this.f60054eablkybsjg;
        this.f60054eablkybsjg = i13 + 1;
        return bArr[i13];
    }

    public long kcexrzcfyt() {
        return zynmafqrjb();
    }

    public int lereixgezr() {
        int i13;
        int i14 = this.f60054eablkybsjg;
        int i15 = this.f60060ppxfxbqfkf;
        if (i15 != i14) {
            byte[] bArr = this.f60057iobyxmoadg;
            int i16 = i14 + 1;
            byte b13 = bArr[i14];
            if (b13 >= 0) {
                this.f60054eablkybsjg = i16;
                return b13;
            }
            if (i15 - i16 >= 9) {
                int i17 = i14 + 2;
                int i18 = (bArr[i16] << 7) ^ b13;
                long j13 = i18;
                if (j13 < 0) {
                    i13 = (int) ((-128) ^ j13);
                } else {
                    int i19 = i14 + 3;
                    int i23 = (bArr[i17] << 14) ^ i18;
                    long j14 = i23;
                    if (j14 >= 0) {
                        i13 = (int) (16256 ^ j14);
                    } else {
                        int i24 = i14 + 4;
                        int i25 = i23 ^ (bArr[i19] << 21);
                        long j15 = i25;
                        if (j15 < 0) {
                            i13 = (int) ((-2080896) ^ j15);
                        } else {
                            i19 = i14 + 5;
                            byte b14 = bArr[i24];
                            int i26 = (int) (((long) (i25 ^ (b14 << 28))) ^ 266354560);
                            if (b14 < 0) {
                                i24 = i14 + 6;
                                if (bArr[i19] < 0) {
                                    i19 = i14 + 7;
                                    if (bArr[i24] < 0) {
                                        i24 = i14 + 8;
                                        if (bArr[i19] < 0) {
                                            i19 = i14 + 9;
                                            if (bArr[i24] < 0) {
                                                int i27 = i14 + 10;
                                                if (bArr[i19] >= 0) {
                                                    i17 = i27;
                                                    i13 = i26;
                                                }
                                            }
                                        }
                                    }
                                }
                                i13 = i26;
                            }
                            i13 = i26;
                        }
                        i17 = i24;
                    }
                    i17 = i19;
                }
                this.f60054eablkybsjg = i17;
                return i13;
            }
        }
        return (int) istkbnxepw();
    }

    public long lmojexxdyd() {
        return ppxfxbqfkf(zynmafqrjb());
    }

    public void nufgyqmvbu(int i13) {
        this.f60051btonecajqb = i13;
        hkdspvbjdz();
    }

    public long ojitshcjhn() {
        return esjtqupxsv();
    }

    public int oxmwwwfdhm() {
        return lereixgezr();
    }

    public int pkzmftpjix() throws InvalidProtocolBufferException {
        if (gxszxtbevo()) {
            this.f60058lqeggnwhkg = 0;
            return 0;
        }
        int iLereixgezr = lereixgezr();
        this.f60058lqeggnwhkg = iLereixgezr;
        if (jyumaefscl.iobyxmoadg(iLereixgezr) != 0) {
            return this.f60058lqeggnwhkg;
        }
        throw InvalidProtocolBufferException.lqeggnwhkg();
    }

    public float rgvfuqvkyq() {
        return Float.intBitsToFloat(cqumvgiudr());
    }

    public void stevsuqkhv(int i13) throws InvalidProtocolBufferException {
        int i14 = this.f60060ppxfxbqfkf;
        int i15 = this.f60054eablkybsjg;
        if (i13 > i14 - i15 || i13 < 0) {
            kegysxyocb(i13);
        } else {
            this.f60054eablkybsjg = i15 + i13;
        }
    }

    public void vdvldrhtss(int i13, agtfadlqog.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) throws InvalidProtocolBufferException {
        int i14 = this.f60055gtknphoqwx;
        if (i14 >= this.f60052draadjrbmk) {
            throw InvalidProtocolBufferException.agtfadlqog();
        }
        this.f60055gtknphoqwx = i14 + 1;
        iobyxmoadgVar.kegysxyocb(this, gxszxtbevoVar);
        iobyxmoadg(jyumaefscl.ppxfxbqfkf(i13, 4));
        this.f60055gtknphoqwx--;
    }

    public int wflxmlrfwp() {
        return lereixgezr();
    }

    public String wwaezpbzkn() {
        int iLereixgezr = lereixgezr();
        int i13 = this.f60060ppxfxbqfkf;
        int i14 = this.f60054eablkybsjg;
        if (iLereixgezr > i13 - i14 || iLereixgezr <= 0) {
            return iLereixgezr == 0 ? "" : new String(iwizpuwonk(iLereixgezr), "UTF-8");
        }
        String str = new String(this.f60057iobyxmoadg, i14, iLereixgezr, "UTF-8");
        this.f60054eablkybsjg += iLereixgezr;
        return str;
    }

    public void wypolnanlu(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        int iPkzmftpjix;
        do {
            iPkzmftpjix = pkzmftpjix();
            if (iPkzmftpjix == 0) {
                return;
            }
        } while (dsvhmnatus(iPkzmftpjix, codedOutputStream));
    }

    public long yadqdtsiqt() {
        return esjtqupxsv();
    }

    public void yggfygwlhe(agtfadlqog.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) throws InvalidProtocolBufferException {
        int iLereixgezr = lereixgezr();
        if (this.f60055gtknphoqwx >= this.f60052draadjrbmk) {
            throw InvalidProtocolBufferException.agtfadlqog();
        }
        int iDxjokdxxww = dxjokdxxww(iLereixgezr);
        this.f60055gtknphoqwx++;
        iobyxmoadgVar.kegysxyocb(this, gxszxtbevoVar);
        iobyxmoadg(0);
        this.f60055gtknphoqwx--;
        nufgyqmvbu(iDxjokdxxww);
    }

    public String ylkuphrtab() throws InvalidProtocolBufferException {
        byte[] bArrIwizpuwonk;
        int iLereixgezr = lereixgezr();
        int i13 = this.f60054eablkybsjg;
        if (iLereixgezr <= this.f60060ppxfxbqfkf - i13 && iLereixgezr > 0) {
            bArrIwizpuwonk = this.f60057iobyxmoadg;
            this.f60054eablkybsjg = i13 + iLereixgezr;
        } else {
            if (iLereixgezr == 0) {
                return "";
            }
            bArrIwizpuwonk = iwizpuwonk(iLereixgezr);
            i13 = 0;
        }
        if (yggfygwlhe.gxszxtbevo(bArrIwizpuwonk, i13, i13 + iLereixgezr)) {
            return new String(bArrIwizpuwonk, i13, iLereixgezr, "UTF-8");
        }
        throw InvalidProtocolBufferException.nufgyqmvbu();
    }

    public agtfadlqog zdlpuopuiu(rgvfuqvkyq rgvfuqvkyqVar, gxszxtbevo gxszxtbevoVar) throws InvalidProtocolBufferException {
        int iLereixgezr = lereixgezr();
        if (this.f60055gtknphoqwx >= this.f60052draadjrbmk) {
            throw InvalidProtocolBufferException.agtfadlqog();
        }
        int iDxjokdxxww = dxjokdxxww(iLereixgezr);
        this.f60055gtknphoqwx++;
        agtfadlqog agtfadlqogVar = (agtfadlqog) rgvfuqvkyqVar.zoijcleaow(this, gxszxtbevoVar);
        iobyxmoadg(0);
        this.f60055gtknphoqwx--;
        nufgyqmvbu(iDxjokdxxww);
        return agtfadlqogVar;
    }

    public long zynmafqrjb() {
        long j13;
        long j14;
        long j15;
        int i13 = this.f60054eablkybsjg;
        int i14 = this.f60060ppxfxbqfkf;
        if (i14 != i13) {
            byte[] bArr = this.f60057iobyxmoadg;
            int i15 = i13 + 1;
            byte b13 = bArr[i13];
            if (b13 >= 0) {
                this.f60054eablkybsjg = i15;
                return b13;
            }
            if (i14 - i15 >= 9) {
                int i16 = i13 + 2;
                long j16 = (bArr[i15] << 7) ^ b13;
                if (j16 >= 0) {
                    int i17 = i13 + 3;
                    long j17 = j16 ^ ((long) (bArr[i16] << 14));
                    if (j17 >= 0) {
                        j15 = 16256;
                    } else {
                        i16 = i13 + 4;
                        j16 = j17 ^ ((long) (bArr[i17] << 21));
                        if (j16 < 0) {
                            j14 = -2080896;
                        } else {
                            i17 = i13 + 5;
                            j17 = j16 ^ (((long) bArr[i16]) << 28);
                            if (j17 >= 0) {
                                j15 = 266354560;
                            } else {
                                i16 = i13 + 6;
                                j16 = j17 ^ (((long) bArr[i17]) << 35);
                                if (j16 >= 0) {
                                    i17 = i13 + 7;
                                    j17 = j16 ^ (((long) bArr[i16]) << 42);
                                    if (j17 >= 0) {
                                        j15 = 4363953127296L;
                                    } else {
                                        i16 = i13 + 8;
                                        j16 = j17 ^ (((long) bArr[i17]) << 49);
                                        if (j16 < 0) {
                                            j14 = -558586000294016L;
                                        } else {
                                            i17 = i13 + 9;
                                            long j18 = (j16 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                            if (j18 < 0) {
                                                i16 = i13 + 10;
                                                if (bArr[i17] >= 0) {
                                                    j13 = j18;
                                                }
                                            } else {
                                                j13 = j18;
                                                i16 = i17;
                                            }
                                        }
                                    }
                                    this.f60054eablkybsjg = i16;
                                    return j13;
                                }
                                j14 = -34093383808L;
                            }
                        }
                    }
                    j13 = j17 ^ j15;
                    i16 = i17;
                    this.f60054eablkybsjg = i16;
                    return j13;
                }
                j14 = -128;
                j13 = j16 ^ j14;
                this.f60054eablkybsjg = i16;
                return j13;
            }
        }
        return istkbnxepw();
    }
}
