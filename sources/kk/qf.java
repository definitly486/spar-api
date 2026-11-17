package kk;

import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class qf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ListOfCardsRequestBody f58185iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final SpasiboBonusesRequestBody f58186ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f58187wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final PaymentBnplPlanRequestBody f58188zoijcleaow;

    public qf(ListOfCardsRequestBody listOfCardsRequestBody, PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, SpasiboBonusesRequestBody spasiboBonusesRequestBody, String authorization) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listOfCardsRequestBody, "listOfCardsRequestBody");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        this.f58185iobyxmoadg = listOfCardsRequestBody;
        this.f58188zoijcleaow = paymentBnplPlanRequestBody;
        this.f58186ppxfxbqfkf = spasiboBonusesRequestBody;
        this.f58187wkgbmnqykc = authorization;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf)) {
            return false;
        }
        qf qfVar = (qf) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58185iobyxmoadg, qfVar.f58185iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58188zoijcleaow, qfVar.f58188zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58186ppxfxbqfkf, qfVar.f58186ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58187wkgbmnqykc, qfVar.f58187wkgbmnqykc);
    }

    public final int hashCode() {
        int iHashCode = this.f58185iobyxmoadg.hashCode() * 31;
        PaymentBnplPlanRequestBody paymentBnplPlanRequestBody = this.f58188zoijcleaow;
        int iHashCode2 = (iHashCode + (paymentBnplPlanRequestBody == null ? 0 : paymentBnplPlanRequestBody.hashCode())) * 31;
        SpasiboBonusesRequestBody spasiboBonusesRequestBody = this.f58186ppxfxbqfkf;
        return this.f58187wkgbmnqykc.hashCode() + ((iHashCode2 + (spasiboBonusesRequestBody != null ? spasiboBonusesRequestBody.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OrderScreenInteractorRequestParams(listOfCardsRequestBody=" + this.f58185iobyxmoadg + ", paymentPlanBnplRequestBody=" + this.f58188zoijcleaow + ", spasiboBonusesRequestBody=" + this.f58186ppxfxbqfkf + ", authorization=" + this.f58187wkgbmnqykc + ")";
    }
}
