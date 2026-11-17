package o81;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f72331iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final String f72332zoijcleaow;

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            f72331iobyxmoadg = iobyxmoadgVar;
            String name = iobyxmoadgVar.getClass().getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            f72332zoijcleaow = name;
        }

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        @Override // o81.zoijcleaow
        public String getId() {
            return f72332zoijcleaow;
        }

        public int hashCode() {
            return 1168731126;
        }

        public String toString() {
            return "Loader";
        }
    }

    /* JADX INFO: renamed from: o81.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1564zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f72333iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f72334zoijcleaow;

        public C1564zoijcleaow(ProductUiModel product) {
            zdlpuopuiu.btonecajqb(product, "product");
            this.f72333iobyxmoadg = product;
            this.f72334zoijcleaow = product.getId();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1564zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f72333iobyxmoadg, ((C1564zoijcleaow) obj).f72333iobyxmoadg);
        }

        @Override // o81.zoijcleaow
        public String getId() {
            return this.f72334zoijcleaow;
        }

        public int hashCode() {
            return this.f72333iobyxmoadg.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f72333iobyxmoadg;
        }

        public String toString() {
            return "Product(product=" + this.f72333iobyxmoadg + ")";
        }
    }

    String getId();
}
