package androidx.profileinstaller;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final byte[] f12548iobyxmoadg = {112, 114, 111, 0};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final byte[] f12549zoijcleaow = {112, 114, 109, 0};

    private static int[] agtfadlqog(InputStream inputStream, int i13) {
        int[] iArr = new int[i13];
        int iNufgyqmvbu = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            iNufgyqmvbu += wkgbmnqykc.nufgyqmvbu(inputStream);
            iArr[i14] = iNufgyqmvbu;
        }
        return iArr;
    }

    private static String btonecajqb(String str, String str2, byte[] bArr) {
        String strIobyxmoadg = dxjokdxxww.iobyxmoadg(bArr);
        if (str.length() <= 0) {
            return lqeggnwhkg(str2, strIobyxmoadg);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            return lqeggnwhkg(str2, strIobyxmoadg);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + dxjokdxxww.iobyxmoadg(bArr) + str2;
    }

    private static void cdpycssgdh(OutputStream outputStream, ppxfxbqfkf ppxfxbqfkfVar) throws IOException {
        int[] iArr = ppxfxbqfkfVar.f12566nufgyqmvbu;
        int length = iArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = iArr[i13];
            wkgbmnqykc.rgvfuqvkyq(outputStream, i15 - i14);
            i13++;
            i14 = i15;
        }
    }

    private static void cllcsxoeiz(OutputStream outputStream, ppxfxbqfkf[] ppxfxbqfkfVarArr) throws IOException {
        byte[] bArrZoijcleaow = zoijcleaow(ppxfxbqfkfVarArr, dxjokdxxww.f12536ppxfxbqfkf);
        wkgbmnqykc.oxmwwwfdhm(outputStream, ppxfxbqfkfVarArr.length);
        wkgbmnqykc.wflxmlrfwp(outputStream, bArrZoijcleaow);
    }

    static ppxfxbqfkf[] cqumvgiudr(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, dxjokdxxww.f12538zoijcleaow)) {
            throw wkgbmnqykc.ppxfxbqfkf("Unsupported version");
        }
        int iBtonecajqb = wkgbmnqykc.btonecajqb(inputStream);
        byte[] bArrEablkybsjg = wkgbmnqykc.eablkybsjg(inputStream, (int) wkgbmnqykc.dxjokdxxww(inputStream), (int) wkgbmnqykc.dxjokdxxww(inputStream));
        if (inputStream.read() > 0) {
            throw wkgbmnqykc.ppxfxbqfkf("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrEablkybsjg);
        try {
            ppxfxbqfkf[] ppxfxbqfkfVarArrEsjtqupxsv = esjtqupxsv(byteArrayInputStream, str, iBtonecajqb);
            byteArrayInputStream.close();
            return ppxfxbqfkfVarArrEsjtqupxsv;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static int draadjrbmk(int i13, int i14) {
        return lereixgezr(Integer.bitCount(i13 & (-2)) * i14) / 8;
    }

    private static void dsvhmnatus(OutputStream outputStream, ppxfxbqfkf[] ppxfxbqfkfVarArr) throws IOException {
        byte[] bArrZoijcleaow = zoijcleaow(ppxfxbqfkfVarArr, dxjokdxxww.f12538zoijcleaow);
        wkgbmnqykc.oxmwwwfdhm(outputStream, ppxfxbqfkfVarArr.length);
        wkgbmnqykc.wflxmlrfwp(outputStream, bArrZoijcleaow);
    }

    private static ppxfxbqfkf dxjokdxxww(ppxfxbqfkf[] ppxfxbqfkfVarArr, String str) {
        if (ppxfxbqfkfVarArr.length <= 0) {
            return null;
        }
        String strNufgyqmvbu = nufgyqmvbu(str);
        for (int i13 = 0; i13 < ppxfxbqfkfVarArr.length; i13++) {
            if (ppxfxbqfkfVarArr[i13].f12569zoijcleaow.equals(strNufgyqmvbu)) {
                return ppxfxbqfkfVarArr[i13];
            }
        }
        return null;
    }

    private static byte[] eablkybsjg(int i13, ppxfxbqfkf ppxfxbqfkfVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            pkzmftpjix(byteArrayOutputStream, i13, ppxfxbqfkfVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static ppxfxbqfkf[] esjtqupxsv(InputStream inputStream, String str, int i13) {
        if (inputStream.available() == 0) {
            return new ppxfxbqfkf[0];
        }
        ppxfxbqfkf[] ppxfxbqfkfVarArr = new ppxfxbqfkf[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int iNufgyqmvbu = wkgbmnqykc.nufgyqmvbu(inputStream);
            int iNufgyqmvbu2 = wkgbmnqykc.nufgyqmvbu(inputStream);
            ppxfxbqfkfVarArr[i14] = new ppxfxbqfkf(str, wkgbmnqykc.gxszxtbevo(inputStream, iNufgyqmvbu), wkgbmnqykc.dxjokdxxww(inputStream), 0L, iNufgyqmvbu2, (int) wkgbmnqykc.dxjokdxxww(inputStream), (int) wkgbmnqykc.dxjokdxxww(inputStream), new int[iNufgyqmvbu2], new TreeMap());
        }
        for (int i15 = 0; i15 < i13; i15++) {
            ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkfVarArr[i15];
            vdvldrhtss(inputStream, ppxfxbqfkfVar);
            ppxfxbqfkfVar.f12566nufgyqmvbu = agtfadlqog(inputStream, ppxfxbqfkfVar.f12562eablkybsjg);
            iwizpuwonk(inputStream, ppxfxbqfkfVar);
        }
        return ppxfxbqfkfVarArr;
    }

    private static int gtknphoqwx(int i13) {
        return lereixgezr(i13 * 2) / 8;
    }

    private static byte[] gxszxtbevo(ppxfxbqfkf ppxfxbqfkfVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            hcddaimhww(byteArrayOutputStream, ppxfxbqfkfVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void hcddaimhww(OutputStream outputStream, ppxfxbqfkf ppxfxbqfkfVar) throws IOException {
        int i13 = 0;
        for (Map.Entry entry : ppxfxbqfkfVar.f12561dxjokdxxww.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                wkgbmnqykc.rgvfuqvkyq(outputStream, iIntValue - i13);
                wkgbmnqykc.rgvfuqvkyq(outputStream, 0);
                i13 = iIntValue;
            }
        }
    }

    private static void hkdspvbjdz(OutputStream outputStream, ppxfxbqfkf[] ppxfxbqfkfVarArr) throws IOException {
        wkgbmnqykc.oxmwwwfdhm(outputStream, ppxfxbqfkfVarArr.length);
        for (ppxfxbqfkf ppxfxbqfkfVar : ppxfxbqfkfVarArr) {
            int size = ppxfxbqfkfVar.f12561dxjokdxxww.size() * 4;
            String strBtonecajqb = btonecajqb(ppxfxbqfkfVar.f12564iobyxmoadg, ppxfxbqfkfVar.f12569zoijcleaow, dxjokdxxww.f12537wkgbmnqykc);
            wkgbmnqykc.rgvfuqvkyq(outputStream, wkgbmnqykc.gtknphoqwx(strBtonecajqb));
            wkgbmnqykc.rgvfuqvkyq(outputStream, ppxfxbqfkfVar.f12566nufgyqmvbu.length);
            wkgbmnqykc.vdvldrhtss(outputStream, size);
            wkgbmnqykc.vdvldrhtss(outputStream, ppxfxbqfkfVar.f12567ppxfxbqfkf);
            wkgbmnqykc.agtfadlqog(outputStream, strBtonecajqb);
            Iterator it = ppxfxbqfkfVar.f12561dxjokdxxww.keySet().iterator();
            while (it.hasNext()) {
                wkgbmnqykc.rgvfuqvkyq(outputStream, ((Integer) it.next()).intValue());
                wkgbmnqykc.rgvfuqvkyq(outputStream, 0);
            }
            for (int i13 : ppxfxbqfkfVar.f12566nufgyqmvbu) {
                wkgbmnqykc.rgvfuqvkyq(outputStream, i13);
            }
        }
    }

    private static int iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        Iterator it = ppxfxbqfkfVar.f12561dxjokdxxww.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    static void iozdgvuglv(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f12548iobyxmoadg);
        outputStream.write(bArr);
    }

    static boolean istkbnxepw(OutputStream outputStream, byte[] bArr, ppxfxbqfkf[] ppxfxbqfkfVarArr) throws IOException {
        if (Arrays.equals(bArr, dxjokdxxww.f12534iobyxmoadg)) {
            wypolnanlu(outputStream, ppxfxbqfkfVarArr);
            return true;
        }
        if (Arrays.equals(bArr, dxjokdxxww.f12538zoijcleaow)) {
            dsvhmnatus(outputStream, ppxfxbqfkfVarArr);
            return true;
        }
        if (Arrays.equals(bArr, dxjokdxxww.f12537wkgbmnqykc)) {
            hkdspvbjdz(outputStream, ppxfxbqfkfVarArr);
            return true;
        }
        if (Arrays.equals(bArr, dxjokdxxww.f12536ppxfxbqfkf)) {
            cllcsxoeiz(outputStream, ppxfxbqfkfVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, dxjokdxxww.f12532eablkybsjg)) {
            return false;
        }
        jpowsppfya(outputStream, ppxfxbqfkfVarArr);
        return true;
    }

    private static void iwizpuwonk(InputStream inputStream, ppxfxbqfkf ppxfxbqfkfVar) {
        BitSet bitSetValueOf = BitSet.valueOf(wkgbmnqykc.wkgbmnqykc(inputStream, wkgbmnqykc.iobyxmoadg(ppxfxbqfkfVar.f12565lqeggnwhkg * 2)));
        int i13 = 0;
        while (true) {
            int i14 = ppxfxbqfkfVar.f12565lqeggnwhkg;
            if (i13 >= i14) {
                return;
            }
            int iOjitshcjhn = ojitshcjhn(bitSetValueOf, i13, i14);
            if (iOjitshcjhn != 0) {
                Integer num = (Integer) ppxfxbqfkfVar.f12561dxjokdxxww.get(Integer.valueOf(i13));
                if (num == null) {
                    num = 0;
                }
                ppxfxbqfkfVar.f12561dxjokdxxww.put(Integer.valueOf(i13), Integer.valueOf(iOjitshcjhn | num.intValue()));
            }
            i13++;
        }
    }

    private static void jpowsppfya(OutputStream outputStream, ppxfxbqfkf[] ppxfxbqfkfVarArr) throws IOException {
        wkgbmnqykc.rgvfuqvkyq(outputStream, ppxfxbqfkfVarArr.length);
        for (ppxfxbqfkf ppxfxbqfkfVar : ppxfxbqfkfVarArr) {
            String strBtonecajqb = btonecajqb(ppxfxbqfkfVar.f12564iobyxmoadg, ppxfxbqfkfVar.f12569zoijcleaow, dxjokdxxww.f12532eablkybsjg);
            wkgbmnqykc.rgvfuqvkyq(outputStream, wkgbmnqykc.gtknphoqwx(strBtonecajqb));
            wkgbmnqykc.rgvfuqvkyq(outputStream, ppxfxbqfkfVar.f12561dxjokdxxww.size());
            wkgbmnqykc.rgvfuqvkyq(outputStream, ppxfxbqfkfVar.f12566nufgyqmvbu.length);
            wkgbmnqykc.vdvldrhtss(outputStream, ppxfxbqfkfVar.f12567ppxfxbqfkf);
            wkgbmnqykc.agtfadlqog(outputStream, strBtonecajqb);
            Iterator it = ppxfxbqfkfVar.f12561dxjokdxxww.keySet().iterator();
            while (it.hasNext()) {
                wkgbmnqykc.rgvfuqvkyq(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i13 : ppxfxbqfkfVar.f12566nufgyqmvbu) {
                wkgbmnqykc.rgvfuqvkyq(outputStream, i13);
            }
        }
    }

    private static ppxfxbqfkf[] jyumaefscl(InputStream inputStream, byte[] bArr, int i13, ppxfxbqfkf[] ppxfxbqfkfVarArr) {
        if (inputStream.available() == 0) {
            return new ppxfxbqfkf[0];
        }
        if (i13 != ppxfxbqfkfVarArr.length) {
            throw wkgbmnqykc.ppxfxbqfkf("Mismatched number of dex files found in metadata");
        }
        for (int i14 = 0; i14 < i13; i14++) {
            wkgbmnqykc.nufgyqmvbu(inputStream);
            String strGxszxtbevo = wkgbmnqykc.gxszxtbevo(inputStream, wkgbmnqykc.nufgyqmvbu(inputStream));
            long jDxjokdxxww = wkgbmnqykc.dxjokdxxww(inputStream);
            int iNufgyqmvbu = wkgbmnqykc.nufgyqmvbu(inputStream);
            ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = dxjokdxxww(ppxfxbqfkfVarArr, strGxszxtbevo);
            if (ppxfxbqfkfVarDxjokdxxww == null) {
                throw wkgbmnqykc.ppxfxbqfkf("Missing profile key: " + strGxszxtbevo);
            }
            ppxfxbqfkfVarDxjokdxxww.f12568wkgbmnqykc = jDxjokdxxww;
            int[] iArrAgtfadlqog = agtfadlqog(inputStream, iNufgyqmvbu);
            if (Arrays.equals(bArr, dxjokdxxww.f12532eablkybsjg)) {
                ppxfxbqfkfVarDxjokdxxww.f12562eablkybsjg = iNufgyqmvbu;
                ppxfxbqfkfVarDxjokdxxww.f12566nufgyqmvbu = iArrAgtfadlqog;
            }
        }
        return ppxfxbqfkfVarArr;
    }

    static ppxfxbqfkf[] kcexrzcfyt(InputStream inputStream, byte[] bArr, ppxfxbqfkf[] ppxfxbqfkfVarArr) throws IOException {
        if (!Arrays.equals(bArr, dxjokdxxww.f12533gxszxtbevo)) {
            throw wkgbmnqykc.ppxfxbqfkf("Unsupported meta version");
        }
        int iBtonecajqb = wkgbmnqykc.btonecajqb(inputStream);
        byte[] bArrEablkybsjg = wkgbmnqykc.eablkybsjg(inputStream, (int) wkgbmnqykc.dxjokdxxww(inputStream), (int) wkgbmnqykc.dxjokdxxww(inputStream));
        if (inputStream.read() > 0) {
            throw wkgbmnqykc.ppxfxbqfkf("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrEablkybsjg);
        try {
            ppxfxbqfkf[] ppxfxbqfkfVarArrZdlpuopuiu = zdlpuopuiu(byteArrayInputStream, iBtonecajqb, ppxfxbqfkfVarArr);
            byteArrayInputStream.close();
            return ppxfxbqfkfVarArrZdlpuopuiu;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static int lereixgezr(int i13) {
        return (i13 + 7) & (-8);
    }

    private static void lmojexxdyd(OutputStream outputStream, ppxfxbqfkf ppxfxbqfkfVar) throws IOException {
        hcddaimhww(outputStream, ppxfxbqfkfVar);
        cdpycssgdh(outputStream, ppxfxbqfkfVar);
        ylkuphrtab(outputStream, ppxfxbqfkfVar);
    }

    private static String lqeggnwhkg(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
        }
        return StringUtils.PROCESS_POSTFIX_DELIMITER.equals(str2) ? str.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER) : str;
    }

    private static String nufgyqmvbu(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static int ojitshcjhn(BitSet bitSet, int i13, int i14) {
        int i15 = bitSet.get(wflxmlrfwp(2, i13, i14)) ? 2 : 0;
        return bitSet.get(wflxmlrfwp(4, i13, i14)) ? i15 | 4 : i15;
    }

    static ppxfxbqfkf[] oxmwwwfdhm(InputStream inputStream, byte[] bArr, byte[] bArr2, ppxfxbqfkf[] ppxfxbqfkfVarArr) {
        if (Arrays.equals(bArr, dxjokdxxww.f12533gxszxtbevo)) {
            if (Arrays.equals(dxjokdxxww.f12534iobyxmoadg, bArr2)) {
                throw wkgbmnqykc.ppxfxbqfkf("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return kcexrzcfyt(inputStream, bArr, ppxfxbqfkfVarArr);
        }
        if (Arrays.equals(bArr, dxjokdxxww.f12535lqeggnwhkg)) {
            return yggfygwlhe(inputStream, bArr2, ppxfxbqfkfVarArr);
        }
        throw wkgbmnqykc.ppxfxbqfkf("Unsupported meta version");
    }

    private static void pkzmftpjix(OutputStream outputStream, int i13, ppxfxbqfkf ppxfxbqfkfVar) throws IOException {
        byte[] bArr = new byte[draadjrbmk(i13, ppxfxbqfkfVar.f12565lqeggnwhkg)];
        for (Map.Entry entry : ppxfxbqfkfVar.f12561dxjokdxxww.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i14 = 0;
            for (int i15 = 1; i15 <= 4; i15 <<= 1) {
                if (i15 != 1 && (i15 & i13) != 0) {
                    if ((i15 & iIntValue2) == i15) {
                        int i16 = (ppxfxbqfkfVar.f12565lqeggnwhkg * i14) + iIntValue;
                        int i17 = i16 / 8;
                        bArr[i17] = (byte) ((1 << (i16 % 8)) | bArr[i17]);
                    }
                    i14++;
                }
            }
        }
        outputStream.write(bArr);
    }

    private static void pmvmpeiblj(byte[] bArr, int i13, int i14, ppxfxbqfkf ppxfxbqfkfVar) {
        int iWflxmlrfwp = wflxmlrfwp(i13, i14, ppxfxbqfkfVar.f12565lqeggnwhkg);
        int i15 = iWflxmlrfwp / 8;
        bArr[i15] = (byte) ((1 << (iWflxmlrfwp % 8)) | bArr[i15]);
    }

    private static btonecajqb ppxfxbqfkf(ppxfxbqfkf[] ppxfxbqfkfVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i13 = 0;
        for (int i14 = 0; i14 < ppxfxbqfkfVarArr.length; i14++) {
            try {
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkfVarArr[i14];
                wkgbmnqykc.rgvfuqvkyq(byteArrayOutputStream, i14);
                wkgbmnqykc.rgvfuqvkyq(byteArrayOutputStream, ppxfxbqfkfVar.f12562eablkybsjg);
                i13 = i13 + 4 + (ppxfxbqfkfVar.f12562eablkybsjg * 2);
                cdpycssgdh(byteArrayOutputStream, ppxfxbqfkfVar);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i13 == byteArray.length) {
            btonecajqb btonecajqbVar = new btonecajqb(eablkybsjg.CLASSES, i13, byteArray, true);
            byteArrayOutputStream.close();
            return btonecajqbVar;
        }
        throw wkgbmnqykc.ppxfxbqfkf("Expected size " + i13 + ", does not match actual size " + byteArray.length);
    }

    static byte[] rgvfuqvkyq(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, wkgbmnqykc.wkgbmnqykc(inputStream, bArr.length))) {
            return wkgbmnqykc.wkgbmnqykc(inputStream, dxjokdxxww.f12538zoijcleaow.length);
        }
        throw wkgbmnqykc.ppxfxbqfkf("Invalid magic");
    }

    private static void stevsuqkhv(OutputStream outputStream, ppxfxbqfkf[] ppxfxbqfkfVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(yadqdtsiqt(ppxfxbqfkfVarArr));
        arrayList.add(ppxfxbqfkf(ppxfxbqfkfVarArr));
        arrayList.add(wkgbmnqykc(ppxfxbqfkfVarArr));
        long length2 = ((long) dxjokdxxww.f12534iobyxmoadg.length) + ((long) f12548iobyxmoadg.length) + 4 + ((long) (arrayList.size() * 16));
        wkgbmnqykc.vdvldrhtss(outputStream, arrayList.size());
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            btonecajqb btonecajqbVar = (btonecajqb) arrayList.get(i13);
            wkgbmnqykc.vdvldrhtss(outputStream, btonecajqbVar.f12528iobyxmoadg.wkgbmnqykc());
            wkgbmnqykc.vdvldrhtss(outputStream, length2);
            if (btonecajqbVar.f12530wkgbmnqykc) {
                byte[] bArr = btonecajqbVar.f12529ppxfxbqfkf;
                long length3 = bArr.length;
                byte[] bArrZoijcleaow = wkgbmnqykc.zoijcleaow(bArr);
                arrayList2.add(bArrZoijcleaow);
                wkgbmnqykc.vdvldrhtss(outputStream, bArrZoijcleaow.length);
                wkgbmnqykc.vdvldrhtss(outputStream, length3);
                length = bArrZoijcleaow.length;
            } else {
                arrayList2.add(btonecajqbVar.f12529ppxfxbqfkf);
                wkgbmnqykc.vdvldrhtss(outputStream, btonecajqbVar.f12529ppxfxbqfkf.length);
                wkgbmnqykc.vdvldrhtss(outputStream, 0L);
                length = btonecajqbVar.f12529ppxfxbqfkf.length;
            }
            length2 += (long) length;
        }
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            outputStream.write((byte[]) arrayList2.get(i14));
        }
    }

    private static void vdvldrhtss(InputStream inputStream, ppxfxbqfkf ppxfxbqfkfVar) {
        int iAvailable = inputStream.available() - ppxfxbqfkfVar.f12563gxszxtbevo;
        int iNufgyqmvbu = 0;
        while (inputStream.available() > iAvailable) {
            iNufgyqmvbu += wkgbmnqykc.nufgyqmvbu(inputStream);
            ppxfxbqfkfVar.f12561dxjokdxxww.put(Integer.valueOf(iNufgyqmvbu), 1);
            for (int iNufgyqmvbu2 = wkgbmnqykc.nufgyqmvbu(inputStream); iNufgyqmvbu2 > 0; iNufgyqmvbu2--) {
                zynmafqrjb(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw wkgbmnqykc.ppxfxbqfkf("Read too much data during profile line parse");
        }
    }

    private static int wflxmlrfwp(int i13, int i14, int i15) {
        if (i13 == 1) {
            throw wkgbmnqykc.ppxfxbqfkf("HOT methods are not stored in the bitmap");
        }
        if (i13 == 2) {
            return i14;
        }
        if (i13 == 4) {
            return i14 + i15;
        }
        throw wkgbmnqykc.ppxfxbqfkf("Unexpected flag: " + i13);
    }

    private static btonecajqb wkgbmnqykc(ppxfxbqfkf[] ppxfxbqfkfVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i13 = 0;
        for (int i14 = 0; i14 < ppxfxbqfkfVarArr.length; i14++) {
            try {
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkfVarArr[i14];
                int iIobyxmoadg = iobyxmoadg(ppxfxbqfkfVar);
                byte[] bArrEablkybsjg = eablkybsjg(iIobyxmoadg, ppxfxbqfkfVar);
                byte[] bArrGxszxtbevo = gxszxtbevo(ppxfxbqfkfVar);
                wkgbmnqykc.rgvfuqvkyq(byteArrayOutputStream, i14);
                int length = bArrEablkybsjg.length + 2 + bArrGxszxtbevo.length;
                wkgbmnqykc.vdvldrhtss(byteArrayOutputStream, length);
                wkgbmnqykc.rgvfuqvkyq(byteArrayOutputStream, iIobyxmoadg);
                byteArrayOutputStream.write(bArrEablkybsjg);
                byteArrayOutputStream.write(bArrGxszxtbevo);
                i13 = i13 + 6 + length;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i13 == byteArray.length) {
            btonecajqb btonecajqbVar = new btonecajqb(eablkybsjg.METHODS, i13, byteArray, true);
            byteArrayOutputStream.close();
            return btonecajqbVar;
        }
        throw wkgbmnqykc.ppxfxbqfkf("Expected size " + i13 + ", does not match actual size " + byteArray.length);
    }

    private static void wwaezpbzkn(OutputStream outputStream, ppxfxbqfkf ppxfxbqfkfVar, String str) throws IOException {
        wkgbmnqykc.rgvfuqvkyq(outputStream, wkgbmnqykc.gtknphoqwx(str));
        wkgbmnqykc.rgvfuqvkyq(outputStream, ppxfxbqfkfVar.f12562eablkybsjg);
        wkgbmnqykc.vdvldrhtss(outputStream, ppxfxbqfkfVar.f12563gxszxtbevo);
        wkgbmnqykc.vdvldrhtss(outputStream, ppxfxbqfkfVar.f12567ppxfxbqfkf);
        wkgbmnqykc.vdvldrhtss(outputStream, ppxfxbqfkfVar.f12565lqeggnwhkg);
        wkgbmnqykc.agtfadlqog(outputStream, str);
    }

    private static void wypolnanlu(OutputStream outputStream, ppxfxbqfkf[] ppxfxbqfkfVarArr) throws IOException {
        stevsuqkhv(outputStream, ppxfxbqfkfVarArr);
    }

    private static btonecajqb yadqdtsiqt(ppxfxbqfkf[] ppxfxbqfkfVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            wkgbmnqykc.rgvfuqvkyq(byteArrayOutputStream, ppxfxbqfkfVarArr.length);
            int i13 = 2;
            for (ppxfxbqfkf ppxfxbqfkfVar : ppxfxbqfkfVarArr) {
                wkgbmnqykc.vdvldrhtss(byteArrayOutputStream, ppxfxbqfkfVar.f12567ppxfxbqfkf);
                wkgbmnqykc.vdvldrhtss(byteArrayOutputStream, ppxfxbqfkfVar.f12568wkgbmnqykc);
                wkgbmnqykc.vdvldrhtss(byteArrayOutputStream, ppxfxbqfkfVar.f12565lqeggnwhkg);
                String strBtonecajqb = btonecajqb(ppxfxbqfkfVar.f12564iobyxmoadg, ppxfxbqfkfVar.f12569zoijcleaow, dxjokdxxww.f12534iobyxmoadg);
                int iGtknphoqwx = wkgbmnqykc.gtknphoqwx(strBtonecajqb);
                wkgbmnqykc.rgvfuqvkyq(byteArrayOutputStream, iGtknphoqwx);
                i13 = i13 + 14 + iGtknphoqwx;
                wkgbmnqykc.agtfadlqog(byteArrayOutputStream, strBtonecajqb);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i13 == byteArray.length) {
                btonecajqb btonecajqbVar = new btonecajqb(eablkybsjg.DEX_FILES, i13, byteArray, false);
                byteArrayOutputStream.close();
                return btonecajqbVar;
            }
            throw wkgbmnqykc.ppxfxbqfkf("Expected size " + i13 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static ppxfxbqfkf[] yggfygwlhe(InputStream inputStream, byte[] bArr, ppxfxbqfkf[] ppxfxbqfkfVarArr) throws IOException {
        int iNufgyqmvbu = wkgbmnqykc.nufgyqmvbu(inputStream);
        byte[] bArrEablkybsjg = wkgbmnqykc.eablkybsjg(inputStream, (int) wkgbmnqykc.dxjokdxxww(inputStream), (int) wkgbmnqykc.dxjokdxxww(inputStream));
        if (inputStream.read() > 0) {
            throw wkgbmnqykc.ppxfxbqfkf("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrEablkybsjg);
        try {
            ppxfxbqfkf[] ppxfxbqfkfVarArrJyumaefscl = jyumaefscl(byteArrayInputStream, bArr, iNufgyqmvbu, ppxfxbqfkfVarArr);
            byteArrayInputStream.close();
            return ppxfxbqfkfVarArrJyumaefscl;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void ylkuphrtab(OutputStream outputStream, ppxfxbqfkf ppxfxbqfkfVar) throws IOException {
        byte[] bArr = new byte[gtknphoqwx(ppxfxbqfkfVar.f12565lqeggnwhkg)];
        for (Map.Entry entry : ppxfxbqfkfVar.f12561dxjokdxxww.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                pmvmpeiblj(bArr, 2, iIntValue, ppxfxbqfkfVar);
            }
            if ((iIntValue2 & 4) != 0) {
                pmvmpeiblj(bArr, 4, iIntValue, ppxfxbqfkfVar);
            }
        }
        outputStream.write(bArr);
    }

    private static ppxfxbqfkf[] zdlpuopuiu(InputStream inputStream, int i13, ppxfxbqfkf[] ppxfxbqfkfVarArr) {
        if (inputStream.available() == 0) {
            return new ppxfxbqfkf[0];
        }
        if (i13 != ppxfxbqfkfVarArr.length) {
            throw wkgbmnqykc.ppxfxbqfkf("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i13];
        int[] iArr = new int[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int iNufgyqmvbu = wkgbmnqykc.nufgyqmvbu(inputStream);
            iArr[i14] = wkgbmnqykc.nufgyqmvbu(inputStream);
            strArr[i14] = wkgbmnqykc.gxszxtbevo(inputStream, iNufgyqmvbu);
        }
        for (int i15 = 0; i15 < i13; i15++) {
            ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkfVarArr[i15];
            if (!ppxfxbqfkfVar.f12569zoijcleaow.equals(strArr[i15])) {
                throw wkgbmnqykc.ppxfxbqfkf("Order of dexfiles in metadata did not match baseline");
            }
            int i16 = iArr[i15];
            ppxfxbqfkfVar.f12562eablkybsjg = i16;
            ppxfxbqfkfVar.f12566nufgyqmvbu = agtfadlqog(inputStream, i16);
        }
        return ppxfxbqfkfVarArr;
    }

    private static byte[] zoijcleaow(ppxfxbqfkf[] ppxfxbqfkfVarArr, byte[] bArr) throws IOException {
        int i13 = 0;
        int iGtknphoqwx = 0;
        for (ppxfxbqfkf ppxfxbqfkfVar : ppxfxbqfkfVarArr) {
            iGtknphoqwx += wkgbmnqykc.gtknphoqwx(btonecajqb(ppxfxbqfkfVar.f12564iobyxmoadg, ppxfxbqfkfVar.f12569zoijcleaow, bArr)) + 16 + (ppxfxbqfkfVar.f12562eablkybsjg * 2) + ppxfxbqfkfVar.f12563gxszxtbevo + gtknphoqwx(ppxfxbqfkfVar.f12565lqeggnwhkg);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iGtknphoqwx);
        if (Arrays.equals(bArr, dxjokdxxww.f12536ppxfxbqfkf)) {
            int length = ppxfxbqfkfVarArr.length;
            while (i13 < length) {
                ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVarArr[i13];
                wwaezpbzkn(byteArrayOutputStream, ppxfxbqfkfVar2, btonecajqb(ppxfxbqfkfVar2.f12564iobyxmoadg, ppxfxbqfkfVar2.f12569zoijcleaow, bArr));
                lmojexxdyd(byteArrayOutputStream, ppxfxbqfkfVar2);
                i13++;
            }
        } else {
            for (ppxfxbqfkf ppxfxbqfkfVar3 : ppxfxbqfkfVarArr) {
                wwaezpbzkn(byteArrayOutputStream, ppxfxbqfkfVar3, btonecajqb(ppxfxbqfkfVar3.f12564iobyxmoadg, ppxfxbqfkfVar3.f12569zoijcleaow, bArr));
            }
            int length2 = ppxfxbqfkfVarArr.length;
            while (i13 < length2) {
                lmojexxdyd(byteArrayOutputStream, ppxfxbqfkfVarArr[i13]);
                i13++;
            }
        }
        if (byteArrayOutputStream.size() == iGtknphoqwx) {
            return byteArrayOutputStream.toByteArray();
        }
        throw wkgbmnqykc.ppxfxbqfkf("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iGtknphoqwx);
    }

    private static void zynmafqrjb(InputStream inputStream) {
        wkgbmnqykc.nufgyqmvbu(inputStream);
        int iBtonecajqb = wkgbmnqykc.btonecajqb(inputStream);
        if (iBtonecajqb == 6 || iBtonecajqb == 7) {
            return;
        }
        while (iBtonecajqb > 0) {
            wkgbmnqykc.btonecajqb(inputStream);
            for (int iBtonecajqb2 = wkgbmnqykc.btonecajqb(inputStream); iBtonecajqb2 > 0; iBtonecajqb2--) {
                wkgbmnqykc.nufgyqmvbu(inputStream);
            }
            iBtonecajqb--;
        }
    }
}
