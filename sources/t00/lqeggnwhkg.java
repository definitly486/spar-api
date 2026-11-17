package t00;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f109228iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DeliveryCode f109229zoijcleaow;

    public lqeggnwhkg(String shopId, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        this.f109228iobyxmoadg = shopId;
        this.f109229zoijcleaow = deliveryCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f109228iobyxmoadg, lqeggnwhkgVar.f109228iobyxmoadg) && this.f109229zoijcleaow == lqeggnwhkgVar.f109229zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = this.f109228iobyxmoadg.hashCode() * 31;
        DeliveryCode deliveryCode = this.f109229zoijcleaow;
        return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
    }

    public final DeliveryCode iobyxmoadg() {
        return this.f109229zoijcleaow;
    }

    public String toString() {
        return "OrderCommentParams(shopId=" + this.f109228iobyxmoadg + ", delivery=" + this.f109229zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f109228iobyxmoadg;
    }
}
