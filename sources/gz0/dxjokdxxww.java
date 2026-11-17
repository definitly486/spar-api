package gz0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f38830iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f38831zoijcleaow;

    public dxjokdxxww(String id2, String name) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f38830iobyxmoadg = id2;
        this.f38831zoijcleaow = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f38830iobyxmoadg, dxjokdxxwwVar.f38830iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f38831zoijcleaow, dxjokdxxwwVar.f38831zoijcleaow);
    }

    public int hashCode() {
        return (this.f38830iobyxmoadg.hashCode() * 31) + this.f38831zoijcleaow.hashCode();
    }

    public String toString() {
        return "StatusId(id=" + this.f38830iobyxmoadg + ", name=" + this.f38831zoijcleaow + ")";
    }
}
