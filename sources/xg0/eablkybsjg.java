package xg0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f122319iobyxmoadg;

    public eablkybsjg(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f122319iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f122319iobyxmoadg, ((eablkybsjg) obj).f122319iobyxmoadg);
    }

    public int hashCode() {
        return this.f122319iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f122319iobyxmoadg;
    }

    public String toString() {
        return "Brands(items=" + this.f122319iobyxmoadg + ")";
    }
}
