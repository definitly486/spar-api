package me1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import df1.cqumvgiudr;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class btonecajqb {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, df1.iobyxmoadg.eablkybsjg eablkybsjgVar, cqumvgiudr cqumvgiudrVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, eablkybsjgVar, cqumvgiudrVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final df1.iobyxmoadg.eablkybsjg item, final cqumvgiudr sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1759300225);
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
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(item) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(sectionsCallbacks) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1759300225, i15, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.features.FeatureSection (FeatureSection.kt:15)");
            }
            if (item instanceof df1.iobyxmoadg.eablkybsjg.zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(544106957);
                nufgyqmvbu.ppxfxbqfkf(wkgbmnqykcVar, ((df1.iobyxmoadg.eablkybsjg.zoijcleaow) item).nufgyqmvbu(), sectionsCallbacks.dxjokdxxww(), draadjrbmkVarBtonecajqb, i15 & 14, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof df1.iobyxmoadg.eablkybsjg.ppxfxbqfkf)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(544105310);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-312360664);
                ke1.lqeggnwhkg.ppxfxbqfkf(w0.dxjokdxxww.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(98), w0.nufgyqmvbu.lqeggnwhkg(120)), wkgbmnqykcVar, false, draadjrbmkVarBtonecajqb, ((i15 << 3) & 112) | 390, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: me1.dxjokdxxww
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return btonecajqb.ppxfxbqfkf(wkgbmnqykcVar2, item, sectionsCallbacks, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
