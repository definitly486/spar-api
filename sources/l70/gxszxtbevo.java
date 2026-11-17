package l70;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.coupons.CouponDomain;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f61777iobyxmoadg;

        public iobyxmoadg(List categories) {
            zdlpuopuiu.btonecajqb(categories, "categories");
            this.f61777iobyxmoadg = categories;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61777iobyxmoadg, ((iobyxmoadg) obj).f61777iobyxmoadg);
        }

        public int hashCode() {
            return this.f61777iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f61777iobyxmoadg;
        }

        public String toString() {
            return "CategoriesProcessed(categories=" + this.f61777iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f61778iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f61778iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f61778iobyxmoadg == ((ppxfxbqfkf) obj).f61778iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f61778iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f61778iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f61778iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CouponDomain f61779iobyxmoadg;

        public wkgbmnqykc(CouponDomain coupon) {
            zdlpuopuiu.btonecajqb(coupon, "coupon");
            this.f61779iobyxmoadg = coupon;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f61779iobyxmoadg, ((wkgbmnqykc) obj).f61779iobyxmoadg);
        }

        public int hashCode() {
            return this.f61779iobyxmoadg.hashCode();
        }

        public final CouponDomain iobyxmoadg() {
            return this.f61779iobyxmoadg;
        }

        public String toString() {
            return "ShowCouponDialog(coupon=" + this.f61779iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f61780iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1702691196;
        }

        public String toString() {
            return "CloseCouponDialog";
        }
    }
}
