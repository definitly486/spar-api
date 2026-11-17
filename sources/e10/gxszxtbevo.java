package e10;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f30170iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f30171ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f30172zoijcleaow;

    public gxszxtbevo(String id2, String measure, double d13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(measure, "measure");
        this.f30170iobyxmoadg = id2;
        this.f30172zoijcleaow = measure;
        this.f30171ppxfxbqfkf = d13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f30170iobyxmoadg, gxszxtbevoVar.f30170iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f30172zoijcleaow, gxszxtbevoVar.f30172zoijcleaow) && Double.compare(this.f30171ppxfxbqfkf, gxszxtbevoVar.f30171ppxfxbqfkf) == 0;
    }

    public int hashCode() {
        return (((this.f30170iobyxmoadg.hashCode() * 31) + this.f30172zoijcleaow.hashCode()) * 31) + Double.hashCode(this.f30171ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f30170iobyxmoadg;
    }

    public final double ppxfxbqfkf() {
        return this.f30171ppxfxbqfkf;
    }

    public String toString() {
        return "OrderEditProducts(id=" + this.f30170iobyxmoadg + ", measure=" + this.f30172zoijcleaow + ", quantity=" + this.f30171ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f30172zoijcleaow;
    }
}
