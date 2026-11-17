package t71;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg extends rgvfuqvkyq {

    /* JADX INFO: renamed from: t71.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2700iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f110028iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final DeliveryCode f110029ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f110030zoijcleaow;

        public C2700iobyxmoadg(int i13, String shopId, DeliveryCode deliveryCode) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f110028iobyxmoadg = i13;
            this.f110030zoijcleaow = shopId;
            this.f110029ppxfxbqfkf = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2700iobyxmoadg)) {
                return false;
            }
            C2700iobyxmoadg c2700iobyxmoadg = (C2700iobyxmoadg) obj;
            return this.f110028iobyxmoadg == c2700iobyxmoadg.f110028iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f110030zoijcleaow, c2700iobyxmoadg.f110030zoijcleaow) && this.f110029ppxfxbqfkf == c2700iobyxmoadg.f110029ppxfxbqfkf;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.f110028iobyxmoadg) * 31) + this.f110030zoijcleaow.hashCode()) * 31;
            DeliveryCode deliveryCode = this.f110029ppxfxbqfkf;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f110029ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f110030zoijcleaow;
        }

        public String toString() {
            return "Params(giftId=" + this.f110028iobyxmoadg + ", shopId=" + this.f110030zoijcleaow + ", deliveryType=" + this.f110029ppxfxbqfkf + ")";
        }

        public final int zoijcleaow() {
            return this.f110028iobyxmoadg;
        }
    }
}
