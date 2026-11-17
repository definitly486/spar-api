package l92;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f61984iobyxmoadg;

    public dxjokdxxww(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f61984iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f61984iobyxmoadg, ((dxjokdxxww) obj).f61984iobyxmoadg);
    }

    public int hashCode() {
        return this.f61984iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f61984iobyxmoadg;
    }

    public String toString() {
        return "QuestionItemsList(items=" + this.f61984iobyxmoadg + ")";
    }
}
