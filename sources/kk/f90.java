package kk;

import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class f90 extends gf0 {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final FraudMonCheckResult f56513zoijcleaow;

    public f90(FraudMonCheckResult fraudMonCheckResult) {
        super(fraudMonCheckResult);
        this.f56513zoijcleaow = fraudMonCheckResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f90) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56513zoijcleaow, ((f90) obj).f56513zoijcleaow);
    }

    public final int hashCode() {
        FraudMonCheckResult fraudMonCheckResult = this.f56513zoijcleaow;
        if (fraudMonCheckResult == null) {
            return 0;
        }
        return fraudMonCheckResult.hashCode();
    }

    @Override // kk.gf0
    public final FraudMonCheckResult iobyxmoadg() {
        return this.f56513zoijcleaow;
    }

    public final String toString() {
        return "DenyBlockMode(fraudMonCheckResultParams=" + this.f56513zoijcleaow + ")";
    }
}
