package ru.myspar.proloyalty.address.impl.map.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static final class btonecajqb implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92015iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f92016ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f92017zoijcleaow;

        public btonecajqb(String shopId, String shopAddress, LocationData shopLocation) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(shopAddress, "shopAddress");
            zdlpuopuiu.btonecajqb(shopLocation, "shopLocation");
            this.f92015iobyxmoadg = shopId;
            this.f92017zoijcleaow = shopAddress;
            this.f92016ppxfxbqfkf = shopLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f92015iobyxmoadg, btonecajqbVar.f92015iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92017zoijcleaow, btonecajqbVar.f92017zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f92016ppxfxbqfkf, btonecajqbVar.f92016ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f92015iobyxmoadg.hashCode() * 31) + this.f92017zoijcleaow.hashCode()) * 31) + this.f92016ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92017zoijcleaow;
        }

        public final LocationData ppxfxbqfkf() {
            return this.f92016ppxfxbqfkf;
        }

        public String toString() {
            return "OnMapShopMarkerClicked(shopId=" + this.f92015iobyxmoadg + ", shopAddress=" + this.f92017zoijcleaow + ", shopLocation=" + this.f92016ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f92015iobyxmoadg;
        }
    }

    public static final class dxjokdxxww implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f92018iobyxmoadg;

        public dxjokdxxww(LocationData locationData) {
            zdlpuopuiu.btonecajqb(locationData, "locationData");
            this.f92018iobyxmoadg = locationData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f92018iobyxmoadg, ((dxjokdxxww) obj).f92018iobyxmoadg);
        }

        public int hashCode() {
            return this.f92018iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f92018iobyxmoadg;
        }

        public String toString() {
            return "OnFinishedMoveMapCameraByUser(locationData=" + this.f92018iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f92019iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 1943616531;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class gtknphoqwx implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f92020iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return 111762601;
        }

        public String toString() {
            return "OnStartedMoveMapCamera";
        }
    }

    public static final class gxszxtbevo implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f92021iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -843533056;
        }

        public String toString() {
            return "OnAddressTextClicked";
        }
    }

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f92022iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1496588585;
        }

        public String toString() {
            return "MapShowMyLocationClick";
        }
    }

    public static final class lqeggnwhkg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f92023iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 210144297;
        }

        public String toString() {
            return "OnBtnConfirmClicked";
        }
    }

    public static final class nufgyqmvbu implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final cl0.zoijcleaow f92024iobyxmoadg;

        public nufgyqmvbu(cl0.zoijcleaow type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f92024iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f92024iobyxmoadg == ((nufgyqmvbu) obj).f92024iobyxmoadg;
        }

        public int hashCode() {
            return this.f92024iobyxmoadg.hashCode();
        }

        public final cl0.zoijcleaow iobyxmoadg() {
            return this.f92024iobyxmoadg;
        }

        public String toString() {
            return "OnChangeDeliveryTypeToggle(type=" + this.f92024iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f92025iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -2144215953;
        }

        public String toString() {
            return "MapZoomInClick";
        }
    }

    public static final class wkgbmnqykc implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f92026iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1191607474;
        }

        public String toString() {
            return "MapZoomOutClick";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2141zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f92027iobyxmoadg;

        public C2141zoijcleaow(float f13) {
            this.f92027iobyxmoadg = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2141zoijcleaow) && Float.compare(this.f92027iobyxmoadg, ((C2141zoijcleaow) obj).f92027iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f92027iobyxmoadg);
        }

        public final float iobyxmoadg() {
            return this.f92027iobyxmoadg;
        }

        public String toString() {
            return "MapZoomChange(currentZoom=" + this.f92027iobyxmoadg + ")";
        }
    }
}
