package t3;

import androidx.media3.common.DrmInitData;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f109574iobyxmoadg = {1, 2, 3, 6};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[] f109577zoijcleaow = {48000, 44100, 32000};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int[] f109575ppxfxbqfkf = {24000, 22050, 16000};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[] f109576wkgbmnqykc = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int[] f109572eablkybsjg = {32, 40, 48, 56, 64, 80, 96, 112, UserVerificationMethods.USER_VERIFY_PATTERN, 160, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 320, 384, 448, UserVerificationMethods.USER_VERIFY_NONE, 576, 640};

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int[] f109573gxszxtbevo = {69, 87, 104, 121, 139, 174, OrderServiceErrorHandlerImpl.ORDER_STATUS_INCORRECT, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: t3.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2690zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final int f109578eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final int f109579gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f109580iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public final int f109581lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f109582ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f109583wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f109584zoijcleaow;

        private C2690zoijcleaow(String str, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f109580iobyxmoadg = str;
            this.f109584zoijcleaow = i13;
            this.f109583wkgbmnqykc = i14;
            this.f109582ppxfxbqfkf = i15;
            this.f109578eablkybsjg = i16;
            this.f109579gxszxtbevo = i17;
            this.f109581lqeggnwhkg = i18;
        }
    }

    public static int btonecajqb(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b13 = bArr[7];
            if ((b13 & 254) == 186) {
                return 40 << ((bArr[(b13 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int dxjokdxxww(ByteBuffer byteBuffer, int i13) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i13) + ((byteBuffer.get((byteBuffer.position() + i13) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int eablkybsjg(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f109574iobyxmoadg[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        return 1536;
    }

    public static C2690zoijcleaow gxszxtbevo(y2.cdpycssgdh cdpycssgdhVar) {
        int i13;
        int i14;
        String str;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int iEablkybsjg = cdpycssgdhVar.eablkybsjg();
        cdpycssgdhVar.oxmwwwfdhm(40);
        boolean z13 = cdpycssgdhVar.nufgyqmvbu(5) > 10;
        cdpycssgdhVar.rgvfuqvkyq(iEablkybsjg);
        int i28 = -1;
        if (z13) {
            cdpycssgdhVar.oxmwwwfdhm(16);
            int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(2);
            if (iNufgyqmvbu == 0) {
                i28 = 0;
            } else if (iNufgyqmvbu == 1) {
                i28 = 1;
            } else if (iNufgyqmvbu == 2) {
                i28 = 2;
            }
            cdpycssgdhVar.oxmwwwfdhm(3);
            int iNufgyqmvbu2 = (cdpycssgdhVar.nufgyqmvbu(11) + 1) * 2;
            int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(2);
            if (iNufgyqmvbu3 == 3) {
                i23 = f109575ppxfxbqfkf[cdpycssgdhVar.nufgyqmvbu(2)];
                i19 = 3;
                i24 = 6;
            } else {
                int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(2);
                int i29 = f109574iobyxmoadg[iNufgyqmvbu4];
                i19 = iNufgyqmvbu4;
                i23 = f109577zoijcleaow[iNufgyqmvbu3];
                i24 = i29;
            }
            int i33 = i24 * UserVerificationMethods.USER_VERIFY_HANDPRINT;
            int iIobyxmoadg = iobyxmoadg(iNufgyqmvbu2, i23, i24);
            int iNufgyqmvbu5 = cdpycssgdhVar.nufgyqmvbu(3);
            boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
            i13 = f109576wkgbmnqykc[iNufgyqmvbu5] + (zLqeggnwhkg ? 1 : 0);
            cdpycssgdhVar.oxmwwwfdhm(10);
            if (cdpycssgdhVar.lqeggnwhkg()) {
                cdpycssgdhVar.oxmwwwfdhm(8);
            }
            if (iNufgyqmvbu5 == 0) {
                cdpycssgdhVar.oxmwwwfdhm(5);
                if (cdpycssgdhVar.lqeggnwhkg()) {
                    cdpycssgdhVar.oxmwwwfdhm(8);
                }
            }
            if (i28 == 1 && cdpycssgdhVar.lqeggnwhkg()) {
                cdpycssgdhVar.oxmwwwfdhm(16);
            }
            if (cdpycssgdhVar.lqeggnwhkg()) {
                if (iNufgyqmvbu5 > 2) {
                    cdpycssgdhVar.oxmwwwfdhm(2);
                }
                if ((iNufgyqmvbu5 & 1) == 0 || iNufgyqmvbu5 <= 2) {
                    i26 = 6;
                } else {
                    i26 = 6;
                    cdpycssgdhVar.oxmwwwfdhm(6);
                }
                if ((iNufgyqmvbu5 & 4) != 0) {
                    cdpycssgdhVar.oxmwwwfdhm(i26);
                }
                if (zLqeggnwhkg && cdpycssgdhVar.lqeggnwhkg()) {
                    cdpycssgdhVar.oxmwwwfdhm(5);
                }
                if (i28 == 0) {
                    if (cdpycssgdhVar.lqeggnwhkg()) {
                        i27 = 6;
                        cdpycssgdhVar.oxmwwwfdhm(6);
                    } else {
                        i27 = 6;
                    }
                    if (iNufgyqmvbu5 == 0 && cdpycssgdhVar.lqeggnwhkg()) {
                        cdpycssgdhVar.oxmwwwfdhm(i27);
                    }
                    if (cdpycssgdhVar.lqeggnwhkg()) {
                        cdpycssgdhVar.oxmwwwfdhm(i27);
                    }
                    int iNufgyqmvbu6 = cdpycssgdhVar.nufgyqmvbu(2);
                    if (iNufgyqmvbu6 == 1) {
                        cdpycssgdhVar.oxmwwwfdhm(5);
                    } else if (iNufgyqmvbu6 == 2) {
                        cdpycssgdhVar.oxmwwwfdhm(12);
                    } else if (iNufgyqmvbu6 == 3) {
                        int iNufgyqmvbu7 = cdpycssgdhVar.nufgyqmvbu(5);
                        if (cdpycssgdhVar.lqeggnwhkg()) {
                            cdpycssgdhVar.oxmwwwfdhm(5);
                            if (cdpycssgdhVar.lqeggnwhkg()) {
                                cdpycssgdhVar.oxmwwwfdhm(4);
                            }
                            if (cdpycssgdhVar.lqeggnwhkg()) {
                                cdpycssgdhVar.oxmwwwfdhm(4);
                            }
                            if (cdpycssgdhVar.lqeggnwhkg()) {
                                cdpycssgdhVar.oxmwwwfdhm(4);
                            }
                            if (cdpycssgdhVar.lqeggnwhkg()) {
                                cdpycssgdhVar.oxmwwwfdhm(4);
                            }
                            if (cdpycssgdhVar.lqeggnwhkg()) {
                                cdpycssgdhVar.oxmwwwfdhm(4);
                            }
                            if (cdpycssgdhVar.lqeggnwhkg()) {
                                cdpycssgdhVar.oxmwwwfdhm(4);
                            }
                            if (cdpycssgdhVar.lqeggnwhkg()) {
                                cdpycssgdhVar.oxmwwwfdhm(4);
                            }
                            if (cdpycssgdhVar.lqeggnwhkg()) {
                                if (cdpycssgdhVar.lqeggnwhkg()) {
                                    cdpycssgdhVar.oxmwwwfdhm(4);
                                }
                                if (cdpycssgdhVar.lqeggnwhkg()) {
                                    cdpycssgdhVar.oxmwwwfdhm(4);
                                }
                            }
                        }
                        if (cdpycssgdhVar.lqeggnwhkg()) {
                            cdpycssgdhVar.oxmwwwfdhm(5);
                            if (cdpycssgdhVar.lqeggnwhkg()) {
                                cdpycssgdhVar.oxmwwwfdhm(7);
                                if (cdpycssgdhVar.lqeggnwhkg()) {
                                    cdpycssgdhVar.oxmwwwfdhm(8);
                                }
                            }
                        }
                        cdpycssgdhVar.oxmwwwfdhm((iNufgyqmvbu7 + 2) * 8);
                        cdpycssgdhVar.ppxfxbqfkf();
                    }
                    if (iNufgyqmvbu5 < 2) {
                        if (cdpycssgdhVar.lqeggnwhkg()) {
                            cdpycssgdhVar.oxmwwwfdhm(14);
                        }
                        if (iNufgyqmvbu5 == 0 && cdpycssgdhVar.lqeggnwhkg()) {
                            cdpycssgdhVar.oxmwwwfdhm(14);
                        }
                    }
                    if (cdpycssgdhVar.lqeggnwhkg()) {
                        if (i19 == 0) {
                            cdpycssgdhVar.oxmwwwfdhm(5);
                        } else {
                            for (int i34 = 0; i34 < i24; i34++) {
                                if (cdpycssgdhVar.lqeggnwhkg()) {
                                    cdpycssgdhVar.oxmwwwfdhm(5);
                                }
                            }
                        }
                    }
                }
            }
            if (cdpycssgdhVar.lqeggnwhkg()) {
                cdpycssgdhVar.oxmwwwfdhm(5);
                if (iNufgyqmvbu5 == 2) {
                    cdpycssgdhVar.oxmwwwfdhm(4);
                }
                if (iNufgyqmvbu5 >= 6) {
                    cdpycssgdhVar.oxmwwwfdhm(2);
                }
                if (cdpycssgdhVar.lqeggnwhkg()) {
                    cdpycssgdhVar.oxmwwwfdhm(8);
                }
                if (iNufgyqmvbu5 == 0 && cdpycssgdhVar.lqeggnwhkg()) {
                    cdpycssgdhVar.oxmwwwfdhm(8);
                }
                if (iNufgyqmvbu3 < 3) {
                    cdpycssgdhVar.vdvldrhtss();
                }
            }
            if (i28 == 0 && i19 != 3) {
                cdpycssgdhVar.vdvldrhtss();
            }
            if (i28 == 2 && (i19 == 3 || cdpycssgdhVar.lqeggnwhkg())) {
                i25 = 6;
                cdpycssgdhVar.oxmwwwfdhm(6);
            } else {
                i25 = 6;
            }
            str = (cdpycssgdhVar.lqeggnwhkg() && cdpycssgdhVar.nufgyqmvbu(i25) == 1 && cdpycssgdhVar.nufgyqmvbu(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i14 = i28;
            i15 = i33;
            i17 = iNufgyqmvbu2;
            i18 = i23;
            i16 = iIobyxmoadg;
        } else {
            cdpycssgdhVar.oxmwwwfdhm(32);
            int iNufgyqmvbu8 = cdpycssgdhVar.nufgyqmvbu(2);
            String str2 = iNufgyqmvbu8 == 3 ? null : "audio/ac3";
            int iNufgyqmvbu9 = cdpycssgdhVar.nufgyqmvbu(6);
            int i35 = f109572eablkybsjg[iNufgyqmvbu9 / 2] * 1000;
            int iPpxfxbqfkf = ppxfxbqfkf(iNufgyqmvbu8, iNufgyqmvbu9);
            cdpycssgdhVar.oxmwwwfdhm(8);
            int iNufgyqmvbu10 = cdpycssgdhVar.nufgyqmvbu(3);
            if ((iNufgyqmvbu10 & 1) != 0 && iNufgyqmvbu10 != 1) {
                cdpycssgdhVar.oxmwwwfdhm(2);
            }
            if ((iNufgyqmvbu10 & 4) != 0) {
                cdpycssgdhVar.oxmwwwfdhm(2);
            }
            if (iNufgyqmvbu10 == 2) {
                cdpycssgdhVar.oxmwwwfdhm(2);
            }
            int[] iArr = f109577zoijcleaow;
            int i36 = iNufgyqmvbu8 < iArr.length ? iArr[iNufgyqmvbu8] : -1;
            i13 = f109576wkgbmnqykc[iNufgyqmvbu10] + (cdpycssgdhVar.lqeggnwhkg() ? 1 : 0);
            i14 = -1;
            str = str2;
            i15 = 1536;
            i16 = i35;
            i17 = iPpxfxbqfkf;
            i18 = i36;
        }
        return new C2690zoijcleaow(str, i14, i13, i18, i17, i15, i16);
    }

    private static int iobyxmoadg(int i13, int i14, int i15) {
        return (i13 * i14) / (i15 * 32);
    }

    public static int lqeggnwhkg(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b13 = bArr[4];
        return ppxfxbqfkf((b13 & 192) >> 6, b13 & 63);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static androidx.media3.common.iobyxmoadg nufgyqmvbu(y2.yadqdtsiqt yadqdtsiqtVar, String str, String str2, DrmInitData drmInitData) {
        String str3;
        y2.cdpycssgdh cdpycssgdhVar = new y2.cdpycssgdh();
        cdpycssgdhVar.wflxmlrfwp(yadqdtsiqtVar);
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(13) * 1000;
        cdpycssgdhVar.oxmwwwfdhm(3);
        int i13 = f109577zoijcleaow[cdpycssgdhVar.nufgyqmvbu(2)];
        cdpycssgdhVar.oxmwwwfdhm(10);
        int i14 = f109576wkgbmnqykc[cdpycssgdhVar.nufgyqmvbu(3)];
        if (cdpycssgdhVar.nufgyqmvbu(1) != 0) {
            i14++;
        }
        cdpycssgdhVar.oxmwwwfdhm(3);
        int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(4);
        cdpycssgdhVar.oxmwwwfdhm(1);
        if (iNufgyqmvbu2 > 0) {
            cdpycssgdhVar.oxmwwwfdhm(6);
            if (cdpycssgdhVar.nufgyqmvbu(1) != 0) {
                i14 += 2;
            }
            cdpycssgdhVar.oxmwwwfdhm(1);
        }
        if (cdpycssgdhVar.zoijcleaow() > 7) {
            cdpycssgdhVar.oxmwwwfdhm(7);
            if (cdpycssgdhVar.nufgyqmvbu(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        cdpycssgdhVar.ppxfxbqfkf();
        yadqdtsiqtVar.sopmlzcsov(cdpycssgdhVar.wkgbmnqykc());
        return new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(str).zeieaojujs(str3).kegysxyocb(i14).nuxfzjnpeb(i13).jlmebxxoox(drmInitData).uwvvkdfqfp(str2).bfopjjpdmp(iNufgyqmvbu).cllcsxoeiz();
    }

    private static int ppxfxbqfkf(int i13, int i14) {
        int i15 = i14 / 2;
        if (i13 < 0) {
            return -1;
        }
        int[] iArr = f109577zoijcleaow;
        if (i13 >= iArr.length || i14 < 0) {
            return -1;
        }
        int[] iArr2 = f109573gxszxtbevo;
        if (i15 >= iArr2.length) {
            return -1;
        }
        int i16 = iArr[i13];
        if (i16 == 44100) {
            return (iArr2[i15] + (i14 % 2)) * 2;
        }
        int i17 = f109572eablkybsjg[i15];
        return i16 == 32000 ? i17 * 6 : i17 * 4;
    }

    public static androidx.media3.common.iobyxmoadg wkgbmnqykc(y2.yadqdtsiqt yadqdtsiqtVar, String str, String str2, DrmInitData drmInitData) {
        y2.cdpycssgdh cdpycssgdhVar = new y2.cdpycssgdh();
        cdpycssgdhVar.wflxmlrfwp(yadqdtsiqtVar);
        int i13 = f109577zoijcleaow[cdpycssgdhVar.nufgyqmvbu(2)];
        cdpycssgdhVar.oxmwwwfdhm(8);
        int i14 = f109576wkgbmnqykc[cdpycssgdhVar.nufgyqmvbu(3)];
        if (cdpycssgdhVar.nufgyqmvbu(1) != 0) {
            i14++;
        }
        int i15 = f109572eablkybsjg[cdpycssgdhVar.nufgyqmvbu(5)] * 1000;
        cdpycssgdhVar.ppxfxbqfkf();
        yadqdtsiqtVar.sopmlzcsov(cdpycssgdhVar.wkgbmnqykc());
        return new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(str).zeieaojujs("audio/ac3").kegysxyocb(i14).nuxfzjnpeb(i13).jlmebxxoox(drmInitData).uwvvkdfqfp(str2).stevsuqkhv(i15).bfopjjpdmp(i15).cllcsxoeiz();
    }

    public static int zoijcleaow(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i13 = iPosition; i13 <= iLimit; i13++) {
            if ((y2.stevsuqkhv.dsvhmnatus(byteBuffer, i13 + 4) & (-2)) == -126718022) {
                return i13 - iPosition;
            }
        }
        return -1;
    }
}
