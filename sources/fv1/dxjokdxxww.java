package fv1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f35187iobyxmoadg;

    public dxjokdxxww(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f35187iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f35187iobyxmoadg, ((dxjokdxxww) obj).f35187iobyxmoadg);
    }

    public int hashCode() {
        return this.f35187iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f35187iobyxmoadg;
    }

    public String toString() {
        return "QuestionItemsList(items=" + this.f35187iobyxmoadg + ")";
    }
}
