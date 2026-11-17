package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class xq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f59321iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final boolean f59322ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final boolean f59323zoijcleaow;

    public xq(int i13, boolean z13, boolean z14) {
        this.f59321iobyxmoadg = i13;
        this.f59323zoijcleaow = z13;
        this.f59322ppxfxbqfkf = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq)) {
            return false;
        }
        xq xqVar = (xq) obj;
        return this.f59321iobyxmoadg == xqVar.f59321iobyxmoadg && this.f59323zoijcleaow == xqVar.f59323zoijcleaow && this.f59322ppxfxbqfkf == xqVar.f59322ppxfxbqfkf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f59321iobyxmoadg) * 31;
        boolean z13 = this.f59323zoijcleaow;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (iHashCode + r13) * 31;
        boolean z14 = this.f59322ppxfxbqfkf;
        return i13 + (z14 ? 1 : z14);
    }

    public final String toString() {
        return "SpasiboButtonState(bonuses=" + this.f59321iobyxmoadg + ", isSwitcherOn=" + this.f59323zoijcleaow + ", isZeroOrder=" + this.f59322ppxfxbqfkf + ")";
    }
}
