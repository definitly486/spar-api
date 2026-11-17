package dj0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f29025iobyxmoadg;

    public iobyxmoadg(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f29025iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f29025iobyxmoadg, ((iobyxmoadg) obj).f29025iobyxmoadg);
    }

    public int hashCode() {
        return this.f29025iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f29025iobyxmoadg;
    }

    public String toString() {
        return "OrderInfoList(items=" + this.f29025iobyxmoadg + ")";
    }
}
