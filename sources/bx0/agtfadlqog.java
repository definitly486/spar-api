package bx0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f17229eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f17230iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f17231ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f17232wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f17233zoijcleaow;

    public agtfadlqog(String title, String str, String str2, String str3, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f17230iobyxmoadg = title;
        this.f17233zoijcleaow = str;
        this.f17231ppxfxbqfkf = str2;
        this.f17232wkgbmnqykc = str3;
        this.f17229eablkybsjg = z13;
    }

    public final boolean eablkybsjg() {
        return this.f17229eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return zdlpuopuiu.eablkybsjg(this.f17230iobyxmoadg, agtfadlqogVar.f17230iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f17233zoijcleaow, agtfadlqogVar.f17233zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f17231ppxfxbqfkf, agtfadlqogVar.f17231ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f17232wkgbmnqykc, agtfadlqogVar.f17232wkgbmnqykc) && this.f17229eablkybsjg == agtfadlqogVar.f17229eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = this.f17230iobyxmoadg.hashCode() * 31;
        String str = this.f17233zoijcleaow;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17231ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17232wkgbmnqykc;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.f17229eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f17231ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f17232wkgbmnqykc;
    }

    public String toString() {
        return "IntervalInfoEntity(title=" + this.f17230iobyxmoadg + ", subtitle=" + this.f17233zoijcleaow + ", date=" + this.f17231ppxfxbqfkf + ", time=" + this.f17232wkgbmnqykc + ", isOnlyOne=" + this.f17229eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f17230iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f17233zoijcleaow;
    }
}
