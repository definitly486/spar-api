package o61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.user.domain.model.UserSharePromo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72158iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f72158iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f72158iobyxmoadg == ((iobyxmoadg) obj).f72158iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72158iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72158iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f72158iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserSharePromo f72159iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(UserSharePromo data) {
            super(null);
            zdlpuopuiu.btonecajqb(data, "data");
            this.f72159iobyxmoadg = data;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f72159iobyxmoadg, ((zoijcleaow) obj).f72159iobyxmoadg);
        }

        public int hashCode() {
            return this.f72159iobyxmoadg.hashCode();
        }

        public final UserSharePromo iobyxmoadg() {
            return this.f72159iobyxmoadg;
        }

        public String toString() {
            return "SharePromoInfoUpdated(data=" + this.f72159iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
