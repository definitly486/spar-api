package p90;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg extends rgvfuqvkyq {

    /* JADX INFO: renamed from: p90.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1679iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f76214iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final DeliveryCode f76215ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f76216zoijcleaow;

        public C1679iobyxmoadg(int i13, String shopId, DeliveryCode deliveryCode) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f76214iobyxmoadg = i13;
            this.f76216zoijcleaow = shopId;
            this.f76215ppxfxbqfkf = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1679iobyxmoadg)) {
                return false;
            }
            C1679iobyxmoadg c1679iobyxmoadg = (C1679iobyxmoadg) obj;
            return this.f76214iobyxmoadg == c1679iobyxmoadg.f76214iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f76216zoijcleaow, c1679iobyxmoadg.f76216zoijcleaow) && this.f76215ppxfxbqfkf == c1679iobyxmoadg.f76215ppxfxbqfkf;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.f76214iobyxmoadg) * 31) + this.f76216zoijcleaow.hashCode()) * 31;
            DeliveryCode deliveryCode = this.f76215ppxfxbqfkf;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f76215ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f76216zoijcleaow;
        }

        public String toString() {
            return "Params(giftId=" + this.f76214iobyxmoadg + ", shopId=" + this.f76216zoijcleaow + ", deliveryType=" + this.f76215ppxfxbqfkf + ")";
        }

        public final int zoijcleaow() {
            return this.f76214iobyxmoadg;
        }
    }
}
