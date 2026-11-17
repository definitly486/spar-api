package ch0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import yh0.esjtqupxsv;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(yh0.iobyxmoadg.AbstractC3181iobyxmoadg abstractC3181iobyxmoadg, esjtqupxsv esjtqupxsvVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(abstractC3181iobyxmoadg, esjtqupxsvVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final yh0.iobyxmoadg.AbstractC3181iobyxmoadg item, final esjtqupxsv sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1281563705);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(item) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(sectionsCallbacks) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1281563705, i14, -1, "ru.myspar.myspar.impl.presentation.compose.auth.AuthSection (AuthSection.kt:10)");
            }
            if (zdlpuopuiu.eablkybsjg(item, yh0.iobyxmoadg.AbstractC3181iobyxmoadg.zoijcleaow.f125125cqumvgiudr)) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-258512066);
                wkgbmnqykc.wkgbmnqykc(sectionsCallbacks.ojitshcjhn(), sectionsCallbacks.btonecajqb(), draadjrbmkVarBtonecajqb, 0, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!zdlpuopuiu.eablkybsjg(item, yh0.iobyxmoadg.AbstractC3181iobyxmoadg.ppxfxbqfkf.f125123cqumvgiudr)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-258513625);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-258506098);
                nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ch0.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gxszxtbevo.ppxfxbqfkf(item, sectionsCallbacks, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
