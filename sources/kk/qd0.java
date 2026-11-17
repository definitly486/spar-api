package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class qd0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final nr f58179iobyxmoadg;

    public qd0(nr state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        this.f58179iobyxmoadg = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd0) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58179iobyxmoadg, ((qd0) obj).f58179iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58179iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "SheetState(state=" + this.f58179iobyxmoadg + ")";
    }
}
