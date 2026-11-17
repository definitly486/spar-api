package cs;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.catalog.CatalogWithSubCatalogs;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CatalogWithSubCatalogs f25581iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f25582zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(CatalogWithSubCatalogs catalog, List banners) {
            super(null);
            zdlpuopuiu.btonecajqb(catalog, "catalog");
            zdlpuopuiu.btonecajqb(banners, "banners");
            this.f25581iobyxmoadg = catalog;
            this.f25582zoijcleaow = banners;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f25581iobyxmoadg, iobyxmoadgVar.f25581iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f25582zoijcleaow, iobyxmoadgVar.f25582zoijcleaow);
        }

        public int hashCode() {
            return (this.f25581iobyxmoadg.hashCode() * 31) + this.f25582zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f25582zoijcleaow;
        }

        public String toString() {
            return "CatalogFetched(catalog=" + this.f25581iobyxmoadg + ", banners=" + this.f25582zoijcleaow + ")";
        }

        public final CatalogWithSubCatalogs zoijcleaow() {
            return this.f25581iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f25583iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f25583iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f25583iobyxmoadg == ((zoijcleaow) obj).f25583iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f25583iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f25583iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f25583iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
