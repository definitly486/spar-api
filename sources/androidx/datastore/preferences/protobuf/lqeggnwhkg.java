package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f8700eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    int f8701iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f8702ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    nufgyqmvbu f8703wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    int f8704zoijcleaow;

    private static final class ppxfxbqfkf extends lqeggnwhkg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private int f8705btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private int f8706draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f8707dxjokdxxww;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private int f8708gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final InputStream f8709gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final byte[] f8710lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f8711nufgyqmvbu;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private int f8712wflxmlrfwp;

        private boolean crxdokpmqz(int i13) throws IOException {
            int i14 = this.f8705btonecajqb;
            int i15 = i14 + i13;
            int i16 = this.f8711nufgyqmvbu;
            if (i15 <= i16) {
                throw new IllegalStateException("refillBuffer() called when " + i13 + " bytes were already available in buffer");
            }
            int i17 = this.f8702ppxfxbqfkf;
            int i18 = this.f8706draadjrbmk;
            if (i13 > (i17 - i18) - i14 || i18 + i14 + i13 > this.f8712wflxmlrfwp) {
                return false;
            }
            if (i14 > 0) {
                if (i16 > i14) {
                    byte[] bArr = this.f8710lqeggnwhkg;
                    System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
                }
                this.f8706draadjrbmk += i14;
                this.f8711nufgyqmvbu -= i14;
                this.f8705btonecajqb = 0;
            }
            InputStream inputStream = this.f8709gxszxtbevo;
            byte[] bArr2 = this.f8710lqeggnwhkg;
            int i19 = this.f8711nufgyqmvbu;
            int i23 = inputStream.read(bArr2, i19, Math.min(bArr2.length - i19, (this.f8702ppxfxbqfkf - this.f8706draadjrbmk) - i19));
            if (i23 == 0 || i23 < -1 || i23 > this.f8710lqeggnwhkg.length) {
                throw new IllegalStateException(this.f8709gxszxtbevo.getClass() + "#read(byte[]) returned invalid result: " + i23 + "\nThe InputStream implementation is buggy.");
            }
            if (i23 <= 0) {
                return false;
            }
            this.f8711nufgyqmvbu += i23;
            wypolnanlu();
            if (this.f8711nufgyqmvbu >= i13) {
                return true;
            }
            return crxdokpmqz(i13);
        }

        private gxszxtbevo iozdgvuglv(int i13) throws IOException {
            byte[] bArrYlkuphrtab = ylkuphrtab(i13);
            if (bArrYlkuphrtab != null) {
                return gxszxtbevo.draadjrbmk(bArrYlkuphrtab);
            }
            int i14 = this.f8705btonecajqb;
            int i15 = this.f8711nufgyqmvbu;
            int length = i15 - i14;
            this.f8706draadjrbmk += i15;
            this.f8705btonecajqb = 0;
            this.f8711nufgyqmvbu = 0;
            List<byte[]> listPkzmftpjix = pkzmftpjix(i13 - length);
            byte[] bArr = new byte[i13];
            System.arraycopy(this.f8710lqeggnwhkg, i14, bArr, 0, length);
            for (byte[] bArr2 : listPkzmftpjix) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return gxszxtbevo.yadqdtsiqt(bArr);
        }

        private void mbcevpiqjq(int i13) throws InvalidProtocolBufferException {
            if (i13 < 0) {
                throw InvalidProtocolBufferException.btonecajqb();
            }
            int i14 = this.f8706draadjrbmk;
            int i15 = this.f8705btonecajqb;
            int i16 = i14 + i15 + i13;
            int i17 = this.f8712wflxmlrfwp;
            if (i16 > i17) {
                tzroggbefp((i17 - i14) - i15);
                throw InvalidProtocolBufferException.vdvldrhtss();
            }
            this.f8706draadjrbmk = i14 + i15;
            int i18 = this.f8711nufgyqmvbu - i15;
            this.f8711nufgyqmvbu = 0;
            this.f8705btonecajqb = 0;
            while (i18 < i13) {
                try {
                    long j13 = i13 - i18;
                    long jSkip = this.f8709gxszxtbevo.skip(j13);
                    if (jSkip < 0 || jSkip > j13) {
                        throw new IllegalStateException(this.f8709gxszxtbevo.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i18 += (int) jSkip;
                    }
                } catch (Throwable th2) {
                    this.f8706draadjrbmk += i18;
                    wypolnanlu();
                    throw th2;
                }
            }
            this.f8706draadjrbmk += i18;
            wypolnanlu();
            if (i18 >= i13) {
                return;
            }
            int i19 = this.f8711nufgyqmvbu;
            int i23 = i19 - this.f8705btonecajqb;
            this.f8705btonecajqb = i19;
            stevsuqkhv(1);
            while (true) {
                int i24 = i13 - i23;
                int i25 = this.f8711nufgyqmvbu;
                if (i24 <= i25) {
                    this.f8705btonecajqb = i24;
                    return;
                } else {
                    i23 += i25;
                    this.f8705btonecajqb = i25;
                    stevsuqkhv(1);
                }
            }
        }

        private void ntlheqmsrt() throws InvalidProtocolBufferException {
            if (this.f8711nufgyqmvbu - this.f8705btonecajqb >= 10) {
                ulzqkzuiru();
            } else {
                sopmlzcsov();
            }
        }

        private List pkzmftpjix(int i13) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i13 > 0) {
                int iMin = Math.min(i13, 4096);
                byte[] bArr = new byte[iMin];
                int i14 = 0;
                while (i14 < iMin) {
                    int i15 = this.f8709gxszxtbevo.read(bArr, i14, iMin - i14);
                    if (i15 == -1) {
                        throw InvalidProtocolBufferException.vdvldrhtss();
                    }
                    this.f8706draadjrbmk += i15;
                    i14 += i15;
                }
                i13 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void sopmlzcsov() throws InvalidProtocolBufferException {
            for (int i13 = 0; i13 < 10; i13++) {
                if (lmojexxdyd() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.dxjokdxxww();
        }

        private void stevsuqkhv(int i13) throws InvalidProtocolBufferException {
            if (crxdokpmqz(i13)) {
                return;
            }
            if (i13 <= (this.f8702ppxfxbqfkf - this.f8706draadjrbmk) - this.f8705btonecajqb) {
                throw InvalidProtocolBufferException.vdvldrhtss();
            }
            throw InvalidProtocolBufferException.rgvfuqvkyq();
        }

        private void ulzqkzuiru() throws InvalidProtocolBufferException {
            for (int i13 = 0; i13 < 10; i13++) {
                byte[] bArr = this.f8710lqeggnwhkg;
                int i14 = this.f8705btonecajqb;
                this.f8705btonecajqb = i14 + 1;
                if (bArr[i14] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.dxjokdxxww();
        }

        private byte[] wwaezpbzkn(int i13, boolean z13) throws IOException {
            byte[] bArrYlkuphrtab = ylkuphrtab(i13);
            if (bArrYlkuphrtab != null) {
                return z13 ? (byte[]) bArrYlkuphrtab.clone() : bArrYlkuphrtab;
            }
            int i14 = this.f8705btonecajqb;
            int i15 = this.f8711nufgyqmvbu;
            int length = i15 - i14;
            this.f8706draadjrbmk += i15;
            this.f8705btonecajqb = 0;
            this.f8711nufgyqmvbu = 0;
            List<byte[]> listPkzmftpjix = pkzmftpjix(i13 - length);
            byte[] bArr = new byte[i13];
            System.arraycopy(this.f8710lqeggnwhkg, i14, bArr, 0, length);
            for (byte[] bArr2 : listPkzmftpjix) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private void wypolnanlu() {
            int i13 = this.f8711nufgyqmvbu + this.f8707dxjokdxxww;
            this.f8711nufgyqmvbu = i13;
            int i14 = this.f8706draadjrbmk + i13;
            int i15 = this.f8712wflxmlrfwp;
            if (i14 <= i15) {
                this.f8707dxjokdxxww = 0;
                return;
            }
            int i16 = i14 - i15;
            this.f8707dxjokdxxww = i16;
            this.f8711nufgyqmvbu = i13 - i16;
        }

        private byte[] ylkuphrtab(int i13) throws IOException {
            if (i13 == 0) {
                return zdlpuopuiu.f8903ppxfxbqfkf;
            }
            if (i13 < 0) {
                throw InvalidProtocolBufferException.btonecajqb();
            }
            int i14 = this.f8706draadjrbmk;
            int i15 = this.f8705btonecajqb;
            int i16 = i14 + i15 + i13;
            if (i16 - this.f8702ppxfxbqfkf > 0) {
                throw InvalidProtocolBufferException.rgvfuqvkyq();
            }
            int i17 = this.f8712wflxmlrfwp;
            if (i16 > i17) {
                tzroggbefp((i17 - i14) - i15);
                throw InvalidProtocolBufferException.vdvldrhtss();
            }
            int i18 = this.f8711nufgyqmvbu - i15;
            int i19 = i13 - i18;
            if (i19 >= 4096 && i19 > this.f8709gxszxtbevo.available()) {
                return null;
            }
            byte[] bArr = new byte[i13];
            System.arraycopy(this.f8710lqeggnwhkg, this.f8705btonecajqb, bArr, 0, i18);
            this.f8706draadjrbmk += this.f8711nufgyqmvbu;
            this.f8705btonecajqb = 0;
            this.f8711nufgyqmvbu = 0;
            while (i18 < i13) {
                int i23 = this.f8709gxszxtbevo.read(bArr, i18, i13 - i18);
                if (i23 == -1) {
                    throw InvalidProtocolBufferException.vdvldrhtss();
                }
                this.f8706draadjrbmk += i23;
                i18 += i23;
            }
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public gxszxtbevo agtfadlqog() {
            int iHkdspvbjdz = hkdspvbjdz();
            int i13 = this.f8711nufgyqmvbu;
            int i14 = this.f8705btonecajqb;
            if (iHkdspvbjdz > i13 - i14 || iHkdspvbjdz <= 0) {
                return iHkdspvbjdz == 0 ? gxszxtbevo.f8642yggfygwlhe : iozdgvuglv(iHkdspvbjdz);
            }
            gxszxtbevo gxszxtbevoVarAgtfadlqog = gxszxtbevo.agtfadlqog(this.f8710lqeggnwhkg, i14, iHkdspvbjdz);
            this.f8705btonecajqb += iHkdspvbjdz;
            return gxszxtbevoVarAgtfadlqog;
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public long cdpycssgdh() {
            return cllcsxoeiz();
        }

        public long cllcsxoeiz() {
            long j13;
            long j14;
            long j15;
            int i13 = this.f8705btonecajqb;
            int i14 = this.f8711nufgyqmvbu;
            if (i14 != i13) {
                byte[] bArr = this.f8710lqeggnwhkg;
                int i15 = i13 + 1;
                byte b13 = bArr[i13];
                if (b13 >= 0) {
                    this.f8705btonecajqb = i15;
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
                    this.f8705btonecajqb = i16;
                    return j13;
                }
            }
            return dsvhmnatus();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int cqumvgiudr() {
            return lqeggnwhkg.zoijcleaow(hkdspvbjdz());
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int draadjrbmk(int i13) throws InvalidProtocolBufferException {
            if (i13 < 0) {
                throw InvalidProtocolBufferException.btonecajqb();
            }
            int i14 = i13 + this.f8706draadjrbmk + this.f8705btonecajqb;
            int i15 = this.f8712wflxmlrfwp;
            if (i14 > i15) {
                throw InvalidProtocolBufferException.vdvldrhtss();
            }
            this.f8712wflxmlrfwp = i14;
            wypolnanlu();
            return i15;
        }

        long dsvhmnatus() throws InvalidProtocolBufferException {
            long j13 = 0;
            for (int i13 = 0; i13 < 64; i13 += 7) {
                byte bLmojexxdyd = lmojexxdyd();
                j13 |= ((long) (bLmojexxdyd & 127)) << i13;
                if ((bLmojexxdyd & 128) == 0) {
                    return j13;
                }
            }
            throw InvalidProtocolBufferException.dxjokdxxww();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public boolean eablkybsjg() {
            return this.f8705btonecajqb == this.f8711nufgyqmvbu && !crxdokpmqz(1);
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public long esjtqupxsv() {
            return lqeggnwhkg.ppxfxbqfkf(cllcsxoeiz());
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public void gtknphoqwx(int i13) {
            this.f8712wflxmlrfwp = i13;
            wypolnanlu();
        }

        public int hcddaimhww() throws InvalidProtocolBufferException {
            int i13 = this.f8705btonecajqb;
            if (this.f8711nufgyqmvbu - i13 < 4) {
                stevsuqkhv(4);
                i13 = this.f8705btonecajqb;
            }
            byte[] bArr = this.f8710lqeggnwhkg;
            this.f8705btonecajqb = i13 + 4;
            return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
        }

        public int hkdspvbjdz() {
            int i13;
            int i14 = this.f8705btonecajqb;
            int i15 = this.f8711nufgyqmvbu;
            if (i15 != i14) {
                byte[] bArr = this.f8710lqeggnwhkg;
                int i16 = i14 + 1;
                byte b13 = bArr[i14];
                if (b13 >= 0) {
                    this.f8705btonecajqb = i16;
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
                    this.f8705btonecajqb = i17;
                    return i13;
                }
            }
            return (int) dsvhmnatus();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public void iobyxmoadg(int i13) throws InvalidProtocolBufferException {
            if (this.f8708gtknphoqwx != i13) {
                throw InvalidProtocolBufferException.iobyxmoadg();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int istkbnxepw() {
            return hkdspvbjdz();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public long iwizpuwonk() {
            return jpowsppfya();
        }

        public long jpowsppfya() throws InvalidProtocolBufferException {
            int i13 = this.f8705btonecajqb;
            if (this.f8711nufgyqmvbu - i13 < 8) {
                stevsuqkhv(8);
                i13 = this.f8705btonecajqb;
            }
            byte[] bArr = this.f8710lqeggnwhkg;
            this.f8705btonecajqb = i13 + 8;
            return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int jyumaefscl() {
            return hcddaimhww();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public float kcexrzcfyt() {
            return Float.intBitsToFloat(hcddaimhww());
        }

        public void kegysxyocb() throws InvalidProtocolBufferException {
            int iZynmafqrjb;
            do {
                iZynmafqrjb = zynmafqrjb();
                if (iZynmafqrjb == 0) {
                    return;
                }
            } while (yadqdtsiqt(iZynmafqrjb));
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public String lereixgezr() throws InvalidProtocolBufferException {
            int iHkdspvbjdz = hkdspvbjdz();
            if (iHkdspvbjdz > 0) {
                int i13 = this.f8711nufgyqmvbu;
                int i14 = this.f8705btonecajqb;
                if (iHkdspvbjdz <= i13 - i14) {
                    String str = new String(this.f8710lqeggnwhkg, i14, iHkdspvbjdz, zdlpuopuiu.f8902iobyxmoadg);
                    this.f8705btonecajqb += iHkdspvbjdz;
                    return str;
                }
            }
            if (iHkdspvbjdz == 0) {
                return "";
            }
            if (iHkdspvbjdz > this.f8711nufgyqmvbu) {
                return new String(wwaezpbzkn(iHkdspvbjdz, false), zdlpuopuiu.f8902iobyxmoadg);
            }
            stevsuqkhv(iHkdspvbjdz);
            String str2 = new String(this.f8710lqeggnwhkg, this.f8705btonecajqb, iHkdspvbjdz, zdlpuopuiu.f8902iobyxmoadg);
            this.f8705btonecajqb += iHkdspvbjdz;
            return str2;
        }

        public byte lmojexxdyd() throws InvalidProtocolBufferException {
            if (this.f8705btonecajqb == this.f8711nufgyqmvbu) {
                stevsuqkhv(1);
            }
            byte[] bArr = this.f8710lqeggnwhkg;
            int i13 = this.f8705btonecajqb;
            this.f8705btonecajqb = i13 + 1;
            return bArr[i13];
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public double ojitshcjhn() {
            return Double.longBitsToDouble(jpowsppfya());
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public long oxmwwwfdhm() {
            return jpowsppfya();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public String pmvmpeiblj() throws IOException {
            byte[] bArrWwaezpbzkn;
            int iHkdspvbjdz = hkdspvbjdz();
            int i13 = this.f8705btonecajqb;
            int i14 = this.f8711nufgyqmvbu;
            if (iHkdspvbjdz <= i14 - i13 && iHkdspvbjdz > 0) {
                bArrWwaezpbzkn = this.f8710lqeggnwhkg;
                this.f8705btonecajqb = i13 + iHkdspvbjdz;
            } else {
                if (iHkdspvbjdz == 0) {
                    return "";
                }
                i13 = 0;
                if (iHkdspvbjdz <= i14) {
                    stevsuqkhv(iHkdspvbjdz);
                    bArrWwaezpbzkn = this.f8710lqeggnwhkg;
                    this.f8705btonecajqb = iHkdspvbjdz;
                } else {
                    bArrWwaezpbzkn = wwaezpbzkn(iHkdspvbjdz, false);
                }
            }
            return rlfsiqarku.eablkybsjg(bArrWwaezpbzkn, i13, iHkdspvbjdz);
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int rgvfuqvkyq() {
            return hkdspvbjdz();
        }

        public void tzroggbefp(int i13) throws InvalidProtocolBufferException {
            int i14 = this.f8711nufgyqmvbu;
            int i15 = this.f8705btonecajqb;
            if (i13 > i14 - i15 || i13 < 0) {
                mbcevpiqjq(i13);
            } else {
                this.f8705btonecajqb = i15 + i13;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int vdvldrhtss() {
            return hcddaimhww();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public boolean wflxmlrfwp() {
            return cllcsxoeiz() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int wkgbmnqykc() {
            return this.f8706draadjrbmk + this.f8705btonecajqb;
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public boolean yadqdtsiqt(int i13) throws InvalidProtocolBufferException {
            int iZoijcleaow = czzsidtyhn.zoijcleaow(i13);
            if (iZoijcleaow == 0) {
                ntlheqmsrt();
                return true;
            }
            if (iZoijcleaow == 1) {
                tzroggbefp(8);
                return true;
            }
            if (iZoijcleaow == 2) {
                tzroggbefp(hkdspvbjdz());
                return true;
            }
            if (iZoijcleaow == 3) {
                kegysxyocb();
                iobyxmoadg(czzsidtyhn.ppxfxbqfkf(czzsidtyhn.iobyxmoadg(i13), 4));
                return true;
            }
            if (iZoijcleaow == 4) {
                return false;
            }
            if (iZoijcleaow != 5) {
                throw InvalidProtocolBufferException.nufgyqmvbu();
            }
            tzroggbefp(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public long yggfygwlhe() {
            return cllcsxoeiz();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int zdlpuopuiu() {
            return hkdspvbjdz();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int zynmafqrjb() throws InvalidProtocolBufferException {
            if (eablkybsjg()) {
                this.f8708gtknphoqwx = 0;
                return 0;
            }
            int iHkdspvbjdz = hkdspvbjdz();
            this.f8708gtknphoqwx = iHkdspvbjdz;
            if (czzsidtyhn.iobyxmoadg(iHkdspvbjdz) != 0) {
                return this.f8708gtknphoqwx;
            }
            throw InvalidProtocolBufferException.wkgbmnqykc();
        }

        private ppxfxbqfkf(InputStream inputStream, int i13) {
            super();
            this.f8712wflxmlrfwp = Integer.MAX_VALUE;
            zdlpuopuiu.zoijcleaow(inputStream, "input");
            this.f8709gxszxtbevo = inputStream;
            this.f8710lqeggnwhkg = new byte[i13];
            this.f8711nufgyqmvbu = 0;
            this.f8705btonecajqb = 0;
            this.f8706draadjrbmk = 0;
        }
    }

    private static final class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private int f8713agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private int f8714btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private int f8715draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f8716dxjokdxxww;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private int f8717gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final byte[] f8718gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final boolean f8719lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f8720nufgyqmvbu;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private boolean f8721wflxmlrfwp;

        private void hkdspvbjdz() {
            int i13 = this.f8720nufgyqmvbu + this.f8716dxjokdxxww;
            this.f8720nufgyqmvbu = i13;
            int i14 = i13 - this.f8717gtknphoqwx;
            int i15 = this.f8713agtfadlqog;
            if (i14 <= i15) {
                this.f8716dxjokdxxww = 0;
                return;
            }
            int i16 = i14 - i15;
            this.f8716dxjokdxxww = i16;
            this.f8720nufgyqmvbu = i13 - i16;
        }

        private void kegysxyocb() throws InvalidProtocolBufferException {
            for (int i13 = 0; i13 < 10; i13++) {
                if (iozdgvuglv() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.dxjokdxxww();
        }

        private void stevsuqkhv() throws InvalidProtocolBufferException {
            for (int i13 = 0; i13 < 10; i13++) {
                byte[] bArr = this.f8718gxszxtbevo;
                int i14 = this.f8714btonecajqb;
                this.f8714btonecajqb = i14 + 1;
                if (bArr[i14] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.dxjokdxxww();
        }

        private void wypolnanlu() throws InvalidProtocolBufferException {
            if (this.f8720nufgyqmvbu - this.f8714btonecajqb >= 10) {
                stevsuqkhv();
            } else {
                kegysxyocb();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public gxszxtbevo agtfadlqog() {
            int iPkzmftpjix = pkzmftpjix();
            if (iPkzmftpjix > 0) {
                int i13 = this.f8720nufgyqmvbu;
                int i14 = this.f8714btonecajqb;
                if (iPkzmftpjix <= i13 - i14) {
                    gxszxtbevo gxszxtbevoVarLmojexxdyd = (this.f8719lqeggnwhkg && this.f8721wflxmlrfwp) ? gxszxtbevo.lmojexxdyd(this.f8718gxszxtbevo, i14, iPkzmftpjix) : gxszxtbevo.agtfadlqog(this.f8718gxszxtbevo, i14, iPkzmftpjix);
                    this.f8714btonecajqb += iPkzmftpjix;
                    return gxszxtbevoVarLmojexxdyd;
                }
            }
            return iPkzmftpjix == 0 ? gxszxtbevo.f8642yggfygwlhe : gxszxtbevo.yadqdtsiqt(lmojexxdyd(iPkzmftpjix));
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
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

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int cqumvgiudr() {
            return lqeggnwhkg.zoijcleaow(pkzmftpjix());
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int draadjrbmk(int i13) throws InvalidProtocolBufferException {
            if (i13 < 0) {
                throw InvalidProtocolBufferException.btonecajqb();
            }
            int iWkgbmnqykc = i13 + wkgbmnqykc();
            int i14 = this.f8713agtfadlqog;
            if (iWkgbmnqykc > i14) {
                throw InvalidProtocolBufferException.vdvldrhtss();
            }
            this.f8713agtfadlqog = iWkgbmnqykc;
            hkdspvbjdz();
            return i14;
        }

        public void dsvhmnatus(int i13) throws InvalidProtocolBufferException {
            if (i13 >= 0) {
                int i14 = this.f8720nufgyqmvbu;
                int i15 = this.f8714btonecajqb;
                if (i13 <= i14 - i15) {
                    this.f8714btonecajqb = i15 + i13;
                    return;
                }
            }
            if (i13 >= 0) {
                throw InvalidProtocolBufferException.vdvldrhtss();
            }
            throw InvalidProtocolBufferException.btonecajqb();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public boolean eablkybsjg() {
            return this.f8714btonecajqb == this.f8720nufgyqmvbu;
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public long esjtqupxsv() {
            return lqeggnwhkg.ppxfxbqfkf(hcddaimhww());
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public void gtknphoqwx(int i13) {
            this.f8713agtfadlqog = i13;
            hkdspvbjdz();
        }

        public long hcddaimhww() {
            long j13;
            long j14;
            long j15;
            int i13 = this.f8714btonecajqb;
            int i14 = this.f8720nufgyqmvbu;
            if (i14 != i13) {
                byte[] bArr = this.f8718gxszxtbevo;
                int i15 = i13 + 1;
                byte b13 = bArr[i13];
                if (b13 >= 0) {
                    this.f8714btonecajqb = i15;
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
                    this.f8714btonecajqb = i16;
                    return j13;
                }
            }
            return jpowsppfya();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public void iobyxmoadg(int i13) throws InvalidProtocolBufferException {
            if (this.f8715draadjrbmk != i13) {
                throw InvalidProtocolBufferException.iobyxmoadg();
            }
        }

        public byte iozdgvuglv() throws InvalidProtocolBufferException {
            int i13 = this.f8714btonecajqb;
            if (i13 == this.f8720nufgyqmvbu) {
                throw InvalidProtocolBufferException.vdvldrhtss();
            }
            byte[] bArr = this.f8718gxszxtbevo;
            this.f8714btonecajqb = i13 + 1;
            return bArr[i13];
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int istkbnxepw() {
            return pkzmftpjix();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
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
            throw InvalidProtocolBufferException.dxjokdxxww();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int jyumaefscl() {
            return wwaezpbzkn();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public float kcexrzcfyt() {
            return Float.intBitsToFloat(wwaezpbzkn());
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public String lereixgezr() throws InvalidProtocolBufferException {
            int iPkzmftpjix = pkzmftpjix();
            if (iPkzmftpjix > 0) {
                int i13 = this.f8720nufgyqmvbu;
                int i14 = this.f8714btonecajqb;
                if (iPkzmftpjix <= i13 - i14) {
                    String str = new String(this.f8718gxszxtbevo, i14, iPkzmftpjix, zdlpuopuiu.f8902iobyxmoadg);
                    this.f8714btonecajqb += iPkzmftpjix;
                    return str;
                }
            }
            if (iPkzmftpjix == 0) {
                return "";
            }
            if (iPkzmftpjix < 0) {
                throw InvalidProtocolBufferException.btonecajqb();
            }
            throw InvalidProtocolBufferException.vdvldrhtss();
        }

        public byte[] lmojexxdyd(int i13) throws InvalidProtocolBufferException {
            if (i13 > 0) {
                int i14 = this.f8720nufgyqmvbu;
                int i15 = this.f8714btonecajqb;
                if (i13 <= i14 - i15) {
                    int i16 = i13 + i15;
                    this.f8714btonecajqb = i16;
                    return Arrays.copyOfRange(this.f8718gxszxtbevo, i15, i16);
                }
            }
            if (i13 > 0) {
                throw InvalidProtocolBufferException.vdvldrhtss();
            }
            if (i13 == 0) {
                return zdlpuopuiu.f8903ppxfxbqfkf;
            }
            throw InvalidProtocolBufferException.btonecajqb();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public double ojitshcjhn() {
            return Double.longBitsToDouble(ylkuphrtab());
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public long oxmwwwfdhm() {
            return ylkuphrtab();
        }

        public int pkzmftpjix() {
            int i13;
            int i14 = this.f8714btonecajqb;
            int i15 = this.f8720nufgyqmvbu;
            if (i15 != i14) {
                byte[] bArr = this.f8718gxszxtbevo;
                int i16 = i14 + 1;
                byte b13 = bArr[i14];
                if (b13 >= 0) {
                    this.f8714btonecajqb = i16;
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
                    this.f8714btonecajqb = i17;
                    return i13;
                }
            }
            return (int) jpowsppfya();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public String pmvmpeiblj() throws InvalidProtocolBufferException {
            int iPkzmftpjix = pkzmftpjix();
            if (iPkzmftpjix > 0) {
                int i13 = this.f8720nufgyqmvbu;
                int i14 = this.f8714btonecajqb;
                if (iPkzmftpjix <= i13 - i14) {
                    String strEablkybsjg = rlfsiqarku.eablkybsjg(this.f8718gxszxtbevo, i14, iPkzmftpjix);
                    this.f8714btonecajqb += iPkzmftpjix;
                    return strEablkybsjg;
                }
            }
            if (iPkzmftpjix == 0) {
                return "";
            }
            if (iPkzmftpjix <= 0) {
                throw InvalidProtocolBufferException.btonecajqb();
            }
            throw InvalidProtocolBufferException.vdvldrhtss();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int rgvfuqvkyq() {
            return pkzmftpjix();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int vdvldrhtss() {
            return wwaezpbzkn();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public boolean wflxmlrfwp() {
            return hcddaimhww() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int wkgbmnqykc() {
            return this.f8714btonecajqb - this.f8717gtknphoqwx;
        }

        public int wwaezpbzkn() throws InvalidProtocolBufferException {
            int i13 = this.f8714btonecajqb;
            if (this.f8720nufgyqmvbu - i13 < 4) {
                throw InvalidProtocolBufferException.vdvldrhtss();
            }
            byte[] bArr = this.f8718gxszxtbevo;
            this.f8714btonecajqb = i13 + 4;
            return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public boolean yadqdtsiqt(int i13) throws InvalidProtocolBufferException {
            int iZoijcleaow = czzsidtyhn.zoijcleaow(i13);
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
                iobyxmoadg(czzsidtyhn.ppxfxbqfkf(czzsidtyhn.iobyxmoadg(i13), 4));
                return true;
            }
            if (iZoijcleaow == 4) {
                return false;
            }
            if (iZoijcleaow != 5) {
                throw InvalidProtocolBufferException.nufgyqmvbu();
            }
            dsvhmnatus(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public long yggfygwlhe() {
            return hcddaimhww();
        }

        public long ylkuphrtab() throws InvalidProtocolBufferException {
            int i13 = this.f8714btonecajqb;
            if (this.f8720nufgyqmvbu - i13 < 8) {
                throw InvalidProtocolBufferException.vdvldrhtss();
            }
            byte[] bArr = this.f8718gxszxtbevo;
            this.f8714btonecajqb = i13 + 8;
            return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int zdlpuopuiu() {
            return pkzmftpjix();
        }

        @Override // androidx.datastore.preferences.protobuf.lqeggnwhkg
        public int zynmafqrjb() throws InvalidProtocolBufferException {
            if (eablkybsjg()) {
                this.f8715draadjrbmk = 0;
                return 0;
            }
            int iPkzmftpjix = pkzmftpjix();
            this.f8715draadjrbmk = iPkzmftpjix;
            if (czzsidtyhn.iobyxmoadg(iPkzmftpjix) != 0) {
                return this.f8715draadjrbmk;
            }
            throw InvalidProtocolBufferException.wkgbmnqykc();
        }

        private zoijcleaow(byte[] bArr, int i13, int i14, boolean z13) {
            super();
            this.f8713agtfadlqog = Integer.MAX_VALUE;
            this.f8718gxszxtbevo = bArr;
            this.f8720nufgyqmvbu = i14 + i13;
            this.f8714btonecajqb = i13;
            this.f8717gtknphoqwx = i13;
            this.f8719lqeggnwhkg = z13;
        }
    }

    static lqeggnwhkg btonecajqb(byte[] bArr, int i13, int i14, boolean z13) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(bArr, i13, i14, z13);
        try {
            zoijcleaowVar.draadjrbmk(i14);
            return zoijcleaowVar;
        } catch (InvalidProtocolBufferException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public static lqeggnwhkg dxjokdxxww(byte[] bArr, int i13, int i14) {
        return btonecajqb(bArr, i13, i14, false);
    }

    public static lqeggnwhkg gxszxtbevo(InputStream inputStream) {
        return lqeggnwhkg(inputStream, 4096);
    }

    public static lqeggnwhkg lqeggnwhkg(InputStream inputStream, int i13) {
        if (i13 > 0) {
            return inputStream == null ? nufgyqmvbu(zdlpuopuiu.f8903ppxfxbqfkf) : new ppxfxbqfkf(inputStream, i13);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static lqeggnwhkg nufgyqmvbu(byte[] bArr) {
        return dxjokdxxww(bArr, 0, bArr.length);
    }

    public static long ppxfxbqfkf(long j13) {
        return (-(j13 & 1)) ^ (j13 >>> 1);
    }

    public static int zoijcleaow(int i13) {
        return (-(i13 & 1)) ^ (i13 >>> 1);
    }

    public abstract gxszxtbevo agtfadlqog();

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

    private lqeggnwhkg() {
        this.f8704zoijcleaow = 100;
        this.f8702ppxfxbqfkf = Integer.MAX_VALUE;
        this.f8700eablkybsjg = false;
    }
}
