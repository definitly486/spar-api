package ax;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f14657iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f14658ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DeliveryCode f14659zoijcleaow;

    public ppxfxbqfkf(String shopId, DeliveryCode deliveryCode, List productsTypes) {
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        zdlpuopuiu.btonecajqb(productsTypes, "productsTypes");
        this.f14657iobyxmoadg = shopId;
        this.f14659zoijcleaow = deliveryCode;
        this.f14658ppxfxbqfkf = productsTypes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f14657iobyxmoadg, ppxfxbqfkfVar.f14657iobyxmoadg) && this.f14659zoijcleaow == ppxfxbqfkfVar.f14659zoijcleaow && zdlpuopuiu.eablkybsjg(this.f14658ppxfxbqfkf, ppxfxbqfkfVar.f14658ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = this.f14657iobyxmoadg.hashCode() * 31;
        DeliveryCode deliveryCode = this.f14659zoijcleaow;
        return ((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f14658ppxfxbqfkf.hashCode();
    }

    public final DeliveryCode iobyxmoadg() {
        return this.f14659zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f14657iobyxmoadg;
    }

    public String toString() {
        return "SpecialProductsParams(shopId=" + this.f14657iobyxmoadg + ", deliveryCode=" + this.f14659zoijcleaow + ", productsTypes=" + this.f14658ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f14658ppxfxbqfkf;
    }
}
