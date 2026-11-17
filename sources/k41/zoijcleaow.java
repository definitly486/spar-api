package k41;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f53785iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f53786zoijcleaow;

    public zoijcleaow(ppxfxbqfkf typography, iobyxmoadg customTextStyles) {
        zdlpuopuiu.btonecajqb(typography, "typography");
        zdlpuopuiu.btonecajqb(customTextStyles, "customTextStyles");
        this.f53785iobyxmoadg = typography;
        this.f53786zoijcleaow = customTextStyles;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f53785iobyxmoadg, zoijcleaowVar.f53785iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f53786zoijcleaow, zoijcleaowVar.f53786zoijcleaow);
    }

    public int hashCode() {
        return (this.f53785iobyxmoadg.hashCode() * 31) + this.f53786zoijcleaow.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f53786zoijcleaow;
    }

    public String toString() {
        return "CustomTypes(typography=" + this.f53785iobyxmoadg + ", customTextStyles=" + this.f53786zoijcleaow + ")";
    }

    public final ppxfxbqfkf zoijcleaow() {
        return this.f53785iobyxmoadg;
    }
}
