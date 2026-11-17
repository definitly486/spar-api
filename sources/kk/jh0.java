package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class jh0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final long f57195iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f57196zoijcleaow;

    public jh0(long j13, String str) {
        this.f57195iobyxmoadg = j13;
        this.f57196zoijcleaow = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh0)) {
            return false;
        }
        jh0 jh0Var = (jh0) obj;
        return this.f57195iobyxmoadg == jh0Var.f57195iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57196zoijcleaow, jh0Var.f57196zoijcleaow);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f57195iobyxmoadg) * 31;
        String str = this.f57196zoijcleaow;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BnplSum(sum=" + this.f57195iobyxmoadg + ", currency=" + this.f57196zoijcleaow + ")";
    }
}
