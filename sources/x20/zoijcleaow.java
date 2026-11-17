package x20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.order.Order;
import ru.myspar.core.domain.models.order.OrderStatus;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Order f121042iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final c10.gxszxtbevo f121043zoijcleaow;

        public iobyxmoadg(Order order, c10.gxszxtbevo orderServerStatus) {
            zdlpuopuiu.btonecajqb(order, "order");
            zdlpuopuiu.btonecajqb(orderServerStatus, "orderServerStatus");
            this.f121042iobyxmoadg = order;
            this.f121043zoijcleaow = orderServerStatus;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f121042iobyxmoadg, iobyxmoadgVar.f121042iobyxmoadg) && this.f121043zoijcleaow == iobyxmoadgVar.f121043zoijcleaow;
        }

        public int hashCode() {
            return (this.f121042iobyxmoadg.hashCode() * 31) + this.f121043zoijcleaow.hashCode();
        }

        public final Order iobyxmoadg() {
            return this.f121042iobyxmoadg;
        }

        public String toString() {
            return "Params(order=" + this.f121042iobyxmoadg + ", orderServerStatus=" + this.f121043zoijcleaow + ")";
        }

        public final c10.gxszxtbevo zoijcleaow() {
            return this.f121043zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
    }

    private final boolean ppxfxbqfkf(Order order) {
        return order.getOrdersStatus() == OrderStatus.READY && (order.getDelivery().getCode() == DeliveryCode.PICKUP);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        Order orderIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        c10.gxszxtbevo gxszxtbevoVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
        boolean z13 = false;
        boolean z14 = orderIobyxmoadg.getDelivery().getPhone().length() > 0;
        boolean z15 = gxszxtbevoVarZoijcleaow == c10.gxszxtbevo.CURRENT;
        if (ppxfxbqfkf(orderIobyxmoadg) && z14 && z15) {
            z13 = true;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }
}
