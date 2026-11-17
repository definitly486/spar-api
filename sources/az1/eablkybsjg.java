package az1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f14811iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f14812ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f14813wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f14814zoijcleaow;

    public eablkybsjg(String id2, String name, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f14811iobyxmoadg = id2;
        this.f14814zoijcleaow = name;
        this.f14812ppxfxbqfkf = i13;
        this.f14813wkgbmnqykc = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f14811iobyxmoadg, eablkybsjgVar.f14811iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14814zoijcleaow, eablkybsjgVar.f14814zoijcleaow) && this.f14812ppxfxbqfkf == eablkybsjgVar.f14812ppxfxbqfkf && this.f14813wkgbmnqykc == eablkybsjgVar.f14813wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f14811iobyxmoadg.hashCode() * 31) + this.f14814zoijcleaow.hashCode()) * 31) + Integer.hashCode(this.f14812ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f14813wkgbmnqykc);
    }

    public final String iobyxmoadg() {
        return this.f14811iobyxmoadg;
    }

    public final int ppxfxbqfkf() {
        return this.f14812ppxfxbqfkf;
    }

    public String toString() {
        return "SharedListDetails(id=" + this.f14811iobyxmoadg + ", name=" + this.f14814zoijcleaow + ", productsCount=" + this.f14812ppxfxbqfkf + ", isUserHasTheSamePurchaseList=" + this.f14813wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f14813wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f14814zoijcleaow;
    }
}
