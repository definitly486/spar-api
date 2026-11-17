package pv1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f77378iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final vv1.ppxfxbqfkf f77379ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final vv1.nufgyqmvbu f77380wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final vv1.zoijcleaow f77381zoijcleaow;

    public nufgyqmvbu(boolean z13, vv1.zoijcleaow zoijcleaowVar, vv1.ppxfxbqfkf ppxfxbqfkfVar, vv1.nufgyqmvbu nufgyqmvbuVar) {
        this.f77378iobyxmoadg = z13;
        this.f77381zoijcleaow = zoijcleaowVar;
        this.f77379ppxfxbqfkf = ppxfxbqfkfVar;
        this.f77380wkgbmnqykc = nufgyqmvbuVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f77378iobyxmoadg == nufgyqmvbuVar.f77378iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f77381zoijcleaow, nufgyqmvbuVar.f77381zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f77379ppxfxbqfkf, nufgyqmvbuVar.f77379ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f77380wkgbmnqykc, nufgyqmvbuVar.f77380wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f77378iobyxmoadg) * 31;
        vv1.zoijcleaow zoijcleaowVar = this.f77381zoijcleaow;
        int iHashCode2 = (iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        vv1.ppxfxbqfkf ppxfxbqfkfVar = this.f77379ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode())) * 31;
        vv1.nufgyqmvbu nufgyqmvbuVar = this.f77380wkgbmnqykc;
        return iHashCode3 + (nufgyqmvbuVar != null ? nufgyqmvbuVar.hashCode() : 0);
    }

    public final vv1.zoijcleaow iobyxmoadg() {
        return this.f77381zoijcleaow;
    }

    public final vv1.nufgyqmvbu ppxfxbqfkf() {
        return this.f77380wkgbmnqykc;
    }

    public String toString() {
        return "Model(showLoading=" + this.f77378iobyxmoadg + ", blocksList=" + this.f77381zoijcleaow + ", bottomInfo=" + this.f77379ppxfxbqfkf + ", dialog=" + this.f77380wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f77378iobyxmoadg;
    }

    public final vv1.ppxfxbqfkf zoijcleaow() {
        return this.f77379ppxfxbqfkf;
    }
}
