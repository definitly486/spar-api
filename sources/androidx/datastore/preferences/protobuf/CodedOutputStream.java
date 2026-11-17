package androidx.datastore.preferences.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Logger f8578ppxfxbqfkf = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final boolean f8579wkgbmnqykc = metgxyhuhe.istkbnxepw();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    dxjokdxxww f8580iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f8581zoijcleaow;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    private static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final OutputStream f8582dxjokdxxww;

        ppxfxbqfkf(OutputStream outputStream, int i13) {
            super(i13);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f8582dxjokdxxww = outputStream;
        }

        private void e() throws IOException {
            this.f8582dxjokdxxww.write(this.f8583eablkybsjg, 0, this.f8585lqeggnwhkg);
            this.f8585lqeggnwhkg = 0;
        }

        private void f(int i13) throws IOException {
            if (this.f8584gxszxtbevo - this.f8585lqeggnwhkg < i13) {
                e();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void auzgnhcxok(int i13, wwaezpbzkn wwaezpbzknVar, sopmlzcsov sopmlzcsovVar) throws IOException {
            ixidwrxhsl(i13, 2);
            i(wwaezpbzknVar, sopmlzcsovVar);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void dvvnrvtcbc(int i13, wwaezpbzkn wwaezpbzknVar) throws IOException {
            ixidwrxhsl(1, 3);
            jrbgnlbqoe(2, i13);
            h(3, wwaezpbzknVar);
            ixidwrxhsl(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void ezmngbhpjk(int i13, long j13) throws IOException {
            f(20);
            b(i13, 0);
            d(j13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void fmlbqenlif(int i13) throws IOException {
            f(5);
            c(i13);
        }

        public void g(byte[] bArr, int i13, int i14) throws IOException {
            int i15 = this.f8584gxszxtbevo;
            int i16 = this.f8585lqeggnwhkg;
            if (i15 - i16 >= i14) {
                System.arraycopy(bArr, i13, this.f8583eablkybsjg, i16, i14);
                this.f8585lqeggnwhkg += i14;
                this.f8586nufgyqmvbu += i14;
                return;
            }
            int i17 = i15 - i16;
            System.arraycopy(bArr, i13, this.f8583eablkybsjg, i16, i17);
            int i18 = i13 + i17;
            int i19 = i14 - i17;
            this.f8585lqeggnwhkg = this.f8584gxszxtbevo;
            this.f8586nufgyqmvbu += i17;
            e();
            if (i19 <= this.f8584gxszxtbevo) {
                System.arraycopy(bArr, i18, this.f8583eablkybsjg, 0, i19);
                this.f8585lqeggnwhkg = i19;
            } else {
                this.f8582dxjokdxxww.write(bArr, i18, i19);
            }
            this.f8586nufgyqmvbu += i19;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void grlcpdaxtj(int i13, String str) throws IOException {
            ixidwrxhsl(i13, 2);
            mhtqkkgtqm(str);
        }

        public void h(int i13, wwaezpbzkn wwaezpbzknVar) throws IOException {
            ixidwrxhsl(i13, 2);
            iwxlajgraz(wwaezpbzknVar);
        }

        void i(wwaezpbzkn wwaezpbzknVar, sopmlzcsov sopmlzcsovVar) throws IOException {
            fmlbqenlif(((androidx.datastore.preferences.protobuf.iobyxmoadg) wwaezpbzknVar).wkgbmnqykc(sopmlzcsovVar));
            sopmlzcsovVar.zoijcleaow(wwaezpbzknVar, this.f8580iobyxmoadg);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.eablkybsjg
        public void iobyxmoadg(byte[] bArr, int i13, int i14) throws IOException {
            g(bArr, i13, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void iwxlajgraz(wwaezpbzkn wwaezpbzknVar) throws IOException {
            fmlbqenlif(wwaezpbzknVar.getSerializedSize());
            wwaezpbzknVar.iobyxmoadg(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void ixidwrxhsl(int i13, int i14) throws IOException {
            fmlbqenlif(czzsidtyhn.ppxfxbqfkf(i13, i14));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void jhduphickx(int i13, boolean z13) throws IOException {
            f(11);
            b(i13, 0);
            yzdjzghtvl(z13 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void jrbgnlbqoe(int i13, int i14) throws IOException {
            f(20);
            b(i13, 0);
            c(i14);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void jztzpxfvev(byte[] bArr, int i13, int i14) throws IOException {
            fmlbqenlif(i14);
            g(bArr, i13, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void metgxyhuhe(gxszxtbevo gxszxtbevoVar) throws IOException {
            fmlbqenlif(gxszxtbevoVar.size());
            gxszxtbevoVar.wwaezpbzkn(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void mhtqkkgtqm(String str) throws IOException {
            int iLqeggnwhkg;
            try {
                int length = str.length() * 3;
                int iKegysxyocb = CodedOutputStream.kegysxyocb(length);
                int i13 = iKegysxyocb + length;
                int i14 = this.f8584gxszxtbevo;
                if (i13 > i14) {
                    byte[] bArr = new byte[length];
                    int iGxszxtbevo = rlfsiqarku.gxszxtbevo(str, bArr, 0, length);
                    fmlbqenlif(iGxszxtbevo);
                    iobyxmoadg(bArr, 0, iGxszxtbevo);
                    return;
                }
                if (i13 > i14 - this.f8585lqeggnwhkg) {
                    e();
                }
                int iKegysxyocb2 = CodedOutputStream.kegysxyocb(str.length());
                int i15 = this.f8585lqeggnwhkg;
                try {
                    if (iKegysxyocb2 == iKegysxyocb) {
                        int i16 = i15 + iKegysxyocb2;
                        this.f8585lqeggnwhkg = i16;
                        int iGxszxtbevo2 = rlfsiqarku.gxszxtbevo(str, this.f8583eablkybsjg, i16, this.f8584gxszxtbevo - i16);
                        this.f8585lqeggnwhkg = i15;
                        iLqeggnwhkg = (iGxszxtbevo2 - i15) - iKegysxyocb2;
                        c(iLqeggnwhkg);
                        this.f8585lqeggnwhkg = iGxszxtbevo2;
                    } else {
                        iLqeggnwhkg = rlfsiqarku.lqeggnwhkg(str);
                        c(iLqeggnwhkg);
                        this.f8585lqeggnwhkg = rlfsiqarku.gxszxtbevo(str, this.f8583eablkybsjg, this.f8585lqeggnwhkg, iLqeggnwhkg);
                    }
                    this.f8586nufgyqmvbu += iLqeggnwhkg;
                } catch (rlfsiqarku.wkgbmnqykc e13) {
                    this.f8586nufgyqmvbu -= this.f8585lqeggnwhkg - i15;
                    this.f8585lqeggnwhkg = i15;
                    throw e13;
                } catch (ArrayIndexOutOfBoundsException e14) {
                    throw new OutOfSpaceException(e14);
                }
            } catch (rlfsiqarku.wkgbmnqykc e15) {
                crxdokpmqz(str, e15);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void nuxfzjnpeb(int i13, int i14) throws IOException {
            f(20);
            b(i13, 0);
            a(i14);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void oipsdeybqn(long j13) throws IOException {
            f(8);
            krqnebusok(j13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void rhgxfdycjh(long j13) throws IOException {
            f(10);
            d(j13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void sflfametgt(int i13) throws IOException {
            f(4);
            eslsurpljm(i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void skhdrjzrfn(int i13, gxszxtbevo gxszxtbevoVar) throws IOException {
            ixidwrxhsl(1, 3);
            jrbgnlbqoe(2, i13);
            xrmfcynszj(3, gxszxtbevoVar);
            ixidwrxhsl(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void sopmlzcsov() throws IOException {
            if (this.f8585lqeggnwhkg > 0) {
                e();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void tbqsvytpvh(int i13) throws IOException {
            if (i13 >= 0) {
                fmlbqenlif(i13);
            } else {
                rhgxfdycjh(i13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void vipkmwdibw(byte b13) throws IOException {
            if (this.f8585lqeggnwhkg == this.f8584gxszxtbevo) {
                e();
            }
            yzdjzghtvl(b13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void xrmfcynszj(int i13, gxszxtbevo gxszxtbevoVar) throws IOException {
            ixidwrxhsl(i13, 2);
            metgxyhuhe(gxszxtbevoVar);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void ydmasvzmpa(int i13, int i14) throws IOException {
            f(14);
            b(i13, 5);
            eslsurpljm(i14);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void zfvoamnweg(int i13, long j13) throws IOException {
            f(18);
            b(i13, 1);
            krqnebusok(j13);
        }
    }

    private static abstract class zoijcleaow extends CodedOutputStream {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final byte[] f8583eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final int f8584gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        int f8585lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        int f8586nufgyqmvbu;

        zoijcleaow(int i13) {
            super();
            if (i13 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i13, 20)];
            this.f8583eablkybsjg = bArr;
            this.f8584gxszxtbevo = bArr.length;
        }

        final void a(int i13) {
            if (i13 >= 0) {
                c(i13);
            } else {
                d(i13);
            }
        }

        final void b(int i13, int i14) {
            c(czzsidtyhn.ppxfxbqfkf(i13, i14));
        }

        final void c(int i13) {
            if (!CodedOutputStream.f8579wkgbmnqykc) {
                while ((i13 & (-128)) != 0) {
                    byte[] bArr = this.f8583eablkybsjg;
                    int i14 = this.f8585lqeggnwhkg;
                    this.f8585lqeggnwhkg = i14 + 1;
                    bArr[i14] = (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.f8586nufgyqmvbu++;
                    i13 >>>= 7;
                }
                byte[] bArr2 = this.f8583eablkybsjg;
                int i15 = this.f8585lqeggnwhkg;
                this.f8585lqeggnwhkg = i15 + 1;
                bArr2[i15] = (byte) i13;
                this.f8586nufgyqmvbu++;
                return;
            }
            long j13 = this.f8585lqeggnwhkg;
            while ((i13 & (-128)) != 0) {
                byte[] bArr3 = this.f8583eablkybsjg;
                int i16 = this.f8585lqeggnwhkg;
                this.f8585lqeggnwhkg = i16 + 1;
                metgxyhuhe.wwaezpbzkn(bArr3, i16, (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                i13 >>>= 7;
            }
            byte[] bArr4 = this.f8583eablkybsjg;
            int i17 = this.f8585lqeggnwhkg;
            this.f8585lqeggnwhkg = i17 + 1;
            metgxyhuhe.wwaezpbzkn(bArr4, i17, (byte) i13);
            this.f8586nufgyqmvbu += (int) (((long) this.f8585lqeggnwhkg) - j13);
        }

        final void d(long j13) {
            if (!CodedOutputStream.f8579wkgbmnqykc) {
                while ((j13 & (-128)) != 0) {
                    byte[] bArr = this.f8583eablkybsjg;
                    int i13 = this.f8585lqeggnwhkg;
                    this.f8585lqeggnwhkg = i13 + 1;
                    bArr[i13] = (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.f8586nufgyqmvbu++;
                    j13 >>>= 7;
                }
                byte[] bArr2 = this.f8583eablkybsjg;
                int i14 = this.f8585lqeggnwhkg;
                this.f8585lqeggnwhkg = i14 + 1;
                bArr2[i14] = (byte) j13;
                this.f8586nufgyqmvbu++;
                return;
            }
            long j14 = this.f8585lqeggnwhkg;
            while ((j13 & (-128)) != 0) {
                byte[] bArr3 = this.f8583eablkybsjg;
                int i15 = this.f8585lqeggnwhkg;
                this.f8585lqeggnwhkg = i15 + 1;
                metgxyhuhe.wwaezpbzkn(bArr3, i15, (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                j13 >>>= 7;
            }
            byte[] bArr4 = this.f8583eablkybsjg;
            int i16 = this.f8585lqeggnwhkg;
            this.f8585lqeggnwhkg = i16 + 1;
            metgxyhuhe.wwaezpbzkn(bArr4, i16, (byte) j13);
            this.f8586nufgyqmvbu += (int) (((long) this.f8585lqeggnwhkg) - j14);
        }

        final void eslsurpljm(int i13) {
            byte[] bArr = this.f8583eablkybsjg;
            int i14 = this.f8585lqeggnwhkg;
            int i15 = i14 + 1;
            this.f8585lqeggnwhkg = i15;
            bArr[i14] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
            int i16 = i14 + 2;
            this.f8585lqeggnwhkg = i16;
            bArr[i15] = (byte) ((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i17 = i14 + 3;
            this.f8585lqeggnwhkg = i17;
            bArr[i16] = (byte) ((i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f8585lqeggnwhkg = i14 + 4;
            bArr[i17] = (byte) ((i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f8586nufgyqmvbu += 4;
        }

        final void krqnebusok(long j13) {
            byte[] bArr = this.f8583eablkybsjg;
            int i13 = this.f8585lqeggnwhkg;
            int i14 = i13 + 1;
            this.f8585lqeggnwhkg = i14;
            bArr[i13] = (byte) (j13 & 255);
            int i15 = i13 + 2;
            this.f8585lqeggnwhkg = i15;
            bArr[i14] = (byte) ((j13 >> 8) & 255);
            int i16 = i13 + 3;
            this.f8585lqeggnwhkg = i16;
            bArr[i15] = (byte) ((j13 >> 16) & 255);
            int i17 = i13 + 4;
            this.f8585lqeggnwhkg = i17;
            bArr[i16] = (byte) (255 & (j13 >> 24));
            int i18 = i13 + 5;
            this.f8585lqeggnwhkg = i18;
            bArr[i17] = (byte) (((int) (j13 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i19 = i13 + 6;
            this.f8585lqeggnwhkg = i19;
            bArr[i18] = (byte) (((int) (j13 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i23 = i13 + 7;
            this.f8585lqeggnwhkg = i23;
            bArr[i19] = (byte) (((int) (j13 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f8585lqeggnwhkg = i13 + 8;
            bArr[i23] = (byte) (((int) (j13 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f8586nufgyqmvbu += 8;
        }

        final void yzdjzghtvl(byte b13) {
            byte[] bArr = this.f8583eablkybsjg;
            int i13 = this.f8585lqeggnwhkg;
            this.f8585lqeggnwhkg = i13 + 1;
            bArr[i13] = b13;
            this.f8586nufgyqmvbu++;
        }
    }

    public static int agtfadlqog(int i13, long j13) {
        return wypolnanlu(i13) + ojitshcjhn(j13);
    }

    public static int btonecajqb(int i13, int i14) {
        return wypolnanlu(i13) + gtknphoqwx(i14);
    }

    public static int cdpycssgdh(int i13, gxszxtbevo gxszxtbevoVar) {
        return (wypolnanlu(1) * 2) + stevsuqkhv(2, i13) + gxszxtbevo(3, gxszxtbevoVar);
    }

    public static int cllcsxoeiz(int i13, String str) {
        return wypolnanlu(i13) + dsvhmnatus(str);
    }

    public static int cqumvgiudr(long j13) {
        return mbcevpiqjq(j13);
    }

    public static int draadjrbmk(int i13, int i14) {
        return wypolnanlu(i13) + wflxmlrfwp(i14);
    }

    public static int dsvhmnatus(String str) {
        int length;
        try {
            length = rlfsiqarku.lqeggnwhkg(str);
        } catch (rlfsiqarku.wkgbmnqykc unused) {
            length = str.getBytes(zdlpuopuiu.f8902iobyxmoadg).length;
        }
        return esjtqupxsv(length);
    }

    public static int dxjokdxxww(double d13) {
        return 8;
    }

    public static int eablkybsjg(byte[] bArr) {
        return esjtqupxsv(bArr.length);
    }

    static int esjtqupxsv(int i13) {
        return kegysxyocb(i13) + i13;
    }

    public static int gtknphoqwx(int i13) {
        return jyumaefscl(i13);
    }

    public static int gxszxtbevo(int i13, gxszxtbevo gxszxtbevoVar) {
        return wypolnanlu(i13) + lqeggnwhkg(gxszxtbevoVar);
    }

    public static int hcddaimhww(int i13) {
        return kegysxyocb(ntlheqmsrt(i13));
    }

    public static int hkdspvbjdz(long j13) {
        return mbcevpiqjq(ulzqkzuiru(j13));
    }

    public static int iozdgvuglv(int i13, int i14) {
        return wypolnanlu(i13) + lmojexxdyd(i14);
    }

    static int istkbnxepw(int i13) {
        if (i13 > 4096) {
            return 4096;
        }
        return i13;
    }

    public static int iwizpuwonk(int i13, long j13) {
        return wypolnanlu(i13) + cqumvgiudr(j13);
    }

    public static int jpowsppfya(int i13, long j13) {
        return wypolnanlu(i13) + hkdspvbjdz(j13);
    }

    public static int jyumaefscl(int i13) {
        if (i13 >= 0) {
            return kegysxyocb(i13);
        }
        return 10;
    }

    public static int kcexrzcfyt(wwaezpbzkn wwaezpbzknVar) {
        return wwaezpbzknVar.getSerializedSize();
    }

    public static int kegysxyocb(int i13) {
        if ((i13 & (-128)) == 0) {
            return 1;
        }
        if ((i13 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i13) == 0) {
            return 3;
        }
        return (i13 & (-268435456)) == 0 ? 4 : 5;
    }

    static int lereixgezr(int i13, wwaezpbzkn wwaezpbzknVar, sopmlzcsov sopmlzcsovVar) {
        return wypolnanlu(i13) + zynmafqrjb(wwaezpbzknVar, sopmlzcsovVar);
    }

    public static int lmojexxdyd(int i13) {
        return 4;
    }

    public static int lqeggnwhkg(gxszxtbevo gxszxtbevoVar) {
        return esjtqupxsv(gxszxtbevoVar.size());
    }

    public static int mbcevpiqjq(long j13) {
        int i13;
        if (((-128) & j13) == 0) {
            return 1;
        }
        if (j13 < 0) {
            return 10;
        }
        if (((-34359738368L) & j13) != 0) {
            j13 >>>= 28;
            i13 = 6;
        } else {
            i13 = 2;
        }
        if (((-2097152) & j13) != 0) {
            i13 += 2;
            j13 >>>= 14;
        }
        return (j13 & (-16384)) != 0 ? i13 + 1 : i13;
    }

    public static int ntlheqmsrt(int i13) {
        return (i13 >> 31) ^ (i13 << 1);
    }

    public static int nufgyqmvbu(int i13, double d13) {
        return wypolnanlu(i13) + dxjokdxxww(d13);
    }

    public static int ojitshcjhn(long j13) {
        return 8;
    }

    static int oxmwwwfdhm(int i13, wwaezpbzkn wwaezpbzknVar, sopmlzcsov sopmlzcsovVar) {
        return (wypolnanlu(i13) * 2) + zdlpuopuiu(wwaezpbzknVar, sopmlzcsovVar);
    }

    public static int pkzmftpjix(int i13, int i14) {
        return wypolnanlu(i13) + hcddaimhww(i14);
    }

    public static int pmvmpeiblj(wwaezpbzkn wwaezpbzknVar) {
        return esjtqupxsv(wwaezpbzknVar.getSerializedSize());
    }

    public static int ppxfxbqfkf(int i13, boolean z13) {
        return wypolnanlu(i13) + wkgbmnqykc(z13);
    }

    public static int rgvfuqvkyq(int i13, float f13) {
        return wypolnanlu(i13) + vdvldrhtss(f13);
    }

    public static CodedOutputStream ribwqtqdhb(OutputStream outputStream, int i13) {
        return new ppxfxbqfkf(outputStream, i13);
    }

    public static int stevsuqkhv(int i13, int i14) {
        return wypolnanlu(i13) + kegysxyocb(i14);
    }

    public static int tzroggbefp(int i13, long j13) {
        return wypolnanlu(i13) + mbcevpiqjq(j13);
    }

    public static long ulzqkzuiru(long j13) {
        return (j13 >> 63) ^ (j13 << 1);
    }

    public static int vdvldrhtss(float f13) {
        return 4;
    }

    public static int wflxmlrfwp(int i13) {
        return 4;
    }

    public static int wkgbmnqykc(boolean z13) {
        return 1;
    }

    public static int wwaezpbzkn(int i13, long j13) {
        return wypolnanlu(i13) + ylkuphrtab(j13);
    }

    public static int wypolnanlu(int i13) {
        return kegysxyocb(czzsidtyhn.ppxfxbqfkf(i13, 0));
    }

    public static int yadqdtsiqt(int i13) {
        return kegysxyocb(i13);
    }

    public static int yggfygwlhe(int i13, int i14) {
        return wypolnanlu(i13) + jyumaefscl(i14);
    }

    public static int ylkuphrtab(long j13) {
        return 8;
    }

    static int zdlpuopuiu(wwaezpbzkn wwaezpbzknVar, sopmlzcsov sopmlzcsovVar) {
        return ((androidx.datastore.preferences.protobuf.iobyxmoadg) wwaezpbzknVar).wkgbmnqykc(sopmlzcsovVar);
    }

    static int zynmafqrjb(wwaezpbzkn wwaezpbzknVar, sopmlzcsov sopmlzcsovVar) {
        return esjtqupxsv(((androidx.datastore.preferences.protobuf.iobyxmoadg) wwaezpbzknVar).wkgbmnqykc(sopmlzcsovVar));
    }

    public final void ageimvtcrz(int i13) {
        fmlbqenlif(ntlheqmsrt(i13));
    }

    abstract void auzgnhcxok(int i13, wwaezpbzkn wwaezpbzknVar, sopmlzcsov sopmlzcsovVar);

    public final void bfopjjpdmp(int i13, float f13) {
        ydmasvzmpa(i13, Float.floatToRawIntBits(f13));
    }

    final void crxdokpmqz(String str, rlfsiqarku.wkgbmnqykc wkgbmnqykcVar) throws OutOfSpaceException {
        f8578ppxfxbqfkf.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) wkgbmnqykcVar);
        byte[] bytes = str.getBytes(zdlpuopuiu.f8902iobyxmoadg);
        try {
            fmlbqenlif(bytes.length);
            iobyxmoadg(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e13) {
            throw e13;
        } catch (IndexOutOfBoundsException e14) {
            throw new OutOfSpaceException(e14);
        }
    }

    public final void czzsidtyhn(double d13) {
        oipsdeybqn(Double.doubleToRawLongBits(d13));
    }

    public abstract void dvvnrvtcbc(int i13, wwaezpbzkn wwaezpbzknVar);

    public abstract void ezmngbhpjk(int i13, long j13);

    public final void fiwbwshyhd(int i13, int i14) {
        jrbgnlbqoe(i13, ntlheqmsrt(i14));
    }

    public abstract void fmlbqenlif(int i13);

    public final void fyldjkxazc(int i13, long j13) {
        ezmngbhpjk(i13, ulzqkzuiru(j13));
    }

    public abstract void grlcpdaxtj(int i13, String str);

    public final void hszhottldk(long j13) {
        oipsdeybqn(j13);
    }

    public final void igdgnonuha(int i13, int i14) {
        ydmasvzmpa(i13, i14);
    }

    public final void ikoacuggdj(boolean z13) {
        vipkmwdibw(z13 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.datastore.preferences.protobuf.eablkybsjg
    public abstract void iobyxmoadg(byte[] bArr, int i13, int i14);

    public final void ipoelvxyzq(long j13) {
        rhgxfdycjh(ulzqkzuiru(j13));
    }

    public abstract void iwxlajgraz(wwaezpbzkn wwaezpbzknVar);

    public abstract void ixidwrxhsl(int i13, int i14);

    public final void iyctptxqzt(int i13, wwaezpbzkn wwaezpbzknVar) {
        ixidwrxhsl(i13, 3);
        lrnfpwlwnk(wwaezpbzknVar);
        ixidwrxhsl(i13, 4);
    }

    public abstract void jhduphickx(int i13, boolean z13);

    boolean jlmebxxoox() {
        return this.f8581zoijcleaow;
    }

    public abstract void jrbgnlbqoe(int i13, int i14);

    abstract void jztzpxfvev(byte[] bArr, int i13, int i14);

    public final void lrnfpwlwnk(wwaezpbzkn wwaezpbzknVar) {
        wwaezpbzknVar.iobyxmoadg(this);
    }

    public final void lxfrhoxuzk(int i13) {
        sflfametgt(i13);
    }

    public abstract void metgxyhuhe(gxszxtbevo gxszxtbevoVar);

    public abstract void mhtqkkgtqm(String str);

    public abstract void nuxfzjnpeb(int i13, int i14);

    public abstract void oipsdeybqn(long j13);

    public final void okpsazkaxt(byte[] bArr) {
        jztzpxfvev(bArr, 0, bArr.length);
    }

    public final void opjhrmiecq(float f13) {
        sflfametgt(Float.floatToRawIntBits(f13));
    }

    public abstract void rhgxfdycjh(long j13);

    public final void rlfsiqarku(int i13, double d13) {
        zfvoamnweg(i13, Double.doubleToRawLongBits(d13));
    }

    public final void roivzttewh(int i13, long j13) {
        ezmngbhpjk(i13, j13);
    }

    public abstract void sflfametgt(int i13);

    public abstract void skhdrjzrfn(int i13, gxszxtbevo gxszxtbevoVar);

    public abstract void sopmlzcsov();

    public abstract void tbqsvytpvh(int i13);

    public final void uawqvzlxes(long j13) {
        rhgxfdycjh(j13);
    }

    public final void uwvvkdfqfp(int i13, int i14) {
        nuxfzjnpeb(i13, i14);
    }

    public abstract void vipkmwdibw(byte b13);

    final void weqkydbzbr(int i13, wwaezpbzkn wwaezpbzknVar, sopmlzcsov sopmlzcsovVar) {
        ixidwrxhsl(i13, 3);
        zeieaojujs(wwaezpbzknVar, sopmlzcsovVar);
        ixidwrxhsl(i13, 4);
    }

    public final void wizcaqwiak(int i13, long j13) {
        zfvoamnweg(i13, j13);
    }

    public abstract void xrmfcynszj(int i13, gxszxtbevo gxszxtbevoVar);

    public abstract void ydmasvzmpa(int i13, int i14);

    public final void yfnezrywwk(int i13) {
        tbqsvytpvh(i13);
    }

    final void zeieaojujs(wwaezpbzkn wwaezpbzknVar, sopmlzcsov sopmlzcsovVar) {
        sopmlzcsovVar.zoijcleaow(wwaezpbzknVar, this.f8580iobyxmoadg);
    }

    public abstract void zfvoamnweg(int i13, long j13);

    private CodedOutputStream() {
    }
}
