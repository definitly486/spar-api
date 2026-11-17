package g02;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f35793iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f35794ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f35795zoijcleaow;

    public zoijcleaow(List itemsModelList, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(itemsModelList, "itemsModelList");
        this.f35793iobyxmoadg = itemsModelList;
        this.f35795zoijcleaow = z13;
        this.f35794ppxfxbqfkf = z14;
    }

    public static /* synthetic */ zoijcleaow zoijcleaow(zoijcleaow zoijcleaowVar, List list, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = zoijcleaowVar.f35793iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            z13 = zoijcleaowVar.f35795zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z14 = zoijcleaowVar.f35794ppxfxbqfkf;
        }
        return zoijcleaowVar.iobyxmoadg(list, z13, z14);
    }

    public final boolean eablkybsjg() {
        return this.f35795zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f35793iobyxmoadg, zoijcleaowVar.f35793iobyxmoadg) && this.f35795zoijcleaow == zoijcleaowVar.f35795zoijcleaow && this.f35794ppxfxbqfkf == zoijcleaowVar.f35794ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f35793iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f35795zoijcleaow)) * 31) + Boolean.hashCode(this.f35794ppxfxbqfkf);
    }

    public final zoijcleaow iobyxmoadg(List itemsModelList, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(itemsModelList, "itemsModelList");
        return new zoijcleaow(itemsModelList, z13, z14);
    }

    public final List ppxfxbqfkf() {
        return this.f35793iobyxmoadg;
    }

    public String toString() {
        return "Model(itemsModelList=" + this.f35793iobyxmoadg + ", isRateButtonVisible=" + this.f35795zoijcleaow + ", isLoading=" + this.f35794ppxfxbqfkf + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f35794ppxfxbqfkf;
    }

    public /* synthetic */ zoijcleaow(List list, boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14);
    }
}
