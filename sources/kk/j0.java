package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final sr f57118iobyxmoadg;

    public j0(sr fraudMonReviewState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonReviewState, "fraudMonReviewState");
        this.f57118iobyxmoadg = fraudMonReviewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57118iobyxmoadg, ((j0) obj).f57118iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57118iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HandleFraudMonCheckResult(fraudMonReviewState=" + this.f57118iobyxmoadg + ")";
    }
}
