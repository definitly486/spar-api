package yh1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface lqeggnwhkg {

    public static final class dxjokdxxww implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f125212iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f125213ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f125214wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f125215zoijcleaow;

        public dxjokdxxww(boolean z13, boolean z14, boolean z15, boolean z16) {
            this.f125212iobyxmoadg = z13;
            this.f125215zoijcleaow = z14;
            this.f125213ppxfxbqfkf = z15;
            this.f125214wkgbmnqykc = z16;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return this.f125212iobyxmoadg == dxjokdxxwwVar.f125212iobyxmoadg && this.f125215zoijcleaow == dxjokdxxwwVar.f125215zoijcleaow && this.f125213ppxfxbqfkf == dxjokdxxwwVar.f125213ppxfxbqfkf && this.f125214wkgbmnqykc == dxjokdxxwwVar.f125214wkgbmnqykc;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f125212iobyxmoadg) * 31) + Boolean.hashCode(this.f125215zoijcleaow)) * 31) + Boolean.hashCode(this.f125213ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f125214wkgbmnqykc);
        }

        public final boolean iobyxmoadg() {
            return this.f125212iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f125215zoijcleaow;
        }

        public String toString() {
            return "UpdateFeatureToggles(isPurchasesListFeatureEnabled=" + this.f125212iobyxmoadg + ", isShareFeatureEnabled=" + this.f125215zoijcleaow + ", isVivinoFeatureEnabled=" + this.f125213ppxfxbqfkf + ", isRatingFeatureEnabled=" + this.f125214wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f125213ppxfxbqfkf;
        }

        public final boolean zoijcleaow() {
            return this.f125214wkgbmnqykc;
        }
    }

    public static final class eablkybsjg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f125216iobyxmoadg;

        public eablkybsjg(int i13) {
            this.f125216iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f125216iobyxmoadg == ((eablkybsjg) obj).f125216iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f125216iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f125216iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductSetCount(newCount=" + this.f125216iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125217iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f125218ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f125219wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f125220zoijcleaow;

        public gxszxtbevo(String str, String str2, boolean z13, List products) {
            zdlpuopuiu.btonecajqb(products, "products");
            this.f125217iobyxmoadg = str;
            this.f125220zoijcleaow = str2;
            this.f125218ppxfxbqfkf = z13;
            this.f125219wkgbmnqykc = products;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f125217iobyxmoadg, gxszxtbevoVar.f125217iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f125220zoijcleaow, gxszxtbevoVar.f125220zoijcleaow) && this.f125218ppxfxbqfkf == gxszxtbevoVar.f125218ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f125219wkgbmnqykc, gxszxtbevoVar.f125219wkgbmnqykc);
        }

        public int hashCode() {
            String str = this.f125217iobyxmoadg;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f125220zoijcleaow;
            return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f125218ppxfxbqfkf)) * 31) + this.f125219wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f125220zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f125217iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductsFromBanner(title=" + this.f125217iobyxmoadg + ", imageBannerUrl=" + this.f125220zoijcleaow + ", isChangeProductCountEnabled=" + this.f125218ppxfxbqfkf + ", products=" + this.f125219wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f125218ppxfxbqfkf;
        }

        public final List zoijcleaow() {
            return this.f125219wkgbmnqykc;
        }
    }

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f125221iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f125221iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f125221iobyxmoadg == ((iobyxmoadg) obj).f125221iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f125221iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f125221iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoadingState(isLoading=" + this.f125221iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: yh1.lqeggnwhkg$lqeggnwhkg, reason: collision with other inner class name */
    public static final class C3193lqeggnwhkg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C3193lqeggnwhkg f125222iobyxmoadg = new C3193lqeggnwhkg();

        private C3193lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C3193lqeggnwhkg);
        }

        public int hashCode() {
            return -1320171757;
        }

        public String toString() {
            return "SelectAllProducts";
        }
    }

    public static final class nufgyqmvbu implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f125223iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -1352080614;
        }

        public String toString() {
            return "UnselectAllProducts";
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125224iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f125225ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f125226zoijcleaow;

        public ppxfxbqfkf(String productId, boolean z13, boolean z14) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f125224iobyxmoadg = productId;
            this.f125226zoijcleaow = z13;
            this.f125225ppxfxbqfkf = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f125224iobyxmoadg, ppxfxbqfkfVar.f125224iobyxmoadg) && this.f125226zoijcleaow == ppxfxbqfkfVar.f125226zoijcleaow && this.f125225ppxfxbqfkf == ppxfxbqfkfVar.f125225ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f125224iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f125226zoijcleaow)) * 31) + Boolean.hashCode(this.f125225ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f125224iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f125225ppxfxbqfkf;
        }

        public String toString() {
            return "ChangeProductFavoriteState(productId=" + this.f125224iobyxmoadg + ", isFavorite=" + this.f125226zoijcleaow + ", isFavoriteEnabled=" + this.f125225ppxfxbqfkf + ")";
        }

        public final boolean zoijcleaow() {
            return this.f125226zoijcleaow;
        }
    }

    public static final class wkgbmnqykc implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125227iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f125228zoijcleaow;

        public wkgbmnqykc(String productId, boolean z13) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f125227iobyxmoadg = productId;
            this.f125228zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f125227iobyxmoadg, wkgbmnqykcVar.f125227iobyxmoadg) && this.f125228zoijcleaow == wkgbmnqykcVar.f125228zoijcleaow;
        }

        public int hashCode() {
            return (this.f125227iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f125228zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f125227iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductSelected(productId=" + this.f125227iobyxmoadg + ", isSelected=" + this.f125228zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f125228zoijcleaow;
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f125229iobyxmoadg;

        public zoijcleaow(List productData) {
            zdlpuopuiu.btonecajqb(productData, "productData");
            this.f125229iobyxmoadg = productData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f125229iobyxmoadg, ((zoijcleaow) obj).f125229iobyxmoadg);
        }

        public int hashCode() {
            return this.f125229iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f125229iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductData(productData=" + this.f125229iobyxmoadg + ")";
        }
    }
}
