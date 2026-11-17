package e81;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f30953iobyxmoadg;

        public eablkybsjg(String tabId) {
            zdlpuopuiu.btonecajqb(tabId, "tabId");
            this.f30953iobyxmoadg = tabId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f30953iobyxmoadg, ((eablkybsjg) obj).f30953iobyxmoadg);
        }

        public int hashCode() {
            return this.f30953iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f30953iobyxmoadg;
        }

        public String toString() {
            return "OnTabSelected(tabId=" + this.f30953iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f30954iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f30955iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }
    }

    /* JADX INFO: renamed from: e81.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0650wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0650wkgbmnqykc f30956iobyxmoadg = new C0650wkgbmnqykc();

        private C0650wkgbmnqykc() {
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f30957iobyxmoadg;

        public zoijcleaow(ProductUiModel product) {
            zdlpuopuiu.btonecajqb(product, "product");
            this.f30957iobyxmoadg = product;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f30957iobyxmoadg, ((zoijcleaow) obj).f30957iobyxmoadg);
        }

        public int hashCode() {
            return this.f30957iobyxmoadg.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f30957iobyxmoadg;
        }

        public String toString() {
            return "OnProductActionClicked(product=" + this.f30957iobyxmoadg + ")";
        }
    }
}
