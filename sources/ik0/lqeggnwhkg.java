package ik0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface lqeggnwhkg {

    public static final class dxjokdxxww implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f44634iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f44635ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f44636wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f44637zoijcleaow;

        public dxjokdxxww(boolean z13, boolean z14, boolean z15, boolean z16) {
            this.f44634iobyxmoadg = z13;
            this.f44637zoijcleaow = z14;
            this.f44635ppxfxbqfkf = z15;
            this.f44636wkgbmnqykc = z16;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return this.f44634iobyxmoadg == dxjokdxxwwVar.f44634iobyxmoadg && this.f44637zoijcleaow == dxjokdxxwwVar.f44637zoijcleaow && this.f44635ppxfxbqfkf == dxjokdxxwwVar.f44635ppxfxbqfkf && this.f44636wkgbmnqykc == dxjokdxxwwVar.f44636wkgbmnqykc;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f44634iobyxmoadg) * 31) + Boolean.hashCode(this.f44637zoijcleaow)) * 31) + Boolean.hashCode(this.f44635ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f44636wkgbmnqykc);
        }

        public final boolean iobyxmoadg() {
            return this.f44634iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f44637zoijcleaow;
        }

        public String toString() {
            return "UpdateFeatureToggles(isPurchasesListFeatureEnabled=" + this.f44634iobyxmoadg + ", isShareFeatureEnabled=" + this.f44637zoijcleaow + ", isVivinoFeatureEnabled=" + this.f44635ppxfxbqfkf + ", isRatingFeatureEnabled=" + this.f44636wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f44635ppxfxbqfkf;
        }

        public final boolean zoijcleaow() {
            return this.f44636wkgbmnqykc;
        }
    }

    public static final class eablkybsjg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f44638iobyxmoadg;

        public eablkybsjg(int i13) {
            this.f44638iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f44638iobyxmoadg == ((eablkybsjg) obj).f44638iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f44638iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f44638iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductSetCount(newCount=" + this.f44638iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f44639iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f44640ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f44641wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f44642zoijcleaow;

        public gxszxtbevo(String str, String str2, boolean z13, List products) {
            zdlpuopuiu.btonecajqb(products, "products");
            this.f44639iobyxmoadg = str;
            this.f44642zoijcleaow = str2;
            this.f44640ppxfxbqfkf = z13;
            this.f44641wkgbmnqykc = products;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f44639iobyxmoadg, gxszxtbevoVar.f44639iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f44642zoijcleaow, gxszxtbevoVar.f44642zoijcleaow) && this.f44640ppxfxbqfkf == gxszxtbevoVar.f44640ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f44641wkgbmnqykc, gxszxtbevoVar.f44641wkgbmnqykc);
        }

        public int hashCode() {
            String str = this.f44639iobyxmoadg;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f44642zoijcleaow;
            return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f44640ppxfxbqfkf)) * 31) + this.f44641wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f44642zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f44639iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductsFromBanner(title=" + this.f44639iobyxmoadg + ", imageBannerUrl=" + this.f44642zoijcleaow + ", isChangeProductCountEnabled=" + this.f44640ppxfxbqfkf + ", products=" + this.f44641wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f44640ppxfxbqfkf;
        }

        public final List zoijcleaow() {
            return this.f44641wkgbmnqykc;
        }
    }

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f44643iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f44643iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f44643iobyxmoadg == ((iobyxmoadg) obj).f44643iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f44643iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f44643iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoadingState(isLoading=" + this.f44643iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ik0.lqeggnwhkg$lqeggnwhkg, reason: collision with other inner class name */
    public static final class C1037lqeggnwhkg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1037lqeggnwhkg f44644iobyxmoadg = new C1037lqeggnwhkg();

        private C1037lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1037lqeggnwhkg);
        }

        public int hashCode() {
            return -2063543466;
        }

        public String toString() {
            return "SelectAllProducts";
        }
    }

    public static final class nufgyqmvbu implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f44645iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 1527245469;
        }

        public String toString() {
            return "UnselectAllProducts";
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f44646iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f44647ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f44648zoijcleaow;

        public ppxfxbqfkf(String productId, boolean z13, boolean z14) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f44646iobyxmoadg = productId;
            this.f44648zoijcleaow = z13;
            this.f44647ppxfxbqfkf = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f44646iobyxmoadg, ppxfxbqfkfVar.f44646iobyxmoadg) && this.f44648zoijcleaow == ppxfxbqfkfVar.f44648zoijcleaow && this.f44647ppxfxbqfkf == ppxfxbqfkfVar.f44647ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f44646iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f44648zoijcleaow)) * 31) + Boolean.hashCode(this.f44647ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f44646iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f44647ppxfxbqfkf;
        }

        public String toString() {
            return "ChangeProductFavoriteState(productId=" + this.f44646iobyxmoadg + ", isFavorite=" + this.f44648zoijcleaow + ", isFavoriteEnabled=" + this.f44647ppxfxbqfkf + ")";
        }

        public final boolean zoijcleaow() {
            return this.f44648zoijcleaow;
        }
    }

    public static final class wkgbmnqykc implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f44649iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f44650zoijcleaow;

        public wkgbmnqykc(String productId, boolean z13) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f44649iobyxmoadg = productId;
            this.f44650zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f44649iobyxmoadg, wkgbmnqykcVar.f44649iobyxmoadg) && this.f44650zoijcleaow == wkgbmnqykcVar.f44650zoijcleaow;
        }

        public int hashCode() {
            return (this.f44649iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f44650zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f44649iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductSelected(productId=" + this.f44649iobyxmoadg + ", isSelected=" + this.f44650zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f44650zoijcleaow;
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f44651iobyxmoadg;

        public zoijcleaow(List productData) {
            zdlpuopuiu.btonecajqb(productData, "productData");
            this.f44651iobyxmoadg = productData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f44651iobyxmoadg, ((zoijcleaow) obj).f44651iobyxmoadg);
        }

        public int hashCode() {
            return this.f44651iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f44651iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductData(productData=" + this.f44651iobyxmoadg + ")";
        }
    }
}
