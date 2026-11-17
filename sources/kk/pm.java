package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class pm extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final gl f58100iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final boolean f58101zoijcleaow;

    public pm(gl mode, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        this.f58100iobyxmoadg = mode;
        this.f58101zoijcleaow = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm)) {
            return false;
        }
        pm pmVar = (pm) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58100iobyxmoadg, pmVar.f58100iobyxmoadg) && this.f58101zoijcleaow == pmVar.f58101zoijcleaow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f58100iobyxmoadg.hashCode() * 31;
        boolean z13 = this.f58101zoijcleaow;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode + r13;
    }

    public final String toString() {
        return "ShowOrderScreenEvent(mode=" + this.f58100iobyxmoadg + ", dropSelectedCardForBnpl=" + this.f58101zoijcleaow + ")";
    }
}
