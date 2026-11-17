package rc1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f82535eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f82536iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f82537ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f82538wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f82539zoijcleaow;

    public zoijcleaow(String id2, String name, String str, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f82536iobyxmoadg = id2;
        this.f82539zoijcleaow = name;
        this.f82537ppxfxbqfkf = str;
        this.f82538wkgbmnqykc = z13;
        this.f82535eablkybsjg = z14;
    }

    public final boolean eablkybsjg() {
        return this.f82538wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f82536iobyxmoadg, zoijcleaowVar.f82536iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f82539zoijcleaow, zoijcleaowVar.f82539zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f82537ppxfxbqfkf, zoijcleaowVar.f82537ppxfxbqfkf) && this.f82538wkgbmnqykc == zoijcleaowVar.f82538wkgbmnqykc && this.f82535eablkybsjg == zoijcleaowVar.f82535eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((this.f82536iobyxmoadg.hashCode() * 31) + this.f82539zoijcleaow.hashCode()) * 31;
        String str = this.f82537ppxfxbqfkf;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f82538wkgbmnqykc)) * 31) + Boolean.hashCode(this.f82535eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f82536iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f82535eablkybsjg;
    }

    public String toString() {
        return "CategoryUiModel(id=" + this.f82536iobyxmoadg + ", name=" + this.f82539zoijcleaow + ", imageUrl=" + this.f82537ppxfxbqfkf + ", isSelected=" + this.f82538wkgbmnqykc + ", infoIsVisible=" + this.f82535eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f82539zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f82537ppxfxbqfkf;
    }
}
