package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class xl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f59311iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final t3 f59312ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f59313zoijcleaow;

    public xl(String oidcUrl, long j13, t3 t3Var) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oidcUrl, "oidcUrl");
        this.f59311iobyxmoadg = oidcUrl;
        this.f59313zoijcleaow = j13;
        this.f59312ppxfxbqfkf = t3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl)) {
            return false;
        }
        xl xlVar = (xl) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59311iobyxmoadg, xlVar.f59311iobyxmoadg) && this.f59313zoijcleaow == xlVar.f59313zoijcleaow && this.f59312ppxfxbqfkf == xlVar.f59312ppxfxbqfkf;
    }

    public final int hashCode() {
        int iHashCode = (Long.hashCode(this.f59313zoijcleaow) + (this.f59311iobyxmoadg.hashCode() * 31)) * 31;
        t3 t3Var = this.f59312ppxfxbqfkf;
        return iHashCode + (t3Var == null ? 0 : t3Var.hashCode());
    }

    public final String toString() {
        return "ExchangeTokenModel(oidcUrl=" + this.f59311iobyxmoadg + ", createTimeAppToken=" + this.f59313zoijcleaow + ", typeAuth=" + this.f59312ppxfxbqfkf + ")";
    }
}
