package fh0;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d50.nufgyqmvbu;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.kcexrzcfyt;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    static final class iobyxmoadg implements kcexrzcfyt {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ oxmwwwfdhm f33837zdlpuopuiu;

        iobyxmoadg(oxmwwwfdhm oxmwwwfdhmVar) {
            this.f33837zdlpuopuiu = oxmwwwfdhmVar;
        }

        @Override // tg.kcexrzcfyt
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            iobyxmoadg((yfnezrywwk.eablkybsjg) obj, (nb0.eablkybsjg) obj2, ((Number) obj3).intValue(), (draadjrbmk) obj4, ((Number) obj5).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(yfnezrywwk.eablkybsjg EndlessLazyRow, nb0.eablkybsjg uiModel, int i13, draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            zdlpuopuiu.btonecajqb(EndlessLazyRow, "$this$EndlessLazyRow");
            zdlpuopuiu.btonecajqb(uiModel, "uiModel");
            if ((i14 & 48) == 0) {
                i15 = ((i14 & 64) == 0 ? draadjrbmkVar.ulzqkzuiru(uiModel) : draadjrbmkVar.lmojexxdyd(uiModel) ? 32 : 16) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 384) == 0) {
                i15 |= draadjrbmkVar.ppxfxbqfkf(i13) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i15 & 1169) == 1168 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1838481203, i15, -1, "ru.myspar.myspar.impl.presentation.compose.common.BannerList.<anonymous> (BannerList.kt:42)");
            }
            int i16 = i15 >> 3;
            this.f33837zdlpuopuiu.invoke(uiModel, Integer.valueOf(i13), draadjrbmkVar, Integer.valueOf((i16 & 112) | nb0.eablkybsjg.f69495wypolnanlu | (i16 & 14)));
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, nb0.wkgbmnqykc wkgbmnqykcVar2, oxmwwwfdhm oxmwwwfdhmVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, wkgbmnqykcVar2, oxmwwwfdhmVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final nb0.wkgbmnqykc model, final oxmwwwfdhm item, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(item, "item");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(2128442590);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(model) : draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(item) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i17 = i15;
        if ((i17 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        } else {
            wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(2128442590, i17, -1, "ru.myspar.myspar.impl.presentation.compose.common.BannerList (BannerList.kt:24)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1327884778);
            boolean z13 = (i17 & 112) == 32 || ((i17 & 64) != 0 && draadjrbmkVarBtonecajqb.ulzqkzuiru(model));
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = Boolean.valueOf(model.wkgbmnqykc().size() > 3);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            boolean zBooleanValue = ((Boolean) objYadqdtsiqt).booleanValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            d50.iobyxmoadg iobyxmoadgVarAgtfadlqog = nufgyqmvbu.agtfadlqog(zBooleanValue, Integer.valueOf(model.wkgbmnqykc().size()), null, draadjrbmkVarBtonecajqb, 0, 4);
            nufgyqmvbu.lqeggnwhkg(iobyxmoadgVarAgtfadlqog, model.wkgbmnqykc(), wkgbmnqykcVar3, zBooleanValue, esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), false, czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(10)), null, xrmfcynszj.gxszxtbevo.wkgbmnqykc(iobyxmoadgVarAgtfadlqog.iobyxmoadg(), null, draadjrbmkVarBtonecajqb, 0, 2), false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1838481203, true, new iobyxmoadg(item), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 1597440 | d50.iobyxmoadg.f27083zoijcleaow | ((i17 << 6) & 896), 6, 672);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: fh0.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zoijcleaow.ppxfxbqfkf(wkgbmnqykcVar4, model, item, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
