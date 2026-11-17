package a61;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.coupons.CouponDomain;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f922iobyxmoadg;

        public iobyxmoadg(List categories) {
            zdlpuopuiu.btonecajqb(categories, "categories");
            this.f922iobyxmoadg = categories;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f922iobyxmoadg, ((iobyxmoadg) obj).f922iobyxmoadg);
        }

        public int hashCode() {
            return this.f922iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f922iobyxmoadg;
        }

        public String toString() {
            return "CategoriesProcessed(categories=" + this.f922iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f923iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f923iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f923iobyxmoadg == ((ppxfxbqfkf) obj).f923iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f923iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f923iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f923iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CouponDomain f924iobyxmoadg;

        public wkgbmnqykc(CouponDomain coupon) {
            zdlpuopuiu.btonecajqb(coupon, "coupon");
            this.f924iobyxmoadg = coupon;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f924iobyxmoadg, ((wkgbmnqykc) obj).f924iobyxmoadg);
        }

        public int hashCode() {
            return this.f924iobyxmoadg.hashCode();
        }

        public final CouponDomain iobyxmoadg() {
            return this.f924iobyxmoadg;
        }

        public String toString() {
            return "ShowCouponDialog(coupon=" + this.f924iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f925iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1634985185;
        }

        public String toString() {
            return "CloseCouponDialog";
        }
    }
}
