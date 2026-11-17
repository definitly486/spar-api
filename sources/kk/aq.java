package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class aq extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final iz f55833iobyxmoadg;

    public aq(iz mode) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        this.f55833iobyxmoadg = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55833iobyxmoadg, ((aq) obj).f55833iobyxmoadg);
    }

    public final int hashCode() {
        return this.f55833iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ShowUserProfile(mode=" + this.f55833iobyxmoadg + ")";
    }
}
