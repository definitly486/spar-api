package s10;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f105187iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final LocationData f105188ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Double f105189wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f105190zoijcleaow;

    public eablkybsjg(List shops, List services, LocationData locationData, Double d13) {
        zdlpuopuiu.btonecajqb(shops, "shops");
        zdlpuopuiu.btonecajqb(services, "services");
        this.f105187iobyxmoadg = shops;
        this.f105190zoijcleaow = services;
        this.f105188ppxfxbqfkf = locationData;
        this.f105189wkgbmnqykc = d13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f105187iobyxmoadg, eablkybsjgVar.f105187iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105190zoijcleaow, eablkybsjgVar.f105190zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f105188ppxfxbqfkf, eablkybsjgVar.f105188ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f105189wkgbmnqykc, eablkybsjgVar.f105189wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((this.f105187iobyxmoadg.hashCode() * 31) + this.f105190zoijcleaow.hashCode()) * 31;
        LocationData locationData = this.f105188ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (locationData == null ? 0 : locationData.hashCode())) * 31;
        Double d13 = this.f105189wkgbmnqykc;
        return iHashCode2 + (d13 != null ? d13.hashCode() : 0);
    }

    public final LocationData iobyxmoadg() {
        return this.f105188ppxfxbqfkf;
    }

    public final List ppxfxbqfkf() {
        return this.f105190zoijcleaow;
    }

    public String toString() {
        return "ShopsData(shops=" + this.f105187iobyxmoadg + ", services=" + this.f105190zoijcleaow + ", centralPosition=" + this.f105188ppxfxbqfkf + ", maxDistance=" + this.f105189wkgbmnqykc + ")";
    }

    public final List wkgbmnqykc() {
        return this.f105187iobyxmoadg;
    }

    public final Double zoijcleaow() {
        return this.f105189wkgbmnqykc;
    }
}
