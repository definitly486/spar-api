package qp1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoProductModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ScanGoProductModel f80465iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ScanGoProductModel productModel) {
            super(null);
            zdlpuopuiu.btonecajqb(productModel, "productModel");
            this.f80465iobyxmoadg = productModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f80465iobyxmoadg, ((iobyxmoadg) obj).f80465iobyxmoadg);
        }

        public int hashCode() {
            return this.f80465iobyxmoadg.hashCode();
        }

        public final ScanGoProductModel iobyxmoadg() {
            return this.f80465iobyxmoadg;
        }

        public String toString() {
            return "InfoUpdated(productModel=" + this.f80465iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f80466iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String warningMessage) {
            super(null);
            zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
            this.f80466iobyxmoadg = warningMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f80466iobyxmoadg, ((ppxfxbqfkf) obj).f80466iobyxmoadg);
        }

        public int hashCode() {
            return this.f80466iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f80466iobyxmoadg;
        }

        public String toString() {
            return "ProductDeletionError(warningMessage=" + this.f80466iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f80467iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f80467iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f80467iobyxmoadg == ((zoijcleaow) obj).f80467iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f80467iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f80467iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f80467iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
