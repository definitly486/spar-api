package s10;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f105196iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f105197zoijcleaow;

    public ppxfxbqfkf(String name, String icon) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(icon, "icon");
        this.f105196iobyxmoadg = name;
        this.f105197zoijcleaow = icon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f105196iobyxmoadg, ppxfxbqfkfVar.f105196iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105197zoijcleaow, ppxfxbqfkfVar.f105197zoijcleaow);
    }

    public int hashCode() {
        return (this.f105196iobyxmoadg.hashCode() * 31) + this.f105197zoijcleaow.hashCode();
    }

    public String toString() {
        return "ShopType(name=" + this.f105196iobyxmoadg + ", icon=" + this.f105197zoijcleaow + ")";
    }
}
