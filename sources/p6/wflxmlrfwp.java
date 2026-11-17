package p6;

/* JADX INFO: loaded from: classes2.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f75781iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f75782zoijcleaow;

    public wflxmlrfwp(String workSpecId, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpecId, "workSpecId");
        this.f75781iobyxmoadg = workSpecId;
        this.f75782zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75781iobyxmoadg, wflxmlrfwpVar.f75781iobyxmoadg) && this.f75782zoijcleaow == wflxmlrfwpVar.f75782zoijcleaow;
    }

    public int hashCode() {
        return (this.f75781iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f75782zoijcleaow);
    }

    public final int iobyxmoadg() {
        return this.f75782zoijcleaow;
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f75781iobyxmoadg + ", generation=" + this.f75782zoijcleaow + ')';
    }

    public final String zoijcleaow() {
        return this.f75781iobyxmoadg;
    }
}
