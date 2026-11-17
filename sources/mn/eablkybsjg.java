package mn;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
public interface eablkybsjg {

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f67525iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return 1780795090;
        }

        public String toString() {
            return "ShowSomethingProductsAvailableOnlyForPickupMessage";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f67526iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return 1478302807;
        }

        public String toString() {
            return "ShowProductPriceCanBeChangeMessage";
        }
    }

    /* JADX INFO: renamed from: mn.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1398eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f67527iobyxmoadg;

        public C1398eablkybsjg(LocationData userLocation) {
            zdlpuopuiu.btonecajqb(userLocation, "userLocation");
            this.f67527iobyxmoadg = userLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1398eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f67527iobyxmoadg, ((C1398eablkybsjg) obj).f67527iobyxmoadg);
        }

        public int hashCode() {
            return this.f67527iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f67527iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSearchAddressScreen(userLocation=" + this.f67527iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f67528iobyxmoadg;

        public gxszxtbevo(LocationData userLocation) {
            zdlpuopuiu.btonecajqb(userLocation, "userLocation");
            this.f67528iobyxmoadg = userLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f67528iobyxmoadg, ((gxszxtbevo) obj).f67528iobyxmoadg);
        }

        public int hashCode() {
            return this.f67528iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f67528iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSearchShopScreen(userLocation=" + this.f67528iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f67529iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1416572482;
        }

        public String toString() {
            return "ExitFromAddressFlow";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f67530iobyxmoadg;

        public lqeggnwhkg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f67530iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f67530iobyxmoadg, ((lqeggnwhkg) obj).f67530iobyxmoadg);
        }

        public int hashCode() {
            return this.f67530iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f67530iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f67530iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f67531iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 1935832208;
        }

        public String toString() {
            return "ShowLocationDetectErrorMessage";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f67532iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f67533ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f67534zoijcleaow;

        public ppxfxbqfkf(String shortAddress, String fullAddress, LocationData location) {
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f67532iobyxmoadg = shortAddress;
            this.f67534zoijcleaow = fullAddress;
            this.f67533ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f67532iobyxmoadg, ppxfxbqfkfVar.f67532iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67534zoijcleaow, ppxfxbqfkfVar.f67534zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f67533ppxfxbqfkf, ppxfxbqfkfVar.f67533ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f67532iobyxmoadg.hashCode() * 31) + this.f67534zoijcleaow.hashCode()) * 31) + this.f67533ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f67534zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f67532iobyxmoadg;
        }

        public String toString() {
            return "NavigateBackWithResult(shortAddress=" + this.f67532iobyxmoadg + ", fullAddress=" + this.f67534zoijcleaow + ", location=" + this.f67533ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f67533ppxfxbqfkf;
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f67535iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f67536ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f67537zoijcleaow;

        public wkgbmnqykc(String shortAddress, String fullAddress, LocationData location) {
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f67535iobyxmoadg = shortAddress;
            this.f67537zoijcleaow = fullAddress;
            this.f67536ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f67535iobyxmoadg, wkgbmnqykcVar.f67535iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67537zoijcleaow, wkgbmnqykcVar.f67537zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f67536ppxfxbqfkf, wkgbmnqykcVar.f67536ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f67535iobyxmoadg.hashCode() * 31) + this.f67537zoijcleaow.hashCode()) * 31) + this.f67536ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f67537zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f67535iobyxmoadg;
        }

        public String toString() {
            return "NavigateToAddressDetailScreen(shortAddress=" + this.f67535iobyxmoadg + ", fullAddress=" + this.f67537zoijcleaow + ", location=" + this.f67536ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f67536ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f67538iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1549979892;
        }

        public String toString() {
            return "NavigateBack";
        }
    }
}
