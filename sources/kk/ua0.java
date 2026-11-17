package kk;

import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ua0 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ListOfCardsResponseBody.PaymentToolInfo.Tool f58805iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final boolean f58806zoijcleaow;

    public ua0(ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z13) {
        this.f58805iobyxmoadg = tool;
        this.f58806zoijcleaow = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua0)) {
            return false;
        }
        ua0 ua0Var = (ua0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58805iobyxmoadg, ua0Var.f58805iobyxmoadg) && this.f58806zoijcleaow == ua0Var.f58806zoijcleaow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f58805iobyxmoadg;
        int iHashCode = (tool == null ? 0 : tool.hashCode()) * 31;
        boolean z13 = this.f58806zoijcleaow;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode + r13;
    }

    public final String toString() {
        return "OnPerformPayOrderAction(selectedPaymentToolInfo=" + this.f58805iobyxmoadg + ", bnplEnabled=" + this.f58806zoijcleaow + ")";
    }
}
