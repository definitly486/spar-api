package r81;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final /* synthetic */ Object f82179yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    int f82180zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Object obj, gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f82179yggfygwlhe = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
        return new wkgbmnqykc(this.f82179yggfygwlhe, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f82180zdlpuopuiu;
        if (i13 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            gq1.iobyxmoadg iobyxmoadgVar = ((ppxfxbqfkf) this.f82179yggfygwlhe).f82143wkgbmnqykc;
            this.f82180zdlpuopuiu = 1;
            obj = iobyxmoadgVar.iobyxmoadg(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
        }
        return obj;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
        return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
