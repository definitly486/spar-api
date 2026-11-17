package kk;

import java.util.LinkedHashSet;
import java.util.List;
import npi.spay.Cn;
import spay.sdk.domain.model.FraudMonInfo;
import spay.sdk.domain.model.HelperScenario;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.PartsPaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.PartsPaymentPlanBnplResponseBodyKt;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.SessionIdResponseBody;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class auzgnhcxok implements jlmebxxoox {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final sj.zynmafqrjb f55842agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final sj.wypolnanlu f55843btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public final sj.wypolnanlu f55844cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public HelperScenario f55845cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public String f55846draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final sj.zynmafqrjb f55847dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public ContentResponse.Success f55848eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final LinkedHashSet f55849esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final sj.zynmafqrjb f55850gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final sj.zynmafqrjb f55851gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public Boolean f55852iobyxmoadg;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public final sj.wypolnanlu f55853iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public final sj.zynmafqrjb f55854istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public int f55855iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final String f55856jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public final sj.zynmafqrjb f55857kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public final sj.zynmafqrjb f55858lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public MerchantData f55859lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final sj.zynmafqrjb f55860lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final sj.wypolnanlu f55861nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public boolean f55862ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public final sj.zynmafqrjb f55863oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public final sj.zynmafqrjb f55864pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public ContentResponse.Success f55865ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public FraudMonInfo f55866rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public final sj.zynmafqrjb f55867vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public String f55868wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public ContentResponse.Success f55869wkgbmnqykc;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public String f55870wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public final sj.zynmafqrjb f55871yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final sj.wypolnanlu f55872yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final sj.zynmafqrjb f55873zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public fmlbqenlif f55874zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public final sj.wypolnanlu f55875zynmafqrjb;

    public auzgnhcxok(pj.cllcsxoeiz contractScope) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(contractScope, "contractScope");
        this.f55874zoijcleaow = new fmlbqenlif();
        this.f55851gxszxtbevo = sj.kegysxyocb.iobyxmoadg(null);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(Boolean.TRUE);
        this.f55860lqeggnwhkg = zynmafqrjbVarIobyxmoadg;
        this.f55861nufgyqmvbu = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = sj.kegysxyocb.iobyxmoadg(null);
        this.f55847dxjokdxxww = zynmafqrjbVarIobyxmoadg2;
        this.f55843btonecajqb = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg2);
        this.f55850gtknphoqwx = sj.kegysxyocb.iobyxmoadg(null);
        this.f55842agtfadlqog = sj.kegysxyocb.iobyxmoadg(null);
        ContentResponse.Success success = this.f55848eablkybsjg;
        success = success == null ? null : success;
        this.f55867vdvldrhtss = sj.kegysxyocb.iobyxmoadg(success != null ? (PaymentPlanBnplResponseBody) success.getData() : null);
        ContentResponse.Success success2 = this.f55869wkgbmnqykc;
        success2 = success2 == null ? null : success2;
        this.f55863oxmwwwfdhm = sj.kegysxyocb.iobyxmoadg(success2 != null ? (ListOfCardsResponseBody) success2.getData() : null);
        this.f55857kcexrzcfyt = sj.kegysxyocb.iobyxmoadg(null);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg3 = sj.kegysxyocb.iobyxmoadg(null);
        this.f55873zdlpuopuiu = zynmafqrjbVarIobyxmoadg3;
        this.f55872yggfygwlhe = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg3);
        this.f55856jyumaefscl = "";
        this.f55849esjtqupxsv = new LinkedHashSet();
        this.f55858lereixgezr = sj.kegysxyocb.iobyxmoadg("-1");
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg4 = sj.kegysxyocb.iobyxmoadg(0);
        this.f55864pmvmpeiblj = zynmafqrjbVarIobyxmoadg4;
        this.f55875zynmafqrjb = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg4);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg5 = sj.kegysxyocb.iobyxmoadg(new hh0());
        this.f55854istkbnxepw = zynmafqrjbVarIobyxmoadg5;
        this.f55844cdpycssgdh = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg5);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg6 = sj.kegysxyocb.iobyxmoadg(PayStrategy.BasePay.INSTANCE);
        this.f55871yadqdtsiqt = zynmafqrjbVarIobyxmoadg6;
        this.f55853iozdgvuglv = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg6);
        this.f55870wwaezpbzkn = "";
    }

    public final PayStrategy btonecajqb() {
        return (PayStrategy) this.f55853iozdgvuglv.getValue();
    }

    public final SessionIdResponseBody draadjrbmk() {
        ContentResponse.Success success = this.f55865ppxfxbqfkf;
        if (success == null) {
            success = null;
        }
        if (success != null) {
            return (SessionIdResponseBody) success.getData();
        }
        return null;
    }

    public final MerchantData dxjokdxxww() {
        Object objWkgbmnqykc;
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            MerchantData merchantData = this.f55859lmojexxdyd;
            if (merchantData == null) {
                throw Cn.f70541zdlpuopuiu;
            }
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(merchantData);
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = null;
            }
            return (MerchantData) objWkgbmnqykc;
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
    }

    public final void eablkybsjg(ContentResponse.Success response, Boolean bool) {
        ListOfCardsResponseBody listOfCardsResponseBody;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PromoInfo promoInfo;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(response, "response");
        this.f55869wkgbmnqykc = response;
        this.f55852iobyxmoadg = bool;
        sj.zynmafqrjb zynmafqrjbVar = this.f55857kcexrzcfyt;
        ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) response.getData();
        OrderScreenDataResponse orderScreenDataResponse = null;
        zynmafqrjbVar.setValue((listOfCardsResponseBody2 == null || (promoInfo = listOfCardsResponseBody2.getPromoInfo()) == null) ? null : promoInfo.getBannerList());
        sj.zynmafqrjb zynmafqrjbVar2 = this.f55873zdlpuopuiu;
        ListOfCardsResponseBody listOfCardsResponseBody3 = (ListOfCardsResponseBody) response.getData();
        zynmafqrjbVar2.setValue(listOfCardsResponseBody3 != null ? listOfCardsResponseBody3.getMerchantInfo() : null);
        sj.zynmafqrjb zynmafqrjbVar3 = this.f55863oxmwwwfdhm;
        ContentResponse.Success success = this.f55869wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(success, "null cannot be cast to non-null type spay.sdk.domain.model.response.ContentResponse.Success<spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody>");
        zynmafqrjbVar3.iobyxmoadg(success.getData());
        sj.zynmafqrjb zynmafqrjbVar4 = this.f55847dxjokdxxww;
        ContentResponse.Success successZoijcleaow = zoijcleaow(bool);
        if (successZoijcleaow != null && (listOfCardsResponseBody = (ListOfCardsResponseBody) successZoijcleaow.getData()) != null) {
            ContentResponse.Success success2 = this.f55848eablkybsjg;
            if (success2 == null) {
                success2 = null;
            }
            PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = success2 != null ? (PaymentPlanBnplResponseBody) success2.getData() : null;
            OrderScreenDataResponse orderScreenDataResponse2 = (OrderScreenDataResponse) this.f55843btonecajqb.getValue();
            boolean zBooleanValue = true;
            if (orderScreenDataResponse2 == null || !orderScreenDataResponse2.getMoreThanOneCard()) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsResponseBody.getPaymentToolInfo().getAdditionalCards(), Boolean.TRUE) || ((toolList = listOfCardsResponseBody.getPaymentToolInfo().getToolList()) != null && toolList.size() > 1)) {
                    Boolean additionalCards = listOfCardsResponseBody.getPaymentToolInfo().getAdditionalCards();
                    if (additionalCards != null) {
                        zBooleanValue = additionalCards.booleanValue();
                    }
                } else {
                    zBooleanValue = false;
                }
            }
            orderScreenDataResponse = new OrderScreenDataResponse(listOfCardsResponseBody, paymentPlanBnplResponseBody, null, zBooleanValue);
        }
        zynmafqrjbVar4.setValue(orderScreenDataResponse);
    }

    public final String gtknphoqwx() {
        SessionIdResponseBody sessionIdResponseBody;
        String sessionId;
        ContentResponse.Success success = this.f55865ppxfxbqfkf;
        if (success == null) {
            success = null;
        }
        return (success == null || (sessionIdResponseBody = (SessionIdResponseBody) success.getData()) == null || (sessionId = sessionIdResponseBody.getSessionId()) == null) ? "-1" : sessionId;
    }

    public final void gxszxtbevo(OrderScreenDataResponse orderScreenDataResponse) {
        gg.wwaezpbzkn wwaezpbzknVar;
        OrderScreenDataResponse orderScreenDataResponseCopy;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        if (orderScreenDataResponse != null) {
            sj.zynmafqrjb zynmafqrjbVar = this.f55847dxjokdxxww;
            OrderScreenDataResponse orderScreenDataResponse2 = (OrderScreenDataResponse) this.f55843btonecajqb.getValue();
            if (orderScreenDataResponse2 != null) {
                ListOfCardsResponseBody listOfCardsResponseBody = orderScreenDataResponse.getListOfCardsResponseBody();
                PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = orderScreenDataResponse.getPaymentPlanBnplResponseBody();
                SpasiboBonusesResponseBody spasiboBonusesResponseBody = orderScreenDataResponse.getSpasiboBonusesResponseBody();
                boolean z13 = true;
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderScreenDataResponse.getListOfCardsResponseBody().getPaymentToolInfo().getAdditionalCards(), Boolean.TRUE) && ((toolList = orderScreenDataResponse.getListOfCardsResponseBody().getPaymentToolInfo().getToolList()) == null || toolList.size() <= 1)) {
                    z13 = false;
                }
                orderScreenDataResponseCopy = orderScreenDataResponse2.copy(listOfCardsResponseBody, paymentPlanBnplResponseBody, spasiboBonusesResponseBody, z13);
            } else {
                orderScreenDataResponseCopy = null;
            }
            zynmafqrjbVar.setValue(orderScreenDataResponseCopy);
            wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        } else {
            wwaezpbzknVar = null;
        }
        if (wwaezpbzknVar == null) {
            this.f55847dxjokdxxww.setValue(null);
        }
    }

    public final long iobyxmoadg() {
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody;
        GraphBnpl graphBnpl;
        List<BnplPayment> payments;
        BnplPayment bnplPayment;
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f55843btonecajqb.getValue();
        Long lValueOf = (orderScreenDataResponse == null || (paymentPlanBnplResponseBody = orderScreenDataResponse.getPaymentPlanBnplResponseBody()) == null || (graphBnpl = paymentPlanBnplResponseBody.getGraphBnpl()) == null || (payments = graphBnpl.getPayments()) == null || (bnplPayment = (BnplPayment) hg.jyumaefscl.weqkydbzbr(payments)) == null) ? null : Long.valueOf(bnplPayment.getAmount());
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lqeggnwhkg(PartsPaymentPlanBnplResponseBody data) {
        ListOfCardsResponseBody listOfCardsResponseBody;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        ContentResponse.Success success = new ContentResponse.Success(PartsPaymentPlanBnplResponseBodyKt.mapToPaymentPlanBnplResponseBody(data));
        this.f55848eablkybsjg = success;
        this.f55867vdvldrhtss.iobyxmoadg((PaymentPlanBnplResponseBody) success.getData());
        sj.zynmafqrjb zynmafqrjbVar = this.f55847dxjokdxxww;
        ContentResponse.Success successZoijcleaow = zoijcleaow(Boolean.FALSE);
        Object orderScreenDataResponse = null;
        if (successZoijcleaow != null && (listOfCardsResponseBody = (ListOfCardsResponseBody) successZoijcleaow.getData()) != null) {
            ContentResponse.Success success2 = this.f55848eablkybsjg;
            if (success2 == null) {
                success2 = null;
            }
            orderScreenDataResponse = new OrderScreenDataResponse(listOfCardsResponseBody, success2 != null ? (PaymentPlanBnplResponseBody) success2.getData() : null, null, false, 8, null);
        }
        zynmafqrjbVar.setValue(orderScreenDataResponse);
    }

    public final List nufgyqmvbu() {
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        ContentResponse.Success success = this.f55869wkgbmnqykc;
        if (success == null) {
            success = null;
        }
        if (success == null || (listOfCardsResponseBody = (ListOfCardsResponseBody) success.getData()) == null || (paymentToolInfo = listOfCardsResponseBody.getPaymentToolInfo()) == null) {
            return null;
        }
        return paymentToolInfo.getToolList();
    }

    public final void ppxfxbqfkf(iwizpuwonk type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            this.f55865ppxfxbqfkf = null;
            this.f55851gxszxtbevo.setValue(null);
            return;
        }
        if (iOrdinal == 1) {
            this.f55869wkgbmnqykc = null;
            this.f55851gxszxtbevo.setValue(null);
            this.f55842agtfadlqog.setValue(null);
            return;
        }
        if (iOrdinal == 2) {
            this.f55848eablkybsjg = null;
            this.f55851gxszxtbevo.setValue(null);
            return;
        }
        if (iOrdinal == 3) {
            this.f55865ppxfxbqfkf = null;
            this.f55869wkgbmnqykc = null;
            this.f55848eablkybsjg = null;
            this.f55851gxszxtbevo.setValue(null);
            gxszxtbevo(null);
            this.f55846draadjrbmk = null;
            this.f55842agtfadlqog.setValue(null);
            return;
        }
        if (iOrdinal != 4) {
            if (iOrdinal != 5) {
                return;
            }
            this.f55859lmojexxdyd = null;
            return;
        }
        this.f55867vdvldrhtss.iobyxmoadg(null);
        this.f55863oxmwwwfdhm.iobyxmoadg(null);
        this.f55865ppxfxbqfkf = null;
        this.f55869wkgbmnqykc = null;
        this.f55848eablkybsjg = null;
        this.f55851gxszxtbevo.setValue(null);
        gxszxtbevo(null);
        this.f55846draadjrbmk = null;
        this.f55842agtfadlqog.setValue(null);
        this.f55862ojitshcjhn = false;
        this.f55866rgvfuqvkyq = null;
        this.f55864pmvmpeiblj.setValue(0);
        hh0 bonuses = new hh0();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bonuses, "bonuses");
        this.f55854istkbnxepw.setValue(bonuses);
        this.f55859lmojexxdyd = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void wkgbmnqykc(ContentResponse.Success paymentPlanBnplResponseBodyContentResponse) {
        ListOfCardsResponseBody listOfCardsResponseBody;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentPlanBnplResponseBodyContentResponse, "paymentPlanBnplResponseBodyContentResponse");
        this.f55848eablkybsjg = paymentPlanBnplResponseBodyContentResponse;
        this.f55867vdvldrhtss.iobyxmoadg((PaymentPlanBnplResponseBody) paymentPlanBnplResponseBodyContentResponse.getData());
        sj.zynmafqrjb zynmafqrjbVar = this.f55847dxjokdxxww;
        ContentResponse.Success successZoijcleaow = zoijcleaow(Boolean.FALSE);
        Object orderScreenDataResponse = null;
        if (successZoijcleaow != null && (listOfCardsResponseBody = (ListOfCardsResponseBody) successZoijcleaow.getData()) != null) {
            ContentResponse.Success success = this.f55848eablkybsjg;
            if (success == null) {
                success = null;
            }
            orderScreenDataResponse = new OrderScreenDataResponse(listOfCardsResponseBody, success != null ? (PaymentPlanBnplResponseBody) success.getData() : null, null, false, 8, null);
        }
        zynmafqrjbVar.setValue(orderScreenDataResponse);
    }

    public final ContentResponse.Success zoijcleaow(Boolean bool) {
        ContentResponse.Success success;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55852iobyxmoadg, bool) || (success = this.f55869wkgbmnqykc) == null) {
            return null;
        }
        return success;
    }
}
