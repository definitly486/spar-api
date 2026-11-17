package l92;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f61986iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f61987zoijcleaow;

    public iobyxmoadg(String title, String icon) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(icon, "icon");
        this.f61986iobyxmoadg = title;
        this.f61987zoijcleaow = icon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f61986iobyxmoadg, iobyxmoadgVar.f61986iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61987zoijcleaow, iobyxmoadgVar.f61987zoijcleaow);
    }

    public int hashCode() {
        return (this.f61986iobyxmoadg.hashCode() * 31) + this.f61987zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f61987zoijcleaow;
    }

    public String toString() {
        return "ActionButtonUiModel(title=" + this.f61986iobyxmoadg + ", icon=" + this.f61987zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f61986iobyxmoadg;
    }
}
