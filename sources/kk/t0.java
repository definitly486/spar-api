package kk;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final boolean f58599iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final LinkedHashMap f58600zoijcleaow;

    public t0(boolean z13, LinkedHashMap notSuccessParams) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(notSuccessParams, "notSuccessParams");
        this.f58599iobyxmoadg = z13;
        this.f58600zoijcleaow = notSuccessParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f58599iobyxmoadg == t0Var.f58599iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58600zoijcleaow, t0Var.f58600zoijcleaow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z13 = this.f58599iobyxmoadg;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return this.f58600zoijcleaow.hashCode() + (r13 * 31);
    }

    public final String toString() {
        return "DeviceCheckResult(isSecure=" + this.f58599iobyxmoadg + ", notSuccessParams=" + this.f58600zoijcleaow + ")";
    }
}
