package x50;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f121187iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f121188zoijcleaow;

    public zoijcleaow(ppxfxbqfkf typography, iobyxmoadg customTextStyles) {
        zdlpuopuiu.btonecajqb(typography, "typography");
        zdlpuopuiu.btonecajqb(customTextStyles, "customTextStyles");
        this.f121187iobyxmoadg = typography;
        this.f121188zoijcleaow = customTextStyles;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f121187iobyxmoadg, zoijcleaowVar.f121187iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f121188zoijcleaow, zoijcleaowVar.f121188zoijcleaow);
    }

    public int hashCode() {
        return (this.f121187iobyxmoadg.hashCode() * 31) + this.f121188zoijcleaow.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f121188zoijcleaow;
    }

    public String toString() {
        return "CustomTypes(typography=" + this.f121187iobyxmoadg + ", customTextStyles=" + this.f121188zoijcleaow + ")";
    }

    public final ppxfxbqfkf zoijcleaow() {
        return this.f121187iobyxmoadg;
    }
}
