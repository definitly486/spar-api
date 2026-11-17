package ru.myspar.domain.feature.shops.store;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.CameraPosition;
import ru.myspar.core.domain.models.VisibleRegion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class btonecajqb extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f87935iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(List selectedServices) {
            super(null);
            zdlpuopuiu.btonecajqb(selectedServices, "selectedServices");
            this.f87935iobyxmoadg = selectedServices;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f87935iobyxmoadg, ((btonecajqb) obj).f87935iobyxmoadg);
        }

        public int hashCode() {
            return this.f87935iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f87935iobyxmoadg;
        }

        public String toString() {
            return "SelectedServicesChanged(selectedServices=" + this.f87935iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f87936iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(LocationData userLocation) {
            super(null);
            zdlpuopuiu.btonecajqb(userLocation, "userLocation");
            this.f87936iobyxmoadg = userLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f87936iobyxmoadg, ((draadjrbmk) obj).f87936iobyxmoadg);
        }

        public int hashCode() {
            return this.f87936iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f87936iobyxmoadg;
        }

        public String toString() {
            return "UserLocationChanged(userLocation=" + this.f87936iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f87937iobyxmoadg;

        public dxjokdxxww(boolean z13) {
            super(null);
            this.f87937iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && this.f87937iobyxmoadg == ((dxjokdxxww) obj).f87937iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f87937iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f87937iobyxmoadg;
        }

        public String toString() {
            return "PossibleScrollToTop(shouldScrollToTop=" + this.f87937iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f87938iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f87938iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f87938iobyxmoadg == ((eablkybsjg) obj).f87938iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f87938iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f87938iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f87938iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f87939iobyxmoadg;

        public gtknphoqwx(LocationData locationData) {
            super(null);
            this.f87939iobyxmoadg = locationData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f87939iobyxmoadg, ((gtknphoqwx) obj).f87939iobyxmoadg);
        }

        public int hashCode() {
            LocationData locationData = this.f87939iobyxmoadg;
            if (locationData == null) {
                return 0;
            }
            return locationData.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f87939iobyxmoadg;
        }

        public String toString() {
            return "SortingPointChanged(sortingPoint=" + this.f87939iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2006gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f87940iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2006gxszxtbevo(List shops) {
            super(null);
            zdlpuopuiu.btonecajqb(shops, "shops");
            this.f87940iobyxmoadg = shops;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2006gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f87940iobyxmoadg, ((C2006gxszxtbevo) obj).f87940iobyxmoadg);
        }

        public int hashCode() {
            return this.f87940iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f87940iobyxmoadg;
        }

        public String toString() {
            return "MapShopsFetched(shops=" + this.f87940iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f87941iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(List shops) {
            super(null);
            zdlpuopuiu.btonecajqb(shops, "shops");
            this.f87941iobyxmoadg = shops;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f87941iobyxmoadg, ((iobyxmoadg) obj).f87941iobyxmoadg);
        }

        public int hashCode() {
            return this.f87941iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f87941iobyxmoadg;
        }

        public String toString() {
            return "AllShopsFetched(shops=" + this.f87941iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final State.zoijcleaow f87942iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(State.zoijcleaow pageType) {
            super(null);
            zdlpuopuiu.btonecajqb(pageType, "pageType");
            this.f87942iobyxmoadg = pageType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f87942iobyxmoadg == ((lqeggnwhkg) obj).f87942iobyxmoadg;
        }

        public int hashCode() {
            return this.f87942iobyxmoadg.hashCode();
        }

        public final State.zoijcleaow iobyxmoadg() {
            return this.f87942iobyxmoadg;
        }

        public String toString() {
            return "PageTypeChanged(pageType=" + this.f87942iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f87943iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            super(null);
            this.f87943iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f87943iobyxmoadg == ((nufgyqmvbu) obj).f87943iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f87943iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f87943iobyxmoadg;
        }

        public String toString() {
            return "PositionCenteredChanged(isPositionCentered=" + this.f87943iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CameraPosition f87944iobyxmoadg;

        public ppxfxbqfkf(CameraPosition cameraPosition) {
            super(null);
            this.f87944iobyxmoadg = cameraPosition;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f87944iobyxmoadg, ((ppxfxbqfkf) obj).f87944iobyxmoadg);
        }

        public int hashCode() {
            CameraPosition cameraPosition = this.f87944iobyxmoadg;
            if (cameraPosition == null) {
                return 0;
            }
            return cameraPosition.hashCode();
        }

        public final CameraPosition iobyxmoadg() {
            return this.f87944iobyxmoadg;
        }

        public String toString() {
            return "LastCameraPositionChanged(lastCameraPosition=" + this.f87944iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f87945iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final State.zoijcleaow f87946zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(List shops, State.zoijcleaow pageType) {
            super(null);
            zdlpuopuiu.btonecajqb(shops, "shops");
            zdlpuopuiu.btonecajqb(pageType, "pageType");
            this.f87945iobyxmoadg = shops;
            this.f87946zoijcleaow = pageType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return zdlpuopuiu.eablkybsjg(this.f87945iobyxmoadg, wflxmlrfwpVar.f87945iobyxmoadg) && this.f87946zoijcleaow == wflxmlrfwpVar.f87946zoijcleaow;
        }

        public int hashCode() {
            return (this.f87945iobyxmoadg.hashCode() * 31) + this.f87946zoijcleaow.hashCode();
        }

        public final State.zoijcleaow iobyxmoadg() {
            return this.f87946zoijcleaow;
        }

        public String toString() {
            return "VisibleShopsFetched(shops=" + this.f87945iobyxmoadg + ", pageType=" + this.f87946zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f87945iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VisibleRegion f87947iobyxmoadg;

        public wkgbmnqykc(VisibleRegion visibleRegion) {
            super(null);
            this.f87947iobyxmoadg = visibleRegion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f87947iobyxmoadg, ((wkgbmnqykc) obj).f87947iobyxmoadg);
        }

        public int hashCode() {
            VisibleRegion visibleRegion = this.f87947iobyxmoadg;
            if (visibleRegion == null) {
                return 0;
            }
            return visibleRegion.hashCode();
        }

        public final VisibleRegion iobyxmoadg() {
            return this.f87947iobyxmoadg;
        }

        public String toString() {
            return "LastFocusRegionChanged(lastFocusRegion=" + this.f87947iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f87948iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f87949ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Double f87950wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f87951zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(List shops, List services, LocationData locationData, Double d13) {
            super(null);
            zdlpuopuiu.btonecajqb(shops, "shops");
            zdlpuopuiu.btonecajqb(services, "services");
            this.f87948iobyxmoadg = shops;
            this.f87951zoijcleaow = services;
            this.f87949ppxfxbqfkf = locationData;
            this.f87950wkgbmnqykc = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f87948iobyxmoadg, zoijcleaowVar.f87948iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f87951zoijcleaow, zoijcleaowVar.f87951zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f87949ppxfxbqfkf, zoijcleaowVar.f87949ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f87950wkgbmnqykc, zoijcleaowVar.f87950wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((this.f87948iobyxmoadg.hashCode() * 31) + this.f87951zoijcleaow.hashCode()) * 31;
            LocationData locationData = this.f87949ppxfxbqfkf;
            int iHashCode2 = (iHashCode + (locationData == null ? 0 : locationData.hashCode())) * 31;
            Double d13 = this.f87950wkgbmnqykc;
            return iHashCode2 + (d13 != null ? d13.hashCode() : 0);
        }

        public final LocationData iobyxmoadg() {
            return this.f87949ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f87951zoijcleaow;
        }

        public String toString() {
            return "InitDataFetched(shops=" + this.f87948iobyxmoadg + ", services=" + this.f87951zoijcleaow + ", centralPosition=" + this.f87949ppxfxbqfkf + ", maxDistance=" + this.f87950wkgbmnqykc + ")";
        }

        public final List wkgbmnqykc() {
            return this.f87948iobyxmoadg;
        }

        public final Double zoijcleaow() {
            return this.f87950wkgbmnqykc;
        }
    }

    public /* synthetic */ gxszxtbevo(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
