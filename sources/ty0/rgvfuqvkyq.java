package ty0;

import my0.PromotionDto;
import px0.PromotionRequest;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class rgvfuqvkyq implements k01.draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.dxjokdxxww f112030iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jx0.dxjokdxxww f112031zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112032iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112034yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112035zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112034yggfygwlhe = obj;
            this.f112032iwizpuwonk |= Integer.MIN_VALUE;
            return rgvfuqvkyq.this.iobyxmoadg(false, null, this);
        }
    }

    public rgvfuqvkyq(ww0.dxjokdxxww promoApiService, jx0.dxjokdxxww mapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoApiService, "promoApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mapper, "mapper");
        this.f112030iobyxmoadg = promoApiService;
        this.f112031zoijcleaow = mapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.draadjrbmk
    public Object iobyxmoadg(boolean z13, String str, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        rgvfuqvkyq rgvfuqvkyqVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f112032iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f112032iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f112034yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f112032iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ww0.dxjokdxxww dxjokdxxwwVar = this.f112030iobyxmoadg;
            PromotionRequest promotionRequest = new PromotionRequest(z13, str);
            iobyxmoadgVar.f112035zdlpuopuiu = this;
            iobyxmoadgVar.f112032iwizpuwonk = 1;
            objZoijcleaow = dxjokdxxwwVar.zoijcleaow(promotionRequest, iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            rgvfuqvkyqVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rgvfuqvkyqVar = (rgvfuqvkyq) iobyxmoadgVar.f112035zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return rgvfuqvkyqVar.f112031zoijcleaow.iobyxmoadg((PromotionDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
