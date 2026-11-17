package g80;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f36619iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(List filters) {
            super(null);
            zdlpuopuiu.btonecajqb(filters, "filters");
            this.f36619iobyxmoadg = filters;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f36619iobyxmoadg, ((iobyxmoadg) obj).f36619iobyxmoadg);
        }

        public int hashCode() {
            return this.f36619iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f36619iobyxmoadg;
        }

        public String toString() {
            return "FiltersUpdate(filters=" + this.f36619iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f36620iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f36620iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f36620iobyxmoadg == ((zoijcleaow) obj).f36620iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f36620iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f36620iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f36620iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
