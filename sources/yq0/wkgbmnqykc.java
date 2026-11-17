package yq0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.components.geo.api.models.City;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f126278iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1383590439;
        }

        public String toString() {
            return "OnClickShowDeliveryArea";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final City f126279iobyxmoadg;

        public ppxfxbqfkf(City city) {
            zdlpuopuiu.btonecajqb(city, "city");
            this.f126279iobyxmoadg = city;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f126279iobyxmoadg, ((ppxfxbqfkf) obj).f126279iobyxmoadg);
        }

        public int hashCode() {
            return this.f126279iobyxmoadg.hashCode();
        }

        public final City iobyxmoadg() {
            return this.f126279iobyxmoadg;
        }

        public String toString() {
            return "OnSelectCity(city=" + this.f126279iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f126280iobyxmoadg;

        public zoijcleaow(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f126280iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f126280iobyxmoadg, ((zoijcleaow) obj).f126280iobyxmoadg);
        }

        public int hashCode() {
            return this.f126280iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f126280iobyxmoadg;
        }

        public String toString() {
            return "OnEditSearchValue(value=" + this.f126280iobyxmoadg + ")";
        }
    }
}
