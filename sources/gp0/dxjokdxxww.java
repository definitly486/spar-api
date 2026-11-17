package gp0;

import android.view.View;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.vdvldrhtss;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import tg.rgvfuqvkyq;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww extends tr0.iobyxmoadg implements d8.zoijcleaow {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f38164yggfygwlhe;

        /* JADX INFO: renamed from: gp0.dxjokdxxww$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0867iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ View f38166yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f38167zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0867iobyxmoadg(View view, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f38166yggfygwlhe = view;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C0867iobyxmoadg(this.f38166yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f38167zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                jhduphickx.grlcpdaxtj(this.f38166yggfygwlhe, null);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C0867iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ dxjokdxxww f38168yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f38169zdlpuopuiu;

            /* JADX INFO: renamed from: gp0.dxjokdxxww$iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
            /* synthetic */ class C0868iobyxmoadg extends vdvldrhtss implements tg.draadjrbmk {
                C0868iobyxmoadg(Object obj) {
                    super(1, obj, dxjokdxxww.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
                }

                @Override // tg.draadjrbmk
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    iobyxmoadg((ru.myspar.proloyalty.catalog.impl.hint.dialog.presentation.zoijcleaow) obj);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                public final void iobyxmoadg(ru.myspar.proloyalty.catalog.impl.hint.dialog.presentation.zoijcleaow p13) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                    ((dxjokdxxww) this.receiver).ppxfxbqfkf(p13);
                }
            }

            zoijcleaow(nufgyqmvbu nufgyqmvbuVar, dxjokdxxww dxjokdxxwwVar) {
                this.f38169zdlpuopuiu = nufgyqmvbuVar;
                this.f38168yggfygwlhe = dxjokdxxwwVar;
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
                    jyumaefscl.ntlheqmsrt(-2120640661, i13, -1, "ru.myspar.proloyalty.catalog.impl.hint.dialog.presentation.HintDialogViewImpl.render.<anonymous>.<anonymous> (HintDialogViewImpl.kt:27)");
                }
                HintUiModel hintUiModelIobyxmoadg = this.f38169zdlpuopuiu.iobyxmoadg();
                dxjokdxxww dxjokdxxwwVar = this.f38168yggfygwlhe;
                draadjrbmkVar.sopmlzcsov(-112874288);
                boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(dxjokdxxwwVar);
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new C0868iobyxmoadg(dxjokdxxwwVar);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                hp0.wkgbmnqykc.wkgbmnqykc(hintUiModelIobyxmoadg, (tg.draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVar, 0, 0);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
            this.f38164yggfygwlhe = nufgyqmvbuVar;
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
                jyumaefscl.ntlheqmsrt(-1803389104, i13, -1, "ru.myspar.proloyalty.catalog.impl.hint.dialog.presentation.HintDialogViewImpl.render.<anonymous> (HintDialogViewImpl.kt:22)");
            }
            View view = (View) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVar.sopmlzcsov(1684948862);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(view);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new C0867iobyxmoadg(view, null);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            jlmebxxoox.eablkybsjg(wwaezpbzknVar, (rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVar, 6);
            l41.zoijcleaow.zoijcleaow(p41.ppxfxbqfkf.eablkybsjg(dxjokdxxww.this.wkgbmnqykc()) ? l41.nufgyqmvbu.Dark : l41.nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-2120640661, true, new zoijcleaow(this.f38164yggfygwlhe, dxjokdxxww.this), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(tg.iobyxmoadg binding) {
        super(binding);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(binding, "binding");
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(o41.iobyxmoadg binding, nufgyqmvbu model) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(binding, "binding");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        binding.f72032zoijcleaow.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-1803389104, true, new iobyxmoadg(model)));
    }
}
