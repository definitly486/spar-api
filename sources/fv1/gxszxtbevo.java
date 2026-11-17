package fv1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f35188iobyxmoadg;

    public gxszxtbevo(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f35188iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f35188iobyxmoadg, ((gxszxtbevo) obj).f35188iobyxmoadg);
    }

    public int hashCode() {
        return this.f35188iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f35188iobyxmoadg;
    }

    public String toString() {
        return "FAQItemsList(items=" + this.f35188iobyxmoadg + ")";
    }
}
