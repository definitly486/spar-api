package bs0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import igdgnonuha.w6;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(String str, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(str, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final String deliveryPrice, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        zdlpuopuiu.btonecajqb(deliveryPrice, "deliveryPrice");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(895889248);
        if ((i13 & 6) == 0) {
            i14 = i13 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(deliveryPrice) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(895889248, i14, -1, "ru.myspar.proloyalty.common.view.addressbar.MySparAddressBarDeliveryPrice (MySparAddressBarDeliveryPrice.kt:17)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIwizpuwonk = cdpycssgdh.iwizpuwonk(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(60), 0.0f, 2, null);
            bfopjjpdmp.gxszxtbevo gxszxtbevoVarPpxfxbqfkf = bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(24));
            z zVar = z.f44180iobyxmoadg;
            int i15 = z.f44181zoijcleaow;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(deliveryPrice, w31.nufgyqmvbu.ojitshcjhn(esjtqupxsv.ojitshcjhn(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(wkgbmnqykcVarIwizpuwonk, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).zoijcleaow(), gxszxtbevoVarPpxfxbqfkf), w0.nufgyqmvbu.lqeggnwhkg(8), w0.nufgyqmvbu.lqeggnwhkg(2)), "mySparAddressBarDeliveryPrice", null, null, false, 14, null), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).pmvmpeiblj(), 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(v0.btonecajqb.f114934zoijcleaow.iobyxmoadg()), 0L, 0, false, 0, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i15).zoijcleaow().draadjrbmk(), draadjrbmkVar2, i14 & 14, 0, 65016);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: bs0.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zoijcleaow.ppxfxbqfkf(deliveryPrice, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
