package tx1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.order.Purchases;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f111759iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f111759iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f111759iobyxmoadg == ((iobyxmoadg) obj).f111759iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f111759iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f111759iobyxmoadg;
        }

        public String toString() {
            return "IsShowOnlyChanged(isShowOnly=" + this.f111759iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f111760iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f111760iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f111760iobyxmoadg == ((ppxfxbqfkf) obj).f111760iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f111760iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f111760iobyxmoadg;
        }

        public String toString() {
            return "SetLoading(isLoading=" + this.f111760iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f111761iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Purchases f111762zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(int i13, Purchases purchases) {
            super(null);
            zdlpuopuiu.btonecajqb(purchases, "purchases");
            this.f111761iobyxmoadg = i13;
            this.f111762zoijcleaow = purchases;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f111761iobyxmoadg == zoijcleaowVar.f111761iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f111762zoijcleaow, zoijcleaowVar.f111762zoijcleaow);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f111761iobyxmoadg) * 31) + this.f111762zoijcleaow.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f111761iobyxmoadg;
        }

        public String toString() {
            return "ProcessPurchases(page=" + this.f111761iobyxmoadg + ", purchases=" + this.f111762zoijcleaow + ")";
        }

        public final Purchases zoijcleaow() {
            return this.f111762zoijcleaow;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
