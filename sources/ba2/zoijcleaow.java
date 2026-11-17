package ba2;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f15612iobyxmoadg;

    public zoijcleaow(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f15612iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f15612iobyxmoadg, ((zoijcleaow) obj).f15612iobyxmoadg);
    }

    public int hashCode() {
        return this.f15612iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f15612iobyxmoadg;
    }

    public String toString() {
        return "BlockList(items=" + this.f15612iobyxmoadg + ")";
    }
}
