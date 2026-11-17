package e10;

import java.time.LocalDateTime;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f30210iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final LocalDateTime f30211zoijcleaow;

    public wkgbmnqykc(double d13, LocalDateTime localDateTime) {
        this.f30210iobyxmoadg = d13;
        this.f30211zoijcleaow = localDateTime;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return Double.compare(this.f30210iobyxmoadg, wkgbmnqykcVar.f30210iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f30211zoijcleaow, wkgbmnqykcVar.f30211zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.f30210iobyxmoadg) * 31;
        LocalDateTime localDateTime = this.f30211zoijcleaow;
        return iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode());
    }

    public final LocalDateTime iobyxmoadg() {
        return this.f30211zoijcleaow;
    }

    public String toString() {
        return "OrderEditOrderProperties(minPrice=" + this.f30210iobyxmoadg + ", dateLeft=" + this.f30211zoijcleaow + ")";
    }

    public final double zoijcleaow() {
        return this.f30210iobyxmoadg;
    }

    public /* synthetic */ wkgbmnqykc(double d13, LocalDateTime localDateTime, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? 0.0d : d13, (i13 & 2) != 0 ? null : localDateTime);
    }
}
