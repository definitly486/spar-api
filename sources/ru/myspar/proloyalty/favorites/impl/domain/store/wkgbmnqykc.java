package ru.myspar.proloyalty.favorites.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f96291iobyxmoadg;

        public btonecajqb(boolean z13) {
            this.f96291iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && this.f96291iobyxmoadg == ((btonecajqb) obj).f96291iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f96291iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f96291iobyxmoadg;
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f96291iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96292iobyxmoadg;

        public dxjokdxxww(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f96292iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f96292iobyxmoadg, ((dxjokdxxww) obj).f96292iobyxmoadg);
        }

        public int hashCode() {
            return this.f96292iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96292iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(productId=" + this.f96292iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f96293iobyxmoadg;

        public eablkybsjg(boolean z13) {
            this.f96293iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f96293iobyxmoadg == ((eablkybsjg) obj).f96293iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f96293iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f96293iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f96293iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f96294iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return 468243489;
        }

        public String toString() {
            return "Refresh";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f96295iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f96296zoijcleaow;

        public gxszxtbevo(HintUiModel hint, AnalyticElement analyticElement) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f96295iobyxmoadg = hint;
            this.f96296zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f96295iobyxmoadg, gxszxtbevoVar.f96295iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96296zoijcleaow, gxszxtbevoVar.f96296zoijcleaow);
        }

        public int hashCode() {
            return (this.f96295iobyxmoadg.hashCode() * 31) + this.f96296zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f96296zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f96295iobyxmoadg + ", analyticElement=" + this.f96296zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f96295iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f96297iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 180117159;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f96298iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -390806501;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96299iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f96300zoijcleaow;

        public nufgyqmvbu(String productId, ProductCardEvent productCardEvent) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f96299iobyxmoadg = productId;
            this.f96300zoijcleaow = productCardEvent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f96299iobyxmoadg, nufgyqmvbuVar.f96299iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96300zoijcleaow, nufgyqmvbuVar.f96300zoijcleaow);
        }

        public int hashCode() {
            return (this.f96299iobyxmoadg.hashCode() * 31) + this.f96300zoijcleaow.hashCode();
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f96300zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(productId=" + this.f96299iobyxmoadg + ", productCardEvent=" + this.f96300zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f96299iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96301iobyxmoadg;

        public ppxfxbqfkf(String filterId) {
            zdlpuopuiu.btonecajqb(filterId, "filterId");
            this.f96301iobyxmoadg = filterId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f96301iobyxmoadg, ((ppxfxbqfkf) obj).f96301iobyxmoadg);
        }

        public int hashCode() {
            return this.f96301iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96301iobyxmoadg;
        }

        public String toString() {
            return "OnCategoryClicked(filterId=" + this.f96301iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.favorites.impl.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2274wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96302iobyxmoadg;

        public C2274wkgbmnqykc(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f96302iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2274wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f96302iobyxmoadg, ((C2274wkgbmnqykc) obj).f96302iobyxmoadg);
        }

        public int hashCode() {
            return this.f96302iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96302iobyxmoadg;
        }

        public String toString() {
            return "OnFavoriteClicked(productId=" + this.f96302iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f96303iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1551539975;
        }

        public String toString() {
            return "OnCatalogClicked";
        }
    }
}
