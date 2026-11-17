package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements sh0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Object f59357iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final boolean f59358ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f59359zoijcleaow;

    public y0(dh0 dh0Var, String str, boolean z13, int i13) {
        dh0Var = (i13 & 1) != 0 ? null : dh0Var;
        str = (i13 & 2) != 0 ? null : str;
        this.f59357iobyxmoadg = dh0Var;
        this.f59359zoijcleaow = str;
        this.f59358ppxfxbqfkf = z13;
    }

    @Override // kk.sh0
    public final boolean a() {
        return this.f59358ppxfxbqfkf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59357iobyxmoadg, y0Var.f59357iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59359zoijcleaow, y0Var.f59359zoijcleaow) && this.f59358ppxfxbqfkf == y0Var.f59358ppxfxbqfkf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        Object obj = this.f59357iobyxmoadg;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.f59359zoijcleaow;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z13 = this.f59358ppxfxbqfkf;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode2 + r13;
    }

    public final String toString() {
        return "BankAuthResult(authData=" + this.f59357iobyxmoadg + ", error=" + this.f59359zoijcleaow + ", isAuthSuccess=" + this.f59358ppxfxbqfkf + ")";
    }
}
