package y00;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.interval.DateWithInterval;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f123495iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final DateWithInterval f123496ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DeliveryCode f123497zoijcleaow;

    public iobyxmoadg(String shopId, DeliveryCode deliveryCode, DateWithInterval dateWithInterval) {
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        this.f123495iobyxmoadg = shopId;
        this.f123497zoijcleaow = deliveryCode;
        this.f123496ppxfxbqfkf = dateWithInterval;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, DeliveryCode deliveryCode, DateWithInterval dateWithInterval, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f123495iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            deliveryCode = iobyxmoadgVar.f123497zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            dateWithInterval = iobyxmoadgVar.f123496ppxfxbqfkf;
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
        return zdlpuopuiu.eablkybsjg(this.f123495iobyxmoadg, iobyxmoadgVar.f123495iobyxmoadg) && this.f123497zoijcleaow == iobyxmoadgVar.f123497zoijcleaow && zdlpuopuiu.eablkybsjg(this.f123496ppxfxbqfkf, iobyxmoadgVar.f123496ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = this.f123495iobyxmoadg.hashCode() * 31;
        DeliveryCode deliveryCode = this.f123497zoijcleaow;
        int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
        DateWithInterval dateWithInterval = this.f123496ppxfxbqfkf;
        return iHashCode2 + (dateWithInterval != null ? dateWithInterval.hashCode() : 0);
    }

    public final iobyxmoadg iobyxmoadg(String shopId, DeliveryCode deliveryCode, DateWithInterval dateWithInterval) {
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        return new iobyxmoadg(shopId, deliveryCode, dateWithInterval);
    }

    public final DeliveryCode ppxfxbqfkf() {
        return this.f123497zoijcleaow;
    }

    public String toString() {
        return "DeliveryData(shopId=" + this.f123495iobyxmoadg + ", deliveryType=" + this.f123497zoijcleaow + ", interval=" + this.f123496ppxfxbqfkf + ")";
    }

    public final String wkgbmnqykc() {
        return this.f123495iobyxmoadg;
    }
}
