package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static volatile int f23896gxszxtbevo = 100;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f23897eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    int f23898iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f23899ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    btonecajqb f23900wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    int f23901zoijcleaow;

    private static final class ppxfxbqfkf extends dxjokdxxww {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private int f23902agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private int f23903btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private int f23904draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f23905dxjokdxxww;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private int f23906gtknphoqwx;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final InputStream f23907lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final byte[] f23908nufgyqmvbu;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private int f23909wflxmlrfwp;

        private void crxdokpmqz() throws InvalidProtocolBufferException {
            if (this.f23905dxjokdxxww - this.f23906gtknphoqwx >= 10) {
                jlmebxxoox();
            } else {
                ribwqtqdhb();
            }
        }

        private byte[] hcddaimhww(int i13) throws InvalidProtocolBufferException {
            if (i13 == 0) {
                return esjtqupxsv.f23927wkgbmnqykc;
            }
            if (i13 < 0) {
                throw InvalidProtocolBufferException.draadjrbmk();
            }
            int i14 = this.f23909wflxmlrfwp;
            int i15 = this.f23906gtknphoqwx;
            int i16 = i14 + i15 + i13;
            if (i16 - this.f23899ppxfxbqfkf > 0) {
                throw InvalidProtocolBufferException.kcexrzcfyt();
            }
            int i17 = this.f23902agtfadlqog;
            if (i16 > i17) {
                ulzqkzuiru((i17 - i14) - i15);
                throw InvalidProtocolBufferException.zdlpuopuiu();
            }
            int i18 = this.f23905dxjokdxxww - i15;
            int i19 = i13 - i18;
            if (i19 >= 4096 && i19 > iozdgvuglv(this.f23907lqeggnwhkg)) {
                return null;
            }
            byte[] bArr = new byte[i13];
            System.arraycopy(this.f23908nufgyqmvbu, this.f23906gtknphoqwx, bArr, 0, i18);
            this.f23909wflxmlrfwp += this.f23905dxjokdxxww;
            this.f23906gtknphoqwx = 0;
            this.f23905dxjokdxxww = 0;
            while (i18 < i13) {
                int iLmojexxdyd = lmojexxdyd(this.f23907lqeggnwhkg, bArr, i18, i13 - i18);
                if (iLmojexxdyd == -1) {
                    throw InvalidProtocolBufferException.zdlpuopuiu();
                }
                this.f23909wflxmlrfwp += iLmojexxdyd;
                i18 += iLmojexxdyd;
            }
            return bArr;
        }

        private static int iozdgvuglv(InputStream inputStream) throws InvalidProtocolBufferException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e13) {
                e13.rgvfuqvkyq();
                throw e13;
            }
        }

        private void jlmebxxoox() throws InvalidProtocolBufferException {
            for (int i13 = 0; i13 < 10; i13++) {
                byte[] bArr = this.f23908nufgyqmvbu;
                int i14 = this.f23906gtknphoqwx;
                this.f23906gtknphoqwx = i14 + 1;
                if (bArr[i14] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.btonecajqb();
        }

        private List jpowsppfya(int i13) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i13 > 0) {
                int iMin = Math.min(i13, 4096);
                byte[] bArr = new byte[iMin];
                int i14 = 0;
                while (i14 < iMin) {
                    int i15 = this.f23907lqeggnwhkg.read(bArr, i14, iMin - i14);
                    if (i15 == -1) {
                        throw InvalidProtocolBufferException.zdlpuopuiu();
                    }
                    this.f23909wflxmlrfwp += i15;
                    i14 += i15;
                }
                i13 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void kegysxyocb() {
            int i13 = this.f23905dxjokdxxww + this.f23903btonecajqb;
            this.f23905dxjokdxxww = i13;
            int i14 = this.f23909wflxmlrfwp + i13;
            int i15 = this.f23902agtfadlqog;
            if (i14 <= i15) {
                this.f23903btonecajqb = 0;
                return;
            }
            int i16 = i14 - i15;
            this.f23903btonecajqb = i16;
            this.f23905dxjokdxxww = i13 - i16;
        }

        private static int lmojexxdyd(InputStream inputStream, byte[] bArr, int i13, int i14) throws InvalidProtocolBufferException {
            try {
                return inputStream.read(bArr, i13, i14);
            } catch (InvalidProtocolBufferException e13) {
                e13.rgvfuqvkyq();
                throw e13;
            }
        }

        private static long mbcevpiqjq(InputStream inputStream, long j13) throws InvalidProtocolBufferException {
            try {
                return inputStream.skip(j13);
            } catch (InvalidProtocolBufferException e13) {
                e13.rgvfuqvkyq();
                throw e13;
            }
        }

        private byte[] pkzmftpjix(int i13, boolean z13) throws IOException {
            byte[] bArrHcddaimhww = hcddaimhww(i13);
            if (bArrHcddaimhww != null) {
                return z13 ? (byte[]) bArrHcddaimhww.clone() : bArrHcddaimhww;
            }
            int i14 = this.f23906gtknphoqwx;
            int i15 = this.f23905dxjokdxxww;
            int length = i15 - i14;
            this.f23909wflxmlrfwp += i15;
            this.f23906gtknphoqwx = 0;
            this.f23905dxjokdxxww = 0;
            List<byte[]> listJpowsppfya = jpowsppfya(i13 - length);
            byte[] bArr = new byte[i13];
            System.arraycopy(this.f23908nufgyqmvbu, i14, bArr, 0, length);
            for (byte[] bArr2 : listJpowsppfya) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private void ribwqtqdhb() throws InvalidProtocolBufferException {
            for (int i13 = 0; i13 < 10; i13++) {
                if (ylkuphrtab() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.btonecajqb();
        }

        private void sopmlzcsov(int i13) throws InvalidProtocolBufferException {
            if (i13 < 0) {
                throw InvalidProtocolBufferException.draadjrbmk();
            }
            int i14 = this.f23909wflxmlrfwp;
            int i15 = this.f23906gtknphoqwx;
            int i16 = i14 + i15 + i13;
            int i17 = this.f23902agtfadlqog;
            if (i16 > i17) {
                ulzqkzuiru((i17 - i14) - i15);
                throw InvalidProtocolBufferException.zdlpuopuiu();
            }
            this.f23909wflxmlrfwp = i14 + i15;
            int i18 = this.f23905dxjokdxxww - i15;
            this.f23905dxjokdxxww = 0;
            this.f23906gtknphoqwx = 0;
            while (i18 < i13) {
                try {
                    long j13 = i13 - i18;
                    long jMbcevpiqjq = mbcevpiqjq(this.f23907lqeggnwhkg, j13);
                    if (jMbcevpiqjq < 0 || jMbcevpiqjq > j13) {
                        throw new IllegalStateException(this.f23907lqeggnwhkg.getClass() + "#skip returned invalid result: " + jMbcevpiqjq + "\nThe InputStream implementation is buggy.");
                    }
                    if (jMbcevpiqjq == 0) {
                        break;
                    } else {
                        i18 += (int) jMbcevpiqjq;
                    }
                } catch (Throwable th2) {
                    this.f23909wflxmlrfwp += i18;
                    kegysxyocb();
                    throw th2;
                }
            }
            this.f23909wflxmlrfwp += i18;
            kegysxyocb();
            if (i18 >= i13) {
                return;
            }
            int i19 = this.f23905dxjokdxxww;
            int i23 = i19 - this.f23906gtknphoqwx;
            this.f23906gtknphoqwx = i19;
            tzroggbefp(1);
            while (true) {
                int i24 = i13 - i23;
                int i25 = this.f23905dxjokdxxww;
                if (i24 <= i25) {
                    this.f23906gtknphoqwx = i24;
                    return;
                } else {
                    i23 += i25;
                    this.f23906gtknphoqwx = i25;
                    tzroggbefp(1);
                }
            }
        }

        private void tzroggbefp(int i13) throws InvalidProtocolBufferException {
            if (vipkmwdibw(i13)) {
                return;
            }
            if (i13 <= (this.f23899ppxfxbqfkf - this.f23909wflxmlrfwp) - this.f23906gtknphoqwx) {
                throw InvalidProtocolBufferException.zdlpuopuiu();
            }
            throw InvalidProtocolBufferException.kcexrzcfyt();
        }

        private boolean vipkmwdibw(int i13) throws InvalidProtocolBufferException {
            int i14 = this.f23906gtknphoqwx;
            int i15 = i14 + i13;
            int i16 = this.f23905dxjokdxxww;
            if (i15 <= i16) {
                throw new IllegalStateException("refillBuffer() called when " + i13 + " bytes were already available in buffer");
            }
            int i17 = this.f23899ppxfxbqfkf;
            int i18 = this.f23909wflxmlrfwp;
            if (i13 > (i17 - i18) - i14 || i18 + i14 + i13 > this.f23902agtfadlqog) {
                return false;
            }
            if (i14 > 0) {
                if (i16 > i14) {
                    byte[] bArr = this.f23908nufgyqmvbu;
                    System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
                }
                this.f23909wflxmlrfwp += i14;
                this.f23905dxjokdxxww -= i14;
                this.f23906gtknphoqwx = 0;
            }
            InputStream inputStream = this.f23907lqeggnwhkg;
            byte[] bArr2 = this.f23908nufgyqmvbu;
            int i19 = this.f23905dxjokdxxww;
            int iLmojexxdyd = lmojexxdyd(inputStream, bArr2, i19, Math.min(bArr2.length - i19, (this.f23899ppxfxbqfkf - this.f23909wflxmlrfwp) - i19));
            if (iLmojexxdyd == 0 || iLmojexxdyd < -1 || iLmojexxdyd > this.f23908nufgyqmvbu.length) {
                throw new IllegalStateException(this.f23907lqeggnwhkg.getClass() + "#read(byte[]) returned invalid result: " + iLmojexxdyd + "\nThe InputStream implementation is buggy.");
            }
            if (iLmojexxdyd <= 0) {
                return false;
            }
            this.f23905dxjokdxxww += iLmojexxdyd;
            kegysxyocb();
            if (this.f23905dxjokdxxww >= i13) {
                return true;
            }
            return vipkmwdibw(i13);
        }

        private nufgyqmvbu wwaezpbzkn(int i13) throws IOException {
            byte[] bArrHcddaimhww = hcddaimhww(i13);
            if (bArrHcddaimhww != null) {
                return nufgyqmvbu.draadjrbmk(bArrHcddaimhww);
            }
            int i14 = this.f23906gtknphoqwx;
            int i15 = this.f23905dxjokdxxww;
            int length = i15 - i14;
            this.f23909wflxmlrfwp += i15;
            this.f23906gtknphoqwx = 0;
            this.f23905dxjokdxxww = 0;
            List<byte[]> listJpowsppfya = jpowsppfya(i13 - length);
            byte[] bArr = new byte[i13];
            System.arraycopy(this.f23908nufgyqmvbu, i14, bArr, 0, length);
            for (byte[] bArr2 : listJpowsppfya) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return nufgyqmvbu.ylkuphrtab(bArr);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public nufgyqmvbu agtfadlqog() {
            int iDsvhmnatus = dsvhmnatus();
            int i13 = this.f23905dxjokdxxww;
            int i14 = this.f23906gtknphoqwx;
            if (iDsvhmnatus > i13 - i14 || iDsvhmnatus <= 0) {
                return iDsvhmnatus == 0 ? nufgyqmvbu.f23969yggfygwlhe : wwaezpbzkn(iDsvhmnatus);
            }
            nufgyqmvbu nufgyqmvbuVarAgtfadlqog = nufgyqmvbu.agtfadlqog(this.f23908nufgyqmvbu, i14, iDsvhmnatus);
            this.f23906gtknphoqwx += iDsvhmnatus;
            return nufgyqmvbuVarAgtfadlqog;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public long cdpycssgdh() {
            return wypolnanlu();
        }

        public long cllcsxoeiz() throws InvalidProtocolBufferException {
            int i13 = this.f23906gtknphoqwx;
            if (this.f23905dxjokdxxww - i13 < 8) {
                tzroggbefp(8);
                i13 = this.f23906gtknphoqwx;
            }
            byte[] bArr = this.f23908nufgyqmvbu;
            this.f23906gtknphoqwx = i13 + 8;
            return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int cqumvgiudr() {
            return dxjokdxxww.zoijcleaow(dsvhmnatus());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int draadjrbmk(int i13) throws InvalidProtocolBufferException {
            if (i13 < 0) {
                throw InvalidProtocolBufferException.draadjrbmk();
            }
            int i14 = i13 + this.f23909wflxmlrfwp + this.f23906gtknphoqwx;
            int i15 = this.f23902agtfadlqog;
            if (i14 > i15) {
                throw InvalidProtocolBufferException.zdlpuopuiu();
            }
            this.f23902agtfadlqog = i14;
            kegysxyocb();
            return i15;
        }

        public int dsvhmnatus() {
            int i13;
            int i14 = this.f23906gtknphoqwx;
            int i15 = this.f23905dxjokdxxww;
            if (i15 != i14) {
                byte[] bArr = this.f23908nufgyqmvbu;
                int i16 = i14 + 1;
                byte b13 = bArr[i14];
                if (b13 >= 0) {
                    this.f23906gtknphoqwx = i16;
                    return b13;
                }
                if (i15 - i16 >= 9) {
                    int i17 = i14 + 2;
                    int i18 = (bArr[i16] << 7) ^ b13;
                    if (i18 < 0) {
                        i13 = i18 ^ (-128);
                    } else {
                        int i19 = i14 + 3;
                        int i23 = (bArr[i17] << 14) ^ i18;
                        if (i23 >= 0) {
                            i13 = i23 ^ 16256;
                        } else {
                            int i24 = i14 + 4;
                            int i25 = i23 ^ (bArr[i19] << 21);
                            if (i25 < 0) {
                                i13 = (-2080896) ^ i25;
                            } else {
                                i19 = i14 + 5;
                                byte b14 = bArr[i24];
                                int i26 = (i25 ^ (b14 << 28)) ^ 266354560;
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
                    this.f23906gtknphoqwx = i17;
                    return i13;
                }
            }
            return (int) stevsuqkhv();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public boolean eablkybsjg() {
            return this.f23906gtknphoqwx == this.f23905dxjokdxxww && !vipkmwdibw(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public long esjtqupxsv() {
            return dxjokdxxww.ppxfxbqfkf(wypolnanlu());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public void gtknphoqwx(int i13) {
            this.f23902agtfadlqog = i13;
            kegysxyocb();
        }

        public int hkdspvbjdz() throws InvalidProtocolBufferException {
            int i13 = this.f23906gtknphoqwx;
            if (this.f23905dxjokdxxww - i13 < 4) {
                tzroggbefp(4);
                i13 = this.f23906gtknphoqwx;
            }
            byte[] bArr = this.f23908nufgyqmvbu;
            this.f23906gtknphoqwx = i13 + 4;
            return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public void iobyxmoadg(int i13) throws InvalidProtocolBufferException {
            if (this.f23904draadjrbmk != i13) {
                throw InvalidProtocolBufferException.wkgbmnqykc();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int istkbnxepw() {
            return dsvhmnatus();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public long iwizpuwonk() {
            return cllcsxoeiz();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int jyumaefscl() {
            return hkdspvbjdz();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public float kcexrzcfyt() {
            return Float.intBitsToFloat(hkdspvbjdz());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public String lereixgezr() throws InvalidProtocolBufferException {
            int iDsvhmnatus = dsvhmnatus();
            if (iDsvhmnatus > 0) {
                int i13 = this.f23905dxjokdxxww;
                int i14 = this.f23906gtknphoqwx;
                if (iDsvhmnatus <= i13 - i14) {
                    String str = new String(this.f23908nufgyqmvbu, i14, iDsvhmnatus, esjtqupxsv.f23928zoijcleaow);
                    this.f23906gtknphoqwx += iDsvhmnatus;
                    return str;
                }
            }
            if (iDsvhmnatus == 0) {
                return "";
            }
            if (iDsvhmnatus > this.f23905dxjokdxxww) {
                return new String(pkzmftpjix(iDsvhmnatus, false), esjtqupxsv.f23928zoijcleaow);
            }
            tzroggbefp(iDsvhmnatus);
            String str2 = new String(this.f23908nufgyqmvbu, this.f23906gtknphoqwx, iDsvhmnatus, esjtqupxsv.f23928zoijcleaow);
            this.f23906gtknphoqwx += iDsvhmnatus;
            return str2;
        }

        public void ntlheqmsrt() throws InvalidProtocolBufferException {
            int iZynmafqrjb;
            do {
                iZynmafqrjb = zynmafqrjb();
                if (iZynmafqrjb == 0) {
                    return;
                }
            } while (yadqdtsiqt(iZynmafqrjb));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public double ojitshcjhn() {
            return Double.longBitsToDouble(cllcsxoeiz());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public long oxmwwwfdhm() {
            return cllcsxoeiz();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public String pmvmpeiblj() throws IOException {
            byte[] bArrPkzmftpjix;
            int iDsvhmnatus = dsvhmnatus();
            int i13 = this.f23906gtknphoqwx;
            int i14 = this.f23905dxjokdxxww;
            if (iDsvhmnatus <= i14 - i13 && iDsvhmnatus > 0) {
                bArrPkzmftpjix = this.f23908nufgyqmvbu;
                this.f23906gtknphoqwx = i13 + iDsvhmnatus;
            } else {
                if (iDsvhmnatus == 0) {
                    return "";
                }
                i13 = 0;
                if (iDsvhmnatus <= i14) {
                    tzroggbefp(iDsvhmnatus);
                    bArrPkzmftpjix = this.f23908nufgyqmvbu;
                    this.f23906gtknphoqwx = iDsvhmnatus;
                } else {
                    bArrPkzmftpjix = pkzmftpjix(iDsvhmnatus, false);
                }
            }
            return ydmasvzmpa.eablkybsjg(bArrPkzmftpjix, i13, iDsvhmnatus);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int rgvfuqvkyq() {
            return dsvhmnatus();
        }

        long stevsuqkhv() throws InvalidProtocolBufferException {
            long j13 = 0;
            for (int i13 = 0; i13 < 64; i13 += 7) {
                byte bYlkuphrtab = ylkuphrtab();
                j13 |= ((long) (bYlkuphrtab & 127)) << i13;
                if ((bYlkuphrtab & 128) == 0) {
                    return j13;
                }
            }
            throw InvalidProtocolBufferException.btonecajqb();
        }

        public void ulzqkzuiru(int i13) throws InvalidProtocolBufferException {
            int i14 = this.f23905dxjokdxxww;
            int i15 = this.f23906gtknphoqwx;
            if (i13 > i14 - i15 || i13 < 0) {
                sopmlzcsov(i13);
            } else {
                this.f23906gtknphoqwx = i15 + i13;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int vdvldrhtss() {
            return hkdspvbjdz();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public boolean wflxmlrfwp() {
            return wypolnanlu() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int wkgbmnqykc() {
            return this.f23909wflxmlrfwp + this.f23906gtknphoqwx;
        }

        public long wypolnanlu() {
            long j13;
            long j14;
            long j15;
            int i13 = this.f23906gtknphoqwx;
            int i14 = this.f23905dxjokdxxww;
            if (i14 != i13) {
                byte[] bArr = this.f23908nufgyqmvbu;
                int i15 = i13 + 1;
                byte b13 = bArr[i13];
                if (b13 >= 0) {
                    this.f23906gtknphoqwx = i15;
                    return b13;
                }
                if (i14 - i15 >= 9) {
                    int i16 = i13 + 2;
                    int i17 = (bArr[i15] << 7) ^ b13;
                    if (i17 < 0) {
                        j13 = i17 ^ (-128);
                    } else {
                        int i18 = i13 + 3;
                        int i19 = (bArr[i16] << 14) ^ i17;
                        if (i19 >= 0) {
                            j13 = i19 ^ 16256;
                            i16 = i18;
                        } else {
                            int i23 = i13 + 4;
                            int i24 = i19 ^ (bArr[i18] << 21);
                            if (i24 < 0) {
                                long j16 = (-2080896) ^ i24;
                                i16 = i23;
                                j13 = j16;
                            } else {
                                long j17 = i24;
                                i16 = i13 + 5;
                                long j18 = j17 ^ (((long) bArr[i23]) << 28);
                                if (j18 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    int i25 = i13 + 6;
                                    long j19 = j18 ^ (((long) bArr[i16]) << 35);
                                    if (j19 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        i16 = i13 + 7;
                                        j18 = j19 ^ (((long) bArr[i25]) << 42);
                                        if (j18 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            i25 = i13 + 8;
                                            j19 = j18 ^ (((long) bArr[i16]) << 49);
                                            if (j19 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                i16 = i13 + 9;
                                                long j23 = (j19 ^ (((long) bArr[i25]) << 56)) ^ 71499008037633920L;
                                                if (j23 < 0) {
                                                    int i26 = i13 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i16 = i26;
                                                    }
                                                }
                                                j13 = j23;
                                            }
                                        }
                                    }
                                    j13 = j19 ^ j14;
                                    i16 = i25;
                                }
                                j13 = j18 ^ j15;
                            }
                        }
                    }
                    this.f23906gtknphoqwx = i16;
                    return j13;
                }
            }
            return stevsuqkhv();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public boolean yadqdtsiqt(int i13) throws InvalidProtocolBufferException {
            int iZoijcleaow = sflfametgt.zoijcleaow(i13);
            if (iZoijcleaow == 0) {
                crxdokpmqz();
                return true;
            }
            if (iZoijcleaow == 1) {
                ulzqkzuiru(8);
                return true;
            }
            if (iZoijcleaow == 2) {
                ulzqkzuiru(dsvhmnatus());
                return true;
            }
            if (iZoijcleaow == 3) {
                ntlheqmsrt();
                iobyxmoadg(sflfametgt.ppxfxbqfkf(sflfametgt.iobyxmoadg(i13), 4));
                return true;
            }
            if (iZoijcleaow == 4) {
                return false;
            }
            if (iZoijcleaow != 5) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            ulzqkzuiru(4);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public long yggfygwlhe() {
            return wypolnanlu();
        }

        public byte ylkuphrtab() throws InvalidProtocolBufferException {
            if (this.f23906gtknphoqwx == this.f23905dxjokdxxww) {
                tzroggbefp(1);
            }
            byte[] bArr = this.f23908nufgyqmvbu;
            int i13 = this.f23906gtknphoqwx;
            this.f23906gtknphoqwx = i13 + 1;
            return bArr[i13];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int zdlpuopuiu() {
            return dsvhmnatus();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int zynmafqrjb() throws InvalidProtocolBufferException {
            if (eablkybsjg()) {
                this.f23904draadjrbmk = 0;
                return 0;
            }
            int iDsvhmnatus = dsvhmnatus();
            this.f23904draadjrbmk = iDsvhmnatus;
            if (sflfametgt.iobyxmoadg(iDsvhmnatus) != 0) {
                return this.f23904draadjrbmk;
            }
            throw InvalidProtocolBufferException.lqeggnwhkg();
        }

        private ppxfxbqfkf(InputStream inputStream, int i13) {
            super();
            this.f23902agtfadlqog = Integer.MAX_VALUE;
            esjtqupxsv.zoijcleaow(inputStream, "input");
            this.f23907lqeggnwhkg = inputStream;
            this.f23908nufgyqmvbu = new byte[i13];
            this.f23905dxjokdxxww = 0;
            this.f23906gtknphoqwx = 0;
            this.f23909wflxmlrfwp = 0;
        }
    }

    private static final class zoijcleaow extends dxjokdxxww {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private boolean f23910agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private int f23911btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private int f23912draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f23913dxjokdxxww;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private int f23914gtknphoqwx;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final byte[] f23915lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final boolean f23916nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private int f23917ojitshcjhn;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private int f23918wflxmlrfwp;

        private void hkdspvbjdz() {
            int i13 = this.f23913dxjokdxxww + this.f23911btonecajqb;
            this.f23913dxjokdxxww = i13;
            int i14 = i13 - this.f23912draadjrbmk;
            int i15 = this.f23917ojitshcjhn;
            if (i14 <= i15) {
                this.f23911btonecajqb = 0;
                return;
            }
            int i16 = i14 - i15;
            this.f23911btonecajqb = i16;
            this.f23913dxjokdxxww = i13 - i16;
        }

        private void kegysxyocb() throws InvalidProtocolBufferException {
            for (int i13 = 0; i13 < 10; i13++) {
                if (iozdgvuglv() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.btonecajqb();
        }

        private void stevsuqkhv() throws InvalidProtocolBufferException {
            for (int i13 = 0; i13 < 10; i13++) {
                byte[] bArr = this.f23915lqeggnwhkg;
                int i14 = this.f23914gtknphoqwx;
                this.f23914gtknphoqwx = i14 + 1;
                if (bArr[i14] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.btonecajqb();
        }

        private void wypolnanlu() throws InvalidProtocolBufferException {
            if (this.f23913dxjokdxxww - this.f23914gtknphoqwx >= 10) {
                stevsuqkhv();
            } else {
                kegysxyocb();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public nufgyqmvbu agtfadlqog() {
            int iPkzmftpjix = pkzmftpjix();
            if (iPkzmftpjix > 0) {
                int i13 = this.f23913dxjokdxxww;
                int i14 = this.f23914gtknphoqwx;
                if (iPkzmftpjix <= i13 - i14) {
                    nufgyqmvbu nufgyqmvbuVarPkzmftpjix = (this.f23916nufgyqmvbu && this.f23910agtfadlqog) ? nufgyqmvbu.pkzmftpjix(this.f23915lqeggnwhkg, i14, iPkzmftpjix) : nufgyqmvbu.agtfadlqog(this.f23915lqeggnwhkg, i14, iPkzmftpjix);
                    this.f23914gtknphoqwx += iPkzmftpjix;
                    return nufgyqmvbuVarPkzmftpjix;
                }
            }
            return iPkzmftpjix == 0 ? nufgyqmvbu.f23969yggfygwlhe : nufgyqmvbu.ylkuphrtab(lmojexxdyd(iPkzmftpjix));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public long cdpycssgdh() {
            return hcddaimhww();
        }

        public void cllcsxoeiz() throws InvalidProtocolBufferException {
            int iZynmafqrjb;
            do {
                iZynmafqrjb = zynmafqrjb();
                if (iZynmafqrjb == 0) {
                    return;
                }
            } while (yadqdtsiqt(iZynmafqrjb));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int cqumvgiudr() {
            return dxjokdxxww.zoijcleaow(pkzmftpjix());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int draadjrbmk(int i13) throws InvalidProtocolBufferException {
            if (i13 < 0) {
                throw InvalidProtocolBufferException.draadjrbmk();
            }
            int iWkgbmnqykc = i13 + wkgbmnqykc();
            if (iWkgbmnqykc < 0) {
                throw InvalidProtocolBufferException.agtfadlqog();
            }
            int i14 = this.f23917ojitshcjhn;
            if (iWkgbmnqykc > i14) {
                throw InvalidProtocolBufferException.zdlpuopuiu();
            }
            this.f23917ojitshcjhn = iWkgbmnqykc;
            hkdspvbjdz();
            return i14;
        }

        public void dsvhmnatus(int i13) throws InvalidProtocolBufferException {
            if (i13 >= 0) {
                int i14 = this.f23913dxjokdxxww;
                int i15 = this.f23914gtknphoqwx;
                if (i13 <= i14 - i15) {
                    this.f23914gtknphoqwx = i15 + i13;
                    return;
                }
            }
            if (i13 >= 0) {
                throw InvalidProtocolBufferException.zdlpuopuiu();
            }
            throw InvalidProtocolBufferException.draadjrbmk();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public boolean eablkybsjg() {
            return this.f23914gtknphoqwx == this.f23913dxjokdxxww;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public long esjtqupxsv() {
            return dxjokdxxww.ppxfxbqfkf(hcddaimhww());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public void gtknphoqwx(int i13) {
            this.f23917ojitshcjhn = i13;
            hkdspvbjdz();
        }

        public long hcddaimhww() {
            long j13;
            long j14;
            long j15;
            int i13 = this.f23914gtknphoqwx;
            int i14 = this.f23913dxjokdxxww;
            if (i14 != i13) {
                byte[] bArr = this.f23915lqeggnwhkg;
                int i15 = i13 + 1;
                byte b13 = bArr[i13];
                if (b13 >= 0) {
                    this.f23914gtknphoqwx = i15;
                    return b13;
                }
                if (i14 - i15 >= 9) {
                    int i16 = i13 + 2;
                    int i17 = (bArr[i15] << 7) ^ b13;
                    if (i17 < 0) {
                        j13 = i17 ^ (-128);
                    } else {
                        int i18 = i13 + 3;
                        int i19 = (bArr[i16] << 14) ^ i17;
                        if (i19 >= 0) {
                            j13 = i19 ^ 16256;
                            i16 = i18;
                        } else {
                            int i23 = i13 + 4;
                            int i24 = i19 ^ (bArr[i18] << 21);
                            if (i24 < 0) {
                                long j16 = (-2080896) ^ i24;
                                i16 = i23;
                                j13 = j16;
                            } else {
                                long j17 = i24;
                                i16 = i13 + 5;
                                long j18 = j17 ^ (((long) bArr[i23]) << 28);
                                if (j18 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    int i25 = i13 + 6;
                                    long j19 = j18 ^ (((long) bArr[i16]) << 35);
                                    if (j19 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        i16 = i13 + 7;
                                        j18 = j19 ^ (((long) bArr[i25]) << 42);
                                        if (j18 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            i25 = i13 + 8;
                                            j19 = j18 ^ (((long) bArr[i16]) << 49);
                                            if (j19 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                i16 = i13 + 9;
                                                long j23 = (j19 ^ (((long) bArr[i25]) << 56)) ^ 71499008037633920L;
                                                if (j23 < 0) {
                                                    int i26 = i13 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i16 = i26;
                                                    }
                                                }
                                                j13 = j23;
                                            }
                                        }
                                    }
                                    j13 = j19 ^ j14;
                                    i16 = i25;
                                }
                                j13 = j18 ^ j15;
                            }
                        }
                    }
                    this.f23914gtknphoqwx = i16;
                    return j13;
                }
            }
            return jpowsppfya();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public void iobyxmoadg(int i13) throws InvalidProtocolBufferException {
            if (this.f23918wflxmlrfwp != i13) {
                throw InvalidProtocolBufferException.wkgbmnqykc();
            }
        }

        public byte iozdgvuglv() throws InvalidProtocolBufferException {
            int i13 = this.f23914gtknphoqwx;
            if (i13 == this.f23913dxjokdxxww) {
                throw InvalidProtocolBufferException.zdlpuopuiu();
            }
            byte[] bArr = this.f23915lqeggnwhkg;
            this.f23914gtknphoqwx = i13 + 1;
            return bArr[i13];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int istkbnxepw() {
            return pkzmftpjix();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public long iwizpuwonk() {
            return ylkuphrtab();
        }

        long jpowsppfya() throws InvalidProtocolBufferException {
            long j13 = 0;
            for (int i13 = 0; i13 < 64; i13 += 7) {
                byte bIozdgvuglv = iozdgvuglv();
                j13 |= ((long) (bIozdgvuglv & 127)) << i13;
                if ((bIozdgvuglv & 128) == 0) {
                    return j13;
                }
            }
            throw InvalidProtocolBufferException.btonecajqb();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int jyumaefscl() {
            return wwaezpbzkn();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public float kcexrzcfyt() {
            return Float.intBitsToFloat(wwaezpbzkn());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public String lereixgezr() throws InvalidProtocolBufferException {
            int iPkzmftpjix = pkzmftpjix();
            if (iPkzmftpjix > 0) {
                int i13 = this.f23913dxjokdxxww;
                int i14 = this.f23914gtknphoqwx;
                if (iPkzmftpjix <= i13 - i14) {
                    String str = new String(this.f23915lqeggnwhkg, i14, iPkzmftpjix, esjtqupxsv.f23928zoijcleaow);
                    this.f23914gtknphoqwx += iPkzmftpjix;
                    return str;
                }
            }
            if (iPkzmftpjix == 0) {
                return "";
            }
            if (iPkzmftpjix < 0) {
                throw InvalidProtocolBufferException.draadjrbmk();
            }
            throw InvalidProtocolBufferException.zdlpuopuiu();
        }

        public byte[] lmojexxdyd(int i13) throws InvalidProtocolBufferException {
            if (i13 > 0) {
                int i14 = this.f23913dxjokdxxww;
                int i15 = this.f23914gtknphoqwx;
                if (i13 <= i14 - i15) {
                    int i16 = i13 + i15;
                    this.f23914gtknphoqwx = i16;
                    return Arrays.copyOfRange(this.f23915lqeggnwhkg, i15, i16);
                }
            }
            if (i13 > 0) {
                throw InvalidProtocolBufferException.zdlpuopuiu();
            }
            if (i13 == 0) {
                return esjtqupxsv.f23927wkgbmnqykc;
            }
            throw InvalidProtocolBufferException.draadjrbmk();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public double ojitshcjhn() {
            return Double.longBitsToDouble(ylkuphrtab());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public long oxmwwwfdhm() {
            return ylkuphrtab();
        }

        public int pkzmftpjix() {
            int i13;
            int i14 = this.f23914gtknphoqwx;
            int i15 = this.f23913dxjokdxxww;
            if (i15 != i14) {
                byte[] bArr = this.f23915lqeggnwhkg;
                int i16 = i14 + 1;
                byte b13 = bArr[i14];
                if (b13 >= 0) {
                    this.f23914gtknphoqwx = i16;
                    return b13;
                }
                if (i15 - i16 >= 9) {
                    int i17 = i14 + 2;
                    int i18 = (bArr[i16] << 7) ^ b13;
                    if (i18 < 0) {
                        i13 = i18 ^ (-128);
                    } else {
                        int i19 = i14 + 3;
                        int i23 = (bArr[i17] << 14) ^ i18;
                        if (i23 >= 0) {
                            i13 = i23 ^ 16256;
                        } else {
                            int i24 = i14 + 4;
                            int i25 = i23 ^ (bArr[i19] << 21);
                            if (i25 < 0) {
                                i13 = (-2080896) ^ i25;
                            } else {
                                i19 = i14 + 5;
                                byte b14 = bArr[i24];
                                int i26 = (i25 ^ (b14 << 28)) ^ 266354560;
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
                    this.f23914gtknphoqwx = i17;
                    return i13;
                }
            }
            return (int) jpowsppfya();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public String pmvmpeiblj() throws InvalidProtocolBufferException {
            int iPkzmftpjix = pkzmftpjix();
            if (iPkzmftpjix > 0) {
                int i13 = this.f23913dxjokdxxww;
                int i14 = this.f23914gtknphoqwx;
                if (iPkzmftpjix <= i13 - i14) {
                    String strEablkybsjg = ydmasvzmpa.eablkybsjg(this.f23915lqeggnwhkg, i14, iPkzmftpjix);
                    this.f23914gtknphoqwx += iPkzmftpjix;
                    return strEablkybsjg;
                }
            }
            if (iPkzmftpjix == 0) {
                return "";
            }
            if (iPkzmftpjix <= 0) {
                throw InvalidProtocolBufferException.draadjrbmk();
            }
            throw InvalidProtocolBufferException.zdlpuopuiu();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int rgvfuqvkyq() {
            return pkzmftpjix();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int vdvldrhtss() {
            return wwaezpbzkn();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public boolean wflxmlrfwp() {
            return hcddaimhww() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int wkgbmnqykc() {
            return this.f23914gtknphoqwx - this.f23912draadjrbmk;
        }

        public int wwaezpbzkn() throws InvalidProtocolBufferException {
            int i13 = this.f23914gtknphoqwx;
            if (this.f23913dxjokdxxww - i13 < 4) {
                throw InvalidProtocolBufferException.zdlpuopuiu();
            }
            byte[] bArr = this.f23915lqeggnwhkg;
            this.f23914gtknphoqwx = i13 + 4;
            return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public boolean yadqdtsiqt(int i13) throws InvalidProtocolBufferException {
            int iZoijcleaow = sflfametgt.zoijcleaow(i13);
            if (iZoijcleaow == 0) {
                wypolnanlu();
                return true;
            }
            if (iZoijcleaow == 1) {
                dsvhmnatus(8);
                return true;
            }
            if (iZoijcleaow == 2) {
                dsvhmnatus(pkzmftpjix());
                return true;
            }
            if (iZoijcleaow == 3) {
                cllcsxoeiz();
                iobyxmoadg(sflfametgt.ppxfxbqfkf(sflfametgt.iobyxmoadg(i13), 4));
                return true;
            }
            if (iZoijcleaow == 4) {
                return false;
            }
            if (iZoijcleaow != 5) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            dsvhmnatus(4);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public long yggfygwlhe() {
            return hcddaimhww();
        }

        public long ylkuphrtab() throws InvalidProtocolBufferException {
            int i13 = this.f23914gtknphoqwx;
            if (this.f23913dxjokdxxww - i13 < 8) {
                throw InvalidProtocolBufferException.zdlpuopuiu();
            }
            byte[] bArr = this.f23915lqeggnwhkg;
            this.f23914gtknphoqwx = i13 + 8;
            return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int zdlpuopuiu() {
            return pkzmftpjix();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.dxjokdxxww
        public int zynmafqrjb() throws InvalidProtocolBufferException {
            if (eablkybsjg()) {
                this.f23918wflxmlrfwp = 0;
                return 0;
            }
            int iPkzmftpjix = pkzmftpjix();
            this.f23918wflxmlrfwp = iPkzmftpjix;
            if (sflfametgt.iobyxmoadg(iPkzmftpjix) != 0) {
                return this.f23918wflxmlrfwp;
            }
            throw InvalidProtocolBufferException.lqeggnwhkg();
        }

        private zoijcleaow(byte[] bArr, int i13, int i14, boolean z13) {
            super();
            this.f23917ojitshcjhn = Integer.MAX_VALUE;
            this.f23915lqeggnwhkg = bArr;
            this.f23913dxjokdxxww = i14 + i13;
            this.f23914gtknphoqwx = i13;
            this.f23912draadjrbmk = i13;
            this.f23916nufgyqmvbu = z13;
        }
    }

    static dxjokdxxww btonecajqb(byte[] bArr, int i13, int i14, boolean z13) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(bArr, i13, i14, z13);
        try {
            zoijcleaowVar.draadjrbmk(i14);
            return zoijcleaowVar;
        } catch (InvalidProtocolBufferException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public static dxjokdxxww dxjokdxxww(byte[] bArr, int i13, int i14) {
        return btonecajqb(bArr, i13, i14, false);
    }

    public static dxjokdxxww gxszxtbevo(InputStream inputStream) {
        return lqeggnwhkg(inputStream, 4096);
    }

    public static dxjokdxxww lqeggnwhkg(InputStream inputStream, int i13) {
        if (i13 > 0) {
            return inputStream == null ? nufgyqmvbu(esjtqupxsv.f23927wkgbmnqykc) : new ppxfxbqfkf(inputStream, i13);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static dxjokdxxww nufgyqmvbu(byte[] bArr) {
        return dxjokdxxww(bArr, 0, bArr.length);
    }

    public static long ppxfxbqfkf(long j13) {
        return (-(j13 & 1)) ^ (j13 >>> 1);
    }

    public static int zoijcleaow(int i13) {
        return (-(i13 & 1)) ^ (i13 >>> 1);
    }

    public abstract nufgyqmvbu agtfadlqog();

    public abstract long cdpycssgdh();

    public abstract int cqumvgiudr();

    public abstract int draadjrbmk(int i13);

    public abstract boolean eablkybsjg();

    public abstract long esjtqupxsv();

    public abstract void gtknphoqwx(int i13);

    public abstract void iobyxmoadg(int i13);

    public abstract int istkbnxepw();

    public abstract long iwizpuwonk();

    public abstract int jyumaefscl();

    public abstract float kcexrzcfyt();

    public abstract String lereixgezr();

    public abstract double ojitshcjhn();

    public abstract long oxmwwwfdhm();

    public abstract String pmvmpeiblj();

    public abstract int rgvfuqvkyq();

    public abstract int vdvldrhtss();

    public abstract boolean wflxmlrfwp();

    public abstract int wkgbmnqykc();

    public abstract boolean yadqdtsiqt(int i13);

    public abstract long yggfygwlhe();

    public abstract int zdlpuopuiu();

    public abstract int zynmafqrjb();

    private dxjokdxxww() {
        this.f23901zoijcleaow = f23896gxszxtbevo;
        this.f23899ppxfxbqfkf = Integer.MAX_VALUE;
        this.f23897eablkybsjg = false;
    }
}
