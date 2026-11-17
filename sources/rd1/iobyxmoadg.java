package rd1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f82545eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f82546iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f82547ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f82548wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f82549zoijcleaow;

    public iobyxmoadg(String id2, int i13, int i14, boolean z13, int i15) {
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f82546iobyxmoadg = id2;
        this.f82549zoijcleaow = i13;
        this.f82547ppxfxbqfkf = i14;
        this.f82548wkgbmnqykc = z13;
        this.f82545eablkybsjg = i15;
    }

    public final boolean eablkybsjg() {
        return this.f82548wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f82546iobyxmoadg, iobyxmoadgVar.f82546iobyxmoadg) && this.f82549zoijcleaow == iobyxmoadgVar.f82549zoijcleaow && this.f82547ppxfxbqfkf == iobyxmoadgVar.f82547ppxfxbqfkf && this.f82548wkgbmnqykc == iobyxmoadgVar.f82548wkgbmnqykc && this.f82545eablkybsjg == iobyxmoadgVar.f82545eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f82546iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f82549zoijcleaow)) * 31) + Integer.hashCode(this.f82547ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f82548wkgbmnqykc)) * 31) + Integer.hashCode(this.f82545eablkybsjg);
    }

    public final int iobyxmoadg() {
        return this.f82545eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f82546iobyxmoadg;
    }

    public String toString() {
        return "MenuItemUiModel(id=" + this.f82546iobyxmoadg + ", icon=" + this.f82549zoijcleaow + ", title=" + this.f82547ppxfxbqfkf + ", isIconTintEnabled=" + this.f82548wkgbmnqykc + ", badgeCount=" + this.f82545eablkybsjg + ")";
    }

    public final int wkgbmnqykc() {
        return this.f82547ppxfxbqfkf;
    }

    public final int zoijcleaow() {
        return this.f82549zoijcleaow;
    }

    public /* synthetic */ iobyxmoadg(String str, int i13, int i14, boolean z13, int i15, int i16, gtknphoqwx gtknphoqwxVar) {
        this(str, i13, i14, z13, (i16 & 16) != 0 ? 0 : i15);
    }
}
