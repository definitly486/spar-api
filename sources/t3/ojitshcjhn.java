package t3;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f109513iobyxmoadg = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[] f109518zoijcleaow = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int[] f109516ppxfxbqfkf = {64, 112, UserVerificationMethods.USER_VERIFY_PATTERN, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 384, 448, UserVerificationMethods.USER_VERIFY_NONE, 640, 768, 896, UserVerificationMethods.USER_VERIFY_ALL, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[] f109517wkgbmnqykc = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int[] f109511eablkybsjg = {5, 8, 10, 12};

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int[] f109512gxszxtbevo = {6, 9, 12, 15};

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int[] f109514lqeggnwhkg = {2, 4, 6, 8};

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final int[] f109515nufgyqmvbu = {9, 11, 13, 16};

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final int[] f109510dxjokdxxww = {5, 8, 10, 12};

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final long f109519eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final int f109520gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f109521iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f109522ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f109523wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f109524zoijcleaow;

        private zoijcleaow(String str, int i13, int i14, int i15, long j13, int i16) {
            this.f109521iobyxmoadg = str;
            this.f109522ppxfxbqfkf = i13;
            this.f109524zoijcleaow = i14;
            this.f109523wkgbmnqykc = i15;
            this.f109519eablkybsjg = j13;
            this.f109520gxszxtbevo = i16;
        }
    }

    public static int btonecajqb(byte[] bArr) {
        y2.cdpycssgdh cdpycssgdhVarWkgbmnqykc = wkgbmnqykc(bArr);
        cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(42);
        return cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(cdpycssgdhVarWkgbmnqykc.lqeggnwhkg() ? 12 : 8) + 1;
    }

    public static int draadjrbmk(byte[] bArr) {
        y2.cdpycssgdh cdpycssgdhVarWkgbmnqykc = wkgbmnqykc(bArr);
        cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(32);
        return wflxmlrfwp(cdpycssgdhVarWkgbmnqykc, f109510dxjokdxxww, true) + 1;
    }

    public static zoijcleaow dxjokdxxww(byte[] bArr) throws ParserException {
        int i13;
        int i14;
        int iNufgyqmvbu;
        int i15;
        int iNufgyqmvbu2;
        long jB;
        int i16;
        y2.cdpycssgdh cdpycssgdhVarWkgbmnqykc = wkgbmnqykc(bArr);
        cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(40);
        int iNufgyqmvbu3 = cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(2);
        if (cdpycssgdhVarWkgbmnqykc.lqeggnwhkg()) {
            i13 = 20;
            i14 = 12;
        } else {
            i13 = 16;
            i14 = 8;
        }
        cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(i14);
        int iNufgyqmvbu4 = cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(i13) + 1;
        boolean zLqeggnwhkg = cdpycssgdhVarWkgbmnqykc.lqeggnwhkg();
        int i17 = 0;
        if (zLqeggnwhkg) {
            iNufgyqmvbu = cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(2);
            int iNufgyqmvbu5 = (cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(3) + 1) * UserVerificationMethods.USER_VERIFY_NONE;
            if (cdpycssgdhVarWkgbmnqykc.lqeggnwhkg()) {
                cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(36);
            }
            int iNufgyqmvbu6 = cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(3) + 1;
            int iNufgyqmvbu7 = cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(3) + 1;
            if (iNufgyqmvbu6 != 1 || iNufgyqmvbu7 != 1) {
                throw ParserException.lqeggnwhkg("Multiple audio presentations or assets not supported");
            }
            int i18 = iNufgyqmvbu3 + 1;
            int iNufgyqmvbu8 = cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(i18);
            for (int i19 = 0; i19 < i18; i19++) {
                if (((iNufgyqmvbu8 >> i19) & 1) == 1) {
                    cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(8);
                }
            }
            if (cdpycssgdhVarWkgbmnqykc.lqeggnwhkg()) {
                cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(2);
                int iNufgyqmvbu9 = (cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(2) + 1) << 2;
                int iNufgyqmvbu10 = cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(2) + 1;
                while (i17 < iNufgyqmvbu10) {
                    cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(iNufgyqmvbu9);
                    i17++;
                }
            }
            i17 = iNufgyqmvbu5;
        } else {
            iNufgyqmvbu = -1;
        }
        cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(i13);
        cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(12);
        if (zLqeggnwhkg) {
            if (cdpycssgdhVarWkgbmnqykc.lqeggnwhkg()) {
                cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(4);
            }
            if (cdpycssgdhVarWkgbmnqykc.lqeggnwhkg()) {
                cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(24);
            }
            if (cdpycssgdhVarWkgbmnqykc.lqeggnwhkg()) {
                cdpycssgdhVarWkgbmnqykc.kcexrzcfyt(cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(10) + 1);
            }
            cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(5);
            int i23 = f109517wkgbmnqykc[cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(4)];
            iNufgyqmvbu2 = cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(8) + 1;
            i15 = i23;
        } else {
            i15 = -2147483647;
            iNufgyqmvbu2 = -1;
        }
        if (zLqeggnwhkg) {
            if (iNufgyqmvbu == 0) {
                i16 = 32000;
            } else if (iNufgyqmvbu == 1) {
                i16 = 44100;
            } else {
                if (iNufgyqmvbu != 2) {
                    throw ParserException.iobyxmoadg("Unsupported reference clock code in DTS HD header: " + iNufgyqmvbu, null);
                }
                i16 = 48000;
            }
            jB = y2.stevsuqkhv.b(i17, 1000000L, i16);
        } else {
            jB = -9223372036854775807L;
        }
        return new zoijcleaow("audio/vnd.dts.hd;profile=lbr", iNufgyqmvbu2, i15, iNufgyqmvbu4, jB, 0);
    }

    private static boolean eablkybsjg(byte[] bArr) {
        byte b13 = bArr[0];
        return b13 == -2 || b13 == -1 || b13 == 37 || b13 == -14 || b13 == -24;
    }

    public static zoijcleaow gtknphoqwx(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int iNufgyqmvbu;
        long jB;
        int i13;
        int i14;
        y2.cdpycssgdh cdpycssgdhVarWkgbmnqykc = wkgbmnqykc(bArr);
        int i15 = cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(32) == 1078008818 ? 1 : 0;
        int iWflxmlrfwp = wflxmlrfwp(cdpycssgdhVarWkgbmnqykc, f109511eablkybsjg, true) + 1;
        if (i15 == 0) {
            iNufgyqmvbu = -2147483647;
            jB = -9223372036854775807L;
        } else {
            if (!cdpycssgdhVarWkgbmnqykc.lqeggnwhkg()) {
                throw ParserException.lqeggnwhkg("Only supports full channel mask-based audio presentation");
            }
            iobyxmoadg(bArr, iWflxmlrfwp);
            int iNufgyqmvbu2 = cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(2);
            if (iNufgyqmvbu2 == 0) {
                i13 = UserVerificationMethods.USER_VERIFY_NONE;
            } else if (iNufgyqmvbu2 == 1) {
                i13 = 480;
            } else {
                if (iNufgyqmvbu2 != 2) {
                    throw ParserException.iobyxmoadg("Unsupported base duration index in DTS UHD header: " + iNufgyqmvbu2, null);
                }
                i13 = 384;
            }
            int iNufgyqmvbu3 = i13 * (cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(3) + 1);
            int iNufgyqmvbu4 = cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(2);
            if (iNufgyqmvbu4 == 0) {
                i14 = 32000;
            } else if (iNufgyqmvbu4 == 1) {
                i14 = 44100;
            } else {
                if (iNufgyqmvbu4 != 2) {
                    throw ParserException.iobyxmoadg("Unsupported clock rate index in DTS UHD header: " + iNufgyqmvbu4, null);
                }
                i14 = 48000;
            }
            if (cdpycssgdhVarWkgbmnqykc.lqeggnwhkg()) {
                cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(36);
            }
            iNufgyqmvbu = (1 << cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(2)) * i14;
            jB = y2.stevsuqkhv.b(iNufgyqmvbu3, 1000000L, i14);
        }
        int i16 = iNufgyqmvbu;
        long j13 = jB;
        int iWflxmlrfwp2 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            iWflxmlrfwp2 += wflxmlrfwp(cdpycssgdhVarWkgbmnqykc, f109512gxszxtbevo, true);
        }
        if (i15 != 0) {
            atomicInteger.set(wflxmlrfwp(cdpycssgdhVarWkgbmnqykc, f109514lqeggnwhkg, true));
        }
        return new zoijcleaow("audio/vnd.dts.uhd;profile=p2", 2, i16, iWflxmlrfwp + iWflxmlrfwp2 + (atomicInteger.get() != 0 ? wflxmlrfwp(cdpycssgdhVarWkgbmnqykc, f109515nufgyqmvbu, true) : 0), j13, 0);
    }

    public static int gxszxtbevo(ByteBuffer byteBuffer) {
        int i13;
        byte b13;
        int i14;
        byte b14;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return UserVerificationMethods.USER_VERIFY_ALL;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b15 = byteBuffer.get(iPosition);
        if (b15 != -2) {
            if (b15 == -1) {
                i13 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b14 = byteBuffer.get(iPosition + 7);
            } else if (b15 != 31) {
                i13 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b13 = byteBuffer.get(iPosition + 5);
            } else {
                i13 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b14 = byteBuffer.get(iPosition + 6);
            }
            i14 = b14 & 60;
            return (((i14 >> 2) | i13) + 1) * 32;
        }
        i13 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b13 = byteBuffer.get(iPosition + 4);
        i14 = b13 & 252;
        return (((i14 >> 2) | i13) + 1) * 32;
    }

    private static void iobyxmoadg(byte[] bArr, int i13) throws ParserException {
        int i14 = i13 - 2;
        if (((bArr[i13 - 1] & 255) | ((bArr[i14] << 8) & 65535)) != y2.stevsuqkhv.yggfygwlhe(bArr, 0, i14, 65535)) {
            throw ParserException.iobyxmoadg("CRC check failed", null);
        }
    }

    public static int lqeggnwhkg(byte[] bArr) {
        int i13;
        byte b13;
        int i14;
        byte b14;
        byte b15 = bArr[0];
        if (b15 != -2) {
            if (b15 == -1) {
                i13 = (bArr[4] & 7) << 4;
                b14 = bArr[7];
            } else if (b15 != 31) {
                i13 = (bArr[4] & 1) << 6;
                b13 = bArr[5];
            } else {
                i13 = (bArr[5] & 7) << 4;
                b14 = bArr[6];
            }
            i14 = b14 & 60;
            return (((i14 >> 2) | i13) + 1) * 32;
        }
        i13 = (bArr[5] & 1) << 6;
        b13 = bArr[4];
        i14 = b13 & 252;
        return (((i14 >> 2) | i13) + 1) * 32;
    }

    public static androidx.media3.common.iobyxmoadg nufgyqmvbu(byte[] bArr, String str, String str2, int i13, String str3, DrmInitData drmInitData) {
        y2.cdpycssgdh cdpycssgdhVarWkgbmnqykc = wkgbmnqykc(bArr);
        cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(60);
        int i14 = f109513iobyxmoadg[cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(6)];
        int i15 = f109518zoijcleaow[cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(4)];
        int iNufgyqmvbu = cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(5);
        int[] iArr = f109516ppxfxbqfkf;
        int i16 = iNufgyqmvbu >= iArr.length ? -1 : (iArr[iNufgyqmvbu] * 1000) / 2;
        cdpycssgdhVarWkgbmnqykc.oxmwwwfdhm(10);
        return new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(str).ntlheqmsrt(str3).zeieaojujs("audio/vnd.dts").stevsuqkhv(i16).kegysxyocb(i14 + (cdpycssgdhVarWkgbmnqykc.nufgyqmvbu(2) > 0 ? 1 : 0)).nuxfzjnpeb(i15).jlmebxxoox(drmInitData).uwvvkdfqfp(str2).weqkydbzbr(i13).cllcsxoeiz();
    }

    public static int ppxfxbqfkf(int i13) {
        if (i13 == 2147385345 || i13 == -25230976 || i13 == 536864768 || i13 == -14745368) {
            return 1;
        }
        if (i13 == 1683496997 || i13 == 622876772) {
            return 2;
        }
        if (i13 == 1078008818 || i13 == -233094848) {
            return 3;
        }
        return (i13 == 1908687592 || i13 == -398277519) ? 4 : 0;
    }

    private static int wflxmlrfwp(y2.cdpycssgdh cdpycssgdhVar, int[] iArr, boolean z13) {
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < 3 && cdpycssgdhVar.lqeggnwhkg(); i15++) {
            i14++;
        }
        if (z13) {
            int i16 = 0;
            while (i13 < i14) {
                i16 += 1 << iArr[i13];
                i13++;
            }
            i13 = i16;
        }
        return i13 + cdpycssgdhVar.nufgyqmvbu(iArr[i14]);
    }

    private static y2.cdpycssgdh wkgbmnqykc(byte[] bArr) {
        byte b13 = bArr[0];
        if (b13 == 127 || b13 == 100 || b13 == 64 || b13 == 113) {
            return new y2.cdpycssgdh(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (eablkybsjg(bArrCopyOf)) {
            for (int i13 = 0; i13 < bArrCopyOf.length - 1; i13 += 2) {
                byte b14 = bArrCopyOf[i13];
                int i14 = i13 + 1;
                bArrCopyOf[i13] = bArrCopyOf[i14];
                bArrCopyOf[i14] = b14;
            }
        }
        y2.cdpycssgdh cdpycssgdhVar = new y2.cdpycssgdh(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            y2.cdpycssgdh cdpycssgdhVar2 = new y2.cdpycssgdh(bArrCopyOf);
            while (cdpycssgdhVar2.zoijcleaow() >= 16) {
                cdpycssgdhVar2.oxmwwwfdhm(2);
                cdpycssgdhVar.gxszxtbevo(cdpycssgdhVar2.nufgyqmvbu(14), 14);
            }
        }
        cdpycssgdhVar.agtfadlqog(bArrCopyOf);
        return cdpycssgdhVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int zoijcleaow(byte[] bArr) {
        int i13;
        byte b13;
        int i14;
        int i15;
        byte b14;
        boolean z13 = false;
        byte b15 = bArr[0];
        if (b15 != -2) {
            if (b15 == -1) {
                i15 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b14 = bArr[9];
            } else if (b15 != 31) {
                i13 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b13 = bArr[7];
            } else {
                i15 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b14 = bArr[8];
            }
            i14 = (((b14 & 60) >> 2) | i15) + 1;
            z13 = true;
            if (z13) {
                return (i14 * 16) / 14;
            }
            return i14;
        }
        i13 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b13 = bArr[6];
        i14 = (((b13 & 240) >> 4) | i13) + 1;
        if (z13) {
            return (i14 * 16) / 14;
        }
        return i14;
    }
}
