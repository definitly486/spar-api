package wa1;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f119189eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Integer f119190gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f119191iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f119192ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f119193wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f119194zoijcleaow;

    public zoijcleaow(boolean z13, String promotionTitle, String promotionDescription, boolean z14, List promotions, Integer num) {
        zdlpuopuiu.btonecajqb(promotionTitle, "promotionTitle");
        zdlpuopuiu.btonecajqb(promotionDescription, "promotionDescription");
        zdlpuopuiu.btonecajqb(promotions, "promotions");
        this.f119191iobyxmoadg = z13;
        this.f119194zoijcleaow = promotionTitle;
        this.f119192ppxfxbqfkf = promotionDescription;
        this.f119193wkgbmnqykc = z14;
        this.f119189eablkybsjg = promotions;
        this.f119190gxszxtbevo = num;
    }

    public final Integer eablkybsjg() {
        return this.f119190gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f119191iobyxmoadg == zoijcleaowVar.f119191iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f119194zoijcleaow, zoijcleaowVar.f119194zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f119192ppxfxbqfkf, zoijcleaowVar.f119192ppxfxbqfkf) && this.f119193wkgbmnqykc == zoijcleaowVar.f119193wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f119189eablkybsjg, zoijcleaowVar.f119189eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f119190gxszxtbevo, zoijcleaowVar.f119190gxszxtbevo);
    }

    public final boolean gxszxtbevo() {
        return this.f119191iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f119191iobyxmoadg) * 31) + this.f119194zoijcleaow.hashCode()) * 31) + this.f119192ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f119193wkgbmnqykc)) * 31) + this.f119189eablkybsjg.hashCode()) * 31;
        Integer num = this.f119190gxszxtbevo;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f119192ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f119194zoijcleaow;
    }

    public String toString() {
        return "PromotionsUiModel(isCounterEnabled=" + this.f119191iobyxmoadg + ", promotionTitle=" + this.f119194zoijcleaow + ", promotionDescription=" + this.f119192ppxfxbqfkf + ", promotionDescriptionIsVisible=" + this.f119193wkgbmnqykc + ", promotions=" + this.f119189eablkybsjg + ", scrollToPosition=" + this.f119190gxszxtbevo + ")";
    }

    public final List wkgbmnqykc() {
        return this.f119189eablkybsjg;
    }

    public final boolean zoijcleaow() {
        return this.f119193wkgbmnqykc;
    }

    public /* synthetic */ zoijcleaow(boolean z13, String str, String str2, boolean z14, List list, Integer num, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? "" : str, (i13 & 4) == 0 ? str2 : "", (i13 & 8) != 0 ? true : z14, (i13 & 16) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 32) != 0 ? null : num);
    }
}
