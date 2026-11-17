package vf0;

import android.content.Context;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.foundation.layout.wflxmlrfwp;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.ntlheqmsrt;
import androidx.compose.runtime.uawqvzlxes;
import androidx.compose.runtime.ulzqkzuiru;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.zeieaojujs;
import androidx.lifecycle.jhduphickx;
import androidx.lifecycle.vipkmwdibw;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import tg.rgvfuqvkyq;
import wf0.agtfadlqog;
import wf0.iwizpuwonk;
import wf0.kcexrzcfyt;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {

    public static final class btonecajqb implements ntlheqmsrt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ WindowManager f116691iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ComposeView f116692zoijcleaow;

        public btonecajqb(WindowManager windowManager, ComposeView composeView) {
            this.f116691iobyxmoadg = windowManager;
            this.f116692zoijcleaow = composeView;
        }

        @Override // androidx.compose.runtime.ntlheqmsrt
        public void iobyxmoadg() {
            this.f116691iobyxmoadg.removeView(this.f116692zoijcleaow);
        }
    }

    static final class dxjokdxxww implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f116693yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ y50.nufgyqmvbu f116694zdlpuopuiu;

        static final class iobyxmoadg implements rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ rgvfuqvkyq f116695zdlpuopuiu;

            iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar) {
                this.f116695zdlpuopuiu = rgvfuqvkyqVar;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                iobyxmoadg((draadjrbmk) obj, ((Number) obj2).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(draadjrbmk draadjrbmkVar, int i13) {
                if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(1583000754, i13, -1, "ru.myspar.main_activity.impl.compose.error_panel.SnackbarWindow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MySparSnackbarHost.kt:164)");
                }
                rgvfuqvkyq rgvfuqvkyqVar = this.f116695zdlpuopuiu;
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, iobyxmoadgVar);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVar.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVar.pkzmftpjix();
                if (draadjrbmkVar.lqeggnwhkg()) {
                    draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVar.yggfygwlhe();
                }
                draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
                wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f4892iobyxmoadg;
                rgvfuqvkyqVar.invoke(draadjrbmkVar, 0);
                draadjrbmkVar.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        dxjokdxxww(y50.nufgyqmvbu nufgyqmvbuVar, rgvfuqvkyq rgvfuqvkyqVar) {
            this.f116694zdlpuopuiu = nufgyqmvbuVar;
            this.f116693yggfygwlhe = rgvfuqvkyqVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(891926317, i13, -1, "ru.myspar.main_activity.impl.compose.error_panel.SnackbarWindow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MySparSnackbarHost.kt:163)");
            }
            y50.zoijcleaow.zoijcleaow(this.f116694zdlpuopuiu, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1583000754, true, new iobyxmoadg(this.f116693yggfygwlhe), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class eablkybsjg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f116696jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ vf0.iobyxmoadg f116697yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ss.wkgbmnqykc f116698zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends vdvldrhtss implements tg.iobyxmoadg {
            iobyxmoadg(Object obj) {
                super(0, obj, vf0.iobyxmoadg.class, "hideTop", "hideTop()V", 0);
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                ((vf0.iobyxmoadg) this.receiver).lqeggnwhkg();
            }
        }

        /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.iobyxmoadg implements tg.draadjrbmk {
            zoijcleaow(Object obj) {
                super(1, obj, vf0.iobyxmoadg.class, "onHold", "onHold(ZLkotlin/jvm/functions/Function1;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg(((Boolean) obj).booleanValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(boolean z13) {
                vf0.iobyxmoadg.dxjokdxxww((vf0.iobyxmoadg) this.f60022zdlpuopuiu, z13, null, 2, null);
            }
        }

        eablkybsjg(ss.wkgbmnqykc wkgbmnqykcVar, vf0.iobyxmoadg iobyxmoadgVar, iwxlajgraz iwxlajgrazVar) {
            this.f116698zdlpuopuiu = wkgbmnqykcVar;
            this.f116697yggfygwlhe = iobyxmoadgVar;
            this.f116696jyumaefscl = iwxlajgrazVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1862898823, i13, -1, "ru.myspar.main_activity.impl.compose.error_panel.MySparSnackbarHost.<anonymous> (MySparSnackbarHost.kt:90)");
            }
            ss.wkgbmnqykc.lqeggnwhkg lqeggnwhkgVar = (ss.wkgbmnqykc.lqeggnwhkg) this.f116698zdlpuopuiu;
            boolean zLqeggnwhkg = lqeggnwhkg.lqeggnwhkg(this.f116696jyumaefscl);
            vf0.iobyxmoadg iobyxmoadgVar = this.f116697yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(1770972866);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(iobyxmoadgVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            ah.lqeggnwhkg lqeggnwhkgVar2 = (ah.lqeggnwhkg) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
            vf0.iobyxmoadg iobyxmoadgVar2 = this.f116697yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(1770974593);
            boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar2);
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new zoijcleaow(iobyxmoadgVar2);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            kcexrzcfyt.wkgbmnqykc(lqeggnwhkgVar, zLqeggnwhkg, (tg.draadjrbmk) objYadqdtsiqt2, (tg.iobyxmoadg) lqeggnwhkgVar2, draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class gxszxtbevo implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f116699yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ vf0.iobyxmoadg f116700zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends vdvldrhtss implements tg.iobyxmoadg {
            iobyxmoadg(Object obj) {
                super(0, obj, vf0.iobyxmoadg.class, "hideTop", "hideTop()V", 0);
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                ((vf0.iobyxmoadg) this.receiver).lqeggnwhkg();
            }
        }

        /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.iobyxmoadg implements tg.draadjrbmk {
            zoijcleaow(Object obj) {
                super(1, obj, vf0.iobyxmoadg.class, "onHold", "onHold(ZLkotlin/jvm/functions/Function1;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg(((Boolean) obj).booleanValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(boolean z13) {
                vf0.iobyxmoadg.dxjokdxxww((vf0.iobyxmoadg) this.f60022zdlpuopuiu, z13, null, 2, null);
            }
        }

        gxszxtbevo(vf0.iobyxmoadg iobyxmoadgVar, iwxlajgraz iwxlajgrazVar) {
            this.f116700zdlpuopuiu = iobyxmoadgVar;
            this.f116699yggfygwlhe = iwxlajgrazVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1669967622, i13, -1, "ru.myspar.main_activity.impl.compose.error_panel.MySparSnackbarHost.<anonymous> (MySparSnackbarHost.kt:101)");
            }
            boolean zLqeggnwhkg = lqeggnwhkg.lqeggnwhkg(this.f116699yggfygwlhe);
            vf0.iobyxmoadg iobyxmoadgVar = this.f116700zdlpuopuiu;
            draadjrbmkVar.sopmlzcsov(1770984386);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(iobyxmoadgVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            ah.lqeggnwhkg lqeggnwhkgVar = (ah.lqeggnwhkg) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
            vf0.iobyxmoadg iobyxmoadgVar2 = this.f116700zdlpuopuiu;
            draadjrbmkVar.sopmlzcsov(1770986113);
            boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar2);
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new zoijcleaow(iobyxmoadgVar2);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            wf0.dxjokdxxww.gxszxtbevo(zLqeggnwhkg, (tg.draadjrbmk) objYadqdtsiqt2, (tg.iobyxmoadg) lqeggnwhkgVar, draadjrbmkVar, 0, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f116701jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ i1 f116702yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116703zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(i1 i1Var, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f116702yggfygwlhe = i1Var;
            this.f116701jyumaefscl = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f116702yggfygwlhe, this.f116701jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f116703zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (lqeggnwhkg.gxszxtbevo(this.f116702yggfygwlhe) == null) {
                    this.f116703zdlpuopuiu = 1;
                    if (crxdokpmqz.zoijcleaow(250L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            lqeggnwhkg.wflxmlrfwp(this.f116701jyumaefscl, lqeggnwhkg.gxszxtbevo(this.f116702yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: vf0.lqeggnwhkg$lqeggnwhkg, reason: collision with other inner class name */
    static final class C2912lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f116704jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ i1 f116705yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116706zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2912lqeggnwhkg(i1 i1Var, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f116705yggfygwlhe = i1Var;
            this.f116704jyumaefscl = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2912lqeggnwhkg(this.f116705yggfygwlhe, this.f116704jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f116706zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            lqeggnwhkg.btonecajqb(this.f116704jyumaefscl, lqeggnwhkg.agtfadlqog(this.f116705yggfygwlhe) != null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2912lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f116707jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ vf0.iobyxmoadg f116708yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ss.wkgbmnqykc f116709zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends vdvldrhtss implements tg.iobyxmoadg {
            iobyxmoadg(Object obj) {
                super(0, obj, vf0.iobyxmoadg.class, "hideBottom", "hideBottom()V", 0);
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                ((vf0.iobyxmoadg) this.receiver).gxszxtbevo();
            }
        }

        nufgyqmvbu(ss.wkgbmnqykc wkgbmnqykcVar, vf0.iobyxmoadg iobyxmoadgVar, iwxlajgraz iwxlajgrazVar) {
            this.f116709zdlpuopuiu = wkgbmnqykcVar;
            this.f116708yggfygwlhe = iobyxmoadgVar;
            this.f116707jyumaefscl = iwxlajgrazVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-2087863829, i13, -1, "ru.myspar.main_activity.impl.compose.error_panel.MySparSnackbarHost.<anonymous> (MySparSnackbarHost.kt:123)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = esjtqupxsv.oxmwwwfdhm(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 0.0f, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(8), 7, null);
            ss.wkgbmnqykc.dxjokdxxww dxjokdxxwwVar = (ss.wkgbmnqykc.dxjokdxxww) this.f116709zdlpuopuiu;
            boolean zDxjokdxxww = lqeggnwhkg.dxjokdxxww(this.f116707jyumaefscl);
            vf0.iobyxmoadg iobyxmoadgVar = this.f116708yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(1771008773);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(iobyxmoadgVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            iwizpuwonk.zoijcleaow(wkgbmnqykcVarOxmwwwfdhm, dxjokdxxwwVar, zDxjokdxxww, (tg.iobyxmoadg) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVar, 6, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f116710jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ i1 f116711yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116712zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(i1 i1Var, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f116711yggfygwlhe = i1Var;
            this.f116710jyumaefscl = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f116711yggfygwlhe, this.f116710jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f116712zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            lqeggnwhkg.nufgyqmvbu(this.f116710jyumaefscl, lqeggnwhkg.gxszxtbevo(this.f116711yggfygwlhe) != null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f116713iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Context f116714jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ vf0.iobyxmoadg f116715yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ss.wkgbmnqykc f116716zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends vdvldrhtss implements tg.iobyxmoadg {
            iobyxmoadg(Object obj) {
                super(0, obj, vf0.iobyxmoadg.class, "hideTop", "hideTop()V", 0);
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                ((vf0.iobyxmoadg) this.receiver).lqeggnwhkg();
            }
        }

        /* synthetic */ class zoijcleaow extends vdvldrhtss implements tg.draadjrbmk {
            zoijcleaow(Object obj) {
                super(1, obj, lqeggnwhkg.class, "copyCodeAndShowToast", "copyCodeAndShowToast(Landroid/content/Context;Ljava/lang/String;)V", 1);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((String) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(String p13) {
                zdlpuopuiu.btonecajqb(p13, "p0");
                lqeggnwhkg.yadqdtsiqt((Context) this.receiver, p13);
            }
        }

        wkgbmnqykc(ss.wkgbmnqykc wkgbmnqykcVar, vf0.iobyxmoadg iobyxmoadgVar, Context context, iwxlajgraz iwxlajgrazVar) {
            this.f116716zdlpuopuiu = wkgbmnqykcVar;
            this.f116715yggfygwlhe = iobyxmoadgVar;
            this.f116714jyumaefscl = context;
            this.f116713iwizpuwonk = iwxlajgrazVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(vf0.iobyxmoadg iobyxmoadgVar, Context context, boolean z13) {
            iobyxmoadgVar.nufgyqmvbu(z13, new zoijcleaow(context));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            zoijcleaow((draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1694928510, i13, -1, "ru.myspar.main_activity.impl.compose.error_panel.MySparSnackbarHost.<anonymous> (MySparSnackbarHost.kt:74)");
            }
            ss.wkgbmnqykc.eablkybsjg eablkybsjgVar = (ss.wkgbmnqykc.eablkybsjg) this.f116716zdlpuopuiu;
            boolean zLqeggnwhkg = lqeggnwhkg.lqeggnwhkg(this.f116713iwizpuwonk);
            vf0.iobyxmoadg iobyxmoadgVar = this.f116715yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(1770952514);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(iobyxmoadgVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            ah.lqeggnwhkg lqeggnwhkgVar = (ah.lqeggnwhkg) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.sopmlzcsov(1770954478);
            boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(this.f116715yggfygwlhe) | draadjrbmkVar.lmojexxdyd(this.f116714jyumaefscl);
            final vf0.iobyxmoadg iobyxmoadgVar2 = this.f116715yggfygwlhe;
            final Context context = this.f116714jyumaefscl;
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: vf0.nufgyqmvbu
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return lqeggnwhkg.wkgbmnqykc.ppxfxbqfkf(iobyxmoadgVar2, context, ((Boolean) obj).booleanValue());
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            agtfadlqog.wkgbmnqykc(eablkybsjgVar, zLqeggnwhkg, (tg.draadjrbmk) objYadqdtsiqt2, (tg.iobyxmoadg) lqeggnwhkgVar, draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f116717jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ i1 f116718yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116719zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(i1 i1Var, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f116718yggfygwlhe = i1Var;
            this.f116717jyumaefscl = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f116718yggfygwlhe, this.f116717jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f116719zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (lqeggnwhkg.agtfadlqog(this.f116718yggfygwlhe) == null) {
                    this.f116719zdlpuopuiu = 1;
                    if (crxdokpmqz.zoijcleaow(250L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            lqeggnwhkg.rgvfuqvkyq(this.f116717jyumaefscl, lqeggnwhkg.agtfadlqog(this.f116718yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ss.wkgbmnqykc agtfadlqog(i1 i1Var) {
        return (ss.wkgbmnqykc) i1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(iwxlajgraz iwxlajgrazVar, boolean z13) {
        iwxlajgrazVar.setValue(Boolean.valueOf(z13));
    }

    private static final ss.wkgbmnqykc draadjrbmk(iwxlajgraz iwxlajgrazVar) {
        return (ss.wkgbmnqykc) iwxlajgrazVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dxjokdxxww(iwxlajgraz iwxlajgrazVar) {
        return ((Boolean) iwxlajgrazVar.getValue()).booleanValue();
    }

    public static final void eablkybsjg(final vf0.iobyxmoadg controller, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(controller, "controller");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-390129928);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(controller) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-390129928, i14, -1, "ru.myspar.main_activity.impl.compose.error_panel.MySparSnackbarHost (MySparSnackbarHost.kt:45)");
            }
            Context context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            i1 i1VarZoijcleaow = v0.zoijcleaow(controller.eablkybsjg(), null, draadjrbmkVarBtonecajqb, 0, 1);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1958761591);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            draadjrbmk.iobyxmoadg iobyxmoadgVar = draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(gxszxtbevo(i1VarZoijcleaow), null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            i1 i1VarZoijcleaow2 = v0.zoijcleaow(controller.wkgbmnqykc(), null, draadjrbmkVarBtonecajqb, 0, 1);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1958766842);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = c1.ppxfxbqfkf(agtfadlqog(i1VarZoijcleaow2), null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            iwxlajgraz iwxlajgrazVar2 = (iwxlajgraz) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ss.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = gxszxtbevo(i1VarZoijcleaow);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1958769287);
            boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarZoijcleaow);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new iobyxmoadg(i1VarZoijcleaow, iwxlajgrazVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(wkgbmnqykcVarGxszxtbevo, (rgvfuqvkyq) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 0);
            ss.wkgbmnqykc wkgbmnqykcVarAgtfadlqog = agtfadlqog(i1VarZoijcleaow2);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1958773232);
            boolean zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarZoijcleaow2);
            Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt4 = new zoijcleaow(i1VarZoijcleaow2, iwxlajgrazVar2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(wkgbmnqykcVarAgtfadlqog, (rgvfuqvkyq) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1958778066);
            if (draadjrbmk(iwxlajgrazVar) != null) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1958778226);
                Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt5 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt5 = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                iwxlajgraz iwxlajgrazVar3 = (iwxlajgraz) objYadqdtsiqt5;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                ss.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = gxszxtbevo(i1VarZoijcleaow);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1958780518);
                boolean zUlzqkzuiru3 = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarZoijcleaow);
                Object objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru3 || objYadqdtsiqt6 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt6 = new ppxfxbqfkf(i1VarZoijcleaow, iwxlajgrazVar3, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(wkgbmnqykcVarGxszxtbevo2, (rgvfuqvkyq) objYadqdtsiqt6, draadjrbmkVarBtonecajqb, 0);
                ss.wkgbmnqykc wkgbmnqykcVarDraadjrbmk = draadjrbmk(iwxlajgrazVar);
                if (wkgbmnqykcVarDraadjrbmk instanceof ss.wkgbmnqykc.eablkybsjg) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(592812574);
                    vdvldrhtss(48, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1694928510, true, new wkgbmnqykc(wkgbmnqykcVarDraadjrbmk, controller, context, iwxlajgrazVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 54);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else if (wkgbmnqykcVarDraadjrbmk instanceof ss.wkgbmnqykc.lqeggnwhkg) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(593437100);
                    vdvldrhtss(48, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1862898823, true, new eablkybsjg(wkgbmnqykcVarDraadjrbmk, controller, iwxlajgrazVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 54);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else if (wkgbmnqykcVarDraadjrbmk instanceof ss.wkgbmnqykc.ppxfxbqfkf) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(593837465);
                    vdvldrhtss(48, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1669967622, true, new gxszxtbevo(controller, iwxlajgrazVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 54);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1958829076);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (ojitshcjhn(iwxlajgrazVar2) != null) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1958831858);
                Object objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt7 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt7 = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                }
                iwxlajgraz iwxlajgrazVar4 = (iwxlajgraz) objYadqdtsiqt7;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                ss.wkgbmnqykc wkgbmnqykcVarAgtfadlqog2 = agtfadlqog(i1VarZoijcleaow2);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1958834249);
                boolean zUlzqkzuiru4 = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarZoijcleaow2);
                Object objYadqdtsiqt8 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru4 || objYadqdtsiqt8 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt8 = new C2912lqeggnwhkg(i1VarZoijcleaow2, iwxlajgrazVar4, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt8);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(wkgbmnqykcVarAgtfadlqog2, (rgvfuqvkyq) objYadqdtsiqt8, draadjrbmkVarBtonecajqb, 0);
                ss.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = ojitshcjhn(iwxlajgrazVar2);
                if (wkgbmnqykcVarOjitshcjhn instanceof ss.wkgbmnqykc.dxjokdxxww) {
                    vdvldrhtss(80, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-2087863829, true, new nufgyqmvbu(wkgbmnqykcVarOjitshcjhn, controller, iwxlajgrazVar4), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 54);
                }
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: vf0.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lqeggnwhkg.gtknphoqwx(controller, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(vf0.iobyxmoadg iobyxmoadgVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        eablkybsjg(iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ss.wkgbmnqykc gxszxtbevo(i1 i1Var) {
        return (ss.wkgbmnqykc) i1Var.getValue();
    }

    private static final int iozdgvuglv(int i13, w0.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.hszhottldk(w0.nufgyqmvbu.lqeggnwhkg(i13));
    }

    private static final int kcexrzcfyt(uawqvzlxes uawqvzlxesVar) {
        return uawqvzlxesVar.gxszxtbevo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lqeggnwhkg(iwxlajgraz iwxlajgrazVar) {
        return ((Boolean) iwxlajgrazVar.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(iwxlajgraz iwxlajgrazVar, boolean z13) {
        iwxlajgrazVar.setValue(Boolean.valueOf(z13));
    }

    private static final ss.wkgbmnqykc ojitshcjhn(iwxlajgraz iwxlajgrazVar) {
        return (ss.wkgbmnqykc) iwxlajgrazVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(int i13, rgvfuqvkyq rgvfuqvkyqVar, int i14, draadjrbmk draadjrbmkVar, int i15) {
        vdvldrhtss(i13, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i14 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(iwxlajgraz iwxlajgrazVar, ss.wkgbmnqykc wkgbmnqykcVar) {
        iwxlajgrazVar.setValue(wkgbmnqykcVar);
    }

    private static final void vdvldrhtss(final int i13, final rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, final int i14) {
        int i15;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1155208861);
        if ((i14 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1155208861, i15, -1, "ru.myspar.main_activity.impl.compose.error_panel.SnackbarWindow (MySparSnackbarHost.kt:146)");
            }
            Context context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            w0.wkgbmnqykc wkgbmnqykcVar = (w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo());
            androidx.activity.nufgyqmvbu nufgyqmvbuVar = context instanceof androidx.activity.nufgyqmvbu ? (androidx.activity.nufgyqmvbu) context : null;
            if (nufgyqmvbuVar == null) {
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: vf0.wkgbmnqykc
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return lqeggnwhkg.oxmwwwfdhm(i13, rgvfuqvkyqVar, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            y50.nufgyqmvbu nufgyqmvbuVar2 = c60.zoijcleaow.eablkybsjg(context) ? y50.nufgyqmvbu.Dark : y50.nufgyqmvbu.Light;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-205634292);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            draadjrbmk.iobyxmoadg iobyxmoadgVar = draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                Object systemService = ((androidx.activity.nufgyqmvbu) context).getSystemService("window");
                zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                objYadqdtsiqt = (WindowManager) systemService;
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            final WindowManager windowManager = (WindowManager) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-205630884);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = j0.iobyxmoadg(iozdgvuglv(56, wkgbmnqykcVar));
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            final uawqvzlxes uawqvzlxesVar = (uawqvzlxes) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-205626715);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(nufgyqmvbuVar) | draadjrbmkVarBtonecajqb.ulzqkzuiru(nufgyqmvbuVar2) | ((i15 & 112) == 32) | draadjrbmkVarBtonecajqb.lmojexxdyd(windowManager) | ((i15 & 14) == 4);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                final androidx.activity.nufgyqmvbu nufgyqmvbuVar3 = nufgyqmvbuVar;
                final y50.nufgyqmvbu nufgyqmvbuVar4 = nufgyqmvbuVar2;
                tg.draadjrbmk draadjrbmkVar2 = new tg.draadjrbmk() { // from class: vf0.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return lqeggnwhkg.zdlpuopuiu(nufgyqmvbuVar3, windowManager, nufgyqmvbuVar4, rgvfuqvkyqVar, i13, uawqvzlxesVar, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(draadjrbmkVar2);
                objYadqdtsiqt3 = draadjrbmkVar2;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.zoijcleaow(wwaezpbzknVar, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 6);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp2 = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp2 != null) {
            a0VarWflxmlrfwp2.iobyxmoadg(new rgvfuqvkyq() { // from class: vf0.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lqeggnwhkg.yggfygwlhe(i13, rgvfuqvkyqVar, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(iwxlajgraz iwxlajgrazVar, ss.wkgbmnqykc wkgbmnqykcVar) {
        iwxlajgrazVar.setValue(wkgbmnqykcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yadqdtsiqt(Context context, String str) {
        String string = context.getString(s40.draadjrbmk.code_has_been_copied, str);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        c60.zoijcleaow.zoijcleaow(context, null, str, 1, null);
        Toast.makeText(context, string, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yggfygwlhe(int i13, rgvfuqvkyq rgvfuqvkyqVar, int i14, draadjrbmk draadjrbmkVar, int i15) {
        vdvldrhtss(i13, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i14 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ntlheqmsrt zdlpuopuiu(androidx.activity.nufgyqmvbu nufgyqmvbuVar, WindowManager windowManager, y50.nufgyqmvbu nufgyqmvbuVar2, rgvfuqvkyq rgvfuqvkyqVar, int i13, uawqvzlxes uawqvzlxesVar, ulzqkzuiru DisposableEffect) {
        zdlpuopuiu.btonecajqb(DisposableEffect, "$this$DisposableEffect");
        ComposeView composeView = new ComposeView(nufgyqmvbuVar, null, 0, 6, null);
        vipkmwdibw.zoijcleaow(composeView, nufgyqmvbuVar);
        jhduphickx.zoijcleaow(composeView, nufgyqmvbuVar);
        q5.wflxmlrfwp.zoijcleaow(composeView, nufgyqmvbuVar);
        composeView.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(891926317, true, new dxjokdxxww(nufgyqmvbuVar2, rgvfuqvkyqVar)));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2, 296, -3);
        layoutParams.token = nufgyqmvbuVar.getWindow().getAttributes().token;
        layoutParams.gravity = i13;
        layoutParams.y = (i13 == 48 || i13 == 80) ? kcexrzcfyt(uawqvzlxesVar) : 0;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        windowManager.addView(composeView, layoutParams);
        return new btonecajqb(windowManager, composeView);
    }
}
