package cu0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f25963iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final LocationData f25964ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f25965zoijcleaow;

    public zoijcleaow(String shopId, String shortAddress, LocationData location) {
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
        zdlpuopuiu.btonecajqb(location, "location");
        this.f25963iobyxmoadg = shopId;
        this.f25965zoijcleaow = shortAddress;
        this.f25964ppxfxbqfkf = location;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f25963iobyxmoadg, zoijcleaowVar.f25963iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f25965zoijcleaow, zoijcleaowVar.f25965zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f25964ppxfxbqfkf, zoijcleaowVar.f25964ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f25963iobyxmoadg.hashCode() * 31) + this.f25965zoijcleaow.hashCode()) * 31) + this.f25964ppxfxbqfkf.hashCode();
    }

    public final LocationData iobyxmoadg() {
        return this.f25964ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f25965zoijcleaow;
    }

    public String toString() {
        return "ShopByGeo(shopId=" + this.f25963iobyxmoadg + ", shortAddress=" + this.f25965zoijcleaow + ", location=" + this.f25964ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f25963iobyxmoadg;
    }
}
