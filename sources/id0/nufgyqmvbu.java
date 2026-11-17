package id0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f42416iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f42417zoijcleaow;

    public nufgyqmvbu(boolean z13, List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f42416iobyxmoadg = z13;
        this.f42417zoijcleaow = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f42416iobyxmoadg == nufgyqmvbuVar.f42416iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f42417zoijcleaow, nufgyqmvbuVar.f42417zoijcleaow);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f42416iobyxmoadg) * 31) + this.f42417zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f42417zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f42416iobyxmoadg + ", items=" + this.f42417zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f42416iobyxmoadg;
    }
}
