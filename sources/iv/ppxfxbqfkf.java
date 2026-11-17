package iv;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f49654iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f49655zoijcleaow;

    public ppxfxbqfkf(String selectedShopId, List shops) {
        zdlpuopuiu.btonecajqb(selectedShopId, "selectedShopId");
        zdlpuopuiu.btonecajqb(shops, "shops");
        this.f49654iobyxmoadg = selectedShopId;
        this.f49655zoijcleaow = shops;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f49654iobyxmoadg, ppxfxbqfkfVar.f49654iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f49655zoijcleaow, ppxfxbqfkfVar.f49655zoijcleaow);
    }

    public int hashCode() {
        return (this.f49654iobyxmoadg.hashCode() * 31) + this.f49655zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f49654iobyxmoadg;
    }

    public String toString() {
        return "ShopsByGeoModel(selectedShopId=" + this.f49654iobyxmoadg + ", shops=" + this.f49655zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f49655zoijcleaow;
    }
}
