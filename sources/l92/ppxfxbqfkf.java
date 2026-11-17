package l92;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f61990iobyxmoadg;

    public ppxfxbqfkf(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f61990iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f61990iobyxmoadg, ((ppxfxbqfkf) obj).f61990iobyxmoadg);
    }

    public int hashCode() {
        return this.f61990iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f61990iobyxmoadg;
    }

    public String toString() {
        return "ActionButtonsList(items=" + this.f61990iobyxmoadg + ")";
    }
}
