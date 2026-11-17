package lo1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoProductModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final bo1.iobyxmoadg f63716iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(bo1.iobyxmoadg mode) {
            super(null);
            zdlpuopuiu.btonecajqb(mode, "mode");
            this.f63716iobyxmoadg = mode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f63716iobyxmoadg == ((iobyxmoadg) obj).f63716iobyxmoadg;
        }

        public int hashCode() {
            return this.f63716iobyxmoadg.hashCode();
        }

        public final bo1.iobyxmoadg iobyxmoadg() {
            return this.f63716iobyxmoadg;
        }

        public String toString() {
            return "AmountModeUpdated(mode=" + this.f63716iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ScanGoProductModel f63717iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(ScanGoProductModel product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f63717iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f63717iobyxmoadg, ((ppxfxbqfkf) obj).f63717iobyxmoadg);
        }

        public int hashCode() {
            return this.f63717iobyxmoadg.hashCode();
        }

        public final ScanGoProductModel iobyxmoadg() {
            return this.f63717iobyxmoadg;
        }

        public String toString() {
            return "InfoUpdated(product=" + this.f63717iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f63718iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f63718iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f63718iobyxmoadg == ((wkgbmnqykc) obj).f63718iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f63718iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f63718iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f63718iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f63719iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f63719iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f63719iobyxmoadg == ((zoijcleaow) obj).f63719iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f63719iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f63719iobyxmoadg;
        }

        public String toString() {
            return "FirstMessageUpdated(isFirstMessage=" + this.f63719iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
