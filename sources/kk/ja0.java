package kk;

import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class ja0 extends gf0 {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final FraudMonCheckResult f57171zoijcleaow;

    public ja0(FraudMonCheckResult fraudMonCheckResult) {
        super(fraudMonCheckResult);
        this.f57171zoijcleaow = fraudMonCheckResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ja0) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57171zoijcleaow, ((ja0) obj).f57171zoijcleaow);
    }

    public final int hashCode() {
        FraudMonCheckResult fraudMonCheckResult = this.f57171zoijcleaow;
        if (fraudMonCheckResult == null) {
            return 0;
        }
        return fraudMonCheckResult.hashCode();
    }

    @Override // kk.gf0
    public final FraudMonCheckResult iobyxmoadg() {
        return this.f57171zoijcleaow;
    }

    public final String toString() {
        return "DenyMode(fraudMonCheckResultParams=" + this.f57171zoijcleaow + ")";
    }
}
