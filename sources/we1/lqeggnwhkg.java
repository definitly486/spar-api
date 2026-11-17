package we1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import df1.cqumvgiudr;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import w0.dxjokdxxww;
import w31.nufgyqmvbu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {

    static final class iobyxmoadg implements oxmwwwfdhm {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ cqumvgiudr f119466zdlpuopuiu;

        iobyxmoadg(cqumvgiudr cqumvgiudrVar) {
            this.f119466zdlpuopuiu = cqumvgiudrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(cqumvgiudr cqumvgiudrVar, m91.gxszxtbevo gxszxtbevoVar, int i13) {
            cqumvgiudrVar.zoijcleaow().invoke(gxszxtbevoVar, Integer.valueOf(i13));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            zoijcleaow((m91.gxszxtbevo) obj, ((Number) obj2).intValue(), (draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(final m91.gxszxtbevo uiModel, final int i13, draadjrbmk draadjrbmkVar, int i14) {
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
                jyumaefscl.ntlheqmsrt(88738176, i15, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.under_options.UnderOptionsBannersSection.<anonymous> (UnderOptionsBannersSection.kt:27)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = nufgyqmvbu.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "ivSmallBanner", Integer.valueOf(i13), null, false, 12, null);
            draadjrbmkVar.sopmlzcsov(2061516793);
            boolean zUlzqkzuiru = ((i15 & 14) == 4 || ((i15 & 8) != 0 && draadjrbmkVar.lmojexxdyd(uiModel))) | draadjrbmkVar.ulzqkzuiru(this.f119466zdlpuopuiu) | ((i15 & 112) == 32);
            final cqumvgiudr cqumvgiudrVar = this.f119466zdlpuopuiu;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: we1.gxszxtbevo
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return lqeggnwhkg.iobyxmoadg.ppxfxbqfkf(cqumvgiudrVar, uiModel, i13);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            wkgbmnqykc.wkgbmnqykc(wkgbmnqykcVarOjitshcjhn, uiModel, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, (m91.gxszxtbevo.f66592wypolnanlu << 3) | ((i15 << 3) & 112), 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, df1.iobyxmoadg.draadjrbmk draadjrbmkVar, cqumvgiudr cqumvgiudrVar, int i13, int i14, draadjrbmk draadjrbmkVar2, int i15) {
        zoijcleaow(wkgbmnqykcVar, draadjrbmkVar, cqumvgiudrVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final df1.iobyxmoadg.draadjrbmk item, final cqumvgiudr sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-2091063779);
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
                jyumaefscl.ntlheqmsrt(-2091063779, i15, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.under_options.UnderOptionsBannersSection (UnderOptionsBannersSection.kt:19)");
            }
            if (item instanceof df1.iobyxmoadg.draadjrbmk.zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1526089585);
                ke1.wkgbmnqykc.zoijcleaow(nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar, "bannerUnderOptionsView", null, null, false, 14, null), ((df1.iobyxmoadg.draadjrbmk.zoijcleaow) item).lqeggnwhkg(), false, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(88738176, true, new iobyxmoadg(sectionsCallbacks), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, (m91.wkgbmnqykc.f66628wkgbmnqykc << 3) | 196992, 24);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof df1.iobyxmoadg.draadjrbmk.ppxfxbqfkf)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-741967333);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1525463912);
                ke1.lqeggnwhkg.ppxfxbqfkf(dxjokdxxww.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(104), w0.nufgyqmvbu.lqeggnwhkg(120)), wkgbmnqykcVar, false, draadjrbmkVarBtonecajqb, ((i15 << 3) & 112) | 390, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: we1.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lqeggnwhkg.ppxfxbqfkf(wkgbmnqykcVar2, item, sectionsCallbacks, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
