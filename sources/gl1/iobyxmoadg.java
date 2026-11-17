package gl1;

import gg.wwaezpbzkn;
import hl1.SendFeedbackRequest;
import hl1.SendNoAuthFeedbackRequest;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements dl1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fl1.iobyxmoadg f37795iobyxmoadg;

    /* JADX INFO: renamed from: gl1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0853iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f37796jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f37798zdlpuopuiu;

        C0853iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f37798zdlpuopuiu = obj;
            this.f37796jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f37799jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f37801zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f37801zdlpuopuiu = obj;
            this.f37799jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, this);
        }
    }

    public iobyxmoadg(fl1.iobyxmoadg feedbackApiService) {
        zdlpuopuiu.btonecajqb(feedbackApiService, "feedbackApiService");
        this.f37795iobyxmoadg = feedbackApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dl1.iobyxmoadg
    public Object iobyxmoadg(cl1.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C0853iobyxmoadg c0853iobyxmoadg;
        if (gxszxtbevoVar instanceof C0853iobyxmoadg) {
            c0853iobyxmoadg = (C0853iobyxmoadg) gxszxtbevoVar;
            int i13 = c0853iobyxmoadg.f37796jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0853iobyxmoadg.f37796jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0853iobyxmoadg = new C0853iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0853iobyxmoadg = new C0853iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c0853iobyxmoadg.f37798zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0853iobyxmoadg.f37796jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            fl1.iobyxmoadg iobyxmoadgVar2 = this.f37795iobyxmoadg;
            SendFeedbackRequest sendFeedbackRequest = new SendFeedbackRequest(iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
            c0853iobyxmoadg.f37796jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(sendFeedbackRequest, c0853iobyxmoadg);
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
    @Override // dl1.iobyxmoadg
    public Object zoijcleaow(cl1.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) throws Throwable {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f37799jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f37799jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f37801zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f37799jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            fl1.iobyxmoadg iobyxmoadgVar2 = this.f37795iobyxmoadg;
            SendNoAuthFeedbackRequest sendNoAuthFeedbackRequest = new SendNoAuthFeedbackRequest(iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
            zoijcleaowVar.f37799jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(sendNoAuthFeedbackRequest, zoijcleaowVar);
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
}
