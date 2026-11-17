package k70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f54102iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f54103zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            super(null);
            zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f54102iobyxmoadg = productFirst;
            this.f54103zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f54102iobyxmoadg, iobyxmoadgVar.f54102iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f54103zoijcleaow, iobyxmoadgVar.f54103zoijcleaow);
        }

        public int hashCode() {
            return (this.f54102iobyxmoadg.hashCode() * 31) + this.f54103zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f54102iobyxmoadg;
        }

        public String toString() {
            return "AddComboToBasket(productFirst=" + this.f54102iobyxmoadg + ", productSecond=" + this.f54103zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f54103zoijcleaow;
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f54104iobyxmoadg = new zoijcleaow();

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
