package um;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f113940iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 113414817;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f113941iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f113941iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f113941iobyxmoadg, ((ppxfxbqfkf) obj).f113941iobyxmoadg);
        }

        public int hashCode() {
            return this.f113941iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f113941iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f113941iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f113942iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final LocationData f113943zoijcleaow;

        public zoijcleaow(String address, LocationData location) {
            zdlpuopuiu.btonecajqb(address, "address");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f113942iobyxmoadg = address;
            this.f113943zoijcleaow = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f113942iobyxmoadg, zoijcleaowVar.f113942iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f113943zoijcleaow, zoijcleaowVar.f113943zoijcleaow);
        }

        public int hashCode() {
            return (this.f113942iobyxmoadg.hashCode() * 31) + this.f113943zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f113942iobyxmoadg;
        }

        public String toString() {
            return "NavigateBackWithResult(address=" + this.f113942iobyxmoadg + ", location=" + this.f113943zoijcleaow + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f113943zoijcleaow;
        }
    }
}
