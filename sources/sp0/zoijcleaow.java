package sp0;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow implements er0.iobyxmoadg {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f107811iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f107812zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(List productUIData) {
            super(null);
            zdlpuopuiu.btonecajqb(productUIData, "productUIData");
            this.f107811iobyxmoadg = productUIData;
            this.f107812zoijcleaow = "cartProducts";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f107811iobyxmoadg, ((iobyxmoadg) obj).f107811iobyxmoadg);
        }

        @Override // er0.iobyxmoadg
        public String getKey() {
            return this.f107812zoijcleaow;
        }

        public int hashCode() {
            return this.f107811iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f107811iobyxmoadg;
        }

        public String toString() {
            return "CartProducts(productUIData=" + this.f107811iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Double f107813iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f107814zoijcleaow;

        public ppxfxbqfkf(Double d13) {
            super(null);
            this.f107813iobyxmoadg = d13;
            this.f107814zoijcleaow = "deliveryPrice";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f107813iobyxmoadg, ((ppxfxbqfkf) obj).f107813iobyxmoadg);
        }

        @Override // er0.iobyxmoadg
        public String getKey() {
            return this.f107814zoijcleaow;
        }

        public int hashCode() {
            Double d13 = this.f107813iobyxmoadg;
            if (d13 == null) {
                return 0;
            }
            return d13.hashCode();
        }

        public String toString() {
            return "OrderDeliveryPrice(newPrice=" + this.f107813iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: sp0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2651zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final pz0.iobyxmoadg f107815iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f107816zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2651zoijcleaow(pz0.iobyxmoadg deliveryData) {
            super(null);
            zdlpuopuiu.btonecajqb(deliveryData, "deliveryData");
            this.f107815iobyxmoadg = deliveryData;
            this.f107816zoijcleaow = "changeDeliveryData";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2651zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f107815iobyxmoadg, ((C2651zoijcleaow) obj).f107815iobyxmoadg);
        }

        @Override // er0.iobyxmoadg
        public String getKey() {
            return this.f107816zoijcleaow;
        }

        public int hashCode() {
            return this.f107815iobyxmoadg.hashCode();
        }

        public final pz0.iobyxmoadg iobyxmoadg() {
            return this.f107815iobyxmoadg;
        }

        public String toString() {
            return "ChangeCurrentShop(deliveryData=" + this.f107815iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
