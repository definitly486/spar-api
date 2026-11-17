package h01;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f39030iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f39031zoijcleaow;

    public ppxfxbqfkf(String name, String icon) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(icon, "icon");
        this.f39030iobyxmoadg = name;
        this.f39031zoijcleaow = icon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f39030iobyxmoadg, ppxfxbqfkfVar.f39030iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39031zoijcleaow, ppxfxbqfkfVar.f39031zoijcleaow);
    }

    public int hashCode() {
        return (this.f39030iobyxmoadg.hashCode() * 31) + this.f39031zoijcleaow.hashCode();
    }

    public String toString() {
        return "ShopType(name=" + this.f39030iobyxmoadg + ", icon=" + this.f39031zoijcleaow + ")";
    }
}
