package p82;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o40.eablkybsjg;
import q82.ChangeCustomizableParametersRequest;
import q82.SubscriptionDetailRequest;
import q82.SubscriptionOrderIdRequest;
import q82.UpdateAutoRenewalSubscriptionParams;
import q82.UpdateAutoRenewalSubscriptionRequest;
import r82.SubscriptionOrderDto;
import ru.myspar.core.network.model.BasicResponse;
import s82.SubscriptionDetailDto;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements l82.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final n82.iobyxmoadg f76009iobyxmoadg;

    /* JADX INFO: renamed from: p82.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1676iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f76010jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f76012zdlpuopuiu;

        C1676iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f76012zdlpuopuiu = obj;
            this.f76010jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f76013jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f76015zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f76015zdlpuopuiu = obj;
            this.f76013jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f76016jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f76018zdlpuopuiu;

        wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f76018zdlpuopuiu = obj;
            this.f76016jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, false, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f76019jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f76021zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f76021zdlpuopuiu = obj;
            this.f76019jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, null, null, this);
        }
    }

    public iobyxmoadg(n82.iobyxmoadg subscriptionApiService) {
        zdlpuopuiu.btonecajqb(subscriptionApiService, "subscriptionApiService");
        this.f76009iobyxmoadg = subscriptionApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l82.iobyxmoadg
    public Object iobyxmoadg(String str, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f76013jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f76013jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f76015zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f76013jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            SubscriptionDetailRequest subscriptionDetailRequest = new SubscriptionDetailRequest(str);
            n82.iobyxmoadg iobyxmoadgVar = this.f76009iobyxmoadg;
            ppxfxbqfkfVar.f76013jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(subscriptionDetailRequest, ppxfxbqfkfVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return o82.iobyxmoadg.gxszxtbevo((SubscriptionDetailDto) eablkybsjg.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l82.iobyxmoadg
    public Object ppxfxbqfkf(Map map, String str, gxszxtbevo gxszxtbevoVar) {
        C1676iobyxmoadg c1676iobyxmoadg;
        if (gxszxtbevoVar instanceof C1676iobyxmoadg) {
            c1676iobyxmoadg = (C1676iobyxmoadg) gxszxtbevoVar;
            int i13 = c1676iobyxmoadg.f76010jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1676iobyxmoadg.f76010jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1676iobyxmoadg = new C1676iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1676iobyxmoadg = new C1676iobyxmoadg(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = c1676iobyxmoadg.f76012zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1676iobyxmoadg.f76010jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new ChangeCustomizableParametersRequest.Param((String) entry.getKey(), (String) entry.getValue()));
            }
            ChangeCustomizableParametersRequest changeCustomizableParametersRequest = new ChangeCustomizableParametersRequest(arrayList, str);
            n82.iobyxmoadg iobyxmoadgVar = this.f76009iobyxmoadg;
            c1676iobyxmoadg.f76010jyumaefscl = 1;
            objWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc(changeCustomizableParametersRequest, c1676iobyxmoadg);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        return o82.iobyxmoadg.gxszxtbevo((SubscriptionDetailDto) eablkybsjg.agtfadlqog((BasicResponse) objWkgbmnqykc, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l82.iobyxmoadg
    public Object wkgbmnqykc(String str, boolean z13, gxszxtbevo gxszxtbevoVar) throws Throwable {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f76016jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f76016jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objIobyxmoadg = wkgbmnqykcVar.f76018zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f76016jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            UpdateAutoRenewalSubscriptionRequest updateAutoRenewalSubscriptionRequest = new UpdateAutoRenewalSubscriptionRequest(jyumaefscl.eablkybsjg(new UpdateAutoRenewalSubscriptionParams(str, z13)));
            n82.iobyxmoadg iobyxmoadgVar = this.f76009iobyxmoadg;
            wkgbmnqykcVar.f76016jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(updateAutoRenewalSubscriptionRequest, wkgbmnqykcVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        eablkybsjg.rgvfuqvkyq((BasicResponse) objIobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l82.iobyxmoadg
    public Object zoijcleaow(String str, String str2, String str3, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f76019jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f76019jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f76021zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f76019jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            SubscriptionOrderIdRequest subscriptionOrderIdRequest = new SubscriptionOrderIdRequest(str, str2, str3);
            n82.iobyxmoadg iobyxmoadgVar = this.f76009iobyxmoadg;
            zoijcleaowVar.f76019jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(subscriptionOrderIdRequest, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        SubscriptionOrderDto subscriptionOrderDto = (SubscriptionOrderDto) eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null);
        return new k82.iobyxmoadg(subscriptionOrderDto.getId(), subscriptionOrderDto.getNeedVerify());
    }
}
