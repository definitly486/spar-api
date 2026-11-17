package cq;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.rgvfuqvkyq;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import czzsidtyhn.jhduphickx;
import gg.wwaezpbzkn;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, String str, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, str, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final String str, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1866394036);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1866394036, i15, -1, "ru.myspar.cart.impl.presentation.compose.load_info.LoadIndoBannerImage (LoadIndoBannerImage.kt:20)");
            }
            com.bumptech.glide.integration.compose.zoijcleaow.zoijcleaow(str, rgvfuqvkyq.iobyxmoadg(cdpycssgdh.dxjokdxxww(wkgbmnqykcVar, nufgyqmvbu.lqeggnwhkg(86)), jhduphickx.Min), null, iobyxmoadg.f25501iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 3072, 4);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: cq.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.ppxfxbqfkf(wkgbmnqykcVar, str, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
