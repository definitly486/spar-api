package t3;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f109531iobyxmoadg = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST, OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST, 2048};

    /* JADX INFO: renamed from: t3.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2689ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final int f109532eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f109533iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f109534ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f109535wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f109536zoijcleaow;

        private C2689ppxfxbqfkf(int i13, int i14, int i15, int i16, int i17) {
            this.f109533iobyxmoadg = i13;
            this.f109534ppxfxbqfkf = i14;
            this.f109536zoijcleaow = i15;
            this.f109535wkgbmnqykc = i16;
            this.f109532eablkybsjg = i17;
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public int f109537eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public int f109538gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public boolean f109539iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f109540ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public boolean f109541wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f109542zoijcleaow;

        private zoijcleaow() {
            this.f109539iobyxmoadg = true;
            this.f109542zoijcleaow = -1;
            this.f109540ppxfxbqfkf = -1;
            this.f109541wkgbmnqykc = true;
            this.f109537eablkybsjg = 2;
            this.f109538gxszxtbevo = 0;
        }
    }

    private static int btonecajqb(y2.cdpycssgdh cdpycssgdhVar, int i13) {
        int i14 = 0;
        while (true) {
            int iNufgyqmvbu = i14 + cdpycssgdhVar.nufgyqmvbu(i13);
            if (!cdpycssgdhVar.lqeggnwhkg()) {
                return iNufgyqmvbu;
            }
            i14 = (iNufgyqmvbu + 1) << i13;
        }
    }

    private static void draadjrbmk(y2.cdpycssgdh cdpycssgdhVar) throws ParserException {
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(6);
        if (iNufgyqmvbu < 2 || iNufgyqmvbu > 42) {
            throw ParserException.lqeggnwhkg(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iNufgyqmvbu)));
        }
        cdpycssgdhVar.oxmwwwfdhm(iNufgyqmvbu * 8);
    }

    private static void dxjokdxxww(y2.cdpycssgdh cdpycssgdhVar, zoijcleaow zoijcleaowVar) throws ParserException {
        cdpycssgdhVar.oxmwwwfdhm(2);
        boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(8);
        for (int i13 = 0; i13 < iNufgyqmvbu; i13++) {
            cdpycssgdhVar.oxmwwwfdhm(2);
            if (cdpycssgdhVar.lqeggnwhkg()) {
                cdpycssgdhVar.oxmwwwfdhm(5);
            }
            if (zLqeggnwhkg) {
                cdpycssgdhVar.oxmwwwfdhm(24);
            } else {
                if (cdpycssgdhVar.lqeggnwhkg()) {
                    if (!cdpycssgdhVar.lqeggnwhkg()) {
                        cdpycssgdhVar.oxmwwwfdhm(4);
                    }
                    zoijcleaowVar.f109540ppxfxbqfkf = cdpycssgdhVar.nufgyqmvbu(6) + 1;
                }
                cdpycssgdhVar.oxmwwwfdhm(4);
            }
        }
        if (cdpycssgdhVar.lqeggnwhkg()) {
            cdpycssgdhVar.oxmwwwfdhm(3);
            if (cdpycssgdhVar.lqeggnwhkg()) {
                draadjrbmk(cdpycssgdhVar);
            }
        }
    }

    public static int eablkybsjg(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return gxszxtbevo(new y2.cdpycssgdh(bArr)).f109532eablkybsjg;
    }

    private static boolean gtknphoqwx(y2.cdpycssgdh cdpycssgdhVar) {
        if (cdpycssgdhVar.zoijcleaow() < 66) {
            return false;
        }
        cdpycssgdhVar.oxmwwwfdhm(66);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static C2689ppxfxbqfkf gxszxtbevo(y2.cdpycssgdh cdpycssgdhVar) {
        int i13;
        int i14;
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(16);
        int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(16);
        if (iNufgyqmvbu2 == 65535) {
            iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(24);
            i13 = 7;
        } else {
            i13 = 4;
        }
        int i15 = iNufgyqmvbu2 + i13;
        if (iNufgyqmvbu == 44097) {
            i15 += 2;
        }
        int i16 = i15;
        int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(2);
        if (iNufgyqmvbu3 == 3) {
            iNufgyqmvbu3 += btonecajqb(cdpycssgdhVar, 2);
        }
        int i17 = iNufgyqmvbu3;
        int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(10);
        if (cdpycssgdhVar.lqeggnwhkg() && cdpycssgdhVar.nufgyqmvbu(3) > 0) {
            cdpycssgdhVar.oxmwwwfdhm(2);
        }
        int i18 = cdpycssgdhVar.lqeggnwhkg() ? 48000 : 44100;
        int iNufgyqmvbu5 = cdpycssgdhVar.nufgyqmvbu(4);
        if (i18 == 44100 && iNufgyqmvbu5 == 13) {
            i14 = f109531iobyxmoadg[iNufgyqmvbu5];
        } else if (i18 == 48000) {
            int[] iArr = f109531iobyxmoadg;
            if (iNufgyqmvbu5 < iArr.length) {
                int i19 = iArr[iNufgyqmvbu5];
                int i23 = iNufgyqmvbu4 % 5;
                if (i23 == 1) {
                    if (iNufgyqmvbu5 != 3 || iNufgyqmvbu5 == 8) {
                        i19++;
                    }
                } else if (i23 != 2) {
                    if (i23 != 3) {
                        if (i23 == 4 && (iNufgyqmvbu5 == 3 || iNufgyqmvbu5 == 8 || iNufgyqmvbu5 == 11)) {
                            i19++;
                        }
                    } else if (iNufgyqmvbu5 != 3) {
                        i19++;
                    } else {
                        i19++;
                    }
                } else if (iNufgyqmvbu5 == 8 || iNufgyqmvbu5 == 11) {
                    i19++;
                }
                i14 = i19;
            } else {
                i14 = 0;
            }
        } else {
            i14 = 0;
        }
        return new C2689ppxfxbqfkf(i17, 2, i18, i16, i14);
    }

    public static void iobyxmoadg(int i13, y2.yadqdtsiqt yadqdtsiqtVar) {
        yadqdtsiqtVar.tzroggbefp(7);
        byte[] bArrEablkybsjg = yadqdtsiqtVar.eablkybsjg();
        bArrEablkybsjg[0] = -84;
        bArrEablkybsjg[1] = 64;
        bArrEablkybsjg[2] = -1;
        bArrEablkybsjg[3] = -1;
        bArrEablkybsjg[4] = (byte) ((i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArrEablkybsjg[5] = (byte) ((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArrEablkybsjg[6] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int lqeggnwhkg(byte[] bArr, int i13) {
        int i14 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i15 == 65535) {
            i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i14 = 4;
        }
        if (i13 == 44097) {
            i14 += 2;
        }
        return i15 + i14;
    }

    private static void nufgyqmvbu(y2.cdpycssgdh cdpycssgdhVar, zoijcleaow zoijcleaowVar) throws ParserException {
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(5);
        cdpycssgdhVar.oxmwwwfdhm(2);
        if (cdpycssgdhVar.lqeggnwhkg()) {
            cdpycssgdhVar.oxmwwwfdhm(5);
        }
        if (iNufgyqmvbu >= 7 && iNufgyqmvbu <= 10) {
            cdpycssgdhVar.vdvldrhtss();
        }
        if (cdpycssgdhVar.lqeggnwhkg()) {
            int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(3);
            if (zoijcleaowVar.f109542zoijcleaow == -1 && iNufgyqmvbu >= 0 && iNufgyqmvbu <= 15 && (iNufgyqmvbu2 == 0 || iNufgyqmvbu2 == 1)) {
                zoijcleaowVar.f109542zoijcleaow = iNufgyqmvbu;
            }
            if (cdpycssgdhVar.lqeggnwhkg()) {
                draadjrbmk(cdpycssgdhVar);
            }
        }
    }

    private static int ppxfxbqfkf(int i13) {
        switch (i13) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    public static androidx.media3.common.iobyxmoadg wkgbmnqykc(y2.yadqdtsiqt yadqdtsiqtVar, String str, String str2, DrmInitData drmInitData) throws ParserException {
        int iZoijcleaow;
        boolean zLqeggnwhkg;
        int iNufgyqmvbu;
        int iNufgyqmvbu2;
        int iNufgyqmvbu3;
        int iZoijcleaow2;
        boolean z13;
        boolean zLqeggnwhkg2;
        int i13;
        y2.cdpycssgdh cdpycssgdhVar = new y2.cdpycssgdh();
        cdpycssgdhVar.wflxmlrfwp(yadqdtsiqtVar);
        int iZoijcleaow3 = cdpycssgdhVar.zoijcleaow();
        int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(3);
        if (iNufgyqmvbu4 > 1) {
            throw ParserException.lqeggnwhkg("Unsupported AC-4 DSI version: " + iNufgyqmvbu4);
        }
        int iNufgyqmvbu5 = cdpycssgdhVar.nufgyqmvbu(7);
        int i14 = cdpycssgdhVar.lqeggnwhkg() ? 48000 : 44100;
        cdpycssgdhVar.oxmwwwfdhm(4);
        int iNufgyqmvbu6 = cdpycssgdhVar.nufgyqmvbu(9);
        if (iNufgyqmvbu5 > 1) {
            if (iNufgyqmvbu4 == 0) {
                throw ParserException.lqeggnwhkg("Invalid AC-4 DSI version: " + iNufgyqmvbu4);
            }
            if (cdpycssgdhVar.lqeggnwhkg()) {
                cdpycssgdhVar.oxmwwwfdhm(16);
                if (cdpycssgdhVar.lqeggnwhkg()) {
                    cdpycssgdhVar.oxmwwwfdhm(UserVerificationMethods.USER_VERIFY_PATTERN);
                }
            }
        }
        if (iNufgyqmvbu4 == 1) {
            if (!gtknphoqwx(cdpycssgdhVar)) {
                throw ParserException.lqeggnwhkg("Invalid AC-4 DSI bitrate.");
            }
            cdpycssgdhVar.ppxfxbqfkf();
        }
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        int i15 = 0;
        while (true) {
            if (i15 < iNufgyqmvbu6) {
                if (iNufgyqmvbu4 == 0) {
                    zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
                    iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(5);
                    iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(5);
                    iNufgyqmvbu3 = 0;
                    iZoijcleaow2 = 0;
                    z13 = false;
                } else {
                    int iNufgyqmvbu7 = cdpycssgdhVar.nufgyqmvbu(8);
                    iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(8);
                    if (iNufgyqmvbu3 == 255) {
                        iNufgyqmvbu3 += cdpycssgdhVar.nufgyqmvbu(16);
                    }
                    if (iNufgyqmvbu7 > 2) {
                        cdpycssgdhVar.oxmwwwfdhm(iNufgyqmvbu3 * 8);
                        i15++;
                    } else {
                        iZoijcleaow2 = (iZoijcleaow3 - cdpycssgdhVar.zoijcleaow()) / 8;
                        int iNufgyqmvbu8 = cdpycssgdhVar.nufgyqmvbu(5);
                        z13 = iNufgyqmvbu8 == 31;
                        iNufgyqmvbu2 = iNufgyqmvbu7;
                        iNufgyqmvbu = iNufgyqmvbu8;
                        zLqeggnwhkg = false;
                    }
                }
                if (zLqeggnwhkg || z13 || iNufgyqmvbu != 6) {
                    zoijcleaowVar.f109538gxszxtbevo = cdpycssgdhVar.nufgyqmvbu(3);
                    if (cdpycssgdhVar.lqeggnwhkg()) {
                        cdpycssgdhVar.oxmwwwfdhm(5);
                    }
                    cdpycssgdhVar.oxmwwwfdhm(2);
                    if (iNufgyqmvbu4 == 1 && (iNufgyqmvbu2 == 1 || iNufgyqmvbu2 == 2)) {
                        cdpycssgdhVar.oxmwwwfdhm(2);
                    }
                    cdpycssgdhVar.oxmwwwfdhm(5);
                    cdpycssgdhVar.oxmwwwfdhm(10);
                    if (iNufgyqmvbu4 == 1) {
                        if (iNufgyqmvbu2 > 0) {
                            zoijcleaowVar.f109539iobyxmoadg = cdpycssgdhVar.lqeggnwhkg();
                        }
                        if (zoijcleaowVar.f109539iobyxmoadg) {
                            if (iNufgyqmvbu2 == 1 || iNufgyqmvbu2 == 2) {
                                int iNufgyqmvbu9 = cdpycssgdhVar.nufgyqmvbu(5);
                                if (iNufgyqmvbu9 >= 0 && iNufgyqmvbu9 <= 15) {
                                    zoijcleaowVar.f109542zoijcleaow = iNufgyqmvbu9;
                                }
                                if (iNufgyqmvbu9 >= 11 && iNufgyqmvbu9 <= 14) {
                                    zoijcleaowVar.f109541wkgbmnqykc = cdpycssgdhVar.lqeggnwhkg();
                                    zoijcleaowVar.f109537eablkybsjg = cdpycssgdhVar.nufgyqmvbu(2);
                                }
                            }
                            cdpycssgdhVar.oxmwwwfdhm(24);
                            i13 = 1;
                        } else {
                            i13 = 1;
                        }
                        if (iNufgyqmvbu2 == i13 || iNufgyqmvbu2 == 2) {
                            if (cdpycssgdhVar.lqeggnwhkg() && cdpycssgdhVar.lqeggnwhkg()) {
                                cdpycssgdhVar.oxmwwwfdhm(2);
                            }
                            if (cdpycssgdhVar.lqeggnwhkg()) {
                                cdpycssgdhVar.vdvldrhtss();
                                int i16 = 8;
                                int iNufgyqmvbu10 = cdpycssgdhVar.nufgyqmvbu(8);
                                int i17 = 0;
                                while (i17 < iNufgyqmvbu10) {
                                    cdpycssgdhVar.oxmwwwfdhm(i16);
                                    i17++;
                                    i16 = 8;
                                }
                            }
                        }
                    }
                    if (!zLqeggnwhkg && !z13) {
                        cdpycssgdhVar.vdvldrhtss();
                        if (iNufgyqmvbu == 0 || iNufgyqmvbu == 1 || iNufgyqmvbu == 2) {
                            if (iNufgyqmvbu2 == 0) {
                                for (int i18 = 0; i18 < 2; i18++) {
                                    nufgyqmvbu(cdpycssgdhVar, zoijcleaowVar);
                                }
                            } else {
                                for (int i19 = 0; i19 < 2; i19++) {
                                    dxjokdxxww(cdpycssgdhVar, zoijcleaowVar);
                                }
                            }
                        } else if (iNufgyqmvbu == 3 || iNufgyqmvbu == 4) {
                            if (iNufgyqmvbu2 == 0) {
                                for (int i23 = 0; i23 < 3; i23++) {
                                    nufgyqmvbu(cdpycssgdhVar, zoijcleaowVar);
                                }
                            } else {
                                int i24 = 0;
                                for (int i25 = 3; i24 < i25; i25 = 3) {
                                    dxjokdxxww(cdpycssgdhVar, zoijcleaowVar);
                                    i24++;
                                }
                            }
                        } else if (iNufgyqmvbu != 5) {
                            int iNufgyqmvbu11 = cdpycssgdhVar.nufgyqmvbu(7);
                            for (int i26 = 0; i26 < iNufgyqmvbu11; i26++) {
                                cdpycssgdhVar.oxmwwwfdhm(8);
                            }
                        } else if (iNufgyqmvbu2 == 0) {
                            nufgyqmvbu(cdpycssgdhVar, zoijcleaowVar);
                        } else {
                            int iNufgyqmvbu12 = cdpycssgdhVar.nufgyqmvbu(3);
                            for (int i27 = 0; i27 < iNufgyqmvbu12 + 2; i27++) {
                                dxjokdxxww(cdpycssgdhVar, zoijcleaowVar);
                            }
                        }
                    } else if (iNufgyqmvbu2 == 0) {
                        nufgyqmvbu(cdpycssgdhVar, zoijcleaowVar);
                    } else {
                        dxjokdxxww(cdpycssgdhVar, zoijcleaowVar);
                    }
                    cdpycssgdhVar.vdvldrhtss();
                    zLqeggnwhkg2 = cdpycssgdhVar.lqeggnwhkg();
                } else {
                    zLqeggnwhkg2 = true;
                }
                if (zLqeggnwhkg2) {
                    int iNufgyqmvbu13 = cdpycssgdhVar.nufgyqmvbu(7);
                    for (int i28 = 0; i28 < iNufgyqmvbu13; i28++) {
                        cdpycssgdhVar.oxmwwwfdhm(15);
                    }
                }
                if (iNufgyqmvbu2 > 0) {
                    if (cdpycssgdhVar.lqeggnwhkg() && !gtknphoqwx(cdpycssgdhVar)) {
                        throw ParserException.lqeggnwhkg("Can't parse bitrate DSI.");
                    }
                    if (cdpycssgdhVar.lqeggnwhkg()) {
                        cdpycssgdhVar.ppxfxbqfkf();
                        cdpycssgdhVar.kcexrzcfyt(cdpycssgdhVar.nufgyqmvbu(16));
                        int iNufgyqmvbu14 = cdpycssgdhVar.nufgyqmvbu(5);
                        for (int i29 = 0; i29 < iNufgyqmvbu14; i29++) {
                            cdpycssgdhVar.oxmwwwfdhm(3);
                            cdpycssgdhVar.oxmwwwfdhm(8);
                        }
                    }
                }
                cdpycssgdhVar.ppxfxbqfkf();
                if (iNufgyqmvbu4 == 1) {
                    int iZoijcleaow4 = ((iZoijcleaow3 - cdpycssgdhVar.zoijcleaow()) / 8) - iZoijcleaow2;
                    if (iNufgyqmvbu3 < iZoijcleaow4) {
                        throw ParserException.lqeggnwhkg("pres_bytes is smaller than presentation bytes read.");
                    }
                    cdpycssgdhVar.kcexrzcfyt(iNufgyqmvbu3 - iZoijcleaow4);
                }
                if (zoijcleaowVar.f109539iobyxmoadg && zoijcleaowVar.f109542zoijcleaow == -1) {
                    throw ParserException.lqeggnwhkg("Can't determine channel mode of presentation " + i15);
                }
            }
            if (zoijcleaowVar.f109539iobyxmoadg) {
                iZoijcleaow = zoijcleaow(zoijcleaowVar.f109542zoijcleaow, zoijcleaowVar.f109541wkgbmnqykc, zoijcleaowVar.f109537eablkybsjg);
            } else {
                iZoijcleaow = zoijcleaowVar.f109540ppxfxbqfkf + 1;
                if (zoijcleaowVar.f109538gxszxtbevo == 4 && iZoijcleaow == 17) {
                    iZoijcleaow = 21;
                }
            }
            if (iZoijcleaow > 0) {
                return new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(str).zeieaojujs("audio/ac4").kegysxyocb(iZoijcleaow).nuxfzjnpeb(i14).jlmebxxoox(drmInitData).uwvvkdfqfp(str2).cllcsxoeiz();
            }
            throw ParserException.lqeggnwhkg("Can't determine channel count of presentation.");
        }
    }

    private static int zoijcleaow(int i13, boolean z13, int i14) {
        int iPpxfxbqfkf = ppxfxbqfkf(i13);
        if (i13 != 11 && i13 != 12 && i13 != 13 && i13 != 14) {
            return iPpxfxbqfkf;
        }
        if (!z13) {
            iPpxfxbqfkf -= 2;
        }
        if (i14 != 0) {
            return i14 != 1 ? iPpxfxbqfkf : iPpxfxbqfkf - 2;
        }
        return iPpxfxbqfkf - 4;
    }
}
