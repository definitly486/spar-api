package iu1;

import java.util.ArrayList;
import java.util.Map;
import ju1.ChangeCustomizableParametersRequest;
import ju1.SubscriptionDetailRequest;
import ju1.SubscriptionOrderIdRequest;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import ku1.SubscriptionOrderDto;
import lg.gxszxtbevo;
import lu1.SubscriptionDetailDto;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements eu1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gu1.iobyxmoadg f49640iobyxmoadg;

    /* JADX INFO: renamed from: iu1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1052iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49641jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49643zdlpuopuiu;

        C1052iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49643zdlpuopuiu = obj;
            this.f49641jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, null, this);
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49644jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49646zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49646zdlpuopuiu = obj;
            this.f49644jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49647jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49649zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49649zdlpuopuiu = obj;
            this.f49647jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, null, null, this);
        }
    }

    public iobyxmoadg(gu1.iobyxmoadg subscriptionApiService) {
        zdlpuopuiu.btonecajqb(subscriptionApiService, "subscriptionApiService");
        this.f49640iobyxmoadg = subscriptionApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // eu1.iobyxmoadg
    public Object iobyxmoadg(String str, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f49644jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f49644jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f49646zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f49644jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            SubscriptionDetailRequest subscriptionDetailRequest = new SubscriptionDetailRequest(str);
            gu1.iobyxmoadg iobyxmoadgVar = this.f49640iobyxmoadg;
            ppxfxbqfkfVar.f49644jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(subscriptionDetailRequest, ppxfxbqfkfVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return hu1.iobyxmoadg.gxszxtbevo((SubscriptionDetailDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // eu1.iobyxmoadg
    public Object ppxfxbqfkf(Map map, String str, gxszxtbevo gxszxtbevoVar) {
        C1052iobyxmoadg c1052iobyxmoadg;
        if (gxszxtbevoVar instanceof C1052iobyxmoadg) {
            c1052iobyxmoadg = (C1052iobyxmoadg) gxszxtbevoVar;
            int i13 = c1052iobyxmoadg.f49641jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1052iobyxmoadg.f49641jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1052iobyxmoadg = new C1052iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1052iobyxmoadg = new C1052iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c1052iobyxmoadg.f49643zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1052iobyxmoadg.f49641jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new ChangeCustomizableParametersRequest.Param((String) entry.getKey(), (String) entry.getValue()));
            }
            ChangeCustomizableParametersRequest changeCustomizableParametersRequest = new ChangeCustomizableParametersRequest(arrayList, str);
            gu1.iobyxmoadg iobyxmoadgVar = this.f49640iobyxmoadg;
            c1052iobyxmoadg.f49641jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(changeCustomizableParametersRequest, c1052iobyxmoadg);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return hu1.iobyxmoadg.gxszxtbevo((SubscriptionDetailDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // eu1.iobyxmoadg
    public Object zoijcleaow(String str, String str2, String str3, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f49647jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f49647jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f49649zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f49647jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            SubscriptionOrderIdRequest subscriptionOrderIdRequest = new SubscriptionOrderIdRequest(str, str2, str3);
            gu1.iobyxmoadg iobyxmoadgVar = this.f49640iobyxmoadg;
            zoijcleaowVar.f49647jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(subscriptionOrderIdRequest, zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        SubscriptionOrderDto subscriptionOrderDto = (SubscriptionOrderDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null);
        return new du1.iobyxmoadg(subscriptionOrderDto.getId(), subscriptionOrderDto.getNeedVerify());
    }
}
