package uz0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f114820iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f114821ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f114822zoijcleaow;

    public gxszxtbevo(String id2, String measure, double d13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(measure, "measure");
        this.f114820iobyxmoadg = id2;
        this.f114822zoijcleaow = measure;
        this.f114821ppxfxbqfkf = d13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f114820iobyxmoadg, gxszxtbevoVar.f114820iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f114822zoijcleaow, gxszxtbevoVar.f114822zoijcleaow) && Double.compare(this.f114821ppxfxbqfkf, gxszxtbevoVar.f114821ppxfxbqfkf) == 0;
    }

    public int hashCode() {
        return (((this.f114820iobyxmoadg.hashCode() * 31) + this.f114822zoijcleaow.hashCode()) * 31) + Double.hashCode(this.f114821ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f114820iobyxmoadg;
    }

    public final double ppxfxbqfkf() {
        return this.f114821ppxfxbqfkf;
    }

    public String toString() {
        return "OrderEditProducts(id=" + this.f114820iobyxmoadg + ", measure=" + this.f114822zoijcleaow + ", quantity=" + this.f114821ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f114822zoijcleaow;
    }
}
