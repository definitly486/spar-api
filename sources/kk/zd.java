package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class zd extends nr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final kc f59568iobyxmoadg;

    public zd(kc payStatus) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payStatus, "payStatus");
        this.f59568iobyxmoadg = payStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zd) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59568iobyxmoadg, ((zd) obj).f59568iobyxmoadg);
    }

    public final int hashCode() {
        return this.f59568iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "Pay(payStatus=" + this.f59568iobyxmoadg + ")";
    }
}
