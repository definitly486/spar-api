package h01;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f39025iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f39026zoijcleaow;

    public gxszxtbevo(List shopTypes, List shopServices) {
        zdlpuopuiu.btonecajqb(shopTypes, "shopTypes");
        zdlpuopuiu.btonecajqb(shopServices, "shopServices");
        this.f39025iobyxmoadg = shopTypes;
        this.f39026zoijcleaow = shopServices;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f39025iobyxmoadg, gxszxtbevoVar.f39025iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39026zoijcleaow, gxszxtbevoVar.f39026zoijcleaow);
    }

    public int hashCode() {
        return (this.f39025iobyxmoadg.hashCode() * 31) + this.f39026zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f39026zoijcleaow;
    }

    public String toString() {
        return "ShopsReferences(shopTypes=" + this.f39025iobyxmoadg + ", shopServices=" + this.f39026zoijcleaow + ")";
    }

    public /* synthetic */ gxszxtbevo(List list, List list2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list2);
    }
}
