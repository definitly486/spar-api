package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class le0 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final gl f57463iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final boolean f57464ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f57465zoijcleaow;

    public le0(gl mode, String str, boolean z13, int i13) {
        str = (i13 & 2) != 0 ? null : str;
        z13 = (i13 & 4) != 0 ? false : z13;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        this.f57463iobyxmoadg = mode;
        this.f57465zoijcleaow = str;
        this.f57464ppxfxbqfkf = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le0)) {
            return false;
        }
        le0 le0Var = (le0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57463iobyxmoadg, le0Var.f57463iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57465zoijcleaow, le0Var.f57465zoijcleaow) && this.f57464ppxfxbqfkf == le0Var.f57464ppxfxbqfkf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = this.f57463iobyxmoadg.hashCode() * 31;
        String str = this.f57465zoijcleaow;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z13 = this.f57464ppxfxbqfkf;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode2 + r13;
    }

    public final String toString() {
        return "OrderScreenData(mode=" + this.f57463iobyxmoadg + ", uri=" + this.f57465zoijcleaow + ", dropSelectedCardForBnpl=" + this.f57464ppxfxbqfkf + ")";
    }
}
