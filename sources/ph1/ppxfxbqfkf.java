package ph1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f76638iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final DeliveryCode f76639ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f76640zoijcleaow;

    public ppxfxbqfkf(String blockId, String shopId, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(blockId, "blockId");
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        this.f76638iobyxmoadg = blockId;
        this.f76640zoijcleaow = shopId;
        this.f76639ppxfxbqfkf = deliveryCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f76638iobyxmoadg, ppxfxbqfkfVar.f76638iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f76640zoijcleaow, ppxfxbqfkfVar.f76640zoijcleaow) && this.f76639ppxfxbqfkf == ppxfxbqfkfVar.f76639ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = ((this.f76638iobyxmoadg.hashCode() * 31) + this.f76640zoijcleaow.hashCode()) * 31;
        DeliveryCode deliveryCode = this.f76639ppxfxbqfkf;
        return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f76638iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f76640zoijcleaow;
    }

    public String toString() {
        return "ProductsFromBannerArgs(blockId=" + this.f76638iobyxmoadg + ", shopId=" + this.f76640zoijcleaow + ", deliveryType=" + this.f76639ppxfxbqfkf + ")";
    }

    public final DeliveryCode zoijcleaow() {
        return this.f76639ppxfxbqfkf;
    }
}
