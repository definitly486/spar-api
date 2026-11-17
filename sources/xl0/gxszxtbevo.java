package xl0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.address.api.model.AddressMapScreenFlow;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f122763iobyxmoadg;

        public eablkybsjg(float f13) {
            this.f122763iobyxmoadg = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && Float.compare(this.f122763iobyxmoadg, ((eablkybsjg) obj).f122763iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f122763iobyxmoadg);
        }

        public final float iobyxmoadg() {
            return this.f122763iobyxmoadg;
        }

        public String toString() {
            return "ChangeMapCameraZoom(zoomValue=" + this.f122763iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: xl0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C3089gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f122764iobyxmoadg;

        public C3089gxszxtbevo(List shopList) {
            zdlpuopuiu.btonecajqb(shopList, "shopList");
            this.f122764iobyxmoadg = shopList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3089gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f122764iobyxmoadg, ((C3089gxszxtbevo) obj).f122764iobyxmoadg);
        }

        public int hashCode() {
            return this.f122764iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f122764iobyxmoadg;
        }

        public String toString() {
            return "ChangePickUpShopList(shopList=" + this.f122764iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f122765iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f122765iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f122765iobyxmoadg == ((iobyxmoadg) obj).f122765iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f122765iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f122765iobyxmoadg;
        }

        public String toString() {
            return "ChangeAddressShimmer(show=" + this.f122765iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f122766iobyxmoadg;

        public lqeggnwhkg(LocationData locationData) {
            zdlpuopuiu.btonecajqb(locationData, "locationData");
            this.f122766iobyxmoadg = locationData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f122766iobyxmoadg, ((lqeggnwhkg) obj).f122766iobyxmoadg);
        }

        public int hashCode() {
            return this.f122766iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f122766iobyxmoadg;
        }

        public String toString() {
            return "ChangeUserLocation(locationData=" + this.f122766iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f122767iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f122767iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f122767iobyxmoadg == ((ppxfxbqfkf) obj).f122767iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f122767iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f122767iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoading(isLoading=" + this.f122767iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f122768iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Float f122769zoijcleaow;

        public wkgbmnqykc(LocationData locationData, Float f13) {
            zdlpuopuiu.btonecajqb(locationData, "locationData");
            this.f122768iobyxmoadg = locationData;
            this.f122769zoijcleaow = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f122768iobyxmoadg, wkgbmnqykcVar.f122768iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f122769zoijcleaow, wkgbmnqykcVar.f122769zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f122768iobyxmoadg.hashCode() * 31;
            Float f13 = this.f122769zoijcleaow;
            return iHashCode + (f13 == null ? 0 : f13.hashCode());
        }

        public final LocationData iobyxmoadg() {
            return this.f122768iobyxmoadg;
        }

        public String toString() {
            return "ChangeMapCameraPosition(locationData=" + this.f122768iobyxmoadg + ", zoomValue=" + this.f122769zoijcleaow + ")";
        }

        public final Float zoijcleaow() {
            return this.f122769zoijcleaow;
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AddressMapScreenFlow f122770iobyxmoadg;

        public zoijcleaow(AddressMapScreenFlow flow) {
            zdlpuopuiu.btonecajqb(flow, "flow");
            this.f122770iobyxmoadg = flow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122770iobyxmoadg, ((zoijcleaow) obj).f122770iobyxmoadg);
        }

        public int hashCode() {
            return this.f122770iobyxmoadg.hashCode();
        }

        public final AddressMapScreenFlow iobyxmoadg() {
            return this.f122770iobyxmoadg;
        }

        public String toString() {
            return "ChangeCurrentFlow(flow=" + this.f122770iobyxmoadg + ")";
        }
    }
}
