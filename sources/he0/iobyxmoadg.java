package he0;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f40103iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f40104ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f40105zoijcleaow;

    public iobyxmoadg(String title, List banners, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(banners, "banners");
        this.f40103iobyxmoadg = title;
        this.f40105zoijcleaow = banners;
        this.f40104ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f40103iobyxmoadg, iobyxmoadgVar.f40103iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40105zoijcleaow, iobyxmoadgVar.f40105zoijcleaow) && this.f40104ppxfxbqfkf == iobyxmoadgVar.f40104ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f40103iobyxmoadg.hashCode() * 31) + this.f40105zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f40104ppxfxbqfkf);
    }

    public final List iobyxmoadg() {
        return this.f40105zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f40103iobyxmoadg;
    }

    public String toString() {
        return "BannerGroupViewUiModel(title=" + this.f40103iobyxmoadg + ", banners=" + this.f40105zoijcleaow + ", enableInfiniteScroll=" + this.f40104ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f40104ppxfxbqfkf;
    }

    public /* synthetic */ iobyxmoadg(String str, List list, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, list, (i13 & 4) != 0 ? true : z13);
    }
}
