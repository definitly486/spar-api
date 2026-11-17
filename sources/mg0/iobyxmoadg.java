package mg0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f66936eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f66937iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f66938ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f66939wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f66940zoijcleaow;

    public iobyxmoadg(String id2, int i13, int i14, boolean z13, int i15) {
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f66937iobyxmoadg = id2;
        this.f66940zoijcleaow = i13;
        this.f66938ppxfxbqfkf = i14;
        this.f66939wkgbmnqykc = z13;
        this.f66936eablkybsjg = i15;
    }

    public final boolean eablkybsjg() {
        return this.f66939wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f66937iobyxmoadg, iobyxmoadgVar.f66937iobyxmoadg) && this.f66940zoijcleaow == iobyxmoadgVar.f66940zoijcleaow && this.f66938ppxfxbqfkf == iobyxmoadgVar.f66938ppxfxbqfkf && this.f66939wkgbmnqykc == iobyxmoadgVar.f66939wkgbmnqykc && this.f66936eablkybsjg == iobyxmoadgVar.f66936eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f66937iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f66940zoijcleaow)) * 31) + Integer.hashCode(this.f66938ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f66939wkgbmnqykc)) * 31) + Integer.hashCode(this.f66936eablkybsjg);
    }

    public final int iobyxmoadg() {
        return this.f66936eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f66937iobyxmoadg;
    }

    public String toString() {
        return "MenuItemUiModel(id=" + this.f66937iobyxmoadg + ", icon=" + this.f66940zoijcleaow + ", title=" + this.f66938ppxfxbqfkf + ", isIconTintEnabled=" + this.f66939wkgbmnqykc + ", badgeCount=" + this.f66936eablkybsjg + ")";
    }

    public final int wkgbmnqykc() {
        return this.f66938ppxfxbqfkf;
    }

    public final int zoijcleaow() {
        return this.f66940zoijcleaow;
    }

    public /* synthetic */ iobyxmoadg(String str, int i13, int i14, boolean z13, int i15, int i16, gtknphoqwx gtknphoqwxVar) {
        this(str, i13, i14, z13, (i16 & 16) != 0 ? 0 : i15);
    }
}
