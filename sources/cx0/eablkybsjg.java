package cx0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f26029iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f26030ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f26031zoijcleaow;

    public eablkybsjg(String name, double d13, boolean z13) {
        zdlpuopuiu.btonecajqb(name, "name");
        this.f26029iobyxmoadg = name;
        this.f26031zoijcleaow = d13;
        this.f26030ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f26029iobyxmoadg, eablkybsjgVar.f26029iobyxmoadg) && Double.compare(this.f26031zoijcleaow, eablkybsjgVar.f26031zoijcleaow) == 0 && this.f26030ppxfxbqfkf == eablkybsjgVar.f26030ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f26029iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f26031zoijcleaow)) * 31) + Boolean.hashCode(this.f26030ppxfxbqfkf);
    }

    public final double iobyxmoadg() {
        return this.f26031zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f26030ppxfxbqfkf;
    }

    public String toString() {
        return "OrderEditPromocodeEntity(name=" + this.f26029iobyxmoadg + ", discount=" + this.f26031zoijcleaow + ", status=" + this.f26030ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f26029iobyxmoadg;
    }

    public /* synthetic */ eablkybsjg(String str, double d13, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0.0d : d13, (i13 & 4) != 0 ? false : z13);
    }
}
