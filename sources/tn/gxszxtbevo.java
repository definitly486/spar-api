package tn;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f111065iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f111066ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final rn.gxszxtbevo f111067wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wn.ppxfxbqfkf f111068zoijcleaow;

    public gxszxtbevo(boolean z13, wn.ppxfxbqfkf searchInput, List scrollableContent, rn.gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(searchInput, "searchInput");
        zdlpuopuiu.btonecajqb(scrollableContent, "scrollableContent");
        this.f111065iobyxmoadg = z13;
        this.f111068zoijcleaow = searchInput;
        this.f111066ppxfxbqfkf = scrollableContent;
        this.f111067wkgbmnqykc = gxszxtbevoVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f111065iobyxmoadg == gxszxtbevoVar.f111065iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f111068zoijcleaow, gxszxtbevoVar.f111068zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f111066ppxfxbqfkf, gxszxtbevoVar.f111066ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f111067wkgbmnqykc, gxszxtbevoVar.f111067wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f111065iobyxmoadg) * 31) + this.f111068zoijcleaow.hashCode()) * 31) + this.f111066ppxfxbqfkf.hashCode()) * 31;
        rn.gxszxtbevo gxszxtbevoVar = this.f111067wkgbmnqykc;
        return iHashCode + (gxszxtbevoVar == null ? 0 : gxszxtbevoVar.hashCode());
    }

    public final List iobyxmoadg() {
        return this.f111066ppxfxbqfkf;
    }

    public final rn.gxszxtbevo ppxfxbqfkf() {
        return this.f111067wkgbmnqykc;
    }

    public String toString() {
        return "Model(isLoading=" + this.f111065iobyxmoadg + ", searchInput=" + this.f111068zoijcleaow + ", scrollableContent=" + this.f111066ppxfxbqfkf + ", warning=" + this.f111067wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f111065iobyxmoadg;
    }

    public final wn.ppxfxbqfkf zoijcleaow() {
        return this.f111068zoijcleaow;
    }
}
