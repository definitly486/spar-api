package xg0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f122342iobyxmoadg;

    public zoijcleaow(List bannerGroups) {
        zdlpuopuiu.btonecajqb(bannerGroups, "bannerGroups");
        this.f122342iobyxmoadg = bannerGroups;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122342iobyxmoadg, ((zoijcleaow) obj).f122342iobyxmoadg);
    }

    public int hashCode() {
        return this.f122342iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f122342iobyxmoadg;
    }

    public String toString() {
        return "Banners(bannerGroups=" + this.f122342iobyxmoadg + ")";
    }
}
