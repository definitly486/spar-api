package fb1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f33391iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f33392zoijcleaow;

    public nufgyqmvbu(boolean z13, List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f33391iobyxmoadg = z13;
        this.f33392zoijcleaow = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f33391iobyxmoadg == nufgyqmvbuVar.f33391iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f33392zoijcleaow, nufgyqmvbuVar.f33392zoijcleaow);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f33391iobyxmoadg) * 31) + this.f33392zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f33392zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f33391iobyxmoadg + ", items=" + this.f33392zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f33391iobyxmoadg;
    }
}
