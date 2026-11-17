package g61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f36507iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f36507iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f36507iobyxmoadg == ((iobyxmoadg) obj).f36507iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f36507iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f36507iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f36507iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f36508iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Promotion f36509zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(boolean z13, Promotion promoModel) {
            super(null);
            zdlpuopuiu.btonecajqb(promoModel, "promoModel");
            this.f36508iobyxmoadg = z13;
            this.f36509zoijcleaow = promoModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f36508iobyxmoadg == zoijcleaowVar.f36508iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f36509zoijcleaow, zoijcleaowVar.f36509zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f36508iobyxmoadg) * 31) + this.f36509zoijcleaow.hashCode();
        }

        public final Promotion iobyxmoadg() {
            return this.f36509zoijcleaow;
        }

        public String toString() {
            return "PromoUpdated(isLoggedIn=" + this.f36508iobyxmoadg + ", promoModel=" + this.f36509zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f36508iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
