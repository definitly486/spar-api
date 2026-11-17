package mn;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
public interface wkgbmnqykc {

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final rm.zoijcleaow f67626iobyxmoadg;

        public btonecajqb(rm.zoijcleaow type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f67626iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && this.f67626iobyxmoadg == ((btonecajqb) obj).f67626iobyxmoadg;
        }

        public int hashCode() {
            return this.f67626iobyxmoadg.hashCode();
        }

        public final rm.zoijcleaow iobyxmoadg() {
            return this.f67626iobyxmoadg;
        }

        public String toString() {
            return "OnChangeDeliveryTypeToggle(type=" + this.f67626iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f67627iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f67628ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f67629zoijcleaow;

        public draadjrbmk(String shopId, String shopAddress, LocationData shopLocation) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(shopAddress, "shopAddress");
            zdlpuopuiu.btonecajqb(shopLocation, "shopLocation");
            this.f67627iobyxmoadg = shopId;
            this.f67629zoijcleaow = shopAddress;
            this.f67628ppxfxbqfkf = shopLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return zdlpuopuiu.eablkybsjg(this.f67627iobyxmoadg, draadjrbmkVar.f67627iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67629zoijcleaow, draadjrbmkVar.f67629zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f67628ppxfxbqfkf, draadjrbmkVar.f67628ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f67627iobyxmoadg.hashCode() * 31) + this.f67629zoijcleaow.hashCode()) * 31) + this.f67628ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f67629zoijcleaow;
        }

        public final LocationData ppxfxbqfkf() {
            return this.f67628ppxfxbqfkf;
        }

        public String toString() {
            return "OnMapShopMarkerClicked(shopId=" + this.f67627iobyxmoadg + ", shopAddress=" + this.f67629zoijcleaow + ", shopLocation=" + this.f67628ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f67627iobyxmoadg;
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f67630iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -1019490220;
        }

        public String toString() {
            return "OnBtnConfirmClicked";
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f67631iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -483956380;
        }

        public String toString() {
            return "MapZoomInClick";
        }
    }

    public static final class gtknphoqwx implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f67632iobyxmoadg;

        public gtknphoqwx(LocationData locationData) {
            zdlpuopuiu.btonecajqb(locationData, "locationData");
            this.f67632iobyxmoadg = locationData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f67632iobyxmoadg, ((gtknphoqwx) obj).f67632iobyxmoadg);
        }

        public int hashCode() {
            return this.f67632iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f67632iobyxmoadg;
        }

        public String toString() {
            return "OnFinishedMoveMapCameraByUser(locationData=" + this.f67632iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f67633iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -1263168263;
        }

        public String toString() {
            return "MapZoomOutClick";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f67634iobyxmoadg;

        public iobyxmoadg(LocationData location) {
            zdlpuopuiu.btonecajqb(location, "location");
            this.f67634iobyxmoadg = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67634iobyxmoadg, ((iobyxmoadg) obj).f67634iobyxmoadg);
        }

        public int hashCode() {
            return this.f67634iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f67634iobyxmoadg;
        }

        public String toString() {
            return "HandleAddressSearchScreenResult(location=" + this.f67634iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f67635iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 2034729544;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f67636iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -307497419;
        }

        public String toString() {
            return "OnAddressTextClicked";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f67637iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1230760222;
        }

        public String toString() {
            return "MapShowMyLocationClick";
        }
    }

    public static final class wflxmlrfwp implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f67638iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -154065762;
        }

        public String toString() {
            return "OnStartedMoveMapCamera";
        }
    }

    /* JADX INFO: renamed from: mn.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1401wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f67639iobyxmoadg;

        public C1401wkgbmnqykc(float f13) {
            this.f67639iobyxmoadg = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1401wkgbmnqykc) && Float.compare(this.f67639iobyxmoadg, ((C1401wkgbmnqykc) obj).f67639iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f67639iobyxmoadg);
        }

        public final float iobyxmoadg() {
            return this.f67639iobyxmoadg;
        }

        public String toString() {
            return "MapZoomChange(currentZoom=" + this.f67639iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f67640iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f67641ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f67642zoijcleaow;

        public zoijcleaow(String shopId, String address, LocationData location) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(address, "address");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f67640iobyxmoadg = shopId;
            this.f67642zoijcleaow = address;
            this.f67641ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f67640iobyxmoadg, zoijcleaowVar.f67640iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67642zoijcleaow, zoijcleaowVar.f67642zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f67641ppxfxbqfkf, zoijcleaowVar.f67641ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f67640iobyxmoadg.hashCode() * 31) + this.f67642zoijcleaow.hashCode()) * 31) + this.f67641ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f67642zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f67640iobyxmoadg;
        }

        public String toString() {
            return "HandleShopSearchResult(shopId=" + this.f67640iobyxmoadg + ", address=" + this.f67642zoijcleaow + ", location=" + this.f67641ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f67641ppxfxbqfkf;
        }
    }
}
