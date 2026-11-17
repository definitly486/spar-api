package bs1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f17044iobyxmoadg;

    public ppxfxbqfkf(List iconItems) {
        zdlpuopuiu.btonecajqb(iconItems, "iconItems");
        this.f17044iobyxmoadg = iconItems;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f17044iobyxmoadg, ((ppxfxbqfkf) obj).f17044iobyxmoadg);
    }

    public int hashCode() {
        return this.f17044iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f17044iobyxmoadg;
    }

    public String toString() {
        return "IconsTwoUiModel(iconItems=" + this.f17044iobyxmoadg + ")";
    }
}
