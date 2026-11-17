package vm;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f117492iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f117493ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final rn.gxszxtbevo f117494wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ym.iobyxmoadg f117495zoijcleaow;

    public gxszxtbevo(boolean z13, ym.iobyxmoadg searchInput, List addressesList, rn.gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(searchInput, "searchInput");
        zdlpuopuiu.btonecajqb(addressesList, "addressesList");
        this.f117492iobyxmoadg = z13;
        this.f117495zoijcleaow = searchInput;
        this.f117493ppxfxbqfkf = addressesList;
        this.f117494wkgbmnqykc = gxszxtbevoVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f117492iobyxmoadg == gxszxtbevoVar.f117492iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f117495zoijcleaow, gxszxtbevoVar.f117495zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f117493ppxfxbqfkf, gxszxtbevoVar.f117493ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f117494wkgbmnqykc, gxszxtbevoVar.f117494wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f117492iobyxmoadg) * 31) + this.f117495zoijcleaow.hashCode()) * 31) + this.f117493ppxfxbqfkf.hashCode()) * 31;
        rn.gxszxtbevo gxszxtbevoVar = this.f117494wkgbmnqykc;
        return iHashCode + (gxszxtbevoVar == null ? 0 : gxszxtbevoVar.hashCode());
    }

    public final List iobyxmoadg() {
        return this.f117493ppxfxbqfkf;
    }

    public final rn.gxszxtbevo ppxfxbqfkf() {
        return this.f117494wkgbmnqykc;
    }

    public String toString() {
        return "Model(isLoading=" + this.f117492iobyxmoadg + ", searchInput=" + this.f117495zoijcleaow + ", addressesList=" + this.f117493ppxfxbqfkf + ", warning=" + this.f117494wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f117492iobyxmoadg;
    }

    public final ym.iobyxmoadg zoijcleaow() {
        return this.f117495zoijcleaow;
    }
}
