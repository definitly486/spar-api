package x82;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ojitshcjhn {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, yu.wkgbmnqykc wkgbmnqykcVar2, tg.iobyxmoadg iobyxmoadgVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(wkgbmnqykcVar, wkgbmnqykcVar2, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final yu.wkgbmnqykc wkgbmnqykcVar2, final tg.iobyxmoadg onBtnBuyClick, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBtnBuyClick, "onBtnBuyClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(710377135);
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
            i15 |= (i13 & 64) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) : draadjrbmkVarBtonecajqb.lmojexxdyd(wkgbmnqykcVar2) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onBtnBuyClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(710377135, i15, -1, "ru.myspar.subscription.impl.detail.presentation.compose.SubscriptionDetailBottomBar (SubscriptionDetailBottomBar.kt:16)");
            }
            if (wkgbmnqykcVar2 == null) {
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3 = wkgbmnqykcVar;
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: x82.wflxmlrfwp
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return ojitshcjhn.wkgbmnqykc(wkgbmnqykcVar3, wkgbmnqykcVar2, onBtnBuyClick, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            int i17 = i15 >> 3;
            yu.ppxfxbqfkf.ppxfxbqfkf(wkgbmnqykcVar2, onBtnBuyClick, wkgbmnqykcVar, draadjrbmkVarBtonecajqb, yu.wkgbmnqykc.f126642lqeggnwhkg | (i17 & 14) | (i17 & 112) | ((i15 << 6) & 896), 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar;
        a0 a0VarWflxmlrfwp2 = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp2 != null) {
            a0VarWflxmlrfwp2.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: x82.agtfadlqog
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ojitshcjhn.eablkybsjg(wkgbmnqykcVar4, wkgbmnqykcVar2, onBtnBuyClick, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, yu.wkgbmnqykc wkgbmnqykcVar2, tg.iobyxmoadg iobyxmoadgVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(wkgbmnqykcVar, wkgbmnqykcVar2, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
