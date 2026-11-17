package zi1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.order.Purchases;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f130234iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f130234iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f130234iobyxmoadg == ((iobyxmoadg) obj).f130234iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f130234iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f130234iobyxmoadg;
        }

        public String toString() {
            return "IsShowOnlyChanged(isShowOnly=" + this.f130234iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f130235iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f130235iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f130235iobyxmoadg == ((ppxfxbqfkf) obj).f130235iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f130235iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f130235iobyxmoadg;
        }

        public String toString() {
            return "SetLoading(isLoading=" + this.f130235iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f130236iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Purchases f130237zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(int i13, Purchases purchases) {
            super(null);
            zdlpuopuiu.btonecajqb(purchases, "purchases");
            this.f130236iobyxmoadg = i13;
            this.f130237zoijcleaow = purchases;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f130236iobyxmoadg == zoijcleaowVar.f130236iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f130237zoijcleaow, zoijcleaowVar.f130237zoijcleaow);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f130236iobyxmoadg) * 31) + this.f130237zoijcleaow.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f130236iobyxmoadg;
        }

        public String toString() {
            return "ProcessPurchases(page=" + this.f130236iobyxmoadg + ", purchases=" + this.f130237zoijcleaow + ")";
        }

        public final Purchases zoijcleaow() {
            return this.f130237zoijcleaow;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
