package pz0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.interval.DateWithInterval;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f77558iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final DateWithInterval f77559ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DeliveryCode f77560zoijcleaow;

    public iobyxmoadg(String shopId, DeliveryCode deliveryCode, DateWithInterval dateWithInterval) {
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        this.f77558iobyxmoadg = shopId;
        this.f77560zoijcleaow = deliveryCode;
        this.f77559ppxfxbqfkf = dateWithInterval;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, DeliveryCode deliveryCode, DateWithInterval dateWithInterval, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f77558iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            deliveryCode = iobyxmoadgVar.f77560zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            dateWithInterval = iobyxmoadgVar.f77559ppxfxbqfkf;
        }
        return iobyxmoadgVar.iobyxmoadg(str, deliveryCode, dateWithInterval);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f77558iobyxmoadg, iobyxmoadgVar.f77558iobyxmoadg) && this.f77560zoijcleaow == iobyxmoadgVar.f77560zoijcleaow && zdlpuopuiu.eablkybsjg(this.f77559ppxfxbqfkf, iobyxmoadgVar.f77559ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = this.f77558iobyxmoadg.hashCode() * 31;
        DeliveryCode deliveryCode = this.f77560zoijcleaow;
        int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
        DateWithInterval dateWithInterval = this.f77559ppxfxbqfkf;
        return iHashCode2 + (dateWithInterval != null ? dateWithInterval.hashCode() : 0);
    }

    public final iobyxmoadg iobyxmoadg(String shopId, DeliveryCode deliveryCode, DateWithInterval dateWithInterval) {
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        return new iobyxmoadg(shopId, deliveryCode, dateWithInterval);
    }

    public final DeliveryCode ppxfxbqfkf() {
        return this.f77560zoijcleaow;
    }

    public String toString() {
        return "DeliveryData(shopId=" + this.f77558iobyxmoadg + ", deliveryType=" + this.f77560zoijcleaow + ", interval=" + this.f77559ppxfxbqfkf + ")";
    }

    public final String wkgbmnqykc() {
        return this.f77558iobyxmoadg;
    }
}
