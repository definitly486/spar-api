package kk;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import npi.spay.Mn;
import spay.sdk.api.SPayHelpers;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class zj extends ed {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final sj.wypolnanlu f59589agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final sj.wypolnanlu f59590btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final sj.wypolnanlu f59591draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final sj.zynmafqrjb f59592dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final pc f59593eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final sj.zynmafqrjb f59594gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final xf f59595gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final wc0 f59596lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final sj.wypolnanlu f59597nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final sj.wypolnanlu f59598ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final wi f59599rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final sj.zynmafqrjb f59600wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(bt metricFacade, jlmebxxoox sPayDataContract, h7 clearSdkUtil, pc sPaySdkReducer, xf sPayStorage, za helperManager, m60 sPaySdkConfigRepository, wc0 featuresHandler) {
        i10 x0Var;
        ListOfCardsResponseBody.PromoInfo.BannerData.Buttons buttons;
        ListOfCardsResponseBody.PromoInfo.BannerData.Buttons buttons2;
        ListOfCardsResponseBody.PromoInfo.BannerData.Buttons buttons3;
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearSdkUtil, "clearSdkUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helperManager, "helperManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        this.f59593eablkybsjg = sPaySdkReducer;
        this.f59595gxszxtbevo = sPayStorage;
        this.f59596lqeggnwhkg = featuresHandler;
        sj.lqeggnwhkg lqeggnwhkgVarCllcsxoeiz = sj.dxjokdxxww.cllcsxoeiz(((auzgnhcxok) sPayDataContract).f55843btonecajqb, new dc(null));
        pj.cllcsxoeiz cllcsxoeizVarIobyxmoadg = androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this);
        sj.jpowsppfya.iobyxmoadg iobyxmoadgVar = sj.jpowsppfya.f106926iobyxmoadg;
        sj.wypolnanlu wypolnanluVarRibwqtqdhb = sj.dxjokdxxww.ribwqtqdhb(lqeggnwhkgVarCllcsxoeiz, cllcsxoeizVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf(), null);
        this.f59597nufgyqmvbu = wypolnanluVarRibwqtqdhb;
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(hg.jyumaefscl.wflxmlrfwp());
        this.f59592dxjokdxxww = zynmafqrjbVarIobyxmoadg;
        this.f59590btonecajqb = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = sj.kegysxyocb.iobyxmoadg(hg.jyumaefscl.wflxmlrfwp());
        this.f59594gtknphoqwx = zynmafqrjbVarIobyxmoadg2;
        this.f59591draadjrbmk = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg2);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg3 = sj.kegysxyocb.iobyxmoadg(null);
        this.f59600wflxmlrfwp = zynmafqrjbVarIobyxmoadg3;
        this.f59589agtfadlqog = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg3);
        this.f59598ojitshcjhn = sj.dxjokdxxww.ribwqtqdhb(new lf(sj.dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb), sPaySdkConfigRepository), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f59599rgvfuqvkyq = new wi(sj.dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb), this);
        ij ijVar = (ij) sPayStorage;
        if (!(ijVar.iobyxmoadg().f57485iobyxmoadg instanceof l00)) {
            throw new Mn(ijVar.iobyxmoadg().toString());
        }
        hl hlVar = ijVar.iobyxmoadg().f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.HelpersState");
        List listIobyxmoadg = ((l00) hlVar).f57369iobyxmoadg.iobyxmoadg();
        if (listIobyxmoadg != null) {
            ArrayList<ListOfCardsResponseBody.PromoInfo.BannerData> arrayList = new ArrayList();
            for (Object obj : listIobyxmoadg) {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ListOfCardsResponseBody.PromoInfo.BannerData) obj).getType(), SPayHelpers.DEBIT_CARD.getTag())) {
                    arrayList.add(obj);
                }
            }
            sj.zynmafqrjb zynmafqrjbVar = this.f59592dxjokdxxww;
            Collection collection = (Collection) zynmafqrjbVar.getValue();
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, 10));
            for (ListOfCardsResponseBody.PromoInfo.BannerData bannerData : arrayList) {
                if (arrayList.size() == 1) {
                    String header = bannerData.getHeader();
                    String str = header == null ? "" : header;
                    String text = bannerData.getText();
                    String str2 = text == null ? "" : text;
                    List<ListOfCardsResponseBody.PromoInfo.BannerData.Buttons> buttons4 = bannerData.getButtons();
                    String deeplink = (buttons4 == null || (buttons3 = (ListOfCardsResponseBody.PromoInfo.BannerData.Buttons) hg.jyumaefscl.weqkydbzbr(buttons4)) == null) ? null : buttons3.getDeeplink();
                    String str3 = deeplink == null ? "" : deeplink;
                    String iconUrl = bannerData.getIconUrl();
                    x0Var = new n1(str, str2, str3, iconUrl == null ? "" : iconUrl, bannerData.getType());
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bannerData.getType(), SPayHelpers.BNPL.getTag())) {
                    String header2 = bannerData.getHeader();
                    String str4 = header2 == null ? "" : header2;
                    String text2 = bannerData.getText();
                    String str5 = text2 == null ? "" : text2;
                    List<ListOfCardsResponseBody.PromoInfo.BannerData.Buttons> buttons5 = bannerData.getButtons();
                    String deeplink2 = (buttons5 == null || (buttons2 = (ListOfCardsResponseBody.PromoInfo.BannerData.Buttons) hg.jyumaefscl.weqkydbzbr(buttons5)) == null) ? null : buttons2.getDeeplink();
                    String str6 = deeplink2 == null ? "" : deeplink2;
                    String iconUrl2 = bannerData.getIconUrl();
                    x0Var = new gn(str4, str5, str6, iconUrl2 == null ? "" : iconUrl2, bannerData.getType());
                } else {
                    String header3 = bannerData.getHeader();
                    String str7 = header3 == null ? "" : header3;
                    String text3 = bannerData.getText();
                    String str8 = text3 == null ? "" : text3;
                    List<ListOfCardsResponseBody.PromoInfo.BannerData.Buttons> buttons6 = bannerData.getButtons();
                    String deeplink3 = (buttons6 == null || (buttons = (ListOfCardsResponseBody.PromoInfo.BannerData.Buttons) hg.jyumaefscl.weqkydbzbr(buttons6)) == null) ? null : buttons.getDeeplink();
                    String str9 = deeplink3 == null ? "" : deeplink3;
                    String iconUrl3 = bannerData.getIconUrl();
                    x0Var = new x0(str7, str8, str9, iconUrl3 == null ? "" : iconUrl3, bannerData.getType());
                }
                arrayList2.add(x0Var);
            }
            zynmafqrjbVar.setValue(hg.jyumaefscl.ixidwrxhsl(collection, arrayList2));
        }
        List<jo> listIobyxmoadg2 = helperManager.iobyxmoadg();
        sj.zynmafqrjb zynmafqrjbVar2 = this.f59594gtknphoqwx;
        ArrayList arrayList3 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg2, 10));
        for (jo joVar : listIobyxmoadg2) {
            arrayList3.add(new np(joVar.f57212iobyxmoadg, joVar.f57213zoijcleaow));
        }
        zynmafqrjbVar2.setValue(arrayList3);
    }

    public final void draadjrbmk(b60 mainHelpersEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mainHelpersEvent, "mainHelpersEvent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(mainHelpersEvent, yy.f59496iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(em.TOUCH_CANCEL, we0.HELPERS_VIEW, mp.TOUCH, null, null, null, null, 120));
            ((ve) this.f59593eablkybsjg).zoijcleaow(ec0.f56401iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(mainHelpersEvent, d00.f56205iobyxmoadg)) {
            if (((Collection) this.f59594gtknphoqwx.getValue()).isEmpty()) {
                return;
            }
            pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), null, null, new bb(this, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(mainHelpersEvent, v30.f58942iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(em.LC_HELPERS_VIEW_APPEARED, we0.HELPERS_VIEW, mp.LCStart, null, null, null, null, 120));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(mainHelpersEvent, y40.f59383iobyxmoadg)) {
            this.f56062iobyxmoadg.iobyxmoadg(new ow(em.LC_HELPERS_VIEW_DISAPPEARED, we0.HELPERS_VIEW, mp.LCEnd, null, null, null, null, 120));
            return;
        }
        if (!(mainHelpersEvent instanceof p20)) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(mainHelpersEvent, j10.f57133iobyxmoadg)) {
                pc pcVar = this.f59593eablkybsjg;
                hl hlVar = ((ij) this.f59595gxszxtbevo).iobyxmoadg().f57485iobyxmoadg;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.HelpersState");
                ((ve) pcVar).zoijcleaow(new aq(new xw(((l00) hlVar).f57369iobyxmoadg)));
                return;
            }
            return;
        }
        p20 p20Var = (p20) mainHelpersEvent;
        if (p20Var.f58031iobyxmoadg.a().length() > 0) {
            sj.zynmafqrjb zynmafqrjbVar = this.f59600wflxmlrfwp;
            Uri uri = Uri.parse(p20Var.f58031iobyxmoadg.a());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uri, "parse(this)");
            zynmafqrjbVar.setValue(new hg(uri));
            ((ve) this.f59593eablkybsjg).zoijcleaow(ec0.f56401iobyxmoadg);
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(p20Var.f58031iobyxmoadg.b(), SPayHelpers.BNPL.getTag())) {
            long jIobyxmoadg = ((auzgnhcxok) this.f56063zoijcleaow).iobyxmoadg();
            wc0 wc0Var = this.f59596lqeggnwhkg;
            uc0 tag = uc0.BNPL;
            wc0Var.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
            y60 y60Var = (y60) wc0Var.f59129wkgbmnqykc.get(tag);
            if (y60Var != null) {
                y60Var.zoijcleaow(new j9(true));
            }
            auzgnhcxok auzgnhcxokVar = (auzgnhcxok) this.f56063zoijcleaow;
            auzgnhcxokVar.f55842agtfadlqog.setValue(Long.valueOf(jIobyxmoadg));
            PayStrategy.PayWithPartsOnly status = PayStrategy.PayWithPartsOnly.INSTANCE;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(status, "status");
            auzgnhcxokVar.f55871yadqdtsiqt.setValue(status);
            ((ve) this.f59593eablkybsjg).zoijcleaow(er.f56448iobyxmoadg);
        }
        if (p20Var.f58031iobyxmoadg.a().length() > 0) {
            this.f59600wflxmlrfwp.setValue(new hg(Uri.parse(p20Var.f58031iobyxmoadg.a())));
        }
        this.f56062iobyxmoadg.iobyxmoadg(new ow(kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(p20Var.f58031iobyxmoadg.b(), SPayHelpers.SBP.getTag()) ? em.TOUCH_MAKE_TRANSFER : em.TOUCH_MAKE_CARD, we0.HELPERS_VIEW, mp.TOUCH, null, null, null, null, 120));
    }
}
