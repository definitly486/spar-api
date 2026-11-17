package ru.myspar.catalog.impl.product_list.presentation;

import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class agtfadlqog implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f85330iobyxmoadg;

        public agtfadlqog(ChangeProductParams params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f85330iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85330iobyxmoadg, ((agtfadlqog) obj).f85330iobyxmoadg);
        }

        public int hashCode() {
            return this.f85330iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f85330iobyxmoadg;
        }

        public String toString() {
            return "OnIqosAgreementConfirmed(params=" + this.f85330iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f85331iobyxmoadg;

        public btonecajqb(ProductUiModel product) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f85331iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85331iobyxmoadg, ((btonecajqb) obj).f85331iobyxmoadg);
        }

        public int hashCode() {
            return this.f85331iobyxmoadg.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f85331iobyxmoadg;
        }

        public String toString() {
            return "OnFavoriteClicked(product=" + this.f85331iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v00.ppxfxbqfkf f85332iobyxmoadg;

        public cqumvgiudr(v00.ppxfxbqfkf type) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            this.f85332iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cqumvgiudr) && this.f85332iobyxmoadg == ((cqumvgiudr) obj).f85332iobyxmoadg;
        }

        public int hashCode() {
            return this.f85332iobyxmoadg.hashCode();
        }

        public final v00.ppxfxbqfkf iobyxmoadg() {
            return this.f85332iobyxmoadg;
        }

        public String toString() {
            return "OnSortSelected(type=" + this.f85332iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f85333iobyxmoadg;

        public draadjrbmk(boolean z13) {
            this.f85333iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && this.f85333iobyxmoadg == ((draadjrbmk) obj).f85333iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f85333iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f85333iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f85333iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qu.iobyxmoadg f85334iobyxmoadg;

        public dxjokdxxww(qu.iobyxmoadg comboSet) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSet, "comboSet");
            this.f85334iobyxmoadg = comboSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85334iobyxmoadg, ((dxjokdxxww) obj).f85334iobyxmoadg);
        }

        public int hashCode() {
            return this.f85334iobyxmoadg.hashCode();
        }

        public final qu.iobyxmoadg iobyxmoadg() {
            return this.f85334iobyxmoadg;
        }

        public String toString() {
            return "OnClickedComboShowAll(comboSet=" + this.f85334iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f85335zoijcleaow = nb0.eablkybsjg.f69495wypolnanlu;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nb0.eablkybsjg f85336iobyxmoadg;

        public eablkybsjg(nb0.eablkybsjg banner) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
            this.f85336iobyxmoadg = banner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85336iobyxmoadg, ((eablkybsjg) obj).f85336iobyxmoadg);
        }

        public int hashCode() {
            return this.f85336iobyxmoadg.hashCode();
        }

        public final nb0.eablkybsjg iobyxmoadg() {
            return this.f85336iobyxmoadg;
        }

        public String toString() {
            return "OnBannerClicked(banner=" + this.f85336iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f85337iobyxmoadg;

        public esjtqupxsv(boolean z13) {
            this.f85337iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof esjtqupxsv) && this.f85337iobyxmoadg == ((esjtqupxsv) obj).f85337iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f85337iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f85337iobyxmoadg;
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f85337iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f85338iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return 1363452863;
        }

        public String toString() {
            return "OnFiltersClicked";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f85339iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 1604877531;
        }

        public String toString() {
            return "OnChangeListType";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f85340iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final MeasureType f85341ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f85342zoijcleaow;

        public iobyxmoadg(ProductUiModel product, double d13, MeasureType measureType) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(measureType, "measureType");
            this.f85340iobyxmoadg = product;
            this.f85342zoijcleaow = d13;
            this.f85341ppxfxbqfkf = measureType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85340iobyxmoadg, iobyxmoadgVar.f85340iobyxmoadg) && Double.compare(this.f85342zoijcleaow, iobyxmoadgVar.f85342zoijcleaow) == 0 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85341ppxfxbqfkf, iobyxmoadgVar.f85341ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f85340iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f85342zoijcleaow)) * 31) + this.f85341ppxfxbqfkf.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f85340iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToPurchaseListClicked(product=" + this.f85340iobyxmoadg + ", quantity=" + this.f85342zoijcleaow + ", measureType=" + this.f85341ppxfxbqfkf + ")";
        }

        public final double zoijcleaow() {
            return this.f85342zoijcleaow;
        }
    }

    public static final class iwizpuwonk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iwizpuwonk f85343iobyxmoadg = new iwizpuwonk();

        private iwizpuwonk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iwizpuwonk);
        }

        public int hashCode() {
            return 868218230;
        }

        public String toString() {
            return "OnSortClicked";
        }
    }

    public static final class jyumaefscl implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final jyumaefscl f85344iobyxmoadg = new jyumaefscl();

        private jyumaefscl() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof jyumaefscl);
        }

        public int hashCode() {
            return 1224754924;
        }

        public String toString() {
            return "OnSearchClicked";
        }
    }

    public static final class kcexrzcfyt implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f85345iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kcexrzcfyt);
        }

        public int hashCode() {
            return 1849930280;
        }

        public String toString() {
            return "OnRefresh";
        }
    }

    public static final class lereixgezr implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final oq.iobyxmoadg f85346iobyxmoadg;

        public lereixgezr(oq.iobyxmoadg catalog) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalog, "catalog");
            this.f85346iobyxmoadg = catalog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lereixgezr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85346iobyxmoadg, ((lereixgezr) obj).f85346iobyxmoadg);
        }

        public int hashCode() {
            return this.f85346iobyxmoadg.hashCode();
        }

        public final oq.iobyxmoadg iobyxmoadg() {
            return this.f85346iobyxmoadg;
        }

        public String toString() {
            return "OnSubCategoryClicked(catalog=" + this.f85346iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f85347iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final mo.zoijcleaow f85348zoijcleaow;

        public lqeggnwhkg(ComboSetProduct comboSetProduct, mo.zoijcleaow analyticsData) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetProduct, "comboSetProduct");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
            this.f85347iobyxmoadg = comboSetProduct;
            this.f85348zoijcleaow = analyticsData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85347iobyxmoadg, lqeggnwhkgVar.f85347iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85348zoijcleaow, lqeggnwhkgVar.f85348zoijcleaow);
        }

        public int hashCode() {
            return (this.f85347iobyxmoadg.hashCode() * 31) + this.f85348zoijcleaow.hashCode();
        }

        public final mo.zoijcleaow iobyxmoadg() {
            return this.f85348zoijcleaow;
        }

        public String toString() {
            return "OnClickCardProductCombo(comboSetProduct=" + this.f85347iobyxmoadg + ", analyticsData=" + this.f85348zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f85347iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f85349iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f85350zoijcleaow;

        public nufgyqmvbu(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f85349iobyxmoadg = productFirst;
            this.f85350zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85349iobyxmoadg, nufgyqmvbuVar.f85349iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85350zoijcleaow, nufgyqmvbuVar.f85350zoijcleaow);
        }

        public int hashCode() {
            return (this.f85349iobyxmoadg.hashCode() * 31) + this.f85350zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f85349iobyxmoadg;
        }

        public String toString() {
            return "OnClickedAddComboToCart(productFirst=" + this.f85349iobyxmoadg + ", productSecond=" + this.f85350zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f85350zoijcleaow;
        }
    }

    public static final class ojitshcjhn implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f85351iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return -971366922;
        }

        public String toString() {
            return "OnNavigateToCartTab";
        }
    }

    public static final class oxmwwwfdhm implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f85352iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsLocation f85353zoijcleaow;

        public oxmwwwfdhm(ProductUiModel product, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f85352iobyxmoadg = product;
            this.f85353zoijcleaow = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof oxmwwwfdhm)) {
                return false;
            }
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85352iobyxmoadg, oxmwwwfdhmVar.f85352iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85353zoijcleaow, oxmwwwfdhmVar.f85353zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f85352iobyxmoadg.hashCode() * 31;
            AnalyticsLocation analyticsLocation = this.f85353zoijcleaow;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticsLocation iobyxmoadg() {
            return this.f85353zoijcleaow;
        }

        public String toString() {
            return "OnProductClicked(product=" + this.f85352iobyxmoadg + ", analyticsLocation=" + this.f85353zoijcleaow + ")";
        }

        public final ProductUiModel zoijcleaow() {
            return this.f85352iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f85354iobyxmoadg;

        public ppxfxbqfkf(ChangeProductParams params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f85354iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85354iobyxmoadg, ((ppxfxbqfkf) obj).f85354iobyxmoadg);
        }

        public int hashCode() {
            return this.f85354iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f85354iobyxmoadg;
        }

        public String toString() {
            return "OnAvailableOnlyForPickupDialogConfirmed(params=" + this.f85354iobyxmoadg + ")";
        }
    }

    public static final class rgvfuqvkyq implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f85355iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return -646481291;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class vdvldrhtss implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85356iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f85357ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f85358zoijcleaow;

        public vdvldrhtss(String productArticle, ProductCardEvent productCardEvent, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f85356iobyxmoadg = productArticle;
            this.f85358zoijcleaow = productCardEvent;
            this.f85357ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85356iobyxmoadg, vdvldrhtssVar.f85356iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85358zoijcleaow, vdvldrhtssVar.f85358zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85357ppxfxbqfkf, vdvldrhtssVar.f85357ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f85356iobyxmoadg.hashCode() * 31) + this.f85358zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f85357ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticsLocation iobyxmoadg() {
            return this.f85357ppxfxbqfkf;
        }

        public final ProductCardEvent ppxfxbqfkf() {
            return this.f85358zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(productArticle=" + this.f85356iobyxmoadg + ", productCardEvent=" + this.f85358zoijcleaow + ", analyticsLocation=" + this.f85357ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f85356iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f85359iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f85360ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f85361zoijcleaow;

        public wflxmlrfwp(HintUiModel hint, AnalyticElement.ProductItemElement analyticElement, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f85359iobyxmoadg = hint;
            this.f85361zoijcleaow = analyticElement;
            this.f85360ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85359iobyxmoadg, wflxmlrfwpVar.f85359iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85361zoijcleaow, wflxmlrfwpVar.f85361zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85360ppxfxbqfkf, wflxmlrfwpVar.f85360ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f85359iobyxmoadg.hashCode() * 31) + this.f85361zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f85360ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f85361zoijcleaow;
        }

        public final HintUiModel ppxfxbqfkf() {
            return this.f85359iobyxmoadg;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f85359iobyxmoadg + ", analyticElement=" + this.f85361zoijcleaow + ", analyticsLocation=" + this.f85360ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation zoijcleaow() {
            return this.f85360ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1945wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1945wkgbmnqykc f85362iobyxmoadg = new C1945wkgbmnqykc();

        private C1945wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1945wkgbmnqykc);
        }

        public int hashCode() {
            return -1650535923;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class yggfygwlhe implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final yggfygwlhe f85363iobyxmoadg = new yggfygwlhe();

        private yggfygwlhe() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof yggfygwlhe);
        }

        public int hashCode() {
            return -1620241128;
        }

        public String toString() {
            return "OnScanClick";
        }
    }

    public static final class zdlpuopuiu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f85364iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return 778022394;
        }

        public String toString() {
            return "OnReturnToOrderEdit";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f85365iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f85366ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f85367zoijcleaow;

        public zoijcleaow(boolean z13, String categoryTitle, String categoryId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryTitle, "categoryTitle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f85365iobyxmoadg = z13;
            this.f85367zoijcleaow = categoryTitle;
            this.f85366ppxfxbqfkf = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f85365iobyxmoadg == zoijcleaowVar.f85365iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85367zoijcleaow, zoijcleaowVar.f85367zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85366ppxfxbqfkf, zoijcleaowVar.f85366ppxfxbqfkf);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f85365iobyxmoadg) * 31) + this.f85367zoijcleaow.hashCode()) * 31) + this.f85366ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85366ppxfxbqfkf;
        }

        public final boolean ppxfxbqfkf() {
            return this.f85365iobyxmoadg;
        }

        public String toString() {
            return "OnAgeConfirmDialogAction(isAgeConfirmed=" + this.f85365iobyxmoadg + ", categoryTitle=" + this.f85367zoijcleaow + ", categoryId=" + this.f85366ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f85367zoijcleaow;
        }
    }
}
