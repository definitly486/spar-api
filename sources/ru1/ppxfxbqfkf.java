package ru1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import cs0.btonecajqb;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoUiModel;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(AdditionalInfoUiModel additionalInfoUiModel, tg.iobyxmoadg iobyxmoadgVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(additionalInfoUiModel, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(final AdditionalInfoUiModel model, final tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        zdlpuopuiu.btonecajqb(model, "model");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(729178186);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(model) : draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1601615819);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ru1.iobyxmoadg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ppxfxbqfkf.wkgbmnqykc();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(729178186, i15, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.bottomsheet.SubscriptionSettingsAdditionalInfoBottomSheet (SubscriptionSettingsAdditionalInfoBottomSheet.kt:14)");
            }
            btonecajqb.ppxfxbqfkf(model, new ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow.C2215zoijcleaow(14.0f, 3), iobyxmoadgVar, draadjrbmkVarBtonecajqb, AdditionalInfoUiModel.f93836cqumvgiudr | (i15 & 14) | (ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow.C2215zoijcleaow.f93855ppxfxbqfkf << 3) | ((i15 << 3) & 896), 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ru1.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.eablkybsjg(model, iobyxmoadgVar, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
