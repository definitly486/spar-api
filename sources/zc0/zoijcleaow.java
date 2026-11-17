package zc0;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f129588eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Integer f129589gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f129590iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f129591ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f129592wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f129593zoijcleaow;

    public zoijcleaow(boolean z13, String promotionTitle, String promotionDescription, boolean z14, List promotions, Integer num) {
        zdlpuopuiu.btonecajqb(promotionTitle, "promotionTitle");
        zdlpuopuiu.btonecajqb(promotionDescription, "promotionDescription");
        zdlpuopuiu.btonecajqb(promotions, "promotions");
        this.f129590iobyxmoadg = z13;
        this.f129593zoijcleaow = promotionTitle;
        this.f129591ppxfxbqfkf = promotionDescription;
        this.f129592wkgbmnqykc = z14;
        this.f129588eablkybsjg = promotions;
        this.f129589gxszxtbevo = num;
    }

    public final Integer eablkybsjg() {
        return this.f129589gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f129590iobyxmoadg == zoijcleaowVar.f129590iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f129593zoijcleaow, zoijcleaowVar.f129593zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f129591ppxfxbqfkf, zoijcleaowVar.f129591ppxfxbqfkf) && this.f129592wkgbmnqykc == zoijcleaowVar.f129592wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f129588eablkybsjg, zoijcleaowVar.f129588eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f129589gxszxtbevo, zoijcleaowVar.f129589gxszxtbevo);
    }

    public final boolean gxszxtbevo() {
        return this.f129590iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f129590iobyxmoadg) * 31) + this.f129593zoijcleaow.hashCode()) * 31) + this.f129591ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f129592wkgbmnqykc)) * 31) + this.f129588eablkybsjg.hashCode()) * 31;
        Integer num = this.f129589gxszxtbevo;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f129591ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f129593zoijcleaow;
    }

    public String toString() {
        return "PromotionsUiModel(isCounterEnabled=" + this.f129590iobyxmoadg + ", promotionTitle=" + this.f129593zoijcleaow + ", promotionDescription=" + this.f129591ppxfxbqfkf + ", promotionDescriptionIsVisible=" + this.f129592wkgbmnqykc + ", promotions=" + this.f129588eablkybsjg + ", scrollToPosition=" + this.f129589gxszxtbevo + ")";
    }

    public final List wkgbmnqykc() {
        return this.f129588eablkybsjg;
    }

    public final boolean zoijcleaow() {
        return this.f129592wkgbmnqykc;
    }

    public /* synthetic */ zoijcleaow(boolean z13, String str, String str2, boolean z14, List list, Integer num, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? "" : str, (i13 & 4) == 0 ? str2 : "", (i13 & 8) != 0 ? true : z14, (i13 & 16) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 32) != 0 ? null : num);
    }
}
