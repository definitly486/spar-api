package cdpycssgdh;

import istkbnxepw.yfnezrywwk;
import java.util.ArrayList;
import lereixgezr.esjtqupxsv;

/* JADX INFO: loaded from: classes.dex */
public abstract class ojitshcjhn {
    public static esjtqupxsv iobyxmoadg(yfnezrywwk yfnezrywwkVar, esjtqupxsv esjtqupxsvVar) {
        boolean z13;
        if (yfnezrywwkVar == null) {
            return esjtqupxsvVar;
        }
        esjtqupxsv.iobyxmoadg iobyxmoadgVar = new esjtqupxsv.iobyxmoadg(esjtqupxsvVar);
        boolean z14 = true;
        if (esjtqupxsvVar.ppxfxbqfkf().isEmpty() || zoijcleaow(yfnezrywwkVar, 1, 2)) {
            z13 = false;
        } else {
            iobyxmoadgVar.ppxfxbqfkf(1);
            z13 = true;
        }
        if (!esjtqupxsvVar.zoijcleaow().isEmpty() && !zoijcleaow(yfnezrywwkVar, 3)) {
            iobyxmoadgVar.ppxfxbqfkf(2);
            z13 = true;
        }
        if (esjtqupxsvVar.wkgbmnqykc().isEmpty() || zoijcleaow(yfnezrywwkVar, 4)) {
            z14 = z13;
        } else {
            iobyxmoadgVar.ppxfxbqfkf(4);
        }
        if (!z14) {
            return esjtqupxsvVar;
        }
        esjtqupxsv esjtqupxsvVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
        if (esjtqupxsvVarZoijcleaow.ppxfxbqfkf().isEmpty() && esjtqupxsvVarZoijcleaow.zoijcleaow().isEmpty() && esjtqupxsvVarZoijcleaow.wkgbmnqykc().isEmpty()) {
            return null;
        }
        return iobyxmoadgVar.zoijcleaow();
    }

    public static boolean zoijcleaow(yfnezrywwk yfnezrywwkVar, int... iArr) {
        if (yfnezrywwkVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i13 : iArr) {
            arrayList.add(Integer.valueOf(i13));
        }
        return yfnezrywwkVar.getSupportedCameraOperations().containsAll(arrayList);
    }
}
