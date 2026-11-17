package rp0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.impl.product_list.domain.model.ProductListFeatureToggles;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogWithSubCatalogs;
import ru.myspar.proloyalty.core.domain.models.catalog.ProductRecommendationsBlock;
import ru.myspar.proloyalty.core.domain.models.product.ProductListData;
import ru.myspar.proloyalty.core.domain.models.product.ProductsPromoBanner;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public interface lqeggnwhkg {

    public static final class agtfadlqog implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83370iobyxmoadg;

        public agtfadlqog(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f83370iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && zdlpuopuiu.eablkybsjg(this.f83370iobyxmoadg, ((agtfadlqog) obj).f83370iobyxmoadg);
        }

        public int hashCode() {
            return this.f83370iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83370iobyxmoadg;
        }

        public String toString() {
            return "RemoveExpandedProduct(productId=" + this.f83370iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductRecommendationsBlock f83371iobyxmoadg;

        public btonecajqb(ProductRecommendationsBlock productRecommendationsBlock) {
            this.f83371iobyxmoadg = productRecommendationsBlock;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f83371iobyxmoadg, ((btonecajqb) obj).f83371iobyxmoadg);
        }

        public int hashCode() {
            ProductRecommendationsBlock productRecommendationsBlock = this.f83371iobyxmoadg;
            if (productRecommendationsBlock == null) {
                return 0;
            }
            return productRecommendationsBlock.hashCode();
        }

        public final ProductRecommendationsBlock iobyxmoadg() {
            return this.f83371iobyxmoadg;
        }

        public String toString() {
            return "ChangeRecommendations(recommendation=" + this.f83371iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83372iobyxmoadg;

        public draadjrbmk(boolean z13) {
            this.f83372iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && this.f83372iobyxmoadg == ((draadjrbmk) obj).f83372iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83372iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83372iobyxmoadg;
        }

        public String toString() {
            return "ChangeSwipeToRefreshLoading(isLoading=" + this.f83372iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductsPromoBanner f83373iobyxmoadg;

        public dxjokdxxww(ProductsPromoBanner productsPromoBanner) {
            this.f83373iobyxmoadg = productsPromoBanner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f83373iobyxmoadg, ((dxjokdxxww) obj).f83373iobyxmoadg);
        }

        public int hashCode() {
            ProductsPromoBanner productsPromoBanner = this.f83373iobyxmoadg;
            if (productsPromoBanner == null) {
                return 0;
            }
            return productsPromoBanner.hashCode();
        }

        public final ProductsPromoBanner iobyxmoadg() {
            return this.f83373iobyxmoadg;
        }

        public String toString() {
            return "ChangePromoBanner(banner=" + this.f83373iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83374iobyxmoadg;

        public eablkybsjg(boolean z13) {
            this.f83374iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f83374iobyxmoadg == ((eablkybsjg) obj).f83374iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83374iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83374iobyxmoadg;
        }

        public String toString() {
            return "ChangeGridType(isGridType=" + this.f83374iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83375iobyxmoadg;

        public gtknphoqwx(String catalogSectionId) {
            zdlpuopuiu.btonecajqb(catalogSectionId, "catalogSectionId");
            this.f83375iobyxmoadg = catalogSectionId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f83375iobyxmoadg, ((gtknphoqwx) obj).f83375iobyxmoadg);
        }

        public int hashCode() {
            return this.f83375iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83375iobyxmoadg;
        }

        public String toString() {
            return "ChangeSelectedCatalogSection(catalogSectionId=" + this.f83375iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83376iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f83377zoijcleaow;

        public gxszxtbevo(String productId, boolean z13) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f83376iobyxmoadg = productId;
            this.f83377zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f83376iobyxmoadg, gxszxtbevoVar.f83376iobyxmoadg) && this.f83377zoijcleaow == gxszxtbevoVar.f83377zoijcleaow;
        }

        public int hashCode() {
            return (this.f83376iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f83377zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f83376iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductFavoriteState(productId=" + this.f83376iobyxmoadg + ", isFavorite=" + this.f83377zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f83377zoijcleaow;
        }
    }

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83378iobyxmoadg;

        public iobyxmoadg(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f83378iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83378iobyxmoadg, ((iobyxmoadg) obj).f83378iobyxmoadg);
        }

        public int hashCode() {
            return this.f83378iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83378iobyxmoadg;
        }

        public String toString() {
            return "AddExpandedProduct(productId=" + this.f83378iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: rp0.lqeggnwhkg$lqeggnwhkg, reason: collision with other inner class name */
    public static final class C1870lqeggnwhkg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83379iobyxmoadg;

        public C1870lqeggnwhkg(boolean z13) {
            this.f83379iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1870lqeggnwhkg) && this.f83379iobyxmoadg == ((C1870lqeggnwhkg) obj).f83379iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83379iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83379iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductListLoading(isLoading=" + this.f83379iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f83380iobyxmoadg;

        public nufgyqmvbu(mz0.ppxfxbqfkf sortType) {
            zdlpuopuiu.btonecajqb(sortType, "sortType");
            this.f83380iobyxmoadg = sortType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f83380iobyxmoadg == ((nufgyqmvbu) obj).f83380iobyxmoadg;
        }

        public int hashCode() {
            return this.f83380iobyxmoadg.hashCode();
        }

        public final mz0.ppxfxbqfkf iobyxmoadg() {
            return this.f83380iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductsSortType(sortType=" + this.f83380iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f83381iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 1807993186;
        }

        public String toString() {
            return "ShowComboSetShimmer";
        }
    }

    public static final class oxmwwwfdhm implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CatalogWithSubCatalogs f83382iobyxmoadg;

        public oxmwwwfdhm(CatalogWithSubCatalogs catalogSection) {
            zdlpuopuiu.btonecajqb(catalogSection, "catalogSection");
            this.f83382iobyxmoadg = catalogSection;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && zdlpuopuiu.eablkybsjg(this.f83382iobyxmoadg, ((oxmwwwfdhm) obj).f83382iobyxmoadg);
        }

        public int hashCode() {
            return this.f83382iobyxmoadg.hashCode();
        }

        public final CatalogWithSubCatalogs iobyxmoadg() {
            return this.f83382iobyxmoadg;
        }

        public String toString() {
            return "UpdateCatalogSection(catalogSection=" + this.f83382iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductListFeatureToggles f83383iobyxmoadg;

        public ppxfxbqfkf(ProductListFeatureToggles featureToggles) {
            zdlpuopuiu.btonecajqb(featureToggles, "featureToggles");
            this.f83383iobyxmoadg = featureToggles;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f83383iobyxmoadg, ((ppxfxbqfkf) obj).f83383iobyxmoadg);
        }

        public int hashCode() {
            return this.f83383iobyxmoadg.hashCode();
        }

        public final ProductListFeatureToggles iobyxmoadg() {
            return this.f83383iobyxmoadg;
        }

        public String toString() {
            return "ChangeFeatureToggles(featureToggles=" + this.f83383iobyxmoadg + ")";
        }
    }

    public static final class rgvfuqvkyq implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f83384iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return 698156850;
        }

        public String toString() {
            return "ShowRecommendationsShimmer";
        }
    }

    public static final class vdvldrhtss implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f83385iobyxmoadg;

        public vdvldrhtss(List productDataList) {
            zdlpuopuiu.btonecajqb(productDataList, "productDataList");
            this.f83385iobyxmoadg = productDataList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && zdlpuopuiu.eablkybsjg(this.f83385iobyxmoadg, ((vdvldrhtss) obj).f83385iobyxmoadg);
        }

        public int hashCode() {
            return this.f83385iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f83385iobyxmoadg;
        }

        public String toString() {
            return "UpdateCartProducts(productDataList=" + this.f83385iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductListData f83386iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f83387ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f83388wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f83389zoijcleaow;

        public wflxmlrfwp(ProductListData productListData, DeliveryCode deliveryCode, List banners, boolean z13) {
            zdlpuopuiu.btonecajqb(productListData, "productListData");
            zdlpuopuiu.btonecajqb(banners, "banners");
            this.f83386iobyxmoadg = productListData;
            this.f83389zoijcleaow = deliveryCode;
            this.f83387ppxfxbqfkf = banners;
            this.f83388wkgbmnqykc = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return zdlpuopuiu.eablkybsjg(this.f83386iobyxmoadg, wflxmlrfwpVar.f83386iobyxmoadg) && this.f83389zoijcleaow == wflxmlrfwpVar.f83389zoijcleaow && zdlpuopuiu.eablkybsjg(this.f83387ppxfxbqfkf, wflxmlrfwpVar.f83387ppxfxbqfkf) && this.f83388wkgbmnqykc == wflxmlrfwpVar.f83388wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = this.f83386iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f83389zoijcleaow;
            return ((((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f83387ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f83388wkgbmnqykc);
        }

        public final List iobyxmoadg() {
            return this.f83387ppxfxbqfkf;
        }

        public final ProductListData ppxfxbqfkf() {
            return this.f83386iobyxmoadg;
        }

        public String toString() {
            return "ProductsListDataFetched(productListData=" + this.f83386iobyxmoadg + ", deliveryCode=" + this.f83389zoijcleaow + ", banners=" + this.f83387ppxfxbqfkf + ", isCurrentPageFirst=" + this.f83388wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f83388wkgbmnqykc;
        }

        public final DeliveryCode zoijcleaow() {
            return this.f83389zoijcleaow;
        }
    }

    public static final class wkgbmnqykc implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83390iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f83390iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f83390iobyxmoadg == ((wkgbmnqykc) obj).f83390iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83390iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83390iobyxmoadg;
        }

        public String toString() {
            return "ChangeFullScreenLoading(isLoading=" + this.f83390iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f83391iobyxmoadg;

        public zoijcleaow(List comboSetList) {
            zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
            this.f83391iobyxmoadg = comboSetList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f83391iobyxmoadg, ((zoijcleaow) obj).f83391iobyxmoadg);
        }

        public int hashCode() {
            return this.f83391iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f83391iobyxmoadg;
        }

        public String toString() {
            return "ChangeComboSetList(comboSetList=" + this.f83391iobyxmoadg + ")";
        }
    }
}
