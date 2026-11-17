package kk;

import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class ad extends ed {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final pc f55805eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ay f55806gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final sj.zynmafqrjb f55807lqeggnwhkg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(bt metricFacade, jlmebxxoox sPayDataContract, h7 clearSdkUtil, pc sPaySdkReducer, xf sPayStorage) {
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearSdkUtil, "clearSdkUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        this.f55805eablkybsjg = sPaySdkReducer;
        hl hlVar = ((ln) ((ij) sPayStorage).f57056zoijcleaow.getValue()).f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.FraudMonReview");
        this.f55806gxszxtbevo = (ay) hlVar;
        this.f55807lqeggnwhkg = sj.kegysxyocb.iobyxmoadg(null);
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), null, null, new wa(this, null), 3, null);
    }

    public final void agtfadlqog(kg0 fraudMonReviewEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonReviewEvent, "fraudMonReviewEvent");
        e5 e5Var = (e5) fraudMonReviewEvent;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(e5Var, w1.f59082iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(ipoelvxyzq.TOUCH_CLOSE_SDK_BUTTON, we0.DENY_BLOCK_VIEW, mp.TOUCH, null, null, null, null, 120));
            ((ve) this.f55805eablkybsjg).zoijcleaow(ec0.f56401iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(e5Var, x2.f59241iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(ipoelvxyzq.LC_DENY_BLOCK_VIEW_APPEARED, we0.DENY_BLOCK_VIEW, mp.LCStart, null, null, null, null, 120));
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(e5Var, c4.f56088iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(ipoelvxyzq.LC_DENY_BLOCK_VIEW_DISAPPEARED, we0.DENY_BLOCK_VIEW, mp.LCEnd, null, null, null, null, 120));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object draadjrbmk(kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        xb xbVar;
        FraudMonCheckResult.FormParameters formParameters;
        if (wkgbmnqykcVar instanceof xb) {
            xbVar = (xb) wkgbmnqykcVar;
            int i13 = xbVar.f59286jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                xbVar.f59286jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                xbVar = new xb(this, wkgbmnqykcVar);
            }
        } else {
            xbVar = new xb(this, wkgbmnqykcVar);
        }
        Object obj = xbVar.f59288zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = xbVar.f59286jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            FraudMonCheckResult fraudMonCheckResultIobyxmoadg = this.f55806gxszxtbevo.f55879iobyxmoadg.iobyxmoadg();
            if (fraudMonCheckResultIobyxmoadg != null && (formParameters = fraudMonCheckResultIobyxmoadg.getFormParameters()) != null) {
                sj.zynmafqrjb zynmafqrjbVar = this.f55807lqeggnwhkg;
                String header = formParameters.getHeader();
                String str = header == null ? "" : header;
                String textDecline = formParameters.getTextDecline();
                String str2 = textDecline == null ? "" : textDecline;
                String buttonDeclineText = formParameters.getButtonDeclineText();
                ws wsVar = new ws(str, null, str2, null, buttonDeclineText == null ? "" : buttonDeclineText, null, 234);
                xbVar.f59286jyumaefscl = 1;
                if (zynmafqrjbVar.emit(wsVar, xbVar) == objGxszxtbevo) {
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
