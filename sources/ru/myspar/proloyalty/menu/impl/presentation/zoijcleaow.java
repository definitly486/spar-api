package ru.myspar.proloyalty.menu.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m21.dxjokdxxww;
import od1.lqeggnwhkg;
import pd1.nufgyqmvbu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.menu.impl.domain.store.State;
import ru.myspar.proloyalty.specialbanner.api.models.SpecialBannerPayload;
import tg.draadjrbmk;
import xm0.eablkybsjg;
import xm0.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final kq1.iobyxmoadg f98091agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final vw1.iobyxmoadg f98092btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final kg1.iobyxmoadg f98093draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final k71.iobyxmoadg f98094gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final vm0.zoijcleaow f98095ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final draadjrbmk f98096oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final q41.iobyxmoadg f98097rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final draadjrbmk f98098vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final bl1.iobyxmoadg f98099wflxmlrfwp;

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: ru.myspar.proloyalty.menu.impl.presentation.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2325iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C2325iobyxmoadg f98100iobyxmoadg = new C2325iobyxmoadg();

            private C2325iobyxmoadg() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2325iobyxmoadg);
            }

            public int hashCode() {
                return -150128060;
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
    public zoijcleaow(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, vw1.iobyxmoadg webViewScreenFeatureApi, k71.iobyxmoadg echecksFeatureApi, kg1.iobyxmoadg partnersFeatureApi, bl1.iobyxmoadg feedbackFeatureApi, kq1.iobyxmoadg specialBannerFeatureApi, vm0.zoijcleaow analyticsTracker, q41.iobyxmoadg resourcesManager, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(webViewScreenFeatureApi, "webViewScreenFeatureApi");
        zdlpuopuiu.btonecajqb(echecksFeatureApi, "echecksFeatureApi");
        zdlpuopuiu.btonecajqb(partnersFeatureApi, "partnersFeatureApi");
        zdlpuopuiu.btonecajqb(feedbackFeatureApi, "feedbackFeatureApi");
        zdlpuopuiu.btonecajqb(specialBannerFeatureApi, "specialBannerFeatureApi");
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f98092btonecajqb = webViewScreenFeatureApi;
        this.f98094gtknphoqwx = echecksFeatureApi;
        this.f98093draadjrbmk = partnersFeatureApi;
        this.f98099wflxmlrfwp = feedbackFeatureApi;
        this.f98091agtfadlqog = specialBannerFeatureApi;
        this.f98095ojitshcjhn = analyticsTracker;
        this.f98097rgvfuqvkyq = resourcesManager;
        this.f98098vdvldrhtss = new draadjrbmk() { // from class: pd1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.menu.impl.presentation.zoijcleaow.sopmlzcsov((State) obj);
            }
        };
        this.f98096oxmwwwfdhm = new draadjrbmk() { // from class: pd1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.menu.impl.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.proloyalty.menu.impl.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    private final void crxdokpmqz(AnalyticsPage analyticsPage) {
        this.f98095ojitshcjhn.wkgbmnqykc(new eablkybsjg(new gxszxtbevo(AnalyticsPage.Menu.f92335iwizpuwonk, analyticsPage, null, null, null, 28, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final od1.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        od1.wkgbmnqykc iobyxmoadgVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f98087iobyxmoadg)) {
            return od1.wkgbmnqykc.zoijcleaow.f72691iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2324ppxfxbqfkf) {
            iobyxmoadgVar = new od1.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2324ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            iobyxmoadgVar = new od1.wkgbmnqykc.C1576wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.eablkybsjg) {
            iobyxmoadgVar = new od1.wkgbmnqykc.eablkybsjg(((ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadgVar = new od1.wkgbmnqykc.iobyxmoadg(((ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).iobyxmoadg());
        }
        return iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        boolean isLoading = state.getIsLoading();
        List<nd1.iobyxmoadg> menuItems = state.getMenuItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(menuItems, 10));
        for (nd1.iobyxmoadg iobyxmoadgVar : menuItems) {
            arrayList.add(new rd1.iobyxmoadg(iobyxmoadgVar.name(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.lqeggnwhkg(), !jyumaefscl.rgvfuqvkyq(nd1.iobyxmoadg.SPAR_WINE, nd1.iobyxmoadg.SWEET_LIFE).contains(iobyxmoadgVar), 0, 16, null));
        }
        return new nufgyqmvbu(isLoading, arrayList);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f98098vdvldrhtss;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f98096oxmwwwfdhm;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(od1.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof od1.eablkybsjg.wflxmlrfwp) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(((od1.eablkybsjg.wflxmlrfwp) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof od1.eablkybsjg.ppxfxbqfkf) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.vdvldrhtss(this.f98097rgvfuqvkyq.getString(md1.ppxfxbqfkf.proloyalty_other_share_description)));
        } else if (eablkybsjgVar instanceof od1.eablkybsjg.btonecajqb) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.jyumaefscl(((od1.eablkybsjg.btonecajqb) eablkybsjgVar).iobyxmoadg()));
        } else if (eablkybsjgVar instanceof od1.eablkybsjg.oxmwwwfdhm) {
            od1.eablkybsjg.oxmwwwfdhm oxmwwwfdhmVar = (od1.eablkybsjg.oxmwwwfdhm) eablkybsjgVar;
            crxdokpmqz(new AnalyticsPage.LandingPage("", oxmwwwfdhmVar.iobyxmoadg()));
            i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f98091agtfadlqog.wkgbmnqykc(new SpecialBannerPayload(null, null, oxmwwwfdhmVar.iobyxmoadg(), oxmwwwfdhmVar.zoijcleaow(), oxmwwwfdhmVar.ppxfxbqfkf(), 2, null)));
        } else {
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, od1.eablkybsjg.vdvldrhtss.f72648iobyxmoadg)) {
                Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.zoijcleaow.f98090iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, od1.eablkybsjg.gxszxtbevo.f72632iobyxmoadg)) {
                crxdokpmqz(AnalyticsPage.LegalInformation.f92331iwizpuwonk);
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f98092btonecajqb.zoijcleaow());
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, od1.eablkybsjg.zoijcleaow.f72651iobyxmoadg)) {
                crxdokpmqz(AnalyticsPage.DeliveryPayment.f92317iwizpuwonk);
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f98092btonecajqb.iobyxmoadg());
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, od1.eablkybsjg.agtfadlqog.f72626iobyxmoadg)) {
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.legacy.presentation.screen.sharepromo.zoijcleaow.zoijcleaow());
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, od1.eablkybsjg.draadjrbmk.f72628iobyxmoadg)) {
                crxdokpmqz(AnalyticsPage.Partners.f92347iwizpuwonk);
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f98093draadjrbmk.iobyxmoadg());
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, od1.eablkybsjg.ojitshcjhn.f72636iobyxmoadg)) {
                crxdokpmqz(AnalyticsPage.Shops.f92379iwizpuwonk);
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.legacy.presentation.screen.shops.zoijcleaow.ppxfxbqfkf(null, 1, null));
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, od1.eablkybsjg.wkgbmnqykc.f72650iobyxmoadg)) {
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.kcexrzcfyt());
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, od1.eablkybsjg.C1574eablkybsjg.f72630iobyxmoadg)) {
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(bl1.iobyxmoadg.zoijcleaow(this.f98099wflxmlrfwp, null, 1, null));
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, od1.eablkybsjg.dxjokdxxww.f72629iobyxmoadg)) {
                crxdokpmqz(AnalyticsPage.Echecks.f92321iwizpuwonk);
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f98094gtknphoqwx.zoijcleaow());
            } else if (eablkybsjgVar instanceof od1.eablkybsjg.lqeggnwhkg) {
                crxdokpmqz(AnalyticsPage.Career.f92303iwizpuwonk);
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.jyumaefscl(((od1.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()));
            } else if (eablkybsjgVar instanceof od1.eablkybsjg.gtknphoqwx) {
                crxdokpmqz(AnalyticsPage.External.f92323iwizpuwonk);
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(vw1.iobyxmoadg.nufgyqmvbu(this.f98092btonecajqb, ((od1.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg(), null, null, this.f98097rgvfuqvkyq.getString(nd1.iobyxmoadg.SPAR_BUSINESS.lqeggnwhkg()), 4, null));
            } else if (eablkybsjgVar instanceof od1.eablkybsjg.nufgyqmvbu) {
                crxdokpmqz(AnalyticsPage.SupportChat.f92389iwizpuwonk);
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f98092btonecajqb.ppxfxbqfkf());
            } else {
                if (eablkybsjgVar instanceof od1.eablkybsjg.rgvfuqvkyq) {
                    Object objCllcsxoeiz3 = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((od1.eablkybsjg.rgvfuqvkyq) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, od1.eablkybsjg.iobyxmoadg.f72633iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
