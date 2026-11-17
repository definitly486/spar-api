package ru.myspar.proloyalty.catalog.impl.product_list.presentation;

import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class agtfadlqog implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f93255iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return -1984373991;
        }

        public String toString() {
            return "OnNavigateToCartTab";
        }
    }

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f93256iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return -1880837764;
        }

        public String toString() {
            return "OnFiltersClicked";
        }
    }

    public static final class cqumvgiudr implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f93257iobyxmoadg;

        public cqumvgiudr(mz0.ppxfxbqfkf type) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            this.f93257iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cqumvgiudr) && this.f93257iobyxmoadg == ((cqumvgiudr) obj).f93257iobyxmoadg;
        }

        public int hashCode() {
            return this.f93257iobyxmoadg.hashCode();
        }

        public final mz0.ppxfxbqfkf iobyxmoadg() {
            return this.f93257iobyxmoadg;
        }

        public String toString() {
            return "OnSortSelected(type=" + this.f93257iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f93258iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f93259ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f93260zoijcleaow;

        public draadjrbmk(HintUiModel hint, AnalyticElement.ProductItemElement analyticElement, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f93258iobyxmoadg = hint;
            this.f93260zoijcleaow = analyticElement;
            this.f93259ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93258iobyxmoadg, draadjrbmkVar.f93258iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93260zoijcleaow, draadjrbmkVar.f93260zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93259ppxfxbqfkf, draadjrbmkVar.f93259ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f93258iobyxmoadg.hashCode() * 31) + this.f93260zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f93259ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f93260zoijcleaow;
        }

        public final HintUiModel ppxfxbqfkf() {
            return this.f93258iobyxmoadg;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f93258iobyxmoadg + ", analyticElement=" + this.f93260zoijcleaow + ", analyticsLocation=" + this.f93259ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation zoijcleaow() {
            return this.f93259ppxfxbqfkf;
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f93261iobyxmoadg;

        public dxjokdxxww(ProductUiModel product) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f93261iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93261iobyxmoadg, ((dxjokdxxww) obj).f93261iobyxmoadg);
        }

        public int hashCode() {
            return this.f93261iobyxmoadg.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f93261iobyxmoadg;
        }

        public String toString() {
            return "OnFavoriteClicked(product=" + this.f93261iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f93262iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -1639413096;
        }

        public String toString() {
            return "OnChangeListType";
        }
    }

    public static final class esjtqupxsv implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f93263iobyxmoadg;

        public esjtqupxsv(boolean z13) {
            this.f93263iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof esjtqupxsv) && this.f93263iobyxmoadg == ((esjtqupxsv) obj).f93263iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f93263iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f93263iobyxmoadg;
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f93263iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f93264iobyxmoadg;

        public gtknphoqwx(boolean z13) {
            this.f93264iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f93264iobyxmoadg == ((gtknphoqwx) obj).f93264iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f93264iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f93264iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f93264iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f93265iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final wm0.zoijcleaow f93266zoijcleaow;

        public gxszxtbevo(ComboSetProduct comboSetProduct, wm0.zoijcleaow analyticsData) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetProduct, "comboSetProduct");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
            this.f93265iobyxmoadg = comboSetProduct;
            this.f93266zoijcleaow = analyticsData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93265iobyxmoadg, gxszxtbevoVar.f93265iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93266zoijcleaow, gxszxtbevoVar.f93266zoijcleaow);
        }

        public int hashCode() {
            return (this.f93265iobyxmoadg.hashCode() * 31) + this.f93266zoijcleaow.hashCode();
        }

        public final wm0.zoijcleaow iobyxmoadg() {
            return this.f93266zoijcleaow;
        }

        public String toString() {
            return "OnClickCardProductCombo(comboSetProduct=" + this.f93265iobyxmoadg + ", analyticsData=" + this.f93266zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f93265iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f93267iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final MeasureType f93268ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f93269zoijcleaow;

        public iobyxmoadg(ProductUiModel product, double d13, MeasureType measureType) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(measureType, "measureType");
            this.f93267iobyxmoadg = product;
            this.f93269zoijcleaow = d13;
            this.f93268ppxfxbqfkf = measureType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93267iobyxmoadg, iobyxmoadgVar.f93267iobyxmoadg) && Double.compare(this.f93269zoijcleaow, iobyxmoadgVar.f93269zoijcleaow) == 0 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93268ppxfxbqfkf, iobyxmoadgVar.f93268ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f93267iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f93269zoijcleaow)) * 31) + this.f93268ppxfxbqfkf.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f93267iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToPurchaseListClicked(product=" + this.f93267iobyxmoadg + ", quantity=" + this.f93269zoijcleaow + ", measureType=" + this.f93268ppxfxbqfkf + ")";
        }

        public final double zoijcleaow() {
            return this.f93269zoijcleaow;
        }
    }

    public static final class iwizpuwonk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iwizpuwonk f93270iobyxmoadg = new iwizpuwonk();

        private iwizpuwonk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iwizpuwonk);
        }

        public int hashCode() {
            return 1341130969;
        }

        public String toString() {
            return "OnSortClicked";
        }
    }

    public static final class jyumaefscl implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final jyumaefscl f93271iobyxmoadg = new jyumaefscl();

        private jyumaefscl() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof jyumaefscl);
        }

        public int hashCode() {
            return 427363727;
        }

        public String toString() {
            return "OnSearchClicked";
        }
    }

    public static final class kcexrzcfyt implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f93272iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kcexrzcfyt);
        }

        public int hashCode() {
            return -1611469045;
        }

        public String toString() {
            return "OnRefresh";
        }
    }

    public static final class lereixgezr implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ap0.iobyxmoadg f93273iobyxmoadg;

        public lereixgezr(ap0.iobyxmoadg catalog) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalog, "catalog");
            this.f93273iobyxmoadg = catalog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lereixgezr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93273iobyxmoadg, ((lereixgezr) obj).f93273iobyxmoadg);
        }

        public int hashCode() {
            return this.f93273iobyxmoadg.hashCode();
        }

        public final ap0.iobyxmoadg iobyxmoadg() {
            return this.f93273iobyxmoadg;
        }

        public String toString() {
            return "OnSubCategoryClicked(catalog=" + this.f93273iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f93274iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f93275zoijcleaow;

        public lqeggnwhkg(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f93274iobyxmoadg = productFirst;
            this.f93275zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93274iobyxmoadg, lqeggnwhkgVar.f93274iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93275zoijcleaow, lqeggnwhkgVar.f93275zoijcleaow);
        }

        public int hashCode() {
            return (this.f93274iobyxmoadg.hashCode() * 31) + this.f93275zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f93274iobyxmoadg;
        }

        public String toString() {
            return "OnClickedAddComboToCart(productFirst=" + this.f93274iobyxmoadg + ", productSecond=" + this.f93275zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f93275zoijcleaow;
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final kt0.iobyxmoadg f93276iobyxmoadg;

        public nufgyqmvbu(kt0.iobyxmoadg comboSet) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSet, "comboSet");
            this.f93276iobyxmoadg = comboSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93276iobyxmoadg, ((nufgyqmvbu) obj).f93276iobyxmoadg);
        }

        public int hashCode() {
            return this.f93276iobyxmoadg.hashCode();
        }

        public final kt0.iobyxmoadg iobyxmoadg() {
            return this.f93276iobyxmoadg;
        }

        public String toString() {
            return "OnClickedComboShowAll(comboSet=" + this.f93276iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f93277iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return -575677966;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class oxmwwwfdhm implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final oxmwwwfdhm f93278iobyxmoadg = new oxmwwwfdhm();

        private oxmwwwfdhm() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof oxmwwwfdhm);
        }

        public int hashCode() {
            return 2122218588;
        }

        public String toString() {
            return "OnPromoBannerClicked";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f93279iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1177623184;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class rgvfuqvkyq implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93280iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f93281ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f93282zoijcleaow;

        public rgvfuqvkyq(String productArticle, ProductCardEvent productCardEvent, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f93280iobyxmoadg = productArticle;
            this.f93282zoijcleaow = productCardEvent;
            this.f93281ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rgvfuqvkyq)) {
                return false;
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93280iobyxmoadg, rgvfuqvkyqVar.f93280iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93282zoijcleaow, rgvfuqvkyqVar.f93282zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93281ppxfxbqfkf, rgvfuqvkyqVar.f93281ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f93280iobyxmoadg.hashCode() * 31) + this.f93282zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f93281ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticsLocation iobyxmoadg() {
            return this.f93281ppxfxbqfkf;
        }

        public final ProductCardEvent ppxfxbqfkf() {
            return this.f93282zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(productArticle=" + this.f93280iobyxmoadg + ", productCardEvent=" + this.f93282zoijcleaow + ", analyticsLocation=" + this.f93281ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f93280iobyxmoadg;
        }
    }

    public static final class vdvldrhtss implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f93283iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation f93284zoijcleaow;

        public vdvldrhtss(ProductUiModel product, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f93283iobyxmoadg = product;
            this.f93284zoijcleaow = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93283iobyxmoadg, vdvldrhtssVar.f93283iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93284zoijcleaow, vdvldrhtssVar.f93284zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f93283iobyxmoadg.hashCode() * 31;
            AnalyticsLocation analyticsLocation = this.f93284zoijcleaow;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticsLocation iobyxmoadg() {
            return this.f93284zoijcleaow;
        }

        public String toString() {
            return "OnProductClicked(product=" + this.f93283iobyxmoadg + ", analyticsLocation=" + this.f93284zoijcleaow + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f93283iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f93285iobyxmoadg;

        public wflxmlrfwp(ChangeProductParams params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f93285iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93285iobyxmoadg, ((wflxmlrfwp) obj).f93285iobyxmoadg);
        }

        public int hashCode() {
            return this.f93285iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f93285iobyxmoadg;
        }

        public String toString() {
            return "OnIqosAgreementConfirmed(params=" + this.f93285iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2187wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f93286zoijcleaow = m91.gxszxtbevo.f66592wypolnanlu;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final m91.gxszxtbevo f93287iobyxmoadg;

        public C2187wkgbmnqykc(m91.gxszxtbevo banner) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
            this.f93287iobyxmoadg = banner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2187wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93287iobyxmoadg, ((C2187wkgbmnqykc) obj).f93287iobyxmoadg);
        }

        public int hashCode() {
            return this.f93287iobyxmoadg.hashCode();
        }

        public final m91.gxszxtbevo iobyxmoadg() {
            return this.f93287iobyxmoadg;
        }

        public String toString() {
            return "OnBannerClicked(banner=" + this.f93287iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f93288iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yggfygwlhe);
        }

        public int hashCode() {
            return 574661947;
        }

        public String toString() {
            return "OnScanClick";
        }
    }

    public static final class zdlpuopuiu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f93289iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return -234984675;
        }

        public String toString() {
            return "OnReturnToOrderEdit";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f93290iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f93291ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f93292zoijcleaow;

        public zoijcleaow(boolean z13, String categoryTitle, String categoryId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryTitle, "categoryTitle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f93290iobyxmoadg = z13;
            this.f93292zoijcleaow = categoryTitle;
            this.f93291ppxfxbqfkf = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f93290iobyxmoadg == zoijcleaowVar.f93290iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93292zoijcleaow, zoijcleaowVar.f93292zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93291ppxfxbqfkf, zoijcleaowVar.f93291ppxfxbqfkf);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f93290iobyxmoadg) * 31) + this.f93292zoijcleaow.hashCode()) * 31) + this.f93291ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93291ppxfxbqfkf;
        }

        public final boolean ppxfxbqfkf() {
            return this.f93290iobyxmoadg;
        }

        public String toString() {
            return "OnAgeConfirmDialogAction(isAgeConfirmed=" + this.f93290iobyxmoadg + ", categoryTitle=" + this.f93292zoijcleaow + ", categoryId=" + this.f93291ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f93292zoijcleaow;
        }
    }
}
