package fr;

import java.util.List;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.ProductListPayload;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.core.domain.models.catalog.CatalogBanner;
import ru.myspar.core.domain.models.comboset.ComboSet;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.domain.feature.filters.store.FiltersArgs;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.story.domain.model.StoryItem;
import ru.myspar.story.domain.model.StoryNavLink;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class agtfadlqog implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f34651iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f34652zoijcleaow;

        public agtfadlqog(ChangeProductParams params, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f34651iobyxmoadg = params;
            this.f34652zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34651iobyxmoadg, agtfadlqogVar.f34651iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34652zoijcleaow, agtfadlqogVar.f34652zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f34651iobyxmoadg.hashCode() * 31;
            String str = this.f34652zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f34652zoijcleaow;
        }

        public String toString() {
            return "ShowAvailableOnlyForPickupDialog(params=" + this.f34651iobyxmoadg + ", message=" + this.f34652zoijcleaow + ")";
        }

        public final ChangeProductParams zoijcleaow() {
            return this.f34651iobyxmoadg;
        }
    }

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f34653iobyxmoadg;

        public btonecajqb(boolean z13) {
            this.f34653iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && this.f34653iobyxmoadg == ((btonecajqb) obj).f34653iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f34653iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f34653iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSelectPickupShop(hasUserAnyAddress=" + this.f34653iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v00.ppxfxbqfkf f34654iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ColorsModel f34655ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f34656zoijcleaow;

        public cqumvgiudr(v00.ppxfxbqfkf selected, List supportedTypes, ColorsModel colorsModel) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selected, "selected");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(supportedTypes, "supportedTypes");
            this.f34654iobyxmoadg = selected;
            this.f34656zoijcleaow = supportedTypes;
            this.f34655ppxfxbqfkf = colorsModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof cqumvgiudr)) {
                return false;
            }
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) obj;
            return this.f34654iobyxmoadg == cqumvgiudrVar.f34654iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34656zoijcleaow, cqumvgiudrVar.f34656zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34655ppxfxbqfkf, cqumvgiudrVar.f34655ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f34654iobyxmoadg.hashCode() * 31) + this.f34656zoijcleaow.hashCode()) * 31;
            ColorsModel colorsModel = this.f34655ppxfxbqfkf;
            return iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode());
        }

        public final ColorsModel iobyxmoadg() {
            return this.f34655ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f34656zoijcleaow;
        }

        public String toString() {
            return "ShowSortDialog(selected=" + this.f34654iobyxmoadg + ", supportedTypes=" + this.f34656zoijcleaow + ", colorsModel=" + this.f34655ppxfxbqfkf + ")";
        }

        public final v00.ppxfxbqfkf zoijcleaow() {
            return this.f34654iobyxmoadg;
        }
    }

    public static final class draadjrbmk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AnalyticsPayload f34657iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final CatalogBanner f34658zoijcleaow;

        public draadjrbmk(AnalyticsPayload analyticsPayload, CatalogBanner banner) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsPayload, "analyticsPayload");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
            this.f34657iobyxmoadg = analyticsPayload;
            this.f34658zoijcleaow = banner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34657iobyxmoadg, draadjrbmkVar.f34657iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34658zoijcleaow, draadjrbmkVar.f34658zoijcleaow);
        }

        public int hashCode() {
            return (this.f34657iobyxmoadg.hashCode() * 31) + this.f34658zoijcleaow.hashCode();
        }

        public final AnalyticsPayload iobyxmoadg() {
            return this.f34657iobyxmoadg;
        }

        public String toString() {
            return "SendNavigationPayload(analyticsPayload=" + this.f34657iobyxmoadg + ", banner=" + this.f34658zoijcleaow + ")";
        }

        public final CatalogBanner zoijcleaow() {
            return this.f34658zoijcleaow;
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductListPayload f34659iobyxmoadg;

        public dxjokdxxww(ProductListPayload payload) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
            this.f34659iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34659iobyxmoadg, ((dxjokdxxww) obj).f34659iobyxmoadg);
        }

        public int hashCode() {
            return this.f34659iobyxmoadg.hashCode();
        }

        public final ProductListPayload iobyxmoadg() {
            return this.f34659iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSearchProductScreen(payload=" + this.f34659iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NonAuthorizedPayload.zoijcleaow f34660iobyxmoadg;

        public eablkybsjg(NonAuthorizedPayload.zoijcleaow errorType) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(errorType, "errorType");
            this.f34660iobyxmoadg = errorType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f34660iobyxmoadg == ((eablkybsjg) obj).f34660iobyxmoadg;
        }

        public int hashCode() {
            return this.f34660iobyxmoadg.hashCode();
        }

        public final NonAuthorizedPayload.zoijcleaow iobyxmoadg() {
            return this.f34660iobyxmoadg;
        }

        public String toString() {
            return "NavigateToNonAuthorizedScreen(errorType=" + this.f34660iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final StoryItem f34661iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final StoryNavLink f34662zoijcleaow;

        public esjtqupxsv(StoryItem story, StoryNavLink endPoint) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(story, "story");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(endPoint, "endPoint");
            this.f34661iobyxmoadg = story;
            this.f34662zoijcleaow = endPoint;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof esjtqupxsv)) {
                return false;
            }
            esjtqupxsv esjtqupxsvVar = (esjtqupxsv) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34661iobyxmoadg, esjtqupxsvVar.f34661iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34662zoijcleaow, esjtqupxsvVar.f34662zoijcleaow);
        }

        public int hashCode() {
            return (this.f34661iobyxmoadg.hashCode() * 31) + this.f34662zoijcleaow.hashCode();
        }

        public final StoryNavLink iobyxmoadg() {
            return this.f34662zoijcleaow;
        }

        public String toString() {
            return "ShowStory(story=" + this.f34661iobyxmoadg + ", endPoint=" + this.f34662zoijcleaow + ")";
        }

        public final StoryItem zoijcleaow() {
            return this.f34661iobyxmoadg;
        }
    }

    public static final class gtknphoqwx implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f34663iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return -1536754317;
        }

        public String toString() {
            return "ScrollToTop";
        }
    }

    /* JADX INFO: renamed from: fr.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C0768gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34664iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f34665zoijcleaow;

        public C0768gxszxtbevo(String article, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(article, "article");
            this.f34664iobyxmoadg = article;
            this.f34665zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0768gxszxtbevo)) {
                return false;
            }
            C0768gxszxtbevo c0768gxszxtbevo = (C0768gxszxtbevo) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34664iobyxmoadg, c0768gxszxtbevo.f34664iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34665zoijcleaow, c0768gxszxtbevo.f34665zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f34664iobyxmoadg.hashCode() * 31;
            String str = this.f34665zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f34664iobyxmoadg;
        }

        public String toString() {
            return "NavigateToProductCardScreenByArticle(article=" + this.f34664iobyxmoadg + ", orderEditId=" + this.f34665zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f34665zoijcleaow;
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f34666iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f34666iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f34666iobyxmoadg == ((iobyxmoadg) obj).f34666iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f34666iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f34666iobyxmoadg;
        }

        public String toString() {
            return "NavigateBack(wasOpenedViaNavLink=" + this.f34666iobyxmoadg + ")";
        }
    }

    public static final class iwizpuwonk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iwizpuwonk f34667iobyxmoadg = new iwizpuwonk();

        private iwizpuwonk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iwizpuwonk);
        }

        public int hashCode() {
            return -1850546119;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class jyumaefscl implements gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f34668ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f34669iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f34670zoijcleaow;

        public jyumaefscl(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f34669iobyxmoadg = hint;
            this.f34670zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof jyumaefscl)) {
                return false;
            }
            jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34669iobyxmoadg, jyumaefsclVar.f34669iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34670zoijcleaow, jyumaefsclVar.f34670zoijcleaow);
        }

        public int hashCode() {
            return (this.f34669iobyxmoadg.hashCode() * 31) + this.f34670zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f34670zoijcleaow;
        }

        public String toString() {
            return "ShowProductHint(hint=" + this.f34669iobyxmoadg + ", analyticsInfo=" + this.f34670zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f34669iobyxmoadg;
        }
    }

    public static final class kcexrzcfyt implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final gr.iobyxmoadg f34671iobyxmoadg;

        public kcexrzcfyt(gr.iobyxmoadg message) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f34671iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34671iobyxmoadg, ((kcexrzcfyt) obj).f34671iobyxmoadg);
        }

        public int hashCode() {
            return this.f34671iobyxmoadg.hashCode();
        }

        public final gr.iobyxmoadg iobyxmoadg() {
            return this.f34671iobyxmoadg;
        }

        public String toString() {
            return "ShowInfoAlertDialog(message=" + this.f34671iobyxmoadg + ")";
        }
    }

    public static final class lereixgezr implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lereixgezr f34672iobyxmoadg = new lereixgezr();

        private lereixgezr() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lereixgezr);
        }

        public int hashCode() {
            return 1068216008;
        }

        public String toString() {
            return "ShowSuccessAddedToOrderMessage";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34673iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f34674zoijcleaow;

        public lqeggnwhkg(String productId, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            this.f34673iobyxmoadg = productId;
            this.f34674zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34673iobyxmoadg, lqeggnwhkgVar.f34673iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34674zoijcleaow, lqeggnwhkgVar.f34674zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f34673iobyxmoadg.hashCode() * 31;
            String str = this.f34674zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f34674zoijcleaow;
        }

        public String toString() {
            return "NavigateToProductCardScreenById(productId=" + this.f34673iobyxmoadg + ", orderEditId=" + this.f34674zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f34673iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f34675iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 639331256;
        }

        public String toString() {
            return "NavigateToScanProductScreen";
        }
    }

    public static final class ojitshcjhn implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f34676iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 1854404971;
        }

        public String toString() {
            return "ShowDialogAfterAddComboToBasket";
        }
    }

    public static final class oxmwwwfdhm implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f34677iobyxmoadg;

        public oxmwwwfdhm(Throwable error) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
            this.f34677iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34677iobyxmoadg, ((oxmwwwfdhm) obj).f34677iobyxmoadg);
        }

        public int hashCode() {
            return this.f34677iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f34677iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f34677iobyxmoadg + ")";
        }
    }

    public static final class pmvmpeiblj implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34678iobyxmoadg;

        public pmvmpeiblj(String message) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f34678iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof pmvmpeiblj) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34678iobyxmoadg, ((pmvmpeiblj) obj).f34678iobyxmoadg);
        }

        public int hashCode() {
            return this.f34678iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34678iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningMessage(message=" + this.f34678iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f34679iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -977760817;
        }

        public String toString() {
            return "NavigateToCartTab";
        }
    }

    public static final class rgvfuqvkyq implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSet f34680iobyxmoadg;

        public rgvfuqvkyq(ComboSet comboSet) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSet, "comboSet");
            this.f34680iobyxmoadg = comboSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rgvfuqvkyq) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34680iobyxmoadg, ((rgvfuqvkyq) obj).f34680iobyxmoadg);
        }

        public int hashCode() {
            return this.f34680iobyxmoadg.hashCode();
        }

        public final ComboSet iobyxmoadg() {
            return this.f34680iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogBuildYourCombo(comboSet=" + this.f34680iobyxmoadg + ")";
        }
    }

    public static final class vdvldrhtss implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f34681iobyxmoadg;

        public vdvldrhtss(PurchaseListAddProductDialogArgs dialogArgs) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f34681iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34681iobyxmoadg, ((vdvldrhtss) obj).f34681iobyxmoadg);
        }

        public int hashCode() {
            return this.f34681iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f34681iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogSelectPurchaseList(dialogArgs=" + this.f34681iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34682iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f34683zoijcleaow;

        public wflxmlrfwp(String categoryTitle, String categoryId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryTitle, "categoryTitle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f34682iobyxmoadg = categoryTitle;
            this.f34683zoijcleaow = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34682iobyxmoadg, wflxmlrfwpVar.f34682iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34683zoijcleaow, wflxmlrfwpVar.f34683zoijcleaow);
        }

        public int hashCode() {
            return (this.f34682iobyxmoadg.hashCode() * 31) + this.f34683zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34683zoijcleaow;
        }

        public String toString() {
            return "ShowAgeCheckDialog(categoryTitle=" + this.f34682iobyxmoadg + ", categoryId=" + this.f34683zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f34682iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f34684zoijcleaow = FiltersArgs.f87723lereixgezr;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final FiltersArgs f34685iobyxmoadg;

        public wkgbmnqykc(FiltersArgs filtersArgs) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(filtersArgs, "filtersArgs");
            this.f34685iobyxmoadg = filtersArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34685iobyxmoadg, ((wkgbmnqykc) obj).f34685iobyxmoadg);
        }

        public int hashCode() {
            return this.f34685iobyxmoadg.hashCode();
        }

        public final FiltersArgs iobyxmoadg() {
            return this.f34685iobyxmoadg;
        }

        public String toString() {
            return "NavigateToFiltersScreen(filtersArgs=" + this.f34685iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f34686iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yggfygwlhe);
        }

        public int hashCode() {
            return -211206375;
        }

        public String toString() {
            return "ShowOrderDeliveryPriceChangeMessage";
        }
    }

    public static final class zdlpuopuiu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f34687iobyxmoadg;

        public zdlpuopuiu(ChangeProductParams params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f34687iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34687iobyxmoadg, ((zdlpuopuiu) obj).f34687iobyxmoadg);
        }

        public int hashCode() {
            return this.f34687iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f34687iobyxmoadg;
        }

        public String toString() {
            return "ShowIqosAgreementsDialog(params=" + this.f34687iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34688iobyxmoadg;

        public zoijcleaow(String orderEditId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderEditId, "orderEditId");
            this.f34688iobyxmoadg = orderEditId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34688iobyxmoadg, ((zoijcleaow) obj).f34688iobyxmoadg);
        }

        public int hashCode() {
            return this.f34688iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34688iobyxmoadg;
        }

        public String toString() {
            return "NavigateBackToEditOrderScreen(orderEditId=" + this.f34688iobyxmoadg + ")";
        }
    }
}
