package wg1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zdlpuopuiu {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final tg.iobyxmoadg onBackClick, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackClick, "onBackClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1326476148);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(onBackClick) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1326476148, i14, -1, "ru.myspar.proloyalty.payment.impl.methods.presentation.compose.PaymentMethodsTopBar (PaymentMethodsTopBar.kt:13)");
            }
            e31.eablkybsjg.nufgyqmvbu(null, e0.gxszxtbevo.ppxfxbqfkf(sg1.lqeggnwhkg.proloyalty_title_payment_method, draadjrbmkVarBtonecajqb, 0), v0.btonecajqb.nufgyqmvbu(v0.btonecajqb.f114934zoijcleaow.gxszxtbevo()), true, onBackClick, null, false, null, draadjrbmkVarBtonecajqb, ((i14 << 12) & 57344) | 3072, 225);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: wg1.kcexrzcfyt
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zdlpuopuiu.ppxfxbqfkf(onBackClick, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
