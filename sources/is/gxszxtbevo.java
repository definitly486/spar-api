package is;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f49256iobyxmoadg;

        public iobyxmoadg(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f49256iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f49256iobyxmoadg, ((iobyxmoadg) obj).f49256iobyxmoadg);
        }

        public int hashCode() {
            return this.f49256iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f49256iobyxmoadg;
        }

        public String toString() {
            return "ChangeSearchValue(value=" + this.f49256iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f49257iobyxmoadg;

        public ppxfxbqfkf(List cities) {
            zdlpuopuiu.btonecajqb(cities, "cities");
            this.f49257iobyxmoadg = cities;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f49257iobyxmoadg, ((ppxfxbqfkf) obj).f49257iobyxmoadg);
        }

        public int hashCode() {
            return this.f49257iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f49257iobyxmoadg;
        }

        public String toString() {
            return "SetCitiesList(cities=" + this.f49257iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f49258iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f49258iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f49258iobyxmoadg == ((zoijcleaow) obj).f49258iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f49258iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f49258iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f49258iobyxmoadg + ")";
        }
    }
}
