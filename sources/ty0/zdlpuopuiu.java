package ty0;

import py0.RestaurantDetailsDto;
import py0.RestaurantProductDetailsDto;
import py0.RestaurantsDto;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import wx0.GetRestaurantInfoRequest;
import wx0.GetRestaurantProductRequest;
import wx0.GetRestaurantsRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class zdlpuopuiu implements k01.ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.nufgyqmvbu f112158iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jx0.wflxmlrfwp f112159zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112160iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112162yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112163zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112162yggfygwlhe = obj;
            this.f112160iwizpuwonk |= Integer.MIN_VALUE;
            return zdlpuopuiu.this.zoijcleaow(null, null, 0, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112164iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112166yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112167zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112166yggfygwlhe = obj;
            this.f112164iwizpuwonk |= Integer.MIN_VALUE;
            return zdlpuopuiu.this.ppxfxbqfkf(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112168iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112170yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112171zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112170yggfygwlhe = obj;
            this.f112168iwizpuwonk |= Integer.MIN_VALUE;
            return zdlpuopuiu.this.iobyxmoadg(null, null, this);
        }
    }

    public zdlpuopuiu(ww0.nufgyqmvbu partnerApiService, jx0.wflxmlrfwp restaurantResponseMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(partnerApiService, "partnerApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(restaurantResponseMapper, "restaurantResponseMapper");
        this.f112158iobyxmoadg = partnerApiService;
        this.f112159zoijcleaow = restaurantResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.ojitshcjhn
    public Object iobyxmoadg(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        zdlpuopuiu zdlpuopuiuVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f112168iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f112168iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = zoijcleaowVar.f112170yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f112168iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ww0.nufgyqmvbu nufgyqmvbuVar = this.f112158iobyxmoadg;
            GetRestaurantProductRequest getRestaurantProductRequest = new GetRestaurantProductRequest(str, str2);
            zoijcleaowVar.f112171zdlpuopuiu = this;
            zoijcleaowVar.f112168iwizpuwonk = 1;
            objPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf(getRestaurantProductRequest, zoijcleaowVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zdlpuopuiuVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiuVar = (zdlpuopuiu) zoijcleaowVar.f112171zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return zdlpuopuiuVar.f112159zoijcleaow.ppxfxbqfkf((RestaurantProductDetailsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.ojitshcjhn
    public Object ppxfxbqfkf(gz0.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        zdlpuopuiu zdlpuopuiuVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f112164iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f112164iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f112166yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f112164iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ww0.nufgyqmvbu nufgyqmvbuVar = this.f112158iobyxmoadg;
            GetRestaurantsRequest getRestaurantsRequest = new GetRestaurantsRequest(lqeggnwhkgVar.wkgbmnqykc());
            ppxfxbqfkfVar.f112167zdlpuopuiu = this;
            ppxfxbqfkfVar.f112164iwizpuwonk = 1;
            objIobyxmoadg = nufgyqmvbuVar.iobyxmoadg(getRestaurantsRequest, ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zdlpuopuiuVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiuVar = (zdlpuopuiu) ppxfxbqfkfVar.f112167zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return zdlpuopuiuVar.f112159zoijcleaow.iobyxmoadg((RestaurantsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.ojitshcjhn
    public Object zoijcleaow(String str, String str2, int i13, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        zdlpuopuiu zdlpuopuiuVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i14 = iobyxmoadgVar.f112160iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f112160iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f112162yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = iobyxmoadgVar.f112160iwizpuwonk;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ww0.nufgyqmvbu nufgyqmvbuVar = this.f112158iobyxmoadg;
            GetRestaurantInfoRequest getRestaurantInfoRequest = new GetRestaurantInfoRequest(str, str2, i13);
            iobyxmoadgVar.f112163zdlpuopuiu = this;
            iobyxmoadgVar.f112160iwizpuwonk = 1;
            objZoijcleaow = nufgyqmvbuVar.zoijcleaow(getRestaurantInfoRequest, iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zdlpuopuiuVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiuVar = (zdlpuopuiu) iobyxmoadgVar.f112163zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return zdlpuopuiuVar.f112159zoijcleaow.zoijcleaow((RestaurantDetailsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
