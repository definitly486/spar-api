package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class rd extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f58312iobyxmoadg;

    public rd(String localSessionId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(localSessionId, "localSessionId");
        this.f58312iobyxmoadg = localSessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58312iobyxmoadg, ((rd) obj).f58312iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58312iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "SetLocalSessionId(localSessionId=" + this.f58312iobyxmoadg + ")";
    }
}
