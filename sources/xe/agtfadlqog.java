package xe;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class agtfadlqog implements com.google.zxing.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Pattern f122202iobyxmoadg = Pattern.compile("[0-9]+");

    private static te.zoijcleaow lqeggnwhkg(boolean[] zArr, int i13, int i14, int i15) {
        int length = zArr.length;
        int i16 = i15 + length;
        int iMax = Math.max(i13, i16);
        int iMax2 = Math.max(1, i14);
        int i17 = iMax / i16;
        int i18 = (iMax - (length * i17)) / 2;
        te.zoijcleaow zoijcleaowVar = new te.zoijcleaow(iMax, iMax2);
        int i19 = 0;
        while (i19 < length) {
            if (zArr[i19]) {
                zoijcleaowVar.nufgyqmvbu(i18, 0, i17, iMax2);
            }
            i19++;
            i18 += i17;
        }
        return zoijcleaowVar;
    }

    protected static void ppxfxbqfkf(String str) {
        if (!f122202iobyxmoadg.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    protected static int zoijcleaow(boolean[] zArr, int i13, int[] iArr, boolean z13) {
        int i14 = 0;
        for (int i15 : iArr) {
            int i16 = 0;
            while (i16 < i15) {
                zArr[i13] = z13;
                i16++;
                i13++;
            }
            i14 += i15;
            z13 = !z13;
        }
        return i14;
    }

    public int eablkybsjg() {
        return 10;
    }

    protected abstract Collection gxszxtbevo();

    @Override // com.google.zxing.eablkybsjg
    public te.zoijcleaow iobyxmoadg(String str, com.google.zxing.iobyxmoadg iobyxmoadgVar, int i13, int i14, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i13 < 0 || i14 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i13 + 'x' + i14);
        }
        Collection collectionGxszxtbevo = gxszxtbevo();
        if (collectionGxszxtbevo != null && !collectionGxszxtbevo.contains(iobyxmoadgVar)) {
            throw new IllegalArgumentException("Can only encode " + collectionGxszxtbevo + ", but got " + iobyxmoadgVar);
        }
        int iEablkybsjg = eablkybsjg();
        if (map != null) {
            com.google.zxing.ppxfxbqfkf ppxfxbqfkfVar = com.google.zxing.ppxfxbqfkf.MARGIN;
            if (map.containsKey(ppxfxbqfkfVar)) {
                iEablkybsjg = Integer.parseInt(map.get(ppxfxbqfkfVar).toString());
            }
        }
        return lqeggnwhkg(wkgbmnqykc(str), i13, i14, iEablkybsjg);
    }

    public abstract boolean[] wkgbmnqykc(String str);
}
