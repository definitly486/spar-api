package u32;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ScanGoProductModel f112573iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ScanGoProductModel productModel) {
            super(null);
            zdlpuopuiu.btonecajqb(productModel, "productModel");
            this.f112573iobyxmoadg = productModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112573iobyxmoadg, ((iobyxmoadg) obj).f112573iobyxmoadg);
        }

        public int hashCode() {
            return this.f112573iobyxmoadg.hashCode();
        }

        public final ScanGoProductModel iobyxmoadg() {
            return this.f112573iobyxmoadg;
        }

        public String toString() {
            return "InfoUpdated(productModel=" + this.f112573iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f112574iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String warningMessage) {
            super(null);
            zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
            this.f112574iobyxmoadg = warningMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f112574iobyxmoadg, ((ppxfxbqfkf) obj).f112574iobyxmoadg);
        }

        public int hashCode() {
            return this.f112574iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f112574iobyxmoadg;
        }

        public String toString() {
            return "ProductDeletionError(warningMessage=" + this.f112574iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f112575iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f112575iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f112575iobyxmoadg == ((zoijcleaow) obj).f112575iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f112575iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f112575iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f112575iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
