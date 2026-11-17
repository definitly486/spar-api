package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class qo extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final gl f58219iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final boolean f58220ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final sh0 f58221zoijcleaow;

    public qo(gl mode, sh0 sh0Var) {
        boolean z13 = sh0Var != null;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        this.f58219iobyxmoadg = mode;
        this.f58221zoijcleaow = sh0Var;
        this.f58220ppxfxbqfkf = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo)) {
            return false;
        }
        qo qoVar = (qo) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58219iobyxmoadg, qoVar.f58219iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58221zoijcleaow, qoVar.f58221zoijcleaow) && this.f58220ppxfxbqfkf == qoVar.f58220ppxfxbqfkf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = this.f58219iobyxmoadg.hashCode() * 31;
        sh0 sh0Var = this.f58221zoijcleaow;
        int iHashCode2 = (iHashCode + (sh0Var == null ? 0 : sh0Var.hashCode())) * 31;
        boolean z13 = this.f58220ppxfxbqfkf;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode2 + r13;
    }

    public final String toString() {
        return "AskForFullEmission(mode=" + this.f58219iobyxmoadg + ", authResult=" + this.f58221zoijcleaow + ", isTokenRenewNeeded=" + this.f58220ppxfxbqfkf + ")";
    }
}
