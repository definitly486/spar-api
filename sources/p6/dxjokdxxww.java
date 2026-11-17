package p6;

/* JADX INFO: loaded from: classes2.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f75704iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f75705ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f75706zoijcleaow;

    public dxjokdxxww(String workSpecId, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpecId, "workSpecId");
        this.f75704iobyxmoadg = workSpecId;
        this.f75706zoijcleaow = i13;
        this.f75705ppxfxbqfkf = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75704iobyxmoadg, dxjokdxxwwVar.f75704iobyxmoadg) && this.f75706zoijcleaow == dxjokdxxwwVar.f75706zoijcleaow && this.f75705ppxfxbqfkf == dxjokdxxwwVar.f75705ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f75704iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f75706zoijcleaow)) * 31) + Integer.hashCode(this.f75705ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f75706zoijcleaow;
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f75704iobyxmoadg + ", generation=" + this.f75706zoijcleaow + ", systemId=" + this.f75705ppxfxbqfkf + ')';
    }
}
