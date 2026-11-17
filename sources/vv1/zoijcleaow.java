package vv1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f118127iobyxmoadg;

    public zoijcleaow(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f118127iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f118127iobyxmoadg, ((zoijcleaow) obj).f118127iobyxmoadg);
    }

    public int hashCode() {
        return this.f118127iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f118127iobyxmoadg;
    }

    public String toString() {
        return "BlockList(items=" + this.f118127iobyxmoadg + ")";
    }
}
