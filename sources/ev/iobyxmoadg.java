package ev;

import fv.CreateOrUpdateDeliveryAddressRequest;
import fv.CreatePickUpAddressRequest;
import gg.wwaezpbzkn;
import gv.CreateOrUpdateDeliveryAddressResponse;
import gv.GetAddressesResponseDto;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o40.eablkybsjg;
import ru.myspar.components.address.api.model.UserAddress;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements av.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cv.iobyxmoadg f32061iobyxmoadg;

    /* JADX INFO: renamed from: ev.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0693iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f32062jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f32064zdlpuopuiu;

        C0693iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32064zdlpuopuiu = obj;
            this.f32062jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f32065jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f32067zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32067zdlpuopuiu = obj;
            this.f32065jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f32068jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f32070zdlpuopuiu;

        wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32070zdlpuopuiu = obj;
            this.f32068jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f32071jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f32073zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32073zdlpuopuiu = obj;
            this.f32071jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, this);
        }
    }

    public iobyxmoadg(cv.iobyxmoadg addressApiService) {
        zdlpuopuiu.btonecajqb(addressApiService, "addressApiService");
        this.f32061iobyxmoadg = addressApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // av.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f32068jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f32068jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objIobyxmoadg = wkgbmnqykcVar.f32070zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f32068jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            cv.iobyxmoadg iobyxmoadgVar = this.f32061iobyxmoadg;
            wkgbmnqykcVar.f32068jyumaefscl = 1;
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
        return dv.zoijcleaow.ppxfxbqfkf((GetAddressesResponseDto) eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // av.iobyxmoadg
    public Object ppxfxbqfkf(String str, String str2, gxszxtbevo gxszxtbevoVar) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f32065jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f32065jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f32067zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f32065jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            cv.iobyxmoadg iobyxmoadgVar = this.f32061iobyxmoadg;
            ppxfxbqfkfVar.f32065jyumaefscl = 1;
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
        eablkybsjg.btonecajqb((BasicResponse) objZoijcleaow, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // av.iobyxmoadg
    public Object wkgbmnqykc(UserAddress.Delivery delivery, gxszxtbevo gxszxtbevoVar) {
        C0693iobyxmoadg c0693iobyxmoadg;
        if (gxszxtbevoVar instanceof C0693iobyxmoadg) {
            c0693iobyxmoadg = (C0693iobyxmoadg) gxszxtbevoVar;
            int i13 = c0693iobyxmoadg.f32062jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0693iobyxmoadg.f32062jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0693iobyxmoadg = new C0693iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0693iobyxmoadg = new C0693iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c0693iobyxmoadg.f32064zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0693iobyxmoadg.f32062jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            cv.iobyxmoadg iobyxmoadgVar = this.f32061iobyxmoadg;
            CreateOrUpdateDeliveryAddressRequest createOrUpdateDeliveryAddressRequestIobyxmoadg = dv.iobyxmoadg.iobyxmoadg(delivery);
            c0693iobyxmoadg.f32062jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(createOrUpdateDeliveryAddressRequestIobyxmoadg, c0693iobyxmoadg);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return ((CreateOrUpdateDeliveryAddressResponse) eablkybsjg.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null)).getId();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // av.iobyxmoadg
    public Object zoijcleaow(String str, gxszxtbevo gxszxtbevoVar) throws Throwable {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f32071jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f32071jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = zoijcleaowVar.f32073zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f32071jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            cv.iobyxmoadg iobyxmoadgVar = this.f32061iobyxmoadg;
            CreatePickUpAddressRequest createPickUpAddressRequest = new CreatePickUpAddressRequest(str);
            zoijcleaowVar.f32071jyumaefscl = 1;
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
        eablkybsjg.btonecajqb((BasicResponse) objWkgbmnqykc, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
