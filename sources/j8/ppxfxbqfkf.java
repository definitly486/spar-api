package j8;

import com.bumptech.glide.agtfadlqog;
import com.bumptech.glide.wflxmlrfwp;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.jyumaefscl;
import rj.oxmwwwfdhm;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f50848cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ wflxmlrfwp f50849iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f50850jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f50851yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f50852zdlpuopuiu;

        /* JADX INFO: renamed from: j8.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1093iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f50853yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f50854zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1093iobyxmoadg(agtfadlqog agtfadlqogVar, zoijcleaow zoijcleaowVar) {
                super(0);
                this.f50854zdlpuopuiu = agtfadlqogVar;
                this.f50853yggfygwlhe = zoijcleaowVar;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                this.f50854zdlpuopuiu.draadjrbmk(this.f50853yggfygwlhe);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, wflxmlrfwp wflxmlrfwpVar, agtfadlqog agtfadlqogVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f50850jyumaefscl = lqeggnwhkgVar;
            this.f50849iwizpuwonk = wflxmlrfwpVar;
            this.f50848cqumvgiudr = agtfadlqogVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f50850jyumaefscl, this.f50849iwizpuwonk, this.f50848cqumvgiudr, gxszxtbevoVar);
            iobyxmoadgVar.f50851yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f50852zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rj.zdlpuopuiu zdlpuopuiuVar = (rj.zdlpuopuiu) this.f50851yggfygwlhe;
                zoijcleaow zoijcleaowVar = new zoijcleaow(zdlpuopuiuVar, this.f50850jyumaefscl);
                com.bumptech.glide.lqeggnwhkg.zoijcleaow(this.f50849iwizpuwonk, zoijcleaowVar);
                C1093iobyxmoadg c1093iobyxmoadg = new C1093iobyxmoadg(this.f50848cqumvgiudr, zoijcleaowVar);
                this.f50852zdlpuopuiu = 1;
                if (oxmwwwfdhm.iobyxmoadg(zdlpuopuiuVar, c1093iobyxmoadg, this) == objGxszxtbevo) {
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
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private static final sj.lqeggnwhkg iobyxmoadg(wflxmlrfwp wflxmlrfwpVar, lqeggnwhkg lqeggnwhkgVar) {
        return sj.dxjokdxxww.eablkybsjg(new iobyxmoadg(lqeggnwhkgVar, wflxmlrfwpVar, com.bumptech.glide.lqeggnwhkg.wkgbmnqykc(wflxmlrfwpVar), null));
    }

    public static final boolean ppxfxbqfkf(int i13) {
        return g9.draadjrbmk.kcexrzcfyt(i13);
    }

    public static final sj.lqeggnwhkg zoijcleaow(wflxmlrfwp wflxmlrfwpVar, lqeggnwhkg size) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wflxmlrfwpVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(size, "size");
        return iobyxmoadg(wflxmlrfwpVar, size);
    }
}
