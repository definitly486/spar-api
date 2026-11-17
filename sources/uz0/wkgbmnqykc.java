package uz0;

import java.time.LocalDateTime;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f114860iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final LocalDateTime f114861zoijcleaow;

    public wkgbmnqykc(double d13, LocalDateTime localDateTime) {
        this.f114860iobyxmoadg = d13;
        this.f114861zoijcleaow = localDateTime;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return Double.compare(this.f114860iobyxmoadg, wkgbmnqykcVar.f114860iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f114861zoijcleaow, wkgbmnqykcVar.f114861zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.f114860iobyxmoadg) * 31;
        LocalDateTime localDateTime = this.f114861zoijcleaow;
        return iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode());
    }

    public final LocalDateTime iobyxmoadg() {
        return this.f114861zoijcleaow;
    }

    public String toString() {
        return "OrderEditOrderProperties(minPrice=" + this.f114860iobyxmoadg + ", dateLeft=" + this.f114861zoijcleaow + ")";
    }

    public final double zoijcleaow() {
        return this.f114860iobyxmoadg;
    }

    public /* synthetic */ wkgbmnqykc(double d13, LocalDateTime localDateTime, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? 0.0d : d13, (i13 & 2) != 0 ? null : localDateTime);
    }
}
