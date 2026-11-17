package cu0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: cu0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0456iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f25957iobyxmoadg;

        public C0456iobyxmoadg(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f25957iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0456iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f25957iobyxmoadg, ((C0456iobyxmoadg) obj).f25957iobyxmoadg);
        }

        public int hashCode() {
            return this.f25957iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f25957iobyxmoadg;
        }

        public String toString() {
            return "DeliveryNotAvailable(message=" + this.f25957iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f25958iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f25959ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f25960zoijcleaow;

        public zoijcleaow(String fullAddress, String shortAddress, LocationData location) {
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f25958iobyxmoadg = fullAddress;
            this.f25960zoijcleaow = shortAddress;
            this.f25959ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f25958iobyxmoadg, zoijcleaowVar.f25958iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f25960zoijcleaow, zoijcleaowVar.f25960zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f25959ppxfxbqfkf, zoijcleaowVar.f25959ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f25958iobyxmoadg.hashCode() * 31) + this.f25960zoijcleaow.hashCode()) * 31) + this.f25959ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f25958iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f25960zoijcleaow;
        }

        public String toString() {
            return "DetailInfo(fullAddress=" + this.f25958iobyxmoadg + ", shortAddress=" + this.f25960zoijcleaow + ", location=" + this.f25959ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f25959ppxfxbqfkf;
        }
    }
}
