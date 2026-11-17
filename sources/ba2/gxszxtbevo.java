package ba2;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f15591iobyxmoadg;

    public gxszxtbevo(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f15591iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f15591iobyxmoadg, ((gxszxtbevo) obj).f15591iobyxmoadg);
    }

    public int hashCode() {
        return this.f15591iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f15591iobyxmoadg;
    }

    public String toString() {
        return "OptionList(items=" + this.f15591iobyxmoadg + ")";
    }
}
