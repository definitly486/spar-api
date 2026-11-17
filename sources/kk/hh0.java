package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class hh0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final boolean f56919iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Integer f56920zoijcleaow;

    public hh0() {
        this.f56919iobyxmoadg = true;
        this.f56920zoijcleaow = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh0)) {
            return false;
        }
        hh0 hh0Var = (hh0) obj;
        return this.f56919iobyxmoadg == hh0Var.f56919iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56920zoijcleaow, hh0Var.f56920zoijcleaow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z13 = this.f56919iobyxmoadg;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = r13 * 31;
        Integer num = this.f56920zoijcleaow;
        return i13 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "WithdrawBonuses(isOn=" + this.f56919iobyxmoadg + ", amount=" + this.f56920zoijcleaow + ")";
    }

    public hh0(boolean z13, Integer num) {
        this.f56919iobyxmoadg = z13;
        this.f56920zoijcleaow = num;
    }
}
