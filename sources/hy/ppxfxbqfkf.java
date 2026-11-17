package hy;

import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements h60.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f41315iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final LocalDateTime f41316zoijcleaow;

    public ppxfxbqfkf(double d13, LocalDateTime localDateTime) {
        this.f41315iobyxmoadg = d13;
        this.f41316zoijcleaow = localDateTime;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return Double.compare(this.f41315iobyxmoadg, ppxfxbqfkfVar.f41315iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f41316zoijcleaow, ppxfxbqfkfVar.f41316zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.f41315iobyxmoadg) * 31;
        LocalDateTime localDateTime = this.f41316zoijcleaow;
        return iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode());
    }

    public final LocalDateTime iobyxmoadg() {
        return this.f41316zoijcleaow;
    }

    public String toString() {
        return "OrderEditOrderPropertiesEntity(minPrice=" + this.f41315iobyxmoadg + ", dateLeft=" + this.f41316zoijcleaow + ")";
    }

    public final double zoijcleaow() {
        return this.f41315iobyxmoadg;
    }
}
