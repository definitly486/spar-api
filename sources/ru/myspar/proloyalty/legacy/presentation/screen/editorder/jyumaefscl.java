package ru.myspar.proloyalty.legacy.presentation.screen.editorder;

import ru.myspar.proloyalty.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes5.dex */
public interface jyumaefscl {

    public static final class agtfadlqog implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f96814iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return 21634913;
        }

        public String toString() {
            return "OnResetClicked";
        }
    }

    public static final class btonecajqb implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CartProductUiModel f96815iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f96816zoijcleaow;

        public btonecajqb(CartProductUiModel product, ProductCardEvent productCardEvent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f96815iobyxmoadg = product;
            this.f96816zoijcleaow = productCardEvent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f96815iobyxmoadg, btonecajqbVar.f96815iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f96816zoijcleaow, btonecajqbVar.f96816zoijcleaow);
        }

        public int hashCode() {
            return (this.f96815iobyxmoadg.hashCode() * 31) + this.f96816zoijcleaow.hashCode();
        }

        public final CartProductUiModel iobyxmoadg() {
            return this.f96815iobyxmoadg;
        }

        public String toString() {
            return "OnProductChanged(product=" + this.f96815iobyxmoadg + ", productCardEvent=" + this.f96816zoijcleaow + ")";
        }

        public final ProductCardEvent zoijcleaow() {
            return this.f96816zoijcleaow;
        }
    }

    public static final class draadjrbmk implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96817iobyxmoadg;

        public draadjrbmk(String promo) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promo, "promo");
            this.f96817iobyxmoadg = promo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f96817iobyxmoadg, ((draadjrbmk) obj).f96817iobyxmoadg);
        }

        public int hashCode() {
            return this.f96817iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96817iobyxmoadg;
        }

        public String toString() {
            return "OnPromoChanged(promo=" + this.f96817iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f96818iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -1969479264;
        }

        public String toString() {
            return "OnPaymentEditClicked";
        }
    }

    public static final class eablkybsjg implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f96819iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 167954876;
        }

        public String toString() {
            return "OnCancelDialogClicked";
        }
    }

    public static final class gtknphoqwx implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CartProductUiModel f96820iobyxmoadg;

        public gtknphoqwx(CartProductUiModel product) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f96820iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f96820iobyxmoadg, ((gtknphoqwx) obj).f96820iobyxmoadg);
        }

        public int hashCode() {
            return this.f96820iobyxmoadg.hashCode();
        }

        public final CartProductUiModel iobyxmoadg() {
            return this.f96820iobyxmoadg;
        }

        public String toString() {
            return "OnProductRemove(product=" + this.f96820iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f96821iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -1545242828;
        }

        public String toString() {
            return "OnCancelOrderDialogClicked";
        }
    }

    public static final class iobyxmoadg implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f96822iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1866249817;
        }

        public String toString() {
            return "OnAcceptEditTimeExpire";
        }
    }

    public static final class lqeggnwhkg implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f96823iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 1019564603;
        }

        public String toString() {
            return "OnEditCommentClicked";
        }
    }

    public static final class nufgyqmvbu implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f96824iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -557250289;
        }

        public String toString() {
            return "OnIntervalEditClicked";
        }
    }

    public static final class ojitshcjhn implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f96825iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 434913089;
        }

        public String toString() {
            return "OnSaveClicked";
        }
    }

    public static final class ppxfxbqfkf implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f96826iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -116001603;
        }

        public String toString() {
            return "OnApplyPromoClicked";
        }
    }

    public static final class rgvfuqvkyq implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f96827iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return 1415921613;
        }

        public String toString() {
            return "OnSaveTempClicked";
        }
    }

    public static final class wflxmlrfwp implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f96828iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -1797454427;
        }

        public String toString() {
            return "OnReceiverEditClicked";
        }
    }

    public static final class wkgbmnqykc implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f96829iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1527828329;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class zoijcleaow implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f96830iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -411042607;
        }

        public String toString() {
            return "OnAddFromCatalogClick";
        }
    }
}
