package kk;

import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class am {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f55828iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final PaymentBnplPlanRequestBody f55829zoijcleaow;

    public am(String authorization, PaymentBnplPlanRequestBody paymentPlanBnplRequestBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentPlanBnplRequestBody, "paymentPlanBnplRequestBody");
        this.f55828iobyxmoadg = authorization;
        this.f55829zoijcleaow = paymentPlanBnplRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55828iobyxmoadg, amVar.f55828iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55829zoijcleaow, amVar.f55829zoijcleaow);
    }

    public final int hashCode() {
        return this.f55829zoijcleaow.hashCode() + (this.f55828iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "GetPaymentPlanBnplUseCaseRequestParams(authorization=" + this.f55828iobyxmoadg + ", paymentPlanBnplRequestBody=" + this.f55829zoijcleaow + ")";
    }
}
