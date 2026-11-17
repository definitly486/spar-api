package we0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f119453eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f119454iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f119455ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f119456wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f119457zoijcleaow;

    public zoijcleaow(String id2, String name, String str, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f119454iobyxmoadg = id2;
        this.f119457zoijcleaow = name;
        this.f119455ppxfxbqfkf = str;
        this.f119456wkgbmnqykc = z13;
        this.f119453eablkybsjg = z14;
    }

    public final boolean eablkybsjg() {
        return this.f119456wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f119454iobyxmoadg, zoijcleaowVar.f119454iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f119457zoijcleaow, zoijcleaowVar.f119457zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f119455ppxfxbqfkf, zoijcleaowVar.f119455ppxfxbqfkf) && this.f119456wkgbmnqykc == zoijcleaowVar.f119456wkgbmnqykc && this.f119453eablkybsjg == zoijcleaowVar.f119453eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((this.f119454iobyxmoadg.hashCode() * 31) + this.f119457zoijcleaow.hashCode()) * 31;
        String str = this.f119455ppxfxbqfkf;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f119456wkgbmnqykc)) * 31) + Boolean.hashCode(this.f119453eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f119454iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f119453eablkybsjg;
    }

    public String toString() {
        return "CategoryUiModel(id=" + this.f119454iobyxmoadg + ", name=" + this.f119457zoijcleaow + ", imageUrl=" + this.f119455ppxfxbqfkf + ", isSelected=" + this.f119456wkgbmnqykc + ", infoIsVisible=" + this.f119453eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f119457zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f119455ppxfxbqfkf;
    }
}
