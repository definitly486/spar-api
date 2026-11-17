package c00;

import pz.CouponGroupsDto;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww implements w10.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.draadjrbmk f17896iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final oy.ppxfxbqfkf f17897zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f17898iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f17900yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17901zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17900yggfygwlhe = obj;
            this.f17898iwizpuwonk |= Integer.MIN_VALUE;
            return dxjokdxxww.this.iobyxmoadg(this);
        }
    }

    public dxjokdxxww(ay.draadjrbmk pushApiService, oy.ppxfxbqfkf couponResponseMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pushApiService, "pushApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(couponResponseMapper, "couponResponseMapper");
        this.f17896iobyxmoadg = pushApiService;
        this.f17897zoijcleaow = couponResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.eablkybsjg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        dxjokdxxww dxjokdxxwwVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f17898iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f17898iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f17900yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f17898iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ay.draadjrbmk draadjrbmkVar = this.f17896iobyxmoadg;
            iobyxmoadgVar.f17901zdlpuopuiu = this;
            iobyxmoadgVar.f17898iwizpuwonk = 1;
            objPpxfxbqfkf = draadjrbmkVar.ppxfxbqfkf(iobyxmoadgVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            dxjokdxxwwVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dxjokdxxwwVar = (dxjokdxxww) iobyxmoadgVar.f17901zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return dxjokdxxwwVar.f17897zoijcleaow.iobyxmoadg((CouponGroupsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }
}
