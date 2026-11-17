package z51;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f129133iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ComboSetProduct selectedProduct) {
            super(null);
            zdlpuopuiu.btonecajqb(selectedProduct, "selectedProduct");
            this.f129133iobyxmoadg = selectedProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f129133iobyxmoadg, ((iobyxmoadg) obj).f129133iobyxmoadg);
        }

        public int hashCode() {
            return this.f129133iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f129133iobyxmoadg;
        }

        public String toString() {
            return "SelectedProductFirst(selectedProduct=" + this.f129133iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f129134iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(ComboSetProduct selectedProduct) {
            super(null);
            zdlpuopuiu.btonecajqb(selectedProduct, "selectedProduct");
            this.f129134iobyxmoadg = selectedProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f129134iobyxmoadg, ((zoijcleaow) obj).f129134iobyxmoadg);
        }

        public int hashCode() {
            return this.f129134iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f129134iobyxmoadg;
        }

        public String toString() {
            return "SelectedProductSecond(selectedProduct=" + this.f129134iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
