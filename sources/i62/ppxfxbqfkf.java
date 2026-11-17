package i62;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f42045iobyxmoadg;

    public ppxfxbqfkf(List iconItems) {
        zdlpuopuiu.btonecajqb(iconItems, "iconItems");
        this.f42045iobyxmoadg = iconItems;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f42045iobyxmoadg, ((ppxfxbqfkf) obj).f42045iobyxmoadg);
    }

    public int hashCode() {
        return this.f42045iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f42045iobyxmoadg;
    }

    public String toString() {
        return "IconsTwoUiModel(iconItems=" + this.f42045iobyxmoadg + ")";
    }
}
