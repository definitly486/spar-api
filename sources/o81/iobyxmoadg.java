package o81;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f72328iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f72329ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f72330zoijcleaow;

    public iobyxmoadg(String id2, String str, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f72328iobyxmoadg = id2;
        this.f72330zoijcleaow = str;
        this.f72329ppxfxbqfkf = z13;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, String str2, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f72328iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            str2 = iobyxmoadgVar.f72330zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z13 = iobyxmoadgVar.f72329ppxfxbqfkf;
        }
        return iobyxmoadgVar.iobyxmoadg(str, str2, z13);
    }

    public final boolean eablkybsjg() {
        return this.f72329ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f72328iobyxmoadg, iobyxmoadgVar.f72328iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f72330zoijcleaow, iobyxmoadgVar.f72330zoijcleaow) && this.f72329ppxfxbqfkf == iobyxmoadgVar.f72329ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = this.f72328iobyxmoadg.hashCode() * 31;
        String str = this.f72330zoijcleaow;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f72329ppxfxbqfkf);
    }

    public final iobyxmoadg iobyxmoadg(String id2, String str, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        return new iobyxmoadg(id2, str, z13);
    }

    public final String ppxfxbqfkf() {
        return this.f72328iobyxmoadg;
    }

    public String toString() {
        return "FavoriteFilterUiModel(id=" + this.f72328iobyxmoadg + ", title=" + this.f72330zoijcleaow + ", isChecked=" + this.f72329ppxfxbqfkf + ")";
    }

    public final String wkgbmnqykc() {
        return this.f72330zoijcleaow;
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, (i13 & 4) != 0 ? false : z13);
    }
}
