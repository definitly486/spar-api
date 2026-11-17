package xg0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f122335iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f122336ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f122337wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f122338zoijcleaow;

    public ppxfxbqfkf(List bannerGroups, int i13, boolean z13, int i14) {
        zdlpuopuiu.btonecajqb(bannerGroups, "bannerGroups");
        this.f122335iobyxmoadg = bannerGroups;
        this.f122338zoijcleaow = i13;
        this.f122336ppxfxbqfkf = z13;
        this.f122337wkgbmnqykc = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f122335iobyxmoadg, ppxfxbqfkfVar.f122335iobyxmoadg) && this.f122338zoijcleaow == ppxfxbqfkfVar.f122338zoijcleaow && this.f122336ppxfxbqfkf == ppxfxbqfkfVar.f122336ppxfxbqfkf && this.f122337wkgbmnqykc == ppxfxbqfkfVar.f122337wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f122335iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f122338zoijcleaow)) * 31) + Boolean.hashCode(this.f122336ppxfxbqfkf)) * 31) + Integer.hashCode(this.f122337wkgbmnqykc);
    }

    public final int iobyxmoadg() {
        return this.f122337wkgbmnqykc;
    }

    public final int ppxfxbqfkf() {
        return this.f122338zoijcleaow;
    }

    public String toString() {
        return "BannersInfo(bannerGroups=" + this.f122335iobyxmoadg + ", discountsNew=" + this.f122338zoijcleaow + ", isRestaurantsEnable=" + this.f122336ppxfxbqfkf + ", availablePromoCurrency=" + this.f122337wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f122336ppxfxbqfkf;
    }

    public final List zoijcleaow() {
        return this.f122335iobyxmoadg;
    }
}
