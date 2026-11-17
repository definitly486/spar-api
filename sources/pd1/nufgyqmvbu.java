package pd1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f76438iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f76439zoijcleaow;

    public nufgyqmvbu(boolean z13, List menuItems) {
        zdlpuopuiu.btonecajqb(menuItems, "menuItems");
        this.f76438iobyxmoadg = z13;
        this.f76439zoijcleaow = menuItems;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f76438iobyxmoadg == nufgyqmvbuVar.f76438iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f76439zoijcleaow, nufgyqmvbuVar.f76439zoijcleaow);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f76438iobyxmoadg) * 31) + this.f76439zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f76439zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f76438iobyxmoadg + ", menuItems=" + this.f76439zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f76438iobyxmoadg;
    }
}
