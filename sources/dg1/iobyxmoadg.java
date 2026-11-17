package dg1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f28139iobyxmoadg;

    public iobyxmoadg(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f28139iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f28139iobyxmoadg, ((iobyxmoadg) obj).f28139iobyxmoadg);
    }

    public int hashCode() {
        return this.f28139iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f28139iobyxmoadg;
    }

    public String toString() {
        return "OrderInfoList(items=" + this.f28139iobyxmoadg + ")";
    }
}
