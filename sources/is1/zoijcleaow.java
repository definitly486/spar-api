package is1;

import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f49292eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f49293iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f49294ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f49295wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f49296zoijcleaow;

    public zoijcleaow(String text, ojitshcjhn navLink, String str, String str2, String str3) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(navLink, "navLink");
        this.f49293iobyxmoadg = text;
        this.f49296zoijcleaow = navLink;
        this.f49294ppxfxbqfkf = str;
        this.f49295wkgbmnqykc = str2;
        this.f49292eablkybsjg = str3;
    }

    public final String eablkybsjg() {
        return this.f49293iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f49293iobyxmoadg, zoijcleaowVar.f49293iobyxmoadg) && this.f49296zoijcleaow == zoijcleaowVar.f49296zoijcleaow && zdlpuopuiu.eablkybsjg(this.f49294ppxfxbqfkf, zoijcleaowVar.f49294ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f49295wkgbmnqykc, zoijcleaowVar.f49295wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f49292eablkybsjg, zoijcleaowVar.f49292eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((this.f49293iobyxmoadg.hashCode() * 31) + this.f49296zoijcleaow.hashCode()) * 31;
        String str = this.f49294ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f49295wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f49292eablkybsjg;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f49295wkgbmnqykc;
    }

    public final ojitshcjhn ppxfxbqfkf() {
        return this.f49296zoijcleaow;
    }

    public String toString() {
        return "PromoButtonSpecialBannerUiModel(text=" + this.f49293iobyxmoadg + ", navLink=" + this.f49296zoijcleaow + ", reference=" + this.f49294ppxfxbqfkf + ", colorButton=" + this.f49295wkgbmnqykc + ", colorText=" + this.f49292eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f49294ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f49292eablkybsjg;
    }
}
