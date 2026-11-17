package ru.myspar.catalog.impl.specific_product.domain.store;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.product.ProductVariant;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.rate.review.api.model.Reviews;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f85711iobyxmoadg;

        public btonecajqb(Map recommendations) {
            zdlpuopuiu.btonecajqb(recommendations, "recommendations");
            this.f85711iobyxmoadg = recommendations;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f85711iobyxmoadg, ((btonecajqb) obj).f85711iobyxmoadg);
        }

        public int hashCode() {
            return this.f85711iobyxmoadg.hashCode();
        }

        public final Map iobyxmoadg() {
            return this.f85711iobyxmoadg;
        }

        public String toString() {
            return "SetRecommendations(recommendations=" + this.f85711iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductVariant f85712iobyxmoadg;

        public draadjrbmk(ProductVariant variant) {
            zdlpuopuiu.btonecajqb(variant, "variant");
            this.f85712iobyxmoadg = variant;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f85712iobyxmoadg, ((draadjrbmk) obj).f85712iobyxmoadg);
        }

        public int hashCode() {
            return this.f85712iobyxmoadg.hashCode();
        }

        public final ProductVariant iobyxmoadg() {
            return this.f85712iobyxmoadg;
        }

        public String toString() {
            return "SetVariant(variant=" + this.f85712iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f85713eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final DeliveryCode f85714iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f85715ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f85716wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Product f85717zoijcleaow;

        public dxjokdxxww(DeliveryCode deliveryCode, Product product, boolean z13, boolean z14, boolean z15) {
            zdlpuopuiu.btonecajqb(product, "product");
            this.f85714iobyxmoadg = deliveryCode;
            this.f85717zoijcleaow = product;
            this.f85715ppxfxbqfkf = z13;
            this.f85716wkgbmnqykc = z14;
            this.f85713eablkybsjg = z15;
        }

        public final boolean eablkybsjg() {
            return this.f85716wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return this.f85714iobyxmoadg == dxjokdxxwwVar.f85714iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f85717zoijcleaow, dxjokdxxwwVar.f85717zoijcleaow) && this.f85715ppxfxbqfkf == dxjokdxxwwVar.f85715ppxfxbqfkf && this.f85716wkgbmnqykc == dxjokdxxwwVar.f85716wkgbmnqykc && this.f85713eablkybsjg == dxjokdxxwwVar.f85713eablkybsjg;
        }

        public int hashCode() {
            DeliveryCode deliveryCode = this.f85714iobyxmoadg;
            return ((((((((deliveryCode == null ? 0 : deliveryCode.hashCode()) * 31) + this.f85717zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f85715ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f85716wkgbmnqykc)) * 31) + Boolean.hashCode(this.f85713eablkybsjg);
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f85714iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f85715ppxfxbqfkf;
        }

        public String toString() {
            return "SetMainProduct(deliveryCode=" + this.f85714iobyxmoadg + ", product=" + this.f85717zoijcleaow + ", isPurchaseListsFeatureEnabled=" + this.f85715ppxfxbqfkf + ", isVivinoFeatureEnabled=" + this.f85716wkgbmnqykc + ", isRatingFeatureEnabled=" + this.f85713eablkybsjg + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f85713eablkybsjg;
        }

        public final Product zoijcleaow() {
            return this.f85717zoijcleaow;
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f85718iobyxmoadg;

        public eablkybsjg(List productData) {
            zdlpuopuiu.btonecajqb(productData, "productData");
            this.f85718iobyxmoadg = productData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f85718iobyxmoadg, ((eablkybsjg) obj).f85718iobyxmoadg);
        }

        public int hashCode() {
            return this.f85718iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f85718iobyxmoadg;
        }

        public String toString() {
            return "SetCartProducts(productData=" + this.f85718iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Reviews f85719iobyxmoadg;

        public gtknphoqwx(Reviews reviews) {
            zdlpuopuiu.btonecajqb(reviews, "reviews");
            this.f85719iobyxmoadg = reviews;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f85719iobyxmoadg, ((gtknphoqwx) obj).f85719iobyxmoadg);
        }

        public int hashCode() {
            return this.f85719iobyxmoadg.hashCode();
        }

        public final Reviews iobyxmoadg() {
            return this.f85719iobyxmoadg;
        }

        public String toString() {
            return "SetReviews(reviews=" + this.f85719iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1953gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f85720iobyxmoadg;

        public C1953gxszxtbevo(List list) {
            this.f85720iobyxmoadg = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1953gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f85720iobyxmoadg, ((C1953gxszxtbevo) obj).f85720iobyxmoadg);
        }

        public int hashCode() {
            List list = this.f85720iobyxmoadg;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f85720iobyxmoadg;
        }

        public String toString() {
            return "SetComboList(comboSetList=" + this.f85720iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85721iobyxmoadg;

        public iobyxmoadg(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f85721iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85721iobyxmoadg, ((iobyxmoadg) obj).f85721iobyxmoadg);
        }

        public int hashCode() {
            return this.f85721iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85721iobyxmoadg;
        }

        public String toString() {
            return "AddExpandedProduct(productId=" + this.f85721iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SpecificProductStore$Dialog f85722iobyxmoadg;

        public lqeggnwhkg(SpecificProductStore$Dialog specificProductStore$Dialog) {
            this.f85722iobyxmoadg = specificProductStore$Dialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f85722iobyxmoadg, ((lqeggnwhkg) obj).f85722iobyxmoadg);
        }

        public int hashCode() {
            SpecificProductStore$Dialog specificProductStore$Dialog = this.f85722iobyxmoadg;
            if (specificProductStore$Dialog == null) {
                return 0;
            }
            return specificProductStore$Dialog.hashCode();
        }

        public final SpecificProductStore$Dialog iobyxmoadg() {
            return this.f85722iobyxmoadg;
        }

        public String toString() {
            return "SetDialog(dialog=" + this.f85722iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f85723iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            this.f85723iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f85723iobyxmoadg == ((nufgyqmvbu) obj).f85723iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f85723iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f85723iobyxmoadg;
        }

        public String toString() {
            return "SetLoading(isLoading=" + this.f85723iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85724iobyxmoadg;

        public ppxfxbqfkf(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f85724iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f85724iobyxmoadg, ((ppxfxbqfkf) obj).f85724iobyxmoadg);
        }

        public int hashCode() {
            return this.f85724iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85724iobyxmoadg;
        }

        public String toString() {
            return "RemoveExpandedProduct(productId=" + this.f85724iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f85725iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -545108513;
        }

        public String toString() {
            return "SetAnalyticsLoadCompleted";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85726iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f85727zoijcleaow;

        public zoijcleaow(String productId, boolean z13) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f85726iobyxmoadg = productId;
            this.f85727zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f85726iobyxmoadg, zoijcleaowVar.f85726iobyxmoadg) && this.f85727zoijcleaow == zoijcleaowVar.f85727zoijcleaow;
        }

        public int hashCode() {
            return (this.f85726iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f85727zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f85726iobyxmoadg;
        }

        public String toString() {
            return "ChangeFavoriteProduct(productId=" + this.f85726iobyxmoadg + ", isFavorite=" + this.f85727zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f85727zoijcleaow;
        }
    }
}
