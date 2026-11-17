package kk;

import android.content.Intent;
import android.net.Uri;
import spay.sdk.domain.model.FraudMonInfo;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class uj extends ed {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final sj.zynmafqrjb f58860btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final sj.zynmafqrjb f58861dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final pc f58862eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ay f58863gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final sj.zynmafqrjb f58864lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public String f58865nufgyqmvbu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(bt metricFacade, jlmebxxoox sPayDataContract, h7 clearSdkUtil, pc sPaySdkReducer, xf sPayStorage) {
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearSdkUtil, "clearSdkUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        this.f58862eablkybsjg = sPaySdkReducer;
        hl hlVar = ((ln) ((ij) sPayStorage).f57056zoijcleaow.getValue()).f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.FraudMonReview");
        this.f58863gxszxtbevo = (ay) hlVar;
        this.f58864lqeggnwhkg = sj.kegysxyocb.iobyxmoadg(null);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(null);
        this.f58861dxjokdxxww = zynmafqrjbVarIobyxmoadg;
        this.f58860btonecajqb = zynmafqrjbVarIobyxmoadg;
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), null, null, new nh(this, null), 3, null);
    }

    public final void agtfadlqog(kg0 fraudMonReviewEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonReviewEvent, "fraudMonReviewEvent");
        n8 n8Var = (n8) fraudMonReviewEvent;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(n8Var, y2.f59373iobyxmoadg)) {
            jlmebxxoox jlmebxxooxVar = this.f56063zoijcleaow;
            FraudMonInfo fraudMonInfo = new FraudMonInfo("CONFIRMED_GENUINE");
            auzgnhcxok auzgnhcxokVar = (auzgnhcxok) jlmebxxooxVar;
            auzgnhcxokVar.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonInfo, "fraudMonInfo");
            auzgnhcxokVar.f55866rgvfuqvkyq = fraudMonInfo;
            ((ve) this.f58862eablkybsjg).zoijcleaow(new mb(Boolean.FALSE, null, null, null));
            this.f56062iobyxmoadg.iobyxmoadg(new ow(p00.TOUCH_CONFIRM_OPERATION_BUTTON, we0.REVIEW_HINT_VIEW, mp.TOUCH, null, null, null, null, 120));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(n8Var, d4.f56225iobyxmoadg)) {
            jlmebxxoox jlmebxxooxVar2 = this.f56063zoijcleaow;
            FraudMonInfo fraudMonInfo2 = new FraudMonInfo("UNKNOWN");
            auzgnhcxok auzgnhcxokVar2 = (auzgnhcxok) jlmebxxooxVar2;
            auzgnhcxokVar2.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonInfo2, "fraudMonInfo");
            auzgnhcxokVar2.f55866rgvfuqvkyq = fraudMonInfo2;
            ((ve) this.f58862eablkybsjg).zoijcleaow(b8.f55918iobyxmoadg);
            this.f56062iobyxmoadg.iobyxmoadg(new ow(p00.TOUCH_CANCEL_BUTTON, we0.REVIEW_HINT_VIEW, mp.TOUCH, null, null, null, null, 120));
            return;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(n8Var, f5.f56494iobyxmoadg)) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(n8Var, i6.f57002iobyxmoadg)) {
                this.f56062iobyxmoadg.iobyxmoadg(new ow(p00.LC_REVIEW_HINT_VIEW_APPEARED, we0.REVIEW_HINT_VIEW, mp.LCStart, null, null, null, null, 120));
                return;
            } else {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(n8Var, l7.f57411iobyxmoadg)) {
                    this.f56062iobyxmoadg.iobyxmoadg(new ow(p00.LC_REVIEW_HINT_VIEW_DISAPPEARED, we0.REVIEW_HINT_VIEW, mp.LCEnd, null, null, null, null, 120));
                    return;
                }
                return;
            }
        }
        jlmebxxoox jlmebxxooxVar3 = this.f56063zoijcleaow;
        FraudMonInfo fraudMonInfo3 = new FraudMonInfo("CONFIRMED_FRAUD");
        auzgnhcxok auzgnhcxokVar3 = (auzgnhcxok) jlmebxxooxVar3;
        auzgnhcxokVar3.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonInfo3, "fraudMonInfo");
        auzgnhcxokVar3.f55866rgvfuqvkyq = fraudMonInfo3;
        ((ve) this.f58862eablkybsjg).zoijcleaow(b8.f55918iobyxmoadg);
        this.f58861dxjokdxxww.setValue(new Intent("android.intent.action.VIEW", Uri.parse(this.f58865nufgyqmvbu)));
        this.f56062iobyxmoadg.iobyxmoadg(new ow(p00.TOUCH_HYPERLINK, we0.REVIEW_HINT_VIEW, mp.TOUCH, null, null, null, null, 120));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object draadjrbmk(kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        ri riVar;
        FraudMonCheckResult.FormParameters formParameters;
        if (wkgbmnqykcVar instanceof ri) {
            riVar = (ri) wkgbmnqykcVar;
            int i13 = riVar.f58362jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                riVar.f58362jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                riVar = new ri(this, wkgbmnqykcVar);
            }
        } else {
            riVar = new ri(this, wkgbmnqykcVar);
        }
        Object obj = riVar.f58364zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = riVar.f58362jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            FraudMonCheckResult fraudMonCheckResultIobyxmoadg = this.f58863gxszxtbevo.f55879iobyxmoadg.iobyxmoadg();
            if (fraudMonCheckResultIobyxmoadg != null && (formParameters = fraudMonCheckResultIobyxmoadg.getFormParameters()) != null) {
                this.f58865nufgyqmvbu = formParameters.getCybercabinetUrlAndroid();
                sj.zynmafqrjb zynmafqrjbVar = this.f58864lqeggnwhkg;
                String header = formParameters.getHeader();
                String str = header == null ? "" : header;
                String text = formParameters.getText();
                String str2 = text == null ? "" : text;
                String buttonConfirmText = formParameters.getButtonConfirmText();
                String str3 = buttonConfirmText == null ? "" : buttonConfirmText;
                String buttonDeclineText = formParameters.getButtonDeclineText();
                String str4 = buttonDeclineText == null ? "" : buttonDeclineText;
                String buttonInformText = formParameters.getButtonInformText();
                ws wsVar = new ws(str, str2, null, str3, str4, buttonInformText == null ? "" : buttonInformText, 196);
                riVar.f58362jyumaefscl = 1;
                if (zynmafqrjbVar.emit(wsVar, riVar) == objGxszxtbevo) {
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
