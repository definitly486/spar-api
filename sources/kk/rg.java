package kk;

import android.net.Uri;
import java.util.List;
import spay.sdk.api.SPayHelpers;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class rg extends ed {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final sj.wypolnanlu f58327btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final sj.zynmafqrjb f58328dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final pc f58329eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Uri f58330gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final sj.wypolnanlu f58331lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final sj.wypolnanlu f58332nufgyqmvbu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(bt metricFacade, jlmebxxoox sPayDataContract, h7 clearSdkUtil, pc sPaySdkReducer, xf sPayStorage, za helperManager) {
        ListOfCardsResponseBody.PromoInfo.BannerData bannerData;
        ListOfCardsResponseBody.PromoInfo.BannerData.Buttons buttons;
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearSdkUtil, "clearSdkUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helperManager, "helperManager");
        this.f58329eablkybsjg = sPaySdkReducer;
        hl hlVar = ((ln) ((ij) sPayStorage).f57056zoijcleaow.getValue()).f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.HelpersState");
        l00 l00Var = (l00) hlVar;
        String deeplink = null;
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(null);
        this.f58331lqeggnwhkg = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = sj.kegysxyocb.iobyxmoadg(null);
        this.f58332nufgyqmvbu = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg2);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg3 = sj.kegysxyocb.iobyxmoadg(null);
        this.f58328dxjokdxxww = zynmafqrjbVarIobyxmoadg3;
        this.f58327btonecajqb = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg3);
        zynmafqrjbVarIobyxmoadg.iobyxmoadg(hg.jyumaefscl.m(((auzgnhcxok) helperManager.f59556zoijcleaow).f55849esjtqupxsv).contains(SPayHelpers.DEBIT_CARD) ? mf.DEBIT_CARD : mf.ERROR);
        List listIobyxmoadg = l00Var.f57369iobyxmoadg.iobyxmoadg();
        if (listIobyxmoadg == null || (bannerData = (ListOfCardsResponseBody.PromoInfo.BannerData) hg.jyumaefscl.weqkydbzbr(listIobyxmoadg)) == null) {
            return;
        }
        List<ListOfCardsResponseBody.PromoInfo.BannerData.Buttons> buttons2 = bannerData.getButtons();
        if (buttons2 != null && (buttons = (ListOfCardsResponseBody.PromoInfo.BannerData.Buttons) hg.jyumaefscl.weqkydbzbr(buttons2)) != null) {
            deeplink = buttons.getDeeplink();
        }
        this.f58330gxszxtbevo = Uri.parse(deeplink);
        zynmafqrjbVarIobyxmoadg2.iobyxmoadg(bannerData);
    }

    public final void draadjrbmk(hn noMatchingCardsHelperEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noMatchingCardsHelperEvent, "noMatchingCardsHelperEvent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(noMatchingCardsHelperEvent, xi.f59308iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(vh0.TOUCH_CANCEL, we0.NO_ACTIVE_CARDS_VIEW, mp.TOUCH, null, null, null, null, 120));
            ((ve) this.f58329eablkybsjg).zoijcleaow(ec0.f56401iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(noMatchingCardsHelperEvent, ak.f55827iobyxmoadg)) {
            this.f58328dxjokdxxww.iobyxmoadg(new hg(this.f58330gxszxtbevo));
            this.f56062iobyxmoadg.iobyxmoadg(new ow(vh0.TOUCH_ISSUE_CARD, we0.NO_ACTIVE_CARDS_VIEW, mp.TOUCH, null, null, null, null, 120));
            ((ve) this.f58329eablkybsjg).zoijcleaow(ec0.f56401iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(noMatchingCardsHelperEvent, cl.f56170iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(vh0.LC_NO_ACTIVE_CARDS_VIEW_APPEARED, we0.NO_ACTIVE_CARDS_VIEW, mp.LCStart, null, null, null, null, 120));
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(noMatchingCardsHelperEvent, fm.f56576iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(vh0.LC_NO_ACTIVE_CARDS_VIEW_DISAPPEARED, we0.NO_ACTIVE_CARDS_VIEW, mp.LCEnd, null, null, null, null, 120));
        }
    }
}
