package kk;

import spay.sdk.domain.model.response.paymentToken.successResponse.PaymentTokenResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class so extends wp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final PaymentTokenResponseBody f58565iobyxmoadg;

    public so(PaymentTokenResponseBody paymentTokenResponseBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentTokenResponseBody, "paymentTokenResponseBody");
        this.f58565iobyxmoadg = paymentTokenResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58565iobyxmoadg, ((so) obj).f58565iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58565iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "Success(paymentTokenResponseBody=" + this.f58565iobyxmoadg + ")";
    }
}
