package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class eg extends nr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final j6 f56417iobyxmoadg;

    public eg(j6 j6Var) {
        this.f56417iobyxmoadg = j6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56417iobyxmoadg, ((eg) obj).f56417iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56417iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "PayBonusesError(caller=" + this.f56417iobyxmoadg + ")";
    }
}
