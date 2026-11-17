package bq0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f16947iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f16948ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f16949wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f16950zoijcleaow;

    public iobyxmoadg(int i13, boolean z13, String str, List list) {
        this.f16947iobyxmoadg = i13;
        this.f16950zoijcleaow = z13;
        this.f16948ppxfxbqfkf = str;
        this.f16949wkgbmnqykc = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f16947iobyxmoadg == iobyxmoadgVar.f16947iobyxmoadg && this.f16950zoijcleaow == iobyxmoadgVar.f16950zoijcleaow && zdlpuopuiu.eablkybsjg(this.f16948ppxfxbqfkf, iobyxmoadgVar.f16948ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f16949wkgbmnqykc, iobyxmoadgVar.f16949wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f16947iobyxmoadg) * 31) + Boolean.hashCode(this.f16950zoijcleaow)) * 31;
        String str = this.f16948ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f16949wkgbmnqykc;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f16948ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f16950zoijcleaow;
    }

    public String toString() {
        return "SearchParams(page=" + this.f16947iobyxmoadg + ", getSuggest=" + this.f16950zoijcleaow + ", categoryId=" + this.f16948ppxfxbqfkf + ", filterSections=" + this.f16949wkgbmnqykc + ")";
    }

    public final int wkgbmnqykc() {
        return this.f16947iobyxmoadg;
    }

    public final List zoijcleaow() {
        return this.f16949wkgbmnqykc;
    }
}
