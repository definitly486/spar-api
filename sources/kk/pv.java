package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class pv extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f58119iobyxmoadg;

    public pv(String description) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        this.f58119iobyxmoadg = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pv) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58119iobyxmoadg, ((pv) obj).f58119iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58119iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "Exception(description=" + this.f58119iobyxmoadg + ")";
    }
}
