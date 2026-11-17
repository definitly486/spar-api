package kk;

import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class zl extends sr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final FraudMonCheckResult f59601iobyxmoadg;

    public zl(FraudMonCheckResult fraudMonCheckResult) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonCheckResult, "fraudMonCheckResult");
        this.f59601iobyxmoadg = fraudMonCheckResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59601iobyxmoadg, ((zl) obj).f59601iobyxmoadg);
    }

    public final int hashCode() {
        return this.f59601iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "Deny(fraudMonCheckResult=" + this.f59601iobyxmoadg + ")";
    }
}
