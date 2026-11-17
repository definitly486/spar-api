package vv1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f118113iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f118114ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f118115wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f118116zoijcleaow;

    public lqeggnwhkg(long j13, String title, String str, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f118113iobyxmoadg = j13;
        this.f118116zoijcleaow = title;
        this.f118114ppxfxbqfkf = str;
        this.f118115wkgbmnqykc = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f118113iobyxmoadg == lqeggnwhkgVar.f118113iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f118116zoijcleaow, lqeggnwhkgVar.f118116zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f118114ppxfxbqfkf, lqeggnwhkgVar.f118114ppxfxbqfkf) && this.f118115wkgbmnqykc == lqeggnwhkgVar.f118115wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f118113iobyxmoadg) * 31) + this.f118116zoijcleaow.hashCode()) * 31;
        String str = this.f118114ppxfxbqfkf;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f118115wkgbmnqykc);
    }

    public final long iobyxmoadg() {
        return this.f118113iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f118116zoijcleaow;
    }

    public String toString() {
        return "TipOptionUiModel(id=" + this.f118113iobyxmoadg + ", title=" + this.f118116zoijcleaow + ", subtitle=" + this.f118114ppxfxbqfkf + ", isSelected=" + this.f118115wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f118115wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f118114ppxfxbqfkf;
    }
}
