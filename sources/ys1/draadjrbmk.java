package ys1;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import gg.wwaezpbzkn;
import igdgnonuha.w6;
import igdgnonuha.z;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import vipkmwdibw.lmojexxdyd;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class draadjrbmk {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f126348yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f126349zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f126348yggfygwlhe = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f126348yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f126349zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f126349zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(100L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            draadjrbmk.wkgbmnqykc(this.f126348yggfygwlhe, true);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private static final float eablkybsjg(i1 i1Var) {
        return ((Number) i1Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, String str, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, str, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final boolean ppxfxbqfkf(iwxlajgraz iwxlajgrazVar) {
        return ((Boolean) iwxlajgrazVar.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(iwxlajgraz iwxlajgrazVar, boolean z13) {
        iwxlajgrazVar.setValue(Boolean.valueOf(z13));
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final String str, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(912935053);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2);
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 32 : 16;
        }
        int i17 = i15;
        if ((i17 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(912935053, i17, -1, "ru.myspar.proloyalty.splash.compose.SplashScreenLogoGreeting (SplashScreenLogoGreeting.kt:29)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(2113060080);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            i1 i1VarEablkybsjg = vipkmwdibw.eablkybsjg.eablkybsjg((!ppxfxbqfkf(iwxlajgrazVar) || str == null) ? 0.0f : 1.0f, vipkmwdibw.draadjrbmk.draadjrbmk(300, 0, lmojexxdyd.wkgbmnqykc(), 2, null), 0.0f, "animationSplashScreenLogoGreetingIsVisible", null, draadjrbmkVarBtonecajqb, 3072, 20);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(2113070209);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = new iobyxmoadg(iwxlajgrazVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(wwaezpbzknVar, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null);
            zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-187262556);
            if (str == null) {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            } else {
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = e.iobyxmoadg.iobyxmoadg(cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), eablkybsjg(i1VarEablkybsjg));
                int iIobyxmoadg = v0.btonecajqb.f114934zoijcleaow.iobyxmoadg();
                z zVar = z.f44180iobyxmoadg;
                int i18 = z.f44181zoijcleaow;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(str, wkgbmnqykcVarIobyxmoadg, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).yadqdtsiqt(), 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(iIobyxmoadg), 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 2, 0, null, zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i18).eablkybsjg(), draadjrbmkVar2, (i17 >> 3) & 14, 3120, 54776);
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ys1.gtknphoqwx
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return draadjrbmk.gxszxtbevo(wkgbmnqykcVar2, str, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
