package bo;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.Product;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f16850iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f16850iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f16850iobyxmoadg == ((iobyxmoadg) obj).f16850iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f16850iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f16850iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f16850iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Product f16851iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f16852zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Product productDay, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(productDay, "productDay");
            this.f16851iobyxmoadg = productDay;
            this.f16852zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f16851iobyxmoadg, zoijcleaowVar.f16851iobyxmoadg) && this.f16852zoijcleaow == zoijcleaowVar.f16852zoijcleaow;
        }

        public int hashCode() {
            return (this.f16851iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f16852zoijcleaow);
        }

        public final Product iobyxmoadg() {
            return this.f16851iobyxmoadg;
        }

        public String toString() {
            return "UpdateProduct(productDay=" + this.f16851iobyxmoadg + ", isCorrectData=" + this.f16852zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f16852zoijcleaow;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
