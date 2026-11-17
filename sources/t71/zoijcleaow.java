package t71;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow extends rgvfuqvkyq {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f110031iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f110032zoijcleaow;

        public iobyxmoadg(String shopId, DeliveryCode deliveryCode) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f110031iobyxmoadg = shopId;
            this.f110032zoijcleaow = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f110031iobyxmoadg, iobyxmoadgVar.f110031iobyxmoadg) && this.f110032zoijcleaow == iobyxmoadgVar.f110032zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = this.f110031iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f110032zoijcleaow;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f110032zoijcleaow;
        }

        public String toString() {
            return "Params(shopId=" + this.f110031iobyxmoadg + ", deliveryType=" + this.f110032zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f110031iobyxmoadg;
        }
    }
}
