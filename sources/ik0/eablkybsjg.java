package ik0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes3.dex */
public interface eablkybsjg {

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f44597iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f44598zoijcleaow;

        public btonecajqb(HintUiModel hint, AnalyticElement analyticElement) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f44597iobyxmoadg = hint;
            this.f44598zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f44597iobyxmoadg, btonecajqbVar.f44597iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f44598zoijcleaow, btonecajqbVar.f44598zoijcleaow);
        }

        public int hashCode() {
            return (this.f44597iobyxmoadg.hashCode() * 31) + this.f44598zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f44598zoijcleaow;
        }

        public String toString() {
            return "OnHintClick(hint=" + this.f44597iobyxmoadg + ", analyticElement=" + this.f44598zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f44597iobyxmoadg;
        }
    }

    public static final class draadjrbmk implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f44599iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return -917539545;
        }

        public String toString() {
            return "ShowDialogSelectProductSetCount";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f44600iobyxmoadg;

        public dxjokdxxww(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f44600iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f44600iobyxmoadg, ((dxjokdxxww) obj).f44600iobyxmoadg);
        }

        public int hashCode() {
            return this.f44600iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f44600iobyxmoadg;
        }

        public String toString() {
            return "OnChangeProductSelectable(productId=" + this.f44600iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ik0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1035eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1035eablkybsjg f44601iobyxmoadg = new C1035eablkybsjg();

        private C1035eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1035eablkybsjg);
        }

        public int hashCode() {
            return 1964454380;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f44602iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f44603zoijcleaow;

        public gtknphoqwx(String productId, ProductCardEvent productCardEvent) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f44602iobyxmoadg = productId;
            this.f44603zoijcleaow = productCardEvent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return zdlpuopuiu.eablkybsjg(this.f44602iobyxmoadg, gtknphoqwxVar.f44602iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f44603zoijcleaow, gtknphoqwxVar.f44603zoijcleaow);
        }

        public int hashCode() {
            return (this.f44602iobyxmoadg.hashCode() * 31) + this.f44603zoijcleaow.hashCode();
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f44603zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(productId=" + this.f44602iobyxmoadg + ", productCardEvent=" + this.f44603zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f44602iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f44604iobyxmoadg;

        public gxszxtbevo(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f44604iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f44604iobyxmoadg, ((gxszxtbevo) obj).f44604iobyxmoadg);
        }

        public int hashCode() {
            return this.f44604iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f44604iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSpecificProductScreen(productId=" + this.f44604iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f44605iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -368562507;
        }

        public String toString() {
            return "AddProductListToPurchasesList";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f44606iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1461731400;
        }

        public String toString() {
            return "OnChangeAllProductsSelectable";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f44607iobyxmoadg;

        public nufgyqmvbu(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f44607iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f44607iobyxmoadg, ((nufgyqmvbu) obj).f44607iobyxmoadg);
        }

        public int hashCode() {
            return this.f44607iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f44607iobyxmoadg;
        }

        public String toString() {
            return "OnChangeProductFavoriteState(productId=" + this.f44607iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f44608iobyxmoadg;

        public ppxfxbqfkf(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f44608iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f44608iobyxmoadg, ((ppxfxbqfkf) obj).f44608iobyxmoadg);
        }

        public int hashCode() {
            return this.f44608iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f44608iobyxmoadg;
        }

        public String toString() {
            return "AddProductToPurchasesList(productId=" + this.f44608iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f44609iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 854117339;
        }

        public String toString() {
            return "ConfirmedAvailableOnlyForPickup";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f44610iobyxmoadg;

        public zoijcleaow(int i13) {
            this.f44610iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f44610iobyxmoadg == ((zoijcleaow) obj).f44610iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f44610iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f44610iobyxmoadg;
        }

        public String toString() {
            return "AddProductSetToCart(productSetCount=" + this.f44610iobyxmoadg + ")";
        }
    }
}
