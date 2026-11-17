package g82;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import igdgnonuha.z1;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(float f13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(f13, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final float f13, final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1076475220);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.zoijcleaow(f13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1076475220, i15, -1, "ru.myspar.story.impl.presentation.compose.control.StoryIndicator (StoryIndicator.kt:29)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = e.eablkybsjg.iobyxmoadg(wkgbmnqykcVar, bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(3)));
            oipsdeybqn.iobyxmoadg iobyxmoadgVar = oipsdeybqn.f38945zoijcleaow;
            z1.kcexrzcfyt(f13, androidx.compose.foundation.zoijcleaow.wkgbmnqykc(wkgbmnqykcVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf(), null, 2, null), iobyxmoadgVar.nufgyqmvbu(), iobyxmoadgVar.gxszxtbevo(), 0, draadjrbmkVarBtonecajqb, (i15 & 14) | 3456, 16);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: g82.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gxszxtbevo.ppxfxbqfkf(f13, wkgbmnqykcVar, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
