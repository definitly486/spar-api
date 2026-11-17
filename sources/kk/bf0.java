package kk;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class bf0 extends u0 {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final sj.wypolnanlu f55981agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final sj.wypolnanlu f55982btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final sj.wypolnanlu f55983draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final ek f55984dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final pc f55985eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final sj.wypolnanlu f55986gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final wc0 f55987gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final de0 f55988lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final fv f55989nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final sj.wypolnanlu f55990ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public final sj.wypolnanlu f55991oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final sj.wypolnanlu f55992rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public final sj.wypolnanlu f55993vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final sj.wypolnanlu f55994wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final xf f55995wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(bt metricFacade, jlmebxxoox sPayDataContract, xf sPayStorage, pc sPaySdkReducer, wc0 featuresHandler, de0 authHandler, fv getAgreementLinksTitlesUseCase) {
        String offerText;
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authHandler, "authHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getAgreementLinksTitlesUseCase, "getAgreementLinksTitlesUseCase");
        this.f55995wkgbmnqykc = sPayStorage;
        this.f55985eablkybsjg = sPaySdkReducer;
        this.f55987gxszxtbevo = featuresHandler;
        this.f55988lqeggnwhkg = authHandler;
        this.f55989nufgyqmvbu = getAgreementLinksTitlesUseCase;
        this.f55984dxjokdxxww = ek.f56434iobyxmoadg;
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) sPayDataContract;
        sj.wypolnanlu wypolnanluVar = auzgnhcxokVar.f55843btonecajqb;
        this.f55982btonecajqb = sj.dxjokdxxww.zoijcleaow(sj.kegysxyocb.iobyxmoadg(Integer.valueOf(auzgnhcxokVar.f55855iwizpuwonk)));
        this.f55986gtknphoqwx = auzgnhcxokVar.f55861nufgyqmvbu;
        PayStrategy payStrategyStatus = ((auzgnhcxok) this.f56063zoijcleaow).btonecajqb();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payStrategyStatus, "payStrategyStatus");
        p2.f58029iobyxmoadg = false;
        sj.lqeggnwhkg lqeggnwhkgVarCllcsxoeiz = sj.dxjokdxxww.cllcsxoeiz(wypolnanluVar, new o40(null));
        pj.cllcsxoeiz cllcsxoeizVarIobyxmoadg = androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this);
        sj.jpowsppfya.iobyxmoadg iobyxmoadgVar = sj.jpowsppfya.f106926iobyxmoadg;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb = sj.dxjokdxxww.ribwqtqdhb(lqeggnwhkgVarCllcsxoeiz, cllcsxoeizVarIobyxmoadg, sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f55983draadjrbmk = wypolnanluVarRibwqtqdhb;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb2 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVar, new s50(sPayDataContract, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f55994wflxmlrfwp = wypolnanluVarRibwqtqdhb2;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb3 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVarRibwqtqdhb2, new u60(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f55981agtfadlqog = wypolnanluVarRibwqtqdhb3;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb4 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVarRibwqtqdhb3, new x70(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        sj.wypolnanlu wypolnanluVarRibwqtqdhb5 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVar, new k30(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        sj.dxjokdxxww.ribwqtqdhb(new sc0(wypolnanluVar), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        sj.wypolnanlu wypolnanluVarRibwqtqdhb6 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVarRibwqtqdhb, new a90(this, sPayDataContract, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f55990ojitshcjhn = wypolnanluVarRibwqtqdhb6;
        this.f55992rgvfuqvkyq = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.wflxmlrfwp(sj.dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb), sj.dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb6), new e20(this, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f55993vdvldrhtss = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.wflxmlrfwp(wypolnanluVarRibwqtqdhb4, wypolnanluVarRibwqtqdhb5, new wd0(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        sj.wypolnanlu wypolnanluVarRibwqtqdhb7 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVarRibwqtqdhb2, new sz(this, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), iobyxmoadgVar.ppxfxbqfkf(), null);
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) wypolnanluVarRibwqtqdhb2.getValue();
        this.f55991oxmwwwfdhm = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.wflxmlrfwp(wypolnanluVarRibwqtqdhb7, sj.kegysxyocb.iobyxmoadg((paymentPlanBnplResponseBody == null || (offerText = paymentPlanBnplResponseBody.getOfferText()) == null) ? null : ir.gxszxtbevo(offerText)), new oy(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
    }

    public final void draadjrbmk(qv event) {
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof zq) {
            ow event2 = new ow(kh0.TOUCH_PAY, we0.BNPL_PARTS_VIEW, mp.TOUCH, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event2, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event2);
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool = (ListOfCardsResponseBody.PaymentToolInfo.Tool) this.f55990ojitshcjhn.getValue();
            if (tool == null || (listOfCardsResponseBody = (ListOfCardsResponseBody) this.f55983draadjrbmk.getValue()) == null || (paymentToolInfo2 = listOfCardsResponseBody.getPaymentToolInfo()) == null || (toolList2 = paymentToolInfo2.getToolList()) == null) {
                return;
            }
            for (ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 : toolList2) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tool2.getCardNumber(), tool.getCardNumber())) {
                    wc0 wc0Var = this.f55987gxszxtbevo;
                    uc0 uc0Var = uc0.BNPL;
                    ((ve) this.f55985eablkybsjg).zoijcleaow(new mb(Boolean.valueOf(zd0.iobyxmoadg(this.f55987gxszxtbevo, uc0.REFRESH_TOKEN, null) ? ((jf0) this.f55988lqeggnwhkg).f57188eablkybsjg : false), tool2, Boolean.valueOf(zd0.iobyxmoadg(wc0Var, uc0Var, b6.BY_USER) && zd0.iobyxmoadg(this.f55987gxszxtbevo, uc0Var, b6.BY_SYSTEM)), null));
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (event instanceof vp) {
            pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), pj.ikoacuggdj.zoijcleaow(), null, new z00(this, null), 2, null);
            return;
        }
        if (event instanceof ht) {
            ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) this.f55983draadjrbmk.getValue();
            if (qa0.iobyxmoadg((listOfCardsResponseBody2 == null || (paymentToolInfo = listOfCardsResponseBody2.getPaymentToolInfo()) == null || (toolList = paymentToolInfo.getToolList()) == null) ? null : Integer.valueOf(toolList.size())) <= 1) {
                return;
            }
            ow event3 = new ow(kh0.TOUCH_CARD, we0.BNPL_PARTS_VIEW, mp.TOUCH, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event3, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event3);
            ((ve) this.f55985eablkybsjg).zoijcleaow(new za0(this.f55984dxjokdxxww, null, false));
            return;
        }
        if (event instanceof mu) {
            ((auzgnhcxok) this.f56063zoijcleaow).f55860lqeggnwhkg.setValue(Boolean.valueOf(((mu) event).f57696iobyxmoadg));
            ow event4 = new ow(kh0.TOUCH_APPROVE_BNPL, we0.BNPL_PARTS_VIEW, mp.TOUCH, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event4, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event4);
            return;
        }
        if (!(event instanceof ds)) {
            throw new NoWhenBranchMatchedException();
        }
        ds dsVar = (ds) event;
        int i13 = dsVar.f56319iobyxmoadg;
        String str = dsVar.f56320zoijcleaow;
        if (i13 == 0) {
            ow event5 = new ow(kh0.TOUCH_CONTRACT_VIEW, we0.BNPL_PARTS_VIEW, mp.TOUCH, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event5, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event5);
        } else if (i13 == 1) {
            ow event6 = new ow(kh0.TOUCH_AGREEMENT_VIEW, we0.BNPL_PARTS_VIEW, mp.TOUCH, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event6, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event6);
        }
        ((ve) this.f55985eablkybsjg).zoijcleaow(new ml(str));
    }
}
