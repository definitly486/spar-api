package kk;

import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class mb extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Boolean f57618iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Boolean f57619ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final n80 f57620wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ListOfCardsResponseBody.PaymentToolInfo.Tool f57621zoijcleaow;

    public mb(Boolean bool, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, Boolean bool2, n80 n80Var) {
        this.f57618iobyxmoadg = bool;
        this.f57621zoijcleaow = tool;
        this.f57619ppxfxbqfkf = bool2;
        this.f57620wkgbmnqykc = n80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb)) {
            return false;
        }
        mb mbVar = (mb) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57618iobyxmoadg, mbVar.f57618iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57621zoijcleaow, mbVar.f57621zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57619ppxfxbqfkf, mbVar.f57619ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57620wkgbmnqykc, mbVar.f57620wkgbmnqykc);
    }

    public final int hashCode() {
        Boolean bool = this.f57618iobyxmoadg;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f57621zoijcleaow;
        int iHashCode2 = (iHashCode + (tool == null ? 0 : tool.hashCode())) * 31;
        Boolean bool2 = this.f57619ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        n80 n80Var = this.f57620wkgbmnqykc;
        return iHashCode3 + (n80Var != null ? n80Var.hashCode() : 0);
    }

    public final String toString() {
        return "PerformPayOrderAction(isRequestOTPRequired=" + this.f57618iobyxmoadg + ", selectedPaymentToolInfo=" + this.f57621zoijcleaow + ", isBnplEnabled=" + this.f57619ppxfxbqfkf + ", bonuses=" + this.f57620wkgbmnqykc + ")";
    }
}
