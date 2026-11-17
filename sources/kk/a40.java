package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class a40 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final yj f55773iobyxmoadg;

    public a40(yj loadingStatus) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loadingStatus, "loadingStatus");
        this.f55773iobyxmoadg = loadingStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a40) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55773iobyxmoadg, ((a40) obj).f55773iobyxmoadg);
    }

    public final int hashCode() {
        return this.f55773iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "Loading(loadingStatus=" + this.f55773iobyxmoadg + ")";
    }
}
