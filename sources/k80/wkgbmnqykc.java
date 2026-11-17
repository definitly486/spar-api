package k80;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.restaurants.RestaurantSection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f54181iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String productArticle) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f54181iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f54181iobyxmoadg, ((eablkybsjg) obj).f54181iobyxmoadg);
        }

        public int hashCode() {
            return this.f54181iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f54181iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(productArticle=" + this.f54181iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f54182iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f54183iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f54184iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RestaurantSection f54185iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(RestaurantSection catalog) {
            super(null);
            zdlpuopuiu.btonecajqb(catalog, "catalog");
            this.f54185iobyxmoadg = catalog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f54185iobyxmoadg, ((nufgyqmvbu) obj).f54185iobyxmoadg);
        }

        public int hashCode() {
            return this.f54185iobyxmoadg.hashCode();
        }

        public final RestaurantSection iobyxmoadg() {
            return this.f54185iobyxmoadg;
        }

        public String toString() {
            return "OnSubCategoryClicked(catalog=" + this.f54185iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f54186iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: k80.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1166wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f54187iobyxmoadg;

        public C1166wkgbmnqykc(int i13) {
            super(null);
            this.f54187iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1166wkgbmnqykc) && this.f54187iobyxmoadg == ((C1166wkgbmnqykc) obj).f54187iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f54187iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f54187iobyxmoadg;
        }

        public String toString() {
            return "OnNextPage(position=" + this.f54187iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f54188iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f54189zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String productArticle, double d13) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f54188iobyxmoadg = productArticle;
            this.f54189zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f54188iobyxmoadg, zoijcleaowVar.f54188iobyxmoadg) && Double.compare(this.f54189zoijcleaow, zoijcleaowVar.f54189zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f54188iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f54189zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f54188iobyxmoadg;
        }

        public String toString() {
            return "OnBuyProductClicked(productArticle=" + this.f54188iobyxmoadg + ", quantity=" + this.f54189zoijcleaow + ")";
        }

        public final double zoijcleaow() {
            return this.f54189zoijcleaow;
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
