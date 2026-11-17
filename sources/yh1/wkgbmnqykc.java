package yh1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125233iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final DeliveryCode f125234ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f125235zoijcleaow;

        public iobyxmoadg(String blockId, String shopId, DeliveryCode deliveryCode) {
            zdlpuopuiu.btonecajqb(blockId, "blockId");
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f125233iobyxmoadg = blockId;
            this.f125235zoijcleaow = shopId;
            this.f125234ppxfxbqfkf = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f125233iobyxmoadg, iobyxmoadgVar.f125233iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f125235zoijcleaow, iobyxmoadgVar.f125235zoijcleaow) && this.f125234ppxfxbqfkf == iobyxmoadgVar.f125234ppxfxbqfkf;
        }

        public int hashCode() {
            int iHashCode = ((this.f125233iobyxmoadg.hashCode() * 31) + this.f125235zoijcleaow.hashCode()) * 31;
            DeliveryCode deliveryCode = this.f125234ppxfxbqfkf;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f125233iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f125235zoijcleaow;
        }

        public String toString() {
            return "Init(blockId=" + this.f125233iobyxmoadg + ", shopId=" + this.f125235zoijcleaow + ", deliveryType=" + this.f125234ppxfxbqfkf + ")";
        }

        public final DeliveryCode zoijcleaow() {
            return this.f125234ppxfxbqfkf;
        }
    }
}
