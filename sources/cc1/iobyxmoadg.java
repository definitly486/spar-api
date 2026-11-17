package cc1;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f19638iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f19639ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f19640zoijcleaow;

    public iobyxmoadg(String title, List banners, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(banners, "banners");
        this.f19638iobyxmoadg = title;
        this.f19640zoijcleaow = banners;
        this.f19639ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f19638iobyxmoadg, iobyxmoadgVar.f19638iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f19640zoijcleaow, iobyxmoadgVar.f19640zoijcleaow) && this.f19639ppxfxbqfkf == iobyxmoadgVar.f19639ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f19638iobyxmoadg.hashCode() * 31) + this.f19640zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f19639ppxfxbqfkf);
    }

    public final List iobyxmoadg() {
        return this.f19640zoijcleaow;
    }

    public String toString() {
        return "BannerGroupViewUiModel(title=" + this.f19638iobyxmoadg + ", banners=" + this.f19640zoijcleaow + ", enableInfiniteScroll=" + this.f19639ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f19638iobyxmoadg;
    }

    public /* synthetic */ iobyxmoadg(String str, List list, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, list, (i13 & 4) != 0 ? true : z13);
    }
}
