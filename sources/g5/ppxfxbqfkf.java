package g5;

import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;
import v2.esjtqupxsv;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f36206yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f36207zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f36206yggfygwlhe = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f36206yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f36207zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow zoijcleaowVar = this.f36206yggfygwlhe;
                this.f36207zdlpuopuiu = 1;
                if (zoijcleaowVar.gxszxtbevo(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final zoijcleaow iobyxmoadg(esjtqupxsv player, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(player, "player");
        draadjrbmkVar.sopmlzcsov(1142766348);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(1142766348, i13, -1, "androidx.media3.ui.compose.state.rememberPresentationState (PresentationState.kt:40)");
        }
        draadjrbmkVar.sopmlzcsov(2097636767);
        boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(player);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new zoijcleaow(player);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) objYadqdtsiqt;
        draadjrbmkVar.stevsuqkhv();
        draadjrbmkVar.sopmlzcsov(2097639056);
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(zoijcleaowVar);
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt2 = new iobyxmoadg(zoijcleaowVar, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        draadjrbmkVar.stevsuqkhv();
        jlmebxxoox.eablkybsjg(player, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, i13 & 14);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return zoijcleaowVar;
    }
}
