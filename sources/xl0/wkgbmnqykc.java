package xl0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final cl0.zoijcleaow f122850iobyxmoadg;

        public btonecajqb(cl0.zoijcleaow type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f122850iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && this.f122850iobyxmoadg == ((btonecajqb) obj).f122850iobyxmoadg;
        }

        public int hashCode() {
            return this.f122850iobyxmoadg.hashCode();
        }

        public final cl0.zoijcleaow iobyxmoadg() {
            return this.f122850iobyxmoadg;
        }

        public String toString() {
            return "OnChangeDeliveryTypeToggle(type=" + this.f122850iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f122851iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f122852ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f122853zoijcleaow;

        public draadjrbmk(String shopId, String shopAddress, LocationData shopLocation) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(shopAddress, "shopAddress");
            zdlpuopuiu.btonecajqb(shopLocation, "shopLocation");
            this.f122851iobyxmoadg = shopId;
            this.f122853zoijcleaow = shopAddress;
            this.f122852ppxfxbqfkf = shopLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return zdlpuopuiu.eablkybsjg(this.f122851iobyxmoadg, draadjrbmkVar.f122851iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f122853zoijcleaow, draadjrbmkVar.f122853zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122852ppxfxbqfkf, draadjrbmkVar.f122852ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f122851iobyxmoadg.hashCode() * 31) + this.f122853zoijcleaow.hashCode()) * 31) + this.f122852ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f122853zoijcleaow;
        }

        public final LocationData ppxfxbqfkf() {
            return this.f122852ppxfxbqfkf;
        }

        public String toString() {
            return "OnMapShopMarkerClicked(shopId=" + this.f122851iobyxmoadg + ", shopAddress=" + this.f122853zoijcleaow + ", shopLocation=" + this.f122852ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f122851iobyxmoadg;
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f122854iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return 259716791;
        }

        public String toString() {
            return "OnBtnConfirmClicked";
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f122855iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 495751457;
        }

        public String toString() {
            return "MapZoomInClick";
        }
    }

    public static final class gtknphoqwx implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f122856iobyxmoadg;

        public gtknphoqwx(LocationData locationData) {
            zdlpuopuiu.btonecajqb(locationData, "locationData");
            this.f122856iobyxmoadg = locationData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f122856iobyxmoadg, ((gtknphoqwx) obj).f122856iobyxmoadg);
        }

        public int hashCode() {
            return this.f122856iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f122856iobyxmoadg;
        }

        public String toString() {
            return "OnFinishedMoveMapCameraByUser(locationData=" + this.f122856iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f122857iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -956996388;
        }

        public String toString() {
            return "MapZoomOutClick";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f122858iobyxmoadg;

        public iobyxmoadg(LocationData location) {
            zdlpuopuiu.btonecajqb(location, "location");
            this.f122858iobyxmoadg = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f122858iobyxmoadg, ((iobyxmoadg) obj).f122858iobyxmoadg);
        }

        public int hashCode() {
            return this.f122858iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f122858iobyxmoadg;
        }

        public String toString() {
            return "HandleAddressSearchScreenResult(location=" + this.f122858iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f122859iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 1633514821;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f122860iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 693214258;
        }

        public String toString() {
            return "OnAddressTextClicked";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f122861iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 842007515;
        }

        public String toString() {
            return "MapShowMyLocationClick";
        }
    }

    public static final class wflxmlrfwp implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f122862iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -542818469;
        }

        public String toString() {
            return "OnStartedMoveMapCamera";
        }
    }

    /* JADX INFO: renamed from: xl0.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C3091wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f122863iobyxmoadg;

        public C3091wkgbmnqykc(float f13) {
            this.f122863iobyxmoadg = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3091wkgbmnqykc) && Float.compare(this.f122863iobyxmoadg, ((C3091wkgbmnqykc) obj).f122863iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f122863iobyxmoadg);
        }

        public final float iobyxmoadg() {
            return this.f122863iobyxmoadg;
        }

        public String toString() {
            return "MapZoomChange(currentZoom=" + this.f122863iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f122864iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f122865ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f122866zoijcleaow;

        public zoijcleaow(String shopId, String address, LocationData location) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(address, "address");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f122864iobyxmoadg = shopId;
            this.f122866zoijcleaow = address;
            this.f122865ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f122864iobyxmoadg, zoijcleaowVar.f122864iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f122866zoijcleaow, zoijcleaowVar.f122866zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122865ppxfxbqfkf, zoijcleaowVar.f122865ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f122864iobyxmoadg.hashCode() * 31) + this.f122866zoijcleaow.hashCode()) * 31) + this.f122865ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f122866zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f122864iobyxmoadg;
        }

        public String toString() {
            return "HandleShopSearchResult(shopId=" + this.f122864iobyxmoadg + ", address=" + this.f122866zoijcleaow + ", location=" + this.f122865ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f122865ppxfxbqfkf;
        }
    }
}
