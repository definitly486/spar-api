package tj;

import gg.wwaezpbzkn;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes3.dex */
public abstract class agtfadlqog {

    public static final class iobyxmoadg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f110575zdlpuopuiu;

        public iobyxmoadg(tg.vdvldrhtss vdvldrhtssVar) {
            this.f110575zdlpuopuiu = vdvldrhtssVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objIobyxmoadg = agtfadlqog.iobyxmoadg(new zoijcleaow(this.f110575zdlpuopuiu, nufgyqmvbuVar, null), gxszxtbevoVar);
            return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ sj.nufgyqmvbu f110576iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f110577jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f110578yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f110579zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(tg.vdvldrhtss vdvldrhtssVar, sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f110577jyumaefscl = vdvldrhtssVar;
            this.f110576iwizpuwonk = nufgyqmvbuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f110577jyumaefscl, this.f110576iwizpuwonk, gxszxtbevoVar);
            zoijcleaowVar.f110578yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f110579zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f110578yggfygwlhe;
                tg.vdvldrhtss vdvldrhtssVar = this.f110577jyumaefscl;
                sj.nufgyqmvbu nufgyqmvbuVar = this.f110576iwizpuwonk;
                this.f110579zdlpuopuiu = 1;
                if (vdvldrhtssVar.invoke(cllcsxoeizVar, nufgyqmvbuVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final Object iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar.getContext(), gxszxtbevoVar);
        Object objZoijcleaow = vj.zoijcleaow.zoijcleaow(wflxmlrfwpVar, wflxmlrfwpVar, rgvfuqvkyqVar);
        if (objZoijcleaow == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZoijcleaow;
    }

    public static final sj.lqeggnwhkg zoijcleaow(tg.vdvldrhtss vdvldrhtssVar) {
        return new iobyxmoadg(vdvldrhtssVar);
    }
}
