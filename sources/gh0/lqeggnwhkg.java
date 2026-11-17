package gh0;

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
public abstract class lqeggnwhkg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(yh0.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar, esjtqupxsv esjtqupxsvVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        ppxfxbqfkf(wkgbmnqykcVar, esjtqupxsvVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(final yh0.iobyxmoadg.wkgbmnqykc item, final esjtqupxsv sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1913435449);
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
                jyumaefscl.ntlheqmsrt(1913435449, i14, -1, "ru.myspar.myspar.impl.presentation.compose.discount.DiscountSection (DiscountSection.kt:10)");
            }
            if (item instanceof yh0.iobyxmoadg.wkgbmnqykc.zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-593543816);
                yh0.iobyxmoadg.wkgbmnqykc.zoijcleaow zoijcleaowVar = (yh0.iobyxmoadg.wkgbmnqykc.zoijcleaow) item;
                String strNufgyqmvbu = zoijcleaowVar.nufgyqmvbu();
                nb0.zoijcleaow zoijcleaowVarLqeggnwhkg = zoijcleaowVar.lqeggnwhkg();
                draadjrbmkVarBtonecajqb.sopmlzcsov(812141393);
                boolean z13 = ((i14 & 112) == 32) | ((i14 & 14) == 4);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: gh0.eablkybsjg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lqeggnwhkg.wkgbmnqykc(sectionsCallbacks, item);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                wkgbmnqykc.ppxfxbqfkf(strNufgyqmvbu, zoijcleaowVarLqeggnwhkg, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, nb0.zoijcleaow.f69536zoijcleaow << 3, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof yh0.iobyxmoadg.wkgbmnqykc.ppxfxbqfkf)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(812135653);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(812144978);
                dxjokdxxww.zoijcleaow(draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: gh0.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lqeggnwhkg.eablkybsjg(item, sectionsCallbacks, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(esjtqupxsv esjtqupxsvVar, yh0.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar) {
        esjtqupxsvVar.lqeggnwhkg().invoke(wkgbmnqykcVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
