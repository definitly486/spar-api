package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class hj extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final yj f56933iobyxmoadg;

    public hj(yj loadingStatus) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loadingStatus, "loadingStatus");
        this.f56933iobyxmoadg = loadingStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hj) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56933iobyxmoadg, ((hj) obj).f56933iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56933iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ShowLoadingScreen(loadingStatus=" + this.f56933iobyxmoadg + ")";
    }
}
