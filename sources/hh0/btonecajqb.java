package hh0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import yh0.esjtqupxsv;

/* JADX INFO: loaded from: classes4.dex */
public abstract class btonecajqb {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(yh0.iobyxmoadg.eablkybsjg eablkybsjgVar, esjtqupxsv esjtqupxsvVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(eablkybsjgVar, esjtqupxsvVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final yh0.iobyxmoadg.eablkybsjg item, final esjtqupxsv sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1764948677);
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
                jyumaefscl.ntlheqmsrt(-1764948677, i14, -1, "ru.myspar.myspar.impl.presentation.compose.features.FeatureSection (FeatureSection.kt:13)");
            }
            if (item instanceof yh0.iobyxmoadg.eablkybsjg.zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(88547221);
                nufgyqmvbu.ppxfxbqfkf(((yh0.iobyxmoadg.eablkybsjg.zoijcleaow) item).nufgyqmvbu(), sectionsCallbacks.nufgyqmvbu(), draadjrbmkVarBtonecajqb, 0, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof yh0.iobyxmoadg.eablkybsjg.ppxfxbqfkf)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-966976643);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(88741932);
                fh0.lqeggnwhkg.ppxfxbqfkf(w0.dxjokdxxww.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(98), w0.nufgyqmvbu.lqeggnwhkg(120)), null, false, draadjrbmkVarBtonecajqb, 390, 2);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: hh0.dxjokdxxww
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return btonecajqb.ppxfxbqfkf(item, sectionsCallbacks, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
