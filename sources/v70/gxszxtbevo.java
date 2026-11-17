package v70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.promo.Promotion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f116281iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f116281iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f116281iobyxmoadg == ((iobyxmoadg) obj).f116281iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f116281iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f116281iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f116281iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f116282iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Promotion f116283zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(boolean z13, Promotion promoModel) {
            super(null);
            zdlpuopuiu.btonecajqb(promoModel, "promoModel");
            this.f116282iobyxmoadg = z13;
            this.f116283zoijcleaow = promoModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f116282iobyxmoadg == zoijcleaowVar.f116282iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f116283zoijcleaow, zoijcleaowVar.f116283zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f116282iobyxmoadg) * 31) + this.f116283zoijcleaow.hashCode();
        }

        public final Promotion iobyxmoadg() {
            return this.f116283zoijcleaow;
        }

        public String toString() {
            return "PromoUpdated(isLoggedIn=" + this.f116282iobyxmoadg + ", promoModel=" + this.f116283zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f116282iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
