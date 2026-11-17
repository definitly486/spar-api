package gr;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow implements os.iobyxmoadg {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f38351iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f38352zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(List productUIData) {
            super(null);
            zdlpuopuiu.btonecajqb(productUIData, "productUIData");
            this.f38351iobyxmoadg = productUIData;
            this.f38352zoijcleaow = "cartProducts";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f38351iobyxmoadg, ((iobyxmoadg) obj).f38351iobyxmoadg);
        }

        @Override // os.iobyxmoadg
        public String getKey() {
            return this.f38352zoijcleaow;
        }

        public int hashCode() {
            return this.f38351iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f38351iobyxmoadg;
        }

        public String toString() {
            return "CartProducts(productUIData=" + this.f38351iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Double f38353iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f38354zoijcleaow;

        public ppxfxbqfkf(Double d13) {
            super(null);
            this.f38353iobyxmoadg = d13;
            this.f38354zoijcleaow = "deliveryPrice";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f38353iobyxmoadg, ((ppxfxbqfkf) obj).f38353iobyxmoadg);
        }

        @Override // os.iobyxmoadg
        public String getKey() {
            return this.f38354zoijcleaow;
        }

        public int hashCode() {
            Double d13 = this.f38353iobyxmoadg;
            if (d13 == null) {
                return 0;
            }
            return d13.hashCode();
        }

        public String toString() {
            return "OrderDeliveryPrice(newPrice=" + this.f38353iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: gr.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C0872zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final y00.iobyxmoadg f38355iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f38356zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0872zoijcleaow(y00.iobyxmoadg deliveryData) {
            super(null);
            zdlpuopuiu.btonecajqb(deliveryData, "deliveryData");
            this.f38355iobyxmoadg = deliveryData;
            this.f38356zoijcleaow = "changeDeliveryData";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0872zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f38355iobyxmoadg, ((C0872zoijcleaow) obj).f38355iobyxmoadg);
        }

        @Override // os.iobyxmoadg
        public String getKey() {
            return this.f38356zoijcleaow;
        }

        public int hashCode() {
            return this.f38355iobyxmoadg.hashCode();
        }

        public final y00.iobyxmoadg iobyxmoadg() {
            return this.f38355iobyxmoadg;
        }

        public String toString() {
            return "ChangeCurrentShop(deliveryData=" + this.f38355iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
