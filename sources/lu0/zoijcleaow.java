package lu0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Boolean f64113eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f64114iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f64115ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f64116wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f64117zoijcleaow;

    public zoijcleaow(String percent, String text, String navLink, String str, Boolean bool) {
        zdlpuopuiu.btonecajqb(percent, "percent");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(navLink, "navLink");
        this.f64114iobyxmoadg = percent;
        this.f64117zoijcleaow = text;
        this.f64115ppxfxbqfkf = navLink;
        this.f64116wkgbmnqykc = str;
        this.f64113eablkybsjg = bool;
    }

    public final Boolean eablkybsjg() {
        return this.f64113eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f64114iobyxmoadg, zoijcleaowVar.f64114iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f64117zoijcleaow, zoijcleaowVar.f64117zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f64115ppxfxbqfkf, zoijcleaowVar.f64115ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f64116wkgbmnqykc, zoijcleaowVar.f64116wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f64113eablkybsjg, zoijcleaowVar.f64113eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((this.f64114iobyxmoadg.hashCode() * 31) + this.f64117zoijcleaow.hashCode()) * 31) + this.f64115ppxfxbqfkf.hashCode()) * 31;
        String str = this.f64116wkgbmnqykc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f64113eablkybsjg;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f64115ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f64116wkgbmnqykc;
    }

    public String toString() {
        return "LoyaltyProgramBanner(percent=" + this.f64114iobyxmoadg + ", text=" + this.f64117zoijcleaow + ", navLink=" + this.f64115ppxfxbqfkf + ", reference=" + this.f64116wkgbmnqykc + ", isCategoriesSelected=" + this.f64113eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f64117zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f64114iobyxmoadg;
    }
}
