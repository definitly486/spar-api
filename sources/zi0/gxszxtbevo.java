package zi0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f130177iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f130177iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f130177iobyxmoadg == ((iobyxmoadg) obj).f130177iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f130177iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f130177iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f130177iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f130178iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final c10.zoijcleaow f130179zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(int i13, c10.zoijcleaow data) {
            super(null);
            zdlpuopuiu.btonecajqb(data, "data");
            this.f130178iobyxmoadg = i13;
            this.f130179zoijcleaow = data;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f130178iobyxmoadg == zoijcleaowVar.f130178iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f130179zoijcleaow, zoijcleaowVar.f130179zoijcleaow);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f130178iobyxmoadg) * 31) + this.f130179zoijcleaow.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f130178iobyxmoadg;
        }

        public String toString() {
            return "OrdersLoaded(currentPage=" + this.f130178iobyxmoadg + ", data=" + this.f130179zoijcleaow + ")";
        }

        public final c10.zoijcleaow zoijcleaow() {
            return this.f130179zoijcleaow;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
