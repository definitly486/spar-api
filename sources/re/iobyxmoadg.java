package re;

import com.google.zxing.eablkybsjg;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import se.ppxfxbqfkf;
import te.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements eablkybsjg {
    private static zoijcleaow ppxfxbqfkf(se.iobyxmoadg iobyxmoadgVar, int i13, int i14) {
        zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        if (zoijcleaowVarIobyxmoadg == null) {
            throw new IllegalStateException();
        }
        int iGxszxtbevo = zoijcleaowVarIobyxmoadg.gxszxtbevo();
        int iEablkybsjg = zoijcleaowVarIobyxmoadg.eablkybsjg();
        int iMax = Math.max(i13, iGxszxtbevo);
        int iMax2 = Math.max(i14, iEablkybsjg);
        int iMin = Math.min(iMax / iGxszxtbevo, iMax2 / iEablkybsjg);
        int i15 = (iMax - (iGxszxtbevo * iMin)) / 2;
        int i16 = (iMax2 - (iEablkybsjg * iMin)) / 2;
        zoijcleaow zoijcleaowVar = new zoijcleaow(iMax, iMax2);
        int i17 = 0;
        while (i17 < iEablkybsjg) {
            int i18 = 0;
            int i19 = i15;
            while (i18 < iGxszxtbevo) {
                if (zoijcleaowVarIobyxmoadg.wkgbmnqykc(i18, i17)) {
                    zoijcleaowVar.nufgyqmvbu(i19, i16, iMin, iMin);
                }
                i18++;
                i19 += iMin;
            }
            i17++;
            i16 += iMin;
        }
        return zoijcleaowVar;
    }

    private static zoijcleaow zoijcleaow(String str, com.google.zxing.iobyxmoadg iobyxmoadgVar, int i13, int i14, Charset charset, int i15, int i16) {
        if (iobyxmoadgVar == com.google.zxing.iobyxmoadg.AZTEC) {
            return ppxfxbqfkf(ppxfxbqfkf.wkgbmnqykc(str.getBytes(charset), i15, i16), i13, i14);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(iobyxmoadgVar)));
    }

    @Override // com.google.zxing.eablkybsjg
    public zoijcleaow iobyxmoadg(String str, com.google.zxing.iobyxmoadg iobyxmoadgVar, int i13, int i14, Map map) {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i15 = 33;
        int i16 = 0;
        if (map != null) {
            com.google.zxing.ppxfxbqfkf ppxfxbqfkfVar = com.google.zxing.ppxfxbqfkf.CHARACTER_SET;
            if (map.containsKey(ppxfxbqfkfVar)) {
                charsetForName = Charset.forName(map.get(ppxfxbqfkfVar).toString());
            }
            com.google.zxing.ppxfxbqfkf ppxfxbqfkfVar2 = com.google.zxing.ppxfxbqfkf.ERROR_CORRECTION;
            i15 = map.containsKey(ppxfxbqfkfVar2) ? Integer.parseInt(map.get(ppxfxbqfkfVar2).toString()) : 33;
            com.google.zxing.ppxfxbqfkf ppxfxbqfkfVar3 = com.google.zxing.ppxfxbqfkf.AZTEC_LAYERS;
            if (map.containsKey(ppxfxbqfkfVar3)) {
                i16 = Integer.parseInt(map.get(ppxfxbqfkfVar3).toString());
            }
        }
        return zoijcleaow(str, iobyxmoadgVar, i13, i14, charsetForName, i15, i16);
    }
}
