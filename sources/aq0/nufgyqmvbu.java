package aq0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.core.domain.models.product.ProductListData;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public interface nufgyqmvbu {

    public static final class agtfadlqog implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14165iobyxmoadg;

        public agtfadlqog(String history) {
            zdlpuopuiu.btonecajqb(history, "history");
            this.f14165iobyxmoadg = history;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && zdlpuopuiu.eablkybsjg(this.f14165iobyxmoadg, ((agtfadlqog) obj).f14165iobyxmoadg);
        }

        public int hashCode() {
            return this.f14165iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f14165iobyxmoadg;
        }

        public String toString() {
            return "DeleteSearchHistoryItem(history=" + this.f14165iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f14166iobyxmoadg;

        public btonecajqb(mz0.ppxfxbqfkf type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f14166iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && this.f14166iobyxmoadg == ((btonecajqb) obj).f14166iobyxmoadg;
        }

        public int hashCode() {
            return this.f14166iobyxmoadg.hashCode();
        }

        public final mz0.ppxfxbqfkf iobyxmoadg() {
            return this.f14166iobyxmoadg;
        }

        public String toString() {
            return "ChangeSortType(type=" + this.f14166iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f14167iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return -967176342;
        }

        public String toString() {
            return "ClearSearchHistory";
        }
    }

    public static final class dxjokdxxww implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f14168iobyxmoadg;

        public dxjokdxxww(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f14168iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f14168iobyxmoadg, ((dxjokdxxww) obj).f14168iobyxmoadg);
        }

        public int hashCode() {
            return this.f14168iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f14168iobyxmoadg;
        }

        public String toString() {
            return "ChangeSearchInput(input=" + this.f14168iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f14169iobyxmoadg;

        public eablkybsjg(boolean z13) {
            this.f14169iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f14169iobyxmoadg == ((eablkybsjg) obj).f14169iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14169iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f14169iobyxmoadg;
        }

        public String toString() {
            return "ChangeGridType(isGridType=" + this.f14169iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f14170iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return -1633757365;
        }

        public String toString() {
            return "ClearProductList";
        }
    }

    public static final class gxszxtbevo implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f14171iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f14172zoijcleaow;

        public gxszxtbevo(List history, List recommendations) {
            zdlpuopuiu.btonecajqb(history, "history");
            zdlpuopuiu.btonecajqb(recommendations, "recommendations");
            this.f14171iobyxmoadg = history;
            this.f14172zoijcleaow = recommendations;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f14171iobyxmoadg, gxszxtbevoVar.f14171iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14172zoijcleaow, gxszxtbevoVar.f14172zoijcleaow);
        }

        public int hashCode() {
            return (this.f14171iobyxmoadg.hashCode() * 31) + this.f14172zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f14171iobyxmoadg;
        }

        public String toString() {
            return "ChangeHistoryAndRecommendations(history=" + this.f14171iobyxmoadg + ", recommendations=" + this.f14172zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f14172zoijcleaow;
        }
    }

    public static final class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14173iobyxmoadg;

        public iobyxmoadg(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f14173iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14173iobyxmoadg, ((iobyxmoadg) obj).f14173iobyxmoadg);
        }

        public int hashCode() {
            return this.f14173iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f14173iobyxmoadg;
        }

        public String toString() {
            return "AddExpandedProduct(productId=" + this.f14173iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f14174iobyxmoadg;

        public lqeggnwhkg(boolean z13) {
            this.f14174iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f14174iobyxmoadg == ((lqeggnwhkg) obj).f14174iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14174iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f14174iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoading(isLoading=" + this.f14174iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: aq0.nufgyqmvbu$nufgyqmvbu, reason: collision with other inner class name */
    public static final class C0219nufgyqmvbu implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f14175iobyxmoadg;

        public C0219nufgyqmvbu(boolean z13) {
            this.f14175iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0219nufgyqmvbu) && this.f14175iobyxmoadg == ((C0219nufgyqmvbu) obj).f14175iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14175iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f14175iobyxmoadg;
        }

        public String toString() {
            return "ChangePageLoading(isLoading=" + this.f14175iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductListData f14176iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f14177ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f14178wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f14179zoijcleaow;

        public ojitshcjhn(ProductListData productListData, DeliveryCode deliveryCode, int i13, boolean z13) {
            zdlpuopuiu.btonecajqb(productListData, "productListData");
            this.f14176iobyxmoadg = productListData;
            this.f14179zoijcleaow = deliveryCode;
            this.f14177ppxfxbqfkf = i13;
            this.f14178wkgbmnqykc = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ojitshcjhn)) {
                return false;
            }
            ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
            return zdlpuopuiu.eablkybsjg(this.f14176iobyxmoadg, ojitshcjhnVar.f14176iobyxmoadg) && this.f14179zoijcleaow == ojitshcjhnVar.f14179zoijcleaow && this.f14177ppxfxbqfkf == ojitshcjhnVar.f14177ppxfxbqfkf && this.f14178wkgbmnqykc == ojitshcjhnVar.f14178wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = this.f14176iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f14179zoijcleaow;
            return ((((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + Integer.hashCode(this.f14177ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f14178wkgbmnqykc);
        }

        public final int iobyxmoadg() {
            return this.f14177ppxfxbqfkf;
        }

        public final boolean ppxfxbqfkf() {
            return this.f14178wkgbmnqykc;
        }

        public String toString() {
            return "ProductsListDataFetched(productListData=" + this.f14176iobyxmoadg + ", deliveryCode=" + this.f14179zoijcleaow + ", currentPage=" + this.f14177ppxfxbqfkf + ", filterSortPanelIsVisible=" + this.f14178wkgbmnqykc + ")";
        }

        public final ProductListData wkgbmnqykc() {
            return this.f14176iobyxmoadg;
        }

        public final DeliveryCode zoijcleaow() {
            return this.f14179zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14180iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f14181zoijcleaow;

        public ppxfxbqfkf(String productId, boolean z13) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f14180iobyxmoadg = productId;
            this.f14181zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f14180iobyxmoadg, ppxfxbqfkfVar.f14180iobyxmoadg) && this.f14181zoijcleaow == ppxfxbqfkfVar.f14181zoijcleaow;
        }

        public int hashCode() {
            return (this.f14180iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f14181zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f14180iobyxmoadg;
        }

        public String toString() {
            return "ChangeFavoriteProduct(productId=" + this.f14180iobyxmoadg + ", isFavorite=" + this.f14181zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f14181zoijcleaow;
        }
    }

    public static final class rgvfuqvkyq implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14182iobyxmoadg;

        public rgvfuqvkyq(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f14182iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rgvfuqvkyq) && zdlpuopuiu.eablkybsjg(this.f14182iobyxmoadg, ((rgvfuqvkyq) obj).f14182iobyxmoadg);
        }

        public int hashCode() {
            return this.f14182iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f14182iobyxmoadg;
        }

        public String toString() {
            return "RemoveExpandedProduct(productId=" + this.f14182iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f14183iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -1400665735;
        }

        public String toString() {
            return "ClearSearchResultItems";
        }
    }

    public static final class wkgbmnqykc implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f14184iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f14185ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f14186wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f14187zoijcleaow;

        public wkgbmnqykc(boolean z13, boolean z14, boolean z15, boolean z16) {
            this.f14184iobyxmoadg = z13;
            this.f14187zoijcleaow = z14;
            this.f14185ppxfxbqfkf = z15;
            this.f14186wkgbmnqykc = z16;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return this.f14184iobyxmoadg == wkgbmnqykcVar.f14184iobyxmoadg && this.f14187zoijcleaow == wkgbmnqykcVar.f14187zoijcleaow && this.f14185ppxfxbqfkf == wkgbmnqykcVar.f14185ppxfxbqfkf && this.f14186wkgbmnqykc == wkgbmnqykcVar.f14186wkgbmnqykc;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f14184iobyxmoadg) * 31) + Boolean.hashCode(this.f14187zoijcleaow)) * 31) + Boolean.hashCode(this.f14185ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f14186wkgbmnqykc);
        }

        public final boolean iobyxmoadg() {
            return this.f14187zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f14186wkgbmnqykc;
        }

        public String toString() {
            return "ChangeFeatureToggles(isRatingFeatureEnabled=" + this.f14184iobyxmoadg + ", isPurchaseListsFeatureEnabled=" + this.f14187zoijcleaow + ", isVivinoFeatureEnabled=" + this.f14185ppxfxbqfkf + ", isSearchSuggestionsEnabled=" + this.f14186wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f14185ppxfxbqfkf;
        }

        public final boolean zoijcleaow() {
            return this.f14184iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f14188iobyxmoadg;

        public zoijcleaow(List productData) {
            zdlpuopuiu.btonecajqb(productData, "productData");
            this.f14188iobyxmoadg = productData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f14188iobyxmoadg, ((zoijcleaow) obj).f14188iobyxmoadg);
        }

        public int hashCode() {
            return this.f14188iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f14188iobyxmoadg;
        }

        public String toString() {
            return "ChangeCartProductData(productData=" + this.f14188iobyxmoadg + ")";
        }
    }
}
