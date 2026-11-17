package ka0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.product.model.product.ProductUiModel;

/* JADX INFO: loaded from: classes4.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f54353iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final String f54354zoijcleaow;

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            f54353iobyxmoadg = iobyxmoadgVar;
            String name = iobyxmoadgVar.getClass().getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            f54354zoijcleaow = name;
        }

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        @Override // ka0.zoijcleaow
        public String getId() {
            return f54354zoijcleaow;
        }

        public int hashCode() {
            return 1390622163;
        }

        public String toString() {
            return "Loader";
        }
    }

    /* JADX INFO: renamed from: ka0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1168zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductUiModel f54355iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f54356zoijcleaow;

        public C1168zoijcleaow(ProductUiModel product) {
            zdlpuopuiu.btonecajqb(product, "product");
            this.f54355iobyxmoadg = product;
            this.f54356zoijcleaow = product.getId();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1168zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f54355iobyxmoadg, ((C1168zoijcleaow) obj).f54355iobyxmoadg);
        }

        @Override // ka0.zoijcleaow
        public String getId() {
            return this.f54356zoijcleaow;
        }

        public int hashCode() {
            return this.f54355iobyxmoadg.hashCode();
        }

        public final ProductUiModel iobyxmoadg() {
            return this.f54355iobyxmoadg;
        }

        public String toString() {
            return "Product(product=" + this.f54355iobyxmoadg + ")";
        }
    }

    String getId();
}
