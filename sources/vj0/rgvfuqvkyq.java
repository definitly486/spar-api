package vj0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rgvfuqvkyq {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(boolean z13, tg.iobyxmoadg iobyxmoadgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(z13, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final boolean z13, final tg.iobyxmoadg onClick, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClick, "onClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(2021028467);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClick) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(2021028467, i14, -1, "ru.myspar.payment.impl.methods.presentation.compose.PaymentMethodsPayButton (PaymentMethodsPayButton.kt:19)");
            }
            float f13 = 8;
            a50.wkgbmnqykc.wkgbmnqykc(e0.gxszxtbevo.ppxfxbqfkf(pm.dxjokdxxww.action_continue, draadjrbmkVarBtonecajqb, 0), onClick, esjtqupxsv.oxmwwwfdhm(esjtqupxsv.rgvfuqvkyq(esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "CONFIRM_BUTTON", null, null, false, 14, null), 0.0f, 1, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f13), 1, null), w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f13), 7, null), a50.nufgyqmvbu.LARGE, false, null, null, z13, draadjrbmkVarBtonecajqb, (i14 & 112) | 3072 | ((i14 << 21) & 29360128), 112);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: vj0.ojitshcjhn
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return rgvfuqvkyq.ppxfxbqfkf(z13, onClick, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
