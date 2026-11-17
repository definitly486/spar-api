package hf1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.n;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rgvfuqvkyq {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1761432246);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i15 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1761432246, i15, -1, "ru.myspar.proloyalty.notification.impl.presentation.compose.NotificationNonAuthContent (NotificationNonAuthContent.kt:13)");
            }
            String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(ff1.ppxfxbqfkf.proloyalty_title_notification_unauthorized_warning, draadjrbmkVarBtonecajqb, 0);
            z zVar = z.f44180iobyxmoadg;
            int i17 = z.f44181zoijcleaow;
            n nVarZoijcleaow = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i17).zoijcleaow();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(strPpxfxbqfkf, wkgbmnqykcVar3, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, nVarZoijcleaow, draadjrbmkVar2, (i15 << 3) & 112, 0, 65528);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: hf1.ojitshcjhn
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return rgvfuqvkyq.ppxfxbqfkf(wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
