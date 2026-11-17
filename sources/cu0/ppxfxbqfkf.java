package cu0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f25961iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f25962zoijcleaow;

    public ppxfxbqfkf(String selectedShopId, List shops) {
        zdlpuopuiu.btonecajqb(selectedShopId, "selectedShopId");
        zdlpuopuiu.btonecajqb(shops, "shops");
        this.f25961iobyxmoadg = selectedShopId;
        this.f25962zoijcleaow = shops;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f25961iobyxmoadg, ppxfxbqfkfVar.f25961iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f25962zoijcleaow, ppxfxbqfkfVar.f25962zoijcleaow);
    }

    public int hashCode() {
        return (this.f25961iobyxmoadg.hashCode() * 31) + this.f25962zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f25961iobyxmoadg;
    }

    public String toString() {
        return "ShopsByGeoModel(selectedShopId=" + this.f25961iobyxmoadg + ", shops=" + this.f25962zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f25962zoijcleaow;
    }
}
