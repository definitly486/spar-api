package kg0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f55384iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f55385zoijcleaow;

    public nufgyqmvbu(boolean z13, List menuItems) {
        zdlpuopuiu.btonecajqb(menuItems, "menuItems");
        this.f55384iobyxmoadg = z13;
        this.f55385zoijcleaow = menuItems;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f55384iobyxmoadg == nufgyqmvbuVar.f55384iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f55385zoijcleaow, nufgyqmvbuVar.f55385zoijcleaow);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f55384iobyxmoadg) * 31) + this.f55385zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f55385zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f55384iobyxmoadg + ", menuItems=" + this.f55385zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f55384iobyxmoadg;
    }
}
