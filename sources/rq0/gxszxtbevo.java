package rq0;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogWithSubCatalogs;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CatalogWithSubCatalogs f83604iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f83605zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(CatalogWithSubCatalogs catalog, List banners) {
            super(null);
            zdlpuopuiu.btonecajqb(catalog, "catalog");
            zdlpuopuiu.btonecajqb(banners, "banners");
            this.f83604iobyxmoadg = catalog;
            this.f83605zoijcleaow = banners;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f83604iobyxmoadg, iobyxmoadgVar.f83604iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83605zoijcleaow, iobyxmoadgVar.f83605zoijcleaow);
        }

        public int hashCode() {
            return (this.f83604iobyxmoadg.hashCode() * 31) + this.f83605zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f83605zoijcleaow;
        }

        public String toString() {
            return "CatalogFetched(catalog=" + this.f83604iobyxmoadg + ", banners=" + this.f83605zoijcleaow + ")";
        }

        public final CatalogWithSubCatalogs zoijcleaow() {
            return this.f83604iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83606iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f83606iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f83606iobyxmoadg == ((zoijcleaow) obj).f83606iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83606iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83606iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f83606iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
