package ba2;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f15598iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f15599ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f15600wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f15601zoijcleaow;

    public lqeggnwhkg(long j13, String title, String str, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f15598iobyxmoadg = j13;
        this.f15601zoijcleaow = title;
        this.f15599ppxfxbqfkf = str;
        this.f15600wkgbmnqykc = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f15598iobyxmoadg == lqeggnwhkgVar.f15598iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f15601zoijcleaow, lqeggnwhkgVar.f15601zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f15599ppxfxbqfkf, lqeggnwhkgVar.f15599ppxfxbqfkf) && this.f15600wkgbmnqykc == lqeggnwhkgVar.f15600wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f15598iobyxmoadg) * 31) + this.f15601zoijcleaow.hashCode()) * 31;
        String str = this.f15599ppxfxbqfkf;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f15600wkgbmnqykc);
    }

    public final long iobyxmoadg() {
        return this.f15598iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f15601zoijcleaow;
    }

    public String toString() {
        return "TipOptionUiModel(id=" + this.f15598iobyxmoadg + ", title=" + this.f15601zoijcleaow + ", subtitle=" + this.f15599ppxfxbqfkf + ", isSelected=" + this.f15600wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f15600wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f15599ppxfxbqfkf;
    }
}
