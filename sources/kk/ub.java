package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ub extends nr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final gl f58809iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final boolean f58810zoijcleaow;

    public ub(gl mode, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        this.f58809iobyxmoadg = mode;
        this.f58810zoijcleaow = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub)) {
            return false;
        }
        ub ubVar = (ub) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58809iobyxmoadg, ubVar.f58809iobyxmoadg) && this.f58810zoijcleaow == ubVar.f58810zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f58809iobyxmoadg.hashCode() * 31;
        boolean z13 = this.f58810zoijcleaow;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return (iHashCode + r13) * 31;
    }

    public final String toString() {
        return "OrderScreenData(mode=" + this.f58809iobyxmoadg + ", noCardsAvailable=" + this.f58810zoijcleaow + ", selectedCard=" + ((Object) null) + ")";
    }
}
