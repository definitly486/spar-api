package kk;

import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class nq extends ed {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final pc f57839eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ay f57840gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final sj.zynmafqrjb f57841lqeggnwhkg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq(bt metricFacade, jlmebxxoox sPayDataContract, h7 clearSdkUtil, pc sPaySdkReducer, xf sPayStorage) {
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearSdkUtil, "clearSdkUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        this.f57839eablkybsjg = sPaySdkReducer;
        hl hlVar = ((ln) ((ij) sPayStorage).f57056zoijcleaow.getValue()).f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.FraudMonReview");
        this.f57840gxszxtbevo = (ay) hlVar;
        this.f57841lqeggnwhkg = sj.kegysxyocb.iobyxmoadg(null);
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), null, null, new fo(this, null), 3, null);
    }

    public final void agtfadlqog(kg0 fraudMonReviewEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonReviewEvent, "fraudMonReviewEvent");
        qi qiVar = (qi) fraudMonReviewEvent;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(qiVar, gf.f56700iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(r.TOUCH_TO_PAYMENT_METHODS_BUTTON, we0.DENY_VIEW, mp.TOUCH, null, null, null, null, 120));
            ((ve) this.f57839eablkybsjg).zoijcleaow(ec0.f56401iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(qiVar, ig.f57039iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(r.LC_DENY_VIEW_APPEARED, we0.DENY_VIEW, mp.LCStart, null, null, null, null, 120));
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(qiVar, mh.f57648iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(r.LC_DENY_VIEW_DISAPPEARED, we0.DENY_VIEW, mp.LCEnd, null, null, null, null, 120));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object draadjrbmk(kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        jp jpVar;
        FraudMonCheckResult.FormParameters formParameters;
        if (wkgbmnqykcVar instanceof jp) {
            jpVar = (jp) wkgbmnqykcVar;
            int i13 = jpVar.f57214jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jpVar.f57214jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                jpVar = new jp(this, wkgbmnqykcVar);
            }
        } else {
            jpVar = new jp(this, wkgbmnqykcVar);
        }
        Object obj = jpVar.f57216zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = jpVar.f57214jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            FraudMonCheckResult fraudMonCheckResultIobyxmoadg = this.f57840gxszxtbevo.f55879iobyxmoadg.iobyxmoadg();
            if (fraudMonCheckResultIobyxmoadg != null && (formParameters = fraudMonCheckResultIobyxmoadg.getFormParameters()) != null) {
                sj.zynmafqrjb zynmafqrjbVar = this.f57841lqeggnwhkg;
                String header = formParameters.getHeader();
                String str = header == null ? "" : header;
                String textDecline = formParameters.getTextDecline();
                String str2 = textDecline == null ? "" : textDecline;
                String buttonDeclineText = formParameters.getButtonDeclineText();
                ws wsVar = new ws(str, null, str2, null, buttonDeclineText == null ? "" : buttonDeclineText, null, 234);
                jpVar.f57214jyumaefscl = 1;
                if (zynmafqrjbVar.emit(wsVar, jpVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
