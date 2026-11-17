package t3;

import android.util.Base64;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class kegysxyocb {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f109479iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f109480ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final String[] f109481zoijcleaow;

        public iobyxmoadg(String str, String[] strArr, int i13) {
            this.f109479iobyxmoadg = str;
            this.f109481zoijcleaow = strArr;
            this.f109480ppxfxbqfkf = i13;
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public final byte[] f109482btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public final boolean f109483dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final int f109484eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final int f109485gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f109486iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public final int f109487lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public final int f109488nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f109489ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f109490wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f109491zoijcleaow;

        public ppxfxbqfkf(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, boolean z13, byte[] bArr) {
            this.f109486iobyxmoadg = i13;
            this.f109491zoijcleaow = i14;
            this.f109489ppxfxbqfkf = i15;
            this.f109490wkgbmnqykc = i16;
            this.f109484eablkybsjg = i17;
            this.f109485gxszxtbevo = i18;
            this.f109487lqeggnwhkg = i19;
            this.f109488nufgyqmvbu = i23;
            this.f109483dxjokdxxww = z13;
            this.f109482btonecajqb = bArr;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final boolean f109492iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f109493ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f109494wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f109495zoijcleaow;

        public zoijcleaow(boolean z13, int i13, int i14, int i15) {
            this.f109492iobyxmoadg = z13;
            this.f109495zoijcleaow = i13;
            this.f109493ppxfxbqfkf = i14;
            this.f109494wkgbmnqykc = i15;
        }
    }

    private static void agtfadlqog(stevsuqkhv stevsuqkhvVar) throws ParserException {
        long jPpxfxbqfkf;
        if (stevsuqkhvVar.wkgbmnqykc(24) != 5653314) {
            throw ParserException.iobyxmoadg("expected code book to start with [0x56, 0x43, 0x42] at " + stevsuqkhvVar.zoijcleaow(), null);
        }
        int iWkgbmnqykc = stevsuqkhvVar.wkgbmnqykc(16);
        int iWkgbmnqykc2 = stevsuqkhvVar.wkgbmnqykc(24);
        int iWkgbmnqykc3 = 0;
        if (stevsuqkhvVar.ppxfxbqfkf()) {
            stevsuqkhvVar.eablkybsjg(5);
            while (iWkgbmnqykc3 < iWkgbmnqykc2) {
                iWkgbmnqykc3 += stevsuqkhvVar.wkgbmnqykc(zoijcleaow(iWkgbmnqykc2 - iWkgbmnqykc3));
            }
        } else {
            boolean zPpxfxbqfkf = stevsuqkhvVar.ppxfxbqfkf();
            while (iWkgbmnqykc3 < iWkgbmnqykc2) {
                if (!zPpxfxbqfkf) {
                    stevsuqkhvVar.eablkybsjg(5);
                } else if (stevsuqkhvVar.ppxfxbqfkf()) {
                    stevsuqkhvVar.eablkybsjg(5);
                }
                iWkgbmnqykc3++;
            }
        }
        int iWkgbmnqykc4 = stevsuqkhvVar.wkgbmnqykc(4);
        if (iWkgbmnqykc4 > 2) {
            throw ParserException.iobyxmoadg("lookup type greater than 2 not decodable: " + iWkgbmnqykc4, null);
        }
        if (iWkgbmnqykc4 == 1 || iWkgbmnqykc4 == 2) {
            stevsuqkhvVar.eablkybsjg(32);
            stevsuqkhvVar.eablkybsjg(32);
            int iWkgbmnqykc5 = stevsuqkhvVar.wkgbmnqykc(4) + 1;
            stevsuqkhvVar.eablkybsjg(1);
            if (iWkgbmnqykc4 == 1) {
                jPpxfxbqfkf = iWkgbmnqykc != 0 ? ppxfxbqfkf(iWkgbmnqykc2, iWkgbmnqykc) : 0L;
            } else {
                jPpxfxbqfkf = ((long) iWkgbmnqykc) * ((long) iWkgbmnqykc2);
            }
            stevsuqkhvVar.eablkybsjg((int) (jPpxfxbqfkf * ((long) iWkgbmnqykc5)));
        }
    }

    public static iobyxmoadg btonecajqb(y2.yadqdtsiqt yadqdtsiqtVar) {
        return gtknphoqwx(yadqdtsiqtVar, true, true);
    }

    public static ppxfxbqfkf draadjrbmk(y2.yadqdtsiqt yadqdtsiqtVar) throws ParserException {
        ojitshcjhn(1, yadqdtsiqtVar, false);
        int iEsjtqupxsv = yadqdtsiqtVar.esjtqupxsv();
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        int iEsjtqupxsv2 = yadqdtsiqtVar.esjtqupxsv();
        int iYggfygwlhe = yadqdtsiqtVar.yggfygwlhe();
        if (iYggfygwlhe <= 0) {
            iYggfygwlhe = -1;
        }
        int iYggfygwlhe2 = yadqdtsiqtVar.yggfygwlhe();
        if (iYggfygwlhe2 <= 0) {
            iYggfygwlhe2 = -1;
        }
        int iYggfygwlhe3 = yadqdtsiqtVar.yggfygwlhe();
        if (iYggfygwlhe3 <= 0) {
            iYggfygwlhe3 = -1;
        }
        int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
        return new ppxfxbqfkf(iEsjtqupxsv, iWwaezpbzkn, iEsjtqupxsv2, iYggfygwlhe, iYggfygwlhe2, iYggfygwlhe3, (int) Math.pow(2.0d, iWwaezpbzkn2 & 15), (int) Math.pow(2.0d, (iWwaezpbzkn2 & 240) >> 4), (yadqdtsiqtVar.wwaezpbzkn() & 1) > 0, Arrays.copyOf(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.lqeggnwhkg()));
    }

    private static void dxjokdxxww(stevsuqkhv stevsuqkhvVar) throws ParserException {
        int iWkgbmnqykc = stevsuqkhvVar.wkgbmnqykc(6) + 1;
        for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
            if (stevsuqkhvVar.wkgbmnqykc(16) > 2) {
                throw ParserException.iobyxmoadg("residueType greater than 2 is not decodable", null);
            }
            stevsuqkhvVar.eablkybsjg(24);
            stevsuqkhvVar.eablkybsjg(24);
            stevsuqkhvVar.eablkybsjg(24);
            int iWkgbmnqykc2 = stevsuqkhvVar.wkgbmnqykc(6) + 1;
            stevsuqkhvVar.eablkybsjg(8);
            int[] iArr = new int[iWkgbmnqykc2];
            for (int i14 = 0; i14 < iWkgbmnqykc2; i14++) {
                iArr[i14] = ((stevsuqkhvVar.ppxfxbqfkf() ? stevsuqkhvVar.wkgbmnqykc(5) : 0) * 8) + stevsuqkhvVar.wkgbmnqykc(3);
            }
            for (int i15 = 0; i15 < iWkgbmnqykc2; i15++) {
                for (int i16 = 0; i16 < 8; i16++) {
                    if ((iArr[i15] & (1 << i16)) != 0) {
                        stevsuqkhvVar.eablkybsjg(8);
                    }
                }
            }
        }
    }

    public static com.google.common.collect.zdlpuopuiu eablkybsjg(byte[] bArr) {
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(bArr);
        yadqdtsiqtVar.crxdokpmqz(1);
        int i13 = 0;
        while (yadqdtsiqtVar.iobyxmoadg() > 0 && yadqdtsiqtVar.btonecajqb() == 255) {
            i13 += KotlinVersion.MAX_COMPONENT_VALUE;
            yadqdtsiqtVar.crxdokpmqz(1);
        }
        int iWwaezpbzkn = i13 + yadqdtsiqtVar.wwaezpbzkn();
        int i14 = 0;
        while (yadqdtsiqtVar.iobyxmoadg() > 0 && yadqdtsiqtVar.btonecajqb() == 255) {
            i14 += KotlinVersion.MAX_COMPONENT_VALUE;
            yadqdtsiqtVar.crxdokpmqz(1);
        }
        int iWwaezpbzkn2 = i14 + yadqdtsiqtVar.wwaezpbzkn();
        byte[] bArr2 = new byte[iWwaezpbzkn];
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        System.arraycopy(bArr, iGxszxtbevo, bArr2, 0, iWwaezpbzkn);
        int i15 = iGxszxtbevo + iWwaezpbzkn + iWwaezpbzkn2;
        int length = bArr.length - i15;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i15, bArr3, 0, length);
        return com.google.common.collect.zdlpuopuiu.cdpycssgdh(bArr2, bArr3);
    }

    public static iobyxmoadg gtknphoqwx(y2.yadqdtsiqt yadqdtsiqtVar, boolean z13, boolean z14) throws ParserException {
        if (z13) {
            ojitshcjhn(3, yadqdtsiqtVar, false);
        }
        String strYadqdtsiqt = yadqdtsiqtVar.yadqdtsiqt((int) yadqdtsiqtVar.cqumvgiudr());
        int length = strYadqdtsiqt.length();
        long jCqumvgiudr = yadqdtsiqtVar.cqumvgiudr();
        String[] strArr = new String[(int) jCqumvgiudr];
        int length2 = length + 15;
        for (int i13 = 0; i13 < jCqumvgiudr; i13++) {
            String strYadqdtsiqt2 = yadqdtsiqtVar.yadqdtsiqt((int) yadqdtsiqtVar.cqumvgiudr());
            strArr[i13] = strYadqdtsiqt2;
            length2 = length2 + 4 + strYadqdtsiqt2.length();
        }
        if (z14 && (yadqdtsiqtVar.wwaezpbzkn() & 1) == 0) {
            throw ParserException.iobyxmoadg("framing bit expected to be set", null);
        }
        return new iobyxmoadg(strYadqdtsiqt, strArr, length2 + 1);
    }

    private static void gxszxtbevo(stevsuqkhv stevsuqkhvVar) throws ParserException {
        int iWkgbmnqykc = stevsuqkhvVar.wkgbmnqykc(6) + 1;
        for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
            int iWkgbmnqykc2 = stevsuqkhvVar.wkgbmnqykc(16);
            if (iWkgbmnqykc2 == 0) {
                stevsuqkhvVar.eablkybsjg(8);
                stevsuqkhvVar.eablkybsjg(16);
                stevsuqkhvVar.eablkybsjg(16);
                stevsuqkhvVar.eablkybsjg(6);
                stevsuqkhvVar.eablkybsjg(8);
                int iWkgbmnqykc3 = stevsuqkhvVar.wkgbmnqykc(4) + 1;
                for (int i14 = 0; i14 < iWkgbmnqykc3; i14++) {
                    stevsuqkhvVar.eablkybsjg(8);
                }
            } else {
                if (iWkgbmnqykc2 != 1) {
                    throw ParserException.iobyxmoadg("floor type greater than 1 not decodable: " + iWkgbmnqykc2, null);
                }
                int iWkgbmnqykc4 = stevsuqkhvVar.wkgbmnqykc(5);
                int[] iArr = new int[iWkgbmnqykc4];
                int i15 = -1;
                for (int i16 = 0; i16 < iWkgbmnqykc4; i16++) {
                    int iWkgbmnqykc5 = stevsuqkhvVar.wkgbmnqykc(4);
                    iArr[i16] = iWkgbmnqykc5;
                    if (iWkgbmnqykc5 > i15) {
                        i15 = iWkgbmnqykc5;
                    }
                }
                int i17 = i15 + 1;
                int[] iArr2 = new int[i17];
                for (int i18 = 0; i18 < i17; i18++) {
                    iArr2[i18] = stevsuqkhvVar.wkgbmnqykc(3) + 1;
                    int iWkgbmnqykc6 = stevsuqkhvVar.wkgbmnqykc(2);
                    if (iWkgbmnqykc6 > 0) {
                        stevsuqkhvVar.eablkybsjg(8);
                    }
                    for (int i19 = 0; i19 < (1 << iWkgbmnqykc6); i19++) {
                        stevsuqkhvVar.eablkybsjg(8);
                    }
                }
                stevsuqkhvVar.eablkybsjg(2);
                int iWkgbmnqykc7 = stevsuqkhvVar.wkgbmnqykc(4);
                int i23 = 0;
                int i24 = 0;
                for (int i25 = 0; i25 < iWkgbmnqykc4; i25++) {
                    i23 += iArr2[iArr[i25]];
                    while (i24 < i23) {
                        stevsuqkhvVar.eablkybsjg(iWkgbmnqykc7);
                        i24++;
                    }
                }
            }
        }
    }

    public static int[] iobyxmoadg(int i13) {
        if (i13 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i13 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i13 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i13 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i13 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    private static void lqeggnwhkg(int i13, stevsuqkhv stevsuqkhvVar) throws ParserException {
        int iWkgbmnqykc = stevsuqkhvVar.wkgbmnqykc(6) + 1;
        for (int i14 = 0; i14 < iWkgbmnqykc; i14++) {
            int iWkgbmnqykc2 = stevsuqkhvVar.wkgbmnqykc(16);
            if (iWkgbmnqykc2 != 0) {
                y2.kcexrzcfyt.ppxfxbqfkf("VorbisUtil", "mapping type other than 0 not supported: " + iWkgbmnqykc2);
            } else {
                int iWkgbmnqykc3 = stevsuqkhvVar.ppxfxbqfkf() ? stevsuqkhvVar.wkgbmnqykc(4) + 1 : 1;
                if (stevsuqkhvVar.ppxfxbqfkf()) {
                    int iWkgbmnqykc4 = stevsuqkhvVar.wkgbmnqykc(8) + 1;
                    for (int i15 = 0; i15 < iWkgbmnqykc4; i15++) {
                        int i16 = i13 - 1;
                        stevsuqkhvVar.eablkybsjg(zoijcleaow(i16));
                        stevsuqkhvVar.eablkybsjg(zoijcleaow(i16));
                    }
                }
                if (stevsuqkhvVar.wkgbmnqykc(2) != 0) {
                    throw ParserException.iobyxmoadg("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iWkgbmnqykc3 > 1) {
                    for (int i17 = 0; i17 < i13; i17++) {
                        stevsuqkhvVar.eablkybsjg(4);
                    }
                }
                for (int i18 = 0; i18 < iWkgbmnqykc3; i18++) {
                    stevsuqkhvVar.eablkybsjg(8);
                    stevsuqkhvVar.eablkybsjg(8);
                    stevsuqkhvVar.eablkybsjg(8);
                }
            }
        }
    }

    private static zoijcleaow[] nufgyqmvbu(stevsuqkhv stevsuqkhvVar) {
        int iWkgbmnqykc = stevsuqkhvVar.wkgbmnqykc(6) + 1;
        zoijcleaow[] zoijcleaowVarArr = new zoijcleaow[iWkgbmnqykc];
        for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
            zoijcleaowVarArr[i13] = new zoijcleaow(stevsuqkhvVar.ppxfxbqfkf(), stevsuqkhvVar.wkgbmnqykc(16), stevsuqkhvVar.wkgbmnqykc(16), stevsuqkhvVar.wkgbmnqykc(8));
        }
        return zoijcleaowVarArr;
    }

    public static boolean ojitshcjhn(int i13, y2.yadqdtsiqt yadqdtsiqtVar, boolean z13) throws ParserException {
        if (yadqdtsiqtVar.iobyxmoadg() < 7) {
            if (z13) {
                return false;
            }
            throw ParserException.iobyxmoadg("too short header: " + yadqdtsiqtVar.iobyxmoadg(), null);
        }
        if (yadqdtsiqtVar.wwaezpbzkn() != i13) {
            if (z13) {
                return false;
            }
            throw ParserException.iobyxmoadg("expected header type " + Integer.toHexString(i13), null);
        }
        if (yadqdtsiqtVar.wwaezpbzkn() == 118 && yadqdtsiqtVar.wwaezpbzkn() == 111 && yadqdtsiqtVar.wwaezpbzkn() == 114 && yadqdtsiqtVar.wwaezpbzkn() == 98 && yadqdtsiqtVar.wwaezpbzkn() == 105 && yadqdtsiqtVar.wwaezpbzkn() == 115) {
            return true;
        }
        if (z13) {
            return false;
        }
        throw ParserException.iobyxmoadg("expected characters 'vorbis'", null);
    }

    private static long ppxfxbqfkf(long j13, long j14) {
        return (long) Math.floor(Math.pow(j13, 1.0d / j14));
    }

    public static zoijcleaow[] wflxmlrfwp(y2.yadqdtsiqt yadqdtsiqtVar, int i13) throws ParserException {
        ojitshcjhn(5, yadqdtsiqtVar, false);
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn() + 1;
        stevsuqkhv stevsuqkhvVar = new stevsuqkhv(yadqdtsiqtVar.eablkybsjg());
        stevsuqkhvVar.eablkybsjg(yadqdtsiqtVar.gxszxtbevo() * 8);
        for (int i14 = 0; i14 < iWwaezpbzkn; i14++) {
            agtfadlqog(stevsuqkhvVar);
        }
        int iWkgbmnqykc = stevsuqkhvVar.wkgbmnqykc(6) + 1;
        for (int i15 = 0; i15 < iWkgbmnqykc; i15++) {
            if (stevsuqkhvVar.wkgbmnqykc(16) != 0) {
                throw ParserException.iobyxmoadg("placeholder of time domain transforms not zeroed out", null);
            }
        }
        gxszxtbevo(stevsuqkhvVar);
        dxjokdxxww(stevsuqkhvVar);
        lqeggnwhkg(i13, stevsuqkhvVar);
        zoijcleaow[] zoijcleaowVarArrNufgyqmvbu = nufgyqmvbu(stevsuqkhvVar);
        if (stevsuqkhvVar.ppxfxbqfkf()) {
            return zoijcleaowVarArrNufgyqmvbu;
        }
        throw ParserException.iobyxmoadg("framing bit after modes not set as expected", null);
    }

    public static v2.jyumaefscl wkgbmnqykc(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            String str = (String) list.get(i13);
            String[] strArrL = y2.stevsuqkhv.l(str, "=");
            if (strArrL.length != 2) {
                y2.kcexrzcfyt.nufgyqmvbu("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrL[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(f4.iobyxmoadg.wkgbmnqykc(new y2.yadqdtsiqt(Base64.decode(strArrL[1], 0))));
                } catch (RuntimeException e13) {
                    y2.kcexrzcfyt.dxjokdxxww("VorbisUtil", "Failed to parse vorbis picture", e13);
                }
            } else {
                arrayList.add(new k4.iobyxmoadg(strArrL[0], strArrL[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new v2.jyumaefscl(arrayList);
    }

    public static int zoijcleaow(int i13) {
        int i14 = 0;
        while (i13 > 0) {
            i14++;
            i13 >>>= 1;
        }
        return i14;
    }
}
