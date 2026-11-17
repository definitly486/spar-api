package g22;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f35879iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f35880ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final f22.zoijcleaow f35881zoijcleaow;

    public ppxfxbqfkf(boolean z13, f22.zoijcleaow zoijcleaowVar, String str) {
        this.f35879iobyxmoadg = z13;
        this.f35881zoijcleaow = zoijcleaowVar;
        this.f35880ppxfxbqfkf = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f35879iobyxmoadg == ppxfxbqfkfVar.f35879iobyxmoadg && this.f35881zoijcleaow == ppxfxbqfkfVar.f35881zoijcleaow && zdlpuopuiu.eablkybsjg(this.f35880ppxfxbqfkf, ppxfxbqfkfVar.f35880ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f35879iobyxmoadg) * 31;
        f22.zoijcleaow zoijcleaowVar = this.f35881zoijcleaow;
        int iHashCode2 = (iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        String str = this.f35880ppxfxbqfkf;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ScanGoClearCartResponseModel(isSuccessful=" + this.f35879iobyxmoadg + ", error=" + this.f35881zoijcleaow + ", errorMessage=" + this.f35880ppxfxbqfkf + ")";
    }
}
