package rv;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f104930iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f104931ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f104932wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f104933zoijcleaow;

    public zoijcleaow(String percent, String text, String navLink, String str) {
        zdlpuopuiu.btonecajqb(percent, "percent");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(navLink, "navLink");
        this.f104930iobyxmoadg = percent;
        this.f104933zoijcleaow = text;
        this.f104931ppxfxbqfkf = navLink;
        this.f104932wkgbmnqykc = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f104930iobyxmoadg, zoijcleaowVar.f104930iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104933zoijcleaow, zoijcleaowVar.f104933zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104931ppxfxbqfkf, zoijcleaowVar.f104931ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104932wkgbmnqykc, zoijcleaowVar.f104932wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((((this.f104930iobyxmoadg.hashCode() * 31) + this.f104933zoijcleaow.hashCode()) * 31) + this.f104931ppxfxbqfkf.hashCode()) * 31;
        String str = this.f104932wkgbmnqykc;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f104931ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f104932wkgbmnqykc;
    }

    public String toString() {
        return "LoyaltyProgramBanner(percent=" + this.f104930iobyxmoadg + ", text=" + this.f104933zoijcleaow + ", navLink=" + this.f104931ppxfxbqfkf + ", reference=" + this.f104932wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f104933zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f104930iobyxmoadg;
    }
}
