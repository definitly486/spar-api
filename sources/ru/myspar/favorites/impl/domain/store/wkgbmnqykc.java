package ru.myspar.favorites.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88480iobyxmoadg;

        public btonecajqb(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f88480iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f88480iobyxmoadg, ((btonecajqb) obj).f88480iobyxmoadg);
        }

        public int hashCode() {
            return this.f88480iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88480iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(productId=" + this.f88480iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f88481iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return -1243068956;
        }

        public String toString() {
            return "Refresh";
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88482iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f88483zoijcleaow;

        public dxjokdxxww(String productId, ProductCardEvent productCardEvent) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f88482iobyxmoadg = productId;
            this.f88483zoijcleaow = productCardEvent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return zdlpuopuiu.eablkybsjg(this.f88482iobyxmoadg, dxjokdxxwwVar.f88482iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88483zoijcleaow, dxjokdxxwwVar.f88483zoijcleaow);
        }

        public int hashCode() {
            return (this.f88482iobyxmoadg.hashCode() * 31) + this.f88483zoijcleaow.hashCode();
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f88483zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(productId=" + this.f88482iobyxmoadg + ", productCardEvent=" + this.f88483zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f88482iobyxmoadg;
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88484iobyxmoadg;

        public eablkybsjg(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f88484iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f88484iobyxmoadg, ((eablkybsjg) obj).f88484iobyxmoadg);
        }

        public int hashCode() {
            return this.f88484iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88484iobyxmoadg;
        }

        public String toString() {
            return "OnFavoriteClicked(productId=" + this.f88484iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f88485iobyxmoadg;

        public gtknphoqwx(boolean z13) {
            this.f88485iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f88485iobyxmoadg == ((gtknphoqwx) obj).f88485iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88485iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f88485iobyxmoadg;
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f88485iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f88486iobyxmoadg;

        public gxszxtbevo(boolean z13) {
            this.f88486iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && this.f88486iobyxmoadg == ((gxszxtbevo) obj).f88486iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88486iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f88486iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f88486iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f88487iobyxmoadg;

        public iobyxmoadg(ChangeProductParams params) {
            zdlpuopuiu.btonecajqb(params, "params");
            this.f88487iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88487iobyxmoadg, ((iobyxmoadg) obj).f88487iobyxmoadg);
        }

        public int hashCode() {
            return this.f88487iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f88487iobyxmoadg;
        }

        public String toString() {
            return "OnAvailableOnlyForPickupDialogConfirmed(params=" + this.f88487iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f88488iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f88489zoijcleaow;

        public lqeggnwhkg(HintUiModel hint, AnalyticElement analyticElement) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f88488iobyxmoadg = hint;
            this.f88489zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return zdlpuopuiu.eablkybsjg(this.f88488iobyxmoadg, lqeggnwhkgVar.f88488iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88489zoijcleaow, lqeggnwhkgVar.f88489zoijcleaow);
        }

        public int hashCode() {
            return (this.f88488iobyxmoadg.hashCode() * 31) + this.f88489zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f88489zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f88488iobyxmoadg + ", analyticElement=" + this.f88489zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f88488iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f88490iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -838051976;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f88491iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 272332964;
        }

        public String toString() {
            return "OnCatalogClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.favorites.impl.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2030wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88492iobyxmoadg;

        public C2030wkgbmnqykc(String filterId) {
            zdlpuopuiu.btonecajqb(filterId, "filterId");
            this.f88492iobyxmoadg = filterId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2030wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f88492iobyxmoadg, ((C2030wkgbmnqykc) obj).f88492iobyxmoadg);
        }

        public int hashCode() {
            return this.f88492iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88492iobyxmoadg;
        }

        public String toString() {
            return "OnCategoryClicked(filterId=" + this.f88492iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f88493iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -721276374;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }
}
