package tj;

import gg.wwaezpbzkn;
import uj.pkzmftpjix;

/* JADX INFO: loaded from: classes3.dex */
final class zynmafqrjb implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.rgvfuqvkyq f110718jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f110719yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lg.btonecajqb f110720zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ sj.nufgyqmvbu f110721jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f110722yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f110723zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f110721jyumaefscl = nufgyqmvbuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f110721jyumaefscl, gxszxtbevoVar);
            iobyxmoadgVar.f110722yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f110723zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                Object obj2 = this.f110722yggfygwlhe;
                sj.nufgyqmvbu nufgyqmvbuVar = this.f110721jyumaefscl;
                this.f110723zdlpuopuiu = 1;
                if (nufgyqmvbuVar.emit(obj2, this) == objGxszxtbevo) {
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
        public final Object invoke(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(obj, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public zynmafqrjb(sj.nufgyqmvbu nufgyqmvbuVar, lg.btonecajqb btonecajqbVar) {
        this.f110720zdlpuopuiu = btonecajqbVar;
        this.f110719yggfygwlhe = pkzmftpjix.lqeggnwhkg(btonecajqbVar);
        this.f110718jyumaefscl = new iobyxmoadg(nufgyqmvbuVar, null);
    }

    @Override // sj.nufgyqmvbu
    public Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = eablkybsjg.zoijcleaow(this.f110720zdlpuopuiu, obj, this.f110719yggfygwlhe, this.f110718jyumaefscl, gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
    }
}
