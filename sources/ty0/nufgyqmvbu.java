package ty0;

import hy0.CouponGroupsDto;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu implements k01.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.gtknphoqwx f112003iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jx0.ppxfxbqfkf f112004zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112005iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112007yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112008zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112007yggfygwlhe = obj;
            this.f112005iwizpuwonk |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.iobyxmoadg(this);
        }
    }

    public nufgyqmvbu(ww0.gtknphoqwx pushApiService, jx0.ppxfxbqfkf couponResponseMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pushApiService, "pushApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(couponResponseMapper, "couponResponseMapper");
        this.f112003iobyxmoadg = pushApiService;
        this.f112004zoijcleaow = couponResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.eablkybsjg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f112005iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f112005iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f112007yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f112005iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ww0.gtknphoqwx gtknphoqwxVar = this.f112003iobyxmoadg;
            iobyxmoadgVar.f112008zdlpuopuiu = this;
            iobyxmoadgVar.f112005iwizpuwonk = 1;
            objPpxfxbqfkf = gtknphoqwxVar.ppxfxbqfkf(iobyxmoadgVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            nufgyqmvbuVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nufgyqmvbuVar = (nufgyqmvbu) iobyxmoadgVar.f112008zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return nufgyqmvbuVar.f112004zoijcleaow.iobyxmoadg((CouponGroupsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }
}
