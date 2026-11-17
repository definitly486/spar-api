package mh0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fh0.lqeggnwhkg;
import fh0.wkgbmnqykc;
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
        final /* synthetic */ esjtqupxsv f67191jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f67192yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ yh0.iobyxmoadg.nufgyqmvbu f67193zdlpuopuiu;

        iobyxmoadg(yh0.iobyxmoadg.nufgyqmvbu nufgyqmvbuVar, long j13, esjtqupxsv esjtqupxsvVar) {
            this.f67193zdlpuopuiu = nufgyqmvbuVar;
            this.f67192yggfygwlhe = j13;
            this.f67191jyumaefscl = esjtqupxsvVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(esjtqupxsv esjtqupxsvVar, eablkybsjg eablkybsjgVar) {
            esjtqupxsvVar.rgvfuqvkyq().invoke(eablkybsjgVar);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            zoijcleaow((eablkybsjg) obj, ((Number) obj2).intValue(), (draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(final eablkybsjg uiModel, int i13, draadjrbmk draadjrbmkVar, int i14) {
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
                jyumaefscl.ntlheqmsrt(1897151344, i15, -1, "ru.myspar.myspar.impl.presentation.compose.restaurants.RestaurantSection.<anonymous> (RestaurantSection.kt:27)");
            }
            String strNufgyqmvbu = uiModel.nufgyqmvbu();
            if (strNufgyqmvbu == null) {
                strNufgyqmvbu = "";
            }
            String strIobyxmoadg = uiModel.iobyxmoadg();
            boolean z13 = false;
            boolean z14 = ((yh0.iobyxmoadg.nufgyqmvbu.zoijcleaow) this.f67193zdlpuopuiu).lqeggnwhkg().wkgbmnqykc().size() == 1;
            float fLqeggnwhkg = nufgyqmvbu.lqeggnwhkg(16);
            long j13 = this.f67192yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(468673012);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f67191jyumaefscl);
            if ((i15 & 14) == 4 || ((i15 & 8) != 0 && draadjrbmkVar.lmojexxdyd(uiModel))) {
                z13 = true;
            }
            boolean z15 = zUlzqkzuiru | z13;
            final esjtqupxsv esjtqupxsvVar = this.f67191jyumaefscl;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (z15 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: mh0.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(esjtqupxsvVar, uiModel);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            z40.eablkybsjg.ppxfxbqfkf(null, strNufgyqmvbu, strIobyxmoadg, j13, z14, (tg.iobyxmoadg) objYadqdtsiqt, fLqeggnwhkg, null, draadjrbmkVar, 1575936, 129);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(yh0.iobyxmoadg.nufgyqmvbu nufgyqmvbuVar, esjtqupxsv esjtqupxsvVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(nufgyqmvbuVar, esjtqupxsvVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final yh0.iobyxmoadg.nufgyqmvbu item, final esjtqupxsv sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1988461491);
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
                jyumaefscl.ntlheqmsrt(-1988461491, i14, -1, "ru.myspar.myspar.impl.presentation.compose.restaurants.RestaurantSection (RestaurantSection.kt:20)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1591136761);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = gtknphoqwx.ppxfxbqfkf(dxjokdxxww.iobyxmoadg(nufgyqmvbu.lqeggnwhkg(UserVerificationMethods.USER_VERIFY_HANDPRINT), nufgyqmvbu.lqeggnwhkg(OrderServiceErrorHandlerImpl.SYSTEM_ERROR)));
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            long jGtknphoqwx = ((gtknphoqwx) objYadqdtsiqt).gtknphoqwx();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (item instanceof yh0.iobyxmoadg.nufgyqmvbu.zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(2080741720);
                wkgbmnqykc.zoijcleaow(null, ((yh0.iobyxmoadg.nufgyqmvbu.zoijcleaow) item).lqeggnwhkg(), false, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1897151344, true, new iobyxmoadg(item, jGtknphoqwx, sectionsCallbacks), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, (nb0.wkgbmnqykc.f69531wkgbmnqykc << 3) | 196608, 29);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof yh0.iobyxmoadg.nufgyqmvbu.ppxfxbqfkf)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1591139361);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1591161179);
                lqeggnwhkg.ppxfxbqfkf(jGtknphoqwx, null, false, draadjrbmkVarBtonecajqb, 6, 6);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: mh0.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.ppxfxbqfkf(item, sectionsCallbacks, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
