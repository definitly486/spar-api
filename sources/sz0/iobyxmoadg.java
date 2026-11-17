package sz0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.order.OrderDetail;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final OrderDetail f109024iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f109025ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f109026zoijcleaow;

    public iobyxmoadg(OrderDetail order, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(order, "order");
        this.f109024iobyxmoadg = order;
        this.f109026zoijcleaow = z13;
        this.f109025ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f109024iobyxmoadg, iobyxmoadgVar.f109024iobyxmoadg) && this.f109026zoijcleaow == iobyxmoadgVar.f109026zoijcleaow && this.f109025ppxfxbqfkf == iobyxmoadgVar.f109025ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f109024iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f109026zoijcleaow)) * 31) + Boolean.hashCode(this.f109025ppxfxbqfkf);
    }

    public final OrderDetail iobyxmoadg() {
        return this.f109024iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f109026zoijcleaow;
    }

    public String toString() {
        return "OrderData(order=" + this.f109024iobyxmoadg + ", isTrackingFeatureEnabled=" + this.f109026zoijcleaow + ", isPickupStatusButtonFeatureEnabled=" + this.f109025ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f109025ppxfxbqfkf;
    }
}
