package hp1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f40872iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f40873ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f40874wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f40875zoijcleaow;

    public vdvldrhtss(String barcode, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(barcode, "barcode");
        this.f40872iobyxmoadg = barcode;
        this.f40875zoijcleaow = z13;
        this.f40873ppxfxbqfkf = z14;
        this.f40874wkgbmnqykc = z15;
    }

    public static /* synthetic */ vdvldrhtss zoijcleaow(vdvldrhtss vdvldrhtssVar, String str, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = vdvldrhtssVar.f40872iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            z13 = vdvldrhtssVar.f40875zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z14 = vdvldrhtssVar.f40873ppxfxbqfkf;
        }
        if ((i13 & 8) != 0) {
            z15 = vdvldrhtssVar.f40874wkgbmnqykc;
        }
        return vdvldrhtssVar.iobyxmoadg(str, z13, z14, z15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        return zdlpuopuiu.eablkybsjg(this.f40872iobyxmoadg, vdvldrhtssVar.f40872iobyxmoadg) && this.f40875zoijcleaow == vdvldrhtssVar.f40875zoijcleaow && this.f40873ppxfxbqfkf == vdvldrhtssVar.f40873ppxfxbqfkf && this.f40874wkgbmnqykc == vdvldrhtssVar.f40874wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f40872iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f40875zoijcleaow)) * 31) + Boolean.hashCode(this.f40873ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f40874wkgbmnqykc);
    }

    public final vdvldrhtss iobyxmoadg(String barcode, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(barcode, "barcode");
        return new vdvldrhtss(barcode, z13, z14, z15);
    }

    public final boolean ppxfxbqfkf() {
        return this.f40873ppxfxbqfkf;
    }

    public String toString() {
        return "Model(barcode=" + this.f40872iobyxmoadg + ", flashButtonIsVisible=" + this.f40875zoijcleaow + ", flashButtonIsEnabled=" + this.f40873ppxfxbqfkf + ", isLoading=" + this.f40874wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f40875zoijcleaow;
    }

    public /* synthetic */ vdvldrhtss(String str, boolean z13, boolean z14, boolean z15, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15);
    }
}
