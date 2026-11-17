package hy;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg implements h60.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f41284iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f41285ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f41286zoijcleaow;

    public eablkybsjg(String name, double d13, boolean z13) {
        zdlpuopuiu.btonecajqb(name, "name");
        this.f41284iobyxmoadg = name;
        this.f41286zoijcleaow = d13;
        this.f41285ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f41284iobyxmoadg, eablkybsjgVar.f41284iobyxmoadg) && Double.compare(this.f41286zoijcleaow, eablkybsjgVar.f41286zoijcleaow) == 0 && this.f41285ppxfxbqfkf == eablkybsjgVar.f41285ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f41284iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f41286zoijcleaow)) * 31) + Boolean.hashCode(this.f41285ppxfxbqfkf);
    }

    public final double iobyxmoadg() {
        return this.f41286zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f41285ppxfxbqfkf;
    }

    public String toString() {
        return "OrderEditPromocodeEntity(name=" + this.f41284iobyxmoadg + ", discount=" + this.f41286zoijcleaow + ", status=" + this.f41285ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f41284iobyxmoadg;
    }

    public /* synthetic */ eablkybsjg(String str, double d13, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0.0d : d13, (i13 & 4) != 0 ? false : z13);
    }
}
