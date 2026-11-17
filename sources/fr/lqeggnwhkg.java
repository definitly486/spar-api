package fr;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.catalog.impl.product_list.domain.model.ProductListFeatureToggles;
import ru.myspar.core.domain.models.catalog.CatalogWithSubCatalogs;
import ru.myspar.core.domain.models.catalog.ProductRecommendationsBlock;
import ru.myspar.core.domain.models.product.ProductListData;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public interface lqeggnwhkg {

    public static final class agtfadlqog implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f34690iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return -1689582913;
        }

        public String toString() {
            return "ShowComboSetShimmer";
        }
    }

    public static final class btonecajqb implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34691iobyxmoadg;

        public btonecajqb(String catalogSectionId) {
            zdlpuopuiu.btonecajqb(catalogSectionId, "catalogSectionId");
            this.f34691iobyxmoadg = catalogSectionId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f34691iobyxmoadg, ((btonecajqb) obj).f34691iobyxmoadg);
        }

        public int hashCode() {
            return this.f34691iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34691iobyxmoadg;
        }

        public String toString() {
            return "ChangeSelectedCatalogSection(catalogSectionId=" + this.f34691iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductListData f34692iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f34693ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f34694wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f34695zoijcleaow;

        public draadjrbmk(ProductListData productListData, DeliveryCode deliveryCode, List banners, boolean z13) {
            zdlpuopuiu.btonecajqb(productListData, "productListData");
            zdlpuopuiu.btonecajqb(banners, "banners");
            this.f34692iobyxmoadg = productListData;
            this.f34695zoijcleaow = deliveryCode;
            this.f34693ppxfxbqfkf = banners;
            this.f34694wkgbmnqykc = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return zdlpuopuiu.eablkybsjg(this.f34692iobyxmoadg, draadjrbmkVar.f34692iobyxmoadg) && this.f34695zoijcleaow == draadjrbmkVar.f34695zoijcleaow && zdlpuopuiu.eablkybsjg(this.f34693ppxfxbqfkf, draadjrbmkVar.f34693ppxfxbqfkf) && this.f34694wkgbmnqykc == draadjrbmkVar.f34694wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = this.f34692iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f34695zoijcleaow;
            return ((((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f34693ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f34694wkgbmnqykc);
        }

        public final List iobyxmoadg() {
            return this.f34693ppxfxbqfkf;
        }

        public final ProductListData ppxfxbqfkf() {
            return this.f34692iobyxmoadg;
        }

        public String toString() {
            return "ProductsListDataFetched(productListData=" + this.f34692iobyxmoadg + ", deliveryCode=" + this.f34695zoijcleaow + ", banners=" + this.f34693ppxfxbqfkf + ", isCurrentPageFirst=" + this.f34694wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f34694wkgbmnqykc;
        }

        public final DeliveryCode zoijcleaow() {
            return this.f34695zoijcleaow;
        }
    }

    public static final class dxjokdxxww implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductRecommendationsBlock f34696iobyxmoadg;

        public dxjokdxxww(ProductRecommendationsBlock productRecommendationsBlock) {
            this.f34696iobyxmoadg = productRecommendationsBlock;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f34696iobyxmoadg, ((dxjokdxxww) obj).f34696iobyxmoadg);
        }

        public int hashCode() {
            ProductRecommendationsBlock productRecommendationsBlock = this.f34696iobyxmoadg;
            if (productRecommendationsBlock == null) {
                return 0;
            }
            return productRecommendationsBlock.hashCode();
        }

        public final ProductRecommendationsBlock iobyxmoadg() {
            return this.f34696iobyxmoadg;
        }

        public String toString() {
            return "ChangeRecommendations(recommendation=" + this.f34696iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f34697iobyxmoadg;

        public eablkybsjg(boolean z13) {
            this.f34697iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f34697iobyxmoadg == ((eablkybsjg) obj).f34697iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f34697iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f34697iobyxmoadg;
        }

        public String toString() {
            return "ChangeGridType(isGridType=" + this.f34697iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f34698iobyxmoadg;

        public gtknphoqwx(boolean z13) {
            this.f34698iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f34698iobyxmoadg == ((gtknphoqwx) obj).f34698iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f34698iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f34698iobyxmoadg;
        }

        public String toString() {
            return "ChangeSwipeToRefreshLoading(isLoading=" + this.f34698iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34699iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f34700zoijcleaow;

        public gxszxtbevo(String productId, boolean z13) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f34699iobyxmoadg = productId;
            this.f34700zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f34699iobyxmoadg, gxszxtbevoVar.f34699iobyxmoadg) && this.f34700zoijcleaow == gxszxtbevoVar.f34700zoijcleaow;
        }

        public int hashCode() {
            return (this.f34699iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f34700zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f34699iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductFavoriteState(productId=" + this.f34699iobyxmoadg + ", isFavorite=" + this.f34700zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f34700zoijcleaow;
        }
    }

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34701iobyxmoadg;

        public iobyxmoadg(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f34701iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f34701iobyxmoadg, ((iobyxmoadg) obj).f34701iobyxmoadg);
        }

        public int hashCode() {
            return this.f34701iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34701iobyxmoadg;
        }

        public String toString() {
            return "AddExpandedProduct(productId=" + this.f34701iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: fr.lqeggnwhkg$lqeggnwhkg, reason: collision with other inner class name */
    public static final class C0769lqeggnwhkg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f34702iobyxmoadg;

        public C0769lqeggnwhkg(boolean z13) {
            this.f34702iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0769lqeggnwhkg) && this.f34702iobyxmoadg == ((C0769lqeggnwhkg) obj).f34702iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f34702iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f34702iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductListLoading(isLoading=" + this.f34702iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v00.ppxfxbqfkf f34703iobyxmoadg;

        public nufgyqmvbu(v00.ppxfxbqfkf sortType) {
            zdlpuopuiu.btonecajqb(sortType, "sortType");
            this.f34703iobyxmoadg = sortType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f34703iobyxmoadg == ((nufgyqmvbu) obj).f34703iobyxmoadg;
        }

        public int hashCode() {
            return this.f34703iobyxmoadg.hashCode();
        }

        public final v00.ppxfxbqfkf iobyxmoadg() {
            return this.f34703iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductsSortType(sortType=" + this.f34703iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f34704iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return -1543439563;
        }

        public String toString() {
            return "ShowRecommendationsShimmer";
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductListFeatureToggles f34705iobyxmoadg;

        public ppxfxbqfkf(ProductListFeatureToggles featureToggles) {
            zdlpuopuiu.btonecajqb(featureToggles, "featureToggles");
            this.f34705iobyxmoadg = featureToggles;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f34705iobyxmoadg, ((ppxfxbqfkf) obj).f34705iobyxmoadg);
        }

        public int hashCode() {
            return this.f34705iobyxmoadg.hashCode();
        }

        public final ProductListFeatureToggles iobyxmoadg() {
            return this.f34705iobyxmoadg;
        }

        public String toString() {
            return "ChangeFeatureToggles(featureToggles=" + this.f34705iobyxmoadg + ")";
        }
    }

    public static final class rgvfuqvkyq implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f34706iobyxmoadg;

        public rgvfuqvkyq(List productDataList) {
            zdlpuopuiu.btonecajqb(productDataList, "productDataList");
            this.f34706iobyxmoadg = productDataList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rgvfuqvkyq) && zdlpuopuiu.eablkybsjg(this.f34706iobyxmoadg, ((rgvfuqvkyq) obj).f34706iobyxmoadg);
        }

        public int hashCode() {
            return this.f34706iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f34706iobyxmoadg;
        }

        public String toString() {
            return "UpdateCartProducts(productDataList=" + this.f34706iobyxmoadg + ")";
        }
    }

    public static final class vdvldrhtss implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CatalogWithSubCatalogs f34707iobyxmoadg;

        public vdvldrhtss(CatalogWithSubCatalogs catalogSection) {
            zdlpuopuiu.btonecajqb(catalogSection, "catalogSection");
            this.f34707iobyxmoadg = catalogSection;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && zdlpuopuiu.eablkybsjg(this.f34707iobyxmoadg, ((vdvldrhtss) obj).f34707iobyxmoadg);
        }

        public int hashCode() {
            return this.f34707iobyxmoadg.hashCode();
        }

        public final CatalogWithSubCatalogs iobyxmoadg() {
            return this.f34707iobyxmoadg;
        }

        public String toString() {
            return "UpdateCatalogSection(catalogSection=" + this.f34707iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34708iobyxmoadg;

        public wflxmlrfwp(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f34708iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f34708iobyxmoadg, ((wflxmlrfwp) obj).f34708iobyxmoadg);
        }

        public int hashCode() {
            return this.f34708iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34708iobyxmoadg;
        }

        public String toString() {
            return "RemoveExpandedProduct(productId=" + this.f34708iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f34709iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f34709iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f34709iobyxmoadg == ((wkgbmnqykc) obj).f34709iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f34709iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f34709iobyxmoadg;
        }

        public String toString() {
            return "ChangeFullScreenLoading(isLoading=" + this.f34709iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f34710iobyxmoadg;

        public zoijcleaow(List comboSetList) {
            zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
            this.f34710iobyxmoadg = comboSetList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f34710iobyxmoadg, ((zoijcleaow) obj).f34710iobyxmoadg);
        }

        public int hashCode() {
            return this.f34710iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f34710iobyxmoadg;
        }

        public String toString() {
            return "ChangeComboSetList(comboSetList=" + this.f34710iobyxmoadg + ")";
        }
    }
}
