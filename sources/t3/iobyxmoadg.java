package t3;

import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f109436iobyxmoadg = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[] f109437zoijcleaow = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f109438iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final String f109439ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f109440zoijcleaow;

        private zoijcleaow(int i13, int i14, String str) {
            this.f109438iobyxmoadg = i13;
            this.f109440zoijcleaow = i14;
            this.f109439ppxfxbqfkf = str;
        }
    }

    public static zoijcleaow eablkybsjg(byte[] bArr) {
        return wkgbmnqykc(new y2.cdpycssgdh(bArr), false);
    }

    private static void gxszxtbevo(y2.cdpycssgdh cdpycssgdhVar, int i13, int i14) {
        if (cdpycssgdhVar.lqeggnwhkg()) {
            y2.kcexrzcfyt.nufgyqmvbu("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (cdpycssgdhVar.lqeggnwhkg()) {
            cdpycssgdhVar.oxmwwwfdhm(14);
        }
        boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
        if (i14 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i13 == 6 || i13 == 20) {
            cdpycssgdhVar.oxmwwwfdhm(3);
        }
        if (zLqeggnwhkg) {
            if (i13 == 22) {
                cdpycssgdhVar.oxmwwwfdhm(16);
            }
            if (i13 == 17 || i13 == 19 || i13 == 20 || i13 == 23) {
                cdpycssgdhVar.oxmwwwfdhm(3);
            }
            cdpycssgdhVar.oxmwwwfdhm(1);
        }
    }

    public static byte[] iobyxmoadg(int i13, int i14, int i15) {
        return new byte[]{(byte) (((i13 << 3) & 248) | ((i14 >> 1) & 7)), (byte) (((i14 << 7) & UserVerificationMethods.USER_VERIFY_PATTERN) | ((i15 << 3) & 120))};
    }

    private static int ppxfxbqfkf(y2.cdpycssgdh cdpycssgdhVar) throws ParserException {
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(4);
        if (iNufgyqmvbu == 15) {
            if (cdpycssgdhVar.zoijcleaow() >= 24) {
                return cdpycssgdhVar.nufgyqmvbu(24);
            }
            throw ParserException.iobyxmoadg("AAC header insufficient data", null);
        }
        if (iNufgyqmvbu < 13) {
            return f109436iobyxmoadg[iNufgyqmvbu];
        }
        throw ParserException.iobyxmoadg("AAC header wrong Sampling Frequency Index", null);
    }

    public static zoijcleaow wkgbmnqykc(y2.cdpycssgdh cdpycssgdhVar, boolean z13) throws ParserException {
        int iZoijcleaow = zoijcleaow(cdpycssgdhVar);
        int iPpxfxbqfkf = ppxfxbqfkf(cdpycssgdhVar);
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(4);
        String str = "mp4a.40." + iZoijcleaow;
        if (iZoijcleaow == 5 || iZoijcleaow == 29) {
            iPpxfxbqfkf = ppxfxbqfkf(cdpycssgdhVar);
            iZoijcleaow = zoijcleaow(cdpycssgdhVar);
            if (iZoijcleaow == 22) {
                iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(4);
            }
        }
        if (z13) {
            if (iZoijcleaow != 1 && iZoijcleaow != 2 && iZoijcleaow != 3 && iZoijcleaow != 4 && iZoijcleaow != 6 && iZoijcleaow != 7 && iZoijcleaow != 17) {
                switch (iZoijcleaow) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.lqeggnwhkg("Unsupported audio object type: " + iZoijcleaow);
                }
            }
            gxszxtbevo(cdpycssgdhVar, iZoijcleaow, iNufgyqmvbu);
            switch (iZoijcleaow) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(2);
                    if (iNufgyqmvbu2 == 2 || iNufgyqmvbu2 == 3) {
                        throw ParserException.lqeggnwhkg("Unsupported epConfig: " + iNufgyqmvbu2);
                    }
                    break;
            }
        }
        int i13 = f109437zoijcleaow[iNufgyqmvbu];
        if (i13 != -1) {
            return new zoijcleaow(iPpxfxbqfkf, i13, str);
        }
        throw ParserException.iobyxmoadg(null, null);
    }

    private static int zoijcleaow(y2.cdpycssgdh cdpycssgdhVar) {
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(5);
        return iNufgyqmvbu == 31 ? cdpycssgdhVar.nufgyqmvbu(6) + 32 : iNufgyqmvbu;
    }
}
