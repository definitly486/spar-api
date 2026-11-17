package z51;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f129130iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f129131zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            super(null);
            zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f129130iobyxmoadg = productFirst;
            this.f129131zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f129130iobyxmoadg, iobyxmoadgVar.f129130iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f129131zoijcleaow, iobyxmoadgVar.f129131zoijcleaow);
        }

        public int hashCode() {
            return (this.f129130iobyxmoadg.hashCode() * 31) + this.f129131zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f129130iobyxmoadg;
        }

        public String toString() {
            return "AddComboToBasket(productFirst=" + this.f129130iobyxmoadg + ", productSecond=" + this.f129131zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f129131zoijcleaow;
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f129132iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
