package kp0;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.delivery.CatalogPagerAddressData;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f60224iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f60224iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f60224iobyxmoadg == ((eablkybsjg) obj).f60224iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f60224iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f60224iobyxmoadg;
        }

        public String toString() {
            return "RestaurantFeatureEnabled(enable=" + this.f60224iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: kp0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1201gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f60225iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1201gxszxtbevo(List restaurants) {
            super(null);
            zdlpuopuiu.btonecajqb(restaurants, "restaurants");
            this.f60225iobyxmoadg = restaurants;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1201gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f60225iobyxmoadg, ((C1201gxszxtbevo) obj).f60225iobyxmoadg);
        }

        public int hashCode() {
            return this.f60225iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f60225iobyxmoadg;
        }

        public String toString() {
            return "RestaurantsLoaded(restaurants=" + this.f60225iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CatalogPagerAddressData f60226iobyxmoadg;

        public iobyxmoadg(CatalogPagerAddressData catalogPagerAddressData) {
            super(null);
            this.f60226iobyxmoadg = catalogPagerAddressData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f60226iobyxmoadg, ((iobyxmoadg) obj).f60226iobyxmoadg);
        }

        public int hashCode() {
            CatalogPagerAddressData catalogPagerAddressData = this.f60226iobyxmoadg;
            if (catalogPagerAddressData == null) {
                return 0;
            }
            return catalogPagerAddressData.hashCode();
        }

        public final CatalogPagerAddressData iobyxmoadg() {
            return this.f60226iobyxmoadg;
        }

        public String toString() {
            return "AddressDataChanged(addressData=" + this.f60226iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final jp0.iobyxmoadg f60227iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(jp0.iobyxmoadg tab) {
            super(null);
            zdlpuopuiu.btonecajqb(tab, "tab");
            this.f60227iobyxmoadg = tab;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f60227iobyxmoadg == ((lqeggnwhkg) obj).f60227iobyxmoadg;
        }

        public int hashCode() {
            return this.f60227iobyxmoadg.hashCode();
        }

        public final jp0.iobyxmoadg iobyxmoadg() {
            return this.f60227iobyxmoadg;
        }

        public String toString() {
            return "TabPositionChanged(tab=" + this.f60227iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f60228iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(List sections) {
            super(null);
            zdlpuopuiu.btonecajqb(sections, "sections");
            this.f60228iobyxmoadg = sections;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f60228iobyxmoadg, ((ppxfxbqfkf) obj).f60228iobyxmoadg);
        }

        public int hashCode() {
            return this.f60228iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f60228iobyxmoadg;
        }

        public String toString() {
            return "CatalogSectionsFetched(sections=" + this.f60228iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f60229iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f60229iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f60229iobyxmoadg == ((wkgbmnqykc) obj).f60229iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f60229iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f60229iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f60229iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f60230iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f60230iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f60230iobyxmoadg == ((zoijcleaow) obj).f60230iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f60230iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f60230iobyxmoadg;
        }

        public String toString() {
            return "AdultDialogWasShown(adultDialogWasShown=" + this.f60230iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
