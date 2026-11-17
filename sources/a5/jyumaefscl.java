package a5;

import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.impl.C4007z9;

/* JADX INFO: loaded from: classes.dex */
abstract class jyumaefscl {

    public static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f568iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f569ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final byte[] f570wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f571zoijcleaow;

        private ppxfxbqfkf(int i13, int i14, int i15, byte[] bArr) {
            this.f568iobyxmoadg = i13;
            this.f571zoijcleaow = i14;
            this.f569ppxfxbqfkf = i15;
            this.f570wkgbmnqykc = bArr;
        }
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public int f572iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f573ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public long f574zoijcleaow;
    }

    private static void agtfadlqog(y2.cdpycssgdh cdpycssgdhVar, int i13) {
        int iNufgyqmvbu;
        boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
        int i14 = zLqeggnwhkg ? 1 : 5;
        int i15 = zLqeggnwhkg ? 7 : 5;
        int i16 = zLqeggnwhkg ? 8 : 6;
        int i17 = 0;
        while (i17 < i13) {
            if (cdpycssgdhVar.lqeggnwhkg()) {
                cdpycssgdhVar.oxmwwwfdhm(7);
                iNufgyqmvbu = 0;
            } else {
                if (cdpycssgdhVar.nufgyqmvbu(2) == 3 && cdpycssgdhVar.nufgyqmvbu(i15) * i14 != 0) {
                    cdpycssgdhVar.vdvldrhtss();
                }
                iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(i16) * i14;
                if (iNufgyqmvbu != 0 && iNufgyqmvbu != 180) {
                    cdpycssgdhVar.vdvldrhtss();
                }
                cdpycssgdhVar.vdvldrhtss();
            }
            if (iNufgyqmvbu != 0 && iNufgyqmvbu != 180 && cdpycssgdhVar.lqeggnwhkg()) {
                i17++;
            }
            i17++;
        }
    }

    private static int btonecajqb(y2.cdpycssgdh cdpycssgdhVar) {
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(5);
        int iGtknphoqwx = 0;
        for (int i13 = 0; i13 < iNufgyqmvbu + 1; i13++) {
            int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(3);
            iGtknphoqwx += gtknphoqwx(cdpycssgdhVar, 5, 8, 16) + 1;
            if ((iNufgyqmvbu2 == 0 || iNufgyqmvbu2 == 2) && cdpycssgdhVar.lqeggnwhkg()) {
                rgvfuqvkyq(cdpycssgdhVar);
            }
        }
        return iGtknphoqwx;
    }

    private static long draadjrbmk(y2.cdpycssgdh cdpycssgdhVar, int i13, int i14, int i15) {
        y2.iobyxmoadg.iobyxmoadg(Math.max(Math.max(i13, i14), i15) <= 63);
        long j13 = (1 << i13) - 1;
        long j14 = (1 << i14) - 1;
        za.wkgbmnqykc.iobyxmoadg(za.wkgbmnqykc.iobyxmoadg(j13, j14), 1 << i15);
        if (cdpycssgdhVar.zoijcleaow() < i13) {
            return -1L;
        }
        long jBtonecajqb = cdpycssgdhVar.btonecajqb(i13);
        if (jBtonecajqb != j13) {
            return jBtonecajqb;
        }
        if (cdpycssgdhVar.zoijcleaow() < i14) {
            return -1L;
        }
        long jBtonecajqb2 = cdpycssgdhVar.btonecajqb(i14);
        long j15 = jBtonecajqb + jBtonecajqb2;
        if (jBtonecajqb2 != j14) {
            return j15;
        }
        if (cdpycssgdhVar.zoijcleaow() < i15) {
            return -1L;
        }
        return j15 + cdpycssgdhVar.btonecajqb(i15);
    }

    private static boolean dxjokdxxww(y2.cdpycssgdh cdpycssgdhVar) {
        cdpycssgdhVar.oxmwwwfdhm(3);
        boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
        if (zLqeggnwhkg) {
            cdpycssgdhVar.oxmwwwfdhm(13);
        }
        return zLqeggnwhkg;
    }

    public static boolean eablkybsjg(int i13) {
        return (i13 & 16777215) == 12583333;
    }

    private static int gtknphoqwx(y2.cdpycssgdh cdpycssgdhVar, int i13, int i14, int i15) {
        y2.iobyxmoadg.iobyxmoadg(Math.max(Math.max(i13, i14), i15) <= 31);
        int i16 = (1 << i13) - 1;
        int i17 = (1 << i14) - 1;
        za.ppxfxbqfkf.iobyxmoadg(za.ppxfxbqfkf.iobyxmoadg(i16, i17), 1 << i15);
        if (cdpycssgdhVar.zoijcleaow() < i13) {
            return -1;
        }
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(i13);
        if (iNufgyqmvbu != i16) {
            return iNufgyqmvbu;
        }
        if (cdpycssgdhVar.zoijcleaow() < i14) {
            return -1;
        }
        int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(i14);
        int i18 = iNufgyqmvbu + iNufgyqmvbu2;
        if (iNufgyqmvbu2 != i17) {
            return i18;
        }
        if (cdpycssgdhVar.zoijcleaow() < i15) {
            return -1;
        }
        return i18 + cdpycssgdhVar.nufgyqmvbu(i15);
    }

    public static int gxszxtbevo(y2.cdpycssgdh cdpycssgdhVar) {
        if (!cdpycssgdhVar.lqeggnwhkg()) {
            return 0;
        }
        cdpycssgdhVar.oxmwwwfdhm(2);
        return cdpycssgdhVar.nufgyqmvbu(13);
    }

    private static int iobyxmoadg(int i13) throws ParserException {
        if (i13 == 0) {
            return 768;
        }
        if (i13 == 1) {
            return UserVerificationMethods.USER_VERIFY_ALL;
        }
        if (i13 == 2 || i13 == 3) {
            return 2048;
        }
        if (i13 == 4) {
            return 4096;
        }
        throw ParserException.lqeggnwhkg("Unsupported coreSbrFrameLengthIndex " + i13);
    }

    public static boolean lqeggnwhkg(y2.cdpycssgdh cdpycssgdhVar, zoijcleaow zoijcleaowVar) throws ParserException {
        cdpycssgdhVar.wkgbmnqykc();
        int iGtknphoqwx = gtknphoqwx(cdpycssgdhVar, 3, 8, 8);
        zoijcleaowVar.f572iobyxmoadg = iGtknphoqwx;
        if (iGtknphoqwx == -1) {
            return false;
        }
        long jDraadjrbmk = draadjrbmk(cdpycssgdhVar, 2, 8, 32);
        zoijcleaowVar.f574zoijcleaow = jDraadjrbmk;
        if (jDraadjrbmk == -1) {
            return false;
        }
        if (jDraadjrbmk > 16) {
            throw ParserException.lqeggnwhkg("Contains sub-stream with an invalid packet label " + zoijcleaowVar.f574zoijcleaow);
        }
        if (jDraadjrbmk == 0) {
            int i13 = zoijcleaowVar.f572iobyxmoadg;
            if (i13 == 1) {
                throw ParserException.iobyxmoadg("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i13 == 2) {
                throw ParserException.iobyxmoadg("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i13 == 17) {
                throw ParserException.iobyxmoadg("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iGtknphoqwx2 = gtknphoqwx(cdpycssgdhVar, 11, 24, 24);
        zoijcleaowVar.f573ppxfxbqfkf = iGtknphoqwx2;
        return iGtknphoqwx2 != -1;
    }

    public static ppxfxbqfkf nufgyqmvbu(y2.cdpycssgdh cdpycssgdhVar) throws ParserException {
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(8);
        int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(5);
        int iNufgyqmvbu3 = iNufgyqmvbu2 == 31 ? cdpycssgdhVar.nufgyqmvbu(24) : ppxfxbqfkf(iNufgyqmvbu2);
        int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(3);
        int iIobyxmoadg = iobyxmoadg(iNufgyqmvbu4);
        int iWkgbmnqykc = wkgbmnqykc(iNufgyqmvbu4);
        cdpycssgdhVar.oxmwwwfdhm(2);
        rgvfuqvkyq(cdpycssgdhVar);
        wflxmlrfwp(cdpycssgdhVar, btonecajqb(cdpycssgdhVar), iWkgbmnqykc);
        byte[] bArr = null;
        if (cdpycssgdhVar.lqeggnwhkg()) {
            int iGtknphoqwx = gtknphoqwx(cdpycssgdhVar, 2, 4, 8) + 1;
            for (int i13 = 0; i13 < iGtknphoqwx; i13++) {
                int iGtknphoqwx2 = gtknphoqwx(cdpycssgdhVar, 4, 8, 16);
                int iGtknphoqwx3 = gtknphoqwx(cdpycssgdhVar, 4, 8, 16);
                if (iGtknphoqwx2 == 7) {
                    int iNufgyqmvbu5 = cdpycssgdhVar.nufgyqmvbu(4) + 1;
                    cdpycssgdhVar.oxmwwwfdhm(4);
                    byte[] bArr2 = new byte[iNufgyqmvbu5];
                    for (int i14 = 0; i14 < iNufgyqmvbu5; i14++) {
                        bArr2[i14] = (byte) cdpycssgdhVar.nufgyqmvbu(8);
                    }
                    bArr = bArr2;
                } else {
                    cdpycssgdhVar.oxmwwwfdhm(iGtknphoqwx3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double dZoijcleaow = zoijcleaow(iNufgyqmvbu3);
        return new ppxfxbqfkf(iNufgyqmvbu, (int) (((double) iNufgyqmvbu3) * dZoijcleaow), (int) (((double) iIobyxmoadg) * dZoijcleaow), bArr3);
    }

    private static void ojitshcjhn(y2.cdpycssgdh cdpycssgdhVar) {
        cdpycssgdhVar.oxmwwwfdhm(3);
        cdpycssgdhVar.oxmwwwfdhm(8);
        boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
        boolean zLqeggnwhkg2 = cdpycssgdhVar.lqeggnwhkg();
        if (zLqeggnwhkg) {
            cdpycssgdhVar.oxmwwwfdhm(5);
        }
        if (zLqeggnwhkg2) {
            cdpycssgdhVar.oxmwwwfdhm(6);
        }
    }

    private static int ppxfxbqfkf(int i13) throws ParserException {
        switch (i13) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw ParserException.lqeggnwhkg("Unsupported sampling rate index " + i13);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case C4007z9.F /* 25 */:
                return 14400;
            case C4007z9.G /* 26 */:
                return 12800;
            case 27:
                return 9600;
        }
    }

    private static void rgvfuqvkyq(y2.cdpycssgdh cdpycssgdhVar) {
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(2);
        if (iNufgyqmvbu == 0) {
            cdpycssgdhVar.oxmwwwfdhm(6);
            return;
        }
        int iGtknphoqwx = gtknphoqwx(cdpycssgdhVar, 5, 8, 16) + 1;
        if (iNufgyqmvbu == 1) {
            cdpycssgdhVar.oxmwwwfdhm(iGtknphoqwx * 7);
        } else if (iNufgyqmvbu == 2) {
            agtfadlqog(cdpycssgdhVar, iGtknphoqwx);
        }
    }

    private static void wflxmlrfwp(y2.cdpycssgdh cdpycssgdhVar, int i13, int i14) {
        int iNufgyqmvbu;
        int iGtknphoqwx = gtknphoqwx(cdpycssgdhVar, 4, 8, 16) + 1;
        cdpycssgdhVar.vdvldrhtss();
        for (int i15 = 0; i15 < iGtknphoqwx; i15++) {
            int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(2);
            if (iNufgyqmvbu2 == 0) {
                dxjokdxxww(cdpycssgdhVar);
                if (i14 > 0) {
                    ojitshcjhn(cdpycssgdhVar);
                }
            } else if (iNufgyqmvbu2 == 1) {
                if (dxjokdxxww(cdpycssgdhVar)) {
                    cdpycssgdhVar.vdvldrhtss();
                }
                if (i14 > 0) {
                    ojitshcjhn(cdpycssgdhVar);
                    iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(2);
                } else {
                    iNufgyqmvbu = 0;
                }
                if (iNufgyqmvbu > 0) {
                    cdpycssgdhVar.oxmwwwfdhm(6);
                    int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(2);
                    cdpycssgdhVar.oxmwwwfdhm(4);
                    if (cdpycssgdhVar.lqeggnwhkg()) {
                        cdpycssgdhVar.oxmwwwfdhm(5);
                    }
                    if (iNufgyqmvbu == 2 || iNufgyqmvbu == 3) {
                        cdpycssgdhVar.oxmwwwfdhm(6);
                    }
                    if (iNufgyqmvbu3 == 2) {
                        cdpycssgdhVar.vdvldrhtss();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i13 - 1) / Math.log(2.0d))) + 1;
                int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(2);
                if (iNufgyqmvbu4 > 0 && cdpycssgdhVar.lqeggnwhkg()) {
                    cdpycssgdhVar.oxmwwwfdhm(iFloor);
                }
                if (cdpycssgdhVar.lqeggnwhkg()) {
                    cdpycssgdhVar.oxmwwwfdhm(iFloor);
                }
                if (i14 == 0 && iNufgyqmvbu4 == 0) {
                    cdpycssgdhVar.vdvldrhtss();
                }
            } else if (iNufgyqmvbu2 == 3) {
                gtknphoqwx(cdpycssgdhVar, 4, 8, 16);
                int iGtknphoqwx2 = gtknphoqwx(cdpycssgdhVar, 4, 8, 16);
                if (cdpycssgdhVar.lqeggnwhkg()) {
                    gtknphoqwx(cdpycssgdhVar, 8, 16, 0);
                }
                cdpycssgdhVar.vdvldrhtss();
                if (iGtknphoqwx2 > 0) {
                    cdpycssgdhVar.oxmwwwfdhm(iGtknphoqwx2 * 8);
                }
            }
        }
    }

    private static int wkgbmnqykc(int i13) throws ParserException {
        if (i13 == 0 || i13 == 1) {
            return 0;
        }
        int i14 = 2;
        if (i13 != 2) {
            i14 = 3;
            if (i13 != 3) {
                if (i13 == 4) {
                    return 1;
                }
                throw ParserException.lqeggnwhkg("Unsupported coreSbrFrameLengthIndex " + i13);
            }
        }
        return i14;
    }

    private static double zoijcleaow(int i13) throws ParserException {
        switch (i13) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw ParserException.lqeggnwhkg("Unsupported sampling rate " + i13);
        }
    }
}
