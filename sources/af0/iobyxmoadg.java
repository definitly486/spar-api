package af0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ppxfxbqfkf f1669eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f1670iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f1671ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f1672wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f1673zoijcleaow;

    public iobyxmoadg(long j13, String navLink, String str, zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(navLink, "navLink");
        this.f1670iobyxmoadg = j13;
        this.f1673zoijcleaow = navLink;
        this.f1671ppxfxbqfkf = str;
        this.f1672wkgbmnqykc = zoijcleaowVar;
        this.f1669eablkybsjg = ppxfxbqfkfVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f1670iobyxmoadg == iobyxmoadgVar.f1670iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f1673zoijcleaow, iobyxmoadgVar.f1673zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f1671ppxfxbqfkf, iobyxmoadgVar.f1671ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f1672wkgbmnqykc, iobyxmoadgVar.f1672wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f1669eablkybsjg, iobyxmoadgVar.f1669eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f1670iobyxmoadg) * 31) + this.f1673zoijcleaow.hashCode()) * 31;
        String str = this.f1671ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        zoijcleaow zoijcleaowVar = this.f1672wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        ppxfxbqfkf ppxfxbqfkfVar = this.f1669eablkybsjg;
        return iHashCode3 + (ppxfxbqfkfVar != null ? ppxfxbqfkfVar.hashCode() : 0);
    }

    public final zoijcleaow iobyxmoadg() {
        return this.f1672wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f1673zoijcleaow;
    }

    public String toString() {
        return "LoymaxPopup(id=" + this.f1670iobyxmoadg + ", navLink=" + this.f1673zoijcleaow + ", reference=" + this.f1671ppxfxbqfkf + ", content=" + this.f1672wkgbmnqykc + ", style=" + this.f1669eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f1671ppxfxbqfkf;
    }

    public final long zoijcleaow() {
        return this.f1670iobyxmoadg;
    }
}
