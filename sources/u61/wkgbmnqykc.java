package u61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantSection;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f112844iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String productArticle) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f112844iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f112844iobyxmoadg, ((eablkybsjg) obj).f112844iobyxmoadg);
        }

        public int hashCode() {
            return this.f112844iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f112844iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(productArticle=" + this.f112844iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f112845iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f112846iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f112847iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RestaurantSection f112848iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(RestaurantSection catalog) {
            super(null);
            zdlpuopuiu.btonecajqb(catalog, "catalog");
            this.f112848iobyxmoadg = catalog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f112848iobyxmoadg, ((nufgyqmvbu) obj).f112848iobyxmoadg);
        }

        public int hashCode() {
            return this.f112848iobyxmoadg.hashCode();
        }

        public final RestaurantSection iobyxmoadg() {
            return this.f112848iobyxmoadg;
        }

        public String toString() {
            return "OnSubCategoryClicked(catalog=" + this.f112848iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f112849iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: u61.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2793wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f112850iobyxmoadg;

        public C2793wkgbmnqykc(int i13) {
            super(null);
            this.f112850iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2793wkgbmnqykc) && this.f112850iobyxmoadg == ((C2793wkgbmnqykc) obj).f112850iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f112850iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f112850iobyxmoadg;
        }

        public String toString() {
            return "OnNextPage(position=" + this.f112850iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f112851iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f112852zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String productArticle, double d13) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f112851iobyxmoadg = productArticle;
            this.f112852zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f112851iobyxmoadg, zoijcleaowVar.f112851iobyxmoadg) && Double.compare(this.f112852zoijcleaow, zoijcleaowVar.f112852zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f112851iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f112852zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f112851iobyxmoadg;
        }

        public String toString() {
            return "OnBuyProductClicked(productArticle=" + this.f112851iobyxmoadg + ", quantity=" + this.f112852zoijcleaow + ")";
        }

        public final double zoijcleaow() {
            return this.f112852zoijcleaow;
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
