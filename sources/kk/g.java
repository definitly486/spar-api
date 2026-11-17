package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final hl f56604iobyxmoadg;

    public g(hl exception) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(exception, "exception");
        this.f56604iobyxmoadg = exception;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56604iobyxmoadg, ((g) obj).f56604iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56604iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HandleException(exception=" + this.f56604iobyxmoadg + ")";
    }
}
