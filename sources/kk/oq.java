package kk;

import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class oq extends sr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final FraudMonCheckResult f57990iobyxmoadg;

    public oq(FraudMonCheckResult fraudMonCheckResult) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonCheckResult, "fraudMonCheckResult");
        this.f57990iobyxmoadg = fraudMonCheckResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57990iobyxmoadg, ((oq) obj).f57990iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57990iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ReviewHint(fraudMonCheckResult=" + this.f57990iobyxmoadg + ")";
    }
}
