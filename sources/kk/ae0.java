package kk;

import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class ae0 extends gf0 {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final FraudMonCheckResult f55811zoijcleaow;

    public ae0(FraudMonCheckResult fraudMonCheckResult) {
        super(fraudMonCheckResult);
        this.f55811zoijcleaow = fraudMonCheckResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae0) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55811zoijcleaow, ((ae0) obj).f55811zoijcleaow);
    }

    public final int hashCode() {
        FraudMonCheckResult fraudMonCheckResult = this.f55811zoijcleaow;
        if (fraudMonCheckResult == null) {
            return 0;
        }
        return fraudMonCheckResult.hashCode();
    }

    @Override // kk.gf0
    public final FraudMonCheckResult iobyxmoadg() {
        return this.f55811zoijcleaow;
    }

    public final String toString() {
        return "ReviewHintMode(fraudMonCheckResultParams=" + this.f55811zoijcleaow + ")";
    }
}
