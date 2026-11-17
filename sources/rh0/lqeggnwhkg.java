package rh0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import ezmngbhpjk.nufgyqmvbu;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import w0.dxjokdxxww;
import yh0.esjtqupxsv;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {

    static final class iobyxmoadg implements oxmwwwfdhm {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ esjtqupxsv f82639zdlpuopuiu;

        iobyxmoadg(esjtqupxsv esjtqupxsvVar) {
            this.f82639zdlpuopuiu = esjtqupxsvVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(esjtqupxsv esjtqupxsvVar, nb0.eablkybsjg eablkybsjgVar, int i13) {
            esjtqupxsvVar.iobyxmoadg().invoke(eablkybsjgVar, Integer.valueOf(i13));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            zoijcleaow((nb0.eablkybsjg) obj, ((Number) obj2).intValue(), (draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(final nb0.eablkybsjg uiModel, final int i13, draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            zdlpuopuiu.btonecajqb(uiModel, "uiModel");
            if ((i14 & 6) == 0) {
                i15 = i14 | ((i14 & 8) == 0 ? draadjrbmkVar.ulzqkzuiru(uiModel) : draadjrbmkVar.lmojexxdyd(uiModel) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= draadjrbmkVar.ppxfxbqfkf(i13) ? 32 : 16;
            }
            if ((i15 & 147) == 146 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1574898232, i15, -1, "ru.myspar.myspar.impl.presentation.compose.under_options.UnderOptionsBannersSection.<anonymous> (UnderOptionsBannersSection.kt:26)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj = l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "ivSmallBanner", Integer.valueOf(i13), null, false, 12, null);
            draadjrbmkVar.sopmlzcsov(2052352796);
            boolean zUlzqkzuiru = ((i15 & 14) == 4 || ((i15 & 8) != 0 && draadjrbmkVar.lmojexxdyd(uiModel))) | draadjrbmkVar.ulzqkzuiru(this.f82639zdlpuopuiu) | ((i15 & 112) == 32);
            final esjtqupxsv esjtqupxsvVar = this.f82639zdlpuopuiu;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: rh0.gxszxtbevo
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return lqeggnwhkg.iobyxmoadg.ppxfxbqfkf(esjtqupxsvVar, uiModel, i13);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            wkgbmnqykc.wkgbmnqykc(wkgbmnqykcVarPmvmpeiblj, uiModel, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, (nb0.eablkybsjg.f69495wypolnanlu << 3) | ((i15 << 3) & 112), 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(yh0.iobyxmoadg.draadjrbmk draadjrbmkVar, esjtqupxsv esjtqupxsvVar, int i13, draadjrbmk draadjrbmkVar2, int i14) {
        zoijcleaow(draadjrbmkVar, esjtqupxsvVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final yh0.iobyxmoadg.draadjrbmk item, final esjtqupxsv sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1026065125);
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
                jyumaefscl.ntlheqmsrt(1026065125, i14, -1, "ru.myspar.myspar.impl.presentation.compose.under_options.UnderOptionsBannersSection (UnderOptionsBannersSection.kt:18)");
            }
            if (item instanceof yh0.iobyxmoadg.draadjrbmk.zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-728820404);
                fh0.wkgbmnqykc.zoijcleaow(l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "bannerUnderOptionsView", null, null, false, 14, null), ((yh0.iobyxmoadg.draadjrbmk.zoijcleaow) item).lqeggnwhkg(), false, null, null, nufgyqmvbu.eablkybsjg(-1574898232, true, new iobyxmoadg(sectionsCallbacks), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, (nb0.wkgbmnqykc.f69531wkgbmnqykc << 3) | 196992, 24);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof yh0.iobyxmoadg.draadjrbmk.ppxfxbqfkf)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1777602973);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-728195754);
                fh0.lqeggnwhkg.ppxfxbqfkf(dxjokdxxww.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(104), w0.nufgyqmvbu.lqeggnwhkg(120)), null, false, draadjrbmkVarBtonecajqb, 390, 2);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: rh0.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lqeggnwhkg.ppxfxbqfkf(item, sectionsCallbacks, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
