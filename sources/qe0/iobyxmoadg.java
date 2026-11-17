package qe0;

import f40.zoijcleaow;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f78665iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f78666ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f78667wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f78668zoijcleaow;

    public iobyxmoadg(String percent, String text, zoijcleaow navigationLink, String str) {
        zdlpuopuiu.btonecajqb(percent, "percent");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        this.f78665iobyxmoadg = percent;
        this.f78668zoijcleaow = text;
        this.f78666ppxfxbqfkf = navigationLink;
        this.f78667wkgbmnqykc = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f78665iobyxmoadg, iobyxmoadgVar.f78665iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f78668zoijcleaow, iobyxmoadgVar.f78668zoijcleaow) && this.f78666ppxfxbqfkf == iobyxmoadgVar.f78666ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f78667wkgbmnqykc, iobyxmoadgVar.f78667wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((((this.f78665iobyxmoadg.hashCode() * 31) + this.f78668zoijcleaow.hashCode()) * 31) + this.f78666ppxfxbqfkf.hashCode()) * 31;
        String str = this.f78667wkgbmnqykc;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final zoijcleaow iobyxmoadg() {
        return this.f78666ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f78667wkgbmnqykc;
    }

    public String toString() {
        return "LoyaltyProgramBannerUiModel(percent=" + this.f78665iobyxmoadg + ", text=" + this.f78668zoijcleaow + ", navigationLink=" + this.f78666ppxfxbqfkf + ", reference=" + this.f78667wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f78668zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f78665iobyxmoadg;
    }
}
