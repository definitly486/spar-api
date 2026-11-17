package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class fi0 extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final jd f56571iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f56572zoijcleaow;

    public fi0(jd result, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        this.f56571iobyxmoadg = result;
        this.f56572zoijcleaow = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi0)) {
            return false;
        }
        fi0 fi0Var = (fi0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56571iobyxmoadg, fi0Var.f56571iobyxmoadg) && this.f56572zoijcleaow == fi0Var.f56572zoijcleaow;
    }

    public final int hashCode() {
        return Long.hashCode(this.f56572zoijcleaow) + (this.f56571iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "HandleConfirmOtpResult(result=" + this.f56571iobyxmoadg + ", timerTime=" + this.f56572zoijcleaow + ")";
    }
}
