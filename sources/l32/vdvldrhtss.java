package l32;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f61428iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f61429ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f61430wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f61431zoijcleaow;

    public vdvldrhtss(String barcode, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(barcode, "barcode");
        this.f61428iobyxmoadg = barcode;
        this.f61431zoijcleaow = z13;
        this.f61429ppxfxbqfkf = z14;
        this.f61430wkgbmnqykc = z15;
    }

    public static /* synthetic */ vdvldrhtss zoijcleaow(vdvldrhtss vdvldrhtssVar, String str, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = vdvldrhtssVar.f61428iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            z13 = vdvldrhtssVar.f61431zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z14 = vdvldrhtssVar.f61429ppxfxbqfkf;
        }
        if ((i13 & 8) != 0) {
            z15 = vdvldrhtssVar.f61430wkgbmnqykc;
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
        return zdlpuopuiu.eablkybsjg(this.f61428iobyxmoadg, vdvldrhtssVar.f61428iobyxmoadg) && this.f61431zoijcleaow == vdvldrhtssVar.f61431zoijcleaow && this.f61429ppxfxbqfkf == vdvldrhtssVar.f61429ppxfxbqfkf && this.f61430wkgbmnqykc == vdvldrhtssVar.f61430wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f61428iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f61431zoijcleaow)) * 31) + Boolean.hashCode(this.f61429ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f61430wkgbmnqykc);
    }

    public final vdvldrhtss iobyxmoadg(String barcode, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(barcode, "barcode");
        return new vdvldrhtss(barcode, z13, z14, z15);
    }

    public final boolean ppxfxbqfkf() {
        return this.f61429ppxfxbqfkf;
    }

    public String toString() {
        return "Model(barcode=" + this.f61428iobyxmoadg + ", flashButtonIsVisible=" + this.f61431zoijcleaow + ", flashButtonIsEnabled=" + this.f61429ppxfxbqfkf + ", isLoading=" + this.f61430wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f61431zoijcleaow;
    }

    public /* synthetic */ vdvldrhtss(String str, boolean z13, boolean z14, boolean z15, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15);
    }
}
