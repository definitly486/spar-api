package g2;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements d2.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final d2.eablkybsjg f35843iobyxmoadg;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f35844jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f35845yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f35846zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f35844jyumaefscl = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f35844jyumaefscl, gxszxtbevoVar);
            iobyxmoadgVar.f35845yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f35846zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f35845yggfygwlhe;
                rgvfuqvkyq rgvfuqvkyqVar = this.f35844jyumaefscl;
                this.f35846zdlpuopuiu = 1;
                obj = rgvfuqvkyqVar.invoke(wkgbmnqykcVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            wkgbmnqykc wkgbmnqykcVar2 = (wkgbmnqykc) obj;
            ((g2.iobyxmoadg) wkgbmnqykcVar2).gxszxtbevo();
            return wkgbmnqykcVar2;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(wkgbmnqykcVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public zoijcleaow(d2.eablkybsjg delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f35843iobyxmoadg = delegate;
    }

    @Override // d2.eablkybsjg
    public sj.lqeggnwhkg getData() {
        return this.f35843iobyxmoadg.getData();
    }

    @Override // d2.eablkybsjg
    public Object iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f35843iobyxmoadg.iobyxmoadg(new iobyxmoadg(rgvfuqvkyqVar, null), gxszxtbevoVar);
    }
}
