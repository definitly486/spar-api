package kk;

import spay.sdk.domain.model.request.ListOfCardsRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f59080iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ListOfCardsRequestBody f59081zoijcleaow;

    public w0(String authorization, ListOfCardsRequestBody listOfCardsRequestBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listOfCardsRequestBody, "listOfCardsRequestBody");
        this.f59080iobyxmoadg = authorization;
        this.f59081zoijcleaow = listOfCardsRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59080iobyxmoadg, w0Var.f59080iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59081zoijcleaow, w0Var.f59081zoijcleaow);
    }

    public final int hashCode() {
        return this.f59081zoijcleaow.hashCode() + (this.f59080iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "GetListOfCardsUseCaseRequestParams(authorization=" + this.f59080iobyxmoadg + ", listOfCardsRequestBody=" + this.f59081zoijcleaow + ")";
    }
}
