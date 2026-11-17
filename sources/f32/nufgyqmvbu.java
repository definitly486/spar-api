package f32;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.foundation.layout.wflxmlrfwp;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.m1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import e32.dxjokdxxww;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import igdgnonuha.z;
import java.util.List;
import jztzpxfvev.nuxfzjnpeb;
import pj.cllcsxoeiz;
import sflfametgt.ikoacuggdj;
import sflfametgt.metgxyhuhe;
import t.tzroggbefp;
import t.ylkuphrtab;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import v40.cqumvgiudr;
import vipkmwdibw.czzsidtyhn;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final List f32763iobyxmoadg = jyumaefscl.rgvfuqvkyq(new i32.iobyxmoadg(s12.wkgbmnqykc.scango_onboarding_first_title, s12.wkgbmnqykc.scango_onboarding_first_description, s12.iobyxmoadg.scango_onboarding_first_picture), new i32.iobyxmoadg(s12.wkgbmnqykc.scango_onboarding_second_title, s12.wkgbmnqykc.scango_onboarding_second_description, s12.iobyxmoadg.scango_onboarding_second_picture), new i32.iobyxmoadg(s12.wkgbmnqykc.scango_onboarding_third_title, s12.wkgbmnqykc.scango_onboarding_third_description, s12.iobyxmoadg.scango_onboarding_third_picture), new i32.iobyxmoadg(s12.wkgbmnqykc.scango_onboarding_four_title, s12.wkgbmnqykc.scango_onboarding_four_description, s12.iobyxmoadg.scango_onboarding_four_picture));

    static final class iobyxmoadg implements PointerInputEventHandler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f32764iobyxmoadg;

        iobyxmoadg(draadjrbmk draadjrbmkVar) {
            this.f32764iobyxmoadg = draadjrbmkVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn zoijcleaow(ylkuphrtab ylkuphrtabVar, draadjrbmk draadjrbmkVar, g.eablkybsjg eablkybsjgVar) {
            if (Float.intBitsToFloat((int) (eablkybsjgVar.zdlpuopuiu() >> 32)) < ((int) (ylkuphrtabVar.iobyxmoadg() >> 32)) / 2) {
                draadjrbmkVar.invoke(e32.nufgyqmvbu.zoijcleaow.f30408iobyxmoadg);
            } else {
                draadjrbmkVar.invoke(e32.nufgyqmvbu.iobyxmoadg.f30407iobyxmoadg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(final ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
            final draadjrbmk draadjrbmkVar = this.f32764iobyxmoadg;
            Object objGtknphoqwx = nuxfzjnpeb.gtknphoqwx(ylkuphrtabVar, null, null, null, new draadjrbmk() { // from class: f32.lqeggnwhkg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return nufgyqmvbu.iobyxmoadg.zoijcleaow(ylkuphrtabVar, draadjrbmkVar, (g.eablkybsjg) obj);
                }
            }, gxszxtbevoVar, 7, null);
            return objGtknphoqwx == mg.zoijcleaow.gxszxtbevo() ? objGtknphoqwx : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ dxjokdxxww f32765jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ikoacuggdj f32766yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f32767zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ikoacuggdj ikoacuggdjVar, dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f32766yggfygwlhe = ikoacuggdjVar;
            this.f32765jyumaefscl = dxjokdxxwwVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f32766yggfygwlhe, this.f32765jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f32767zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ikoacuggdj ikoacuggdjVar = this.f32766yggfygwlhe;
                int iIobyxmoadg = this.f32765jyumaefscl.iobyxmoadg();
                czzsidtyhn czzsidtyhnVarBtonecajqb = vipkmwdibw.draadjrbmk.btonecajqb(0.0f, 200.0f, null, 5, null);
                this.f32767zdlpuopuiu = 1;
                if (ikoacuggdj.ojitshcjhn(ikoacuggdjVar, iIobyxmoadg, 0.0f, czzsidtyhnVarBtonecajqb, this, 2, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(e32.nufgyqmvbu.iobyxmoadg.f30407iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(e32.nufgyqmvbu.zoijcleaow.f30408iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void eablkybsjg(final dxjokdxxww model, final draadjrbmk onEvent, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onEvent, "onEvent");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-744727336);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onEvent) ? 32 : 16;
        }
        int i15 = i14;
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-744727336, i15, -1, "ru.myspar.scango.impl.screens.onboarding.presentation.compose.ScanGoOnboardingScreen (ScanGoOnboardingScreen.kt:67)");
            }
            i1 i1VarRgvfuqvkyq = v40.eablkybsjg.rgvfuqvkyq(draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(243849590);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: f32.ppxfxbqfkf
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Integer.valueOf(nufgyqmvbu.nufgyqmvbu());
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ikoacuggdj ikoacuggdjVarAgtfadlqog = metgxyhuhe.agtfadlqog(0, 0.0f, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 384, 3);
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = esjtqupxsv.oxmwwwfdhm(esjtqupxsv.oxmwwwfdhm(androidx.compose.foundation.zoijcleaow.wkgbmnqykc(cdpycssgdh.gxszxtbevo(iobyxmoadgVar2, 0.0f, 1, null), y50.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zdlpuopuiu(), null, 2, null), 0.0f, gxszxtbevo(i1VarRgvfuqvkyq).zoijcleaow(), 0.0f, 0.0f, 13, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(8), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(32), 5, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar3 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar3.ojitshcjhn(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar4 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar4.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar4.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar4.wkgbmnqykc());
            wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f4892iobyxmoadg;
            float f13 = 16;
            h32.wkgbmnqykc.zoijcleaow(ikoacuggdjVarAgtfadlqog.pkzmftpjix(), ikoacuggdjVarAgtfadlqog.cqumvgiudr(), wflxmlrfwpVar.wkgbmnqykc(esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(cdpycssgdh.esjtqupxsv(iobyxmoadgVar2, null, false, 3, null), 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null), iobyxmoadgVar3.wflxmlrfwp()), draadjrbmkVarBtonecajqb, 0, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm2 = esjtqupxsv.oxmwwwfdhm(cdpycssgdh.gxszxtbevo(iobyxmoadgVar2, 0.0f, 1, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(27), 0.0f, 0.0f, 13, null);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(1137238605);
            int i16 = i15 & 112;
            boolean z13 = i16 == 32;
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = new iobyxmoadg(onEvent);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = tzroggbefp.ppxfxbqfkf(wkgbmnqykcVarOxmwwwfdhm2, wwaezpbzknVar, (PointerInputEventHandler) objYadqdtsiqt2);
            List list = f32763iobyxmoadg;
            sflfametgt.zynmafqrjb.lqeggnwhkg(ikoacuggdjVarAgtfadlqog, wkgbmnqykcVarPpxfxbqfkf, null, null, list.size(), 0.0f, iobyxmoadgVar3.draadjrbmk(), null, false, false, null, null, null, null, f32.iobyxmoadg.f32756iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, 102236160, 24576, 16044);
            int i17 = model.iobyxmoadg() == jyumaefscl.ojitshcjhn(list) ? s12.wkgbmnqykc.scango_onboarding_final_next_button_text : s12.wkgbmnqykc.action_next;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar2, iobyxmoadgVar3.zoijcleaow()), 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null);
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(s12.wkgbmnqykc.scango_onboarding_back, draadjrbmkVar2, 0);
            String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(i17, draadjrbmkVar2, 0);
            draadjrbmkVar2.sopmlzcsov(1137284477);
            boolean z14 = i16 == 32;
            Object objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
            if (z14 || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: f32.wkgbmnqykc
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return nufgyqmvbu.dxjokdxxww(onEvent);
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
            }
            tg.iobyxmoadg iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt3;
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.sopmlzcsov(1137286397);
            boolean z15 = i16 == 32;
            Object objYadqdtsiqt4 = draadjrbmkVar2.yadqdtsiqt();
            if (z15 || objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: f32.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return nufgyqmvbu.btonecajqb(onEvent);
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVar2.stevsuqkhv();
            g32.zoijcleaow.zoijcleaow(strPpxfxbqfkf, strPpxfxbqfkf2, iobyxmoadgVar5, (tg.iobyxmoadg) objYadqdtsiqt4, wkgbmnqykcVarRgvfuqvkyq, draadjrbmkVar2, 0, 0);
            draadjrbmkVar2.cqumvgiudr();
            Integer numValueOf = Integer.valueOf(model.iobyxmoadg());
            draadjrbmkVar2.sopmlzcsov(243925889);
            boolean zUlzqkzuiru = draadjrbmkVar2.ulzqkzuiru(ikoacuggdjVarAgtfadlqog) | ((i15 & 14) == 4);
            Object objYadqdtsiqt5 = draadjrbmkVar2.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt5 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt5 = new zoijcleaow(ikoacuggdjVarAgtfadlqog, model, null);
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt5);
            }
            draadjrbmkVar2.stevsuqkhv();
            jlmebxxoox.eablkybsjg(numValueOf, (rgvfuqvkyq) objYadqdtsiqt5, draadjrbmkVar2, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: f32.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return nufgyqmvbu.lqeggnwhkg(model, onEvent, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final cqumvgiudr gxszxtbevo(i1 i1Var) {
        return (cqumvgiudr) i1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(dxjokdxxww dxjokdxxwwVar, draadjrbmk draadjrbmkVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        eablkybsjg(dxjokdxxwwVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nufgyqmvbu() {
        return f32763iobyxmoadg.size();
    }
}
