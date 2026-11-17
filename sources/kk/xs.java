package kk;

import spay.sdk.domain.model.request.PaymentTokenRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class xs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f59342iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final PaymentTokenRequestBody f59343zoijcleaow;

    public xs(String authorization, PaymentTokenRequestBody paymentTokenRequestBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentTokenRequestBody, "paymentTokenRequestBody");
        this.f59342iobyxmoadg = authorization;
        this.f59343zoijcleaow = paymentTokenRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs)) {
            return false;
        }
        xs xsVar = (xs) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59342iobyxmoadg, xsVar.f59342iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59343zoijcleaow, xsVar.f59343zoijcleaow);
    }

    public final int hashCode() {
        return this.f59343zoijcleaow.hashCode() + (this.f59342iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "GetPaymentTokenUseCaseRequestParams(authorization=" + this.f59342iobyxmoadg + ", paymentTokenRequestBody=" + this.f59343zoijcleaow + ")";
    }
}
