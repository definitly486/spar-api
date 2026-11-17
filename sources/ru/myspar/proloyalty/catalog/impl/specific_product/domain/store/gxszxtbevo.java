package ru.myspar.proloyalty.catalog.impl.specific_product.domain.store;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.ProductVariant;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.rate.review.api.model.Reviews;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f93441iobyxmoadg;

        public btonecajqb(Map recommendations) {
            zdlpuopuiu.btonecajqb(recommendations, "recommendations");
            this.f93441iobyxmoadg = recommendations;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f93441iobyxmoadg, ((btonecajqb) obj).f93441iobyxmoadg);
        }

        public int hashCode() {
            return this.f93441iobyxmoadg.hashCode();
        }

        public final Map iobyxmoadg() {
            return this.f93441iobyxmoadg;
        }

        public String toString() {
            return "SetRecommendations(recommendations=" + this.f93441iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductVariant f93442iobyxmoadg;

        public draadjrbmk(ProductVariant variant) {
            zdlpuopuiu.btonecajqb(variant, "variant");
            this.f93442iobyxmoadg = variant;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f93442iobyxmoadg, ((draadjrbmk) obj).f93442iobyxmoadg);
        }

        public int hashCode() {
            return this.f93442iobyxmoadg.hashCode();
        }

        public final ProductVariant iobyxmoadg() {
            return this.f93442iobyxmoadg;
        }

        public String toString() {
            return "SetVariant(variant=" + this.f93442iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f93443eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final DeliveryCode f93444iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f93445ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f93446wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Product f93447zoijcleaow;

        public dxjokdxxww(DeliveryCode deliveryCode, Product product, boolean z13, boolean z14, boolean z15) {
            zdlpuopuiu.btonecajqb(product, "product");
            this.f93444iobyxmoadg = deliveryCode;
            this.f93447zoijcleaow = product;
            this.f93445ppxfxbqfkf = z13;
            this.f93446wkgbmnqykc = z14;
            this.f93443eablkybsjg = z15;
        }

        public final boolean eablkybsjg() {
            return this.f93446wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return this.f93444iobyxmoadg == dxjokdxxwwVar.f93444iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f93447zoijcleaow, dxjokdxxwwVar.f93447zoijcleaow) && this.f93445ppxfxbqfkf == dxjokdxxwwVar.f93445ppxfxbqfkf && this.f93446wkgbmnqykc == dxjokdxxwwVar.f93446wkgbmnqykc && this.f93443eablkybsjg == dxjokdxxwwVar.f93443eablkybsjg;
        }

        public int hashCode() {
            DeliveryCode deliveryCode = this.f93444iobyxmoadg;
            return ((((((((deliveryCode == null ? 0 : deliveryCode.hashCode()) * 31) + this.f93447zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f93445ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f93446wkgbmnqykc)) * 31) + Boolean.hashCode(this.f93443eablkybsjg);
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f93444iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f93445ppxfxbqfkf;
        }

        public String toString() {
            return "SetMainProduct(deliveryCode=" + this.f93444iobyxmoadg + ", product=" + this.f93447zoijcleaow + ", isPurchaseListsFeatureEnabled=" + this.f93445ppxfxbqfkf + ", isVivinoFeatureEnabled=" + this.f93446wkgbmnqykc + ", isRatingFeatureEnabled=" + this.f93443eablkybsjg + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f93443eablkybsjg;
        }

        public final Product zoijcleaow() {
            return this.f93447zoijcleaow;
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f93448iobyxmoadg;

        public eablkybsjg(List productData) {
            zdlpuopuiu.btonecajqb(productData, "productData");
            this.f93448iobyxmoadg = productData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f93448iobyxmoadg, ((eablkybsjg) obj).f93448iobyxmoadg);
        }

        public int hashCode() {
            return this.f93448iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f93448iobyxmoadg;
        }

        public String toString() {
            return "SetCartProducts(productData=" + this.f93448iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Reviews f93449iobyxmoadg;

        public gtknphoqwx(Reviews reviews) {
            zdlpuopuiu.btonecajqb(reviews, "reviews");
            this.f93449iobyxmoadg = reviews;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f93449iobyxmoadg, ((gtknphoqwx) obj).f93449iobyxmoadg);
        }

        public int hashCode() {
            return this.f93449iobyxmoadg.hashCode();
        }

        public final Reviews iobyxmoadg() {
            return this.f93449iobyxmoadg;
        }

        public String toString() {
            return "SetReviews(reviews=" + this.f93449iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2192gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f93450iobyxmoadg;

        public C2192gxszxtbevo(List list) {
            this.f93450iobyxmoadg = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2192gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f93450iobyxmoadg, ((C2192gxszxtbevo) obj).f93450iobyxmoadg);
        }

        public int hashCode() {
            List list = this.f93450iobyxmoadg;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f93450iobyxmoadg;
        }

        public String toString() {
            return "SetComboList(comboSetList=" + this.f93450iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93451iobyxmoadg;

        public iobyxmoadg(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f93451iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f93451iobyxmoadg, ((iobyxmoadg) obj).f93451iobyxmoadg);
        }

        public int hashCode() {
            return this.f93451iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93451iobyxmoadg;
        }

        public String toString() {
            return "AddExpandedProduct(productId=" + this.f93451iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SpecificProductStore$Dialog f93452iobyxmoadg;

        public lqeggnwhkg(SpecificProductStore$Dialog specificProductStore$Dialog) {
            this.f93452iobyxmoadg = specificProductStore$Dialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f93452iobyxmoadg, ((lqeggnwhkg) obj).f93452iobyxmoadg);
        }

        public int hashCode() {
            SpecificProductStore$Dialog specificProductStore$Dialog = this.f93452iobyxmoadg;
            if (specificProductStore$Dialog == null) {
                return 0;
            }
            return specificProductStore$Dialog.hashCode();
        }

        public final SpecificProductStore$Dialog iobyxmoadg() {
            return this.f93452iobyxmoadg;
        }

        public String toString() {
            return "SetDialog(dialog=" + this.f93452iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f93453iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            this.f93453iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f93453iobyxmoadg == ((nufgyqmvbu) obj).f93453iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f93453iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f93453iobyxmoadg;
        }

        public String toString() {
            return "SetLoading(isLoading=" + this.f93453iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93454iobyxmoadg;

        public ppxfxbqfkf(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f93454iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f93454iobyxmoadg, ((ppxfxbqfkf) obj).f93454iobyxmoadg);
        }

        public int hashCode() {
            return this.f93454iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93454iobyxmoadg;
        }

        public String toString() {
            return "RemoveExpandedProduct(productId=" + this.f93454iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f93455iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 390096130;
        }

        public String toString() {
            return "SetAnalyticsLoadCompleted";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93456iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f93457zoijcleaow;

        public zoijcleaow(String productId, boolean z13) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f93456iobyxmoadg = productId;
            this.f93457zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f93456iobyxmoadg, zoijcleaowVar.f93456iobyxmoadg) && this.f93457zoijcleaow == zoijcleaowVar.f93457zoijcleaow;
        }

        public int hashCode() {
            return (this.f93456iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f93457zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f93456iobyxmoadg;
        }

        public String toString() {
            return "ChangeFavoriteProduct(productId=" + this.f93456iobyxmoadg + ", isFavorite=" + this.f93457zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f93457zoijcleaow;
        }
    }
}
