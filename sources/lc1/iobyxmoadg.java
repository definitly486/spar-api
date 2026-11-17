package lc1;

import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zoijcleaow f62068eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f62069iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ojitshcjhn f62070ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f62071wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f62072zoijcleaow;

    public iobyxmoadg(String percent, String text, ojitshcjhn navigationLink, String str, zoijcleaow categoriesSelected) {
        zdlpuopuiu.btonecajqb(percent, "percent");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        zdlpuopuiu.btonecajqb(categoriesSelected, "categoriesSelected");
        this.f62069iobyxmoadg = percent;
        this.f62072zoijcleaow = text;
        this.f62070ppxfxbqfkf = navigationLink;
        this.f62071wkgbmnqykc = str;
        this.f62068eablkybsjg = categoriesSelected;
    }

    public final String eablkybsjg() {
        return this.f62072zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f62069iobyxmoadg, iobyxmoadgVar.f62069iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f62072zoijcleaow, iobyxmoadgVar.f62072zoijcleaow) && this.f62070ppxfxbqfkf == iobyxmoadgVar.f62070ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f62071wkgbmnqykc, iobyxmoadgVar.f62071wkgbmnqykc) && this.f62068eablkybsjg == iobyxmoadgVar.f62068eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((((this.f62069iobyxmoadg.hashCode() * 31) + this.f62072zoijcleaow.hashCode()) * 31) + this.f62070ppxfxbqfkf.hashCode()) * 31;
        String str = this.f62071wkgbmnqykc;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f62068eablkybsjg.hashCode();
    }

    public final zoijcleaow iobyxmoadg() {
        return this.f62068eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f62069iobyxmoadg;
    }

    public String toString() {
        return "LoyaltyProgramBannerUiModel(percent=" + this.f62069iobyxmoadg + ", text=" + this.f62072zoijcleaow + ", navigationLink=" + this.f62070ppxfxbqfkf + ", reference=" + this.f62071wkgbmnqykc + ", categoriesSelected=" + this.f62068eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f62071wkgbmnqykc;
    }

    public final ojitshcjhn zoijcleaow() {
        return this.f62070ppxfxbqfkf;
    }
}
