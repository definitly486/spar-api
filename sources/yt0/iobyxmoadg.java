package yt0;

import au0.CreateOrUpdateDeliveryAddressResponse;
import au0.GetAddressesResponseDto;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.components.address.api.model.UserAddress;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import zt0.CreateOrUpdateDeliveryAddressRequest;
import zt0.CreatePickUpAddressRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements ut0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wt0.iobyxmoadg f126412iobyxmoadg;

    /* JADX INFO: renamed from: yt0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3222iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f126413jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f126415zdlpuopuiu;

        C3222iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f126415zdlpuopuiu = obj;
            this.f126413jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f126416jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f126418zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f126418zdlpuopuiu = obj;
            this.f126416jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f126419jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f126421zdlpuopuiu;

        wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f126421zdlpuopuiu = obj;
            this.f126419jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f126422jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f126424zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f126424zdlpuopuiu = obj;
            this.f126422jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, this);
        }
    }

    public iobyxmoadg(wt0.iobyxmoadg addressApiService) {
        zdlpuopuiu.btonecajqb(addressApiService, "addressApiService");
        this.f126412iobyxmoadg = addressApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ut0.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f126419jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f126419jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objIobyxmoadg = wkgbmnqykcVar.f126421zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f126419jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            wt0.iobyxmoadg iobyxmoadgVar = this.f126412iobyxmoadg;
            wkgbmnqykcVar.f126419jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(wkgbmnqykcVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return xt0.zoijcleaow.ppxfxbqfkf((GetAddressesResponseDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ut0.iobyxmoadg
    public Object ppxfxbqfkf(String str, String str2, gxszxtbevo gxszxtbevoVar) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f126416jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f126416jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f126418zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f126416jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            wt0.iobyxmoadg iobyxmoadgVar = this.f126412iobyxmoadg;
            ppxfxbqfkfVar.f126416jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(str, str2, ppxfxbqfkfVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ut0.iobyxmoadg
    public Object wkgbmnqykc(UserAddress.Delivery delivery, gxszxtbevo gxszxtbevoVar) {
        C3222iobyxmoadg c3222iobyxmoadg;
        if (gxszxtbevoVar instanceof C3222iobyxmoadg) {
            c3222iobyxmoadg = (C3222iobyxmoadg) gxszxtbevoVar;
            int i13 = c3222iobyxmoadg.f126413jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3222iobyxmoadg.f126413jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c3222iobyxmoadg = new C3222iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c3222iobyxmoadg = new C3222iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c3222iobyxmoadg.f126415zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c3222iobyxmoadg.f126413jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            wt0.iobyxmoadg iobyxmoadgVar = this.f126412iobyxmoadg;
            CreateOrUpdateDeliveryAddressRequest createOrUpdateDeliveryAddressRequestIobyxmoadg = xt0.iobyxmoadg.iobyxmoadg(delivery);
            c3222iobyxmoadg.f126413jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(createOrUpdateDeliveryAddressRequestIobyxmoadg, c3222iobyxmoadg);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return ((CreateOrUpdateDeliveryAddressResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objPpxfxbqfkf, null, 1, null)).getId();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ut0.iobyxmoadg
    public Object zoijcleaow(String str, gxszxtbevo gxszxtbevoVar) throws Throwable {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f126422jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f126422jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = zoijcleaowVar.f126424zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f126422jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            wt0.iobyxmoadg iobyxmoadgVar = this.f126412iobyxmoadg;
            CreatePickUpAddressRequest createPickUpAddressRequest = new CreatePickUpAddressRequest(str);
            zoijcleaowVar.f126422jyumaefscl = 1;
            objWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc(createPickUpAddressRequest, zoijcleaowVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objWkgbmnqykc, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
