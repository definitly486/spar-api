package o92;

import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o40.eablkybsjg;
import r92.GetTipsRequest;
import r92.LinkDto;
import r92.SendTipsRequest;
import r92.TipValueDto;
import r92.TipsOrderParamsDto;
import r92.dxjokdxxww;
import r92.ppxfxbqfkf;
import r92.rgvfuqvkyq;
import ru.myspar.core.network.model.BasicResponse;
import ru.myspar.tipsorder.impl.domain.model.SendTipsParams;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements t92.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final q92.iobyxmoadg f72378iobyxmoadg;

    /* JADX INFO: renamed from: o92.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1567iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f72379jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f72381zdlpuopuiu;

        C1567iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f72381zdlpuopuiu = obj;
            this.f72379jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f72382jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f72384zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f72384zdlpuopuiu = obj;
            this.f72382jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, null, this);
        }
    }

    public iobyxmoadg(q92.iobyxmoadg tipsOrderApiService) {
        zdlpuopuiu.btonecajqb(tipsOrderApiService, "tipsOrderApiService");
        this.f72378iobyxmoadg = tipsOrderApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t92.iobyxmoadg
    public Object iobyxmoadg(String str, gxszxtbevo gxszxtbevoVar) {
        C1567iobyxmoadg c1567iobyxmoadg;
        if (gxszxtbevoVar instanceof C1567iobyxmoadg) {
            c1567iobyxmoadg = (C1567iobyxmoadg) gxszxtbevoVar;
            int i13 = c1567iobyxmoadg.f72379jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1567iobyxmoadg.f72379jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1567iobyxmoadg = new C1567iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1567iobyxmoadg = new C1567iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c1567iobyxmoadg.f72381zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1567iobyxmoadg.f72379jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            GetTipsRequest getTipsRequest = new GetTipsRequest(Long.parseLong(str));
            q92.iobyxmoadg iobyxmoadgVar = this.f72378iobyxmoadg;
            c1567iobyxmoadg.f72379jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(getTipsRequest, c1567iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return rgvfuqvkyq.iobyxmoadg((TipsOrderParamsDto) eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t92.iobyxmoadg
    public Object zoijcleaow(String str, SendTipsParams sendTipsParams, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f72382jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f72382jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f72384zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f72382jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            long j13 = Long.parseLong(str);
            Map tips = sendTipsParams.getTips();
            ArrayList arrayList = new ArrayList(tips.size());
            for (Map.Entry entry : tips.entrySet()) {
                arrayList.add(new TipValueDto((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            SendTipsRequest sendTipsRequest = new SendTipsRequest(j13, arrayList, dxjokdxxww.iobyxmoadg(sendTipsParams.getChosenPayment()));
            q92.iobyxmoadg iobyxmoadgVar = this.f72378iobyxmoadg;
            zoijcleaowVar.f72382jyumaefscl = 1;
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
        return ppxfxbqfkf.iobyxmoadg((LinkDto) eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
