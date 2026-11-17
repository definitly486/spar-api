package kk;

import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class bn extends sr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final FraudMonCheckResult f56033iobyxmoadg;

    public bn(FraudMonCheckResult fraudMonCheckResult) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonCheckResult, "fraudMonCheckResult");
        this.f56033iobyxmoadg = fraudMonCheckResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56033iobyxmoadg, ((bn) obj).f56033iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56033iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "DenyBlock(fraudMonCheckResult=" + this.f56033iobyxmoadg + ")";
    }
}
