package kk;

import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class xc0 extends gf0 {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final FraudMonCheckResult f59296zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc0(FraudMonCheckResult fraudMonCheckResultParams) {
        super(fraudMonCheckResultParams);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonCheckResultParams, "fraudMonCheckResultParams");
        this.f59296zoijcleaow = fraudMonCheckResultParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xc0) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59296zoijcleaow, ((xc0) obj).f59296zoijcleaow);
    }

    public final int hashCode() {
        return this.f59296zoijcleaow.hashCode();
    }

    @Override // kk.gf0
    public final FraudMonCheckResult iobyxmoadg() {
        return this.f59296zoijcleaow;
    }

    public final String toString() {
        return "OtpReviewMode(fraudMonCheckResultParams=" + this.f59296zoijcleaow + ")";
    }
}
