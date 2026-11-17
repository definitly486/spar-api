package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final kc f57370iobyxmoadg;

    public l1(kc payStatus) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payStatus, "payStatus");
        this.f57370iobyxmoadg = payStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57370iobyxmoadg, ((l1) obj).f57370iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57370iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HandlePayResult(payStatus=" + this.f57370iobyxmoadg + ")";
    }
}
