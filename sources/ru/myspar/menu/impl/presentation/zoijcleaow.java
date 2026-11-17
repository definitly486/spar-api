package ru.myspar.menu.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import h40.dxjokdxxww;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import jg0.lqeggnwhkg;
import kg0.nufgyqmvbu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import no.eablkybsjg;
import no.gxszxtbevo;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.menu.impl.domain.store.State;
import ru.myspar.specialbanner.api.models.SpecialBannerPayload;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final r42.iobyxmoadg f90481agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ya2.iobyxmoadg f90482btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final jj0.iobyxmoadg f90483draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final a90.iobyxmoadg f90484gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final lo.zoijcleaow f90485ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final draadjrbmk f90486oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final d60.iobyxmoadg f90487rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final draadjrbmk f90488vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final kz1.iobyxmoadg f90489wflxmlrfwp;

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: ru.myspar.menu.impl.presentation.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2080iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C2080iobyxmoadg f90490iobyxmoadg = new C2080iobyxmoadg();

            private C2080iobyxmoadg() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2080iobyxmoadg);
            }

            public int hashCode() {
                return -597373535;
            }

            public String toString() {
                return "SparWine";
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ya2.iobyxmoadg webViewScreenFeatureApi, a90.iobyxmoadg echecksFeatureApi, jj0.iobyxmoadg partnersFeatureApi, kz1.iobyxmoadg feedbackFeatureApi, r42.iobyxmoadg specialBannerFeatureApi, lo.zoijcleaow analyticsTracker, d60.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(webViewScreenFeatureApi, "webViewScreenFeatureApi");
        zdlpuopuiu.btonecajqb(echecksFeatureApi, "echecksFeatureApi");
        zdlpuopuiu.btonecajqb(partnersFeatureApi, "partnersFeatureApi");
        zdlpuopuiu.btonecajqb(feedbackFeatureApi, "feedbackFeatureApi");
        zdlpuopuiu.btonecajqb(specialBannerFeatureApi, "specialBannerFeatureApi");
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f90482btonecajqb = webViewScreenFeatureApi;
        this.f90484gtknphoqwx = echecksFeatureApi;
        this.f90483draadjrbmk = partnersFeatureApi;
        this.f90489wflxmlrfwp = feedbackFeatureApi;
        this.f90481agtfadlqog = specialBannerFeatureApi;
        this.f90485ojitshcjhn = analyticsTracker;
        this.f90487rgvfuqvkyq = resourcesManager;
        this.f90488vdvldrhtss = new draadjrbmk() { // from class: kg0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.menu.impl.presentation.zoijcleaow.sopmlzcsov((State) obj);
            }
        };
        this.f90486oxmwwwfdhm = new draadjrbmk() { // from class: kg0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.menu.impl.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.menu.impl.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    private final void crxdokpmqz(AnalyticsPage analyticsPage) {
        this.f90485ojitshcjhn.ppxfxbqfkf(new eablkybsjg(new gxszxtbevo(AnalyticsPage.Menu.f84307iwizpuwonk, analyticsPage, null, null, null, 28, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jg0.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        jg0.wkgbmnqykc iobyxmoadgVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f90477iobyxmoadg)) {
            return jg0.wkgbmnqykc.zoijcleaow.f51277iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2079ppxfxbqfkf) {
            iobyxmoadgVar = new jg0.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2079ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            iobyxmoadgVar = new jg0.wkgbmnqykc.C1103wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.eablkybsjg) {
            iobyxmoadgVar = new jg0.wkgbmnqykc.eablkybsjg(((ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadgVar = new jg0.wkgbmnqykc.iobyxmoadg(((ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).iobyxmoadg());
        }
        return iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        boolean isLoading = state.getIsLoading();
        List<ig0.iobyxmoadg> menuItems = state.getMenuItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(menuItems, 10));
        for (ig0.iobyxmoadg iobyxmoadgVar : menuItems) {
            arrayList.add(new mg0.iobyxmoadg(iobyxmoadgVar.name(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.lqeggnwhkg(), !jyumaefscl.rgvfuqvkyq(ig0.iobyxmoadg.SPAR_WINE, ig0.iobyxmoadg.SWEET_LIFE).contains(iobyxmoadgVar), 0, 16, null));
        }
        return new nufgyqmvbu(isLoading, arrayList);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f90488vdvldrhtss;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f90486oxmwwwfdhm;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(jg0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof jg0.eablkybsjg.draadjrbmk) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(((jg0.eablkybsjg.draadjrbmk) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof jg0.eablkybsjg.ppxfxbqfkf) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.vdvldrhtss(this.f90487rgvfuqvkyq.getString(hg0.ppxfxbqfkf.other_share_description)));
        } else if (eablkybsjgVar instanceof jg0.eablkybsjg.btonecajqb) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.jyumaefscl(((jg0.eablkybsjg.btonecajqb) eablkybsjgVar).iobyxmoadg()));
        } else if (eablkybsjgVar instanceof jg0.eablkybsjg.vdvldrhtss) {
            jg0.eablkybsjg.vdvldrhtss vdvldrhtssVar = (jg0.eablkybsjg.vdvldrhtss) eablkybsjgVar;
            crxdokpmqz(new AnalyticsPage.LandingPage("", vdvldrhtssVar.iobyxmoadg()));
            d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f90481agtfadlqog.iobyxmoadg(new SpecialBannerPayload(null, null, vdvldrhtssVar.iobyxmoadg(), vdvldrhtssVar.zoijcleaow(), vdvldrhtssVar.ppxfxbqfkf(), 2, null)));
        } else {
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, jg0.eablkybsjg.rgvfuqvkyq.f51223iobyxmoadg)) {
                Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.zoijcleaow.f90480iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, jg0.eablkybsjg.gxszxtbevo.f51217iobyxmoadg)) {
                crxdokpmqz(AnalyticsPage.LegalInformation.f84303iwizpuwonk);
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f90482btonecajqb.zoijcleaow());
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, jg0.eablkybsjg.zoijcleaow.f51235iobyxmoadg)) {
                crxdokpmqz(AnalyticsPage.DeliveryPayment.f84289iwizpuwonk);
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f90482btonecajqb.iobyxmoadg());
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, jg0.eablkybsjg.wflxmlrfwp.f51233iobyxmoadg)) {
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.legacy.presentation.screen.sharepromo.zoijcleaow.zoijcleaow());
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, jg0.eablkybsjg.gtknphoqwx.f51216iobyxmoadg)) {
                crxdokpmqz(AnalyticsPage.Partners.f84319iwizpuwonk);
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f90483draadjrbmk.iobyxmoadg());
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, jg0.eablkybsjg.agtfadlqog.f51211iobyxmoadg)) {
                crxdokpmqz(AnalyticsPage.Shops.f84351iwizpuwonk);
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.legacy.presentation.screen.shops.zoijcleaow.ppxfxbqfkf(null, 1, null));
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, jg0.eablkybsjg.wkgbmnqykc.f51234iobyxmoadg)) {
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.kcexrzcfyt());
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, jg0.eablkybsjg.C1101eablkybsjg.f51215iobyxmoadg)) {
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(kz1.iobyxmoadg.zoijcleaow(this.f90489wflxmlrfwp, null, 1, null));
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, jg0.eablkybsjg.dxjokdxxww.f51214iobyxmoadg)) {
                crxdokpmqz(AnalyticsPage.Echecks.f84293iwizpuwonk);
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f90484gtknphoqwx.zoijcleaow());
            } else if (eablkybsjgVar instanceof jg0.eablkybsjg.lqeggnwhkg) {
                crxdokpmqz(AnalyticsPage.Career.f84275iwizpuwonk);
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.jyumaefscl(((jg0.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()));
            } else if (eablkybsjgVar instanceof jg0.eablkybsjg.nufgyqmvbu) {
                crxdokpmqz(AnalyticsPage.SupportChat.f84361iwizpuwonk);
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f90482btonecajqb.ppxfxbqfkf());
            } else {
                if (eablkybsjgVar instanceof jg0.eablkybsjg.ojitshcjhn) {
                    Object objCllcsxoeiz3 = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((jg0.eablkybsjg.ojitshcjhn) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, jg0.eablkybsjg.iobyxmoadg.f51218iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
