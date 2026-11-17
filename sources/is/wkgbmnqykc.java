package is;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.components.geo.api.models.City;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f49274iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1596474468;
        }

        public String toString() {
            return "OnClickShowDeliveryArea";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final City f49275iobyxmoadg;

        public ppxfxbqfkf(City city) {
            zdlpuopuiu.btonecajqb(city, "city");
            this.f49275iobyxmoadg = city;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f49275iobyxmoadg, ((ppxfxbqfkf) obj).f49275iobyxmoadg);
        }

        public int hashCode() {
            return this.f49275iobyxmoadg.hashCode();
        }

        public final City iobyxmoadg() {
            return this.f49275iobyxmoadg;
        }

        public String toString() {
            return "OnSelectCity(city=" + this.f49275iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f49276iobyxmoadg;

        public zoijcleaow(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f49276iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f49276iobyxmoadg, ((zoijcleaow) obj).f49276iobyxmoadg);
        }

        public int hashCode() {
            return this.f49276iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f49276iobyxmoadg;
        }

        public String toString() {
            return "OnEditSearchValue(value=" + this.f49276iobyxmoadg + ")";
        }
    }
}
