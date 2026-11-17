package h01;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f39021iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final LocationData f39022ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Double f39023wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f39024zoijcleaow;

    public eablkybsjg(List shops, List services, LocationData locationData, Double d13) {
        zdlpuopuiu.btonecajqb(shops, "shops");
        zdlpuopuiu.btonecajqb(services, "services");
        this.f39021iobyxmoadg = shops;
        this.f39024zoijcleaow = services;
        this.f39022ppxfxbqfkf = locationData;
        this.f39023wkgbmnqykc = d13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f39021iobyxmoadg, eablkybsjgVar.f39021iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39024zoijcleaow, eablkybsjgVar.f39024zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f39022ppxfxbqfkf, eablkybsjgVar.f39022ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f39023wkgbmnqykc, eablkybsjgVar.f39023wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((this.f39021iobyxmoadg.hashCode() * 31) + this.f39024zoijcleaow.hashCode()) * 31;
        LocationData locationData = this.f39022ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (locationData == null ? 0 : locationData.hashCode())) * 31;
        Double d13 = this.f39023wkgbmnqykc;
        return iHashCode2 + (d13 != null ? d13.hashCode() : 0);
    }

    public final LocationData iobyxmoadg() {
        return this.f39022ppxfxbqfkf;
    }

    public final List ppxfxbqfkf() {
        return this.f39024zoijcleaow;
    }

    public String toString() {
        return "ShopsData(shops=" + this.f39021iobyxmoadg + ", services=" + this.f39024zoijcleaow + ", centralPosition=" + this.f39022ppxfxbqfkf + ", maxDistance=" + this.f39023wkgbmnqykc + ")";
    }

    public final List wkgbmnqykc() {
        return this.f39021iobyxmoadg;
    }

    public final Double zoijcleaow() {
        return this.f39023wkgbmnqykc;
    }
}
