package c00;

import ru.myspar.core.network.model.BasicResponse;
import uy.PromotionRequest;
import uz.PromotionDto;

/* JADX INFO: loaded from: classes4.dex */
public final class oxmwwwfdhm implements w10.draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.btonecajqb f18155iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final oy.dxjokdxxww f18156zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18157iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18159yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18160zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18159yggfygwlhe = obj;
            this.f18157iwizpuwonk |= Integer.MIN_VALUE;
            return oxmwwwfdhm.this.iobyxmoadg(false, null, this);
        }
    }

    public oxmwwwfdhm(ay.btonecajqb promoApiService, oy.dxjokdxxww mapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoApiService, "promoApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mapper, "mapper");
        this.f18155iobyxmoadg = promoApiService;
        this.f18156zoijcleaow = mapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.draadjrbmk
    public Object iobyxmoadg(boolean z13, String str, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        oxmwwwfdhm oxmwwwfdhmVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f18157iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f18157iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f18159yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f18157iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ay.btonecajqb btonecajqbVar = this.f18155iobyxmoadg;
            PromotionRequest promotionRequest = new PromotionRequest(z13, str);
            iobyxmoadgVar.f18160zdlpuopuiu = this;
            iobyxmoadgVar.f18157iwizpuwonk = 1;
            objZoijcleaow = btonecajqbVar.zoijcleaow(promotionRequest, iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            oxmwwwfdhmVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oxmwwwfdhmVar = (oxmwwwfdhm) iobyxmoadgVar.f18160zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return oxmwwwfdhmVar.f18156zoijcleaow.iobyxmoadg((PromotionDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
