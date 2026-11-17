package p22;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final f22.iobyxmoadg f75421iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(f22.iobyxmoadg mode) {
            super(null);
            zdlpuopuiu.btonecajqb(mode, "mode");
            this.f75421iobyxmoadg = mode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f75421iobyxmoadg == ((iobyxmoadg) obj).f75421iobyxmoadg;
        }

        public int hashCode() {
            return this.f75421iobyxmoadg.hashCode();
        }

        public final f22.iobyxmoadg iobyxmoadg() {
            return this.f75421iobyxmoadg;
        }

        public String toString() {
            return "AmountModeUpdated(mode=" + this.f75421iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ScanGoProductModel f75422iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(ScanGoProductModel product) {
            super(null);
            zdlpuopuiu.btonecajqb(product, "product");
            this.f75422iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f75422iobyxmoadg, ((ppxfxbqfkf) obj).f75422iobyxmoadg);
        }

        public int hashCode() {
            return this.f75422iobyxmoadg.hashCode();
        }

        public final ScanGoProductModel iobyxmoadg() {
            return this.f75422iobyxmoadg;
        }

        public String toString() {
            return "InfoUpdated(product=" + this.f75422iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f75423iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f75423iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f75423iobyxmoadg == ((wkgbmnqykc) obj).f75423iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f75423iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f75423iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f75423iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f75424iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f75424iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f75424iobyxmoadg == ((zoijcleaow) obj).f75424iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f75424iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f75424iobyxmoadg;
        }

        public String toString() {
            return "FirstMessageUpdated(isFirstMessage=" + this.f75424iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
