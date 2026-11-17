package mn;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.api.model.AddressMapScreenFlow;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
public interface gxszxtbevo {

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f67539iobyxmoadg;

        public eablkybsjg(float f13) {
            this.f67539iobyxmoadg = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && Float.compare(this.f67539iobyxmoadg, ((eablkybsjg) obj).f67539iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f67539iobyxmoadg);
        }

        public final float iobyxmoadg() {
            return this.f67539iobyxmoadg;
        }

        public String toString() {
            return "ChangeMapCameraZoom(zoomValue=" + this.f67539iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: mn.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1399gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f67540iobyxmoadg;

        public C1399gxszxtbevo(List shopList) {
            zdlpuopuiu.btonecajqb(shopList, "shopList");
            this.f67540iobyxmoadg = shopList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1399gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f67540iobyxmoadg, ((C1399gxszxtbevo) obj).f67540iobyxmoadg);
        }

        public int hashCode() {
            return this.f67540iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f67540iobyxmoadg;
        }

        public String toString() {
            return "ChangePickUpShopList(shopList=" + this.f67540iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f67541iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f67541iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f67541iobyxmoadg == ((iobyxmoadg) obj).f67541iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f67541iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f67541iobyxmoadg;
        }

        public String toString() {
            return "ChangeAddressShimmer(show=" + this.f67541iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f67542iobyxmoadg;

        public lqeggnwhkg(LocationData locationData) {
            zdlpuopuiu.btonecajqb(locationData, "locationData");
            this.f67542iobyxmoadg = locationData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f67542iobyxmoadg, ((lqeggnwhkg) obj).f67542iobyxmoadg);
        }

        public int hashCode() {
            return this.f67542iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f67542iobyxmoadg;
        }

        public String toString() {
            return "ChangeUserLocation(locationData=" + this.f67542iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f67543iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f67543iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f67543iobyxmoadg == ((ppxfxbqfkf) obj).f67543iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f67543iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f67543iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoading(isLoading=" + this.f67543iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f67544iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Float f67545zoijcleaow;

        public wkgbmnqykc(LocationData locationData, Float f13) {
            zdlpuopuiu.btonecajqb(locationData, "locationData");
            this.f67544iobyxmoadg = locationData;
            this.f67545zoijcleaow = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f67544iobyxmoadg, wkgbmnqykcVar.f67544iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67545zoijcleaow, wkgbmnqykcVar.f67545zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f67544iobyxmoadg.hashCode() * 31;
            Float f13 = this.f67545zoijcleaow;
            return iHashCode + (f13 == null ? 0 : f13.hashCode());
        }

        public final LocationData iobyxmoadg() {
            return this.f67544iobyxmoadg;
        }

        public String toString() {
            return "ChangeMapCameraPosition(locationData=" + this.f67544iobyxmoadg + ", zoomValue=" + this.f67545zoijcleaow + ")";
        }

        public final Float zoijcleaow() {
            return this.f67545zoijcleaow;
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AddressMapScreenFlow f67546iobyxmoadg;

        public zoijcleaow(AddressMapScreenFlow flow) {
            zdlpuopuiu.btonecajqb(flow, "flow");
            this.f67546iobyxmoadg = flow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f67546iobyxmoadg, ((zoijcleaow) obj).f67546iobyxmoadg);
        }

        public int hashCode() {
            return this.f67546iobyxmoadg.hashCode();
        }

        public final AddressMapScreenFlow iobyxmoadg() {
            return this.f67546iobyxmoadg;
        }

        public String toString() {
            return "ChangeCurrentFlow(flow=" + this.f67546iobyxmoadg + ")";
        }
    }
}
