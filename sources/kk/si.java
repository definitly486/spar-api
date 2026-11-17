package kk;

import spay.sdk.domain.model.request.PaymentOrderRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class si {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f58558iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final PaymentOrderRequestBody f58559zoijcleaow;

    public si(String authorization, PaymentOrderRequestBody paymentOrderRequestBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentOrderRequestBody, "paymentOrderRequestBody");
        this.f58558iobyxmoadg = authorization;
        this.f58559zoijcleaow = paymentOrderRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si)) {
            return false;
        }
        si siVar = (si) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58558iobyxmoadg, siVar.f58558iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58559zoijcleaow, siVar.f58559zoijcleaow);
    }

    public final int hashCode() {
        return this.f58559zoijcleaow.hashCode() + (this.f58558iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "GetPaymentOrderUseCaseRequestParams(authorization=" + this.f58558iobyxmoadg + ", paymentOrderRequestBody=" + this.f58559zoijcleaow + ")";
    }
}
