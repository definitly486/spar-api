package sq;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.f;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import czzsidtyhn.vdvldrhtss;
import czzsidtyhn.wflxmlrfwp;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import igdgnonuha.w6;
import igdgnonuha.z;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import ru.myspar.core.domain.models.ColorsUiModel;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f107909iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f107910jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ v00.ppxfxbqfkf f107911yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f107912zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(v00.ppxfxbqfkf ppxfxbqfkfVar, tg.draadjrbmk draadjrbmkVar, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f107911yggfygwlhe = ppxfxbqfkfVar;
            this.f107910jyumaefscl = draadjrbmkVar;
            this.f107909iwizpuwonk = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f107911yggfygwlhe, this.f107910jyumaefscl, this.f107909iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f107912zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf.eablkybsjg(this.f107909iwizpuwonk, this.f107911yggfygwlhe);
                this.f107912zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(300L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            this.f107910jyumaefscl.invoke(new ru.myspar.catalog.impl.choosesort.presentation.zoijcleaow.iobyxmoadg(this.f107911yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(iwxlajgraz iwxlajgrazVar, v00.ppxfxbqfkf ppxfxbqfkfVar) {
        iwxlajgrazVar.setValue(ppxfxbqfkfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(cllcsxoeiz cllcsxoeizVar, v00.ppxfxbqfkf ppxfxbqfkfVar, tg.draadjrbmk draadjrbmkVar, iwxlajgraz iwxlajgrazVar) {
        gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new iobyxmoadg(ppxfxbqfkfVar, draadjrbmkVar, iwxlajgrazVar, null), 3, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(rq.lqeggnwhkg lqeggnwhkgVar, tg.draadjrbmk draadjrbmkVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        ppxfxbqfkf(lqeggnwhkgVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(final rq.lqeggnwhkg model, final tg.draadjrbmk dispatch, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        final iwxlajgraz iwxlajgrazVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatch, "dispatch");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1901932669);
        int i14 = (i13 & 6) == 0 ? (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(dispatch) ? 32 : 16;
        }
        int i15 = i14;
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1901932669, i15, -1, "ru.myspar.catalog.impl.choosesort.presentation.compose.ChooseSortDialogContent (ChooseSortDialogContent.kt:29)");
            }
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            final cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1690919584);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = c1.ppxfxbqfkf(model.zoijcleaow(), null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            iwxlajgraz iwxlajgrazVar2 = (iwxlajgraz) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, iobyxmoadgVar2);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
            float f13 = 16;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null);
            z zVar = z.f44180iobyxmoadg;
            int i16 = z.f44181zoijcleaow;
            iwxlajgraz iwxlajgrazVar3 = iwxlajgrazVar2;
            w6.btonecajqb("Сортировать по", wkgbmnqykcVarRgvfuqvkyq, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i16).zoijcleaow().btonecajqb(), draadjrbmkVarBtonecajqb, 54, 0, 65528);
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVar2, 6);
            draadjrbmkVar2.sopmlzcsov(984450658);
            for (final v00.ppxfxbqfkf ppxfxbqfkfVar : model.ppxfxbqfkf()) {
                ColorsUiModel.Hex hexIobyxmoadg = model.iobyxmoadg();
                boolean z13 = wkgbmnqykc(iwxlajgrazVar3) == ppxfxbqfkfVar;
                draadjrbmkVar2.sopmlzcsov(-555904321);
                boolean zLmojexxdyd = ((i15 & 112) == 32) | draadjrbmkVar2.lmojexxdyd(cllcsxoeizVar) | draadjrbmkVar2.ulzqkzuiru(ppxfxbqfkfVar);
                Object objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    iwxlajgrazVar = iwxlajgrazVar3;
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: sq.iobyxmoadg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ppxfxbqfkf.gxszxtbevo(cllcsxoeizVar, ppxfxbqfkfVar, dispatch, iwxlajgrazVar);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                } else {
                    iwxlajgrazVar = iwxlajgrazVar3;
                }
                draadjrbmkVar2.stevsuqkhv();
                nufgyqmvbu.ppxfxbqfkf(ppxfxbqfkfVar, hexIobyxmoadg, z13, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVar2, 0);
                iwxlajgrazVar3 = iwxlajgrazVar;
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: sq.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.lqeggnwhkg(model, dispatch, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final v00.ppxfxbqfkf wkgbmnqykc(iwxlajgraz iwxlajgrazVar) {
        return (v00.ppxfxbqfkf) iwxlajgrazVar.getValue();
    }
}
