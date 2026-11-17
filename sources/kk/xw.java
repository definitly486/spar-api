package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class xw implements iz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final wj f59344iobyxmoadg;

    public xw(wj helpersScreenMode) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helpersScreenMode, "helpersScreenMode");
        this.f59344iobyxmoadg = helpersScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59344iobyxmoadg, ((xw) obj).f59344iobyxmoadg);
    }

    public final int hashCode() {
        return this.f59344iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ReturnHelpersScreenType(helpersScreenMode=" + this.f59344iobyxmoadg + ")";
    }
}
