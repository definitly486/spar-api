package h71;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.wkgbmnqykc;
import gg.wwaezpbzkn;
import ikoacuggdj.dsvhmnatus;
import l.ppxfxbqfkf;
import tg.rgvfuqvkyq;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(String str, wkgbmnqykc wkgbmnqykcVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(str, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final String str, final wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1949991050);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 4 : 2) | i13;
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
                wkgbmnqykcVar = wkgbmnqykc.f7471iobyxmoadg;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1949991050, i15, -1, "ru.myspar.proloyalty.dynamic_qr.impl.presentation.compose.qrcode.image.QrCodeImage (QrCodeImage.kt:19)");
            }
            float f13 = 224;
            wkgbmnqykc wkgbmnqykcVarVdvldrhtss = cdpycssgdh.vdvldrhtss(wkgbmnqykcVar, nufgyqmvbu.lqeggnwhkg(f13));
            if (str == null) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1731764668);
                ppxfxbqfkfVarPpxfxbqfkf = e0.wkgbmnqykc.ppxfxbqfkf(z61.zoijcleaow.ic_empty_qr_code, draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1731845113);
                ppxfxbqfkfVarPpxfxbqfkf = (l.iobyxmoadg) p31.zoijcleaow.zoijcleaow(str, nufgyqmvbu.lqeggnwhkg(f13), 0.0f, false, draadjrbmkVarBtonecajqb, (i15 & 14) | 48, 12).getValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            dsvhmnatus.ppxfxbqfkf(ppxfxbqfkfVarPpxfxbqfkf, null, wkgbmnqykcVarVdvldrhtss, null, null, 0.0f, null, draadjrbmkVarBtonecajqb, 48, 120);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: h71.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zoijcleaow.ppxfxbqfkf(str, wkgbmnqykcVar, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
