package kk;

import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class kp extends sr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final FraudMonCheckResult f57336iobyxmoadg;

    public kp(FraudMonCheckResult fraudMonCheckResult) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonCheckResult, "fraudMonCheckResult");
        this.f57336iobyxmoadg = fraudMonCheckResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kp) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57336iobyxmoadg, ((kp) obj).f57336iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57336iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "OtpReview(fraudMonCheckResult=" + this.f57336iobyxmoadg + ")";
    }
}
