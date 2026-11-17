package ru.myspar.proloyalty.domain.feature.shops.store;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.domain.models.CameraPosition;
import ru.myspar.proloyalty.core.domain.models.VisibleRegion;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class btonecajqb extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f95712iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(List selectedServices) {
            super(null);
            zdlpuopuiu.btonecajqb(selectedServices, "selectedServices");
            this.f95712iobyxmoadg = selectedServices;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f95712iobyxmoadg, ((btonecajqb) obj).f95712iobyxmoadg);
        }

        public int hashCode() {
            return this.f95712iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f95712iobyxmoadg;
        }

        public String toString() {
            return "SelectedServicesChanged(selectedServices=" + this.f95712iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f95713iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(LocationData userLocation) {
            super(null);
            zdlpuopuiu.btonecajqb(userLocation, "userLocation");
            this.f95713iobyxmoadg = userLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f95713iobyxmoadg, ((draadjrbmk) obj).f95713iobyxmoadg);
        }

        public int hashCode() {
            return this.f95713iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f95713iobyxmoadg;
        }

        public String toString() {
            return "UserLocationChanged(userLocation=" + this.f95713iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f95714iobyxmoadg;

        public dxjokdxxww(boolean z13) {
            super(null);
            this.f95714iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && this.f95714iobyxmoadg == ((dxjokdxxww) obj).f95714iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f95714iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f95714iobyxmoadg;
        }

        public String toString() {
            return "PossibleScrollToTop(shouldScrollToTop=" + this.f95714iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f95715iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f95715iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f95715iobyxmoadg == ((eablkybsjg) obj).f95715iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f95715iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f95715iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f95715iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f95716iobyxmoadg;

        public gtknphoqwx(LocationData locationData) {
            super(null);
            this.f95716iobyxmoadg = locationData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f95716iobyxmoadg, ((gtknphoqwx) obj).f95716iobyxmoadg);
        }

        public int hashCode() {
            LocationData locationData = this.f95716iobyxmoadg;
            if (locationData == null) {
                return 0;
            }
            return locationData.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f95716iobyxmoadg;
        }

        public String toString() {
            return "SortingPointChanged(sortingPoint=" + this.f95716iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2243gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f95717iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2243gxszxtbevo(List shops) {
            super(null);
            zdlpuopuiu.btonecajqb(shops, "shops");
            this.f95717iobyxmoadg = shops;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2243gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f95717iobyxmoadg, ((C2243gxszxtbevo) obj).f95717iobyxmoadg);
        }

        public int hashCode() {
            return this.f95717iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f95717iobyxmoadg;
        }

        public String toString() {
            return "MapShopsFetched(shops=" + this.f95717iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f95718iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(List shops) {
            super(null);
            zdlpuopuiu.btonecajqb(shops, "shops");
            this.f95718iobyxmoadg = shops;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f95718iobyxmoadg, ((iobyxmoadg) obj).f95718iobyxmoadg);
        }

        public int hashCode() {
            return this.f95718iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f95718iobyxmoadg;
        }

        public String toString() {
            return "AllShopsFetched(shops=" + this.f95718iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final State.zoijcleaow f95719iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(State.zoijcleaow pageType) {
            super(null);
            zdlpuopuiu.btonecajqb(pageType, "pageType");
            this.f95719iobyxmoadg = pageType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f95719iobyxmoadg == ((lqeggnwhkg) obj).f95719iobyxmoadg;
        }

        public int hashCode() {
            return this.f95719iobyxmoadg.hashCode();
        }

        public final State.zoijcleaow iobyxmoadg() {
            return this.f95719iobyxmoadg;
        }

        public String toString() {
            return "PageTypeChanged(pageType=" + this.f95719iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f95720iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            super(null);
            this.f95720iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f95720iobyxmoadg == ((nufgyqmvbu) obj).f95720iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f95720iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f95720iobyxmoadg;
        }

        public String toString() {
            return "PositionCenteredChanged(isPositionCentered=" + this.f95720iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CameraPosition f95721iobyxmoadg;

        public ppxfxbqfkf(CameraPosition cameraPosition) {
            super(null);
            this.f95721iobyxmoadg = cameraPosition;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f95721iobyxmoadg, ((ppxfxbqfkf) obj).f95721iobyxmoadg);
        }

        public int hashCode() {
            CameraPosition cameraPosition = this.f95721iobyxmoadg;
            if (cameraPosition == null) {
                return 0;
            }
            return cameraPosition.hashCode();
        }

        public final CameraPosition iobyxmoadg() {
            return this.f95721iobyxmoadg;
        }

        public String toString() {
            return "LastCameraPositionChanged(lastCameraPosition=" + this.f95721iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f95722iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final State.zoijcleaow f95723zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(List shops, State.zoijcleaow pageType) {
            super(null);
            zdlpuopuiu.btonecajqb(shops, "shops");
            zdlpuopuiu.btonecajqb(pageType, "pageType");
            this.f95722iobyxmoadg = shops;
            this.f95723zoijcleaow = pageType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return zdlpuopuiu.eablkybsjg(this.f95722iobyxmoadg, wflxmlrfwpVar.f95722iobyxmoadg) && this.f95723zoijcleaow == wflxmlrfwpVar.f95723zoijcleaow;
        }

        public int hashCode() {
            return (this.f95722iobyxmoadg.hashCode() * 31) + this.f95723zoijcleaow.hashCode();
        }

        public final State.zoijcleaow iobyxmoadg() {
            return this.f95723zoijcleaow;
        }

        public String toString() {
            return "VisibleShopsFetched(shops=" + this.f95722iobyxmoadg + ", pageType=" + this.f95723zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f95722iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VisibleRegion f95724iobyxmoadg;

        public wkgbmnqykc(VisibleRegion visibleRegion) {
            super(null);
            this.f95724iobyxmoadg = visibleRegion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f95724iobyxmoadg, ((wkgbmnqykc) obj).f95724iobyxmoadg);
        }

        public int hashCode() {
            VisibleRegion visibleRegion = this.f95724iobyxmoadg;
            if (visibleRegion == null) {
                return 0;
            }
            return visibleRegion.hashCode();
        }

        public final VisibleRegion iobyxmoadg() {
            return this.f95724iobyxmoadg;
        }

        public String toString() {
            return "LastFocusRegionChanged(lastFocusRegion=" + this.f95724iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f95725iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f95726ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Double f95727wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f95728zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(List shops, List services, LocationData locationData, Double d13) {
            super(null);
            zdlpuopuiu.btonecajqb(shops, "shops");
            zdlpuopuiu.btonecajqb(services, "services");
            this.f95725iobyxmoadg = shops;
            this.f95728zoijcleaow = services;
            this.f95726ppxfxbqfkf = locationData;
            this.f95727wkgbmnqykc = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f95725iobyxmoadg, zoijcleaowVar.f95725iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f95728zoijcleaow, zoijcleaowVar.f95728zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f95726ppxfxbqfkf, zoijcleaowVar.f95726ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f95727wkgbmnqykc, zoijcleaowVar.f95727wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((this.f95725iobyxmoadg.hashCode() * 31) + this.f95728zoijcleaow.hashCode()) * 31;
            LocationData locationData = this.f95726ppxfxbqfkf;
            int iHashCode2 = (iHashCode + (locationData == null ? 0 : locationData.hashCode())) * 31;
            Double d13 = this.f95727wkgbmnqykc;
            return iHashCode2 + (d13 != null ? d13.hashCode() : 0);
        }

        public final LocationData iobyxmoadg() {
            return this.f95726ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f95728zoijcleaow;
        }

        public String toString() {
            return "InitDataFetched(shops=" + this.f95725iobyxmoadg + ", services=" + this.f95728zoijcleaow + ", centralPosition=" + this.f95726ppxfxbqfkf + ", maxDistance=" + this.f95727wkgbmnqykc + ")";
        }

        public final List wkgbmnqykc() {
            return this.f95725iobyxmoadg;
        }

        public final Double zoijcleaow() {
            return this.f95727wkgbmnqykc;
        }
    }

    public /* synthetic */ gxszxtbevo(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
