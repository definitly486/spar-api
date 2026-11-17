package p10;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f75393iobyxmoadg;

    public iobyxmoadg(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f75393iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f75393iobyxmoadg, ((iobyxmoadg) obj).f75393iobyxmoadg);
    }

    public int hashCode() {
        return this.f75393iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f75393iobyxmoadg;
    }

    public String toString() {
        return "Restaurants(items=" + this.f75393iobyxmoadg + ")";
    }
}
