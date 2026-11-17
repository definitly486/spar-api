package ka0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f54350iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f54351ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f54352zoijcleaow;

    public iobyxmoadg(String id2, String str, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f54350iobyxmoadg = id2;
        this.f54352zoijcleaow = str;
        this.f54351ppxfxbqfkf = z13;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, String str2, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f54350iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            str2 = iobyxmoadgVar.f54352zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z13 = iobyxmoadgVar.f54351ppxfxbqfkf;
        }
        return iobyxmoadgVar.iobyxmoadg(str, str2, z13);
    }

    public final boolean eablkybsjg() {
        return this.f54351ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f54350iobyxmoadg, iobyxmoadgVar.f54350iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f54352zoijcleaow, iobyxmoadgVar.f54352zoijcleaow) && this.f54351ppxfxbqfkf == iobyxmoadgVar.f54351ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = this.f54350iobyxmoadg.hashCode() * 31;
        String str = this.f54352zoijcleaow;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f54351ppxfxbqfkf);
    }

    public final iobyxmoadg iobyxmoadg(String id2, String str, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        return new iobyxmoadg(id2, str, z13);
    }

    public final String ppxfxbqfkf() {
        return this.f54350iobyxmoadg;
    }

    public String toString() {
        return "FavoriteFilterUiModel(id=" + this.f54350iobyxmoadg + ", title=" + this.f54352zoijcleaow + ", isChecked=" + this.f54351ppxfxbqfkf + ")";
    }

    public final String wkgbmnqykc() {
        return this.f54352zoijcleaow;
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, (i13 & 4) != 0 ? false : z13);
    }
}
