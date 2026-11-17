package ye;

import androidx.appcompat.app.yggfygwlhe;
import com.google.zxing.WriterException;
import com.google.zxing.eablkybsjg;
import com.google.zxing.ppxfxbqfkf;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import te.zoijcleaow;
import ze.wkgbmnqykc;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements eablkybsjg {
    private static zoijcleaow ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar, String str, int i13, int i14, int i15, int i16) throws WriterException {
        boolean z13;
        wkgbmnqykcVar.eablkybsjg(str, i13);
        byte[][] bArrZoijcleaow = wkgbmnqykcVar.gxszxtbevo().zoijcleaow(1, 4);
        if ((i15 > i14) != (bArrZoijcleaow[0].length < bArrZoijcleaow.length)) {
            bArrZoijcleaow = wkgbmnqykc(bArrZoijcleaow);
            z13 = true;
        } else {
            z13 = false;
        }
        int iMin = Math.min(i14 / bArrZoijcleaow[0].length, i15 / bArrZoijcleaow.length);
        if (iMin <= 1) {
            return zoijcleaow(bArrZoijcleaow, i16);
        }
        byte[][] bArrZoijcleaow2 = wkgbmnqykcVar.gxszxtbevo().zoijcleaow(iMin, iMin << 2);
        if (z13) {
            bArrZoijcleaow2 = wkgbmnqykc(bArrZoijcleaow2);
        }
        return zoijcleaow(bArrZoijcleaow2, i16);
    }

    private static byte[][] wkgbmnqykc(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i13 = 0; i13 < bArr.length; i13++) {
            int length = (bArr.length - i13) - 1;
            for (int i14 = 0; i14 < bArr[0].length; i14++) {
                bArr2[i14][length] = bArr[i13][i14];
            }
        }
        return bArr2;
    }

    private static zoijcleaow zoijcleaow(byte[][] bArr, int i13) {
        int i14 = i13 * 2;
        zoijcleaow zoijcleaowVar = new zoijcleaow(bArr[0].length + i14, bArr.length + i14);
        zoijcleaowVar.zoijcleaow();
        int iEablkybsjg = (zoijcleaowVar.eablkybsjg() - i13) - 1;
        int i15 = 0;
        while (i15 < bArr.length) {
            byte[] bArr2 = bArr[i15];
            for (int i16 = 0; i16 < bArr[0].length; i16++) {
                if (bArr2[i16] == 1) {
                    zoijcleaowVar.lqeggnwhkg(i16 + i13, iEablkybsjg);
                }
            }
            i15++;
            iEablkybsjg--;
        }
        return zoijcleaowVar;
    }

    @Override // com.google.zxing.eablkybsjg
    public zoijcleaow iobyxmoadg(String str, com.google.zxing.iobyxmoadg iobyxmoadgVar, int i13, int i14, Map map) {
        if (iobyxmoadgVar != com.google.zxing.iobyxmoadg.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(iobyxmoadgVar)));
        }
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
        int i15 = 30;
        int i16 = 2;
        if (map != null) {
            ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.PDF417_COMPACT;
            if (map.containsKey(ppxfxbqfkfVar)) {
                wkgbmnqykcVar.nufgyqmvbu(Boolean.parseBoolean(map.get(ppxfxbqfkfVar).toString()));
            }
            ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkf.PDF417_COMPACTION;
            if (map.containsKey(ppxfxbqfkfVar2)) {
                wkgbmnqykcVar.dxjokdxxww(ze.ppxfxbqfkf.valueOf(map.get(ppxfxbqfkfVar2).toString()));
            }
            ppxfxbqfkf ppxfxbqfkfVar3 = ppxfxbqfkf.PDF417_DIMENSIONS;
            if (map.containsKey(ppxfxbqfkfVar3)) {
                yggfygwlhe.iobyxmoadg(map.get(ppxfxbqfkfVar3));
                throw null;
            }
            ppxfxbqfkf ppxfxbqfkfVar4 = ppxfxbqfkf.MARGIN;
            i15 = map.containsKey(ppxfxbqfkfVar4) ? Integer.parseInt(map.get(ppxfxbqfkfVar4).toString()) : 30;
            ppxfxbqfkf ppxfxbqfkfVar5 = ppxfxbqfkf.ERROR_CORRECTION;
            i16 = map.containsKey(ppxfxbqfkfVar5) ? Integer.parseInt(map.get(ppxfxbqfkfVar5).toString()) : 2;
            ppxfxbqfkf ppxfxbqfkfVar6 = ppxfxbqfkf.CHARACTER_SET;
            if (map.containsKey(ppxfxbqfkfVar6)) {
                wkgbmnqykcVar.btonecajqb(Charset.forName(map.get(ppxfxbqfkfVar6).toString()));
            }
        }
        return ppxfxbqfkf(wkgbmnqykcVar, str, i16, i13, i14, i15);
    }
}
