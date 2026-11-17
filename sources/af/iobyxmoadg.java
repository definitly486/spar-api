package af;

import cf.gxszxtbevo;
import com.google.zxing.eablkybsjg;
import com.google.zxing.ppxfxbqfkf;
import java.util.Map;
import te.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements eablkybsjg {
    private static zoijcleaow zoijcleaow(gxszxtbevo gxszxtbevoVar, int i13, int i14, int i15) {
        cf.zoijcleaow zoijcleaowVarIobyxmoadg = gxszxtbevoVar.iobyxmoadg();
        if (zoijcleaowVarIobyxmoadg == null) {
            throw new IllegalStateException();
        }
        int iEablkybsjg = zoijcleaowVarIobyxmoadg.eablkybsjg();
        int iWkgbmnqykc = zoijcleaowVarIobyxmoadg.wkgbmnqykc();
        int i16 = i15 << 1;
        int i17 = iEablkybsjg + i16;
        int i18 = i16 + iWkgbmnqykc;
        int iMax = Math.max(i13, i17);
        int iMax2 = Math.max(i14, i18);
        int iMin = Math.min(iMax / i17, iMax2 / i18);
        int i19 = (iMax - (iEablkybsjg * iMin)) / 2;
        int i23 = (iMax2 - (iWkgbmnqykc * iMin)) / 2;
        zoijcleaow zoijcleaowVar = new zoijcleaow(iMax, iMax2);
        int i24 = 0;
        while (i24 < iWkgbmnqykc) {
            int i25 = 0;
            int i26 = i19;
            while (i25 < iEablkybsjg) {
                if (zoijcleaowVarIobyxmoadg.zoijcleaow(i25, i24) == 1) {
                    zoijcleaowVar.nufgyqmvbu(i26, i23, iMin, iMin);
                }
                i25++;
                i26 += iMin;
            }
            i24++;
            i23 += iMin;
        }
        return zoijcleaowVar;
    }

    @Override // com.google.zxing.eablkybsjg
    public zoijcleaow iobyxmoadg(String str, com.google.zxing.iobyxmoadg iobyxmoadgVar, int i13, int i14, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (iobyxmoadgVar != com.google.zxing.iobyxmoadg.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(iobyxmoadgVar)));
        }
        if (i13 < 0 || i14 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i13 + 'x' + i14);
        }
        bf.iobyxmoadg iobyxmoadgVarValueOf = bf.iobyxmoadg.L;
        int i15 = 4;
        if (map != null) {
            ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.ERROR_CORRECTION;
            if (map.containsKey(ppxfxbqfkfVar)) {
                iobyxmoadgVarValueOf = bf.iobyxmoadg.valueOf(map.get(ppxfxbqfkfVar).toString());
            }
            ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkf.MARGIN;
            if (map.containsKey(ppxfxbqfkfVar2)) {
                i15 = Integer.parseInt(map.get(ppxfxbqfkfVar2).toString());
            }
        }
        return zoijcleaow(cf.ppxfxbqfkf.agtfadlqog(str, iobyxmoadgVarValueOf, map), i13, i14, i15);
    }
}
