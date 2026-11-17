package o90;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f72345eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f72346iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f72347ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final f40.zoijcleaow f72348wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f72349zoijcleaow;

    public iobyxmoadg(String title, String str, String str2, f40.zoijcleaow navlink, String str3) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        this.f72346iobyxmoadg = title;
        this.f72349zoijcleaow = str;
        this.f72347ppxfxbqfkf = str2;
        this.f72348wkgbmnqykc = navlink;
        this.f72345eablkybsjg = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f72346iobyxmoadg, iobyxmoadgVar.f72346iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f72349zoijcleaow, iobyxmoadgVar.f72349zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f72347ppxfxbqfkf, iobyxmoadgVar.f72347ppxfxbqfkf) && this.f72348wkgbmnqykc == iobyxmoadgVar.f72348wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f72345eablkybsjg, iobyxmoadgVar.f72345eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = this.f72346iobyxmoadg.hashCode() * 31;
        String str = this.f72349zoijcleaow;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72347ppxfxbqfkf;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f72348wkgbmnqykc.hashCode()) * 31;
        String str3 = this.f72345eablkybsjg;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final f40.zoijcleaow iobyxmoadg() {
        return this.f72348wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f72346iobyxmoadg;
    }

    public String toString() {
        return "ButtonDataSpecialBannerUiModel(title=" + this.f72346iobyxmoadg + ", colorButton=" + this.f72349zoijcleaow + ", colorText=" + this.f72347ppxfxbqfkf + ", navlink=" + this.f72348wkgbmnqykc + ", reference=" + this.f72345eablkybsjg + ")";
    }

    public final String zoijcleaow() {
        return this.f72345eablkybsjg;
    }
}
