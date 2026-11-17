package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class q80 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f58166iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final wu f58167zoijcleaow;

    public q80(String authorization, wu effect) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(effect, "effect");
        this.f58166iobyxmoadg = authorization;
        this.f58167zoijcleaow = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q80)) {
            return false;
        }
        q80 q80Var = (q80) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58166iobyxmoadg, q80Var.f58166iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58167zoijcleaow, q80Var.f58167zoijcleaow);
    }

    public final int hashCode() {
        return this.f58167zoijcleaow.hashCode() + (this.f58166iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "RevokeRefreshTokenUseCaseParams(authorization=" + this.f58166iobyxmoadg + ", effect=" + this.f58167zoijcleaow + ")";
    }
}
