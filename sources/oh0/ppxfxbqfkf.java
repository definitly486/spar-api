package oh0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.wkgbmnqykc;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fh0.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;
import nb0.eablkybsjg;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import w0.dxjokdxxww;
import w0.gtknphoqwx;
import w0.nufgyqmvbu;
import yh0.esjtqupxsv;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    static final class iobyxmoadg implements oxmwwwfdhm {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ esjtqupxsv f72865jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f72866yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ yh0.iobyxmoadg.dxjokdxxww f72867zdlpuopuiu;

        iobyxmoadg(yh0.iobyxmoadg.dxjokdxxww dxjokdxxwwVar, long j13, esjtqupxsv esjtqupxsvVar) {
            this.f72867zdlpuopuiu = dxjokdxxwwVar;
            this.f72866yggfygwlhe = j13;
            this.f72865jyumaefscl = esjtqupxsvVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(esjtqupxsv esjtqupxsvVar, eablkybsjg eablkybsjgVar, int i13) {
            esjtqupxsvVar.iobyxmoadg().invoke(eablkybsjgVar, Integer.valueOf(i13));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            zoijcleaow((eablkybsjg) obj, ((Number) obj2).intValue(), (draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(final eablkybsjg uiModel, final int i13, draadjrbmk draadjrbmkVar, int i14) {
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
                jyumaefscl.ntlheqmsrt(-567207488, i15, -1, "ru.myspar.myspar.impl.presentation.compose.special_banner.SpecialBannersSection.<anonymous> (SpecialBannersSection.kt:34)");
            }
            wkgbmnqykc wkgbmnqykcVarPmvmpeiblj = l50.draadjrbmk.pmvmpeiblj(wkgbmnqykc.f7471iobyxmoadg, "bannerSpecial", null, null, false, 14, null);
            String strNufgyqmvbu = uiModel.nufgyqmvbu();
            if (strNufgyqmvbu == null) {
                strNufgyqmvbu = "";
            }
            String strIobyxmoadg = uiModel.iobyxmoadg();
            boolean z13 = ((yh0.iobyxmoadg.dxjokdxxww.zoijcleaow) this.f72867zdlpuopuiu).lqeggnwhkg().wkgbmnqykc().size() == 1;
            float fLqeggnwhkg = nufgyqmvbu.lqeggnwhkg(16);
            long j13 = this.f72866yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(-1485731172);
            boolean zUlzqkzuiru = ((i15 & 14) == 4 || ((i15 & 8) != 0 && draadjrbmkVar.lmojexxdyd(uiModel))) | draadjrbmkVar.ulzqkzuiru(this.f72865jyumaefscl) | ((i15 & 112) == 32);
            final esjtqupxsv esjtqupxsvVar = this.f72865jyumaefscl;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: oh0.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(esjtqupxsvVar, uiModel, i13);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            z40.eablkybsjg.ppxfxbqfkf(wkgbmnqykcVarPmvmpeiblj, strNufgyqmvbu, strIobyxmoadg, j13, z13, (tg.iobyxmoadg) objYadqdtsiqt, fLqeggnwhkg, null, draadjrbmkVar, 1575936, UserVerificationMethods.USER_VERIFY_PATTERN);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(yh0.iobyxmoadg.dxjokdxxww dxjokdxxwwVar, esjtqupxsv esjtqupxsvVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(dxjokdxxwwVar, esjtqupxsvVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final yh0.iobyxmoadg.dxjokdxxww item, final esjtqupxsv sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1265315229);
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
                jyumaefscl.ntlheqmsrt(1265315229, i14, -1, "ru.myspar.myspar.impl.presentation.compose.special_banner.SpecialBannersSection (SpecialBannersSection.kt:25)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(767118910);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = gtknphoqwx.ppxfxbqfkf(dxjokdxxww.iobyxmoadg(nufgyqmvbu.lqeggnwhkg(UserVerificationMethods.USER_VERIFY_HANDPRINT), nufgyqmvbu.lqeggnwhkg(OrderServiceErrorHandlerImpl.SYSTEM_ERROR)));
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            long jGtknphoqwx = ((gtknphoqwx) objYadqdtsiqt).gtknphoqwx();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (item instanceof yh0.iobyxmoadg.dxjokdxxww.zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1988971058);
                fh0.wkgbmnqykc.zoijcleaow(null, ((yh0.iobyxmoadg.dxjokdxxww.zoijcleaow) item).lqeggnwhkg(), false, "titleBannerSpecial", "rvBannersSpecial", ezmngbhpjk.nufgyqmvbu.eablkybsjg(-567207488, true, new iobyxmoadg(item, jGtknphoqwx, sectionsCallbacks), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, (nb0.wkgbmnqykc.f69531wkgbmnqykc << 3) | 224256, 5);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof yh0.iobyxmoadg.dxjokdxxww.ppxfxbqfkf)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(767121733);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(767150464);
                lqeggnwhkg.ppxfxbqfkf(jGtknphoqwx, null, false, draadjrbmkVarBtonecajqb, 6, 6);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: oh0.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.ppxfxbqfkf(item, sectionsCallbacks, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
