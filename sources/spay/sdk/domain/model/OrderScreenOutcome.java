package spay.sdk.domain.model;

import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kk.a40;
import kk.g60;
import kk.hl;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lspay/sdk/domain/model/OrderScreenOutcome;", "", "Lkk/hl;", "listCardsOutcome", "bnplOutcome", "spasiboOutcome", "<init>", "(Lkk/hl;Lkk/hl;Lkk/hl;)V", "component1", "()Lkk/hl;", "component2", "component3", "copy", "(Lkk/hl;Lkk/hl;Lkk/hl;)Lspay/sdk/domain/model/OrderScreenOutcome;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkk/hl;", "getListCardsOutcome", "getBnplOutcome", "getSpasiboOutcome", "isLoading", "()Z", "isNetworkError", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OrderScreenOutcome {
    private final hl bnplOutcome;
    private final hl listCardsOutcome;
    private final hl spasiboOutcome;

    public OrderScreenOutcome(hl listCardsOutcome, hl hlVar, hl hlVar2) {
        zdlpuopuiu.btonecajqb(listCardsOutcome, "listCardsOutcome");
        this.listCardsOutcome = listCardsOutcome;
        this.bnplOutcome = hlVar;
        this.spasiboOutcome = hlVar2;
    }

    public static /* synthetic */ OrderScreenOutcome copy$default(OrderScreenOutcome orderScreenOutcome, hl hlVar, hl hlVar2, hl hlVar3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hlVar = orderScreenOutcome.listCardsOutcome;
        }
        if ((i13 & 2) != 0) {
            hlVar2 = orderScreenOutcome.bnplOutcome;
        }
        if ((i13 & 4) != 0) {
            hlVar3 = orderScreenOutcome.spasiboOutcome;
        }
        return orderScreenOutcome.copy(hlVar, hlVar2, hlVar3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final hl getListCardsOutcome() {
        return this.listCardsOutcome;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final hl getBnplOutcome() {
        return this.bnplOutcome;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final hl getSpasiboOutcome() {
        return this.spasiboOutcome;
    }

    public final OrderScreenOutcome copy(hl listCardsOutcome, hl bnplOutcome, hl spasiboOutcome) {
        zdlpuopuiu.btonecajqb(listCardsOutcome, "listCardsOutcome");
        return new OrderScreenOutcome(listCardsOutcome, bnplOutcome, spasiboOutcome);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderScreenOutcome)) {
            return false;
        }
        OrderScreenOutcome orderScreenOutcome = (OrderScreenOutcome) other;
        return zdlpuopuiu.eablkybsjg(this.listCardsOutcome, orderScreenOutcome.listCardsOutcome) && zdlpuopuiu.eablkybsjg(this.bnplOutcome, orderScreenOutcome.bnplOutcome) && zdlpuopuiu.eablkybsjg(this.spasiboOutcome, orderScreenOutcome.spasiboOutcome);
    }

    public final hl getBnplOutcome() {
        return this.bnplOutcome;
    }

    public final hl getListCardsOutcome() {
        return this.listCardsOutcome;
    }

    public final hl getSpasiboOutcome() {
        return this.spasiboOutcome;
    }

    public int hashCode() {
        int iHashCode = this.listCardsOutcome.hashCode() * 31;
        hl hlVar = this.bnplOutcome;
        int iHashCode2 = (iHashCode + (hlVar == null ? 0 : hlVar.hashCode())) * 31;
        hl hlVar2 = this.spasiboOutcome;
        return iHashCode2 + (hlVar2 != null ? hlVar2.hashCode() : 0);
    }

    public final boolean isLoading() {
        List listRgvfuqvkyq = jyumaefscl.rgvfuqvkyq(this.listCardsOutcome, this.bnplOutcome, this.spasiboOutcome);
        if (listRgvfuqvkyq != null && listRgvfuqvkyq.isEmpty()) {
            return false;
        }
        Iterator it = listRgvfuqvkyq.iterator();
        while (it.hasNext()) {
            if (((hl) it.next()) instanceof a40) {
                return true;
            }
        }
        return false;
    }

    public final boolean isNetworkError() {
        List listRgvfuqvkyq = jyumaefscl.rgvfuqvkyq(this.listCardsOutcome, this.bnplOutcome, this.spasiboOutcome);
        if (listRgvfuqvkyq != null && listRgvfuqvkyq.isEmpty()) {
            return false;
        }
        Iterator it = listRgvfuqvkyq.iterator();
        while (it.hasNext()) {
            if (((hl) it.next()) instanceof g60) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "OrderScreenOutcome(listCardsOutcome=" + this.listCardsOutcome + ", bnplOutcome=" + this.bnplOutcome + ", spasiboOutcome=" + this.spasiboOutcome + ")";
    }
}
