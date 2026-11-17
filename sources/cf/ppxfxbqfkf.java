package cf;

import com.google.zxing.WriterException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f19817iobyxmoadg = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f19818iobyxmoadg;

        static {
            int[] iArr = new int[bf.zoijcleaow.values().length];
            f19818iobyxmoadg = iArr;
            try {
                iArr[bf.zoijcleaow.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19818iobyxmoadg[bf.zoijcleaow.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19818iobyxmoadg[bf.zoijcleaow.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19818iobyxmoadg[bf.zoijcleaow.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    public static gxszxtbevo agtfadlqog(String str, bf.iobyxmoadg iobyxmoadgVar, Map map) throws WriterException {
        bf.ppxfxbqfkf ppxfxbqfkfVarZdlpuopuiu;
        int iGtknphoqwx;
        te.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg;
        boolean z13 = map != null && map.containsKey(com.google.zxing.ppxfxbqfkf.CHARACTER_SET);
        String string = z13 ? map.get(com.google.zxing.ppxfxbqfkf.CHARACTER_SET).toString() : "ISO-8859-1";
        bf.zoijcleaow zoijcleaowVarDraadjrbmk = draadjrbmk(str, string);
        te.iobyxmoadg iobyxmoadgVar2 = new te.iobyxmoadg();
        bf.zoijcleaow zoijcleaowVar = bf.zoijcleaow.BYTE;
        if (zoijcleaowVarDraadjrbmk == zoijcleaowVar && z13 && (ppxfxbqfkfVarIobyxmoadg = te.ppxfxbqfkf.iobyxmoadg(string)) != null) {
            wkgbmnqykc(ppxfxbqfkfVarIobyxmoadg, iobyxmoadgVar2);
        }
        if (map != null) {
            com.google.zxing.ppxfxbqfkf ppxfxbqfkfVar = com.google.zxing.ppxfxbqfkf.GS1_FORMAT;
            if (map.containsKey(ppxfxbqfkfVar) && Boolean.parseBoolean(map.get(ppxfxbqfkfVar).toString())) {
                lqeggnwhkg(bf.zoijcleaow.FNC1_FIRST_POSITION, iobyxmoadgVar2);
            }
        }
        lqeggnwhkg(zoijcleaowVarDraadjrbmk, iobyxmoadgVar2);
        te.iobyxmoadg iobyxmoadgVar3 = new te.iobyxmoadg();
        ppxfxbqfkf(str, zoijcleaowVarDraadjrbmk, iobyxmoadgVar3, string);
        if (map != null) {
            com.google.zxing.ppxfxbqfkf ppxfxbqfkfVar2 = com.google.zxing.ppxfxbqfkf.QR_VERSION;
            if (map.containsKey(ppxfxbqfkfVar2)) {
                ppxfxbqfkfVarZdlpuopuiu = bf.ppxfxbqfkf.eablkybsjg(Integer.parseInt(map.get(ppxfxbqfkfVar2).toString()));
                if (!jyumaefscl(dxjokdxxww(zoijcleaowVarDraadjrbmk, iobyxmoadgVar2, iobyxmoadgVar3, ppxfxbqfkfVarZdlpuopuiu), ppxfxbqfkfVarZdlpuopuiu, iobyxmoadgVar)) {
                    throw new WriterException("Data too big for requested version");
                }
            } else {
                ppxfxbqfkfVarZdlpuopuiu = zdlpuopuiu(iobyxmoadgVar, zoijcleaowVarDraadjrbmk, iobyxmoadgVar2, iobyxmoadgVar3);
            }
        } else {
            ppxfxbqfkfVarZdlpuopuiu = zdlpuopuiu(iobyxmoadgVar, zoijcleaowVarDraadjrbmk, iobyxmoadgVar2, iobyxmoadgVar3);
        }
        te.iobyxmoadg iobyxmoadgVar4 = new te.iobyxmoadg();
        iobyxmoadgVar4.zoijcleaow(iobyxmoadgVar2);
        gxszxtbevo(zoijcleaowVarDraadjrbmk == zoijcleaowVar ? iobyxmoadgVar3.nufgyqmvbu() : str.length(), ppxfxbqfkfVarZdlpuopuiu, zoijcleaowVarDraadjrbmk, iobyxmoadgVar4);
        iobyxmoadgVar4.zoijcleaow(iobyxmoadgVar3);
        bf.ppxfxbqfkf.zoijcleaow zoijcleaowVarPpxfxbqfkf = ppxfxbqfkfVarZdlpuopuiu.ppxfxbqfkf(iobyxmoadgVar);
        int iWkgbmnqykc = ppxfxbqfkfVarZdlpuopuiu.wkgbmnqykc() - zoijcleaowVarPpxfxbqfkf.wkgbmnqykc();
        yggfygwlhe(iWkgbmnqykc, iobyxmoadgVar4);
        te.iobyxmoadg iobyxmoadgVarOxmwwwfdhm = oxmwwwfdhm(iobyxmoadgVar4, ppxfxbqfkfVarZdlpuopuiu.wkgbmnqykc(), iWkgbmnqykc, zoijcleaowVarPpxfxbqfkf.ppxfxbqfkf());
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
        gxszxtbevoVar.ppxfxbqfkf(iobyxmoadgVar);
        gxszxtbevoVar.gxszxtbevo(zoijcleaowVarDraadjrbmk);
        gxszxtbevoVar.lqeggnwhkg(ppxfxbqfkfVarZdlpuopuiu);
        int iZoijcleaow = ppxfxbqfkfVarZdlpuopuiu.zoijcleaow();
        zoijcleaow zoijcleaowVar2 = new zoijcleaow(iZoijcleaow, iZoijcleaow);
        if (map != null) {
            com.google.zxing.ppxfxbqfkf ppxfxbqfkfVar3 = com.google.zxing.ppxfxbqfkf.QR_MASK_PATTERN;
            if (map.containsKey(ppxfxbqfkfVar3)) {
                iGtknphoqwx = Integer.parseInt(map.get(ppxfxbqfkfVar3).toString());
                if (!gxszxtbevo.zoijcleaow(iGtknphoqwx)) {
                    iGtknphoqwx = -1;
                }
            } else {
                iGtknphoqwx = -1;
            }
        } else {
            iGtknphoqwx = -1;
        }
        if (iGtknphoqwx == -1) {
            iGtknphoqwx = gtknphoqwx(iobyxmoadgVarOxmwwwfdhm, iobyxmoadgVar, ppxfxbqfkfVarZdlpuopuiu, zoijcleaowVar2);
        }
        gxszxtbevoVar.wkgbmnqykc(iGtknphoqwx);
        eablkybsjg.iobyxmoadg(iobyxmoadgVarOxmwwwfdhm, iobyxmoadgVar, ppxfxbqfkfVarZdlpuopuiu, iGtknphoqwx, zoijcleaowVar2);
        gxszxtbevoVar.eablkybsjg(zoijcleaowVar2);
        return gxszxtbevoVar;
    }

    private static int btonecajqb(zoijcleaow zoijcleaowVar) {
        return wkgbmnqykc.iobyxmoadg(zoijcleaowVar) + wkgbmnqykc.ppxfxbqfkf(zoijcleaowVar) + wkgbmnqykc.wkgbmnqykc(zoijcleaowVar) + wkgbmnqykc.eablkybsjg(zoijcleaowVar);
    }

    private static bf.zoijcleaow draadjrbmk(String str, String str2) {
        if ("Shift_JIS".equals(str2) && kcexrzcfyt(str)) {
            return bf.zoijcleaow.KANJI;
        }
        boolean z13 = false;
        boolean z14 = false;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z14 = true;
            } else {
                if (rgvfuqvkyq(cCharAt) == -1) {
                    return bf.zoijcleaow.BYTE;
                }
                z13 = true;
            }
        }
        if (z13) {
            return bf.zoijcleaow.ALPHANUMERIC;
        }
        return z14 ? bf.zoijcleaow.NUMERIC : bf.zoijcleaow.BYTE;
    }

    private static int dxjokdxxww(bf.zoijcleaow zoijcleaowVar, te.iobyxmoadg iobyxmoadgVar, te.iobyxmoadg iobyxmoadgVar2, bf.ppxfxbqfkf ppxfxbqfkfVar) {
        return iobyxmoadgVar.lqeggnwhkg() + zoijcleaowVar.wkgbmnqykc(ppxfxbqfkfVar) + iobyxmoadgVar2.lqeggnwhkg();
    }

    static void eablkybsjg(String str, te.iobyxmoadg iobyxmoadgVar) throws WriterException {
        int i13;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            if (bytes.length % 2 != 0) {
                throw new WriterException("Kanji byte size not even");
            }
            int length = bytes.length - 1;
            for (int i14 = 0; i14 < length; i14 += 2) {
                int i15 = ((bytes[i14] & 255) << 8) | (bytes[i14 + 1] & 255);
                int i16 = 33088;
                if (i15 >= 33088 && i15 <= 40956) {
                    i13 = i15 - i16;
                } else if (i15 < 57408 || i15 > 60351) {
                    i13 = -1;
                } else {
                    i16 = 49472;
                    i13 = i15 - i16;
                }
                if (i13 == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                iobyxmoadgVar.ppxfxbqfkf(((i13 >> 8) * 192) + (i13 & KotlinVersion.MAX_COMPONENT_VALUE), 13);
            }
        } catch (UnsupportedEncodingException e13) {
            throw new WriterException(e13);
        }
    }

    private static int gtknphoqwx(te.iobyxmoadg iobyxmoadgVar, bf.iobyxmoadg iobyxmoadgVar2, bf.ppxfxbqfkf ppxfxbqfkfVar, zoijcleaow zoijcleaowVar) throws WriterException {
        int i13 = Integer.MAX_VALUE;
        int i14 = -1;
        for (int i15 = 0; i15 < 8; i15++) {
            eablkybsjg.iobyxmoadg(iobyxmoadgVar, iobyxmoadgVar2, ppxfxbqfkfVar, i15, zoijcleaowVar);
            int iBtonecajqb = btonecajqb(zoijcleaowVar);
            if (iBtonecajqb < i13) {
                i14 = i15;
                i13 = iBtonecajqb;
            }
        }
        return i14;
    }

    static void gxszxtbevo(int i13, bf.ppxfxbqfkf ppxfxbqfkfVar, bf.zoijcleaow zoijcleaowVar, te.iobyxmoadg iobyxmoadgVar) throws WriterException {
        int iWkgbmnqykc = zoijcleaowVar.wkgbmnqykc(ppxfxbqfkfVar);
        int i14 = 1 << iWkgbmnqykc;
        if (i13 < i14) {
            iobyxmoadgVar.ppxfxbqfkf(i13, iWkgbmnqykc);
            return;
        }
        throw new WriterException(i13 + " is bigger than " + (i14 - 1));
    }

    static void iobyxmoadg(String str, te.iobyxmoadg iobyxmoadgVar, String str2) throws WriterException {
        try {
            for (byte b13 : str.getBytes(str2)) {
                iobyxmoadgVar.ppxfxbqfkf(b13, 8);
            }
        } catch (UnsupportedEncodingException e13) {
            throw new WriterException(e13);
        }
    }

    private static boolean jyumaefscl(int i13, bf.ppxfxbqfkf ppxfxbqfkfVar, bf.iobyxmoadg iobyxmoadgVar) {
        return ppxfxbqfkfVar.wkgbmnqykc() - ppxfxbqfkfVar.ppxfxbqfkf(iobyxmoadgVar).wkgbmnqykc() >= (i13 + 7) / 8;
    }

    private static boolean kcexrzcfyt(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i13 = 0; i13 < length; i13 += 2) {
                int i14 = bytes[i13] & 255;
                if ((i14 < 129 || i14 > 159) && (i14 < 224 || i14 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    static void lqeggnwhkg(bf.zoijcleaow zoijcleaowVar, te.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.ppxfxbqfkf(zoijcleaowVar.iobyxmoadg(), 4);
    }

    static void nufgyqmvbu(CharSequence charSequence, te.iobyxmoadg iobyxmoadgVar) {
        int length = charSequence.length();
        int i13 = 0;
        while (i13 < length) {
            int iCharAt = charSequence.charAt(i13) - '0';
            int i14 = i13 + 2;
            if (i14 < length) {
                iobyxmoadgVar.ppxfxbqfkf((iCharAt * 100) + ((charSequence.charAt(i13 + 1) - '0') * 10) + (charSequence.charAt(i14) - '0'), 10);
                i13 += 3;
            } else {
                i13++;
                if (i13 < length) {
                    iobyxmoadgVar.ppxfxbqfkf((iCharAt * 10) + (charSequence.charAt(i13) - '0'), 7);
                    i13 = i14;
                } else {
                    iobyxmoadgVar.ppxfxbqfkf(iCharAt, 4);
                }
            }
        }
    }

    static byte[] ojitshcjhn(byte[] bArr, int i13) {
        int length = bArr.length;
        int[] iArr = new int[length + i13];
        for (int i14 = 0; i14 < length; i14++) {
            iArr[i14] = bArr[i14] & 255;
        }
        new ue.ppxfxbqfkf(ue.iobyxmoadg.f113493draadjrbmk).zoijcleaow(iArr, i13);
        byte[] bArr2 = new byte[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            bArr2[i15] = (byte) iArr[length + i15];
        }
        return bArr2;
    }

    static te.iobyxmoadg oxmwwwfdhm(te.iobyxmoadg iobyxmoadgVar, int i13, int i14, int i15) throws WriterException {
        if (iobyxmoadgVar.nufgyqmvbu() != i14) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i15);
        int i16 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            vdvldrhtss(i13, i14, i15, i17, iArr, iArr2);
            int i18 = iArr[0];
            byte[] bArr = new byte[i18];
            iobyxmoadgVar.draadjrbmk(i16 << 3, bArr, 0, i18);
            byte[] bArrOjitshcjhn = ojitshcjhn(bArr, iArr2[0]);
            arrayList.add(new cf.iobyxmoadg(bArr, bArrOjitshcjhn));
            iMax = Math.max(iMax, i18);
            iMax2 = Math.max(iMax2, bArrOjitshcjhn.length);
            i16 += iArr[0];
        }
        if (i14 != i16) {
            throw new WriterException("Data bytes does not match offset");
        }
        te.iobyxmoadg iobyxmoadgVar2 = new te.iobyxmoadg();
        for (int i19 = 0; i19 < iMax; i19++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrIobyxmoadg = ((cf.iobyxmoadg) it.next()).iobyxmoadg();
                if (i19 < bArrIobyxmoadg.length) {
                    iobyxmoadgVar2.ppxfxbqfkf(bArrIobyxmoadg[i19], 8);
                }
            }
        }
        for (int i23 = 0; i23 < iMax2; i23++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrZoijcleaow = ((cf.iobyxmoadg) it2.next()).zoijcleaow();
                if (i23 < bArrZoijcleaow.length) {
                    iobyxmoadgVar2.ppxfxbqfkf(bArrZoijcleaow[i23], 8);
                }
            }
        }
        if (i13 == iobyxmoadgVar2.nufgyqmvbu()) {
            return iobyxmoadgVar2;
        }
        throw new WriterException("Interleaving error: " + i13 + " and " + iobyxmoadgVar2.nufgyqmvbu() + " differ.");
    }

    static void ppxfxbqfkf(String str, bf.zoijcleaow zoijcleaowVar, te.iobyxmoadg iobyxmoadgVar, String str2) throws WriterException {
        int i13 = iobyxmoadg.f19818iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            nufgyqmvbu(str, iobyxmoadgVar);
            return;
        }
        if (i13 == 2) {
            zoijcleaow(str, iobyxmoadgVar);
        } else if (i13 == 3) {
            iobyxmoadg(str, iobyxmoadgVar, str2);
        } else {
            if (i13 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(zoijcleaowVar)));
            }
            eablkybsjg(str, iobyxmoadgVar);
        }
    }

    static int rgvfuqvkyq(int i13) {
        int[] iArr = f19817iobyxmoadg;
        if (i13 < iArr.length) {
            return iArr[i13];
        }
        return -1;
    }

    static void vdvldrhtss(int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2) throws WriterException {
        if (i16 >= i15) {
            throw new WriterException("Block ID too large");
        }
        int i17 = i13 % i15;
        int i18 = i15 - i17;
        int i19 = i13 / i15;
        int i23 = i19 + 1;
        int i24 = i14 / i15;
        int i25 = i24 + 1;
        int i26 = i19 - i24;
        int i27 = i23 - i25;
        if (i26 != i27) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i15 != i18 + i17) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i13 != ((i24 + i26) * i18) + ((i25 + i27) * i17)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i16 < i18) {
            iArr[0] = i24;
            iArr2[0] = i26;
        } else {
            iArr[0] = i25;
            iArr2[0] = i27;
        }
    }

    private static bf.ppxfxbqfkf wflxmlrfwp(int i13, bf.iobyxmoadg iobyxmoadgVar) throws WriterException {
        for (int i14 = 1; i14 <= 40; i14++) {
            bf.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = bf.ppxfxbqfkf.eablkybsjg(i14);
            if (jyumaefscl(i13, ppxfxbqfkfVarEablkybsjg, iobyxmoadgVar)) {
                return ppxfxbqfkfVarEablkybsjg;
            }
        }
        throw new WriterException("Data too big");
    }

    private static void wkgbmnqykc(te.ppxfxbqfkf ppxfxbqfkfVar, te.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.ppxfxbqfkf(bf.zoijcleaow.ECI.iobyxmoadg(), 4);
        iobyxmoadgVar.ppxfxbqfkf(ppxfxbqfkfVar.wkgbmnqykc(), 8);
    }

    static void yggfygwlhe(int i13, te.iobyxmoadg iobyxmoadgVar) throws WriterException {
        int i14 = i13 << 3;
        if (iobyxmoadgVar.lqeggnwhkg() > i14) {
            throw new WriterException("data bits cannot fit in the QR Code" + iobyxmoadgVar.lqeggnwhkg() + " > " + i14);
        }
        for (int i15 = 0; i15 < 4 && iobyxmoadgVar.lqeggnwhkg() < i14; i15++) {
            iobyxmoadgVar.iobyxmoadg(false);
        }
        int iLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg() & 7;
        if (iLqeggnwhkg > 0) {
            while (iLqeggnwhkg < 8) {
                iobyxmoadgVar.iobyxmoadg(false);
                iLqeggnwhkg++;
            }
        }
        int iNufgyqmvbu = i13 - iobyxmoadgVar.nufgyqmvbu();
        for (int i16 = 0; i16 < iNufgyqmvbu; i16++) {
            iobyxmoadgVar.ppxfxbqfkf((i16 & 1) == 0 ? 236 : 17, 8);
        }
        if (iobyxmoadgVar.lqeggnwhkg() != i14) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    private static bf.ppxfxbqfkf zdlpuopuiu(bf.iobyxmoadg iobyxmoadgVar, bf.zoijcleaow zoijcleaowVar, te.iobyxmoadg iobyxmoadgVar2, te.iobyxmoadg iobyxmoadgVar3) {
        return wflxmlrfwp(dxjokdxxww(zoijcleaowVar, iobyxmoadgVar2, iobyxmoadgVar3, wflxmlrfwp(dxjokdxxww(zoijcleaowVar, iobyxmoadgVar2, iobyxmoadgVar3, bf.ppxfxbqfkf.eablkybsjg(1)), iobyxmoadgVar)), iobyxmoadgVar);
    }

    static void zoijcleaow(CharSequence charSequence, te.iobyxmoadg iobyxmoadgVar) throws WriterException {
        int length = charSequence.length();
        int i13 = 0;
        while (i13 < length) {
            int iRgvfuqvkyq = rgvfuqvkyq(charSequence.charAt(i13));
            if (iRgvfuqvkyq == -1) {
                throw new WriterException();
            }
            int i14 = i13 + 1;
            if (i14 < length) {
                int iRgvfuqvkyq2 = rgvfuqvkyq(charSequence.charAt(i14));
                if (iRgvfuqvkyq2 == -1) {
                    throw new WriterException();
                }
                iobyxmoadgVar.ppxfxbqfkf((iRgvfuqvkyq * 45) + iRgvfuqvkyq2, 11);
                i13 += 2;
            } else {
                iobyxmoadgVar.ppxfxbqfkf(iRgvfuqvkyq, 6);
                i13 = i14;
            }
        }
    }
}
