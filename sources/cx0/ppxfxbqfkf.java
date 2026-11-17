package cx0;

import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f26060iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final LocalDateTime f26061zoijcleaow;

    public ppxfxbqfkf(double d13, LocalDateTime localDateTime) {
        this.f26060iobyxmoadg = d13;
        this.f26061zoijcleaow = localDateTime;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return Double.compare(this.f26060iobyxmoadg, ppxfxbqfkfVar.f26060iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f26061zoijcleaow, ppxfxbqfkfVar.f26061zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.f26060iobyxmoadg) * 31;
        LocalDateTime localDateTime = this.f26061zoijcleaow;
        return iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode());
    }

    public final LocalDateTime iobyxmoadg() {
        return this.f26061zoijcleaow;
    }

    public String toString() {
        return "OrderEditOrderPropertiesEntity(minPrice=" + this.f26060iobyxmoadg + ", dateLeft=" + this.f26061zoijcleaow + ")";
    }

    public final double zoijcleaow() {
        return this.f26060iobyxmoadg;
    }
}
