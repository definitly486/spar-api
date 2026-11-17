package iv1;

import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import lv1.GetTipsRequest;
import lv1.LinkDto;
import lv1.SendTipsRequest;
import lv1.TipValueDto;
import lv1.TipsOrderParamsDto;
import lv1.dxjokdxxww;
import lv1.ppxfxbqfkf;
import lv1.rgvfuqvkyq;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.SendTipsParams;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements nv1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final kv1.iobyxmoadg f49659iobyxmoadg;

    /* JADX INFO: renamed from: iv1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1054iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49660jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49662zdlpuopuiu;

        C1054iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49662zdlpuopuiu = obj;
            this.f49660jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49663jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49665zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49665zdlpuopuiu = obj;
            this.f49663jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, null, this);
        }
    }

    public iobyxmoadg(kv1.iobyxmoadg tipsOrderApiService) {
        zdlpuopuiu.btonecajqb(tipsOrderApiService, "tipsOrderApiService");
        this.f49659iobyxmoadg = tipsOrderApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv1.iobyxmoadg
    public Object iobyxmoadg(String str, gxszxtbevo gxszxtbevoVar) {
        C1054iobyxmoadg c1054iobyxmoadg;
        if (gxszxtbevoVar instanceof C1054iobyxmoadg) {
            c1054iobyxmoadg = (C1054iobyxmoadg) gxszxtbevoVar;
            int i13 = c1054iobyxmoadg.f49660jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1054iobyxmoadg.f49660jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1054iobyxmoadg = new C1054iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1054iobyxmoadg = new C1054iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c1054iobyxmoadg.f49662zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1054iobyxmoadg.f49660jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            GetTipsRequest getTipsRequest = new GetTipsRequest(Long.parseLong(str));
            kv1.iobyxmoadg iobyxmoadgVar = this.f49659iobyxmoadg;
            c1054iobyxmoadg.f49660jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(getTipsRequest, c1054iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return rgvfuqvkyq.iobyxmoadg((TipsOrderParamsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv1.iobyxmoadg
    public Object zoijcleaow(String str, SendTipsParams sendTipsParams, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f49663jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f49663jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f49665zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f49663jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            long j13 = Long.parseLong(str);
            Map tips = sendTipsParams.getTips();
            ArrayList arrayList = new ArrayList(tips.size());
            for (Map.Entry entry : tips.entrySet()) {
                arrayList.add(new TipValueDto((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            SendTipsRequest sendTipsRequest = new SendTipsRequest(j13, arrayList, dxjokdxxww.iobyxmoadg(sendTipsParams.getChosenPayment()));
            kv1.iobyxmoadg iobyxmoadgVar = this.f49659iobyxmoadg;
            zoijcleaowVar.f49663jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(sendTipsRequest, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return ppxfxbqfkf.iobyxmoadg((LinkDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
