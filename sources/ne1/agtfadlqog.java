package ne1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import df1.cqumvgiudr;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class agtfadlqog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, df1.iobyxmoadg.gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar, cqumvgiudr cqumvgiudrVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, ppxfxbqfkfVar, cqumvgiudrVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final df1.iobyxmoadg.gxszxtbevo.ppxfxbqfkf item, final cqumvgiudr sectionsCallbacks, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1598517992);
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
                jyumaefscl.ntlheqmsrt(-1598517992, i15, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.loyalty_program.LoyaltyProgramSection (LoyaltyProgramSection.kt:12)");
            }
            if (item instanceof df1.iobyxmoadg.gxszxtbevo.ppxfxbqfkf.zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1027928692);
                draadjrbmk.dxjokdxxww(((df1.iobyxmoadg.gxszxtbevo.ppxfxbqfkf.zoijcleaow) item).nufgyqmvbu(), sectionsCallbacks.gtknphoqwx(), wkgbmnqykcVar, draadjrbmkVarBtonecajqb, (i15 << 6) & 896, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof df1.iobyxmoadg.gxszxtbevo.ppxfxbqfkf.C0553ppxfxbqfkf)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(105385901);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(105397334);
                rgvfuqvkyq.zoijcleaow(wkgbmnqykcVar, draadjrbmkVarBtonecajqb, i15 & 14, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ne1.wflxmlrfwp
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return agtfadlqog.ppxfxbqfkf(wkgbmnqykcVar2, item, sectionsCallbacks, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
