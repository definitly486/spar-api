package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class fx implements sh0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f56599iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final boolean f56600zoijcleaow;

    public fx(String str, boolean z13, int i13) {
        this.f56599iobyxmoadg = (i13 & 2) != 0 ? null : str;
        this.f56600zoijcleaow = z13;
    }

    @Override // kk.sh0
    public final boolean a() {
        return this.f56600zoijcleaow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx)) {
            return false;
        }
        fx fxVar = (fx) obj;
        fxVar.getClass();
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(null, null) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56599iobyxmoadg, fxVar.f56599iobyxmoadg) && this.f56600zoijcleaow == fxVar.f56600zoijcleaow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        String str = this.f56599iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z13 = this.f56600zoijcleaow;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode + r13;
    }

    public final String toString() {
        return "BiometricAuthResult(authData=" + ((Object) null) + ", error=" + this.f56599iobyxmoadg + ", isAuthSuccess=" + this.f56600zoijcleaow + ")";
    }
}
