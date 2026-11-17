package ma0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f66661iobyxmoadg;

    public ppxfxbqfkf(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f66661iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f66661iobyxmoadg, ((ppxfxbqfkf) obj).f66661iobyxmoadg);
    }

    public int hashCode() {
        return this.f66661iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f66661iobyxmoadg;
    }

    public String toString() {
        return "FeatureTogglesConfigModel(items=" + this.f66661iobyxmoadg + ")";
    }
}
