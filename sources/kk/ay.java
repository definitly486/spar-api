package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ay extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final gf0 f55879iobyxmoadg;

    public ay(gf0 fraudMonResultMode) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fraudMonResultMode, "fraudMonResultMode");
        this.f55879iobyxmoadg = fraudMonResultMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55879iobyxmoadg, ((ay) obj).f55879iobyxmoadg);
    }

    public final int hashCode() {
        return this.f55879iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "FraudMonReview(fraudMonResultMode=" + this.f55879iobyxmoadg + ")";
    }
}
