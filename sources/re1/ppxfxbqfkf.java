package re1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.wkgbmnqykc;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import df1.cqumvgiudr;
import gg.wwaezpbzkn;
import h31.eablkybsjg;
import ke1.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import m91.gxszxtbevo;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import w0.dxjokdxxww;
import w0.gtknphoqwx;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    static final class iobyxmoadg implements oxmwwwfdhm {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ cqumvgiudr f82556jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ df1.iobyxmoadg.nufgyqmvbu f82557yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ long f82558zdlpuopuiu;

        iobyxmoadg(long j13, df1.iobyxmoadg.nufgyqmvbu nufgyqmvbuVar, cqumvgiudr cqumvgiudrVar) {
            this.f82558zdlpuopuiu = j13;
            this.f82557yggfygwlhe = nufgyqmvbuVar;
            this.f82556jyumaefscl = cqumvgiudrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(cqumvgiudr cqumvgiudrVar, gxszxtbevo gxszxtbevoVar) {
            cqumvgiudrVar.ojitshcjhn().invoke(gxszxtbevoVar);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            zoijcleaow((gxszxtbevo) obj, ((Number) obj2).intValue(), (draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(final gxszxtbevo uiModel, int i13, draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            zdlpuopuiu.btonecajqb(uiModel, "uiModel");
            if ((i14 & 6) == 0) {
                i15 = i14 | ((i14 & 8) == 0 ? draadjrbmkVar.ulzqkzuiru(uiModel) : draadjrbmkVar.lmojexxdyd(uiModel) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i15 & 131) == 130 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1628545350, i15, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.restaurants.RestaurantSection.<anonymous> (RestaurantSection.kt:29)");
            }
            String strDxjokdxxww = uiModel.dxjokdxxww();
            String strEablkybsjg = uiModel.eablkybsjg();
            long j13 = this.f82558zdlpuopuiu;
            boolean z13 = false;
            boolean z14 = ((df1.iobyxmoadg.nufgyqmvbu.zoijcleaow) this.f82557yggfygwlhe).lqeggnwhkg().ppxfxbqfkf().size() == 1;
            draadjrbmkVar.sopmlzcsov(-328717033);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f82556jyumaefscl);
            if ((i15 & 14) == 4 || ((i15 & 8) != 0 && draadjrbmkVar.lmojexxdyd(uiModel))) {
                z13 = true;
            }
            boolean z15 = zUlzqkzuiru | z13;
            final cqumvgiudr cqumvgiudrVar = this.f82556jyumaefscl;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (z15 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: re1.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(cqumvgiudrVar, uiModel);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            eablkybsjg.ppxfxbqfkf(strDxjokdxxww, strEablkybsjg, j13, z14, null, (tg.iobyxmoadg) objYadqdtsiqt, nufgyqmvbu.lqeggnwhkg(16), 0.0f, null, draadjrbmkVar, 1573248, OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar, df1.iobyxmoadg.nufgyqmvbu nufgyqmvbuVar, cqumvgiudr cqumvgiudrVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, nufgyqmvbuVar, cqumvgiudrVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(wkgbmnqykc wkgbmnqykcVar, final df1.iobyxmoadg.nufgyqmvbu item, final cqumvgiudr sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1742983587);
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
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(sectionsCallbacks) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = wkgbmnqykc.f7471iobyxmoadg;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1742983587, i15, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.restaurants.RestaurantSection (RestaurantSection.kt:22)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-530430052);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = gtknphoqwx.ppxfxbqfkf(dxjokdxxww.iobyxmoadg(nufgyqmvbu.lqeggnwhkg(UserVerificationMethods.USER_VERIFY_HANDPRINT), nufgyqmvbu.lqeggnwhkg(OrderServiceErrorHandlerImpl.SYSTEM_ERROR)));
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            long jGtknphoqwx = ((gtknphoqwx) objYadqdtsiqt).gtknphoqwx();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (item instanceof df1.iobyxmoadg.nufgyqmvbu.zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-530425508);
                ke1.wkgbmnqykc.zoijcleaow(wkgbmnqykcVar, ((df1.iobyxmoadg.nufgyqmvbu.zoijcleaow) item).lqeggnwhkg(), false, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1628545350, true, new iobyxmoadg(jGtknphoqwx, item, sectionsCallbacks), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, (i15 & 14) | 196608 | (m91.wkgbmnqykc.f66628wkgbmnqykc << 3), 28);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof df1.iobyxmoadg.nufgyqmvbu.ppxfxbqfkf)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-530427468);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-530407169);
                lqeggnwhkg.ppxfxbqfkf(jGtknphoqwx, wkgbmnqykcVar, false, draadjrbmkVarBtonecajqb, ((i15 << 3) & 112) | 6, 4);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        final wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: re1.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.ppxfxbqfkf(wkgbmnqykcVar2, item, sectionsCallbacks, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
