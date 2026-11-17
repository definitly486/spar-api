package iv;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f49656iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final LocationData f49657ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f49658zoijcleaow;

    public zoijcleaow(String shopId, String shortAddress, LocationData location) {
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
        zdlpuopuiu.btonecajqb(location, "location");
        this.f49656iobyxmoadg = shopId;
        this.f49658zoijcleaow = shortAddress;
        this.f49657ppxfxbqfkf = location;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f49656iobyxmoadg, zoijcleaowVar.f49656iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f49658zoijcleaow, zoijcleaowVar.f49658zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f49657ppxfxbqfkf, zoijcleaowVar.f49657ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f49656iobyxmoadg.hashCode() * 31) + this.f49658zoijcleaow.hashCode()) * 31) + this.f49657ppxfxbqfkf.hashCode();
    }

    public final LocationData iobyxmoadg() {
        return this.f49657ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f49658zoijcleaow;
    }

    public String toString() {
        return "ShopByGeo(shopId=" + this.f49656iobyxmoadg + ", shortAddress=" + this.f49658zoijcleaow + ", location=" + this.f49657ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f49656iobyxmoadg;
    }
}
