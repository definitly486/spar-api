package ru.myspar.products_from_banner.impl.presentation.product_set;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes3.dex */
public interface ppxfxbqfkf {

    public static final class btonecajqb implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f91644iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f91645zoijcleaow;

        public btonecajqb(HintUiModel hint, AnalyticElement analyticElement) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f91644iobyxmoadg = hint;
            this.f91645zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f91644iobyxmoadg, btonecajqbVar.f91644iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91645zoijcleaow, btonecajqbVar.f91645zoijcleaow);
        }

        public int hashCode() {
            return (this.f91644iobyxmoadg.hashCode() * 31) + this.f91645zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f91645zoijcleaow;
        }

        public String toString() {
            return "OnHintClick(hint=" + this.f91644iobyxmoadg + ", analyticElement=" + this.f91645zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f91644iobyxmoadg;
        }
    }

    public static final class draadjrbmk implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91646iobyxmoadg;

        public draadjrbmk(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f91646iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f91646iobyxmoadg, ((draadjrbmk) obj).f91646iobyxmoadg);
        }

        public int hashCode() {
            return this.f91646iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91646iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(productId=" + this.f91646iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f91647iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -1673104914;
        }

        public String toString() {
            return "OnConfirmedAvailableOnlyForPickup";
        }
    }

    public static final class eablkybsjg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f91648iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 115393593;
        }

        public String toString() {
            return "OnBtnBuyProductsClick";
        }
    }

    public static final class gtknphoqwx implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91649iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f91650zoijcleaow;

        public gtknphoqwx(String productId, ProductCardEvent productCardEvent) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f91649iobyxmoadg = productId;
            this.f91650zoijcleaow = productCardEvent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return zdlpuopuiu.eablkybsjg(this.f91649iobyxmoadg, gtknphoqwxVar.f91649iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91650zoijcleaow, gtknphoqwxVar.f91650zoijcleaow);
        }

        public int hashCode() {
            return (this.f91649iobyxmoadg.hashCode() * 31) + this.f91650zoijcleaow.hashCode();
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f91650zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(productId=" + this.f91649iobyxmoadg + ", productCardEvent=" + this.f91650zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f91649iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91651iobyxmoadg;

        public gxszxtbevo(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f91651iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f91651iobyxmoadg, ((gxszxtbevo) obj).f91651iobyxmoadg);
        }

        public int hashCode() {
            return this.f91651iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91651iobyxmoadg;
        }

        public String toString() {
            return "OnChangeProductSelectable(productId=" + this.f91651iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f91652iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 157688191;
        }

        public String toString() {
            return "OnAddProductListToPurchasesListClicked";
        }
    }

    public static final class lqeggnwhkg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f91653iobyxmoadg;

        public lqeggnwhkg(int i13) {
            this.f91653iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f91653iobyxmoadg == ((lqeggnwhkg) obj).f91653iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f91653iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f91653iobyxmoadg;
        }

        public String toString() {
            return "OnChangeProductSetCount(count=" + this.f91653iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f91654iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 289302375;
        }

        public String toString() {
            return "OnCheckBoxAllProductsClick";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.products_from_banner.impl.presentation.product_set.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2127ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91655iobyxmoadg;

        public C2127ppxfxbqfkf(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f91655iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2127ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f91655iobyxmoadg, ((C2127ppxfxbqfkf) obj).f91655iobyxmoadg);
        }

        public int hashCode() {
            return this.f91655iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91655iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToPurchasesListClicked(productId=" + this.f91655iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f91656iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -307844442;
        }

        public String toString() {
            return "OnBtnBackClick";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91657iobyxmoadg;

        public zoijcleaow(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f91657iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f91657iobyxmoadg, ((zoijcleaow) obj).f91657iobyxmoadg);
        }

        public int hashCode() {
            return this.f91657iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91657iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToFavoriteClicked(productId=" + this.f91657iobyxmoadg + ")";
        }
    }
}
