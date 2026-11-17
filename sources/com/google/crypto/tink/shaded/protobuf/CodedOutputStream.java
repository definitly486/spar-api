package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CodedOutputStream extends lqeggnwhkg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Logger f23876ppxfxbqfkf = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final boolean f23877wkgbmnqykc = yfnezrywwk.yadqdtsiqt();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    gtknphoqwx f23878iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f23879zoijcleaow;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        OutOfSpaceException(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    private static class zoijcleaow extends CodedOutputStream {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final byte[] f23880eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final int f23881gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final int f23882lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f23883nufgyqmvbu;

        zoijcleaow(byte[] bArr, int i13, int i14) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i15 = i13 + i14;
            if ((i13 | i14 | (bArr.length - i15)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i14)));
            }
            this.f23880eablkybsjg = bArr;
            this.f23881gxszxtbevo = i13;
            this.f23883nufgyqmvbu = i13;
            this.f23882lqeggnwhkg = i15;
        }

        public final void ageimvtcrz(byte[] bArr, int i13, int i14) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i13, this.f23880eablkybsjg, this.f23883nufgyqmvbu, i14);
                this.f23883nufgyqmvbu += i14;
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23883nufgyqmvbu), Integer.valueOf(this.f23882lqeggnwhkg), Integer.valueOf(i14)), e13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void crxdokpmqz(byte b13) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f23880eablkybsjg;
                int i13 = this.f23883nufgyqmvbu;
                this.f23883nufgyqmvbu = i13 + 1;
                bArr[i13] = b13;
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23883nufgyqmvbu), Integer.valueOf(this.f23882lqeggnwhkg), 1), e13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void czzsidtyhn(long j13) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f23880eablkybsjg;
                int i13 = this.f23883nufgyqmvbu;
                int i14 = i13 + 1;
                this.f23883nufgyqmvbu = i14;
                bArr[i13] = (byte) (((int) j13) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i15 = i13 + 2;
                this.f23883nufgyqmvbu = i15;
                bArr[i14] = (byte) (((int) (j13 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i16 = i13 + 3;
                this.f23883nufgyqmvbu = i16;
                bArr[i15] = (byte) (((int) (j13 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i17 = i13 + 4;
                this.f23883nufgyqmvbu = i17;
                bArr[i16] = (byte) (((int) (j13 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i18 = i13 + 5;
                this.f23883nufgyqmvbu = i18;
                bArr[i17] = (byte) (((int) (j13 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i19 = i13 + 6;
                this.f23883nufgyqmvbu = i19;
                bArr[i18] = (byte) (((int) (j13 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i23 = i13 + 7;
                this.f23883nufgyqmvbu = i23;
                bArr[i19] = (byte) (((int) (j13 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f23883nufgyqmvbu = i13 + 8;
                bArr[i23] = (byte) (((int) (j13 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23883nufgyqmvbu), Integer.valueOf(this.f23882lqeggnwhkg), 1), e13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void fiwbwshyhd(long j13) throws OutOfSpaceException {
            if (CodedOutputStream.f23877wkgbmnqykc && sopmlzcsov() >= 10) {
                while ((j13 & (-128)) != 0) {
                    byte[] bArr = this.f23880eablkybsjg;
                    int i13 = this.f23883nufgyqmvbu;
                    this.f23883nufgyqmvbu = i13 + 1;
                    yfnezrywwk.hcddaimhww(bArr, i13, (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j13 >>>= 7;
                }
                byte[] bArr2 = this.f23880eablkybsjg;
                int i14 = this.f23883nufgyqmvbu;
                this.f23883nufgyqmvbu = i14 + 1;
                yfnezrywwk.hcddaimhww(bArr2, i14, (byte) j13);
                return;
            }
            while ((j13 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f23880eablkybsjg;
                    int i15 = this.f23883nufgyqmvbu;
                    this.f23883nufgyqmvbu = i15 + 1;
                    bArr3[i15] = (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    j13 >>>= 7;
                } catch (IndexOutOfBoundsException e13) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23883nufgyqmvbu), Integer.valueOf(this.f23882lqeggnwhkg), 1), e13);
                }
            }
            byte[] bArr4 = this.f23880eablkybsjg;
            int i16 = this.f23883nufgyqmvbu;
            this.f23883nufgyqmvbu = i16 + 1;
            bArr4[i16] = (byte) j13;
        }

        public final void fyldjkxazc(nufgyqmvbu nufgyqmvbuVar) throws OutOfSpaceException {
            wizcaqwiak(nufgyqmvbuVar.size());
            nufgyqmvbuVar.hcddaimhww(this);
        }

        public final void grlcpdaxtj(hkdspvbjdz hkdspvbjdzVar) throws OutOfSpaceException {
            wizcaqwiak(hkdspvbjdzVar.getSerializedSize());
            hkdspvbjdzVar.iobyxmoadg(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void hszhottldk(int i13, long j13) throws OutOfSpaceException {
            igdgnonuha(i13, 0);
            fiwbwshyhd(j13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void igdgnonuha(int i13, int i14) throws OutOfSpaceException {
            wizcaqwiak(sflfametgt.ppxfxbqfkf(i13, i14));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.lqeggnwhkg
        public final void iobyxmoadg(byte[] bArr, int i13, int i14) throws OutOfSpaceException {
            ageimvtcrz(bArr, i13, i14);
        }

        public final void ipoelvxyzq(int i13, hkdspvbjdz hkdspvbjdzVar) throws OutOfSpaceException {
            igdgnonuha(i13, 2);
            grlcpdaxtj(hkdspvbjdzVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        final void iyctptxqzt(int i13, hkdspvbjdz hkdspvbjdzVar, jhduphickx jhduphickxVar) throws OutOfSpaceException {
            igdgnonuha(i13, 2);
            wizcaqwiak(((com.google.crypto.tink.shaded.protobuf.iobyxmoadg) hkdspvbjdzVar).zoijcleaow(jhduphickxVar));
            jhduphickxVar.ppxfxbqfkf(hkdspvbjdzVar, this.f23878iobyxmoadg);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void jlmebxxoox(int i13, boolean z13) throws OutOfSpaceException {
            igdgnonuha(i13, 0);
            crxdokpmqz(z13 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void lrnfpwlwnk(int i13, nufgyqmvbu nufgyqmvbuVar) throws OutOfSpaceException {
            igdgnonuha(1, 3);
            lxfrhoxuzk(2, i13);
            vipkmwdibw(3, nufgyqmvbuVar);
            igdgnonuha(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void lxfrhoxuzk(int i13, int i14) throws OutOfSpaceException {
            igdgnonuha(i13, 0);
            wizcaqwiak(i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void metgxyhuhe(int i13) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f23880eablkybsjg;
                int i14 = this.f23883nufgyqmvbu;
                int i15 = i14 + 1;
                this.f23883nufgyqmvbu = i15;
                bArr[i14] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
                int i16 = i14 + 2;
                this.f23883nufgyqmvbu = i16;
                bArr[i15] = (byte) ((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i17 = i14 + 3;
                this.f23883nufgyqmvbu = i17;
                bArr[i16] = (byte) ((i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f23883nufgyqmvbu = i14 + 4;
                bArr[i17] = (byte) ((i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23883nufgyqmvbu), Integer.valueOf(this.f23882lqeggnwhkg), 1), e13);
            }
        }

        public final void mhtqkkgtqm(String str) throws OutOfSpaceException {
            int i13 = this.f23883nufgyqmvbu;
            try {
                int iCllcsxoeiz = CodedOutputStream.cllcsxoeiz(str.length() * 3);
                int iCllcsxoeiz2 = CodedOutputStream.cllcsxoeiz(str.length());
                if (iCllcsxoeiz2 == iCllcsxoeiz) {
                    int i14 = i13 + iCllcsxoeiz2;
                    this.f23883nufgyqmvbu = i14;
                    int iGxszxtbevo = ydmasvzmpa.gxszxtbevo(str, this.f23880eablkybsjg, i14, sopmlzcsov());
                    this.f23883nufgyqmvbu = i13;
                    wizcaqwiak((iGxszxtbevo - i13) - iCllcsxoeiz2);
                    this.f23883nufgyqmvbu = iGxszxtbevo;
                } else {
                    wizcaqwiak(ydmasvzmpa.lqeggnwhkg(str));
                    this.f23883nufgyqmvbu = ydmasvzmpa.gxszxtbevo(str, this.f23880eablkybsjg, this.f23883nufgyqmvbu, sopmlzcsov());
                }
            } catch (ydmasvzmpa.wkgbmnqykc e13) {
                this.f23883nufgyqmvbu = i13;
                tzroggbefp(str, e13);
            } catch (IndexOutOfBoundsException e14) {
                throw new OutOfSpaceException(e14);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void oipsdeybqn(int i13) throws OutOfSpaceException {
            if (i13 >= 0) {
                wizcaqwiak(i13);
            } else {
                fiwbwshyhd(i13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void rlfsiqarku(int i13, long j13) throws OutOfSpaceException {
            igdgnonuha(i13, 1);
            czzsidtyhn(j13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void skhdrjzrfn(int i13, String str) throws OutOfSpaceException {
            igdgnonuha(i13, 2);
            mhtqkkgtqm(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int sopmlzcsov() {
            return this.f23882lqeggnwhkg - this.f23883nufgyqmvbu;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void vipkmwdibw(int i13, nufgyqmvbu nufgyqmvbuVar) throws OutOfSpaceException {
            igdgnonuha(i13, 2);
            fyldjkxazc(nufgyqmvbuVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void weqkydbzbr(int i13, hkdspvbjdz hkdspvbjdzVar) throws OutOfSpaceException {
            igdgnonuha(1, 3);
            lxfrhoxuzk(2, i13);
            ipoelvxyzq(3, hkdspvbjdzVar);
            igdgnonuha(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void wizcaqwiak(int i13) throws OutOfSpaceException {
            while ((i13 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f23880eablkybsjg;
                    int i14 = this.f23883nufgyqmvbu;
                    this.f23883nufgyqmvbu = i14 + 1;
                    bArr[i14] = (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    i13 >>>= 7;
                } catch (IndexOutOfBoundsException e13) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23883nufgyqmvbu), Integer.valueOf(this.f23882lqeggnwhkg), 1), e13);
                }
            }
            byte[] bArr2 = this.f23880eablkybsjg;
            int i15 = this.f23883nufgyqmvbu;
            this.f23883nufgyqmvbu = i15 + 1;
            bArr2[i15] = (byte) i13;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void xrmfcynszj(int i13, int i14) throws OutOfSpaceException {
            igdgnonuha(i13, 5);
            metgxyhuhe(i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void zfvoamnweg(int i13, int i14) throws OutOfSpaceException {
            igdgnonuha(i13, 0);
            oipsdeybqn(i14);
        }
    }

    public static int agtfadlqog(int i13, long j13) {
        return jpowsppfya(i13) + ojitshcjhn(j13);
    }

    public static int btonecajqb(int i13, int i14) {
        return jpowsppfya(i13) + gtknphoqwx(i14);
    }

    public static int cdpycssgdh(int i13, long j13) {
        return jpowsppfya(i13) + yadqdtsiqt(j13);
    }

    public static int cllcsxoeiz(int i13) {
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

    static int cqumvgiudr(int i13) {
        return cllcsxoeiz(i13) + i13;
    }

    public static int draadjrbmk(int i13, int i14) {
        return jpowsppfya(i13) + wflxmlrfwp(i14);
    }

    public static int dsvhmnatus(int i13, long j13) {
        return jpowsppfya(i13) + wypolnanlu(j13);
    }

    public static int dxjokdxxww(double d13) {
        return 8;
    }

    public static int eablkybsjg(boolean z13) {
        return 1;
    }

    static int esjtqupxsv(int i13, hkdspvbjdz hkdspvbjdzVar, jhduphickx jhduphickxVar) {
        return jpowsppfya(i13) + lereixgezr(hkdspvbjdzVar, jhduphickxVar);
    }

    public static int gtknphoqwx(int i13) {
        return yggfygwlhe(i13);
    }

    public static int gxszxtbevo(int i13, nufgyqmvbu nufgyqmvbuVar) {
        return jpowsppfya(i13) + lqeggnwhkg(nufgyqmvbuVar);
    }

    public static int hcddaimhww(String str) {
        int length;
        try {
            length = ydmasvzmpa.lqeggnwhkg(str);
        } catch (ydmasvzmpa.wkgbmnqykc unused) {
            length = str.getBytes(esjtqupxsv.f23928zoijcleaow).length;
        }
        return cqumvgiudr(length);
    }

    public static int hkdspvbjdz(int i13, int i14) {
        return jpowsppfya(i13) + cllcsxoeiz(i14);
    }

    public static int iozdgvuglv(int i13, int i14) {
        return jpowsppfya(i13) + lmojexxdyd(i14);
    }

    public static int istkbnxepw(int i13) {
        return 4;
    }

    public static int iwizpuwonk(long j13) {
        return wypolnanlu(j13);
    }

    public static int jpowsppfya(int i13) {
        return cllcsxoeiz(sflfametgt.ppxfxbqfkf(i13, 0));
    }

    public static int jyumaefscl(int i13, long j13) {
        return jpowsppfya(i13) + iwizpuwonk(j13);
    }

    static int kcexrzcfyt(hkdspvbjdz hkdspvbjdzVar, jhduphickx jhduphickxVar) {
        return ((com.google.crypto.tink.shaded.protobuf.iobyxmoadg) hkdspvbjdzVar).zoijcleaow(jhduphickxVar);
    }

    public static long kegysxyocb(long j13) {
        return (j13 >> 63) ^ (j13 << 1);
    }

    static int lereixgezr(hkdspvbjdz hkdspvbjdzVar, jhduphickx jhduphickxVar) {
        return cqumvgiudr(((com.google.crypto.tink.shaded.protobuf.iobyxmoadg) hkdspvbjdzVar).zoijcleaow(jhduphickxVar));
    }

    public static int lmojexxdyd(int i13) {
        return cllcsxoeiz(stevsuqkhv(i13));
    }

    public static int lqeggnwhkg(nufgyqmvbu nufgyqmvbuVar) {
        return cqumvgiudr(nufgyqmvbuVar.size());
    }

    public static CodedOutputStream ntlheqmsrt(byte[] bArr) {
        return ulzqkzuiru(bArr, 0, bArr.length);
    }

    public static int nufgyqmvbu(int i13, double d13) {
        return jpowsppfya(i13) + dxjokdxxww(d13);
    }

    public static int ojitshcjhn(long j13) {
        return 8;
    }

    static int oxmwwwfdhm(int i13, hkdspvbjdz hkdspvbjdzVar, jhduphickx jhduphickxVar) {
        return (jpowsppfya(i13) * 2) + kcexrzcfyt(hkdspvbjdzVar, jhduphickxVar);
    }

    public static int pkzmftpjix(int i13, String str) {
        return jpowsppfya(i13) + hcddaimhww(str);
    }

    public static int pmvmpeiblj(int i13, nufgyqmvbu nufgyqmvbuVar) {
        return (jpowsppfya(1) * 2) + hkdspvbjdz(2, i13) + gxszxtbevo(3, nufgyqmvbuVar);
    }

    public static int rgvfuqvkyq(int i13, float f13) {
        return jpowsppfya(i13) + vdvldrhtss(f13);
    }

    public static int stevsuqkhv(int i13) {
        return (i13 >> 31) ^ (i13 << 1);
    }

    public static CodedOutputStream ulzqkzuiru(byte[] bArr, int i13, int i14) {
        return new zoijcleaow(bArr, i13, i14);
    }

    public static int vdvldrhtss(float f13) {
        return 4;
    }

    public static int wflxmlrfwp(int i13) {
        return 4;
    }

    public static int wkgbmnqykc(int i13, boolean z13) {
        return jpowsppfya(i13) + eablkybsjg(z13);
    }

    public static int wwaezpbzkn(int i13, long j13) {
        return jpowsppfya(i13) + ylkuphrtab(j13);
    }

    public static int wypolnanlu(long j13) {
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

    public static int yadqdtsiqt(long j13) {
        return 8;
    }

    public static int yggfygwlhe(int i13) {
        if (i13 >= 0) {
            return cllcsxoeiz(i13);
        }
        return 10;
    }

    public static int ylkuphrtab(long j13) {
        return wypolnanlu(kegysxyocb(j13));
    }

    public static int zdlpuopuiu(int i13, int i14) {
        return jpowsppfya(i13) + yggfygwlhe(i14);
    }

    public static int zynmafqrjb(int i13, int i14) {
        return jpowsppfya(i13) + istkbnxepw(i14);
    }

    public final void auzgnhcxok(int i13) {
        wizcaqwiak(stevsuqkhv(i13));
    }

    public final void bfopjjpdmp(int i13, long j13) {
        hszhottldk(i13, j13);
    }

    public abstract void crxdokpmqz(byte b13);

    public abstract void czzsidtyhn(long j13);

    public final void dvvnrvtcbc(long j13) {
        fiwbwshyhd(kegysxyocb(j13));
    }

    public abstract void fiwbwshyhd(long j13);

    public abstract void hszhottldk(int i13, long j13);

    public abstract void igdgnonuha(int i13, int i14);

    public final void ikoacuggdj(double d13) {
        czzsidtyhn(Double.doubleToRawLongBits(d13));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.lqeggnwhkg
    public abstract void iobyxmoadg(byte[] bArr, int i13, int i14);

    public final void iwxlajgraz(int i13, long j13) {
        hszhottldk(i13, kegysxyocb(j13));
    }

    abstract void iyctptxqzt(int i13, hkdspvbjdz hkdspvbjdzVar, jhduphickx jhduphickxVar);

    public final void jhduphickx(int i13, double d13) {
        rlfsiqarku(i13, Double.doubleToRawLongBits(d13));
    }

    public abstract void jlmebxxoox(int i13, boolean z13);

    public final void jztzpxfvev(int i13) {
        oipsdeybqn(i13);
    }

    public abstract void lrnfpwlwnk(int i13, nufgyqmvbu nufgyqmvbuVar);

    public abstract void lxfrhoxuzk(int i13, int i14);

    boolean mbcevpiqjq() {
        return this.f23879zoijcleaow;
    }

    public abstract void metgxyhuhe(int i13);

    public final void nuxfzjnpeb(int i13) {
        metgxyhuhe(i13);
    }

    public abstract void oipsdeybqn(int i13);

    public final void okpsazkaxt(int i13, int i14) {
        zfvoamnweg(i13, i14);
    }

    public final void opjhrmiecq(long j13) {
        fiwbwshyhd(j13);
    }

    public final void ppxfxbqfkf() {
        if (sopmlzcsov() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void ribwqtqdhb(boolean z13) {
        crxdokpmqz(z13 ? (byte) 1 : (byte) 0);
    }

    public abstract void rlfsiqarku(int i13, long j13);

    public final void roivzttewh(long j13) {
        czzsidtyhn(j13);
    }

    final void sflfametgt(hkdspvbjdz hkdspvbjdzVar, jhduphickx jhduphickxVar) {
        jhduphickxVar.ppxfxbqfkf(hkdspvbjdzVar, this.f23878iobyxmoadg);
    }

    public abstract void skhdrjzrfn(int i13, String str);

    public abstract int sopmlzcsov();

    public final void tbqsvytpvh(int i13, long j13) {
        rlfsiqarku(i13, j13);
    }

    final void tzroggbefp(String str, ydmasvzmpa.wkgbmnqykc wkgbmnqykcVar) throws OutOfSpaceException {
        f23876ppxfxbqfkf.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) wkgbmnqykcVar);
        byte[] bytes = str.getBytes(esjtqupxsv.f23928zoijcleaow);
        try {
            wizcaqwiak(bytes.length);
            iobyxmoadg(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e13) {
            throw new OutOfSpaceException(e13);
        }
    }

    public final void uawqvzlxes(int i13, int i14) {
        lxfrhoxuzk(i13, stevsuqkhv(i14));
    }

    public final void uwvvkdfqfp(int i13, float f13) {
        xrmfcynszj(i13, Float.floatToRawIntBits(f13));
    }

    public abstract void vipkmwdibw(int i13, nufgyqmvbu nufgyqmvbuVar);

    public abstract void weqkydbzbr(int i13, hkdspvbjdz hkdspvbjdzVar);

    public abstract void wizcaqwiak(int i13);

    public abstract void xrmfcynszj(int i13, int i14);

    final void ydmasvzmpa(int i13, hkdspvbjdz hkdspvbjdzVar, jhduphickx jhduphickxVar) {
        igdgnonuha(i13, 3);
        sflfametgt(hkdspvbjdzVar, jhduphickxVar);
        igdgnonuha(i13, 4);
    }

    public final void yfnezrywwk(float f13) {
        metgxyhuhe(Float.floatToRawIntBits(f13));
    }

    public final void zeieaojujs(int i13, int i14) {
        xrmfcynszj(i13, i14);
    }

    public abstract void zfvoamnweg(int i13, int i14);

    private CodedOutputStream() {
    }
}
