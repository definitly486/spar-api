package kk;

import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ln {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final hl f57485iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final boolean f57486ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ListOfCardsResponseBody.PaymentToolInfo.Tool f57487zoijcleaow;

    public /* synthetic */ ln(hl hlVar, int i13) {
        this(hlVar, null, (i13 & 4) == 0);
    }

    public static ln iobyxmoadg(ln lnVar, hl state, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            state = lnVar.f57485iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            tool = lnVar.f57487zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z13 = lnVar.f57486ppxfxbqfkf;
        }
        lnVar.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        return new ln(state, tool, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln)) {
            return false;
        }
        ln lnVar = (ln) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57485iobyxmoadg, lnVar.f57485iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57487zoijcleaow, lnVar.f57487zoijcleaow) && this.f57486ppxfxbqfkf == lnVar.f57486ppxfxbqfkf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = this.f57485iobyxmoadg.hashCode() * 31;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f57487zoijcleaow;
        int iHashCode2 = (iHashCode + (tool == null ? 0 : tool.hashCode())) * 31;
        boolean z13 = this.f57486ppxfxbqfkf;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode2 + r13;
    }

    public final String toString() {
        return "Outcome(state=" + this.f57485iobyxmoadg + ", selectedCard=" + this.f57487zoijcleaow + ", isError=" + this.f57486ppxfxbqfkf + ")";
    }

    public ln(hl state, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        this.f57485iobyxmoadg = state;
        this.f57487zoijcleaow = tool;
        this.f57486ppxfxbqfkf = z13;
    }
}
