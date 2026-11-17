package gl0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f37787iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f37788ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cm0.gxszxtbevo f37789wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jl0.iobyxmoadg f37790zoijcleaow;

    public gxszxtbevo(boolean z13, jl0.iobyxmoadg searchInput, List addressesList, cm0.gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(searchInput, "searchInput");
        zdlpuopuiu.btonecajqb(addressesList, "addressesList");
        this.f37787iobyxmoadg = z13;
        this.f37790zoijcleaow = searchInput;
        this.f37788ppxfxbqfkf = addressesList;
        this.f37789wkgbmnqykc = gxszxtbevoVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f37787iobyxmoadg == gxszxtbevoVar.f37787iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f37790zoijcleaow, gxszxtbevoVar.f37790zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f37788ppxfxbqfkf, gxszxtbevoVar.f37788ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f37789wkgbmnqykc, gxszxtbevoVar.f37789wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f37787iobyxmoadg) * 31) + this.f37790zoijcleaow.hashCode()) * 31) + this.f37788ppxfxbqfkf.hashCode()) * 31;
        cm0.gxszxtbevo gxszxtbevoVar = this.f37789wkgbmnqykc;
        return iHashCode + (gxszxtbevoVar == null ? 0 : gxszxtbevoVar.hashCode());
    }

    public final List iobyxmoadg() {
        return this.f37788ppxfxbqfkf;
    }

    public final cm0.gxszxtbevo ppxfxbqfkf() {
        return this.f37789wkgbmnqykc;
    }

    public String toString() {
        return "Model(isLoading=" + this.f37787iobyxmoadg + ", searchInput=" + this.f37790zoijcleaow + ", addressesList=" + this.f37788ppxfxbqfkf + ", warning=" + this.f37789wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f37787iobyxmoadg;
    }

    public final jl0.iobyxmoadg zoijcleaow() {
        return this.f37790zoijcleaow;
    }
}
