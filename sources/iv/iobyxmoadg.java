package iv;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: iv.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1053iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f49650iobyxmoadg;

        public C1053iobyxmoadg(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f49650iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1053iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f49650iobyxmoadg, ((C1053iobyxmoadg) obj).f49650iobyxmoadg);
        }

        public int hashCode() {
            return this.f49650iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f49650iobyxmoadg;
        }

        public String toString() {
            return "DeliveryNotAvailable(message=" + this.f49650iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f49651iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f49652ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f49653zoijcleaow;

        public zoijcleaow(String fullAddress, String shortAddress, LocationData location) {
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f49651iobyxmoadg = fullAddress;
            this.f49653zoijcleaow = shortAddress;
            this.f49652ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f49651iobyxmoadg, zoijcleaowVar.f49651iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f49653zoijcleaow, zoijcleaowVar.f49653zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f49652ppxfxbqfkf, zoijcleaowVar.f49652ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f49651iobyxmoadg.hashCode() * 31) + this.f49653zoijcleaow.hashCode()) * 31) + this.f49652ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f49651iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f49653zoijcleaow;
        }

        public String toString() {
            return "DetailInfo(fullAddress=" + this.f49651iobyxmoadg + ", shortAddress=" + this.f49653zoijcleaow + ", location=" + this.f49652ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f49652ppxfxbqfkf;
        }
    }
}
