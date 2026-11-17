package c00;

import dz.GetRestaurantInfoRequest;
import dz.GetRestaurantProductRequest;
import dz.GetRestaurantsRequest;
import ru.myspar.core.network.model.BasicResponse;
import xz.RestaurantDetailsDto;
import xz.RestaurantProductDetailsDto;
import xz.RestaurantsDto;

/* JADX INFO: loaded from: classes4.dex */
public final class cqumvgiudr implements w10.ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.dxjokdxxww f17853iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final oy.wflxmlrfwp f17854zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f17855iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f17857yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17858zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17857yggfygwlhe = obj;
            this.f17855iwizpuwonk |= Integer.MIN_VALUE;
            return cqumvgiudr.this.zoijcleaow(null, null, 0, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f17859iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f17861yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17862zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17861yggfygwlhe = obj;
            this.f17859iwizpuwonk |= Integer.MIN_VALUE;
            return cqumvgiudr.this.ppxfxbqfkf(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f17863iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f17865yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17866zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17865yggfygwlhe = obj;
            this.f17863iwizpuwonk |= Integer.MIN_VALUE;
            return cqumvgiudr.this.iobyxmoadg(null, null, this);
        }
    }

    public cqumvgiudr(ay.dxjokdxxww partnerApiService, oy.wflxmlrfwp restaurantResponseMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(partnerApiService, "partnerApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(restaurantResponseMapper, "restaurantResponseMapper");
        this.f17853iobyxmoadg = partnerApiService;
        this.f17854zoijcleaow = restaurantResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.ojitshcjhn
    public Object iobyxmoadg(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        cqumvgiudr cqumvgiudrVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f17863iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f17863iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f17865yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f17863iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ay.dxjokdxxww dxjokdxxwwVar = this.f17853iobyxmoadg;
            GetRestaurantProductRequest getRestaurantProductRequest = new GetRestaurantProductRequest(str, str2);
            zoijcleaowVar.f17866zdlpuopuiu = this;
            zoijcleaowVar.f17863iwizpuwonk = 1;
            objIobyxmoadg = dxjokdxxwwVar.iobyxmoadg(getRestaurantProductRequest, zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            cqumvgiudrVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cqumvgiudrVar = (cqumvgiudr) zoijcleaowVar.f17866zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return cqumvgiudrVar.f17854zoijcleaow.ppxfxbqfkf((RestaurantProductDetailsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.ojitshcjhn
    public Object ppxfxbqfkf(o00.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        cqumvgiudr cqumvgiudrVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f17859iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f17859iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f17861yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f17859iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ay.dxjokdxxww dxjokdxxwwVar = this.f17853iobyxmoadg;
            GetRestaurantsRequest getRestaurantsRequest = new GetRestaurantsRequest(lqeggnwhkgVar.wkgbmnqykc());
            ppxfxbqfkfVar.f17862zdlpuopuiu = this;
            ppxfxbqfkfVar.f17859iwizpuwonk = 1;
            objPpxfxbqfkf = dxjokdxxwwVar.ppxfxbqfkf(getRestaurantsRequest, ppxfxbqfkfVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            cqumvgiudrVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cqumvgiudrVar = (cqumvgiudr) ppxfxbqfkfVar.f17862zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return cqumvgiudrVar.f17854zoijcleaow.iobyxmoadg((RestaurantsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.ojitshcjhn
    public Object zoijcleaow(String str, String str2, int i13, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        cqumvgiudr cqumvgiudrVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i14 = iobyxmoadgVar.f17855iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f17855iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f17857yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = iobyxmoadgVar.f17855iwizpuwonk;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ay.dxjokdxxww dxjokdxxwwVar = this.f17853iobyxmoadg;
            GetRestaurantInfoRequest getRestaurantInfoRequest = new GetRestaurantInfoRequest(str, str2, i13);
            iobyxmoadgVar.f17858zdlpuopuiu = this;
            iobyxmoadgVar.f17855iwizpuwonk = 1;
            objZoijcleaow = dxjokdxxwwVar.zoijcleaow(getRestaurantInfoRequest, iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            cqumvgiudrVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cqumvgiudrVar = (cqumvgiudr) iobyxmoadgVar.f17858zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return cqumvgiudrVar.f17854zoijcleaow.zoijcleaow((RestaurantDetailsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
