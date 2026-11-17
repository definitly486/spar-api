package ru.myspar.address.impl.map.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
public interface zoijcleaow {

    public static final class btonecajqb implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83990iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f83991ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83992zoijcleaow;

        public btonecajqb(String shopId, String shopAddress, LocationData shopLocation) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(shopAddress, "shopAddress");
            zdlpuopuiu.btonecajqb(shopLocation, "shopLocation");
            this.f83990iobyxmoadg = shopId;
            this.f83992zoijcleaow = shopAddress;
            this.f83991ppxfxbqfkf = shopLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f83990iobyxmoadg, btonecajqbVar.f83990iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83992zoijcleaow, btonecajqbVar.f83992zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f83991ppxfxbqfkf, btonecajqbVar.f83991ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f83990iobyxmoadg.hashCode() * 31) + this.f83992zoijcleaow.hashCode()) * 31) + this.f83991ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83992zoijcleaow;
        }

        public final LocationData ppxfxbqfkf() {
            return this.f83991ppxfxbqfkf;
        }

        public String toString() {
            return "OnMapShopMarkerClicked(shopId=" + this.f83990iobyxmoadg + ", shopAddress=" + this.f83992zoijcleaow + ", shopLocation=" + this.f83991ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f83990iobyxmoadg;
        }
    }

    public static final class dxjokdxxww implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f83993iobyxmoadg;

        public dxjokdxxww(LocationData locationData) {
            zdlpuopuiu.btonecajqb(locationData, "locationData");
            this.f83993iobyxmoadg = locationData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f83993iobyxmoadg, ((dxjokdxxww) obj).f83993iobyxmoadg);
        }

        public int hashCode() {
            return this.f83993iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f83993iobyxmoadg;
        }

        public String toString() {
            return "OnFinishedMoveMapCameraByUser(locationData=" + this.f83993iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f83994iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 1042222998;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class gtknphoqwx implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f83995iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return 789244012;
        }

        public String toString() {
            return "OnStartedMoveMapCamera";
        }
    }

    public static final class gxszxtbevo implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f83996iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -914336381;
        }

        public String toString() {
            return "OnAddressTextClicked";
        }
    }

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f83997iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -2120897300;
        }

        public String toString() {
            return "MapShowMyLocationClick";
        }
    }

    public static final class lqeggnwhkg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f83998iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -623423674;
        }

        public String toString() {
            return "OnBtnConfirmClicked";
        }
    }

    public static final class nufgyqmvbu implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final rm.zoijcleaow f83999iobyxmoadg;

        public nufgyqmvbu(rm.zoijcleaow type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f83999iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f83999iobyxmoadg == ((nufgyqmvbu) obj).f83999iobyxmoadg;
        }

        public int hashCode() {
            return this.f83999iobyxmoadg.hashCode();
        }

        public final rm.zoijcleaow iobyxmoadg() {
            return this.f83999iobyxmoadg;
        }

        public String toString() {
            return "OnChangeDeliveryTypeToggle(type=" + this.f83999iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f84000iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -800007374;
        }

        public String toString() {
            return "MapZoomInClick";
        }
    }

    public static final class wkgbmnqykc implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f84001iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1824152811;
        }

        public String toString() {
            return "MapZoomOutClick";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.address.impl.map.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1897zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f84002iobyxmoadg;

        public C1897zoijcleaow(float f13) {
            this.f84002iobyxmoadg = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1897zoijcleaow) && Float.compare(this.f84002iobyxmoadg, ((C1897zoijcleaow) obj).f84002iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f84002iobyxmoadg);
        }

        public final float iobyxmoadg() {
            return this.f84002iobyxmoadg;
        }

        public String toString() {
            return "MapZoomChange(currentZoom=" + this.f84002iobyxmoadg + ")";
        }
    }
}
