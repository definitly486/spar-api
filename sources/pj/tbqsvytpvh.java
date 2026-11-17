package pj;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tbqsvytpvh {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f76773jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f76774yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f76775zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f76773jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f76773jyumaefscl, gxszxtbevoVar);
            iobyxmoadgVar.f76774yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f76775zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return tbqsvytpvh.wkgbmnqykc(((cllcsxoeiz) this.f76774yggfygwlhe).getCoroutineContext(), this.f76773jyumaefscl);
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static /* synthetic */ Object ppxfxbqfkf(lg.btonecajqb btonecajqbVar, tg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            btonecajqbVar = lg.gtknphoqwx.f62507zdlpuopuiu;
        }
        return zoijcleaow(btonecajqbVar, iobyxmoadgVar, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object wkgbmnqykc(lg.btonecajqb btonecajqbVar, tg.iobyxmoadg iobyxmoadgVar) throws Throwable {
        try {
            d dVar = new d();
            dVar.zynmafqrjb(dvvnrvtcbc.gtknphoqwx(btonecajqbVar));
            try {
                return iobyxmoadgVar.invoke();
            } finally {
                dVar.esjtqupxsv();
            }
        } catch (InterruptedException e13) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e13);
        }
    }

    public static final Object zoijcleaow(lg.btonecajqb btonecajqbVar, tg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(btonecajqbVar, new iobyxmoadg(iobyxmoadgVar, null), gxszxtbevoVar);
    }
}
