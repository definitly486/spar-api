package kk;

import kotlin.NoWhenBranchMatchedException;
import npi.spay.Mn;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class c6 extends u0 {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final sj.wypolnanlu f56097btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final sj.wypolnanlu f56098draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final sj.wypolnanlu f56099dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final wc0 f56100eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final sj.wypolnanlu f56101gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final fv f56102gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final sj.wypolnanlu f56103lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final sj.wypolnanlu f56104nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final sj.wypolnanlu f56105wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final pc f56106wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(bt metricFacade, jlmebxxoox sPayDataContract, xf sPayStorage, pc sPaySdkReducer, wc0 featuresHandler, fv getAgreementLinksTitlesUseCase) {
        String offerText;
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getAgreementLinksTitlesUseCase, "getAgreementLinksTitlesUseCase");
        this.f56106wkgbmnqykc = sPaySdkReducer;
        this.f56100eablkybsjg = featuresHandler;
        this.f56102gxszxtbevo = getAgreementLinksTitlesUseCase;
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) sPayDataContract;
        sj.wypolnanlu wypolnanluVar = auzgnhcxokVar.f55843btonecajqb;
        this.f56103lqeggnwhkg = sj.dxjokdxxww.zoijcleaow(sj.kegysxyocb.iobyxmoadg(Integer.valueOf(auzgnhcxokVar.f55855iwizpuwonk)));
        sj.lqeggnwhkg lqeggnwhkgVarCllcsxoeiz = sj.dxjokdxxww.cllcsxoeiz(wypolnanluVar, new r1(null));
        pj.cllcsxoeiz cllcsxoeizVarIobyxmoadg = androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this);
        sj.jpowsppfya.iobyxmoadg iobyxmoadgVar = sj.jpowsppfya.f106926iobyxmoadg;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb = sj.dxjokdxxww.ribwqtqdhb(lqeggnwhkgVarCllcsxoeiz, cllcsxoeizVarIobyxmoadg, sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f56104nufgyqmvbu = wypolnanluVarRibwqtqdhb;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb2 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVarRibwqtqdhb, new s2(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f56099dxjokdxxww = wypolnanluVarRibwqtqdhb2;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb3 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVarRibwqtqdhb2, new x3(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        sj.wypolnanlu wypolnanluVarRibwqtqdhb4 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVarRibwqtqdhb, new cdpycssgdh(this, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), iobyxmoadgVar.ppxfxbqfkf(), null);
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) wypolnanluVarRibwqtqdhb.getValue();
        this.f56097btonecajqb = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.wflxmlrfwp(wypolnanluVarRibwqtqdhb4, sj.kegysxyocb.iobyxmoadg((paymentPlanBnplResponseBody == null || (offerText = paymentPlanBnplResponseBody.getOfferText()) == null) ? null : ir.gxszxtbevo(offerText)), new zoijcleaow(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f56101gtknphoqwx = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.wflxmlrfwp(wypolnanluVarRibwqtqdhb3, sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVar, new m(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null), new z4(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        sj.wypolnanlu wypolnanluVar2 = auzgnhcxokVar.f55861nufgyqmvbu;
        this.f56098draadjrbmk = wypolnanluVar2;
        this.f56105wflxmlrfwp = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVar2, new hszhottldk(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), Boolean.FALSE);
        ij ijVar = (ij) sPayStorage;
        if (!(ijVar.iobyxmoadg().f57485iobyxmoadg instanceof le0)) {
            throw new Mn(ijVar.iobyxmoadg().toString());
        }
    }

    public final void draadjrbmk(yn event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, gh.f56703iobyxmoadg)) {
            pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), pj.ikoacuggdj.zoijcleaow(), null, new xrmfcynszj(this, null), 2, null);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ji.f57199iobyxmoadg)) {
            pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), pj.ikoacuggdj.zoijcleaow(), null, new p0(this, null), 2, null);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, nj.f57833iobyxmoadg)) {
            ow event2 = new ow(w.LC_BNPL_VIEW_APPEARED, we0.BNPL_VIEW, mp.LC, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event2, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event2);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, pk.f58089iobyxmoadg)) {
            ow event3 = new ow(w.LC_BNPL_VIEW_DISAPPEARED, we0.BNPL_VIEW, mp.LC, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event3, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event3);
            return;
        }
        if (!(event instanceof sl)) {
            if (!(event instanceof um)) {
                throw new NoWhenBranchMatchedException();
            }
            ((auzgnhcxok) this.f56063zoijcleaow).f55860lqeggnwhkg.setValue(Boolean.valueOf(((um) event).f58871iobyxmoadg));
            ow event4 = new ow(w.TOUCH_APPROVE_BNPL, we0.BNPL_VIEW, mp.TOUCH, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event4, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event4);
            return;
        }
        sl slVar = (sl) event;
        int i13 = slVar.f58561iobyxmoadg;
        String str = slVar.f58562zoijcleaow;
        if (i13 == 0) {
            ow event5 = new ow(w.TOUCH_CONTRACT_VIEW, we0.BNPL_VIEW, mp.TOUCH, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event5, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event5);
        } else if (i13 == 1) {
            ow event6 = new ow(w.TOUCH_AGREEMENT_VIEW, we0.BNPL_VIEW, mp.TOUCH, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event6, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event6);
        }
        ((ve) this.f56106wkgbmnqykc).zoijcleaow(new ml(str));
    }
}
