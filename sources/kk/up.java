package kk;

import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class up extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final PaymentPlanBnplResponseBody f58877iobyxmoadg;

    public up(PaymentPlanBnplResponseBody bnplResponseBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bnplResponseBody, "bnplResponseBody");
        this.f58877iobyxmoadg = bnplResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58877iobyxmoadg, ((up) obj).f58877iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58877iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "BnplResult(bnplResponseBody=" + this.f58877iobyxmoadg + ")";
    }
}
