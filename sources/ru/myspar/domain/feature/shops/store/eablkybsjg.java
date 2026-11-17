package ru.myspar.domain.feature.shops.store;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.CameraPosition;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    public static final class btonecajqb extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mb0.wkgbmnqykc f87920iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f87921ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f87922zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(mb0.wkgbmnqykc shopUiModel, List services, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(shopUiModel, "shopUiModel");
            zdlpuopuiu.btonecajqb(services, "services");
            this.f87920iobyxmoadg = shopUiModel;
            this.f87922zoijcleaow = services;
            this.f87921ppxfxbqfkf = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f87920iobyxmoadg, btonecajqbVar.f87920iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f87922zoijcleaow, btonecajqbVar.f87922zoijcleaow) && this.f87921ppxfxbqfkf == btonecajqbVar.f87921ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f87920iobyxmoadg.hashCode() * 31) + this.f87922zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f87921ppxfxbqfkf);
        }

        public final List iobyxmoadg() {
            return this.f87922zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f87921ppxfxbqfkf;
        }

        public String toString() {
            return "ShowShopDetails(shopUiModel=" + this.f87920iobyxmoadg + ", services=" + this.f87922zoijcleaow + ", isList=" + this.f87921ppxfxbqfkf + ")";
        }

        public final mb0.wkgbmnqykc zoijcleaow() {
            return this.f87920iobyxmoadg;
        }
    }

    public static final class dxjokdxxww extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f87923iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(LocationData location) {
            super(null);
            zdlpuopuiu.btonecajqb(location, "location");
            this.f87923iobyxmoadg = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f87923iobyxmoadg, ((dxjokdxxww) obj).f87923iobyxmoadg);
        }

        public int hashCode() {
            return this.f87923iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f87923iobyxmoadg;
        }

        public String toString() {
            return "ShowRoute(location=" + this.f87923iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2005eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2005eablkybsjg f87924iobyxmoadg = new C2005eablkybsjg();

        private C2005eablkybsjg() {
            super(null);
        }
    }

    public static final class gtknphoqwx extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f87925iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(LocationData location) {
            super(null);
            zdlpuopuiu.btonecajqb(location, "location");
            this.f87925iobyxmoadg = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f87925iobyxmoadg, ((gtknphoqwx) obj).f87925iobyxmoadg);
        }

        public int hashCode() {
            return this.f87925iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f87925iobyxmoadg;
        }

        public String toString() {
            return "ShowShopOnMap(location=" + this.f87925iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f87926iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(List selectedServices) {
            super(null);
            zdlpuopuiu.btonecajqb(selectedServices, "selectedServices");
            this.f87926iobyxmoadg = selectedServices;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f87926iobyxmoadg, ((gxszxtbevo) obj).f87926iobyxmoadg);
        }

        public int hashCode() {
            return this.f87926iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f87926iobyxmoadg;
        }

        public String toString() {
            return "OpenFilters(selectedServices=" + this.f87926iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f87927iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f87928iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f87928iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f87928iobyxmoadg, ((lqeggnwhkg) obj).f87928iobyxmoadg);
        }

        public int hashCode() {
            return this.f87928iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f87928iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f87928iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f87929iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f87929iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f87929iobyxmoadg, ((nufgyqmvbu) obj).f87929iobyxmoadg);
        }

        public int hashCode() {
            return this.f87929iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f87929iobyxmoadg;
        }

        public String toString() {
            return "ShowLocationError(error=" + this.f87929iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f87930iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ShopsArgs.zoijcleaow f87931ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f87932zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(LocationData locationData, double d13, ShopsArgs.zoijcleaow shopsFlow) {
            super(null);
            zdlpuopuiu.btonecajqb(locationData, "locationData");
            zdlpuopuiu.btonecajqb(shopsFlow, "shopsFlow");
            this.f87930iobyxmoadg = locationData;
            this.f87932zoijcleaow = d13;
            this.f87931ppxfxbqfkf = shopsFlow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f87930iobyxmoadg, ppxfxbqfkfVar.f87930iobyxmoadg) && Double.compare(this.f87932zoijcleaow, ppxfxbqfkfVar.f87932zoijcleaow) == 0 && this.f87931ppxfxbqfkf == ppxfxbqfkfVar.f87931ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f87930iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f87932zoijcleaow)) * 31) + this.f87931ppxfxbqfkf.hashCode();
        }

        public final double iobyxmoadg() {
            return this.f87932zoijcleaow;
        }

        public final ShopsArgs.zoijcleaow ppxfxbqfkf() {
            return this.f87931ppxfxbqfkf;
        }

        public String toString() {
            return "MoveMapByCameraDistance(locationData=" + this.f87930iobyxmoadg + ", cameraDistance=" + this.f87932zoijcleaow + ", shopsFlow=" + this.f87931ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f87930iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CameraPosition f87933iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(CameraPosition cameraPosition) {
            super(null);
            zdlpuopuiu.btonecajqb(cameraPosition, "cameraPosition");
            this.f87933iobyxmoadg = cameraPosition;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f87933iobyxmoadg, ((wkgbmnqykc) obj).f87933iobyxmoadg);
        }

        public int hashCode() {
            return this.f87933iobyxmoadg.hashCode();
        }

        public final CameraPosition iobyxmoadg() {
            return this.f87933iobyxmoadg;
        }

        public String toString() {
            return "MoveMapByCameraPosition(cameraPosition=" + this.f87933iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f87934iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f87934iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f87934iobyxmoadg == ((zoijcleaow) obj).f87934iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f87934iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f87934iobyxmoadg;
        }

        public String toString() {
            return "ChangeMapScale(increase=" + this.f87934iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
