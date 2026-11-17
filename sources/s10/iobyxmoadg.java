package s10;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f105193iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f105194ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f105195zoijcleaow;

    public iobyxmoadg(String id2, String name, String address) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(address, "address");
        this.f105193iobyxmoadg = id2;
        this.f105195zoijcleaow = name;
        this.f105194ppxfxbqfkf = address;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f105193iobyxmoadg, iobyxmoadgVar.f105193iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105195zoijcleaow, iobyxmoadgVar.f105195zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f105194ppxfxbqfkf, iobyxmoadgVar.f105194ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f105193iobyxmoadg.hashCode() * 31) + this.f105195zoijcleaow.hashCode()) * 31) + this.f105194ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f105194ppxfxbqfkf;
    }

    public String toString() {
        return "ClosestShop(id=" + this.f105193iobyxmoadg + ", name=" + this.f105195zoijcleaow + ", address=" + this.f105194ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f105193iobyxmoadg;
    }
}
