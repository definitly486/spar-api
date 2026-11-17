package ru.myspar.legacy.presentation.screen.editorder;

import ru.myspar.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes4.dex */
public interface jyumaefscl {

    public static final class agtfadlqog implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f89030iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return -49168412;
        }

        public String toString() {
            return "OnResetClicked";
        }
    }

    public static final class btonecajqb implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CartProductUiModel f89031iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f89032zoijcleaow;

        public btonecajqb(CartProductUiModel product, ProductCardEvent productCardEvent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f89031iobyxmoadg = product;
            this.f89032zoijcleaow = productCardEvent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f89031iobyxmoadg, btonecajqbVar.f89031iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f89032zoijcleaow, btonecajqbVar.f89032zoijcleaow);
        }

        public int hashCode() {
            return (this.f89031iobyxmoadg.hashCode() * 31) + this.f89032zoijcleaow.hashCode();
        }

        public final CartProductUiModel iobyxmoadg() {
            return this.f89031iobyxmoadg;
        }

        public String toString() {
            return "OnProductChanged(product=" + this.f89031iobyxmoadg + ", productCardEvent=" + this.f89032zoijcleaow + ")";
        }

        public final ProductCardEvent zoijcleaow() {
            return this.f89032zoijcleaow;
        }
    }

    public static final class draadjrbmk implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89033iobyxmoadg;

        public draadjrbmk(String promo) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promo, "promo");
            this.f89033iobyxmoadg = promo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f89033iobyxmoadg, ((draadjrbmk) obj).f89033iobyxmoadg);
        }

        public int hashCode() {
            return this.f89033iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89033iobyxmoadg;
        }

        public String toString() {
            return "OnPromoChanged(promo=" + this.f89033iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f89034iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return 1274811363;
        }

        public String toString() {
            return "OnPaymentEditClicked";
        }
    }

    public static final class eablkybsjg implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f89035iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 1956716505;
        }

        public String toString() {
            return "OnCancelDialogClicked";
        }
    }

    public static final class gtknphoqwx implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CartProductUiModel f89036iobyxmoadg;

        public gtknphoqwx(CartProductUiModel product) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
            this.f89036iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f89036iobyxmoadg, ((gtknphoqwx) obj).f89036iobyxmoadg);
        }

        public int hashCode() {
            return this.f89036iobyxmoadg.hashCode();
        }

        public final CartProductUiModel iobyxmoadg() {
            return this.f89036iobyxmoadg;
        }

        public String toString() {
            return "OnProductRemove(product=" + this.f89036iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f89037iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 508128055;
        }

        public String toString() {
            return "OnCancelOrderDialogClicked";
        }
    }

    public static final class iobyxmoadg implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f89038iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 2045753130;
        }

        public String toString() {
            return "OnAcceptEditTimeExpire";
        }
    }

    public static final class lqeggnwhkg implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f89039iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -31112066;
        }

        public String toString() {
            return "OnEditCommentClicked";
        }
    }

    public static final class nufgyqmvbu implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f89040iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 1231511340;
        }

        public String toString() {
            return "OnIntervalEditClicked";
        }
    }

    public static final class ojitshcjhn implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f89041iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return -398654882;
        }

        public String toString() {
            return "OnSaveClicked";
        }
    }

    public static final class ppxfxbqfkf implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f89042iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 681389594;
        }

        public String toString() {
            return "OnApplyPromoClicked";
        }
    }

    public static final class rgvfuqvkyq implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f89043iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return 943008874;
        }

        public String toString() {
            return "OnSaveTempClicked";
        }
    }

    public static final class wflxmlrfwp implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f89044iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -8692798;
        }

        public String toString() {
            return "OnReceiverEditClicked";
        }
    }

    public static final class wkgbmnqykc implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f89045iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1933570996;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class zoijcleaow implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f89046iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1377719022;
        }

        public String toString() {
            return "OnAddFromCatalogClick";
        }
    }
}
