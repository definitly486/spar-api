package ru.myspar.favorites.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes4.dex */
public interface gtknphoqwx {

    public static final class btonecajqb implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f88524iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return -1097830321;
        }

        public String toString() {
            return "Refresh";
        }
    }

    public static final class dxjokdxxww implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88525iobyxmoadg;

        public dxjokdxxww(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f88525iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f88525iobyxmoadg, ((dxjokdxxww) obj).f88525iobyxmoadg);
        }

        public int hashCode() {
            return this.f88525iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88525iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(productId=" + this.f88525iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88526iobyxmoadg;

        public eablkybsjg(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f88526iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f88526iobyxmoadg, ((eablkybsjg) obj).f88526iobyxmoadg);
        }

        public int hashCode() {
            return this.f88526iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88526iobyxmoadg;
        }

        public String toString() {
            return "OnFavoriteClicked(productId=" + this.f88526iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f88527iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f88528zoijcleaow;

        public gxszxtbevo(HintUiModel hint, AnalyticElement analyticElement) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f88527iobyxmoadg = hint;
            this.f88528zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f88527iobyxmoadg, gxszxtbevoVar.f88527iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88528zoijcleaow, gxszxtbevoVar.f88528zoijcleaow);
        }

        public int hashCode() {
            return (this.f88527iobyxmoadg.hashCode() * 31) + this.f88528zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f88528zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f88527iobyxmoadg + ", analyticElement=" + this.f88528zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f88527iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f88529iobyxmoadg;

        public iobyxmoadg(ChangeProductParams params) {
            zdlpuopuiu.btonecajqb(params, "params");
            this.f88529iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88529iobyxmoadg, ((iobyxmoadg) obj).f88529iobyxmoadg);
        }

        public int hashCode() {
            return this.f88529iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f88529iobyxmoadg;
        }

        public String toString() {
            return "OnAvailableOnlyForPickupDialogConfirmed(params=" + this.f88529iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f88530iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 934056237;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class nufgyqmvbu implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88531iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f88532zoijcleaow;

        public nufgyqmvbu(String productId, ProductCardEvent productCardEvent) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f88531iobyxmoadg = productId;
            this.f88532zoijcleaow = productCardEvent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f88531iobyxmoadg, nufgyqmvbuVar.f88531iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88532zoijcleaow, nufgyqmvbuVar.f88532zoijcleaow);
        }

        public int hashCode() {
            return (this.f88531iobyxmoadg.hashCode() * 31) + this.f88532zoijcleaow.hashCode();
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f88532zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(productId=" + this.f88531iobyxmoadg + ", productCardEvent=" + this.f88532zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f88531iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f88533iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1809110681;
        }

        public String toString() {
            return "OnCatalogClicked";
        }
    }

    public static final class wkgbmnqykc implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88534iobyxmoadg;

        public wkgbmnqykc(String filterId) {
            zdlpuopuiu.btonecajqb(filterId, "filterId");
            this.f88534iobyxmoadg = filterId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f88534iobyxmoadg, ((wkgbmnqykc) obj).f88534iobyxmoadg);
        }

        public int hashCode() {
            return this.f88534iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88534iobyxmoadg;
        }

        public String toString() {
            return "OnCategoryClicked(filterId=" + this.f88534iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f88535iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1583505323;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }
}
