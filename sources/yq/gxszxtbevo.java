package yq;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.delivery.CatalogPagerAddressData;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f126153iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f126153iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f126153iobyxmoadg == ((eablkybsjg) obj).f126153iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f126153iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f126153iobyxmoadg;
        }

        public String toString() {
            return "RestaurantFeatureEnabled(enable=" + this.f126153iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: yq.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C3210gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f126154iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3210gxszxtbevo(List restaurants) {
            super(null);
            zdlpuopuiu.btonecajqb(restaurants, "restaurants");
            this.f126154iobyxmoadg = restaurants;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3210gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f126154iobyxmoadg, ((C3210gxszxtbevo) obj).f126154iobyxmoadg);
        }

        public int hashCode() {
            return this.f126154iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f126154iobyxmoadg;
        }

        public String toString() {
            return "RestaurantsLoaded(restaurants=" + this.f126154iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CatalogPagerAddressData f126155iobyxmoadg;

        public iobyxmoadg(CatalogPagerAddressData catalogPagerAddressData) {
            super(null);
            this.f126155iobyxmoadg = catalogPagerAddressData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f126155iobyxmoadg, ((iobyxmoadg) obj).f126155iobyxmoadg);
        }

        public int hashCode() {
            CatalogPagerAddressData catalogPagerAddressData = this.f126155iobyxmoadg;
            if (catalogPagerAddressData == null) {
                return 0;
            }
            return catalogPagerAddressData.hashCode();
        }

        public final CatalogPagerAddressData iobyxmoadg() {
            return this.f126155iobyxmoadg;
        }

        public String toString() {
            return "AddressDataChanged(addressData=" + this.f126155iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final xq.iobyxmoadg f126156iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(xq.iobyxmoadg tab) {
            super(null);
            zdlpuopuiu.btonecajqb(tab, "tab");
            this.f126156iobyxmoadg = tab;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f126156iobyxmoadg == ((lqeggnwhkg) obj).f126156iobyxmoadg;
        }

        public int hashCode() {
            return this.f126156iobyxmoadg.hashCode();
        }

        public final xq.iobyxmoadg iobyxmoadg() {
            return this.f126156iobyxmoadg;
        }

        public String toString() {
            return "TabPositionChanged(tab=" + this.f126156iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f126157iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(List sections) {
            super(null);
            zdlpuopuiu.btonecajqb(sections, "sections");
            this.f126157iobyxmoadg = sections;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f126157iobyxmoadg, ((ppxfxbqfkf) obj).f126157iobyxmoadg);
        }

        public int hashCode() {
            return this.f126157iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f126157iobyxmoadg;
        }

        public String toString() {
            return "CatalogSectionsFetched(sections=" + this.f126157iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f126158iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f126158iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f126158iobyxmoadg == ((wkgbmnqykc) obj).f126158iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f126158iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f126158iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f126158iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f126159iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f126159iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f126159iobyxmoadg == ((zoijcleaow) obj).f126159iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f126159iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f126159iobyxmoadg;
        }

        public String toString() {
            return "AdultDialogWasShown(adultDialogWasShown=" + this.f126159iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
