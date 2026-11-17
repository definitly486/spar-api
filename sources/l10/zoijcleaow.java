package l10;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f61337iobyxmoadg;

    public zoijcleaow(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f61337iobyxmoadg = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61337iobyxmoadg, ((zoijcleaow) obj).f61337iobyxmoadg);
    }

    public int hashCode() {
        return this.f61337iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f61337iobyxmoadg;
    }

    public String toString() {
        return "NotificationsModel(items=" + this.f61337iobyxmoadg + ")";
    }
}
