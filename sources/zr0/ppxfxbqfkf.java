package zr0;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.pkzmftpjix;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pkzmftpjix f131081iobyxmoadg;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Object f131082jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f131084zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(Object obj, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f131082jyumaefscl = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new iobyxmoadg(this.f131082jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f131084zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                Object obj2 = this.f131082jyumaefscl;
                this.f131084zdlpuopuiu = 1;
                obj = ppxfxbqfkfVar.iobyxmoadg(obj2, this);
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
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ppxfxbqfkf(pkzmftpjix coroutineDispatcher) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f131081iobyxmoadg = coroutineDispatcher;
    }

    protected abstract Object iobyxmoadg(Object obj, gxszxtbevo gxszxtbevoVar);

    public final Object zoijcleaow(Object obj, gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f131081iobyxmoadg, new iobyxmoadg(obj, null), gxszxtbevoVar);
    }
}
