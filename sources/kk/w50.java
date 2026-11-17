package kk;

import spay.sdk.domain.model.FraudMonInfo;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class w50 extends ed {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final pc f59094eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ay f59095gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final sj.zynmafqrjb f59096lqeggnwhkg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(bt metricFacade, jlmebxxoox sPayDataContract, h7 clearSdkUtil, pc sPaySdkReducer, xf sPayStorage, wc0 featuresHandler, de0 authHandler) {
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearSdkUtil, "clearSdkUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authHandler, "authHandler");
        this.f59094eablkybsjg = sPaySdkReducer;
        hl hlVar = ((ln) ((ij) sPayStorage).f57056zoijcleaow.getValue()).f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.FraudMonReview");
        this.f59095gxszxtbevo = (ay) hlVar;
        this.f59096lqeggnwhkg = sj.kegysxyocb.iobyxmoadg(null);
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), null, null, new q30(this, null), 3, null);
    }

    public final void agtfadlqog(kg0 fraudMonReviewEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonReviewEvent, "fraudMonReviewEvent");
        px pxVar = (px) fraudMonReviewEvent;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pxVar, vs.f59058iobyxmoadg)) {
            jlmebxxoox jlmebxxooxVar = this.f56063zoijcleaow;
            FraudMonInfo fraudMonInfo = new FraudMonInfo("CONFIRMED_GENUINE");
            auzgnhcxok auzgnhcxokVar = (auzgnhcxok) jlmebxxooxVar;
            auzgnhcxokVar.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonInfo, "fraudMonInfo");
            auzgnhcxokVar.f55866rgvfuqvkyq = fraudMonInfo;
            ((ve) this.f59094eablkybsjg).zoijcleaow(new mb(Boolean.TRUE, null, null, null));
            this.f56062iobyxmoadg.iobyxmoadg(new ow(jm.TOUCH_CONFIRM_OPERATION_BUTTON, we0.OTP_REVIEW_VIEW, mp.TOUCH, null, null, null, null, 120));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pxVar, au.f55841iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(jm.TOUCH_CANCEL_BUTTON, we0.OTP_REVIEW_VIEW, mp.TOUCH, null, null, null, null, 120));
            ((ve) this.f59094eablkybsjg).zoijcleaow(ec0.f56401iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pxVar, ev.f56470iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(jm.LC_OTP_REVIEW_VIEW_APPEARED, we0.OTP_REVIEW_VIEW, mp.LCStart, null, null, null, null, 120));
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pxVar, iw.f57099iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(jm.LC_OTP_REVIEW_VIEW_DISAPPEARED, we0.OTP_REVIEW_VIEW, mp.LCEnd, null, null, null, null, 120));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object draadjrbmk(kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        t40 t40Var;
        FraudMonCheckResult.FormParameters formParameters;
        if (wkgbmnqykcVar instanceof t40) {
            t40Var = (t40) wkgbmnqykcVar;
            int i13 = t40Var.f58614jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                t40Var.f58614jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                t40Var = new t40(this, wkgbmnqykcVar);
            }
        } else {
            t40Var = new t40(this, wkgbmnqykcVar);
        }
        Object obj = t40Var.f58616zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = t40Var.f58614jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            FraudMonCheckResult fraudMonCheckResultIobyxmoadg = this.f59095gxszxtbevo.f55879iobyxmoadg.iobyxmoadg();
            if (fraudMonCheckResultIobyxmoadg != null && (formParameters = fraudMonCheckResultIobyxmoadg.getFormParameters()) != null) {
                sj.zynmafqrjb zynmafqrjbVar = this.f59096lqeggnwhkg;
                String header = formParameters.getHeader();
                String str = header == null ? "" : header;
                String text = formParameters.getText();
                String str2 = text == null ? "" : text;
                String buttonConfirmText = formParameters.getButtonConfirmText();
                String str3 = buttonConfirmText == null ? "" : buttonConfirmText;
                String buttonDeclineText = formParameters.getButtonDeclineText();
                ws wsVar = new ws(str, str2, null, str3, buttonDeclineText == null ? "" : buttonDeclineText, null, 228);
                t40Var.f58614jyumaefscl = 1;
                if (zynmafqrjbVar.emit(wsVar, t40Var) == objGxszxtbevo) {
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
