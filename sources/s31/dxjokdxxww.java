package s31;

import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.zeieaojujs;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dxjokdxxww {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f105367yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f105368zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f105367yggfygwlhe = nufgyqmvbuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f105367yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f105368zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbu nufgyqmvbuVar = this.f105367yggfygwlhe;
                this.f105368zdlpuopuiu = 1;
                if (nufgyqmvbuVar.zoijcleaow(this) == objGxszxtbevo) {
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
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final nufgyqmvbu iobyxmoadg(agtfadlqog theme, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(theme, "theme");
        draadjrbmkVar.sopmlzcsov(-28001099);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-28001099, i13, -1, "ru.myspar.proloyalty.core.ui.compose.components.shimmer.rememberShimmerEffect (ShimmerEffect.kt:21)");
        }
        float fI = ((w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(zeieaojujs.gxszxtbevo())).I(theme.nufgyqmvbu());
        draadjrbmkVar.sopmlzcsov(1010832571);
        boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(theme);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new nufgyqmvbu(theme.ppxfxbqfkf(), theme.wkgbmnqykc(), theme.eablkybsjg(), theme.lqeggnwhkg(), theme.gxszxtbevo(), fI, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) objYadqdtsiqt;
        draadjrbmkVar.stevsuqkhv();
        draadjrbmkVar.sopmlzcsov(1010843937);
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(nufgyqmvbuVar);
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt2 = new iobyxmoadg(nufgyqmvbuVar, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        draadjrbmkVar.stevsuqkhv();
        jlmebxxoox.eablkybsjg(nufgyqmvbuVar, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, 0);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return nufgyqmvbuVar;
    }
}
