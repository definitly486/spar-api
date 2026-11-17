package t31;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import czzsidtyhn.uawqvzlxes;
import gg.wwaezpbzkn;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(float f13, int i13, draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(f13, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final float f13, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1056118149);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.zoijcleaow(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1056118149, i14, -1, "ru.myspar.proloyalty.core.ui.compose.components.spacer.VerticalSpacer (VerticalSpacer.kt:9)");
            }
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, f13), draadjrbmkVarBtonecajqb, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: t31.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wkgbmnqykc.ppxfxbqfkf(f13, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
