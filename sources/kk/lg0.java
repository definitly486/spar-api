package kk;

import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.SdkAuthRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class lg0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f57471iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ListOfCardsRequestBody f57472ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final SdkAuthRequestBody f57473wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final a10 f57474zoijcleaow;

    public lg0(String authorization, a10 cardSelectionData, ListOfCardsRequestBody listOfCardsRequestBody, SdkAuthRequestBody sdkAuthRequestBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cardSelectionData, "cardSelectionData");
        this.f57471iobyxmoadg = authorization;
        this.f57474zoijcleaow = cardSelectionData;
        this.f57472ppxfxbqfkf = listOfCardsRequestBody;
        this.f57473wkgbmnqykc = sdkAuthRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg0)) {
            return false;
        }
        lg0 lg0Var = (lg0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57471iobyxmoadg, lg0Var.f57471iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57474zoijcleaow, lg0Var.f57474zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57472ppxfxbqfkf, lg0Var.f57472ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57473wkgbmnqykc, lg0Var.f57473wkgbmnqykc);
    }

    public final int hashCode() {
        int iHashCode = (this.f57474zoijcleaow.f55767iobyxmoadg.hashCode() + (this.f57471iobyxmoadg.hashCode() * 31)) * 31;
        ListOfCardsRequestBody listOfCardsRequestBody = this.f57472ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (listOfCardsRequestBody == null ? 0 : listOfCardsRequestBody.hashCode())) * 31;
        SdkAuthRequestBody sdkAuthRequestBody = this.f57473wkgbmnqykc;
        return iHashCode2 + (sdkAuthRequestBody != null ? sdkAuthRequestBody.hashCode() : 0);
    }

    public final String toString() {
        return "GetFullEmissionUseCaseRequestParams(authorization=" + this.f57471iobyxmoadg + ", cardSelectionData=" + this.f57474zoijcleaow + ", listOfCardsRequestBody=" + this.f57472ppxfxbqfkf + ", sdkAuthRequestBody=" + this.f57473wkgbmnqykc + ")";
    }
}
