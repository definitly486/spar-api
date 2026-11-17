package zu0;

import bv0.GetOrderPaymentInfoRequest;
import bv0.OrderSuccessPaymentRequest;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import wu0.wkgbmnqykc;
import ww0.gxszxtbevo;
import xx0.OrderPaymentsRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f131382iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final av0.iobyxmoadg f131383ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final av0.zoijcleaow f131384zoijcleaow;

    /* JADX INFO: renamed from: zu0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3355iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f131385jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f131387zdlpuopuiu;

        C3355iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f131387zdlpuopuiu = obj;
            this.f131385jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, null, null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f131388jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f131390zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f131390zdlpuopuiu = obj;
            this.f131388jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f131391iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f131393yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f131394zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f131393yggfygwlhe = obj;
            this.f131391iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    public iobyxmoadg(gxszxtbevo orderApiService, av0.zoijcleaow paymentApiService, av0.iobyxmoadg getPaymentInfoResponseMapper) {
        zdlpuopuiu.btonecajqb(orderApiService, "orderApiService");
        zdlpuopuiu.btonecajqb(paymentApiService, "paymentApiService");
        zdlpuopuiu.btonecajqb(getPaymentInfoResponseMapper, "getPaymentInfoResponseMapper");
        this.f131382iobyxmoadg = orderApiService;
        this.f131384zoijcleaow = paymentApiService;
        this.f131383ppxfxbqfkf = getPaymentInfoResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // wu0.wkgbmnqykc
    public Object iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f131388jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f131388jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f131390zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f131388jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            av0.zoijcleaow zoijcleaowVar = this.f131384zoijcleaow;
            OrderSuccessPaymentRequest orderSuccessPaymentRequest = new OrderSuccessPaymentRequest(str);
            ppxfxbqfkfVar.f131388jyumaefscl = 1;
            objIobyxmoadg = zoijcleaowVar.iobyxmoadg(orderSuccessPaymentRequest, ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // wu0.wkgbmnqykc
    public Object ppxfxbqfkf(String str, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f131391iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f131391iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f131393yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f131391iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            av0.zoijcleaow zoijcleaowVar2 = this.f131384zoijcleaow;
            GetOrderPaymentInfoRequest getOrderPaymentInfoRequest = new GetOrderPaymentInfoRequest(str);
            zoijcleaowVar.f131394zdlpuopuiu = this;
            zoijcleaowVar.f131391iwizpuwonk = 1;
            objZoijcleaow = zoijcleaowVar2.zoijcleaow(getOrderPaymentInfoRequest, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f131394zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return iobyxmoadgVar.f131383ppxfxbqfkf.invoke(x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // wu0.wkgbmnqykc
    public Object zoijcleaow(String str, String str2, String str3, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        C3355iobyxmoadg c3355iobyxmoadg;
        if (gxszxtbevoVar instanceof C3355iobyxmoadg) {
            c3355iobyxmoadg = (C3355iobyxmoadg) gxszxtbevoVar;
            int i13 = c3355iobyxmoadg.f131385jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3355iobyxmoadg.f131385jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c3355iobyxmoadg = new C3355iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c3355iobyxmoadg = new C3355iobyxmoadg(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = c3355iobyxmoadg.f131387zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c3355iobyxmoadg.f131385jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            OrderPaymentsRequest orderPaymentsRequest = new OrderPaymentsRequest(str, str2, str3);
            gxszxtbevo gxszxtbevoVar2 = this.f131382iobyxmoadg;
            c3355iobyxmoadg.f131385jyumaefscl = 1;
            objNufgyqmvbu = gxszxtbevoVar2.nufgyqmvbu(orderPaymentsRequest, c3355iobyxmoadg);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objNufgyqmvbu, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
