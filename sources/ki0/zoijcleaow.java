package ki0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f55707iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f55708ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Long f55709wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f55710zoijcleaow;

    public zoijcleaow(String itemId, boolean z13, int i13, Long l13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        this.f55707iobyxmoadg = itemId;
        this.f55710zoijcleaow = z13;
        this.f55708ppxfxbqfkf = i13;
        this.f55709wkgbmnqykc = l13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f55707iobyxmoadg, zoijcleaowVar.f55707iobyxmoadg) && this.f55710zoijcleaow == zoijcleaowVar.f55710zoijcleaow && this.f55708ppxfxbqfkf == zoijcleaowVar.f55708ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f55709wkgbmnqykc, zoijcleaowVar.f55709wkgbmnqykc);
    }

    @Override // ki0.wkgbmnqykc
    public String getItemId() {
        return this.f55707iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = ((((this.f55707iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f55710zoijcleaow)) * 31) + Integer.hashCode(this.f55708ppxfxbqfkf)) * 31;
        Long l13 = this.f55709wkgbmnqykc;
        return iHashCode + (l13 == null ? 0 : l13.hashCode());
    }

    public int iobyxmoadg() {
        return this.f55708ppxfxbqfkf;
    }

    public boolean ppxfxbqfkf() {
        return this.f55710zoijcleaow;
    }

    public String toString() {
        return "Time(itemId=" + this.f55707iobyxmoadg + ", isOpen=" + this.f55710zoijcleaow + ", count=" + this.f55708ppxfxbqfkf + ", duration=" + this.f55709wkgbmnqykc + ")";
    }

    public final Long zoijcleaow() {
        return this.f55709wkgbmnqykc;
    }
}
