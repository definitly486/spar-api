package ik0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes3.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f44654iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final DeliveryCode f44655ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f44656zoijcleaow;

        public iobyxmoadg(String blockId, String shopId, DeliveryCode deliveryCode) {
            zdlpuopuiu.btonecajqb(blockId, "blockId");
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f44654iobyxmoadg = blockId;
            this.f44656zoijcleaow = shopId;
            this.f44655ppxfxbqfkf = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f44654iobyxmoadg, iobyxmoadgVar.f44654iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f44656zoijcleaow, iobyxmoadgVar.f44656zoijcleaow) && this.f44655ppxfxbqfkf == iobyxmoadgVar.f44655ppxfxbqfkf;
        }

        public int hashCode() {
            int iHashCode = ((this.f44654iobyxmoadg.hashCode() * 31) + this.f44656zoijcleaow.hashCode()) * 31;
            DeliveryCode deliveryCode = this.f44655ppxfxbqfkf;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f44654iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f44656zoijcleaow;
        }

        public String toString() {
            return "Init(blockId=" + this.f44654iobyxmoadg + ", shopId=" + this.f44656zoijcleaow + ", deliveryType=" + this.f44655ppxfxbqfkf + ")";
        }

        public final DeliveryCode zoijcleaow() {
            return this.f44655ppxfxbqfkf;
        }
    }
}
