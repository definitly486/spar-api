package fv1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f35194iobyxmoadg;

    public ppxfxbqfkf(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f35194iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f35194iobyxmoadg, ((ppxfxbqfkf) obj).f35194iobyxmoadg);
    }

    public int hashCode() {
        return this.f35194iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f35194iobyxmoadg;
    }

    public String toString() {
        return "ActionButtonsList(items=" + this.f35194iobyxmoadg + ")";
    }
}
