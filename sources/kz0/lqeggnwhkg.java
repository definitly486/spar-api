package kz0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f61170iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DeliveryCode f61171zoijcleaow;

    public lqeggnwhkg(String shopId, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        this.f61170iobyxmoadg = shopId;
        this.f61171zoijcleaow = deliveryCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f61170iobyxmoadg, lqeggnwhkgVar.f61170iobyxmoadg) && this.f61171zoijcleaow == lqeggnwhkgVar.f61171zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = this.f61170iobyxmoadg.hashCode() * 31;
        DeliveryCode deliveryCode = this.f61171zoijcleaow;
        return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
    }

    public final DeliveryCode iobyxmoadg() {
        return this.f61171zoijcleaow;
    }

    public String toString() {
        return "OrderCommentParams(shopId=" + this.f61170iobyxmoadg + ", delivery=" + this.f61171zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f61170iobyxmoadg;
    }
}
