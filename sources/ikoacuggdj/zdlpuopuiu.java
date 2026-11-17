package ikoacuggdj;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdlpuopuiu {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        zoijcleaow(wkgbmnqykcVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-932836462);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar) ? 32 : 16;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 19) != 18, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-932836462, i14, -1, "androidx.compose.foundation.Canvas (Canvas.kt:40)");
            }
            czzsidtyhn.uawqvzlxes.iobyxmoadg(androidx.compose.ui.draw.zoijcleaow.zoijcleaow(wkgbmnqykcVar, draadjrbmkVar), draadjrbmkVarBtonecajqb, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ikoacuggdj.kcexrzcfyt
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zdlpuopuiu.ppxfxbqfkf(wkgbmnqykcVar, draadjrbmkVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
