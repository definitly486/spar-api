package c10;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.order.Order;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Order f18466iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f18467ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f18468zoijcleaow;

    public iobyxmoadg(Order order, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(order, "order");
        this.f18466iobyxmoadg = order;
        this.f18468zoijcleaow = z13;
        this.f18467ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f18466iobyxmoadg, iobyxmoadgVar.f18466iobyxmoadg) && this.f18468zoijcleaow == iobyxmoadgVar.f18468zoijcleaow && this.f18467ppxfxbqfkf == iobyxmoadgVar.f18467ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f18466iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f18468zoijcleaow)) * 31) + Boolean.hashCode(this.f18467ppxfxbqfkf);
    }

    public final Order iobyxmoadg() {
        return this.f18466iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f18468zoijcleaow;
    }

    public String toString() {
        return "OrderData(order=" + this.f18466iobyxmoadg + ", isTrackingFeatureEnabled=" + this.f18468zoijcleaow + ", isPickupStatusButtonFeatureEnabled=" + this.f18467ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f18467ppxfxbqfkf;
    }
}
