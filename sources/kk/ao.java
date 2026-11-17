package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ao extends nr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final yj f55831iobyxmoadg;

    public ao(yj loadingStatus) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loadingStatus, "loadingStatus");
        this.f55831iobyxmoadg = loadingStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55831iobyxmoadg, ((ao) obj).f55831iobyxmoadg);
    }

    public final int hashCode() {
        return this.f55831iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ShowLoading(loadingStatus=" + this.f55831iobyxmoadg + ")";
    }
}
