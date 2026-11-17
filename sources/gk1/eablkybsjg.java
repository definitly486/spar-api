package gk1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f37757iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f37758ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f37759wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f37760zoijcleaow;

    public eablkybsjg(String id2, String name, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f37757iobyxmoadg = id2;
        this.f37760zoijcleaow = name;
        this.f37758ppxfxbqfkf = i13;
        this.f37759wkgbmnqykc = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f37757iobyxmoadg, eablkybsjgVar.f37757iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f37760zoijcleaow, eablkybsjgVar.f37760zoijcleaow) && this.f37758ppxfxbqfkf == eablkybsjgVar.f37758ppxfxbqfkf && this.f37759wkgbmnqykc == eablkybsjgVar.f37759wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f37757iobyxmoadg.hashCode() * 31) + this.f37760zoijcleaow.hashCode()) * 31) + Integer.hashCode(this.f37758ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f37759wkgbmnqykc);
    }

    public final String iobyxmoadg() {
        return this.f37757iobyxmoadg;
    }

    public final int ppxfxbqfkf() {
        return this.f37758ppxfxbqfkf;
    }

    public String toString() {
        return "SharedListDetails(id=" + this.f37757iobyxmoadg + ", name=" + this.f37760zoijcleaow + ", productsCount=" + this.f37758ppxfxbqfkf + ", isUserHasTheSamePurchaseList=" + this.f37759wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f37759wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f37760zoijcleaow;
    }
}
