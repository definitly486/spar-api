package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class eg0 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final boolean f56418eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final vu f56419iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f56420ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final boolean f56421wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f56422zoijcleaow;

    public eg0(vu title, long j13, String currency, boolean z13, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(currency, "currency");
        this.f56419iobyxmoadg = title;
        this.f56422zoijcleaow = j13;
        this.f56420ppxfxbqfkf = currency;
        this.f56421wkgbmnqykc = z13;
        this.f56418eablkybsjg = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg0)) {
            return false;
        }
        eg0 eg0Var = (eg0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56419iobyxmoadg, eg0Var.f56419iobyxmoadg) && this.f56422zoijcleaow == eg0Var.f56422zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56420ppxfxbqfkf, eg0Var.f56420ppxfxbqfkf) && this.f56421wkgbmnqykc == eg0Var.f56421wkgbmnqykc && this.f56418eablkybsjg == eg0Var.f56418eablkybsjg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final int hashCode() {
        int iIobyxmoadg = xg.iobyxmoadg(this.f56420ppxfxbqfkf, (Long.hashCode(this.f56422zoijcleaow) + (this.f56419iobyxmoadg.hashCode() * 31)) * 31, 31);
        boolean z13 = this.f56421wkgbmnqykc;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (iIobyxmoadg + r13) * 31;
        boolean z14 = this.f56418eablkybsjg;
        return i13 + (z14 ? 1 : z14);
    }

    public final String toString() {
        return "BnplGraphStep(title=" + this.f56419iobyxmoadg + ", amount=" + this.f56422zoijcleaow + ", currency=" + this.f56420ppxfxbqfkf + ", isBold=" + this.f56421wkgbmnqykc + ", isLast=" + this.f56418eablkybsjg + ")";
    }
}
