package ve;

import androidx.appcompat.app.yggfygwlhe;
import com.google.zxing.eablkybsjg;
import com.google.zxing.ppxfxbqfkf;
import java.util.Map;
import te.zoijcleaow;
import we.btonecajqb;
import we.draadjrbmk;
import we.dxjokdxxww;
import we.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements eablkybsjg {
    private static zoijcleaow ppxfxbqfkf(we.eablkybsjg eablkybsjgVar, gtknphoqwx gtknphoqwxVar, int i13, int i14) {
        int iNufgyqmvbu = gtknphoqwxVar.nufgyqmvbu();
        int iLqeggnwhkg = gtknphoqwxVar.lqeggnwhkg();
        cf.zoijcleaow zoijcleaowVar = new cf.zoijcleaow(gtknphoqwxVar.btonecajqb(), gtknphoqwxVar.dxjokdxxww());
        int i15 = 0;
        for (int i16 = 0; i16 < iLqeggnwhkg; i16++) {
            if (i16 % gtknphoqwxVar.f119435eablkybsjg == 0) {
                int i17 = 0;
                for (int i18 = 0; i18 < gtknphoqwxVar.btonecajqb(); i18++) {
                    zoijcleaowVar.lqeggnwhkg(i17, i15, i18 % 2 == 0);
                    i17++;
                }
                i15++;
            }
            int i19 = 0;
            for (int i23 = 0; i23 < iNufgyqmvbu; i23++) {
                if (i23 % gtknphoqwxVar.f119441wkgbmnqykc == 0) {
                    zoijcleaowVar.lqeggnwhkg(i19, i15, true);
                    i19++;
                }
                zoijcleaowVar.lqeggnwhkg(i19, i15, eablkybsjgVar.eablkybsjg(i23, i16));
                int i24 = i19 + 1;
                int i25 = gtknphoqwxVar.f119441wkgbmnqykc;
                if (i23 % i25 == i25 - 1) {
                    zoijcleaowVar.lqeggnwhkg(i24, i15, i16 % 2 == 0);
                    i19 += 2;
                } else {
                    i19 = i24;
                }
            }
            int i26 = i15 + 1;
            int i27 = gtknphoqwxVar.f119435eablkybsjg;
            if (i16 % i27 == i27 - 1) {
                int i28 = 0;
                for (int i29 = 0; i29 < gtknphoqwxVar.btonecajqb(); i29++) {
                    zoijcleaowVar.lqeggnwhkg(i28, i26, true);
                    i28++;
                }
                i15 += 2;
            } else {
                i15 = i26;
            }
        }
        return zoijcleaow(zoijcleaowVar, i13, i14);
    }

    private static zoijcleaow zoijcleaow(cf.zoijcleaow zoijcleaowVar, int i13, int i14) {
        zoijcleaow zoijcleaowVar2;
        int iEablkybsjg = zoijcleaowVar.eablkybsjg();
        int iWkgbmnqykc = zoijcleaowVar.wkgbmnqykc();
        int iMax = Math.max(i13, iEablkybsjg);
        int iMax2 = Math.max(i14, iWkgbmnqykc);
        int iMin = Math.min(iMax / iEablkybsjg, iMax2 / iWkgbmnqykc);
        int i15 = (iMax - (iEablkybsjg * iMin)) / 2;
        int i16 = (iMax2 - (iWkgbmnqykc * iMin)) / 2;
        if (i14 < iWkgbmnqykc || i13 < iEablkybsjg) {
            zoijcleaowVar2 = new zoijcleaow(iEablkybsjg, iWkgbmnqykc);
            i15 = 0;
            i16 = 0;
        } else {
            zoijcleaowVar2 = new zoijcleaow(i13, i14);
        }
        zoijcleaowVar2.zoijcleaow();
        int i17 = 0;
        while (i17 < iWkgbmnqykc) {
            int i18 = i15;
            int i19 = 0;
            while (i19 < iEablkybsjg) {
                if (zoijcleaowVar.zoijcleaow(i19, i17) == 1) {
                    zoijcleaowVar2.nufgyqmvbu(i18, i16, iMin, iMin);
                }
                i19++;
                i18 += iMin;
            }
            i17++;
            i16 += iMin;
        }
        return zoijcleaowVar2;
    }

    @Override // com.google.zxing.eablkybsjg
    public zoijcleaow iobyxmoadg(String str, com.google.zxing.iobyxmoadg iobyxmoadgVar, int i13, int i14, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (iobyxmoadgVar != com.google.zxing.iobyxmoadg.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(iobyxmoadgVar)));
        }
        if (i13 < 0 || i14 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i13 + 'x' + i14);
        }
        draadjrbmk draadjrbmkVar = draadjrbmk.FORCE_NONE;
        if (map != null) {
            draadjrbmk draadjrbmkVar2 = (draadjrbmk) map.get(ppxfxbqfkf.DATA_MATRIX_SHAPE);
            if (draadjrbmkVar2 != null) {
                draadjrbmkVar = draadjrbmkVar2;
            }
            yggfygwlhe.iobyxmoadg(map.get(ppxfxbqfkf.MIN_SIZE));
            yggfygwlhe.iobyxmoadg(map.get(ppxfxbqfkf.MAX_SIZE));
        }
        String strZoijcleaow = btonecajqb.zoijcleaow(str, draadjrbmkVar, null, null);
        gtknphoqwx gtknphoqwxVarDraadjrbmk = gtknphoqwx.draadjrbmk(strZoijcleaow.length(), draadjrbmkVar, null, null, true);
        we.eablkybsjg eablkybsjgVar = new we.eablkybsjg(dxjokdxxww.zoijcleaow(strZoijcleaow, gtknphoqwxVarDraadjrbmk), gtknphoqwxVarDraadjrbmk.nufgyqmvbu(), gtknphoqwxVarDraadjrbmk.lqeggnwhkg());
        eablkybsjgVar.nufgyqmvbu();
        return ppxfxbqfkf(eablkybsjgVar, gtknphoqwxVarDraadjrbmk, i13, i14);
    }
}
