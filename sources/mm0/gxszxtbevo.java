package mm0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.product.Product;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f67482iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f67482iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f67482iobyxmoadg == ((iobyxmoadg) obj).f67482iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f67482iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f67482iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f67482iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Product f67483iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f67484zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Product productDay, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(productDay, "productDay");
            this.f67483iobyxmoadg = productDay;
            this.f67484zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f67483iobyxmoadg, zoijcleaowVar.f67483iobyxmoadg) && this.f67484zoijcleaow == zoijcleaowVar.f67484zoijcleaow;
        }

        public int hashCode() {
            return (this.f67483iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f67484zoijcleaow);
        }

        public final Product iobyxmoadg() {
            return this.f67483iobyxmoadg;
        }

        public String toString() {
            return "UpdateProduct(productDay=" + this.f67483iobyxmoadg + ", isCorrectData=" + this.f67484zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f67484zoijcleaow;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
