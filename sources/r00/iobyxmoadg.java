package r00;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import s10.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f81337iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f81338ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo f81339wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f81340zoijcleaow;

    public iobyxmoadg(String id2, String title, List shops, gxszxtbevo shopsReferences) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(shops, "shops");
        zdlpuopuiu.btonecajqb(shopsReferences, "shopsReferences");
        this.f81337iobyxmoadg = id2;
        this.f81340zoijcleaow = title;
        this.f81338ppxfxbqfkf = shops;
        this.f81339wkgbmnqykc = shopsReferences;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f81337iobyxmoadg, iobyxmoadgVar.f81337iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f81340zoijcleaow, iobyxmoadgVar.f81340zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f81338ppxfxbqfkf, iobyxmoadgVar.f81338ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f81339wkgbmnqykc, iobyxmoadgVar.f81339wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f81337iobyxmoadg.hashCode() * 31) + this.f81340zoijcleaow.hashCode()) * 31) + this.f81338ppxfxbqfkf.hashCode()) * 31) + this.f81339wkgbmnqykc.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f81338ppxfxbqfkf;
    }

    public String toString() {
        return "SpecialBannerMap(id=" + this.f81337iobyxmoadg + ", title=" + this.f81340zoijcleaow + ", shops=" + this.f81338ppxfxbqfkf + ", shopsReferences=" + this.f81339wkgbmnqykc + ")";
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, List list, gxszxtbevo gxszxtbevoVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 8) != 0 ? new gxszxtbevo(null, null, 3, null) : gxszxtbevoVar);
    }
}
