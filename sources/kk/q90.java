package kk;

import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class q90 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ListOfCardsResponseBody.PaymentToolInfo.Tool f58169iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final n80 f58170ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final boolean f58171zoijcleaow;

    public q90(ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z13, n80 n80Var) {
        this.f58169iobyxmoadg = tool;
        this.f58171zoijcleaow = z13;
        this.f58170ppxfxbqfkf = n80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q90)) {
            return false;
        }
        q90 q90Var = (q90) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58169iobyxmoadg, q90Var.f58169iobyxmoadg) && this.f58171zoijcleaow == q90Var.f58171zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58170ppxfxbqfkf, q90Var.f58170ppxfxbqfkf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f58169iobyxmoadg;
        int iHashCode = (tool == null ? 0 : tool.hashCode()) * 31;
        boolean z13 = this.f58171zoijcleaow;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (iHashCode + r13) * 31;
        n80 n80Var = this.f58170ppxfxbqfkf;
        return i13 + (n80Var != null ? n80Var.hashCode() : 0);
    }

    public final String toString() {
        return "OnPayOnlineAction(selectedPaymentToolInfo=" + this.f58169iobyxmoadg + ", isBnplEnabled=" + this.f58171zoijcleaow + ", bonuses=" + this.f58170ppxfxbqfkf + ")";
    }
}
