package h62;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f39737iobyxmoadg;

    public zoijcleaow(List iconItems) {
        zdlpuopuiu.btonecajqb(iconItems, "iconItems");
        this.f39737iobyxmoadg = iconItems;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f39737iobyxmoadg, ((zoijcleaow) obj).f39737iobyxmoadg);
    }

    public int hashCode() {
        return this.f39737iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f39737iobyxmoadg;
    }

    public String toString() {
        return "IconsOneBlockUiModel(iconItems=" + this.f39737iobyxmoadg + ")";
    }
}
