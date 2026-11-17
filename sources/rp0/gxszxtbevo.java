package rp0;

import java.util.List;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogBanner;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSet;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.domain.feature.filters.store.FiltersArgs;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.proloyalty.story.domain.model.StoryItem;
import ru.myspar.proloyalty.story.domain.model.StoryNavLink;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class agtfadlqog implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f83330iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return 1863565032;
        }

        public String toString() {
            return "ShowDialogAfterAddComboToBasket";
        }
    }

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductListPayload f83331iobyxmoadg;

        public btonecajqb(ProductListPayload payload) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
            this.f83331iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83331iobyxmoadg, ((btonecajqb) obj).f83331iobyxmoadg);
        }

        public int hashCode() {
            return this.f83331iobyxmoadg.hashCode();
        }

        public final ProductListPayload iobyxmoadg() {
            return this.f83331iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSearchProductScreen(payload=" + this.f83331iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final StoryItem f83332iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final StoryNavLink f83333zoijcleaow;

        public cqumvgiudr(StoryItem story, StoryNavLink endPoint) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(story, "story");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(endPoint, "endPoint");
            this.f83332iobyxmoadg = story;
            this.f83333zoijcleaow = endPoint;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof cqumvgiudr)) {
                return false;
            }
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83332iobyxmoadg, cqumvgiudrVar.f83332iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83333zoijcleaow, cqumvgiudrVar.f83333zoijcleaow);
        }

        public int hashCode() {
            return (this.f83332iobyxmoadg.hashCode() * 31) + this.f83333zoijcleaow.hashCode();
        }

        public final StoryNavLink iobyxmoadg() {
            return this.f83333zoijcleaow;
        }

        public String toString() {
            return "ShowStory(story=" + this.f83332iobyxmoadg + ", endPoint=" + this.f83333zoijcleaow + ")";
        }

        public final StoryItem zoijcleaow() {
            return this.f83332iobyxmoadg;
        }
    }

    public static final class draadjrbmk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AnalyticsPayload f83334iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final CatalogBanner f83335zoijcleaow;

        public draadjrbmk(AnalyticsPayload analyticsPayload, CatalogBanner banner) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsPayload, "analyticsPayload");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
            this.f83334iobyxmoadg = analyticsPayload;
            this.f83335zoijcleaow = banner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83334iobyxmoadg, draadjrbmkVar.f83334iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83335zoijcleaow, draadjrbmkVar.f83335zoijcleaow);
        }

        public int hashCode() {
            return (this.f83334iobyxmoadg.hashCode() * 31) + this.f83335zoijcleaow.hashCode();
        }

        public final AnalyticsPayload iobyxmoadg() {
            return this.f83334iobyxmoadg;
        }

        public String toString() {
            return "SendNavigationPayload(analyticsPayload=" + this.f83334iobyxmoadg + ", banner=" + this.f83335zoijcleaow + ")";
        }

        public final CatalogBanner zoijcleaow() {
            return this.f83335zoijcleaow;
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f83336iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -1414039627;
        }

        public String toString() {
            return "NavigateToScanProductScreen";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f83337zoijcleaow = FiltersArgs.f95501lereixgezr;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final FiltersArgs f83338iobyxmoadg;

        public eablkybsjg(FiltersArgs filtersArgs) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(filtersArgs, "filtersArgs");
            this.f83338iobyxmoadg = filtersArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83338iobyxmoadg, ((eablkybsjg) obj).f83338iobyxmoadg);
        }

        public int hashCode() {
            return this.f83338iobyxmoadg.hashCode();
        }

        public final FiltersArgs iobyxmoadg() {
            return this.f83338iobyxmoadg;
        }

        public String toString() {
            return "NavigateToFiltersScreen(filtersArgs=" + this.f83338iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final esjtqupxsv f83339iobyxmoadg = new esjtqupxsv();

        private esjtqupxsv() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof esjtqupxsv);
        }

        public int hashCode() {
            return -1979529813;
        }

        public String toString() {
            return "ShowSuccessAddedToOrderMessage";
        }
    }

    public static final class gtknphoqwx implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f83340iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return -536042640;
        }

        public String toString() {
            return "ScrollToTop";
        }
    }

    /* JADX INFO: renamed from: rp0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1869gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1869gxszxtbevo f83341iobyxmoadg = new C1869gxszxtbevo();

        private C1869gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1869gxszxtbevo);
        }

        public int hashCode() {
            return -1843780085;
        }

        public String toString() {
            return "NavigateToNonAuthorizedScreen";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final int f83342wkgbmnqykc = AnalyticsPayload.f95299iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final k21.ojitshcjhn f83343iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsPayload f83344ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83345zoijcleaow;

        public iobyxmoadg(k21.ojitshcjhn navLink, String str, AnalyticsPayload analyticsPayload) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsPayload, "analyticsPayload");
            this.f83343iobyxmoadg = navLink;
            this.f83345zoijcleaow = str;
            this.f83344ppxfxbqfkf = analyticsPayload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f83343iobyxmoadg == iobyxmoadgVar.f83343iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83345zoijcleaow, iobyxmoadgVar.f83345zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83344ppxfxbqfkf, iobyxmoadgVar.f83344ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f83343iobyxmoadg.hashCode() * 31;
            String str = this.f83345zoijcleaow;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f83344ppxfxbqfkf.hashCode();
        }

        public final k21.ojitshcjhn iobyxmoadg() {
            return this.f83343iobyxmoadg;
        }

        public String toString() {
            return "HandleNavLink(navLink=" + this.f83343iobyxmoadg + ", reference=" + this.f83345zoijcleaow + ", analyticsPayload=" + this.f83344ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f83345zoijcleaow;
        }
    }

    public static final class iwizpuwonk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f83346iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ColorsModel f83347ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f83348zoijcleaow;

        public iwizpuwonk(mz0.ppxfxbqfkf selected, List supportedTypes, ColorsModel colorsModel) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selected, "selected");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(supportedTypes, "supportedTypes");
            this.f83346iobyxmoadg = selected;
            this.f83348zoijcleaow = supportedTypes;
            this.f83347ppxfxbqfkf = colorsModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iwizpuwonk)) {
                return false;
            }
            iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
            return this.f83346iobyxmoadg == iwizpuwonkVar.f83346iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83348zoijcleaow, iwizpuwonkVar.f83348zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83347ppxfxbqfkf, iwizpuwonkVar.f83347ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f83346iobyxmoadg.hashCode() * 31) + this.f83348zoijcleaow.hashCode()) * 31;
            ColorsModel colorsModel = this.f83347ppxfxbqfkf;
            return iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode());
        }

        public final ColorsModel iobyxmoadg() {
            return this.f83347ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f83348zoijcleaow;
        }

        public String toString() {
            return "ShowSortDialog(selected=" + this.f83346iobyxmoadg + ", supportedTypes=" + this.f83348zoijcleaow + ", colorsModel=" + this.f83347ppxfxbqfkf + ")";
        }

        public final mz0.ppxfxbqfkf zoijcleaow() {
            return this.f83346iobyxmoadg;
        }
    }

    public static final class jyumaefscl implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final jyumaefscl f83349iobyxmoadg = new jyumaefscl();

        private jyumaefscl() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof jyumaefscl);
        }

        public int hashCode() {
            return -603324644;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class kcexrzcfyt implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f83350iobyxmoadg;

        public kcexrzcfyt(ChangeProductParams params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f83350iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83350iobyxmoadg, ((kcexrzcfyt) obj).f83350iobyxmoadg);
        }

        public int hashCode() {
            return this.f83350iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f83350iobyxmoadg;
        }

        public String toString() {
            return "ShowIqosAgreementsDialog(params=" + this.f83350iobyxmoadg + ")";
        }
    }

    public static final class lereixgezr implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83351iobyxmoadg;

        public lereixgezr(String message) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f83351iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lereixgezr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83351iobyxmoadg, ((lereixgezr) obj).f83351iobyxmoadg);
        }

        public int hashCode() {
            return this.f83351iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83351iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningMessage(message=" + this.f83351iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83352iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83353zoijcleaow;

        public lqeggnwhkg(String article, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(article, "article");
            this.f83352iobyxmoadg = article;
            this.f83353zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83352iobyxmoadg, lqeggnwhkgVar.f83352iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83353zoijcleaow, lqeggnwhkgVar.f83353zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f83352iobyxmoadg.hashCode() * 31;
            String str = this.f83353zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f83352iobyxmoadg;
        }

        public String toString() {
            return "NavigateToProductCardScreenByArticle(article=" + this.f83352iobyxmoadg + ", orderEditId=" + this.f83353zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f83353zoijcleaow;
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83354iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83355zoijcleaow;

        public nufgyqmvbu(String productId, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            this.f83354iobyxmoadg = productId;
            this.f83355zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83354iobyxmoadg, nufgyqmvbuVar.f83354iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83355zoijcleaow, nufgyqmvbuVar.f83355zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f83354iobyxmoadg.hashCode() * 31;
            String str = this.f83355zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f83355zoijcleaow;
        }

        public String toString() {
            return "NavigateToProductCardScreenById(productId=" + this.f83354iobyxmoadg + ", orderEditId=" + this.f83355zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f83354iobyxmoadg;
        }
    }

    public static final class ojitshcjhn implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSet f83356iobyxmoadg;

        public ojitshcjhn(ComboSet comboSet) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSet, "comboSet");
            this.f83356iobyxmoadg = comboSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83356iobyxmoadg, ((ojitshcjhn) obj).f83356iobyxmoadg);
        }

        public int hashCode() {
            return this.f83356iobyxmoadg.hashCode();
        }

        public final ComboSet iobyxmoadg() {
            return this.f83356iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogBuildYourCombo(comboSet=" + this.f83356iobyxmoadg + ")";
        }
    }

    public static final class oxmwwwfdhm implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final sp0.iobyxmoadg f83357iobyxmoadg;

        public oxmwwwfdhm(sp0.iobyxmoadg message) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f83357iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83357iobyxmoadg, ((oxmwwwfdhm) obj).f83357iobyxmoadg);
        }

        public int hashCode() {
            return this.f83357iobyxmoadg.hashCode();
        }

        public final sp0.iobyxmoadg iobyxmoadg() {
            return this.f83357iobyxmoadg;
        }

        public String toString() {
            return "ShowInfoAlertDialog(message=" + this.f83357iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83358iobyxmoadg;

        public ppxfxbqfkf(String orderEditId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderEditId, "orderEditId");
            this.f83358iobyxmoadg = orderEditId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83358iobyxmoadg, ((ppxfxbqfkf) obj).f83358iobyxmoadg);
        }

        public int hashCode() {
            return this.f83358iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83358iobyxmoadg;
        }

        public String toString() {
            return "NavigateBackToEditOrderScreen(orderEditId=" + this.f83358iobyxmoadg + ")";
        }
    }

    public static final class rgvfuqvkyq implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f83359iobyxmoadg;

        public rgvfuqvkyq(PurchaseListAddProductDialogArgs dialogArgs) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f83359iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rgvfuqvkyq) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83359iobyxmoadg, ((rgvfuqvkyq) obj).f83359iobyxmoadg);
        }

        public int hashCode() {
            return this.f83359iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f83359iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogSelectPurchaseList(dialogArgs=" + this.f83359iobyxmoadg + ")";
        }
    }

    public static final class vdvldrhtss implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f83360iobyxmoadg;

        public vdvldrhtss(Throwable error) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
            this.f83360iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83360iobyxmoadg, ((vdvldrhtss) obj).f83360iobyxmoadg);
        }

        public int hashCode() {
            return this.f83360iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f83360iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f83360iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83361iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83362zoijcleaow;

        public wflxmlrfwp(String categoryTitle, String categoryId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryTitle, "categoryTitle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f83361iobyxmoadg = categoryTitle;
            this.f83362zoijcleaow = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83361iobyxmoadg, wflxmlrfwpVar.f83361iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83362zoijcleaow, wflxmlrfwpVar.f83362zoijcleaow);
        }

        public int hashCode() {
            return (this.f83361iobyxmoadg.hashCode() * 31) + this.f83362zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83362zoijcleaow;
        }

        public String toString() {
            return "ShowAgeCheckDialog(categoryTitle=" + this.f83361iobyxmoadg + ", categoryId=" + this.f83362zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f83361iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f83363iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1655242228;
        }

        public String toString() {
            return "NavigateToCartTab";
        }
    }

    public static final class yggfygwlhe implements gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f83364ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f83365iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f83366zoijcleaow;

        public yggfygwlhe(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f83365iobyxmoadg = hint;
            this.f83366zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof yggfygwlhe)) {
                return false;
            }
            yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83365iobyxmoadg, yggfygwlheVar.f83365iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83366zoijcleaow, yggfygwlheVar.f83366zoijcleaow);
        }

        public int hashCode() {
            return (this.f83365iobyxmoadg.hashCode() * 31) + this.f83366zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f83366zoijcleaow;
        }

        public String toString() {
            return "ShowProductHint(hint=" + this.f83365iobyxmoadg + ", analyticsInfo=" + this.f83366zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f83365iobyxmoadg;
        }
    }

    public static final class zdlpuopuiu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f83367iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return -1788084714;
        }

        public String toString() {
            return "ShowOrderDeliveryPriceChangeMessage";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83368iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f83368iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f83368iobyxmoadg == ((zoijcleaow) obj).f83368iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83368iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83368iobyxmoadg;
        }

        public String toString() {
            return "NavigateBack(wasOpenedViaNavLink=" + this.f83368iobyxmoadg + ")";
        }
    }
}
