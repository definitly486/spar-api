package h4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.zdlpuopuiu;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinVersion;
import v2.iwizpuwonk;
import v2.jyumaefscl;
import y2.cdpycssgdh;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu extends c4.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f39361zoijcleaow = new iobyxmoadg() { // from class: h4.lqeggnwhkg
        @Override // h4.nufgyqmvbu.iobyxmoadg
        public final boolean iobyxmoadg(int i13, int i14, int i15, int i16, int i17) {
            return nufgyqmvbu.pmvmpeiblj(i13, i14, i15, i16, i17);
        }
    };

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f39362iobyxmoadg;

    public interface iobyxmoadg {
        boolean iobyxmoadg(int i13, int i14, int i15, int i16, int i17);
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f39363iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f39364ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f39365zoijcleaow;

        public zoijcleaow(int i13, boolean z13, int i14) {
            this.f39363iobyxmoadg = i13;
            this.f39365zoijcleaow = z13;
            this.f39364ppxfxbqfkf = i14;
        }
    }

    public nufgyqmvbu() {
        this(null);
    }

    private static draadjrbmk agtfadlqog(yadqdtsiqt yadqdtsiqtVar, int i13) {
        int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        int iHcddaimhww = yadqdtsiqtVar.hcddaimhww();
        int iHcddaimhww2 = yadqdtsiqtVar.hcddaimhww();
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
        cdpycssgdh cdpycssgdhVar = new cdpycssgdh();
        cdpycssgdhVar.wflxmlrfwp(yadqdtsiqtVar);
        int i14 = ((i13 - 10) * 8) / (iWwaezpbzkn + iWwaezpbzkn2);
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(iWwaezpbzkn);
            int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(iWwaezpbzkn2);
            iArr[i15] = iNufgyqmvbu;
            iArr2[i15] = iNufgyqmvbu2;
        }
        return new draadjrbmk(iWypolnanlu, iHcddaimhww, iHcddaimhww2, iArr, iArr2);
    }

    private static eablkybsjg btonecajqb(yadqdtsiqt yadqdtsiqtVar, int i13) {
        if (i13 < 4) {
            return null;
        }
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        Charset charsetIwizpuwonk = iwizpuwonk(iWwaezpbzkn);
        byte[] bArr = new byte[3];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i14 = i13 - 4;
        byte[] bArr2 = new byte[i14];
        yadqdtsiqtVar.draadjrbmk(bArr2, 0, i14);
        int iEsjtqupxsv = esjtqupxsv(bArr2, 0, iWwaezpbzkn);
        String str2 = new String(bArr2, 0, iEsjtqupxsv, charsetIwizpuwonk);
        int iJyumaefscl = iEsjtqupxsv + jyumaefscl(iWwaezpbzkn);
        return new eablkybsjg(str, str2, rgvfuqvkyq(bArr2, iJyumaefscl, esjtqupxsv(bArr2, iJyumaefscl, iWwaezpbzkn), charsetIwizpuwonk));
    }

    private static String cqumvgiudr(int i13, int i14, int i15, int i16, int i17) {
        return i13 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17));
    }

    private static gxszxtbevo draadjrbmk(yadqdtsiqt yadqdtsiqtVar, int i13) {
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        Charset charsetIwizpuwonk = iwizpuwonk(iWwaezpbzkn);
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, i14);
        int iLereixgezr = lereixgezr(bArr, 0);
        String strOxmwwwfdhm = iwizpuwonk.oxmwwwfdhm(new String(bArr, 0, iLereixgezr, StandardCharsets.ISO_8859_1));
        int i15 = iLereixgezr + 1;
        int iEsjtqupxsv = esjtqupxsv(bArr, i15, iWwaezpbzkn);
        String strRgvfuqvkyq = rgvfuqvkyq(bArr, i15, iEsjtqupxsv, charsetIwizpuwonk);
        int iJyumaefscl = iEsjtqupxsv + jyumaefscl(iWwaezpbzkn);
        int iEsjtqupxsv2 = esjtqupxsv(bArr, iJyumaefscl, iWwaezpbzkn);
        return new gxszxtbevo(strOxmwwwfdhm, strRgvfuqvkyq, rgvfuqvkyq(bArr, iJyumaefscl, iEsjtqupxsv2, charsetIwizpuwonk), wkgbmnqykc(bArr, iEsjtqupxsv2 + jyumaefscl(iWwaezpbzkn), i14));
    }

    private static wkgbmnqykc dxjokdxxww(yadqdtsiqt yadqdtsiqtVar, int i13, int i14, boolean z13, int i15, iobyxmoadg iobyxmoadgVar) {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iLereixgezr = lereixgezr(yadqdtsiqtVar.eablkybsjg(), iGxszxtbevo);
        String str = new String(yadqdtsiqtVar.eablkybsjg(), iGxszxtbevo, iLereixgezr - iGxszxtbevo, StandardCharsets.ISO_8859_1);
        yadqdtsiqtVar.sopmlzcsov(iLereixgezr + 1);
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        boolean z14 = (iWwaezpbzkn & 2) != 0;
        boolean z15 = (iWwaezpbzkn & 1) != 0;
        int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
        String[] strArr = new String[iWwaezpbzkn2];
        for (int i16 = 0; i16 < iWwaezpbzkn2; i16++) {
            int iGxszxtbevo2 = yadqdtsiqtVar.gxszxtbevo();
            int iLereixgezr2 = lereixgezr(yadqdtsiqtVar.eablkybsjg(), iGxszxtbevo2);
            strArr[i16] = new String(yadqdtsiqtVar.eablkybsjg(), iGxszxtbevo2, iLereixgezr2 - iGxszxtbevo2, StandardCharsets.ISO_8859_1);
            yadqdtsiqtVar.sopmlzcsov(iLereixgezr2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i17 = iGxszxtbevo + i13;
        while (yadqdtsiqtVar.gxszxtbevo() < i17) {
            dxjokdxxww dxjokdxxwwVarGtknphoqwx = gtknphoqwx(i14, yadqdtsiqtVar, z13, i15, iobyxmoadgVar);
            if (dxjokdxxwwVarGtknphoqwx != null) {
                arrayList.add(dxjokdxxwwVarGtknphoqwx);
            }
        }
        return new wkgbmnqykc(str, z14, z15, strArr, (dxjokdxxww[]) arrayList.toArray(new dxjokdxxww[0]));
    }

    private static int esjtqupxsv(byte[] bArr, int i13, int i14) {
        int iLereixgezr = lereixgezr(bArr, i13);
        if (i14 == 0 || i14 == 3) {
            return iLereixgezr;
        }
        while (iLereixgezr < bArr.length - 1) {
            if ((iLereixgezr - i13) % 2 == 0 && bArr[iLereixgezr + 1] == 0) {
                return iLereixgezr;
            }
            iLereixgezr = lereixgezr(bArr, iLereixgezr + 1);
        }
        return bArr.length;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x019b  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x01de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ed A[Catch: all -> 0x011f, Exception -> 0x0122, OutOfMemoryError -> 0x0125, TRY_LEAVE, TryCatch #2 {Exception -> 0x0122, OutOfMemoryError -> 0x0125, all -> 0x011f, blocks: (B:91:0x0119, B:99:0x012a, B:106:0x0140, B:108:0x0148, B:116:0x0162, B:125:0x017a, B:136:0x0195, B:143:0x01a7, B:149:0x01b6, B:154:0x01ce, B:160:0x01e8, B:161:0x01ed), top: B:171:0x010f }] */
    private static dxjokdxxww gtknphoqwx(int i13, yadqdtsiqt yadqdtsiqtVar, boolean z13, int i14, iobyxmoadg iobyxmoadgVar) {
        int iJpowsppfya;
        int i15;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        dxjokdxxww dxjokdxxwwVarLqeggnwhkg;
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
        int iWwaezpbzkn3 = yadqdtsiqtVar.wwaezpbzkn();
        int iWwaezpbzkn4 = i13 >= 3 ? yadqdtsiqtVar.wwaezpbzkn() : 0;
        if (i13 == 4) {
            iJpowsppfya = yadqdtsiqtVar.jpowsppfya();
            if (!z13) {
                iJpowsppfya = (((iJpowsppfya >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) << 21) | (iJpowsppfya & KotlinVersion.MAX_COMPONENT_VALUE) | (((iJpowsppfya >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) << 7) | (((iJpowsppfya >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) << 14);
            }
        } else {
            iJpowsppfya = i13 == 3 ? yadqdtsiqtVar.jpowsppfya() : yadqdtsiqtVar.hcddaimhww();
        }
        int iZynmafqrjb = iJpowsppfya;
        int iWypolnanlu = i13 >= 3 ? yadqdtsiqtVar.wypolnanlu() : 0;
        dxjokdxxww dxjokdxxwwVar = null;
        if (iWwaezpbzkn == 0 && iWwaezpbzkn2 == 0 && iWwaezpbzkn3 == 0 && iWwaezpbzkn4 == 0 && iZynmafqrjb == 0 && iWypolnanlu == 0) {
            yadqdtsiqtVar.sopmlzcsov(yadqdtsiqtVar.lqeggnwhkg());
            return null;
        }
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo() + iZynmafqrjb;
        if (iGxszxtbevo > yadqdtsiqtVar.lqeggnwhkg()) {
            kcexrzcfyt.nufgyqmvbu("Id3Decoder", "Frame size exceeds remaining tag data");
            yadqdtsiqtVar.sopmlzcsov(yadqdtsiqtVar.lqeggnwhkg());
            return null;
        }
        if (iobyxmoadgVar != null) {
            i15 = iGxszxtbevo;
            if (!iobyxmoadgVar.iobyxmoadg(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4)) {
                yadqdtsiqtVar.sopmlzcsov(i15);
                return null;
            }
        } else {
            i15 = iGxszxtbevo;
        }
        if (i13 == 3) {
            boolean z19 = (iWypolnanlu & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            z16 = (iWypolnanlu & 64) != 0;
            z18 = z19;
            z17 = false;
            z15 = (iWypolnanlu & 32) != 0;
            z14 = z18;
        } else if (i13 == 4) {
            z15 = (iWypolnanlu & 64) != 0;
            boolean z23 = (iWypolnanlu & 8) != 0;
            boolean z24 = (iWypolnanlu & 4) != 0;
            z17 = (iWypolnanlu & 2) != 0;
            z18 = (iWypolnanlu & 1) != 0;
            z14 = z23;
            z16 = z24;
        } else {
            z14 = false;
            z15 = false;
            z16 = false;
            z17 = false;
            z18 = false;
        }
        if (z14 || z16) {
            kcexrzcfyt.nufgyqmvbu("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            yadqdtsiqtVar.sopmlzcsov(i15);
            return null;
        }
        if (z15) {
            iZynmafqrjb--;
            yadqdtsiqtVar.crxdokpmqz(1);
        }
        if (z18) {
            iZynmafqrjb -= 4;
            yadqdtsiqtVar.crxdokpmqz(4);
        }
        if (z17) {
            iZynmafqrjb = zynmafqrjb(yadqdtsiqtVar, iZynmafqrjb);
        }
        try {
            if (iWwaezpbzkn == 84 && iWwaezpbzkn2 == 88 && iWwaezpbzkn3 == 88 && (i13 == 2 || iWwaezpbzkn4 == 88)) {
                dxjokdxxwwVarLqeggnwhkg = kcexrzcfyt(yadqdtsiqtVar, iZynmafqrjb);
            } else if (iWwaezpbzkn == 84) {
                dxjokdxxwwVarLqeggnwhkg = vdvldrhtss(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
            } else if (iWwaezpbzkn == 87 && iWwaezpbzkn2 == 88 && iWwaezpbzkn3 == 88 && (i13 == 2 || iWwaezpbzkn4 == 88)) {
                dxjokdxxwwVarLqeggnwhkg = yggfygwlhe(yadqdtsiqtVar, iZynmafqrjb);
            } else if (iWwaezpbzkn == 87) {
                dxjokdxxwwVarLqeggnwhkg = zdlpuopuiu(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
            } else if (iWwaezpbzkn == 80 && iWwaezpbzkn2 == 82 && iWwaezpbzkn3 == 73 && iWwaezpbzkn4 == 86) {
                dxjokdxxwwVarLqeggnwhkg = ojitshcjhn(yadqdtsiqtVar, iZynmafqrjb);
            } else if (iWwaezpbzkn == 71 && iWwaezpbzkn2 == 69 && iWwaezpbzkn3 == 79 && (iWwaezpbzkn4 == 66 || i13 == 2)) {
                dxjokdxxwwVarLqeggnwhkg = draadjrbmk(yadqdtsiqtVar, iZynmafqrjb);
            } else if (i13 == 2) {
                if (iWwaezpbzkn == 80 && iWwaezpbzkn2 == 73 && iWwaezpbzkn3 == 67) {
                    dxjokdxxwwVarLqeggnwhkg = gxszxtbevo(yadqdtsiqtVar, iZynmafqrjb, i13);
                } else if (iWwaezpbzkn != 67 && iWwaezpbzkn2 == 79 && iWwaezpbzkn3 == 77 && (iWwaezpbzkn4 == 77 || i13 == 2)) {
                    dxjokdxxwwVarLqeggnwhkg = btonecajqb(yadqdtsiqtVar, iZynmafqrjb);
                } else if (iWwaezpbzkn != 67 && iWwaezpbzkn2 == 72 && iWwaezpbzkn3 == 65 && iWwaezpbzkn4 == 80) {
                    dxjokdxxwwVarLqeggnwhkg = nufgyqmvbu(yadqdtsiqtVar, iZynmafqrjb, i13, z13, i14, iobyxmoadgVar);
                } else if (iWwaezpbzkn != 67 && iWwaezpbzkn2 == 84 && iWwaezpbzkn3 == 79 && iWwaezpbzkn4 == 67) {
                    dxjokdxxwwVarLqeggnwhkg = dxjokdxxww(yadqdtsiqtVar, iZynmafqrjb, i13, z13, i14, iobyxmoadgVar);
                } else if (iWwaezpbzkn != 77 && iWwaezpbzkn2 == 76 && iWwaezpbzkn3 == 76 && iWwaezpbzkn4 == 84) {
                    dxjokdxxwwVarLqeggnwhkg = agtfadlqog(yadqdtsiqtVar, iZynmafqrjb);
                } else {
                    dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                }
            } else if (iWwaezpbzkn == 65 && iWwaezpbzkn2 == 80 && iWwaezpbzkn3 == 73 && iWwaezpbzkn4 == 67) {
                dxjokdxxwwVarLqeggnwhkg = gxszxtbevo(yadqdtsiqtVar, iZynmafqrjb, i13);
            } else if (iWwaezpbzkn != 67) {
                if (iWwaezpbzkn != 67) {
                    if (iWwaezpbzkn != 67) {
                        if (iWwaezpbzkn != 77) {
                            dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                        } else {
                            dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                        }
                    } else if (iWwaezpbzkn != 77) {
                        dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                    } else {
                        dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                    }
                } else if (iWwaezpbzkn != 67) {
                    if (iWwaezpbzkn != 77) {
                        dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                    } else {
                        dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                    }
                } else if (iWwaezpbzkn != 77) {
                    dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                } else {
                    dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                }
            } else if (iWwaezpbzkn != 67) {
                if (iWwaezpbzkn != 67) {
                    if (iWwaezpbzkn != 77) {
                        dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                    } else {
                        dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                    }
                } else if (iWwaezpbzkn != 77) {
                    dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                } else {
                    dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                }
            } else if (iWwaezpbzkn != 67) {
                if (iWwaezpbzkn != 77) {
                    dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                } else {
                    dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
                }
            } else if (iWwaezpbzkn != 77) {
                dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
            } else {
                dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, iZynmafqrjb, cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4));
            }
            yadqdtsiqtVar.sopmlzcsov(i15);
            dxjokdxxwwVar = dxjokdxxwwVarLqeggnwhkg;
            e = null;
        } catch (Exception e13) {
            e = e13;
        } catch (OutOfMemoryError e14) {
            e = e14;
        } finally {
            yadqdtsiqtVar.sopmlzcsov(i15);
        }
        if (dxjokdxxwwVar == null) {
            kcexrzcfyt.dxjokdxxww("Id3Decoder", "Failed to decode frame: id=" + cqumvgiudr(i13, iWwaezpbzkn, iWwaezpbzkn2, iWwaezpbzkn3, iWwaezpbzkn4) + ", frameSize=" + iZynmafqrjb, e);
        }
        return dxjokdxxwwVar;
    }

    private static h4.iobyxmoadg gxszxtbevo(yadqdtsiqt yadqdtsiqtVar, int i13, int i14) {
        int iLereixgezr;
        String str;
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        Charset charsetIwizpuwonk = iwizpuwonk(iWwaezpbzkn);
        int i15 = i13 - 1;
        byte[] bArr = new byte[i15];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, i15);
        if (i14 == 2) {
            str = "image/" + xa.zoijcleaow.eablkybsjg(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iLereixgezr = 2;
        } else {
            iLereixgezr = lereixgezr(bArr, 0);
            String strEablkybsjg = xa.zoijcleaow.eablkybsjg(new String(bArr, 0, iLereixgezr, StandardCharsets.ISO_8859_1));
            if (strEablkybsjg.indexOf(47) == -1) {
                str = "image/" + strEablkybsjg;
            } else {
                str = strEablkybsjg;
            }
        }
        int i16 = bArr[iLereixgezr + 1] & 255;
        int i17 = iLereixgezr + 2;
        int iEsjtqupxsv = esjtqupxsv(bArr, i17, iWwaezpbzkn);
        return new h4.iobyxmoadg(str, new String(bArr, i17, iEsjtqupxsv - i17, charsetIwizpuwonk), i16, wkgbmnqykc(bArr, iEsjtqupxsv + jyumaefscl(iWwaezpbzkn), i15));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean istkbnxepw(yadqdtsiqt yadqdtsiqtVar, int i13, int i14, boolean z13) {
        int iHcddaimhww;
        long jHcddaimhww;
        int iWypolnanlu;
        int i15;
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        while (true) {
            try {
                boolean z14 = true;
                if (yadqdtsiqtVar.iobyxmoadg() < i14) {
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return true;
                }
                if (i13 >= 3) {
                    iHcddaimhww = yadqdtsiqtVar.vdvldrhtss();
                    jHcddaimhww = yadqdtsiqtVar.pkzmftpjix();
                    iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
                } else {
                    iHcddaimhww = yadqdtsiqtVar.hcddaimhww();
                    jHcddaimhww = yadqdtsiqtVar.hcddaimhww();
                    iWypolnanlu = 0;
                }
                if (iHcddaimhww == 0 && jHcddaimhww == 0 && iWypolnanlu == 0) {
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return true;
                }
                if (i13 == 4 && !z13) {
                    if ((8421504 & jHcddaimhww) != 0) {
                        yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                        return false;
                    }
                    jHcddaimhww = (((jHcddaimhww >> 24) & 255) << 21) | (jHcddaimhww & 255) | (((jHcddaimhww >> 8) & 255) << 7) | (((jHcddaimhww >> 16) & 255) << 14);
                }
                if (i13 == 4) {
                    i15 = (iWypolnanlu & 64) != 0 ? 1 : 0;
                    if ((iWypolnanlu & 1) == 0) {
                        z14 = false;
                    }
                } else if (i13 == 3) {
                    i15 = (iWypolnanlu & 32) != 0 ? 1 : 0;
                    if ((iWypolnanlu & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                        z14 = false;
                    }
                } else {
                    i15 = 0;
                    z14 = false;
                }
                if (z14) {
                    i15 += 4;
                }
                if (jHcddaimhww < i15) {
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return false;
                }
                if (yadqdtsiqtVar.iobyxmoadg() < jHcddaimhww) {
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return false;
                }
                yadqdtsiqtVar.crxdokpmqz((int) jHcddaimhww);
            } catch (Throwable th2) {
                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                throw th2;
            }
        }
    }

    private static Charset iwizpuwonk(int i13) {
        if (i13 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i13 != 2) {
            return i13 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    private static int jyumaefscl(int i13) {
        return (i13 == 0 || i13 == 3) ? 1 : 2;
    }

    private static agtfadlqog kcexrzcfyt(yadqdtsiqt yadqdtsiqtVar, int i13) {
        if (i13 < 1) {
            return null;
        }
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, i14);
        int iEsjtqupxsv = esjtqupxsv(bArr, 0, iWwaezpbzkn);
        return new agtfadlqog("TXXX", new String(bArr, 0, iEsjtqupxsv, iwizpuwonk(iWwaezpbzkn)), oxmwwwfdhm(bArr, iWwaezpbzkn, iEsjtqupxsv + jyumaefscl(iWwaezpbzkn)));
    }

    private static int lereixgezr(byte[] bArr, int i13) {
        while (i13 < bArr.length) {
            if (bArr[i13] == 0) {
                return i13;
            }
            i13++;
        }
        return bArr.length;
    }

    private static h4.zoijcleaow lqeggnwhkg(yadqdtsiqt yadqdtsiqtVar, int i13, String str) {
        byte[] bArr = new byte[i13];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, i13);
        return new h4.zoijcleaow(str, bArr);
    }

    private static ppxfxbqfkf nufgyqmvbu(yadqdtsiqt yadqdtsiqtVar, int i13, int i14, boolean z13, int i15, iobyxmoadg iobyxmoadgVar) {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iLereixgezr = lereixgezr(yadqdtsiqtVar.eablkybsjg(), iGxszxtbevo);
        String str = new String(yadqdtsiqtVar.eablkybsjg(), iGxszxtbevo, iLereixgezr - iGxszxtbevo, StandardCharsets.ISO_8859_1);
        yadqdtsiqtVar.sopmlzcsov(iLereixgezr + 1);
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
        long jPkzmftpjix = yadqdtsiqtVar.pkzmftpjix();
        long j13 = jPkzmftpjix == 4294967295L ? -1L : jPkzmftpjix;
        long jPkzmftpjix2 = yadqdtsiqtVar.pkzmftpjix();
        long j14 = jPkzmftpjix2 == 4294967295L ? -1L : jPkzmftpjix2;
        ArrayList arrayList = new ArrayList();
        int i16 = iGxszxtbevo + i13;
        while (yadqdtsiqtVar.gxszxtbevo() < i16) {
            dxjokdxxww dxjokdxxwwVarGtknphoqwx = gtknphoqwx(i14, yadqdtsiqtVar, z13, i15, iobyxmoadgVar);
            if (dxjokdxxwwVarGtknphoqwx != null) {
                arrayList.add(dxjokdxxwwVarGtknphoqwx);
            }
        }
        return new ppxfxbqfkf(str, iVdvldrhtss, iVdvldrhtss2, j13, j14, (dxjokdxxww[]) arrayList.toArray(new dxjokdxxww[0]));
    }

    private static wflxmlrfwp ojitshcjhn(yadqdtsiqt yadqdtsiqtVar, int i13) {
        byte[] bArr = new byte[i13];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, i13);
        int iLereixgezr = lereixgezr(bArr, 0);
        return new wflxmlrfwp(new String(bArr, 0, iLereixgezr, StandardCharsets.ISO_8859_1), wkgbmnqykc(bArr, iLereixgezr + 1, i13));
    }

    private static zdlpuopuiu oxmwwwfdhm(byte[] bArr, int i13, int i14) {
        if (i14 >= bArr.length) {
            return zdlpuopuiu.istkbnxepw("");
        }
        zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = zdlpuopuiu.kcexrzcfyt();
        int iEsjtqupxsv = esjtqupxsv(bArr, i14, i13);
        while (i14 < iEsjtqupxsv) {
            iobyxmoadgVarKcexrzcfyt.iobyxmoadg(new String(bArr, i14, iEsjtqupxsv - i14, iwizpuwonk(i13)));
            i14 = jyumaefscl(i13) + iEsjtqupxsv;
            iEsjtqupxsv = esjtqupxsv(bArr, i14, i13);
        }
        zdlpuopuiu zdlpuopuiuVarGtknphoqwx = iobyxmoadgVarKcexrzcfyt.gtknphoqwx();
        return zdlpuopuiuVarGtknphoqwx.isEmpty() ? zdlpuopuiu.istkbnxepw("") : zdlpuopuiuVarGtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean pmvmpeiblj(int i13, int i14, int i15, int i16, int i17) {
        return false;
    }

    private static String rgvfuqvkyq(byte[] bArr, int i13, int i14, Charset charset) {
        return (i14 <= i13 || i14 > bArr.length) ? "" : new String(bArr, i13, i14 - i13, charset);
    }

    private static agtfadlqog vdvldrhtss(yadqdtsiqt yadqdtsiqtVar, int i13, String str) {
        if (i13 < 1) {
            return null;
        }
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, i14);
        return new agtfadlqog(str, null, oxmwwwfdhm(bArr, iWwaezpbzkn, 0));
    }

    private static zoijcleaow wflxmlrfwp(yadqdtsiqt yadqdtsiqtVar) {
        if (yadqdtsiqtVar.iobyxmoadg() < 10) {
            kcexrzcfyt.nufgyqmvbu("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iHcddaimhww = yadqdtsiqtVar.hcddaimhww();
        if (iHcddaimhww != 4801587) {
            kcexrzcfyt.nufgyqmvbu("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iHcddaimhww)));
            return null;
        }
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        yadqdtsiqtVar.crxdokpmqz(1);
        int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
        int iLmojexxdyd = yadqdtsiqtVar.lmojexxdyd();
        if (iWwaezpbzkn == 2) {
            if ((iWwaezpbzkn2 & 64) != 0) {
                kcexrzcfyt.nufgyqmvbu("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iWwaezpbzkn == 3) {
            if ((iWwaezpbzkn2 & 64) != 0) {
                int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
                yadqdtsiqtVar.crxdokpmqz(iVdvldrhtss);
                iLmojexxdyd -= iVdvldrhtss + 4;
            }
        } else {
            if (iWwaezpbzkn != 4) {
                kcexrzcfyt.nufgyqmvbu("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iWwaezpbzkn);
                return null;
            }
            if ((iWwaezpbzkn2 & 64) != 0) {
                int iLmojexxdyd2 = yadqdtsiqtVar.lmojexxdyd();
                yadqdtsiqtVar.crxdokpmqz(iLmojexxdyd2 - 4);
                iLmojexxdyd -= iLmojexxdyd2;
            }
            if ((iWwaezpbzkn2 & 16) != 0) {
                iLmojexxdyd -= 10;
            }
        }
        return new zoijcleaow(iWwaezpbzkn, iWwaezpbzkn < 4 && (iWwaezpbzkn2 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0, iLmojexxdyd);
    }

    private static byte[] wkgbmnqykc(byte[] bArr, int i13, int i14) {
        return i14 <= i13 ? stevsuqkhv.f123601gxszxtbevo : Arrays.copyOfRange(bArr, i13, i14);
    }

    private static ojitshcjhn yggfygwlhe(yadqdtsiqt yadqdtsiqtVar, int i13) {
        if (i13 < 1) {
            return null;
        }
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, i14);
        int iEsjtqupxsv = esjtqupxsv(bArr, 0, iWwaezpbzkn);
        String str = new String(bArr, 0, iEsjtqupxsv, iwizpuwonk(iWwaezpbzkn));
        int iJyumaefscl = iEsjtqupxsv + jyumaefscl(iWwaezpbzkn);
        return new ojitshcjhn("WXXX", str, rgvfuqvkyq(bArr, iJyumaefscl, lereixgezr(bArr, iJyumaefscl), StandardCharsets.ISO_8859_1));
    }

    private static ojitshcjhn zdlpuopuiu(yadqdtsiqt yadqdtsiqtVar, int i13, String str) {
        byte[] bArr = new byte[i13];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, i13);
        return new ojitshcjhn(str, null, new String(bArr, 0, lereixgezr(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static int zynmafqrjb(yadqdtsiqt yadqdtsiqtVar, int i13) {
        byte[] bArrEablkybsjg = yadqdtsiqtVar.eablkybsjg();
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int i14 = iGxszxtbevo;
        while (true) {
            int i15 = i14 + 1;
            if (i15 >= iGxszxtbevo + i13) {
                return i13;
            }
            if ((bArrEablkybsjg[i14] & 255) == 255 && bArrEablkybsjg[i15] == 0) {
                System.arraycopy(bArrEablkybsjg, i14 + 2, bArrEablkybsjg, i15, (i13 - (i14 - iGxszxtbevo)) - 2);
                i13--;
            }
            i14 = i15;
        }
    }

    public jyumaefscl eablkybsjg(byte[] bArr, int i13) {
        ArrayList arrayList = new ArrayList();
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(bArr, i13);
        zoijcleaow zoijcleaowVarWflxmlrfwp = wflxmlrfwp(yadqdtsiqtVar);
        if (zoijcleaowVarWflxmlrfwp == null) {
            return null;
        }
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int i14 = zoijcleaowVarWflxmlrfwp.f39363iobyxmoadg == 2 ? 6 : 10;
        int iZynmafqrjb = zoijcleaowVarWflxmlrfwp.f39364ppxfxbqfkf;
        if (zoijcleaowVarWflxmlrfwp.f39365zoijcleaow) {
            iZynmafqrjb = zynmafqrjb(yadqdtsiqtVar, zoijcleaowVarWflxmlrfwp.f39364ppxfxbqfkf);
        }
        yadqdtsiqtVar.ulzqkzuiru(iGxszxtbevo + iZynmafqrjb);
        boolean z13 = false;
        if (!istkbnxepw(yadqdtsiqtVar, zoijcleaowVarWflxmlrfwp.f39363iobyxmoadg, i14, false)) {
            if (zoijcleaowVarWflxmlrfwp.f39363iobyxmoadg != 4 || !istkbnxepw(yadqdtsiqtVar, 4, i14, true)) {
                kcexrzcfyt.nufgyqmvbu("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + zoijcleaowVarWflxmlrfwp.f39363iobyxmoadg);
                return null;
            }
            z13 = true;
        }
        while (yadqdtsiqtVar.iobyxmoadg() >= i14) {
            dxjokdxxww dxjokdxxwwVarGtknphoqwx = gtknphoqwx(zoijcleaowVarWflxmlrfwp.f39363iobyxmoadg, yadqdtsiqtVar, z13, i14, this.f39362iobyxmoadg);
            if (dxjokdxxwwVarGtknphoqwx != null) {
                arrayList.add(dxjokdxxwwVarGtknphoqwx);
            }
        }
        return new jyumaefscl(arrayList);
    }

    @Override // c4.ppxfxbqfkf
    protected jyumaefscl zoijcleaow(c4.zoijcleaow zoijcleaowVar, ByteBuffer byteBuffer) {
        return eablkybsjg(byteBuffer.array(), byteBuffer.limit());
    }

    public nufgyqmvbu(iobyxmoadg iobyxmoadgVar) {
        this.f39362iobyxmoadg = iobyxmoadgVar;
    }
}
