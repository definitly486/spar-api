package tm0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f111057eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f111058gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f111059iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f111060ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f111061wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f111062zoijcleaow;

    public lqeggnwhkg(String title, String subtitle, String subtitleText, String text, String str, String imageLink) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(imageLink, "imageLink");
        this.f111059iobyxmoadg = title;
        this.f111062zoijcleaow = subtitle;
        this.f111060ppxfxbqfkf = subtitleText;
        this.f111061wkgbmnqykc = text;
        this.f111057eablkybsjg = str;
        this.f111058gxszxtbevo = imageLink;
    }

    public final String eablkybsjg() {
        return this.f111061wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f111059iobyxmoadg, lqeggnwhkgVar.f111059iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f111062zoijcleaow, lqeggnwhkgVar.f111062zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f111060ppxfxbqfkf, lqeggnwhkgVar.f111060ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f111061wkgbmnqykc, lqeggnwhkgVar.f111061wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f111057eablkybsjg, lqeggnwhkgVar.f111057eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f111058gxszxtbevo, lqeggnwhkgVar.f111058gxszxtbevo);
    }

    public final String gxszxtbevo() {
        return this.f111059iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f111059iobyxmoadg.hashCode() * 31) + this.f111062zoijcleaow.hashCode()) * 31) + this.f111060ppxfxbqfkf.hashCode()) * 31) + this.f111061wkgbmnqykc.hashCode()) * 31;
        String str = this.f111057eablkybsjg;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f111058gxszxtbevo.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f111057eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f111062zoijcleaow;
    }

    public String toString() {
        return "Model(title=" + this.f111059iobyxmoadg + ", subtitle=" + this.f111062zoijcleaow + ", subtitleText=" + this.f111060ppxfxbqfkf + ", text=" + this.f111061wkgbmnqykc + ", buttonText=" + this.f111057eablkybsjg + ", imageLink=" + this.f111058gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f111060ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f111058gxszxtbevo;
    }
}
