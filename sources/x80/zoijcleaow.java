package x80;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import ikoacuggdj.dsvhmnatus;
import tg.rgvfuqvkyq;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(String str, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(str, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final String str, final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        l.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-2093413791);
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
        int i17 = i15;
        if ((i17 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-2093413791, i17, -1, "ru.myspar.dynamic_qr.impl.presentation.compose.qrcode.image.QrCodeImage (QrCodeImage.kt:17)");
            }
            if (str == null) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-441824519);
                ppxfxbqfkfVarPpxfxbqfkf = e0.wkgbmnqykc.ppxfxbqfkf(q80.zoijcleaow.ic_empty_qr_code, draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-441744074);
                ppxfxbqfkfVarPpxfxbqfkf = (l.iobyxmoadg) wkgbmnqykc.zoijcleaow(str, nufgyqmvbu.lqeggnwhkg(224), 0.0f, false, draadjrbmkVarBtonecajqb, (i17 & 14) | 48, 12).getValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            dsvhmnatus.ppxfxbqfkf(ppxfxbqfkfVarPpxfxbqfkf, null, wkgbmnqykcVar, null, null, 0.0f, null, draadjrbmkVarBtonecajqb, ((i17 << 3) & 896) | 48, 120);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: x80.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zoijcleaow.ppxfxbqfkf(str, wkgbmnqykcVar, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
