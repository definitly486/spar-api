package m6;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.jyumaefscl;
import p6.yggfygwlhe;
import rj.oxmwwwfdhm;
import rj.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final n6.nufgyqmvbu f65282iobyxmoadg;

    /* JADX INFO: renamed from: m6.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1361iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f65284yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f65285zdlpuopuiu;

        /* JADX INFO: renamed from: m6.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1362iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f65286yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f65287zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1362iobyxmoadg(iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar) {
                super(0);
                this.f65287zdlpuopuiu = iobyxmoadgVar;
                this.f65286yggfygwlhe = zoijcleaowVar;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                this.f65287zdlpuopuiu.f65282iobyxmoadg.gxszxtbevo(this.f65286yggfygwlhe);
            }
        }

        /* JADX INFO: renamed from: m6.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements l6.iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f65288iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f65289zoijcleaow;

            zoijcleaow(iobyxmoadg iobyxmoadgVar, zdlpuopuiu zdlpuopuiuVar) {
                this.f65288iobyxmoadg = iobyxmoadgVar;
                this.f65289zoijcleaow = zdlpuopuiuVar;
            }

            @Override // l6.iobyxmoadg
            public void iobyxmoadg(Object obj) {
                this.f65289zoijcleaow.kcexrzcfyt().eablkybsjg(this.f65288iobyxmoadg.gxszxtbevo(obj) ? new l6.zoijcleaow.C1248zoijcleaow(this.f65288iobyxmoadg.eablkybsjg()) : l6.zoijcleaow.iobyxmoadg.f61690iobyxmoadg);
            }
        }

        C1361iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            C1361iobyxmoadg c1361iobyxmoadg = iobyxmoadg.this.new C1361iobyxmoadg(gxszxtbevoVar);
            c1361iobyxmoadg.f65284yggfygwlhe = obj;
            return c1361iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f65285zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) this.f65284yggfygwlhe;
                zoijcleaow zoijcleaowVar = new zoijcleaow(iobyxmoadg.this, zdlpuopuiuVar);
                iobyxmoadg.this.f65282iobyxmoadg.ppxfxbqfkf(zoijcleaowVar);
                C1362iobyxmoadg c1362iobyxmoadg = new C1362iobyxmoadg(iobyxmoadg.this, zoijcleaowVar);
                this.f65285zdlpuopuiu = 1;
                if (oxmwwwfdhm.iobyxmoadg(zdlpuopuiuVar, c1362iobyxmoadg, this) == objGxszxtbevo) {
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
        public final Object invoke(zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1361iobyxmoadg) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public iobyxmoadg(n6.nufgyqmvbu tracker) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tracker, "tracker");
        this.f65282iobyxmoadg = tracker;
    }

    protected abstract int eablkybsjg();

    protected abstract boolean gxszxtbevo(Object obj);

    @Override // m6.wkgbmnqykc
    public boolean ppxfxbqfkf(yggfygwlhe workSpec) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpec, "workSpec");
        return iobyxmoadg(workSpec) && gxszxtbevo(this.f65282iobyxmoadg.eablkybsjg());
    }

    @Override // m6.wkgbmnqykc
    public sj.lqeggnwhkg zoijcleaow(g6.wkgbmnqykc constraints) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constraints, "constraints");
        return sj.dxjokdxxww.eablkybsjg(new C1361iobyxmoadg(null));
    }
}
