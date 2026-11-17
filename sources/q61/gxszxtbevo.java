package q61;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f77993iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(List filters) {
            super(null);
            zdlpuopuiu.btonecajqb(filters, "filters");
            this.f77993iobyxmoadg = filters;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f77993iobyxmoadg, ((iobyxmoadg) obj).f77993iobyxmoadg);
        }

        public int hashCode() {
            return this.f77993iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f77993iobyxmoadg;
        }

        public String toString() {
            return "FiltersUpdate(filters=" + this.f77993iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f77994iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f77994iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f77994iobyxmoadg == ((zoijcleaow) obj).f77994iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f77994iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f77994iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f77994iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
