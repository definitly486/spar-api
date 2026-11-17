package p90;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public interface zoijcleaow extends rgvfuqvkyq {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f76217iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f76218zoijcleaow;

        public iobyxmoadg(String shopId, DeliveryCode deliveryCode) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f76217iobyxmoadg = shopId;
            this.f76218zoijcleaow = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f76217iobyxmoadg, iobyxmoadgVar.f76217iobyxmoadg) && this.f76218zoijcleaow == iobyxmoadgVar.f76218zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = this.f76217iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f76218zoijcleaow;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f76218zoijcleaow;
        }

        public String toString() {
            return "Params(shopId=" + this.f76217iobyxmoadg + ", deliveryType=" + this.f76218zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f76217iobyxmoadg;
        }
    }
}
