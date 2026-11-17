package zs0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class pmvmpeiblj {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(List list, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, ss0.zoijcleaow zoijcleaowVar, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        ppxfxbqfkf(list, wkgbmnqykcVar, zoijcleaowVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(final List hints, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, ss0.zoijcleaow zoijcleaowVar, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        int i15;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hints, "hints");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-1981063735);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(hints) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVar) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i18 = i14 & 8;
        if (i18 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i15 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (i17 != 0) {
                zoijcleaowVar = ss0.zoijcleaow.LEFT;
            }
            if (i18 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-406880814);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.esjtqupxsv
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return pmvmpeiblj.wkgbmnqykc((HintUiModel) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar = (tg.draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1981063735, i15, -1, "ru.myspar.proloyalty.common.view.product.compose.common.ProductCardHint (ProductCardHint.kt:18)");
            }
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(hints, 10));
            Iterator it = hints.iterator();
            while (it.hasNext()) {
                arrayList.add(ru.myspar.proloyalty.common.view.hint.model.iobyxmoadg.zoijcleaow((HintUiModel) it.next(), HintUiModel.iobyxmoadg.SMALL));
            }
            ns0.eablkybsjg.eablkybsjg(arrayList, wkgbmnqykcVar, zoijcleaowVar, 0.0f, draadjrbmkVar, draadjrbmkVarBtonecajqb, (i15 & 1008) | ((i15 << 3) & 57344), 8);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        final ss0.zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        final tg.draadjrbmk draadjrbmkVar3 = draadjrbmkVar;
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zs0.lereixgezr
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return pmvmpeiblj.eablkybsjg(hints, wkgbmnqykcVar2, zoijcleaowVar2, draadjrbmkVar3, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wkgbmnqykc(HintUiModel it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
