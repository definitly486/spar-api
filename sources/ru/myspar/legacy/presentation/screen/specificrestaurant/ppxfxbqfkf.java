package ru.myspar.legacy.presentation.screen.specificrestaurant;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.legacy.presentation.screen.specificrestaurant.models.RestaurantSectionUiModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89869iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String productArticle) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f89869iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f89869iobyxmoadg, ((eablkybsjg) obj).f89869iobyxmoadg);
        }

        public int hashCode() {
            return this.f89869iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89869iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(productArticle=" + this.f89869iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f89870iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f89871iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f89872iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RestaurantSectionUiModel f89873iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(RestaurantSectionUiModel catalog) {
            super(null);
            zdlpuopuiu.btonecajqb(catalog, "catalog");
            this.f89873iobyxmoadg = catalog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f89873iobyxmoadg, ((nufgyqmvbu) obj).f89873iobyxmoadg);
        }

        public int hashCode() {
            return this.f89873iobyxmoadg.hashCode();
        }

        public final RestaurantSectionUiModel iobyxmoadg() {
            return this.f89873iobyxmoadg;
        }

        public String toString() {
            return "OnSubCategoryClicked(catalog=" + this.f89873iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2064ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2064ppxfxbqfkf f89874iobyxmoadg = new C2064ppxfxbqfkf();

        private C2064ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f89875iobyxmoadg;

        public wkgbmnqykc(int i13) {
            super(null);
            this.f89875iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f89875iobyxmoadg == ((wkgbmnqykc) obj).f89875iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f89875iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f89875iobyxmoadg;
        }

        public String toString() {
            return "OnNextPage(position=" + this.f89875iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89876iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f89877zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String productArticle, double d13) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f89876iobyxmoadg = productArticle;
            this.f89877zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f89876iobyxmoadg, zoijcleaowVar.f89876iobyxmoadg) && Double.compare(this.f89877zoijcleaow, zoijcleaowVar.f89877zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f89876iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f89877zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f89876iobyxmoadg;
        }

        public String toString() {
            return "OnBuyProductClicked(productArticle=" + this.f89876iobyxmoadg + ", quantity=" + this.f89877zoijcleaow + ")";
        }

        public final double zoijcleaow() {
            return this.f89877zoijcleaow;
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
