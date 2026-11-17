package yh1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125178iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f125179zoijcleaow;

        public btonecajqb(String productId, ProductCardEvent productCardEvent) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f125178iobyxmoadg = productId;
            this.f125179zoijcleaow = productCardEvent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f125178iobyxmoadg, btonecajqbVar.f125178iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f125179zoijcleaow, btonecajqbVar.f125179zoijcleaow);
        }

        public int hashCode() {
            return (this.f125178iobyxmoadg.hashCode() * 31) + this.f125179zoijcleaow.hashCode();
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f125179zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(productId=" + this.f125178iobyxmoadg + ", productCardEvent=" + this.f125179zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f125178iobyxmoadg;
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f125180iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f125181zoijcleaow;

        public dxjokdxxww(HintUiModel hint, AnalyticElement analyticElement) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f125180iobyxmoadg = hint;
            this.f125181zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return zdlpuopuiu.eablkybsjg(this.f125180iobyxmoadg, dxjokdxxwwVar.f125180iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f125181zoijcleaow, dxjokdxxwwVar.f125181zoijcleaow);
        }

        public int hashCode() {
            return (this.f125180iobyxmoadg.hashCode() * 31) + this.f125181zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f125181zoijcleaow;
        }

        public String toString() {
            return "OnHintClick(hint=" + this.f125180iobyxmoadg + ", analyticElement=" + this.f125181zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f125180iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: yh1.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C3191eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125182iobyxmoadg;

        public C3191eablkybsjg(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f125182iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3191eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f125182iobyxmoadg, ((C3191eablkybsjg) obj).f125182iobyxmoadg);
        }

        public int hashCode() {
            return this.f125182iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f125182iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSpecificProductScreen(productId=" + this.f125182iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f125183iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return -235496924;
        }

        public String toString() {
            return "ShowDialogSelectProductSetCount";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f125184iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 1175846901;
        }

        public String toString() {
            return "OnChangeAllProductsSelectable";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f125185iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -2025951502;
        }

        public String toString() {
            return "AddProductListToPurchasesList";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125186iobyxmoadg;

        public lqeggnwhkg(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f125186iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f125186iobyxmoadg, ((lqeggnwhkg) obj).f125186iobyxmoadg);
        }

        public int hashCode() {
            return this.f125186iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f125186iobyxmoadg;
        }

        public String toString() {
            return "OnChangeProductFavoriteState(productId=" + this.f125186iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125187iobyxmoadg;

        public nufgyqmvbu(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f125187iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f125187iobyxmoadg, ((nufgyqmvbu) obj).f125187iobyxmoadg);
        }

        public int hashCode() {
            return this.f125187iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f125187iobyxmoadg;
        }

        public String toString() {
            return "OnChangeProductSelectable(productId=" + this.f125187iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125188iobyxmoadg;

        public ppxfxbqfkf(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f125188iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f125188iobyxmoadg, ((ppxfxbqfkf) obj).f125188iobyxmoadg);
        }

        public int hashCode() {
            return this.f125188iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f125188iobyxmoadg;
        }

        public String toString() {
            return "AddProductToPurchasesList(productId=" + this.f125188iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f125189iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -2046551025;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f125190iobyxmoadg;

        public zoijcleaow(int i13) {
            this.f125190iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f125190iobyxmoadg == ((zoijcleaow) obj).f125190iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f125190iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f125190iobyxmoadg;
        }

        public String toString() {
            return "AddProductSetToCart(productSetCount=" + this.f125190iobyxmoadg + ")";
        }
    }
}
