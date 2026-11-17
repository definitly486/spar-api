package fl0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f34336iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1986649404;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f34337iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f34337iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f34337iobyxmoadg, ((ppxfxbqfkf) obj).f34337iobyxmoadg);
        }

        public int hashCode() {
            return this.f34337iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f34337iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f34337iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34338iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final LocationData f34339zoijcleaow;

        public zoijcleaow(String address, LocationData location) {
            zdlpuopuiu.btonecajqb(address, "address");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f34338iobyxmoadg = address;
            this.f34339zoijcleaow = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f34338iobyxmoadg, zoijcleaowVar.f34338iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f34339zoijcleaow, zoijcleaowVar.f34339zoijcleaow);
        }

        public int hashCode() {
            return (this.f34338iobyxmoadg.hashCode() * 31) + this.f34339zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34338iobyxmoadg;
        }

        public String toString() {
            return "NavigateBackWithResult(address=" + this.f34338iobyxmoadg + ", location=" + this.f34339zoijcleaow + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f34339zoijcleaow;
        }
    }
}
