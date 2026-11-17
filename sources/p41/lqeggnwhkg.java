package p41;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {
    public static final l.ppxfxbqfkf eablkybsjg(draadjrbmk draadjrbmkVar, int i13) {
        draadjrbmkVar.sopmlzcsov(801848872);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(801848872, i13, -1, "ru.myspar.proloyalty.core.ui.extensions.placeholderPainter (PlaceholderExt.kt:26)");
        }
        l.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = e0.wkgbmnqykc.ppxfxbqfkf(b31.gxszxtbevo.placeholder, draadjrbmkVar, 0);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return ppxfxbqfkfVarPpxfxbqfkf;
    }

    public static final l.ppxfxbqfkf gxszxtbevo(draadjrbmk draadjrbmkVar, int i13) {
        draadjrbmkVar.sopmlzcsov(264351566);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(264351566, i13, -1, "ru.myspar.proloyalty.core.ui.extensions.placeholderPainterTransparent (PlaceholderExt.kt:29)");
        }
        l.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = e0.wkgbmnqykc.ppxfxbqfkf(b31.gxszxtbevo.placeholder_transparent, draadjrbmkVar, 0);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return ppxfxbqfkfVarPpxfxbqfkf;
    }

    public static final com.bumptech.glide.integration.compose.eablkybsjg lqeggnwhkg() {
        return com.bumptech.glide.integration.compose.zoijcleaow.dxjokdxxww(b31.gxszxtbevo.placeholder_transparent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, String str, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, str, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final com.bumptech.glide.integration.compose.eablkybsjg wkgbmnqykc() {
        return com.bumptech.glide.integration.compose.zoijcleaow.dxjokdxxww(b31.gxszxtbevo.placeholder);
    }

    public static final void zoijcleaow(final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final String str, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1518122909);
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
                jyumaefscl.ntlheqmsrt(1518122909, i15, -1, "ru.myspar.proloyalty.core.ui.extensions.ImageWithPlaceholder (PlaceholderExt.kt:34)");
            }
            com.bumptech.glide.integration.compose.zoijcleaow.zoijcleaow(str, wkgbmnqykcVar, null, iobyxmoadg.f75599iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 3072 | ((i15 << 3) & 112), 4);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: p41.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lqeggnwhkg.ppxfxbqfkf(wkgbmnqykcVar, str, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
