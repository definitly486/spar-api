package dh0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import yh0.esjtqupxsv;

/* JADX INFO: loaded from: classes4.dex */
public abstract class draadjrbmk {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(yh0.iobyxmoadg.zoijcleaow zoijcleaowVar, esjtqupxsv esjtqupxsvVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(zoijcleaowVar, esjtqupxsvVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final yh0.iobyxmoadg.zoijcleaow item, final esjtqupxsv sectionsCallbacks, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1653146429);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(item) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(sectionsCallbacks) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1653146429, i14, -1, "ru.myspar.myspar.impl.presentation.compose.brands.BrandSection (BrandSection.kt:13)");
            }
            if (item instanceof yh0.iobyxmoadg.zoijcleaow.C3190zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1235393475);
                btonecajqb.ppxfxbqfkf(((yh0.iobyxmoadg.zoijcleaow.C3190zoijcleaow) item).lqeggnwhkg(), sectionsCallbacks.zoijcleaow(), draadjrbmkVarBtonecajqb, 0, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof yh0.iobyxmoadg.zoijcleaow.ppxfxbqfkf)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1235391823);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1235398358);
                fh0.lqeggnwhkg.ppxfxbqfkf(w0.dxjokdxxww.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(158), w0.nufgyqmvbu.lqeggnwhkg(64)), null, false, draadjrbmkVarBtonecajqb, 6, 6);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: dh0.gtknphoqwx
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return draadjrbmk.ppxfxbqfkf(item, sectionsCallbacks, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
