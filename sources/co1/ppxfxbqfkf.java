package co1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f20254iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f20255ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bo1.zoijcleaow f20256zoijcleaow;

    public ppxfxbqfkf(boolean z13, bo1.zoijcleaow zoijcleaowVar, String str) {
        this.f20254iobyxmoadg = z13;
        this.f20256zoijcleaow = zoijcleaowVar;
        this.f20255ppxfxbqfkf = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f20254iobyxmoadg == ppxfxbqfkfVar.f20254iobyxmoadg && this.f20256zoijcleaow == ppxfxbqfkfVar.f20256zoijcleaow && zdlpuopuiu.eablkybsjg(this.f20255ppxfxbqfkf, ppxfxbqfkfVar.f20255ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f20254iobyxmoadg) * 31;
        bo1.zoijcleaow zoijcleaowVar = this.f20256zoijcleaow;
        int iHashCode2 = (iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        String str = this.f20255ppxfxbqfkf;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ScanGoClearCartResponseModel(isSuccessful=" + this.f20254iobyxmoadg + ", error=" + this.f20256zoijcleaow + ", errorMessage=" + this.f20255ppxfxbqfkf + ")";
    }
}
