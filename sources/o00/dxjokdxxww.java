package o00;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f71506iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f71507zoijcleaow;

    public dxjokdxxww(String id2, String name) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f71506iobyxmoadg = id2;
        this.f71507zoijcleaow = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f71506iobyxmoadg, dxjokdxxwwVar.f71506iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71507zoijcleaow, dxjokdxxwwVar.f71507zoijcleaow);
    }

    public int hashCode() {
        return (this.f71506iobyxmoadg.hashCode() * 31) + this.f71507zoijcleaow.hashCode();
    }

    public String toString() {
        return "StatusId(id=" + this.f71506iobyxmoadg + ", name=" + this.f71507zoijcleaow + ")";
    }
}
