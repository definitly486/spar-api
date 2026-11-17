package l92;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f61985iobyxmoadg;

    public gxszxtbevo(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f61985iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f61985iobyxmoadg, ((gxszxtbevo) obj).f61985iobyxmoadg);
    }

    public int hashCode() {
        return this.f61985iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f61985iobyxmoadg;
    }

    public String toString() {
        return "FAQItemsList(items=" + this.f61985iobyxmoadg + ")";
    }
}
