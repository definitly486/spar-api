package rp0;

import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class agtfadlqog implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f83291iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return -608898181;
        }

        public String toString() {
            return "OnNavigateToCartTab";
        }
    }

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f83292iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return 1934378074;
        }

        public String toString() {
            return "OnFiltersClicked";
        }
    }

    public static final class cqumvgiudr implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f83293iobyxmoadg;

        public cqumvgiudr(mz0.ppxfxbqfkf type) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            this.f83293iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cqumvgiudr) && this.f83293iobyxmoadg == ((cqumvgiudr) obj).f83293iobyxmoadg;
        }

        public int hashCode() {
            return this.f83293iobyxmoadg.hashCode();
        }

        public final mz0.ppxfxbqfkf iobyxmoadg() {
            return this.f83293iobyxmoadg;
        }

        public String toString() {
            return "OnSortSelected(type=" + this.f83293iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f83294iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f83295ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f83296zoijcleaow;

        public draadjrbmk(HintUiModel hint, AnalyticElement.ProductItemElement analyticElement, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f83294iobyxmoadg = hint;
            this.f83296zoijcleaow = analyticElement;
            this.f83295ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83294iobyxmoadg, draadjrbmkVar.f83294iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83296zoijcleaow, draadjrbmkVar.f83296zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83295ppxfxbqfkf, draadjrbmkVar.f83295ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f83294iobyxmoadg.hashCode() * 31) + this.f83296zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f83295ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f83296zoijcleaow;
        }

        public final HintUiModel ppxfxbqfkf() {
            return this.f83294iobyxmoadg;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f83294iobyxmoadg + ", analyticElement=" + this.f83296zoijcleaow + ", analyticsLocation=" + this.f83295ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation zoijcleaow() {
            return this.f83295ppxfxbqfkf;
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83297iobyxmoadg;

        public dxjokdxxww(String productId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            this.f83297iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83297iobyxmoadg, ((dxjokdxxww) obj).f83297iobyxmoadg);
        }

        public int hashCode() {
            return this.f83297iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83297iobyxmoadg;
        }

        public String toString() {
            return "OnFavoriteClicked(productId=" + this.f83297iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: rp0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1868eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1868eablkybsjg f83298iobyxmoadg = new C1868eablkybsjg();

        private C1868eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1868eablkybsjg);
        }

        public int hashCode() {
            return -2119164554;
        }

        public String toString() {
            return "OnChangeListType";
        }
    }

    public static final class esjtqupxsv implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83299iobyxmoadg;

        public esjtqupxsv(boolean z13) {
            this.f83299iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof esjtqupxsv) && this.f83299iobyxmoadg == ((esjtqupxsv) obj).f83299iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83299iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83299iobyxmoadg;
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f83299iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83300iobyxmoadg;

        public gtknphoqwx(boolean z13) {
            this.f83300iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f83300iobyxmoadg == ((gtknphoqwx) obj).f83300iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83300iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83300iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f83300iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f83301iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final wm0.zoijcleaow f83302zoijcleaow;

        public gxszxtbevo(ComboSetProduct comboSetProduct, wm0.zoijcleaow analyticsData) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetProduct, "comboSetProduct");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
            this.f83301iobyxmoadg = comboSetProduct;
            this.f83302zoijcleaow = analyticsData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83301iobyxmoadg, gxszxtbevoVar.f83301iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83302zoijcleaow, gxszxtbevoVar.f83302zoijcleaow);
        }

        public int hashCode() {
            return (this.f83301iobyxmoadg.hashCode() * 31) + this.f83302zoijcleaow.hashCode();
        }

        public final wm0.zoijcleaow iobyxmoadg() {
            return this.f83302zoijcleaow;
        }

        public String toString() {
            return "OnClickCardProductCombo(comboSetProduct=" + this.f83301iobyxmoadg + ", analyticsData=" + this.f83302zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f83301iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83303iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f83304zoijcleaow;

        public iobyxmoadg(String productId, double d13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            this.f83303iobyxmoadg = productId;
            this.f83304zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83303iobyxmoadg, iobyxmoadgVar.f83303iobyxmoadg) && Double.compare(this.f83304zoijcleaow, iobyxmoadgVar.f83304zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f83303iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f83304zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f83303iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToPurchaseListClicked(productId=" + this.f83303iobyxmoadg + ", quantity=" + this.f83304zoijcleaow + ")";
        }
    }

    public static final class iwizpuwonk implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iwizpuwonk f83305iobyxmoadg = new iwizpuwonk();

        private iwizpuwonk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iwizpuwonk);
        }

        public int hashCode() {
            return 1970705083;
        }

        public String toString() {
            return "OnSortClicked";
        }
    }

    public static final class jyumaefscl implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final jyumaefscl f83306iobyxmoadg = new jyumaefscl();

        private jyumaefscl() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof jyumaefscl);
        }

        public int hashCode() {
            return -142301455;
        }

        public String toString() {
            return "OnSearchClicked";
        }
    }

    public static final class kcexrzcfyt implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f83307iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kcexrzcfyt);
        }

        public int hashCode() {
            return 1870510573;
        }

        public String toString() {
            return "OnRefresh";
        }
    }

    public static final class lereixgezr implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83308iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83309zoijcleaow;

        public lereixgezr(String categoryTitle, String categoryId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryTitle, "categoryTitle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f83308iobyxmoadg = categoryTitle;
            this.f83309zoijcleaow = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lereixgezr)) {
                return false;
            }
            lereixgezr lereixgezrVar = (lereixgezr) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83308iobyxmoadg, lereixgezrVar.f83308iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83309zoijcleaow, lereixgezrVar.f83309zoijcleaow);
        }

        public int hashCode() {
            return (this.f83308iobyxmoadg.hashCode() * 31) + this.f83309zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83309zoijcleaow;
        }

        public String toString() {
            return "OnSubCategoryClicked(categoryTitle=" + this.f83308iobyxmoadg + ", categoryId=" + this.f83309zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f83308iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f83310iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f83311zoijcleaow;

        public lqeggnwhkg(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f83310iobyxmoadg = productFirst;
            this.f83311zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83310iobyxmoadg, lqeggnwhkgVar.f83310iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83311zoijcleaow, lqeggnwhkgVar.f83311zoijcleaow);
        }

        public int hashCode() {
            return (this.f83310iobyxmoadg.hashCode() * 31) + this.f83311zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f83310iobyxmoadg;
        }

        public String toString() {
            return "OnClickedAddComboToCart(productFirst=" + this.f83310iobyxmoadg + ", productSecond=" + this.f83311zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f83311zoijcleaow;
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83312iobyxmoadg;

        public nufgyqmvbu(String comboSetId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetId, "comboSetId");
            this.f83312iobyxmoadg = comboSetId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83312iobyxmoadg, ((nufgyqmvbu) obj).f83312iobyxmoadg);
        }

        public int hashCode() {
            return this.f83312iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83312iobyxmoadg;
        }

        public String toString() {
            return "OnClickedComboShowAll(comboSetId=" + this.f83312iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f83313iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return -8492208;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class oxmwwwfdhm implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final oxmwwwfdhm f83314iobyxmoadg = new oxmwwwfdhm();

        private oxmwwwfdhm() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof oxmwwwfdhm);
        }

        public int hashCode() {
            return 1812295738;
        }

        public String toString() {
            return "OnPromoBannerClicked";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f83315iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -548049070;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class rgvfuqvkyq implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83316iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f83317ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f83318zoijcleaow;

        public rgvfuqvkyq(String productArticle, ProductCardEvent productCardEvent, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f83316iobyxmoadg = productArticle;
            this.f83318zoijcleaow = productCardEvent;
            this.f83317ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rgvfuqvkyq)) {
                return false;
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83316iobyxmoadg, rgvfuqvkyqVar.f83316iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83318zoijcleaow, rgvfuqvkyqVar.f83318zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83317ppxfxbqfkf, rgvfuqvkyqVar.f83317ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f83316iobyxmoadg.hashCode() * 31) + this.f83318zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f83317ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticsLocation iobyxmoadg() {
            return this.f83317ppxfxbqfkf;
        }

        public final ProductCardEvent ppxfxbqfkf() {
            return this.f83318zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(productArticle=" + this.f83316iobyxmoadg + ", productCardEvent=" + this.f83318zoijcleaow + ", analyticsLocation=" + this.f83317ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f83316iobyxmoadg;
        }
    }

    public static final class vdvldrhtss implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83319iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f83320ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final AnalyticsLocation f83321wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83322zoijcleaow;

        public vdvldrhtss(String productName, String productId, String productArticle, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productName, "productName");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f83319iobyxmoadg = productName;
            this.f83322zoijcleaow = productId;
            this.f83320ppxfxbqfkf = productArticle;
            this.f83321wkgbmnqykc = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83319iobyxmoadg, vdvldrhtssVar.f83319iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83322zoijcleaow, vdvldrhtssVar.f83322zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83320ppxfxbqfkf, vdvldrhtssVar.f83320ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83321wkgbmnqykc, vdvldrhtssVar.f83321wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((((this.f83319iobyxmoadg.hashCode() * 31) + this.f83322zoijcleaow.hashCode()) * 31) + this.f83320ppxfxbqfkf.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f83321wkgbmnqykc;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticsLocation iobyxmoadg() {
            return this.f83321wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f83322zoijcleaow;
        }

        public String toString() {
            return "OnProductClicked(productName=" + this.f83319iobyxmoadg + ", productId=" + this.f83322zoijcleaow + ", productArticle=" + this.f83320ppxfxbqfkf + ", analyticsLocation=" + this.f83321wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f83319iobyxmoadg;
        }

        public final String zoijcleaow() {
            return this.f83320ppxfxbqfkf;
        }
    }

    public static final class wflxmlrfwp implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f83323iobyxmoadg;

        public wflxmlrfwp(ChangeProductParams params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f83323iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83323iobyxmoadg, ((wflxmlrfwp) obj).f83323iobyxmoadg);
        }

        public int hashCode() {
            return this.f83323iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f83323iobyxmoadg;
        }

        public String toString() {
            return "OnIqosAgreementConfirmed(params=" + this.f83323iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83324iobyxmoadg;

        public wkgbmnqykc(String bannerId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bannerId, "bannerId");
            this.f83324iobyxmoadg = bannerId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83324iobyxmoadg, ((wkgbmnqykc) obj).f83324iobyxmoadg);
        }

        public int hashCode() {
            return this.f83324iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83324iobyxmoadg;
        }

        public String toString() {
            return "OnBannerClicked(bannerId=" + this.f83324iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f83325iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yggfygwlhe);
        }

        public int hashCode() {
            return 977551261;
        }

        public String toString() {
            return "OnScanClick";
        }
    }

    public static final class zdlpuopuiu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f83326iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return 1140491135;
        }

        public String toString() {
            return "OnReturnToOrderEdit";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83327iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f83328ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83329zoijcleaow;

        public zoijcleaow(boolean z13, String categoryTitle, String categoryId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryTitle, "categoryTitle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f83327iobyxmoadg = z13;
            this.f83329zoijcleaow = categoryTitle;
            this.f83328ppxfxbqfkf = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f83327iobyxmoadg == zoijcleaowVar.f83327iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83329zoijcleaow, zoijcleaowVar.f83329zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83328ppxfxbqfkf, zoijcleaowVar.f83328ppxfxbqfkf);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f83327iobyxmoadg) * 31) + this.f83329zoijcleaow.hashCode()) * 31) + this.f83328ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83328ppxfxbqfkf;
        }

        public final boolean ppxfxbqfkf() {
            return this.f83327iobyxmoadg;
        }

        public String toString() {
            return "OnAgeConfirmDialogAction(isAgeConfirmed=" + this.f83327iobyxmoadg + ", categoryTitle=" + this.f83329zoijcleaow + ", categoryId=" + this.f83328ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f83329zoijcleaow;
        }
    }
}
