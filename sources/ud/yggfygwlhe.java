package ud;

/* JADX INFO: loaded from: classes2.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f113455iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f113456ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f113457wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f113458zoijcleaow;

    public yggfygwlhe(String processName, int i13, int i14, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(processName, "processName");
        this.f113455iobyxmoadg = processName;
        this.f113458zoijcleaow = i13;
        this.f113456ppxfxbqfkf = i14;
        this.f113457wkgbmnqykc = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yggfygwlhe)) {
            return false;
        }
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113455iobyxmoadg, yggfygwlheVar.f113455iobyxmoadg) && this.f113458zoijcleaow == yggfygwlheVar.f113458zoijcleaow && this.f113456ppxfxbqfkf == yggfygwlheVar.f113456ppxfxbqfkf && this.f113457wkgbmnqykc == yggfygwlheVar.f113457wkgbmnqykc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.f113455iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f113458zoijcleaow)) * 31) + Integer.hashCode(this.f113456ppxfxbqfkf)) * 31;
        boolean z13 = this.f113457wkgbmnqykc;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode + r13;
    }

    public final int iobyxmoadg() {
        return this.f113456ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f113455iobyxmoadg;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f113455iobyxmoadg + ", pid=" + this.f113458zoijcleaow + ", importance=" + this.f113456ppxfxbqfkf + ", isDefaultProcess=" + this.f113457wkgbmnqykc + ')';
    }

    public final boolean wkgbmnqykc() {
        return this.f113457wkgbmnqykc;
    }

    public final int zoijcleaow() {
        return this.f113458zoijcleaow;
    }
}
