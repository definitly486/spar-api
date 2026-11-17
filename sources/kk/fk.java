package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class fk extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final iz f56575iobyxmoadg;

    public fk(iz mode) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        this.f56575iobyxmoadg = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56575iobyxmoadg, ((fk) obj).f56575iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56575iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "UserProfile(mode=" + this.f56575iobyxmoadg + ")";
    }
}
