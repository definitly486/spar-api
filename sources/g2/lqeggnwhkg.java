package g2;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f35834jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f35835yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35836zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f35834jyumaefscl = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f35834jyumaefscl, gxszxtbevoVar);
            iobyxmoadgVar.f35835yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f35836zdlpuopuiu;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g2.iobyxmoadg iobyxmoadgVar = (g2.iobyxmoadg) this.f35835yggfygwlhe;
                zdlpuopuiu.zoijcleaow(obj);
                return iobyxmoadgVar;
            }
            zdlpuopuiu.zoijcleaow(obj);
            g2.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ((wkgbmnqykc) this.f35835yggfygwlhe).ppxfxbqfkf();
            rgvfuqvkyq rgvfuqvkyqVar = this.f35834jyumaefscl;
            this.f35835yggfygwlhe = iobyxmoadgVarPpxfxbqfkf;
            this.f35836zdlpuopuiu = 1;
            return rgvfuqvkyqVar.invoke(iobyxmoadgVarPpxfxbqfkf, this) == objGxszxtbevo ? objGxszxtbevo : iobyxmoadgVarPpxfxbqfkf;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(wkgbmnqykcVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final Object iobyxmoadg(d2.eablkybsjg eablkybsjgVar, rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        return eablkybsjgVar.iobyxmoadg(new iobyxmoadg(rgvfuqvkyqVar, null), gxszxtbevoVar);
    }
}
