package fw;

import ay.lqeggnwhkg;
import cw.wkgbmnqykc;
import ez.OrderPaymentsRequest;
import gg.wwaezpbzkn;
import hw.GetOrderPaymentInfoRequest;
import hw.OrderSuccessPaymentRequest;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o40.eablkybsjg;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg f35197iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gw.iobyxmoadg f35198ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gw.zoijcleaow f35199zoijcleaow;

    /* JADX INFO: renamed from: fw.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0785iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f35200jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f35202zdlpuopuiu;

        C0785iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f35202zdlpuopuiu = obj;
            this.f35200jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, null, null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f35203jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f35205zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f35205zdlpuopuiu = obj;
            this.f35203jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f35206iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f35208yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f35209zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f35208yggfygwlhe = obj;
            this.f35206iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    public iobyxmoadg(lqeggnwhkg orderApiService, gw.zoijcleaow paymentApiService, gw.iobyxmoadg getPaymentInfoResponseMapper) {
        zdlpuopuiu.btonecajqb(orderApiService, "orderApiService");
        zdlpuopuiu.btonecajqb(paymentApiService, "paymentApiService");
        zdlpuopuiu.btonecajqb(getPaymentInfoResponseMapper, "getPaymentInfoResponseMapper");
        this.f35197iobyxmoadg = orderApiService;
        this.f35199zoijcleaow = paymentApiService;
        this.f35198ppxfxbqfkf = getPaymentInfoResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // cw.wkgbmnqykc
    public Object iobyxmoadg(String str, gxszxtbevo gxszxtbevoVar) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f35203jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f35203jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f35205zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f35203jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            gw.zoijcleaow zoijcleaowVar = this.f35199zoijcleaow;
            OrderSuccessPaymentRequest orderSuccessPaymentRequest = new OrderSuccessPaymentRequest(str);
            ppxfxbqfkfVar.f35203jyumaefscl = 1;
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
        eablkybsjg.btonecajqb((BasicResponse) objIobyxmoadg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // cw.wkgbmnqykc
    public Object ppxfxbqfkf(String str, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f35206iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f35206iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f35208yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f35206iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            gw.zoijcleaow zoijcleaowVar2 = this.f35199zoijcleaow;
            GetOrderPaymentInfoRequest getOrderPaymentInfoRequest = new GetOrderPaymentInfoRequest(str);
            zoijcleaowVar.f35209zdlpuopuiu = this;
            zoijcleaowVar.f35206iwizpuwonk = 1;
            objZoijcleaow = zoijcleaowVar2.zoijcleaow(getOrderPaymentInfoRequest, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f35209zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return iobyxmoadgVar.f35198ppxfxbqfkf.invoke(eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // cw.wkgbmnqykc
    public Object zoijcleaow(String str, String str2, String str3, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C0785iobyxmoadg c0785iobyxmoadg;
        if (gxszxtbevoVar instanceof C0785iobyxmoadg) {
            c0785iobyxmoadg = (C0785iobyxmoadg) gxszxtbevoVar;
            int i13 = c0785iobyxmoadg.f35200jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0785iobyxmoadg.f35200jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0785iobyxmoadg = new C0785iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0785iobyxmoadg = new C0785iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c0785iobyxmoadg.f35202zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0785iobyxmoadg.f35200jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            OrderPaymentsRequest orderPaymentsRequest = new OrderPaymentsRequest(str, str2, str3);
            lqeggnwhkg lqeggnwhkgVar = this.f35197iobyxmoadg;
            c0785iobyxmoadg.f35200jyumaefscl = 1;
            objIobyxmoadg = lqeggnwhkgVar.iobyxmoadg(orderPaymentsRequest, c0785iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        eablkybsjg.btonecajqb((BasicResponse) objIobyxmoadg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
