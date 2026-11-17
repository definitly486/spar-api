package h01;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f39027iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f39028ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f39029zoijcleaow;

    public iobyxmoadg(String id2, String name, String address) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(address, "address");
        this.f39027iobyxmoadg = id2;
        this.f39029zoijcleaow = name;
        this.f39028ppxfxbqfkf = address;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f39027iobyxmoadg, iobyxmoadgVar.f39027iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39029zoijcleaow, iobyxmoadgVar.f39029zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f39028ppxfxbqfkf, iobyxmoadgVar.f39028ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f39027iobyxmoadg.hashCode() * 31) + this.f39029zoijcleaow.hashCode()) * 31) + this.f39028ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f39028ppxfxbqfkf;
    }

    public String toString() {
        return "ClosestShop(id=" + this.f39027iobyxmoadg + ", name=" + this.f39029zoijcleaow + ", address=" + this.f39028ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f39027iobyxmoadg;
    }
}
