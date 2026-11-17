package ru.myspar.proloyalty.domain.feature.shops.store;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.domain.models.CameraPosition;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    public static final class btonecajqb extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final l91.wkgbmnqykc f95697iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f95698ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f95699zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(l91.wkgbmnqykc shopUiModel, List services, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(shopUiModel, "shopUiModel");
            zdlpuopuiu.btonecajqb(services, "services");
            this.f95697iobyxmoadg = shopUiModel;
            this.f95699zoijcleaow = services;
            this.f95698ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f95697iobyxmoadg, btonecajqbVar.f95697iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f95699zoijcleaow, btonecajqbVar.f95699zoijcleaow) && this.f95698ppxfxbqfkf == btonecajqbVar.f95698ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f95697iobyxmoadg.hashCode() * 31) + this.f95699zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f95698ppxfxbqfkf);
        }

        public final List iobyxmoadg() {
            return this.f95699zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f95698ppxfxbqfkf;
        }

        public String toString() {
            return "ShowShopDetails(shopUiModel=" + this.f95697iobyxmoadg + ", services=" + this.f95699zoijcleaow + ", isList=" + this.f95698ppxfxbqfkf + ")";
        }

        public final l91.wkgbmnqykc zoijcleaow() {
            return this.f95697iobyxmoadg;
        }
    }

    public static final class dxjokdxxww extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f95700iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(LocationData location) {
            super(null);
            zdlpuopuiu.btonecajqb(location, "location");
            this.f95700iobyxmoadg = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f95700iobyxmoadg, ((dxjokdxxww) obj).f95700iobyxmoadg);
        }

        public int hashCode() {
            return this.f95700iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f95700iobyxmoadg;
        }

        public String toString() {
            return "ShowRoute(location=" + this.f95700iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2242eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2242eablkybsjg f95701iobyxmoadg = new C2242eablkybsjg();

        private C2242eablkybsjg() {
            super(null);
        }
    }

    public static final class gtknphoqwx extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f95702iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(LocationData location) {
            super(null);
            zdlpuopuiu.btonecajqb(location, "location");
            this.f95702iobyxmoadg = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f95702iobyxmoadg, ((gtknphoqwx) obj).f95702iobyxmoadg);
        }

        public int hashCode() {
            return this.f95702iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f95702iobyxmoadg;
        }

        public String toString() {
            return "ShowShopOnMap(location=" + this.f95702iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f95703iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(List selectedServices) {
            super(null);
            zdlpuopuiu.btonecajqb(selectedServices, "selectedServices");
            this.f95703iobyxmoadg = selectedServices;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f95703iobyxmoadg, ((gxszxtbevo) obj).f95703iobyxmoadg);
        }

        public int hashCode() {
            return this.f95703iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f95703iobyxmoadg;
        }

        public String toString() {
            return "OpenFilters(selectedServices=" + this.f95703iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f95704iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f95705iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f95705iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f95705iobyxmoadg, ((lqeggnwhkg) obj).f95705iobyxmoadg);
        }

        public int hashCode() {
            return this.f95705iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f95705iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f95705iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f95706iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f95706iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f95706iobyxmoadg, ((nufgyqmvbu) obj).f95706iobyxmoadg);
        }

        public int hashCode() {
            return this.f95706iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f95706iobyxmoadg;
        }

        public String toString() {
            return "ShowLocationError(error=" + this.f95706iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f95707iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ShopsArgs.zoijcleaow f95708ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f95709zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(LocationData locationData, double d13, ShopsArgs.zoijcleaow shopsFlow) {
            super(null);
            zdlpuopuiu.btonecajqb(locationData, "locationData");
            zdlpuopuiu.btonecajqb(shopsFlow, "shopsFlow");
            this.f95707iobyxmoadg = locationData;
            this.f95709zoijcleaow = d13;
            this.f95708ppxfxbqfkf = shopsFlow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f95707iobyxmoadg, ppxfxbqfkfVar.f95707iobyxmoadg) && Double.compare(this.f95709zoijcleaow, ppxfxbqfkfVar.f95709zoijcleaow) == 0 && this.f95708ppxfxbqfkf == ppxfxbqfkfVar.f95708ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f95707iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f95709zoijcleaow)) * 31) + this.f95708ppxfxbqfkf.hashCode();
        }

        public final double iobyxmoadg() {
            return this.f95709zoijcleaow;
        }

        public final ShopsArgs.zoijcleaow ppxfxbqfkf() {
            return this.f95708ppxfxbqfkf;
        }

        public String toString() {
            return "MoveMapByCameraDistance(locationData=" + this.f95707iobyxmoadg + ", cameraDistance=" + this.f95709zoijcleaow + ", shopsFlow=" + this.f95708ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f95707iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CameraPosition f95710iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(CameraPosition cameraPosition) {
            super(null);
            zdlpuopuiu.btonecajqb(cameraPosition, "cameraPosition");
            this.f95710iobyxmoadg = cameraPosition;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f95710iobyxmoadg, ((wkgbmnqykc) obj).f95710iobyxmoadg);
        }

        public int hashCode() {
            return this.f95710iobyxmoadg.hashCode();
        }

        public final CameraPosition iobyxmoadg() {
            return this.f95710iobyxmoadg;
        }

        public String toString() {
            return "MoveMapByCameraPosition(cameraPosition=" + this.f95710iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f95711iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f95711iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f95711iobyxmoadg == ((zoijcleaow) obj).f95711iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f95711iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f95711iobyxmoadg;
        }

        public String toString() {
            return "ChangeMapScale(increase=" + this.f95711iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
