package kk;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ms implements vu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f57689iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final List f57690zoijcleaow;

    public ms(int i13, List args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        this.f57689iobyxmoadg = i13;
        this.f57690zoijcleaow = args;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms)) {
            return false;
        }
        ms msVar = (ms) obj;
        return this.f57689iobyxmoadg == msVar.f57689iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57690zoijcleaow, msVar.f57690zoijcleaow);
    }

    public final int hashCode() {
        return this.f57690zoijcleaow.hashCode() + (Integer.hashCode(this.f57689iobyxmoadg) * 31);
    }

    public final String toString() {
        return "Resource(resId=" + this.f57689iobyxmoadg + ", args=" + this.f57690zoijcleaow + ")";
    }
}
