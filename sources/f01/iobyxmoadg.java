package f01;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f32537iobyxmoadg;

    public iobyxmoadg(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f32537iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f32537iobyxmoadg, ((iobyxmoadg) obj).f32537iobyxmoadg);
    }

    public int hashCode() {
        return this.f32537iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f32537iobyxmoadg;
    }

    public String toString() {
        return "Restaurants(items=" + this.f32537iobyxmoadg + ")";
    }
}
