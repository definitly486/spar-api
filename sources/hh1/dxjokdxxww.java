package hh1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f40356iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f40357zoijcleaow;

    public dxjokdxxww(List bannerGroups, boolean z13) {
        zdlpuopuiu.btonecajqb(bannerGroups, "bannerGroups");
        this.f40356iobyxmoadg = bannerGroups;
        this.f40357zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f40356iobyxmoadg, dxjokdxxwwVar.f40356iobyxmoadg) && this.f40357zoijcleaow == dxjokdxxwwVar.f40357zoijcleaow;
    }

    public int hashCode() {
        return (this.f40356iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f40357zoijcleaow);
    }

    public final List iobyxmoadg() {
        return this.f40356iobyxmoadg;
    }

    public String toString() {
        return "BannersInfo(bannerGroups=" + this.f40356iobyxmoadg + ", isRestaurantsEnable=" + this.f40357zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f40357zoijcleaow;
    }
}
