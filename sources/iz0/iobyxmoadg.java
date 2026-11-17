package iz0;

import h01.gxszxtbevo;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f50056iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f50057ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo f50058wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f50059zoijcleaow;

    public iobyxmoadg(String id2, String title, List shops, gxszxtbevo shopsReferences) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(shops, "shops");
        zdlpuopuiu.btonecajqb(shopsReferences, "shopsReferences");
        this.f50056iobyxmoadg = id2;
        this.f50059zoijcleaow = title;
        this.f50057ppxfxbqfkf = shops;
        this.f50058wkgbmnqykc = shopsReferences;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f50056iobyxmoadg, iobyxmoadgVar.f50056iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f50059zoijcleaow, iobyxmoadgVar.f50059zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f50057ppxfxbqfkf, iobyxmoadgVar.f50057ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f50058wkgbmnqykc, iobyxmoadgVar.f50058wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f50056iobyxmoadg.hashCode() * 31) + this.f50059zoijcleaow.hashCode()) * 31) + this.f50057ppxfxbqfkf.hashCode()) * 31) + this.f50058wkgbmnqykc.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f50057ppxfxbqfkf;
    }

    public String toString() {
        return "SpecialBannerMap(id=" + this.f50056iobyxmoadg + ", title=" + this.f50059zoijcleaow + ", shops=" + this.f50057ppxfxbqfkf + ", shopsReferences=" + this.f50058wkgbmnqykc + ")";
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, List list, gxszxtbevo gxszxtbevoVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 8) != 0 ? new gxszxtbevo(null, null, 3, null) : gxszxtbevoVar);
    }
}
