package ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.models.RestaurantSectionUiModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97499iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String productArticle) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f97499iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f97499iobyxmoadg, ((eablkybsjg) obj).f97499iobyxmoadg);
        }

        public int hashCode() {
            return this.f97499iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97499iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(productArticle=" + this.f97499iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f97500iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f97501iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f97502iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RestaurantSectionUiModel f97503iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(RestaurantSectionUiModel catalog) {
            super(null);
            zdlpuopuiu.btonecajqb(catalog, "catalog");
            this.f97503iobyxmoadg = catalog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f97503iobyxmoadg, ((nufgyqmvbu) obj).f97503iobyxmoadg);
        }

        public int hashCode() {
            return this.f97503iobyxmoadg.hashCode();
        }

        public final RestaurantSectionUiModel iobyxmoadg() {
            return this.f97503iobyxmoadg;
        }

        public String toString() {
            return "OnSubCategoryClicked(catalog=" + this.f97503iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2304ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2304ppxfxbqfkf f97504iobyxmoadg = new C2304ppxfxbqfkf();

        private C2304ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f97505iobyxmoadg;

        public wkgbmnqykc(int i13) {
            super(null);
            this.f97505iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f97505iobyxmoadg == ((wkgbmnqykc) obj).f97505iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f97505iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f97505iobyxmoadg;
        }

        public String toString() {
            return "OnNextPage(position=" + this.f97505iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97506iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f97507zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String productArticle, double d13) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f97506iobyxmoadg = productArticle;
            this.f97507zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f97506iobyxmoadg, zoijcleaowVar.f97506iobyxmoadg) && Double.compare(this.f97507zoijcleaow, zoijcleaowVar.f97507zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f97506iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f97507zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f97506iobyxmoadg;
        }

        public String toString() {
            return "OnBuyProductClicked(productArticle=" + this.f97506iobyxmoadg + ", quantity=" + this.f97507zoijcleaow + ")";
        }

        public final double zoijcleaow() {
            return this.f97507zoijcleaow;
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
