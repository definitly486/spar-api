package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ribwqtqdhb extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final jd f58365iobyxmoadg;

    public ribwqtqdhb(jd result) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        this.f58365iobyxmoadg = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ribwqtqdhb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58365iobyxmoadg, ((ribwqtqdhb) obj).f58365iobyxmoadg);
    }

    public final int hashCode() {
        return Long.hashCode(45000L) + (this.f58365iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "HandleCreateOtpSdkResult(result=" + this.f58365iobyxmoadg + ", timerTime=45000)";
    }
}
