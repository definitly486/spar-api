package ce1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f19790iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f19791ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f19792zoijcleaow;

    public iobyxmoadg(String code, String name, String str) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f19790iobyxmoadg = code;
        this.f19792zoijcleaow = name;
        this.f19791ppxfxbqfkf = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f19790iobyxmoadg, iobyxmoadgVar.f19790iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f19792zoijcleaow, iobyxmoadgVar.f19792zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f19791ppxfxbqfkf, iobyxmoadgVar.f19791ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f19790iobyxmoadg.hashCode() * 31) + this.f19792zoijcleaow.hashCode()) * 31;
        String str = this.f19791ppxfxbqfkf;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f19790iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f19791ppxfxbqfkf;
    }

    public String toString() {
        return "Brand(code=" + this.f19790iobyxmoadg + ", name=" + this.f19792zoijcleaow + ", pic=" + this.f19791ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f19792zoijcleaow;
    }
}
