package xl1;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f122872iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f122873ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f122874zoijcleaow;

    public zoijcleaow(List itemsModelList, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(itemsModelList, "itemsModelList");
        this.f122872iobyxmoadg = itemsModelList;
        this.f122874zoijcleaow = z13;
        this.f122873ppxfxbqfkf = z14;
    }

    public static /* synthetic */ zoijcleaow zoijcleaow(zoijcleaow zoijcleaowVar, List list, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = zoijcleaowVar.f122872iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            z13 = zoijcleaowVar.f122874zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z14 = zoijcleaowVar.f122873ppxfxbqfkf;
        }
        return zoijcleaowVar.iobyxmoadg(list, z13, z14);
    }

    public final boolean eablkybsjg() {
        return this.f122874zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f122872iobyxmoadg, zoijcleaowVar.f122872iobyxmoadg) && this.f122874zoijcleaow == zoijcleaowVar.f122874zoijcleaow && this.f122873ppxfxbqfkf == zoijcleaowVar.f122873ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f122872iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f122874zoijcleaow)) * 31) + Boolean.hashCode(this.f122873ppxfxbqfkf);
    }

    public final zoijcleaow iobyxmoadg(List itemsModelList, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(itemsModelList, "itemsModelList");
        return new zoijcleaow(itemsModelList, z13, z14);
    }

    public final List ppxfxbqfkf() {
        return this.f122872iobyxmoadg;
    }

    public String toString() {
        return "Model(itemsModelList=" + this.f122872iobyxmoadg + ", isRateButtonVisible=" + this.f122874zoijcleaow + ", isLoading=" + this.f122873ppxfxbqfkf + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f122873ppxfxbqfkf;
    }

    public /* synthetic */ zoijcleaow(List list, boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14);
    }
}
