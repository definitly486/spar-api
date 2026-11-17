package zc1;

import ad1.agtfadlqog;
import ad1.istkbnxepw;
import ad1.iwizpuwonk;
import ad1.lmojexxdyd;
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
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import k21.ojitshcjhn;
import kotlin.jvm.internal.vdvldrhtss;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ int f129621cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ uawqvzlxes f129622esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ androidx.activity.nufgyqmvbu f129623iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ComposeView f129624jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ WindowManager f129625yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f129626zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(WindowManager windowManager, ComposeView composeView, androidx.activity.nufgyqmvbu nufgyqmvbuVar, int i13, uawqvzlxes uawqvzlxesVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f129625yggfygwlhe = windowManager;
            this.f129624jyumaefscl = composeView;
            this.f129623iwizpuwonk = nufgyqmvbuVar;
            this.f129621cqumvgiudr = i13;
            this.f129622esjtqupxsv = uawqvzlxesVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new btonecajqb(this.f129625yggfygwlhe, this.f129624jyumaefscl, this.f129623iwizpuwonk, this.f129621cqumvgiudr, this.f129622esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f129626zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f129626zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(300L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            WindowManager windowManager = this.f129625yggfygwlhe;
            ComposeView composeView = this.f129624jyumaefscl;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2, 296, -3);
            androidx.activity.nufgyqmvbu nufgyqmvbuVar = this.f129623iwizpuwonk;
            int i14 = this.f129621cqumvgiudr;
            uawqvzlxes uawqvzlxesVar = this.f129622esjtqupxsv;
            layoutParams.token = nufgyqmvbuVar.getWindow().getAttributes().token;
            layoutParams.gravity = i14;
            layoutParams.y = lqeggnwhkg.kcexrzcfyt(uawqvzlxesVar);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            windowManager.addView(composeView, layoutParams);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f129627yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ l41.nufgyqmvbu f129628zdlpuopuiu;

        static final class iobyxmoadg implements rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ rgvfuqvkyq f129629zdlpuopuiu;

            iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar) {
                this.f129629zdlpuopuiu = rgvfuqvkyqVar;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(1509631526, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.SnackbarWindow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MySparSnackbarHost.kt:184)");
                }
                rgvfuqvkyq rgvfuqvkyqVar = this.f129629zdlpuopuiu;
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
                androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
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

        draadjrbmk(l41.nufgyqmvbu nufgyqmvbuVar, rgvfuqvkyq rgvfuqvkyqVar) {
            this.f129628zdlpuopuiu = nufgyqmvbuVar;
            this.f129627yggfygwlhe = rgvfuqvkyqVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-144961845, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.SnackbarWindow.<anonymous>.<anonymous>.<anonymous> (MySparSnackbarHost.kt:183)");
            }
            l41.zoijcleaow.zoijcleaow(this.f129628zdlpuopuiu, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1509631526, true, new iobyxmoadg(this.f129627yggfygwlhe), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class dxjokdxxww implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f129630jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zc1.iobyxmoadg f129631yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lr0.eablkybsjg f129632zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends vdvldrhtss implements tg.iobyxmoadg {
            iobyxmoadg(Object obj) {
                super(0, obj, zc1.iobyxmoadg.class, "hideBottom", "hideBottom()V", 0);
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                ((zc1.iobyxmoadg) this.receiver).gxszxtbevo();
            }
        }

        dxjokdxxww(lr0.eablkybsjg eablkybsjgVar, zc1.iobyxmoadg iobyxmoadgVar, iwxlajgraz iwxlajgrazVar) {
            this.f129632zdlpuopuiu = eablkybsjgVar;
            this.f129631yggfygwlhe = iobyxmoadgVar;
            this.f129630jyumaefscl = iwxlajgrazVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1103974428, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.MySparSnackbarHost.<anonymous> (MySparSnackbarHost.kt:143)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = esjtqupxsv.oxmwwwfdhm(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 0.0f, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(8), 7, null);
            lr0.eablkybsjg.dxjokdxxww dxjokdxxwwVar = (lr0.eablkybsjg.dxjokdxxww) this.f129632zdlpuopuiu;
            boolean zDxjokdxxww = lqeggnwhkg.dxjokdxxww(this.f129630jyumaefscl);
            zc1.iobyxmoadg iobyxmoadgVar = this.f129631yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(1841849794);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(iobyxmoadgVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            lmojexxdyd.zoijcleaow(wkgbmnqykcVarOxmwwwfdhm, dxjokdxxwwVar, zDxjokdxxww, (tg.iobyxmoadg) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVar, 6, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class eablkybsjg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f129633jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zc1.iobyxmoadg f129634yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lr0.eablkybsjg f129635zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends vdvldrhtss implements tg.iobyxmoadg {
            iobyxmoadg(Object obj) {
                super(0, obj, zc1.iobyxmoadg.class, "hideTop", "hideTop()V", 0);
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                ((zc1.iobyxmoadg) this.receiver).lqeggnwhkg();
            }
        }

        /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.iobyxmoadg implements tg.draadjrbmk {
            zoijcleaow(Object obj) {
                super(1, obj, zc1.iobyxmoadg.class, "onHold", "onHold(ZLkotlin/jvm/functions/Function1;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg(((Boolean) obj).booleanValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(boolean z13) {
                zc1.iobyxmoadg.dxjokdxxww((zc1.iobyxmoadg) this.f60022zdlpuopuiu, z13, null, 2, null);
            }
        }

        eablkybsjg(lr0.eablkybsjg eablkybsjgVar, zc1.iobyxmoadg iobyxmoadgVar, iwxlajgraz iwxlajgrazVar) {
            this.f129635zdlpuopuiu = eablkybsjgVar;
            this.f129634yggfygwlhe = iobyxmoadgVar;
            this.f129633jyumaefscl = iwxlajgrazVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-676652650, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.MySparSnackbarHost.<anonymous> (MySparSnackbarHost.kt:93)");
            }
            lr0.eablkybsjg.lqeggnwhkg lqeggnwhkgVar = (lr0.eablkybsjg.lqeggnwhkg) this.f129635zdlpuopuiu;
            boolean zLqeggnwhkg = lqeggnwhkg.lqeggnwhkg(this.f129633jyumaefscl);
            zc1.iobyxmoadg iobyxmoadgVar = this.f129634yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(1841787999);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(iobyxmoadgVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            ah.lqeggnwhkg lqeggnwhkgVar2 = (ah.lqeggnwhkg) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
            zc1.iobyxmoadg iobyxmoadgVar2 = this.f129634yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(1841789726);
            boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar2);
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new zoijcleaow(iobyxmoadgVar2);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            istkbnxepw.wkgbmnqykc(lqeggnwhkgVar, zLqeggnwhkg, (tg.draadjrbmk) objYadqdtsiqt2, (tg.iobyxmoadg) lqeggnwhkgVar2, draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class gtknphoqwx implements ntlheqmsrt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ulzqkzuiru f129636iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ ComposeView f129637ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ WindowManager f129638zoijcleaow;

        public gtknphoqwx(ulzqkzuiru ulzqkzuiruVar, WindowManager windowManager, ComposeView composeView) {
            this.f129636iobyxmoadg = ulzqkzuiruVar;
            this.f129638zoijcleaow = windowManager;
            this.f129637ppxfxbqfkf = composeView;
        }

        @Override // androidx.compose.runtime.ntlheqmsrt
        public void iobyxmoadg() {
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                this.f129638zoijcleaow.removeView(this.f129637ppxfxbqfkf);
                kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
        }
    }

    static final class gxszxtbevo implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f129639yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ zc1.iobyxmoadg f129640zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends vdvldrhtss implements tg.iobyxmoadg {
            iobyxmoadg(Object obj) {
                super(0, obj, zc1.iobyxmoadg.class, "hideTop", "hideTop()V", 0);
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                ((zc1.iobyxmoadg) this.receiver).lqeggnwhkg();
            }
        }

        /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.iobyxmoadg implements tg.draadjrbmk {
            zoijcleaow(Object obj) {
                super(1, obj, zc1.iobyxmoadg.class, "onHold", "onHold(ZLkotlin/jvm/functions/Function1;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg(((Boolean) obj).booleanValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(boolean z13) {
                zc1.iobyxmoadg.dxjokdxxww((zc1.iobyxmoadg) this.f60022zdlpuopuiu, z13, null, 2, null);
            }
        }

        gxszxtbevo(zc1.iobyxmoadg iobyxmoadgVar, iwxlajgraz iwxlajgrazVar) {
            this.f129640zdlpuopuiu = iobyxmoadgVar;
            this.f129639yggfygwlhe = iwxlajgrazVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1069651595, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.MySparSnackbarHost.<anonymous> (MySparSnackbarHost.kt:104)");
            }
            boolean zLqeggnwhkg = lqeggnwhkg.lqeggnwhkg(this.f129639yggfygwlhe);
            zc1.iobyxmoadg iobyxmoadgVar = this.f129640zdlpuopuiu;
            draadjrbmkVar.sopmlzcsov(1841799519);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(iobyxmoadgVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            ah.lqeggnwhkg lqeggnwhkgVar = (ah.lqeggnwhkg) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
            zc1.iobyxmoadg iobyxmoadgVar2 = this.f129640zdlpuopuiu;
            draadjrbmkVar.sopmlzcsov(1841801246);
            boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar2);
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new zoijcleaow(iobyxmoadgVar2);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            ad1.dxjokdxxww.gxszxtbevo(zLqeggnwhkg, (tg.draadjrbmk) objYadqdtsiqt2, (tg.iobyxmoadg) lqeggnwhkgVar, draadjrbmkVar, 0, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f129641jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ i1 f129642yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f129643zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(i1 i1Var, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f129642yggfygwlhe = i1Var;
            this.f129641jyumaefscl = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f129642yggfygwlhe, this.f129641jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f129643zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (lqeggnwhkg.gxszxtbevo(this.f129642yggfygwlhe) == null) {
                    this.f129643zdlpuopuiu = 1;
                    if (crxdokpmqz.zoijcleaow(250L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            lqeggnwhkg.wflxmlrfwp(this.f129641jyumaefscl, lqeggnwhkg.gxszxtbevo(this.f129642yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: zc1.lqeggnwhkg$lqeggnwhkg, reason: collision with other inner class name */
    static final class C3298lqeggnwhkg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f129644jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zc1.iobyxmoadg f129645yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lr0.eablkybsjg f129646zdlpuopuiu;

        /* JADX INFO: renamed from: zc1.lqeggnwhkg$lqeggnwhkg$iobyxmoadg */
        /* synthetic */ class iobyxmoadg extends vdvldrhtss implements tg.iobyxmoadg {
            iobyxmoadg(Object obj) {
                super(0, obj, zc1.iobyxmoadg.class, "hideTop", "hideTop()V", 0);
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                ((zc1.iobyxmoadg) this.receiver).lqeggnwhkg();
            }
        }

        /* JADX INFO: renamed from: zc1.lqeggnwhkg$lqeggnwhkg$zoijcleaow */
        /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.iobyxmoadg implements tg.draadjrbmk {
            zoijcleaow(Object obj) {
                super(1, obj, zc1.iobyxmoadg.class, "onHold", "onHold(ZLkotlin/jvm/functions/Function1;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg(((Boolean) obj).booleanValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(boolean z13) {
                zc1.iobyxmoadg.dxjokdxxww((zc1.iobyxmoadg) this.f60022zdlpuopuiu, z13, null, 2, null);
            }
        }

        C3298lqeggnwhkg(lr0.eablkybsjg eablkybsjgVar, zc1.iobyxmoadg iobyxmoadgVar, iwxlajgraz iwxlajgrazVar) {
            this.f129646zdlpuopuiu = eablkybsjgVar;
            this.f129645yggfygwlhe = iobyxmoadgVar;
            this.f129644jyumaefscl = iwxlajgrazVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(zc1.iobyxmoadg iobyxmoadgVar, lr0.eablkybsjg eablkybsjgVar) {
            iobyxmoadgVar.lqeggnwhkg();
            lr0.eablkybsjg.btonecajqb btonecajqbVar = (lr0.eablkybsjg.btonecajqb) eablkybsjgVar;
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(btonecajqbVar.zoijcleaow().zoijcleaow()).wkgbmnqykc(btonecajqbVar.zoijcleaow().ppxfxbqfkf()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            zoijcleaow((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1462650540, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.MySparSnackbarHost.<anonymous> (MySparSnackbarHost.kt:113)");
            }
            lr0.eablkybsjg.btonecajqb btonecajqbVar = (lr0.eablkybsjg.btonecajqb) this.f129646zdlpuopuiu;
            boolean zLqeggnwhkg = lqeggnwhkg.lqeggnwhkg(this.f129644jyumaefscl);
            zc1.iobyxmoadg iobyxmoadgVar = this.f129645yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(1841812799);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(iobyxmoadgVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            ah.lqeggnwhkg lqeggnwhkgVar = (ah.lqeggnwhkg) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
            zc1.iobyxmoadg iobyxmoadgVar2 = this.f129645yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(1841814526);
            boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar2);
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new zoijcleaow(iobyxmoadgVar2);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) objYadqdtsiqt2;
            draadjrbmkVar.stevsuqkhv();
            tg.iobyxmoadg iobyxmoadgVar3 = (tg.iobyxmoadg) lqeggnwhkgVar;
            draadjrbmkVar.sopmlzcsov(1841816780);
            boolean zLmojexxdyd3 = draadjrbmkVar.lmojexxdyd(this.f129645yggfygwlhe) | draadjrbmkVar.lmojexxdyd(this.f129646zdlpuopuiu);
            final zc1.iobyxmoadg iobyxmoadgVar4 = this.f129645yggfygwlhe;
            final lr0.eablkybsjg eablkybsjgVar = this.f129646zdlpuopuiu;
            Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: zc1.dxjokdxxww
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return lqeggnwhkg.C3298lqeggnwhkg.ppxfxbqfkf(iobyxmoadgVar4, eablkybsjgVar);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVar.stevsuqkhv();
            iwizpuwonk.gtknphoqwx(btonecajqbVar, zLqeggnwhkg, draadjrbmkVar2, iobyxmoadgVar3, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVar, 0, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f129647jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ i1 f129648yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f129649zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(i1 i1Var, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f129648yggfygwlhe = i1Var;
            this.f129647jyumaefscl = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(this.f129648yggfygwlhe, this.f129647jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f129649zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            lqeggnwhkg.btonecajqb(this.f129647jyumaefscl, lqeggnwhkg.agtfadlqog(this.f129648yggfygwlhe) != null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f129650jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ i1 f129651yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f129652zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(i1 i1Var, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f129651yggfygwlhe = i1Var;
            this.f129650jyumaefscl = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f129651yggfygwlhe, this.f129650jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f129652zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            lqeggnwhkg.nufgyqmvbu(this.f129650jyumaefscl, lqeggnwhkg.gxszxtbevo(this.f129651yggfygwlhe) != null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f129653iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Context f129654jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zc1.iobyxmoadg f129655yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lr0.eablkybsjg f129656zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends vdvldrhtss implements tg.iobyxmoadg {
            iobyxmoadg(Object obj) {
                super(0, obj, zc1.iobyxmoadg.class, "hideTop", "hideTop()V", 0);
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                ((zc1.iobyxmoadg) this.receiver).lqeggnwhkg();
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
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                lqeggnwhkg.iozdgvuglv((Context) this.receiver, p13);
            }
        }

        wkgbmnqykc(lr0.eablkybsjg eablkybsjgVar, zc1.iobyxmoadg iobyxmoadgVar, Context context, iwxlajgraz iwxlajgrazVar) {
            this.f129656zdlpuopuiu = eablkybsjgVar;
            this.f129655yggfygwlhe = iobyxmoadgVar;
            this.f129654jyumaefscl = context;
            this.f129653iwizpuwonk = iwxlajgrazVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(zc1.iobyxmoadg iobyxmoadgVar, Context context, boolean z13) {
            iobyxmoadgVar.nufgyqmvbu(z13, new zoijcleaow(context));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            zoijcleaow((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-320396307, i13, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.MySparSnackbarHost.<anonymous> (MySparSnackbarHost.kt:77)");
            }
            lr0.eablkybsjg.C1313eablkybsjg c1313eablkybsjg = (lr0.eablkybsjg.C1313eablkybsjg) this.f129656zdlpuopuiu;
            boolean zLqeggnwhkg = lqeggnwhkg.lqeggnwhkg(this.f129653iwizpuwonk);
            zc1.iobyxmoadg iobyxmoadgVar = this.f129655yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(1841767647);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(iobyxmoadgVar);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(iobyxmoadgVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            ah.lqeggnwhkg lqeggnwhkgVar = (ah.lqeggnwhkg) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.sopmlzcsov(1841769611);
            boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(this.f129655yggfygwlhe) | draadjrbmkVar.lmojexxdyd(this.f129654jyumaefscl);
            final zc1.iobyxmoadg iobyxmoadgVar2 = this.f129655yggfygwlhe;
            final Context context = this.f129654jyumaefscl;
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: zc1.nufgyqmvbu
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return lqeggnwhkg.wkgbmnqykc.ppxfxbqfkf(iobyxmoadgVar2, context, ((Boolean) obj).booleanValue());
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            agtfadlqog.wkgbmnqykc(c1313eablkybsjg, zLqeggnwhkg, (tg.draadjrbmk) objYadqdtsiqt2, (tg.iobyxmoadg) lqeggnwhkgVar, draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f129657jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ i1 f129658yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f129659zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(i1 i1Var, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f129658yggfygwlhe = i1Var;
            this.f129657jyumaefscl = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f129658yggfygwlhe, this.f129657jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f129659zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (lqeggnwhkg.agtfadlqog(this.f129658yggfygwlhe) == null) {
                    this.f129659zdlpuopuiu = 1;
                    if (crxdokpmqz.zoijcleaow(250L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            lqeggnwhkg.rgvfuqvkyq(this.f129657jyumaefscl, lqeggnwhkg.agtfadlqog(this.f129658yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lr0.eablkybsjg agtfadlqog(i1 i1Var) {
        return (lr0.eablkybsjg) i1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(iwxlajgraz iwxlajgrazVar, boolean z13) {
        iwxlajgrazVar.setValue(Boolean.valueOf(z13));
    }

    private static final lr0.eablkybsjg draadjrbmk(iwxlajgraz iwxlajgrazVar) {
        return (lr0.eablkybsjg) iwxlajgrazVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dxjokdxxww(iwxlajgraz iwxlajgrazVar) {
        return ((Boolean) iwxlajgrazVar.getValue()).booleanValue();
    }

    public static final void eablkybsjg(final zc1.iobyxmoadg controller, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(controller, "controller");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-847603529);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(controller) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-847603529, i14, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.MySparSnackbarHost (MySparSnackbarHost.kt:48)");
            }
            Context context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            i1 i1VarZoijcleaow = v0.zoijcleaow(controller.eablkybsjg(), null, draadjrbmkVarBtonecajqb, 0, 1);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1557558676);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(gxszxtbevo(i1VarZoijcleaow), null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            i1 i1VarZoijcleaow2 = v0.zoijcleaow(controller.wkgbmnqykc(), null, draadjrbmkVarBtonecajqb, 0, 1);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1557563927);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = c1.ppxfxbqfkf(agtfadlqog(i1VarZoijcleaow2), null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            iwxlajgraz iwxlajgrazVar2 = (iwxlajgraz) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            lr0.eablkybsjg eablkybsjgVarGxszxtbevo = gxszxtbevo(i1VarZoijcleaow);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1557566372);
            boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarZoijcleaow);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new iobyxmoadg(i1VarZoijcleaow, iwxlajgrazVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(eablkybsjgVarGxszxtbevo, (rgvfuqvkyq) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 0);
            lr0.eablkybsjg eablkybsjgVarAgtfadlqog = agtfadlqog(i1VarZoijcleaow2);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1557570317);
            boolean zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarZoijcleaow2);
            Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt4 = new zoijcleaow(i1VarZoijcleaow2, iwxlajgrazVar2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(eablkybsjgVarAgtfadlqog, (rgvfuqvkyq) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1557575960);
            if (draadjrbmk(iwxlajgrazVar) != null) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1557575311);
                Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt5 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt5 = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                iwxlajgraz iwxlajgrazVar3 = (iwxlajgraz) objYadqdtsiqt5;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                lr0.eablkybsjg eablkybsjgVarGxszxtbevo2 = gxszxtbevo(i1VarZoijcleaow);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1557577603);
                boolean zUlzqkzuiru3 = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarZoijcleaow);
                Object objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru3 || objYadqdtsiqt6 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt6 = new ppxfxbqfkf(i1VarZoijcleaow, iwxlajgrazVar3, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(eablkybsjgVarGxszxtbevo2, (rgvfuqvkyq) objYadqdtsiqt6, draadjrbmkVarBtonecajqb, 0);
                lr0.eablkybsjg eablkybsjgVarDraadjrbmk = draadjrbmk(iwxlajgrazVar);
                if (eablkybsjgVarDraadjrbmk instanceof lr0.eablkybsjg.C1313eablkybsjg) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1040424097);
                    vdvldrhtss(48, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-320396307, true, new wkgbmnqykc(eablkybsjgVarDraadjrbmk, controller, context, iwxlajgrazVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 54);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else if (eablkybsjgVarDraadjrbmk instanceof lr0.eablkybsjg.lqeggnwhkg) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1041048623);
                    vdvldrhtss(48, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-676652650, true, new eablkybsjg(eablkybsjgVarDraadjrbmk, controller, iwxlajgrazVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 54);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else if (eablkybsjgVarDraadjrbmk instanceof lr0.eablkybsjg.ppxfxbqfkf) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1041448988);
                    vdvldrhtss(48, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1069651595, true, new gxszxtbevo(controller, iwxlajgrazVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 54);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else if (eablkybsjgVarDraadjrbmk instanceof lr0.eablkybsjg.btonecajqb) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1041819066);
                    vdvldrhtss(48, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1462650540, true, new C3298lqeggnwhkg(eablkybsjgVarDraadjrbmk, controller, iwxlajgrazVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 54);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1557652049);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (ojitshcjhn(iwxlajgrazVar2) != null) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1557654831);
                Object objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt7 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt7 = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                }
                iwxlajgraz iwxlajgrazVar4 = (iwxlajgraz) objYadqdtsiqt7;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                lr0.eablkybsjg eablkybsjgVarAgtfadlqog2 = agtfadlqog(i1VarZoijcleaow2);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1557657222);
                boolean zUlzqkzuiru4 = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarZoijcleaow2);
                Object objYadqdtsiqt8 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru4 || objYadqdtsiqt8 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt8 = new nufgyqmvbu(i1VarZoijcleaow2, iwxlajgrazVar4, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt8);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(eablkybsjgVarAgtfadlqog2, (rgvfuqvkyq) objYadqdtsiqt8, draadjrbmkVarBtonecajqb, 0);
                lr0.eablkybsjg eablkybsjgVarOjitshcjhn = ojitshcjhn(iwxlajgrazVar2);
                if (eablkybsjgVarOjitshcjhn instanceof lr0.eablkybsjg.dxjokdxxww) {
                    vdvldrhtss(80, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1103974428, true, new dxjokdxxww(eablkybsjgVarOjitshcjhn, controller, iwxlajgrazVar4), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 54);
                }
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: zc1.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lqeggnwhkg.gtknphoqwx(controller, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(zc1.iobyxmoadg iobyxmoadgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        eablkybsjg(iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lr0.eablkybsjg gxszxtbevo(i1 i1Var) {
        return (lr0.eablkybsjg) i1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iozdgvuglv(Context context, String str) {
        String string = context.getString(b31.wflxmlrfwp.proloyalty_code_has_been_copied, str);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        p41.ppxfxbqfkf.zoijcleaow(context, null, str, 1, null);
        Toast.makeText(context, string, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int kcexrzcfyt(uawqvzlxes uawqvzlxesVar) {
        return uawqvzlxesVar.gxszxtbevo();
    }

    private static final int lmojexxdyd(int i13, w0.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.hszhottldk(w0.nufgyqmvbu.lqeggnwhkg(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lqeggnwhkg(iwxlajgraz iwxlajgrazVar) {
        return ((Boolean) iwxlajgrazVar.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(iwxlajgraz iwxlajgrazVar, boolean z13) {
        iwxlajgrazVar.setValue(Boolean.valueOf(z13));
    }

    private static final lr0.eablkybsjg ojitshcjhn(iwxlajgraz iwxlajgrazVar) {
        return (lr0.eablkybsjg) iwxlajgrazVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(int i13, rgvfuqvkyq rgvfuqvkyqVar, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        vdvldrhtss(i13, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i14 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(iwxlajgraz iwxlajgrazVar, lr0.eablkybsjg eablkybsjgVar) {
        iwxlajgrazVar.setValue(eablkybsjgVar);
    }

    private static final void vdvldrhtss(final int i13, final rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14) {
        int i15;
        boolean z13;
        Object obj;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1270403058);
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
                jyumaefscl.ntlheqmsrt(1270403058, i15, -1, "ru.myspar.proloyalty.main_activity.impl.compose.error_panel.SnackbarWindow (MySparSnackbarHost.kt:166)");
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
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: zc1.wkgbmnqykc
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj2, Object obj3) {
                            return lqeggnwhkg.oxmwwwfdhm(i13, rgvfuqvkyqVar, i14, (draadjrbmk) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            l41.nufgyqmvbu nufgyqmvbuVar2 = p41.ppxfxbqfkf.eablkybsjg(context) ? l41.nufgyqmvbu.Dark : l41.nufgyqmvbu.Light;
            draadjrbmkVarBtonecajqb.sopmlzcsov(202887977);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                Object systemService = ((androidx.activity.nufgyqmvbu) context).getSystemService("window");
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                objYadqdtsiqt = (WindowManager) systemService;
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            final WindowManager windowManager = (WindowManager) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(202891385);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = j0.iobyxmoadg(lmojexxdyd(56, wkgbmnqykcVar));
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            uawqvzlxes uawqvzlxesVar = (uawqvzlxes) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(202894258);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                z13 = true;
                ComposeView composeView = new ComposeView(nufgyqmvbuVar, null, 0, 6, null);
                vipkmwdibw.zoijcleaow(composeView, nufgyqmvbuVar);
                jhduphickx.zoijcleaow(composeView, nufgyqmvbuVar);
                q5.wflxmlrfwp.zoijcleaow(composeView, nufgyqmvbuVar);
                composeView.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-144961845, true, new draadjrbmk(nufgyqmvbuVar2, rgvfuqvkyqVar)));
                draadjrbmkVarBtonecajqb.jyumaefscl(composeView);
                obj = composeView;
            } else {
                z13 = true;
                obj = objYadqdtsiqt3;
            }
            final ComposeView composeView2 = (ComposeView) obj;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(202908464);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(windowManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(composeView2) | draadjrbmkVarBtonecajqb.lmojexxdyd(nufgyqmvbuVar) | ((i15 & 14) == 4 ? z13 : false);
            Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                btonecajqb btonecajqbVar = new btonecajqb(windowManager, composeView2, nufgyqmvbuVar, i13, uawqvzlxesVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(btonecajqbVar);
                objYadqdtsiqt4 = btonecajqbVar;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(wwaezpbzknVar, (rgvfuqvkyq) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 6);
            draadjrbmkVarBtonecajqb.sopmlzcsov(202931963);
            boolean zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(windowManager) | draadjrbmkVarBtonecajqb.lmojexxdyd(composeView2);
            Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt5 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt5 = new tg.draadjrbmk() { // from class: zc1.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return lqeggnwhkg.zdlpuopuiu(windowManager, composeView2, (ulzqkzuiru) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.zoijcleaow(wwaezpbzknVar, (tg.draadjrbmk) objYadqdtsiqt5, draadjrbmkVarBtonecajqb, 6);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp2 = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp2 != null) {
            a0VarWflxmlrfwp2.iobyxmoadg(new rgvfuqvkyq() { // from class: zc1.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return lqeggnwhkg.yggfygwlhe(i13, rgvfuqvkyqVar, i14, (draadjrbmk) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(iwxlajgraz iwxlajgrazVar, lr0.eablkybsjg eablkybsjgVar) {
        iwxlajgrazVar.setValue(eablkybsjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yggfygwlhe(int i13, rgvfuqvkyq rgvfuqvkyqVar, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        vdvldrhtss(i13, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i14 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ntlheqmsrt zdlpuopuiu(WindowManager windowManager, ComposeView composeView, ulzqkzuiru DisposableEffect) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(DisposableEffect, "$this$DisposableEffect");
        return new gtknphoqwx(DisposableEffect, windowManager, composeView);
    }
}
