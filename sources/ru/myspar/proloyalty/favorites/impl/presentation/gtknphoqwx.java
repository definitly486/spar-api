package ru.myspar.proloyalty.favorites.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes5.dex */
public interface gtknphoqwx {

    public static final class dxjokdxxww implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f96331iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -689346100;
        }

        public String toString() {
            return "Refresh";
        }
    }

    public static final class eablkybsjg implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f96332iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement f96333zoijcleaow;

        public eablkybsjg(HintUiModel hint, AnalyticElement analyticElement) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f96332iobyxmoadg = hint;
            this.f96333zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f96332iobyxmoadg, eablkybsjgVar.f96332iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96333zoijcleaow, eablkybsjgVar.f96333zoijcleaow);
        }

        public int hashCode() {
            return (this.f96332iobyxmoadg.hashCode() * 31) + this.f96333zoijcleaow.hashCode();
        }

        public final AnalyticElement iobyxmoadg() {
            return this.f96333zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f96332iobyxmoadg + ", analyticElement=" + this.f96333zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f96332iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f96334iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -1849832816;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class iobyxmoadg implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f96335iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -603797486;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class lqeggnwhkg implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96336iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ProductCardEvent f96337zoijcleaow;

        public lqeggnwhkg(String productId, ProductCardEvent productCardEvent) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f96336iobyxmoadg = productId;
            this.f96337zoijcleaow = productCardEvent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return zdlpuopuiu.eablkybsjg(this.f96336iobyxmoadg, lqeggnwhkgVar.f96336iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96337zoijcleaow, lqeggnwhkgVar.f96337zoijcleaow);
        }

        public int hashCode() {
            return (this.f96336iobyxmoadg.hashCode() * 31) + this.f96337zoijcleaow.hashCode();
        }

        public final ProductCardEvent iobyxmoadg() {
            return this.f96337zoijcleaow;
        }

        public String toString() {
            return "OnProductChanged(productId=" + this.f96336iobyxmoadg + ", productCardEvent=" + this.f96337zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f96336iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96338iobyxmoadg;

        public nufgyqmvbu(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f96338iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f96338iobyxmoadg, ((nufgyqmvbu) obj).f96338iobyxmoadg);
        }

        public int hashCode() {
            return this.f96338iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96338iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(productId=" + this.f96338iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96339iobyxmoadg;

        public ppxfxbqfkf(String filterId) {
            zdlpuopuiu.btonecajqb(filterId, "filterId");
            this.f96339iobyxmoadg = filterId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f96339iobyxmoadg, ((ppxfxbqfkf) obj).f96339iobyxmoadg);
        }

        public int hashCode() {
            return this.f96339iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96339iobyxmoadg;
        }

        public String toString() {
            return "OnCategoryClicked(filterId=" + this.f96339iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96340iobyxmoadg;

        public wkgbmnqykc(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f96340iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f96340iobyxmoadg, ((wkgbmnqykc) obj).f96340iobyxmoadg);
        }

        public int hashCode() {
            return this.f96340iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96340iobyxmoadg;
        }

        public String toString() {
            return "OnFavoriteClicked(productId=" + this.f96340iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f96341iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -312460868;
        }

        public String toString() {
            return "OnCatalogClicked";
        }
    }
}
