package c11;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.order.OrderStatus;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends zr0.zoijcleaow {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18518iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final OrderStatus f18519ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final sz0.eablkybsjg f18520wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f18521zoijcleaow;

        public iobyxmoadg(String orderPhone, DeliveryCode deliveryCode, OrderStatus orderStatus, sz0.eablkybsjg orderServerStatus) {
            zdlpuopuiu.btonecajqb(orderPhone, "orderPhone");
            zdlpuopuiu.btonecajqb(orderStatus, "orderStatus");
            zdlpuopuiu.btonecajqb(orderServerStatus, "orderServerStatus");
            this.f18518iobyxmoadg = orderPhone;
            this.f18521zoijcleaow = deliveryCode;
            this.f18519ppxfxbqfkf = orderStatus;
            this.f18520wkgbmnqykc = orderServerStatus;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f18518iobyxmoadg, iobyxmoadgVar.f18518iobyxmoadg) && this.f18521zoijcleaow == iobyxmoadgVar.f18521zoijcleaow && this.f18519ppxfxbqfkf == iobyxmoadgVar.f18519ppxfxbqfkf && this.f18520wkgbmnqykc == iobyxmoadgVar.f18520wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = this.f18518iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f18521zoijcleaow;
            return ((((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f18519ppxfxbqfkf.hashCode()) * 31) + this.f18520wkgbmnqykc.hashCode();
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f18521zoijcleaow;
        }

        public final sz0.eablkybsjg ppxfxbqfkf() {
            return this.f18520wkgbmnqykc;
        }

        public String toString() {
            return "Params(orderPhone=" + this.f18518iobyxmoadg + ", orderDeliveryCode=" + this.f18521zoijcleaow + ", orderStatus=" + this.f18519ppxfxbqfkf + ", orderServerStatus=" + this.f18520wkgbmnqykc + ")";
        }

        public final OrderStatus wkgbmnqykc() {
            return this.f18519ppxfxbqfkf;
        }

        public final String zoijcleaow() {
            return this.f18518iobyxmoadg;
        }
    }

    private final boolean ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar.wkgbmnqykc() == OrderStatus.READY && (iobyxmoadgVar.iobyxmoadg() == DeliveryCode.PICKUP);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.zoijcleaow
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Boolean iobyxmoadg(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        sz0.eablkybsjg eablkybsjgVarPpxfxbqfkf = parameters.ppxfxbqfkf();
        boolean z13 = false;
        boolean z14 = parameters.zoijcleaow().length() > 0;
        boolean z15 = eablkybsjgVarPpxfxbqfkf == sz0.eablkybsjg.CURRENT;
        if (ppxfxbqfkf(parameters) && z14 && z15) {
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }
}
