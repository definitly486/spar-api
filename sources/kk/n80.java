package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class n80 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final boolean f57744iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Integer f57745zoijcleaow;

    public n80(boolean z13, Integer num) {
        this.f57744iobyxmoadg = z13;
        this.f57745zoijcleaow = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n80)) {
            return false;
        }
        n80 n80Var = (n80) obj;
        return this.f57744iobyxmoadg == n80Var.f57744iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57745zoijcleaow, n80Var.f57745zoijcleaow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z13 = this.f57744iobyxmoadg;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = r13 * 31;
        Integer num = this.f57745zoijcleaow;
        return i13 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "BonusesInfo(isSpasiboEnabled=" + this.f57744iobyxmoadg + ", count=" + this.f57745zoijcleaow + ")";
    }
}
