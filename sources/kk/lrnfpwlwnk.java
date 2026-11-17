package kk;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import npi.spay.Mn;
import spay.sdk.R;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class lrnfpwlwnk extends u0 {

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final /* synthetic */ ah.gtknphoqwx[] f57499yadqdtsiqt = {kotlin.jvm.internal.cllcsxoeiz.eablkybsjg(new kotlin.jvm.internal.esjtqupxsv(lrnfpwlwnk.class, "screenMode", "getScreenMode()Lspay/sdk/domain/OrderScreenMode;", 0))};

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final sj.wypolnanlu f57500agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final wg.eablkybsjg f57501btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public final sj.wypolnanlu f57502cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final sj.wypolnanlu f57503cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final sj.zynmafqrjb f57504draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final s20 f57505dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final xf f57506eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final sj.zynmafqrjb f57507esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final boolean f57508gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final pc f57509gxszxtbevo;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public final sj.zynmafqrjb f57510istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final sj.wypolnanlu f57511iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final PayStrategy f57512jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public final sj.wypolnanlu f57513kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public final sj.wypolnanlu f57514lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final de0 f57515lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final za f57516nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final sj.wypolnanlu f57517ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public final sj.wypolnanlu f57518oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public final sj.zynmafqrjb f57519pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final sj.wypolnanlu f57520rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public final sj.wypolnanlu f57521vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final sj.wypolnanlu f57522wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final wc0 f57523wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final sj.wypolnanlu f57524yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final sj.wypolnanlu f57525zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public final sj.wypolnanlu f57526zynmafqrjb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrnfpwlwnk(bt metricFacade, jlmebxxoox sPayDataContract, wc0 featuresHandler, xf sPayStorage, pc sPaySdkReducer, de0 authHandler, za helperManager, m60 sPaySdkConfigRepository, bx selectCardPreparationHelper, s20 notEnoughMoneyCheckUseCase) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authHandler, "authHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helperManager, "helperManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selectCardPreparationHelper, "selectCardPreparationHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(notEnoughMoneyCheckUseCase, "notEnoughMoneyCheckUseCase");
        this.f57523wkgbmnqykc = featuresHandler;
        this.f57506eablkybsjg = sPayStorage;
        this.f57509gxszxtbevo = sPaySdkReducer;
        this.f57515lqeggnwhkg = authHandler;
        this.f57516nufgyqmvbu = helperManager;
        this.f57505dxjokdxxww = notEnoughMoneyCheckUseCase;
        wg.eablkybsjg eablkybsjgVarIobyxmoadg = wg.iobyxmoadg.f119567iobyxmoadg.iobyxmoadg();
        this.f57501btonecajqb = eablkybsjgVarIobyxmoadg;
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) sPayDataContract;
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(Boolean.valueOf(((hh0) auzgnhcxokVar.f55844cdpycssgdh.getValue()).f56919iobyxmoadg));
        this.f57504draadjrbmk = zynmafqrjbVarIobyxmoadg;
        sj.wypolnanlu wypolnanluVar = auzgnhcxokVar.f55843btonecajqb;
        sj.lqeggnwhkg lqeggnwhkgVarCllcsxoeiz = sj.dxjokdxxww.cllcsxoeiz(wypolnanluVar, new zx(null));
        pj.cllcsxoeiz cllcsxoeizVarIobyxmoadg = androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this);
        sj.jpowsppfya.iobyxmoadg iobyxmoadgVar = sj.jpowsppfya.f106926iobyxmoadg;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb = sj.dxjokdxxww.ribwqtqdhb(lqeggnwhkgVarCllcsxoeiz, cllcsxoeizVarIobyxmoadg, sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f57522wflxmlrfwp = wypolnanluVarRibwqtqdhb;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb2 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVarRibwqtqdhb, new k00(this, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f57500agtfadlqog = wypolnanluVarRibwqtqdhb2;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb3 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVar, new o10(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), iobyxmoadgVar.ppxfxbqfkf(), null);
        this.f57517ojitshcjhn = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.gtknphoqwx(wypolnanluVarRibwqtqdhb2, wypolnanluVarRibwqtqdhb3, zynmafqrjbVarIobyxmoadg, wypolnanluVarRibwqtqdhb, new ku(this, sPayDataContract, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), 0);
        sj.wypolnanlu wypolnanluVarRibwqtqdhb4 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(wypolnanluVar, new ft(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), iobyxmoadgVar.ppxfxbqfkf(), null);
        this.f57520rgvfuqvkyq = wypolnanluVarRibwqtqdhb4;
        this.f57521vdvldrhtss = sj.dxjokdxxww.ribwqtqdhb(new f60(sj.dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f57518oxmwwwfdhm = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.wflxmlrfwp(sj.dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb), sj.dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb2), new ov(this, sPayDataContract, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        sj.wypolnanlu wypolnanluVarRibwqtqdhb5 = sj.dxjokdxxww.ribwqtqdhb(new p90(wypolnanluVar), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f57513kcexrzcfyt = wypolnanluVarRibwqtqdhb5;
        this.f57525zdlpuopuiu = sj.dxjokdxxww.ribwqtqdhb(new hd0(wypolnanluVarRibwqtqdhb5), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), Boolean.FALSE);
        this.f57524yggfygwlhe = sj.dxjokdxxww.ribwqtqdhb(new ug0(sj.dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f57512jyumaefscl = auzgnhcxokVar.btonecajqb();
        this.f57511iwizpuwonk = sj.dxjokdxxww.ribwqtqdhb(new mbcevpiqjq(wypolnanluVarRibwqtqdhb4, this, sPayDataContract, sPaySdkConfigRepository), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        sj.wypolnanlu wypolnanluVarRibwqtqdhb6 = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.draadjrbmk(sj.dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb3), zynmafqrjbVarIobyxmoadg, sj.dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb), new v20(this, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), iobyxmoadgVar.ppxfxbqfkf(), null);
        this.f57503cqumvgiudr = wypolnanluVarRibwqtqdhb6;
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = sj.kegysxyocb.iobyxmoadg(null);
        this.f57507esjtqupxsv = zynmafqrjbVarIobyxmoadg2;
        this.f57514lereixgezr = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.wflxmlrfwp(zynmafqrjbVarIobyxmoadg2, auzgnhcxokVar.f55853iozdgvuglv, new dz(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), iobyxmoadgVar.wkgbmnqykc(), zv.zoijcleaow(R.string.spay_pay_text));
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg3 = sj.kegysxyocb.iobyxmoadg(hg.jyumaefscl.wflxmlrfwp());
        this.f57519pmvmpeiblj = zynmafqrjbVarIobyxmoadg3;
        this.f57526zynmafqrjb = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.draadjrbmk(zynmafqrjbVarIobyxmoadg3, wypolnanluVarRibwqtqdhb6, wypolnanluVarRibwqtqdhb, new bs(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), iobyxmoadgVar.ppxfxbqfkf(), hg.jyumaefscl.wflxmlrfwp());
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg4 = sj.kegysxyocb.iobyxmoadg(hg.ikoacuggdj.eablkybsjg());
        this.f57510istkbnxepw = zynmafqrjbVarIobyxmoadg4;
        this.f57502cdpycssgdh = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg4);
        ij ijVar = (ij) sPayStorage;
        if (!(ijVar.iobyxmoadg().f57485iobyxmoadg instanceof le0)) {
            throw new Mn(ijVar.iobyxmoadg().toString());
        }
        hl hlVar = ijVar.iobyxmoadg().f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.OrderScreenData");
        eablkybsjgVarIobyxmoadg.zoijcleaow(this, f57499yadqdtsiqt[0], ((le0) hlVar).f57463iobyxmoadg);
        hl hlVar2 = ijVar.iobyxmoadg().f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar2, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.OrderScreenData");
        this.f57508gtknphoqwx = ((le0) hlVar2).f57464ppxfxbqfkf;
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), null, null, new im(this, null), 3, null);
    }

    public static final void draadjrbmk(lrnfpwlwnk lrnfpwlwnkVar, Boolean bool) {
        PayStrategy payStrategyStatus = ((auzgnhcxok) lrnfpwlwnkVar.f56063zoijcleaow).btonecajqb();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payStrategyStatus, "payStrategyStatus");
        boolean z13 = false;
        if ((bool != null ? bool.booleanValue() : false) && !(payStrategyStatus instanceof PayStrategy.PayWithPartsOnly)) {
            z13 = true;
        }
        p2.f58029iobyxmoadg = z13;
    }

    public final void agtfadlqog(fl orderFragmentEvent) {
        Object value;
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        xq xqVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderFragmentEvent, "orderFragmentEvent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFragmentEvent, aj.f55826iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(nd.LC_PAY_VIEW_APPEARED, we0.PAY_VIEW, mp.LC, null, null, null, null, 120));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFragmentEvent, dk.f56302iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(nd.LC_PAY_VIEW_DISAPPEARED, we0.PAY_VIEW, mp.LC, null, null, null, null, 120));
            return;
        }
        Integer num = null;
        if (orderFragmentEvent instanceof kd) {
            if (((Collection) this.f57510istkbnxepw.getValue()).isEmpty()) {
                return;
            }
            pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), null, null, new sw(this, null), 3, null);
            return;
        }
        boolean z13 = false;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFragmentEvent, ne.f57799iobyxmoadg)) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFragmentEvent, hc.f56892iobyxmoadg)) {
                ow event = new ow(nd.TOUCH_CANCEL, we0.PAY_VIEW, mp.TOUCH, null, null, null, null, 120);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
                this.f56062iobyxmoadg.iobyxmoadg(event);
                ((ve) this.f58736ppxfxbqfkf).zoijcleaow(ec0.f56401iobyxmoadg);
                return;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFragmentEvent, fb.f56520iobyxmoadg)) {
                ow event2 = new ow(nd.TOUCH_BNPL, we0.PAY_VIEW, mp.TOUCH, null, null, null, null, 120);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event2, "event");
                this.f56062iobyxmoadg.iobyxmoadg(event2);
                if (((PaymentPlanBnplResponseBody) this.f57520rgvfuqvkyq.getValue()) != null) {
                    ((ve) this.f57509gxszxtbevo).zoijcleaow(new pm(bj.f56020iobyxmoadg, false));
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFragmentEvent, pf.f58075iobyxmoadg)) {
                ojitshcjhn();
                ow event3 = new ow(nd.TOUCH_CARD, we0.PAY_VIEW, mp.TOUCH, null, null, null, null, 120);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event3, "event");
                this.f56062iobyxmoadg.iobyxmoadg(event3);
                ((ve) this.f57509gxszxtbevo).zoijcleaow(new za0((gl) this.f57501btonecajqb.iobyxmoadg(this, f57499yadqdtsiqt[0]), null, false));
                return;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFragmentEvent, wh.f59166iobyxmoadg)) {
                ((ve) this.f57509gxszxtbevo).zoijcleaow(new aq(new fy()));
                return;
            } else {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFragmentEvent, ug.f58850iobyxmoadg)) {
                    sj.zynmafqrjb zynmafqrjbVar = this.f57504draadjrbmk;
                    do {
                        value = zynmafqrjbVar.getValue();
                    } while (!zynmafqrjbVar.compareAndSet(value, Boolean.valueOf(!((Boolean) value).booleanValue())));
                    return;
                }
                return;
            }
        }
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = (ListOfCardsResponseBody.PaymentToolInfo.Tool) this.f57500agtfadlqog.getValue();
        if (tool == null || (listOfCardsResponseBody = (ListOfCardsResponseBody) this.f57522wflxmlrfwp.getValue()) == null || (paymentToolInfo = listOfCardsResponseBody.getPaymentToolInfo()) == null || (toolList = paymentToolInfo.getToolList()) == null) {
            return;
        }
        for (ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 : toolList) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tool2.getCardNumber(), tool.getCardNumber())) {
                nd ndVar = nd.TOUCH_PAY;
                we0 we0Var = we0.PAY_VIEW;
                ow event4 = new ow(ndVar, we0Var, mp.TOUCH, null, null, null, null, 120);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event4, "event");
                this.f56062iobyxmoadg.iobyxmoadg(event4);
                wc0 wc0Var = this.f57523wkgbmnqykc;
                uc0 uc0Var = uc0.BNPL;
                boolean z14 = zd0.iobyxmoadg(wc0Var, uc0Var, b6.BY_USER) && zd0.iobyxmoadg(this.f57523wkgbmnqykc, uc0Var, b6.BY_SYSTEM);
                if (z14) {
                    ow event5 = new ow(nd.LC_PAY_BNPL_START, we0Var, mp.LC, null, null, null, null, 120);
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event5, "event");
                    this.f56062iobyxmoadg.iobyxmoadg(event5);
                }
                xq xqVar2 = (xq) this.f57503cqumvgiudr.getValue();
                if (xqVar2 != null && xqVar2.f59323zoijcleaow) {
                    ow event6 = new ow(nd.LC_PAY_SPASIBO_START, we0Var, mp.LC, null, null, null, null, 120);
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event6, "event");
                    this.f56062iobyxmoadg.iobyxmoadg(event6);
                }
                ((auzgnhcxok) this.f56063zoijcleaow).f55864pmvmpeiblj.setValue(Integer.valueOf(((Number) this.f57517ojitshcjhn.getValue()).intValue()));
                ojitshcjhn();
                boolean z15 = zd0.iobyxmoadg(this.f57523wkgbmnqykc, uc0.REFRESH_TOKEN, null) ? ((jf0) this.f57515lqeggnwhkg).f57188eablkybsjg : false;
                pc pcVar = this.f57509gxszxtbevo;
                Boolean boolValueOf = Boolean.valueOf(z15);
                Boolean boolValueOf2 = Boolean.valueOf(z14);
                xq xqVar3 = (xq) this.f57503cqumvgiudr.getValue();
                if (xqVar3 != null && xqVar3.f59323zoijcleaow) {
                    z13 = true;
                }
                xq xqVar4 = (xq) this.f57503cqumvgiudr.getValue();
                if (xqVar4 != null) {
                    Integer numValueOf = Integer.valueOf(xqVar4.f59321iobyxmoadg);
                    xq xqVar5 = (xq) this.f57503cqumvgiudr.getValue();
                    if (xqVar5 != null && xqVar5.f59323zoijcleaow && ((xqVar = (xq) this.f57503cqumvgiudr.getValue()) == null || !xqVar.f59322ppxfxbqfkf)) {
                        num = numValueOf;
                    }
                }
                ((ve) pcVar).zoijcleaow(new mb(boolValueOf, tool2, boolValueOf2, new n80(z13, num)));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void ojitshcjhn() {
        xq xqVar = (xq) this.f57503cqumvgiudr.getValue();
        if (xqVar != null) {
            jlmebxxoox jlmebxxooxVar = this.f56063zoijcleaow;
            boolean z13 = xqVar.f59323zoijcleaow;
            Integer numValueOf = Integer.valueOf(xqVar.f59321iobyxmoadg);
            if (!vdvldrhtss() || !xqVar.f59323zoijcleaow) {
                numValueOf = null;
            }
            hh0 bonuses = new hh0(z13, numValueOf);
            auzgnhcxok auzgnhcxokVar = (auzgnhcxok) jlmebxxooxVar;
            auzgnhcxokVar.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bonuses, "bonuses");
            auzgnhcxokVar.f55854istkbnxepw.setValue(bonuses);
        }
    }

    public final boolean vdvldrhtss() {
        return zd0.zoijcleaow(this.f57523wkgbmnqykc, vf0.ONE_OF) && (((auzgnhcxok) this.f56063zoijcleaow).f55853iozdgvuglv.getValue() instanceof PayStrategy.PayWithBonuses);
    }
}
