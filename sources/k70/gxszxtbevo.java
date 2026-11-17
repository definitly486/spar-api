package k70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f54105iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ComboSetProduct selectedProduct) {
            super(null);
            zdlpuopuiu.btonecajqb(selectedProduct, "selectedProduct");
            this.f54105iobyxmoadg = selectedProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f54105iobyxmoadg, ((iobyxmoadg) obj).f54105iobyxmoadg);
        }

        public int hashCode() {
            return this.f54105iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f54105iobyxmoadg;
        }

        public String toString() {
            return "SelectedProductFirst(selectedProduct=" + this.f54105iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f54106iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(ComboSetProduct selectedProduct) {
            super(null);
            zdlpuopuiu.btonecajqb(selectedProduct, "selectedProduct");
            this.f54106iobyxmoadg = selectedProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f54106iobyxmoadg, ((zoijcleaow) obj).f54106iobyxmoadg);
        }

        public int hashCode() {
            return this.f54106iobyxmoadg.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f54106iobyxmoadg;
        }

        public String toString() {
            return "SelectedProductSecond(selectedProduct=" + this.f54106iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
