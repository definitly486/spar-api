package v92;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f116414iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ba2.ppxfxbqfkf f116415ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ba2.nufgyqmvbu f116416wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ba2.zoijcleaow f116417zoijcleaow;

    public nufgyqmvbu(boolean z13, ba2.zoijcleaow zoijcleaowVar, ba2.ppxfxbqfkf ppxfxbqfkfVar, ba2.nufgyqmvbu nufgyqmvbuVar) {
        this.f116414iobyxmoadg = z13;
        this.f116417zoijcleaow = zoijcleaowVar;
        this.f116415ppxfxbqfkf = ppxfxbqfkfVar;
        this.f116416wkgbmnqykc = nufgyqmvbuVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f116414iobyxmoadg == nufgyqmvbuVar.f116414iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f116417zoijcleaow, nufgyqmvbuVar.f116417zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f116415ppxfxbqfkf, nufgyqmvbuVar.f116415ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f116416wkgbmnqykc, nufgyqmvbuVar.f116416wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f116414iobyxmoadg) * 31;
        ba2.zoijcleaow zoijcleaowVar = this.f116417zoijcleaow;
        int iHashCode2 = (iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        ba2.ppxfxbqfkf ppxfxbqfkfVar = this.f116415ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode())) * 31;
        ba2.nufgyqmvbu nufgyqmvbuVar = this.f116416wkgbmnqykc;
        return iHashCode3 + (nufgyqmvbuVar != null ? nufgyqmvbuVar.hashCode() : 0);
    }

    public final ba2.zoijcleaow iobyxmoadg() {
        return this.f116417zoijcleaow;
    }

    public final ba2.nufgyqmvbu ppxfxbqfkf() {
        return this.f116416wkgbmnqykc;
    }

    public String toString() {
        return "Model(showLoading=" + this.f116414iobyxmoadg + ", blocksList=" + this.f116417zoijcleaow + ", bottomInfo=" + this.f116415ppxfxbqfkf + ", dialog=" + this.f116416wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f116414iobyxmoadg;
    }

    public final ba2.ppxfxbqfkf zoijcleaow() {
        return this.f116415ppxfxbqfkf;
    }
}
