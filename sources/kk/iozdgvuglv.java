package kk;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import npi.spay.Mn;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class iozdgvuglv extends u0 {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final /* synthetic */ ah.gtknphoqwx[] f57074draadjrbmk = {kotlin.jvm.internal.cllcsxoeiz.eablkybsjg(new kotlin.jvm.internal.esjtqupxsv(iozdgvuglv.class, "screenMode", "getScreenMode()Lspay/sdk/domain/OrderScreenMode;", 0))};

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final sj.wypolnanlu f57075btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final sj.wypolnanlu f57076dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final pc f57077eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final sj.wypolnanlu f57078gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final wc0 f57079gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final wg.eablkybsjg f57080lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final gg.gtknphoqwx f57081nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final xf f57082wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iozdgvuglv(bt metricFacade, jlmebxxoox sPayDataContract, xf sPayStorage, pc sPaySdkReducer, wc0 featuresHandler) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        this.f57082wkgbmnqykc = sPayStorage;
        this.f57077eablkybsjg = sPaySdkReducer;
        this.f57079gxszxtbevo = featuresHandler;
        wg.eablkybsjg eablkybsjgVarIobyxmoadg = wg.iobyxmoadg.f119567iobyxmoadg.iobyxmoadg();
        this.f57080lqeggnwhkg = eablkybsjgVarIobyxmoadg;
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) sPayDataContract;
        sj.zynmafqrjb zynmafqrjbVar = auzgnhcxokVar.f55863oxmwwwfdhm;
        this.f57081nufgyqmvbu = gg.draadjrbmk.zoijcleaow(new cf0(sPayDataContract, this));
        sj.lqeggnwhkg lqeggnwhkgVarCllcsxoeiz = sj.dxjokdxxww.cllcsxoeiz(zynmafqrjbVar, new gg0(null));
        pj.cllcsxoeiz cllcsxoeizVarIobyxmoadg = androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this);
        sj.jpowsppfya.iobyxmoadg iobyxmoadgVar = sj.jpowsppfya.f106926iobyxmoadg;
        this.f57076dxjokdxxww = sj.dxjokdxxww.ribwqtqdhb(lqeggnwhkgVarCllcsxoeiz, cllcsxoeizVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf(), null);
        this.f57075btonecajqb = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.draadjrbmk(sj.dxjokdxxww.lereixgezr(sj.dxjokdxxww.zoijcleaow(auzgnhcxokVar.f55842agtfadlqog)), sj.dxjokdxxww.lereixgezr(zynmafqrjbVar), auzgnhcxokVar.f55844cdpycssgdh, new lh0(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(null);
        this.f57078gtknphoqwx = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
        ij ijVar = (ij) sPayStorage;
        if (!(ijVar.iobyxmoadg().f57485iobyxmoadg instanceof rf0)) {
            throw new Mn(ijVar.iobyxmoadg().toString());
        }
        hl hlVar = ijVar.iobyxmoadg().f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.OrderScreenSelectCard");
        rf0 rf0Var = (rf0) hlVar;
        eablkybsjgVarIobyxmoadg.zoijcleaow(this, f57074draadjrbmk[0], rf0Var.f58325iobyxmoadg);
        zynmafqrjbVarIobyxmoadg.setValue(rf0Var.f58326zoijcleaow);
    }

    public final void draadjrbmk(bd0 event) {
        Object next;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, j90.f57169iobyxmoadg)) {
            ow event2 = new ow(ee0.LC_LIST_CARD_VIEW_APPEARED, we0.LIST_CARD_VIEW, mp.LC, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event2, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event2);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, na0.f57751iobyxmoadg)) {
            ow event3 = new ow(ee0.LC_LIST_CARD_VIEW_DISAPPEARED, we0.LIST_CARD_VIEW, mp.LC, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event3, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event3);
            return;
        }
        if (!(event instanceof sb0)) {
            throw new NoWhenBranchMatchedException();
        }
        l6 l6Var = ((sb0) event).f58543iobyxmoadg;
        ow event4 = new ow(ee0.TOUCH_CARD, we0.LIST_CARD_VIEW, mp.TOUCH, null, null, null, null, 120);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event4, "event");
        this.f56062iobyxmoadg.iobyxmoadg(event4);
        List list = (List) this.f57076dxjokdxxww.getValue();
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ListOfCardsResponseBody.PaymentToolInfo.Tool) next).getCardNumber(), l6Var.f57400ojitshcjhn));
            ListOfCardsResponseBody.PaymentToolInfo.Tool incomeSelectedCard = (ListOfCardsResponseBody.PaymentToolInfo.Tool) next;
            if (incomeSelectedCard != null) {
                ij ijVar = (ij) this.f57082wkgbmnqykc;
                ijVar.getClass();
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(incomeSelectedCard, "incomeSelectedCard");
                sj.zynmafqrjb zynmafqrjbVar = ijVar.f57055iobyxmoadg;
                zynmafqrjbVar.setValue(ln.iobyxmoadg((ln) zynmafqrjbVar.getValue(), null, incomeSelectedCard, false, 5));
            }
        }
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), null, null, new wkgbmnqykc(this, null), 3, null);
    }
}
