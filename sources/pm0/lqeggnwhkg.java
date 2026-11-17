package pm0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f76988eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f76989iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f76990ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f76991wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f76992zoijcleaow;

    public lqeggnwhkg(String title, String subtitle, String subtitleText, String text, String str) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f76989iobyxmoadg = title;
        this.f76992zoijcleaow = subtitle;
        this.f76990ppxfxbqfkf = subtitleText;
        this.f76991wkgbmnqykc = text;
        this.f76988eablkybsjg = str;
    }

    public final String eablkybsjg() {
        return this.f76989iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f76989iobyxmoadg, lqeggnwhkgVar.f76989iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f76992zoijcleaow, lqeggnwhkgVar.f76992zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f76990ppxfxbqfkf, lqeggnwhkgVar.f76990ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f76991wkgbmnqykc, lqeggnwhkgVar.f76991wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f76988eablkybsjg, lqeggnwhkgVar.f76988eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f76989iobyxmoadg.hashCode() * 31) + this.f76992zoijcleaow.hashCode()) * 31) + this.f76990ppxfxbqfkf.hashCode()) * 31) + this.f76991wkgbmnqykc.hashCode()) * 31;
        String str = this.f76988eablkybsjg;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f76988eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f76990ppxfxbqfkf;
    }

    public String toString() {
        return "Model(title=" + this.f76989iobyxmoadg + ", subtitle=" + this.f76992zoijcleaow + ", subtitleText=" + this.f76990ppxfxbqfkf + ", text=" + this.f76991wkgbmnqykc + ", buttonText=" + this.f76988eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f76991wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f76992zoijcleaow;
    }
}
