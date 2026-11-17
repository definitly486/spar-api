package e8;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.vdvldrhtss;
import lg.gxszxtbevo;
import rj.iwizpuwonk;
import rj.oxmwwwfdhm;
import rj.zdlpuopuiu;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import tg.rgvfuqvkyq;
import y7.eablkybsjg;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Object f30886jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f30887yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30888zdlpuopuiu;

        /* JADX INFO: renamed from: e8.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0640iobyxmoadg implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f30889zdlpuopuiu;

            public C0640iobyxmoadg(zdlpuopuiu zdlpuopuiuVar) {
                this.f30889zdlpuopuiu = zdlpuopuiuVar;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                iwizpuwonk.iobyxmoadg.iobyxmoadg(this.f30889zdlpuopuiu.kcexrzcfyt(), null, 1, null);
            }
        }

        /* JADX INFO: renamed from: e8.ppxfxbqfkf$iobyxmoadg$ppxfxbqfkf, reason: collision with other inner class name */
        public /* synthetic */ class C0641ppxfxbqfkf extends vdvldrhtss implements tg.iobyxmoadg {
            public C0641ppxfxbqfkf(Object obj) {
                super(0, obj, y7.iobyxmoadg.class, "dispose", "dispose()V", 0);
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                ((y7.iobyxmoadg) this.receiver).iobyxmoadg();
            }
        }

        public static final class zoijcleaow implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f30890zdlpuopuiu;

            public zoijcleaow(zdlpuopuiu zdlpuopuiuVar) {
                this.f30890zdlpuopuiu = zdlpuopuiuVar;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Object obj) {
                this.f30890zdlpuopuiu.kcexrzcfyt().eablkybsjg(obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Object obj, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f30886jyumaefscl = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f30886jyumaefscl, gxszxtbevoVar);
            iobyxmoadgVar.f30887yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f30888zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) this.f30887yggfygwlhe;
                C0641ppxfxbqfkf c0641ppxfxbqfkf = new C0641ppxfxbqfkf(((d8.ppxfxbqfkf) this.f30886jyumaefscl).iobyxmoadg(eablkybsjg.iobyxmoadg(new C0640iobyxmoadg(zdlpuopuiuVar), new zoijcleaow(zdlpuopuiuVar))));
                this.f30888zdlpuopuiu = 1;
                if (oxmwwwfdhm.iobyxmoadg(zdlpuopuiuVar, c0641ppxfxbqfkf, this) == objGxszxtbevo) {
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
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zdlpuopuiu zdlpuopuiuVar, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final lqeggnwhkg iobyxmoadg(d8.ppxfxbqfkf ppxfxbqfkfVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        return dxjokdxxww.eablkybsjg(new iobyxmoadg(ppxfxbqfkfVar, null));
    }
}
