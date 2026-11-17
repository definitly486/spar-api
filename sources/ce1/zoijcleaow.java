package ce1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f19805iobyxmoadg;

    public zoijcleaow(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f19805iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f19805iobyxmoadg, ((zoijcleaow) obj).f19805iobyxmoadg);
    }

    public int hashCode() {
        return this.f19805iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f19805iobyxmoadg;
    }

    public String toString() {
        return "Brands(items=" + this.f19805iobyxmoadg + ")";
    }
}
