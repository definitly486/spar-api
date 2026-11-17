package ur1;

import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ojitshcjhn f114263iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f114264zoijcleaow;

    public iobyxmoadg(ojitshcjhn navlink, String str) {
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        this.f114263iobyxmoadg = navlink;
        this.f114264zoijcleaow = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f114263iobyxmoadg == iobyxmoadgVar.f114263iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f114264zoijcleaow, iobyxmoadgVar.f114264zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = this.f114263iobyxmoadg.hashCode() * 31;
        String str = this.f114264zoijcleaow;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final ojitshcjhn iobyxmoadg() {
        return this.f114263iobyxmoadg;
    }

    public String toString() {
        return "ButtonNavigation(navlink=" + this.f114263iobyxmoadg + ", reference=" + this.f114264zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f114264zoijcleaow;
    }
}
