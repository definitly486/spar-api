package ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class btonecajqb implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99342iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f99343zoijcleaow;

        public btonecajqb(String productId, ProductCardEvent productCardEvent) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f99342iobyxmoadg = productId;
            this.f99343zoijcleaow = productCardEvent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f99342iobyxmoadg, btonecajqbVar.f99342iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99343zoijcleaow, btonecajqbVar.f99343zoijcleaow);
        }

        public int hashCode() {
            return (this.f99342iobyxmoadg.hashCode() * 31) + this.f99343zoijcleaow.hashCode();
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f99343zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(productId=" + this.f99342iobyxmoadg + ", productCardEvent=" + this.f99343zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f99342iobyxmoadg;
        }
    }

    public static final class dxjokdxxww implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f99344iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f99345zoijcleaow;

        public dxjokdxxww(HintUiModel hint, AnalyticElement analyticElement) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f99344iobyxmoadg = hint;
            this.f99345zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return zdlpuopuiu.eablkybsjg(this.f99344iobyxmoadg, dxjokdxxwwVar.f99344iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99345zoijcleaow, dxjokdxxwwVar.f99345zoijcleaow);
        }

        public int hashCode() {
            return (this.f99344iobyxmoadg.hashCode() * 31) + this.f99345zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f99345zoijcleaow;
        }

        public String toString() {
            return "OnHintClick(hint=" + this.f99344iobyxmoadg + ", analyticElement=" + this.f99345zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f99344iobyxmoadg;
        }
    }

    public static final class eablkybsjg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f99346iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 1897048822;
        }

        public String toString() {
            return "OnBtnBuyProductsClick";
        }
    }

    public static final class gtknphoqwx implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99347iobyxmoadg;

        public gtknphoqwx(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f99347iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f99347iobyxmoadg, ((gtknphoqwx) obj).f99347iobyxmoadg);
        }

        public int hashCode() {
            return this.f99347iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99347iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(productId=" + this.f99347iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99348iobyxmoadg;

        public gxszxtbevo(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f99348iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f99348iobyxmoadg, ((gxszxtbevo) obj).f99348iobyxmoadg);
        }

        public int hashCode() {
            return this.f99348iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99348iobyxmoadg;
        }

        public String toString() {
            return "OnChangeProductSelectable(productId=" + this.f99348iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f99349iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1479601250;
        }

        public String toString() {
            return "OnAddProductListToPurchasesListClicked";
        }
    }

    public static final class lqeggnwhkg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f99350iobyxmoadg;

        public lqeggnwhkg(int i13) {
            this.f99350iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f99350iobyxmoadg == ((lqeggnwhkg) obj).f99350iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f99350iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f99350iobyxmoadg;
        }

        public String toString() {
            return "OnChangeProductSetCount(count=" + this.f99350iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f99351iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 449851082;
        }

        public String toString() {
            return "OnCheckBoxAllProductsClick";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2374ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99352iobyxmoadg;

        public C2374ppxfxbqfkf(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f99352iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2374ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f99352iobyxmoadg, ((C2374ppxfxbqfkf) obj).f99352iobyxmoadg);
        }

        public int hashCode() {
            return this.f99352iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99352iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToPurchasesListClicked(productId=" + this.f99352iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f99353iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1261842057;
        }

        public String toString() {
            return "OnBtnBackClick";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99354iobyxmoadg;

        public zoijcleaow(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f99354iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99354iobyxmoadg, ((zoijcleaow) obj).f99354iobyxmoadg);
        }

        public int hashCode() {
            return this.f99354iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99354iobyxmoadg;
        }

        public String toString() {
            return "OnAddProductToFavoriteClicked(productId=" + this.f99354iobyxmoadg + ")";
        }
    }
}
