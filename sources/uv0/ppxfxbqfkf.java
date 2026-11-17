package uv0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f114483iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f114484ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DeliveryCode f114485zoijcleaow;

    public ppxfxbqfkf(String shopId, DeliveryCode deliveryCode, List productsTypes) {
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        zdlpuopuiu.btonecajqb(productsTypes, "productsTypes");
        this.f114483iobyxmoadg = shopId;
        this.f114485zoijcleaow = deliveryCode;
        this.f114484ppxfxbqfkf = productsTypes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f114483iobyxmoadg, ppxfxbqfkfVar.f114483iobyxmoadg) && this.f114485zoijcleaow == ppxfxbqfkfVar.f114485zoijcleaow && zdlpuopuiu.eablkybsjg(this.f114484ppxfxbqfkf, ppxfxbqfkfVar.f114484ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = this.f114483iobyxmoadg.hashCode() * 31;
        DeliveryCode deliveryCode = this.f114485zoijcleaow;
        return ((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f114484ppxfxbqfkf.hashCode();
    }

    public final DeliveryCode iobyxmoadg() {
        return this.f114485zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f114483iobyxmoadg;
    }

    public String toString() {
        return "SpecialProductsParams(shopId=" + this.f114483iobyxmoadg + ", deliveryCode=" + this.f114485zoijcleaow + ", productsTypes=" + this.f114484ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f114484ppxfxbqfkf;
    }
}
