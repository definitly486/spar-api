package z;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class metgxyhuhe {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ppxfxbqfkf(androidx.collection.hcddaimhww hcddaimhwwVar, Map map) {
        if (hcddaimhwwVar == null || hcddaimhwwVar.gxszxtbevo() != map.size()) {
            return false;
        }
        Object[] objArr = hcddaimhwwVar.f4329zoijcleaow;
        int[] iArr = hcddaimhwwVar.f4327ppxfxbqfkf;
        long[] jArr = hcddaimhwwVar.f4326iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        loop0: while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        int i16 = (i13 << 3) + i15;
                        Object obj = objArr[i16];
                        int i17 = iArr[i16];
                        Integer num = (Integer) map.get((x.iobyxmoadg) obj);
                        if (num == null || num.intValue() != i17) {
                            break loop0;
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return true;
                }
            }
            if (i13 == length) {
                return true;
            }
            i13++;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf wkgbmnqykc(btonecajqb btonecajqbVar, int i13, int i14) {
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = btonecajqbVar.wflxmlrfwp().e0();
        if (ppxfxbqfkfVarE0 == null || (ppxfxbqfkfVarE0.d0() & i13) == 0) {
            return null;
        }
        while (ppxfxbqfkfVarE0 != null) {
            int iI0 = ppxfxbqfkfVarE0.i0();
            if ((iI0 & i14) != 0) {
                return null;
            }
            if ((iI0 & i13) != 0) {
                return ppxfxbqfkfVarE0;
            }
            ppxfxbqfkfVarE0 = ppxfxbqfkfVarE0.e0();
        }
        return null;
    }
}
