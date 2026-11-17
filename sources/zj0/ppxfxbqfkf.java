package zj0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f130278iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final DeliveryCode f130279ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f130280zoijcleaow;

    public ppxfxbqfkf(String blockId, String shopId, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(blockId, "blockId");
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        this.f130278iobyxmoadg = blockId;
        this.f130280zoijcleaow = shopId;
        this.f130279ppxfxbqfkf = deliveryCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f130278iobyxmoadg, ppxfxbqfkfVar.f130278iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f130280zoijcleaow, ppxfxbqfkfVar.f130280zoijcleaow) && this.f130279ppxfxbqfkf == ppxfxbqfkfVar.f130279ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = ((this.f130278iobyxmoadg.hashCode() * 31) + this.f130280zoijcleaow.hashCode()) * 31;
        DeliveryCode deliveryCode = this.f130279ppxfxbqfkf;
        return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f130278iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f130280zoijcleaow;
    }

    public String toString() {
        return "ProductsFromBannerArgs(blockId=" + this.f130278iobyxmoadg + ", shopId=" + this.f130280zoijcleaow + ", deliveryType=" + this.f130279ppxfxbqfkf + ")";
    }

    public final DeliveryCode zoijcleaow() {
        return this.f130279ppxfxbqfkf;
    }
}
