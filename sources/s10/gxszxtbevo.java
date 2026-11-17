package s10;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f105191iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f105192zoijcleaow;

    public gxszxtbevo(List shopTypes, List shopServices) {
        zdlpuopuiu.btonecajqb(shopTypes, "shopTypes");
        zdlpuopuiu.btonecajqb(shopServices, "shopServices");
        this.f105191iobyxmoadg = shopTypes;
        this.f105192zoijcleaow = shopServices;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f105191iobyxmoadg, gxszxtbevoVar.f105191iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105192zoijcleaow, gxszxtbevoVar.f105192zoijcleaow);
    }

    public int hashCode() {
        return (this.f105191iobyxmoadg.hashCode() * 31) + this.f105192zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f105192zoijcleaow;
    }

    public String toString() {
        return "ShopsReferences(shopTypes=" + this.f105191iobyxmoadg + ", shopServices=" + this.f105192zoijcleaow + ")";
    }

    public /* synthetic */ gxszxtbevo(List list, List list2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list2);
    }
}
