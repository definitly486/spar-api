package pz1;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o40.eablkybsjg;
import qz1.SendFeedbackRequest;
import qz1.SendNoAuthFeedbackRequest;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements mz1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oz1.iobyxmoadg f77561iobyxmoadg;

    /* JADX INFO: renamed from: pz1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1727iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f77562jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f77564zdlpuopuiu;

        C1727iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f77564zdlpuopuiu = obj;
            this.f77562jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f77565jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f77567zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f77567zdlpuopuiu = obj;
            this.f77565jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, this);
        }
    }

    public iobyxmoadg(oz1.iobyxmoadg feedbackApiService) {
        zdlpuopuiu.btonecajqb(feedbackApiService, "feedbackApiService");
        this.f77561iobyxmoadg = feedbackApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mz1.iobyxmoadg
    public Object iobyxmoadg(lz1.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C1727iobyxmoadg c1727iobyxmoadg;
        if (gxszxtbevoVar instanceof C1727iobyxmoadg) {
            c1727iobyxmoadg = (C1727iobyxmoadg) gxszxtbevoVar;
            int i13 = c1727iobyxmoadg.f77562jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1727iobyxmoadg.f77562jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1727iobyxmoadg = new C1727iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1727iobyxmoadg = new C1727iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c1727iobyxmoadg.f77564zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1727iobyxmoadg.f77562jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            oz1.iobyxmoadg iobyxmoadgVar2 = this.f77561iobyxmoadg;
            SendFeedbackRequest sendFeedbackRequest = new SendFeedbackRequest(iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
            c1727iobyxmoadg.f77562jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(sendFeedbackRequest, c1727iobyxmoadg);
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
    @Override // mz1.iobyxmoadg
    public Object zoijcleaow(lz1.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) throws Throwable {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f77565jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f77565jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f77567zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f77565jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            oz1.iobyxmoadg iobyxmoadgVar2 = this.f77561iobyxmoadg;
            SendNoAuthFeedbackRequest sendNoAuthFeedbackRequest = new SendNoAuthFeedbackRequest(iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
            zoijcleaowVar.f77565jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(sendNoAuthFeedbackRequest, zoijcleaowVar);
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
}
