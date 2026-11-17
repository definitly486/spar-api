package b62;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final f40.zoijcleaow f15409iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f15410zoijcleaow;

    public iobyxmoadg(f40.zoijcleaow navlink, String str) {
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        this.f15409iobyxmoadg = navlink;
        this.f15410zoijcleaow = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f15409iobyxmoadg == iobyxmoadgVar.f15409iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f15410zoijcleaow, iobyxmoadgVar.f15410zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = this.f15409iobyxmoadg.hashCode() * 31;
        String str = this.f15410zoijcleaow;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final f40.zoijcleaow iobyxmoadg() {
        return this.f15409iobyxmoadg;
    }

    public String toString() {
        return "ButtonNavigation(navlink=" + this.f15409iobyxmoadg + ", reference=" + this.f15410zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f15410zoijcleaow;
    }
}
