package p62;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f75850eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f75851iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f75852ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f75853wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final f40.zoijcleaow f75854zoijcleaow;

    public zoijcleaow(String text, f40.zoijcleaow navLink, String str, String str2, String str3) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(navLink, "navLink");
        this.f75851iobyxmoadg = text;
        this.f75854zoijcleaow = navLink;
        this.f75852ppxfxbqfkf = str;
        this.f75853wkgbmnqykc = str2;
        this.f75850eablkybsjg = str3;
    }

    public final String eablkybsjg() {
        return this.f75851iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f75851iobyxmoadg, zoijcleaowVar.f75851iobyxmoadg) && this.f75854zoijcleaow == zoijcleaowVar.f75854zoijcleaow && zdlpuopuiu.eablkybsjg(this.f75852ppxfxbqfkf, zoijcleaowVar.f75852ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f75853wkgbmnqykc, zoijcleaowVar.f75853wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f75850eablkybsjg, zoijcleaowVar.f75850eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((this.f75851iobyxmoadg.hashCode() * 31) + this.f75854zoijcleaow.hashCode()) * 31;
        String str = this.f75852ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75853wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f75850eablkybsjg;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f75853wkgbmnqykc;
    }

    public final f40.zoijcleaow ppxfxbqfkf() {
        return this.f75854zoijcleaow;
    }

    public String toString() {
        return "PromoButtonSpecialBannerUiModel(text=" + this.f75851iobyxmoadg + ", navLink=" + this.f75854zoijcleaow + ", reference=" + this.f75852ppxfxbqfkf + ", colorButton=" + this.f75853wkgbmnqykc + ", colorText=" + this.f75850eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f75852ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f75850eablkybsjg;
    }
}
