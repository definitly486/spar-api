package jo;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f51833eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f51834gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f51835iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f51836ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f51837wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f51838zoijcleaow;

    public lqeggnwhkg(String title, String subtitle, String subtitleText, String text, String str, String imageLink) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(imageLink, "imageLink");
        this.f51835iobyxmoadg = title;
        this.f51838zoijcleaow = subtitle;
        this.f51836ppxfxbqfkf = subtitleText;
        this.f51837wkgbmnqykc = text;
        this.f51833eablkybsjg = str;
        this.f51834gxszxtbevo = imageLink;
    }

    public final String eablkybsjg() {
        return this.f51837wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f51835iobyxmoadg, lqeggnwhkgVar.f51835iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f51838zoijcleaow, lqeggnwhkgVar.f51838zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f51836ppxfxbqfkf, lqeggnwhkgVar.f51836ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f51837wkgbmnqykc, lqeggnwhkgVar.f51837wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f51833eablkybsjg, lqeggnwhkgVar.f51833eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f51834gxszxtbevo, lqeggnwhkgVar.f51834gxszxtbevo);
    }

    public final String gxszxtbevo() {
        return this.f51835iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f51835iobyxmoadg.hashCode() * 31) + this.f51838zoijcleaow.hashCode()) * 31) + this.f51836ppxfxbqfkf.hashCode()) * 31) + this.f51837wkgbmnqykc.hashCode()) * 31;
        String str = this.f51833eablkybsjg;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f51834gxszxtbevo.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f51833eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f51838zoijcleaow;
    }

    public String toString() {
        return "Model(title=" + this.f51835iobyxmoadg + ", subtitle=" + this.f51838zoijcleaow + ", subtitleText=" + this.f51836ppxfxbqfkf + ", text=" + this.f51837wkgbmnqykc + ", buttonText=" + this.f51833eablkybsjg + ", imageLink=" + this.f51834gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f51836ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f51834gxszxtbevo;
    }
}
