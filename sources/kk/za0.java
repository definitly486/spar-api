package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class za0 extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final gl f59557iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final boolean f59558ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final sh0 f59559zoijcleaow;

    public za0(gl mode, sh0 sh0Var, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        this.f59557iobyxmoadg = mode;
        this.f59559zoijcleaow = sh0Var;
        this.f59558ppxfxbqfkf = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za0)) {
            return false;
        }
        za0 za0Var = (za0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59557iobyxmoadg, za0Var.f59557iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59559zoijcleaow, za0Var.f59559zoijcleaow) && this.f59558ppxfxbqfkf == za0Var.f59558ppxfxbqfkf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = this.f59557iobyxmoadg.hashCode() * 31;
        sh0 sh0Var = this.f59559zoijcleaow;
        int iHashCode2 = (iHashCode + (sh0Var == null ? 0 : sh0Var.hashCode())) * 31;
        boolean z13 = this.f59558ppxfxbqfkf;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode2 + r13;
    }

    public final String toString() {
        return "AskForFullEmission(mode=" + this.f59557iobyxmoadg + ", authResult=" + this.f59559zoijcleaow + ", isTokenRenewNeeded=" + this.f59558ppxfxbqfkf + ")";
    }
}
