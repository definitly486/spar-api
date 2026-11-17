package dm0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f29138iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -975634622;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f29139iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f29139iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f29139iobyxmoadg, ((ppxfxbqfkf) obj).f29139iobyxmoadg);
        }

        public int hashCode() {
            return this.f29139iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f29139iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f29139iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f29140iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f29141ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f29142zoijcleaow;

        public zoijcleaow(String shopId, String address, LocationData location) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(address, "address");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f29140iobyxmoadg = shopId;
            this.f29142zoijcleaow = address;
            this.f29141ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f29140iobyxmoadg, zoijcleaowVar.f29140iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f29142zoijcleaow, zoijcleaowVar.f29142zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f29141ppxfxbqfkf, zoijcleaowVar.f29141ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f29140iobyxmoadg.hashCode() * 31) + this.f29142zoijcleaow.hashCode()) * 31) + this.f29141ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f29142zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f29140iobyxmoadg;
        }

        public String toString() {
            return "NavigateBackWithResult(shopId=" + this.f29140iobyxmoadg + ", address=" + this.f29142zoijcleaow + ", location=" + this.f29141ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f29141ppxfxbqfkf;
        }
    }
}
